import React from 'react';

const FormResPass: React.FC = () => {

    return (
        <form>
            <h1>Envio de email para recuperação da senha:</h1>
            <br/>
            <label htmlFor='inId'>Seu email:</label>
            <input id='inId' type='email' name='email' placeholder='Digite o email'  />
            <button type='submit'>Enviar</button>
        </form>
    )
}

export default FormResPass