import React, { Component } from 'react';
import '../styles/ListaEstudiantesComponent.css'; // Importa el archivo CSS desde la carpeta "styles"
import EstudianteService from '../services/EstudianteService'; // Importa el servicio web

class ListaEstudiantesComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      estudiantes: [],
    };
  }

  componentDidMount() {
    this.listarEstudiantes();
  }

  listarEstudiantes = () => {
    EstudianteService.getEstudiantes()
      .then((response) => {
        this.setState({ estudiantes: response });
      })
      .catch((error) => {
        console.error('Error al listar estudiantes: ' + error);
      });
  };

  renderListaEstudiantes() {
    return (
      <table className="table">
        <thead>
          <tr>
            <th>Rut</th>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>Fecha de Nacimiento</th>
            <th>Procedencia</th>
            <th>Nombre del Colegio</th>
            <th>Año de Egreso</th>
            <th>Modalidad de Pago</th>
            <th>Número de Cuotas</th>
          </tr>
        </thead>
        <tbody>
          {this.state.estudiantes.map((estudiante, index) => (
            <tr key={index}>
              <td>{estudiante.rut}</td>
              <td>{estudiante.nombres}</td>
              <td>{estudiante.apellidos}</td>
              <td>{estudiante.fnacimiento}</td>
              <td>{estudiante.procedencia}</td>
              <td>{estudiante.ncolegio}</td>
              <td>{estudiante.anoE}</td>
              <td>{estudiante.modalidadpago}</td>
              <td>{estudiante.ncuotas}</td>
            </tr>
          ))}
        </tbody>
      </table>
    );
  }

  render() {
    return (
      <div className="estudiante-container">
        <h1>TOPEDUCATION CHILE 2023</h1>
        <h1>Lista de Estudiantes en la BD</h1>
        <button className="btn btn-primary" onClick={this.listarEstudiantes}>
          Actualizar Lista de Estudiantes
        </button>
        {this.renderListaEstudiantes()}
      </div>
    );
  }
}

export default ListaEstudiantesComponent;
