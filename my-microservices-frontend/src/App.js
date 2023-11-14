import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

import ListaEstudiantesComponent from './components/ListaEstudiantesComponent';
import InicioComponent from "./components/InicioComponent";
import AgregarEstudianteComponent from "./components/AgregarEstudianteComponent";

function App() {
  return (
    <div>
      <Router>
        <div className="container">
          <Routes>
            <Route path="/" element={<InicioComponent />} />
            <Route path="/estudiante" element={<ListaEstudiantesComponent />} />
            <Route path="/formulario" element={<AgregarEstudianteComponent />} />
          </Routes>
        </div>
      </Router>
    </div>
  );
}

export default App;
