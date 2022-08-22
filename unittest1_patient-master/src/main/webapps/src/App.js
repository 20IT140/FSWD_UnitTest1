import "./App.css";
import Container from "react-bootstrap/Container";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import MyAlert from "./components/MyAlert";
import { useState } from "react";

function App() {

  function App() {
    const [alert, setAlert] = useState(null);

    let showAlert = (type, message) => {
      setAlert({
        type: type,
        message: message,
      });
      setTimeout(() => {
        setAlert(null);
      }, 3000);
    };



  return (
    <div className="App">

      <Router>
        <Operations/>
        <MyAlert alert={alert} />
        <Container>
          <Routes>
            <Route path="patient" element={<Patient showAlert={showAlert} />} />
            <Route
                path="patient/:patientId"
                element={<Patient showAlert={showAlert} />}
            />
            <Route
                path="listPatients"
                element={<PatientList showAlert={showAlert} />}
            />
          </Routes>
        </Container>
      </Router>
    </div>
  );
}

export default App;
