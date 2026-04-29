import "./App.css";
import Headerpage from "./components/Headerpage";
import Homepage from "./components/Homepage";

function App() {
  return (
    <div className="page">
      <Headerpage />
      <main className="page-main container px-5 max-w-5xl bg-white">
        <Homepage />
      </main>
      <footer className="page-footer">
        <p className="footer-text">
          Copyright © 2025 Minh Tuyết Food. All rights reserved.
        </p>
      </footer>
    </div>
  );
}

export default App;
