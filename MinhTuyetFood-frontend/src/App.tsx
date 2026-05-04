import "./App.css";

import { Routes, Route } from "react-router-dom";

import MainPage from "./components/MainPage";
import LoginPage from "./components/LoginPage";
import About from "./components/layout/About";
import Homepage from "./components/layout/Homepage";
function App() {
  return (
    <Routes>
      <Route path="/" element={<MainPage />}>
        <Route index element={<Homepage />} />
        <Route path="about" element={<About />} />
      </Route>
      <Route path="/login" element={<LoginPage />} />
    </Routes>
  );
}

export default App;
