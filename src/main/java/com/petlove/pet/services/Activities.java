package com.petlove.pet.services;

import config.Service;

import java.security.Provider;
import java.util.List;

public class Activities {
    public String checkUrine(int urine) {
        if (urine == 0) {
            return "Ugh, que sede insuportável... Preciso encontrar algo para beber, e rápido.";
        } else if (urine <= 40) {
            return "Ainda estou com sede, isso não está certo... Preciso de água urgentemente!";
        } else if (urine >= 60 && urine<=80) {
            return "Ok, isso está ficando sério. Onde está o banheiro por aqui?";
        } else if (urine <= 90) {
            return "Não consigo mais esperar! Socorro, preciso de um banheiro agora!";
        }
        return null;
    }

}
