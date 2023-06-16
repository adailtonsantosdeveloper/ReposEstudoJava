public class ObjetoOrigem {

    char []alfabedo = new char[128];

    char letra(int posicao) {
        alfabeto[0] = ' ';
        alfabeto[1] = 'a';
        alfabeto[2] = 'A';
        alfabeto[3] = 'á';
        alfabeto[4] = 'à';
        alfabeto[5] = 'â';
        alfabeto[6] = 'ã';
        alfabeto[7] = 'Á';
        alfabeto[8] = 'À';
        alfabeto[9] = 'Â';
        alfabeto[10]= 'Ã';
        alfabeto[11]= '1';
        alfabeto[12]= '2';
        alfabeto[13]= '3';
        alfabeto[14]= '4';
        alfabeto[15]= '5';
        alfabeto[16]= '6';
        alfabeto[17]= '7';
        alfabeto[18]= '8';
        alfabeto[19]= '9';
        alfabeto[20]= '0';

        for (int i = 0; i <= posicao; i++) {
            for (int j = 0; j <= 20; j++) {
                if (i == posicao && j == posicao) {
                    if (j == 20) {
                        return alfabeto[0];
                    } else {
                        return alfabeto[j + 1];
                    }
                }
            }
        }
        

    }
}