import { Routes, Route, Outlet } from "react-router-dom";

import Headerpage from "./Headerpage";

function MainPage() {
  return (
    <div className="page">
      <Headerpage />

      {/* Chuyen huong voi react-router */}

      <main className="page-main container px-5 max-w-6xl m-auto bg-white">
        {/* Dùng Outlet để render các route con */}
        <Outlet />
      </main>

      <footer className="page-footer">
        <p className="footer-text">
          Copyright © 2025 Minh Tuyết Food. All rights reserved.
        </p>
      </footer>
    </div>
  );
}

export default MainPage;
