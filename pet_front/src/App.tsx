import React from 'react';
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Cadastro from "./pages/cadastro/cadastro.tsx"
import HomePage from './pages/home/home.tsx';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.min.css';
import UserProfile from './pages/userProfile/userProfile.tsx';
import FormResPass from './pages/recuperar_senha/form_reqSenha.tsx';

function App() {

  return (
    <Router>
      <ToastContainer></ToastContainer>

      <Routes>
        <Route path="/userProfile" element={<UserProfile />} />
        <Route path="/" element={<HomePage />} />
        <Route path="/cadastro" element={<Cadastro />} />
        <Route path="/recuperar-senha" element={<FormResPass />} />

      </Routes>

    </Router>
  )
}

export default App
