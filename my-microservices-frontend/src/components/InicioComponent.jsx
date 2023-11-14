import React from 'react';
import { Link } from 'react-router-dom';
import "../styles/InicioComponent.css";

function InicioComponent() {
  return (
    <div className="inicio-component"> {/* Aplicar la clase .inicio-component al contenedor principal */}
      <h1 className="main-title">TOPEDUCATION CHILE 2023</h1> {/* Aplicar la clase .main-title al título principal */}
      <h1>Presione algun boton</h1>
      <form>
        <Link to="/listar">
          <button className="custom-button">Estudiantes en la BD</button> {/* Aplicar la clase .custom-button al botón */}
        </Link>
      </form>
      <form>
        <Link to="/formulario">
          <button className="custom-button">Agregar Alumno a BD</button> {/* Aplicar la clase .custom-button al botón */}
        </Link>
      </form>
    </div>
  );
}

export default InicioComponent;
