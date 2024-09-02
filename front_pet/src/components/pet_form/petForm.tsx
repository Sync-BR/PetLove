import { useState } from "react";

interface PetFormProps {
    onSubmit: (data: { animal: string; name: string; gender: string }) => void;
}

const PetForm: React.FC<PetFormProps> = ({ onSubmit }) => {
    const [animal, setAnimal] = useState("");
    const [name, setName] = useState("");
    const [gender, setGender] = useState("");

    const handleSubmit = (e: React.FormEvent) => {

        e.preventDefault();
        onSubmit({ animal: animal, name: name, gender: gender });

    }


    return (
        <form onSubmit={handleSubmit}>
            <h1>Escolha seu pet</h1>

            <select value={animal} onChange={(e) => setAnimal(e.target.value)} required>
                <option value="">Selecione o tipo</option>
                <option value="gato">Gato</option>
                <option value="cachorro">Cachorro</option>
                <option value="calopsita">Calopsita</option>
            </select>

            <input
                type="text"
                placeholder="Nome do Pet"
                value={name}
                onChange={(e) => setName(e.target.value)}
                required
            />
            <input
                type="text"
                placeholder="Gênero"



            />
            <select value={gender} onChange={(e) => setGender(e.target.value)} required>
                <option value="">Selecione o tipo</option>
                <option value="male">Macho</option>
                <option value="female">Fêmea</option>
            </select>
            <button type="submit">Enviar</button>
        </form>
    )
}

export default PetForm