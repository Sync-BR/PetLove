import React from 'react'; 
import { useState } from "react"


interface CadastroFormProps {
    onNext: (data: { username: string; email: string; age: number; password: string }) => void
}

const UserForm: React.FC<CadastroFormProps> = ({ onNext }) => {
    const [username1, setUsername1] = useState("");
    const [userEmail, setUserEmail] = useState("")
    const [age, setAge] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("")

    const handleSubmit = (e: React.FormEvent) => {
        e.preventDefault();
        if (password != confirmPassword) {
            alert("Senhas não conferem");
            return;
        }
        onNext({ username: username1, email: userEmail, age: Number(age), password: password })
    }

    return (
        <form onSubmit={handleSubmit}>
            <h1>Cadastro</h1>
            <input
                type="email"
                placeholder="email"
                value={userEmail}
                onChange={(e) => setUserEmail(e.target.value)}
                required
            />
             <input
                type="text"
                placeholder="username"
                value={username1}
                onChange={(e) => setUsername1(e.target.value)}
                required
            /> 
            <input
                type="number"
                placeholder="Idade"
                value={age}
                onChange={(e) => setAge(e.target.value)}
                required
            />
            <input
                type="password"
                placeholder="Senha"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                required
            />
            <input
                type="password"
                placeholder="Confirmação de Senha"
                value={confirmPassword}
                onChange={(e) => setConfirmPassword(e.target.value)}
                required
            />

            <button type="submit"> Próximo </button>

        </form>
    )
}

export default UserForm