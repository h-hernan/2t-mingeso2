import React, { Component } from 'react';
import '../styles/AgregarEstudianteComponent.css'; // Importa el archivo CSS desde la carpeta "styles"
import EstudianteService from '../services/EstudianteService'; // Importa el servicio web

class AgregarEstudianteComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      nuevoEstudiante: {
        rut: '',
        nombres: '',
        apellidos: '',
        fnacimiento: '',
        procedencia: '',
        ncolegio: '',
        anoE: '',
        modalidadpago: '',
        ncuotas: 1,
      },
      mostrarCuotas: false, // Nuevo estado para controlar la visibilidad de las cuotas
    };
  }

  handleChange = (event) => {
    const { name, value } = event.target;

    this.setState((prevState) => ({
      nuevoEstudiante: {
        ...prevState.nuevoEstudiante,
        [name]: value,
      },
      mostrarCuotas: value === 'Cuotas',
    }));
  };

  agregarEstudiante = () => {
    EstudianteService.agregarEstudiante(this.state.nuevoEstudiante)
      .then((response) => {
        // Puedes manejar las respuestas o redireccionar a otra página aquí
      })
      .catch((error) => {
        console.error('Error al agregar estudiante: ' + error);
      });
  };

  render() {
    const { nuevoEstudiante, mostrarCuotas } = this.state;

    return (
      <div className="estudiante-container">
        <h1>Agregar Alumno a BD</h1>
        <button className="btn btn-success" onClick={this.agregarEstudiante}>
          Agregar Estudiante
        </button>

        {/* Formulario para agregar estudiantes */}
        <div className="agregar-estudiante-form">
          <label>RUT:</label>
          <input
            type="text"
            name="rut"
            value={nuevoEstudiante.rut}
            onChange={this.handleChange}
            required
          />

          {/* Resto de los campos */}
          
          <label>Nombre:</label>
          <input
            type="text"
            name="nombres"
            value={nuevoEstudiante.nombres}
            onChange={this.handleChange}
            required
          />

          <label>Apellido:</label>
          <input
            type="text"
            name="apellidos"
            value={nuevoEstudiante.apellidos}
            onChange={this.handleChange}
            required
          />

          <label>Fecha de Nacimiento:</label>
          <input
            type="date"
            name="fnacimiento"
            value={nuevoEstudiante.fnacimiento}
            onChange={this.handleChange}
            required
          />

          <label>Nombre Colegio Procedencia:</label>
          <input
            type="text"
            name="ncolegio"
            value={nuevoEstudiante.ncolegio}
            onChange={this.handleChange}
            required
          />

          <label>Tipo de procedencia del Colegio:</label>
          <select
            id="procedencia"
            name="procedencia"
            onChange={this.handleChange}
            value={nuevoEstudiante.procedencia}
            required
          >
            <option value="">Seleccione</option>
            <option value="Municipal">Municipal</option>
            <option value="Subencionado">Subencionado</option>
            <option value="Privado">Privado</option>
          </select>

          <label>Año Egreso:</label>
          <input
            type="text"
            name="anoE"
            value={nuevoEstudiante.anoE}
            onChange={this.handleChange}
            required
          />

          <label>Modalidad de Pago:</label>
          <select
            name="modalidadpago"
            onChange={this.handleChange}
            value={nuevoEstudiante.modalidadpago}
            required
          >
            <option value="">Seleccione</option>
            <option value="AlContado">Al Contado</option>
            <option value="Cuotas">Cuotas</option>
          </select>

          {/* Mostrar el contenedor de cuotas solo si la opción es "Cuotas" */}
          {mostrarCuotas && (
            <div>
              <label>Cantidad de Cuotas:</label>
              <input
                type="number"
                name="ncuotas"
                value={nuevoEstudiante.ncuotas}
                onChange={this.handleChange}
                min="1"
                max="10"  // Ajusta el valor máximo según tus necesidades
              />
            </div>
          )}

          <button type="button" onClick={this.agregarEstudiante}>
            Registrar
          </button>
        </div>
      </div>
    );
  }
}

export default AgregarEstudianteComponent;