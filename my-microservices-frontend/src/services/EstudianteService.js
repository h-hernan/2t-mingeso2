import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080/estudiante'; 

class EstudianteService {
  // Obtener la lista de estudiantes
  getEstudiantes() {
    return axios.get(API_BASE_URL);
  }
  // Agregar un estudiante
  agregarEstudiante(nuevoEstudiante){
    return axios.post(API_BASE_URL, nuevoEstudiante);
  }
}

export default new EstudianteService();
