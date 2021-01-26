/*
 * Copyright 2021 Mireia Oliver García <mireia.oliver.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import org.japo.java.interfaces.ICosa;

/**
 *
 * @author Mireia Oliver García <mireia.oliver.alum@iescamp.es>
 */
public class Cosa implements ICosa {

    //Valores posibles
    public static final boolean COMESTIBLE_SI = true;
    public static final boolean COMESTIBLE_NO = false;

    //Valor predeterminado
    public static final boolean DEF_COMESTIBLE = COMESTIBLE_NO;

    //Atributos
    private boolean comestibleOK;

    //Constructor Predeterminado
    public Cosa() {
        comestibleOK = DEF_COMESTIBLE; //(Por defecto, comestibleOK es false)
    }

    //Constructor parametrizado
    public Cosa(boolean comestibleOK) {
        if (validarComestibleOK(comestibleOK)) {
            this.comestibleOK = comestibleOK;
        } else {
            this.comestibleOK = DEF_COMESTIBLE;
        }

    }

    //GETTER
    public boolean isComestibleOK() {
        return comestibleOK;
    }

    //SETTER
    public void setComestibleOK(boolean comestibleOK) {
        if (validarComestibleOK(comestibleOK)) {
            this.comestibleOK = comestibleOK;
        }
    }

    private boolean validarComestibleOK(boolean comestibleOK) {
        return comestibleOK == COMESTIBLE_NO || comestibleOK == COMESTIBLE_SI;
    }

    @Override
    public void mostrarInfo() {

        System.out.printf("Cosa...: %s comestible%n",
                comestibleOK ? "Sí" : "No");

    }

}
