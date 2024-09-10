import React from "react";
import { useNavigate, Link } from "react-router-dom";
import { useState } from "react";
import axios from "axios";
import { toast } from 'react-toastify';

const LoginForm = () => {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [error, setError] = useState<string | null>(null);
    const navigate = useNavigate();

    const handleSubmit = async (e: React.FormEvent) => {
        e.preventDefault();
        console.log("user", username, "pass", password);
        try {
            const response = await axios.post(`http://186.247.89.58:8080/api/user/loginUser${username}Pass${password}`)
            const userData = response.data
            console.log("usersDados", userData);
            localStorage.setItem("userData", JSON.stringify(userData));
            toast.success('Usuário Conectado!')
            navigate("/userProfile");



        } catch (error) {
            console.error("Erro ao verificar login", error)
            setError("Erro ao tentar fazer o login. Tente Novamente.");
            toast.error('Erro ao tentar fazer o login.')
        }
    }


    return (
        <form onSubmit={handleSubmit}>

            <h1>Login</h1>
            <input
                type="text"
                placeholder="username"
                value={username}
                onChange={(e) => setUsername(e.target.value)}
                required
            />
            <input
                type="number"
                placeholder="Senha"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                required
            />

            <button type="submit"> Entrar </button>
            <Link to='/cadastro'> Cadastre-se aqui </Link>
        </form>
    )
}

export default LoginForm