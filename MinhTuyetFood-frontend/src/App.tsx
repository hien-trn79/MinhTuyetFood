import "./App.css";

import { Routes, Route } from "react-router-dom";

import MainPage from "./components/MainPage";
import LoginPage from "./components/LoginPage";
import About from "./components/layout/About";
import Homepage from "./components/layout/Homepage";
import Ordered from "./components/layout/Ordered";
import Contact from "./components/layout/Contact";

function App() {
  return (
    <Routes>
      <Route path="/" element={<MainPage />}>
        <Route index element={<Homepage />} />
        <Route path="menu" element={<Homepage />} />
        <Route path="about" element={<About />} />
        <Route path="contact" element={<Contact />} />
        <Route path="orders" element={<Ordered />} />
      </Route>
      <Route path="/login" element={<LoginPage />} />
    </Routes>
  );
}

export default App;
