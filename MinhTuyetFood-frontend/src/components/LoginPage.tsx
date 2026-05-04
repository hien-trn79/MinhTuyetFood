import { useState } from "react";
import "../styles/page.css";

export default function LoginPage() {
  const [email, setEmail] = useState<string>("");
  const [password, setPassword] = useState<string>("");
  const [rememberMe, setRememberMe] = useState<boolean>(false);
  const [togglePassword, setTogglePassword] = useState<boolean>(false);

  const handleLogin = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();

    const loginData = {
      email: email,
      password: password,
      rememberMe: rememberMe,
    };

    console.log("Login data:", loginData);

    setEmail("");
    setPassword("");
    setRememberMe(false);
  };

  const handleTogglePassword = () => {
    setTogglePassword(!togglePassword);
    const pwdElement = document.querySelector(
      ".form-input_pwd",
    ) as HTMLInputElement;
    if (pwdElement) {
      pwdElement.type = togglePassword ? "password" : "text";
    }
  };

  return (
    <div className="Login relative w-full h-screen bg-gray-200">
      <div className="logo_side absolute top-1 left-0 w-1/2 bg-amber-200">
        LOGO
        <img src="" alt="" />
      </div>
      <div className="login-page p-4 m-auto absolute bg-white top-1/2 left-1/2 transform -translate-x-1/2 -translate-y-1/2 w-1/3 min-h-1/2 rounded-lg shadow-lg overflow-hidden z-10">
        <h2 className="form-title py-3 font-bold  text-2xl text-center text-green-700">
          Welcome to Minh Tuyet Foods
        </h2>

        <main className="login-main w-full p-3 ">
          <div className="form-group"></div>

          <form
            action=""
            className="form-login flex flex-col"
            onSubmit={handleLogin}
          >
            <div className="form-group mt-2">
              <label
                htmlFor="email"
                className="form-label font-bold flex items-center py-2"
              >
                <div className="form-icon form-icon_email pr-2">
                  <i className="fas fa-envelope text-green-700"></i>
                </div>
                Email
              </label>
              <input
                type="email"
                id="email"
                className="form-input border border-gray-300 rounded-md p-2 w-full"
                placeholder="Enter your email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
              />
            </div>
            <div className="form-group mt-2 relative">
              <label
                htmlFor="password"
                className="form-label font-bold flex items-center py-2"
              >
                <div className="form-icon form-icon_password pr-2">
                  <i className="fas fa-lock text-green-700"></i>
                </div>
                Password
              </label>
              <input
                type={togglePassword ? "text" : "password"}
                id="password"
                className="form-input form-input_pwd border border-gray-300 rounded-md p-2 w-full"
                placeholder="Enter your password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              />

              {/* Icon for password visibility toggle */}
              <div
                className="form-icon form-icon_password_toggle absolute cursor-pointer"
                onClick={handleTogglePassword}
              >
                {togglePassword ? (
                  <i className="fas fa-eye text-gray-500"></i>
                ) : (
                  <i className="fas fa-eye-slash text-gray-500"></i>
                )}
              </div>
            </div>

            <div className="form-group mt-2">
              <label className="form-label flex items-center">
                <input
                  type="checkbox"
                  className="form-checkbox mr-2"
                  checked={rememberMe}
                  onChange={(e) => setRememberMe(e.target.checked)}
                />
                Remember me
              </label>
            </div>

            <div className="form-group forgotPassword my-3">
              <a href="#" className="form-link text-blue-700 hover:underline">
                Forgot your password?
              </a>
            </div>
            <button
              type="submit"
              className="form-submit text-center cursor-pointer bg-green-600 text-white py-2 px-4 rounded-md hover:bg-green-600"
            >
              Login
            </button>
          </form>
        </main>
      </div>
    </div>
  );
}
