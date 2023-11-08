import React from 'react';
import './App.css';

function App() {
  return (
    <div className="App">
      <header>
        <h1 className="main-title">PREUNIVERSITARIO TOPEDUCATION</h1>
        <p>Seleccione una opcion:</p>
      </header>
      <div className="button-container">
        <button className="custom-button" onClick={() => handleButtonClick('/listar')}>
          Estudiantes Registrados
        </button>
        <button className="custom-button" onClick={() => handleButtonClick('/formulario')}>
          Agregar Alumno
        </button>
        <button className="custom-button" onClick={() => handleButtonClick('/cuotas/listar')}>
          Listar Todas las cuotas
        </button>
        <button className="custom-button" onClick={() => handleButtonClick('/cuotas/formulario')}>
          Listar Cuotas por RUT
        </button>
      </div>
    </div>
  );

  function handleButtonClick(path) {
    window.location.href = path; // Navega a la URL especificada al hacer clic en un botón
  }
}

export default App;
