/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public enum Education {
       
        PHD ("PHD"),
        MA ("MA"),
        BA ("BA"),
        HS ("HS");
        
        private String code;        // object reference variable

        private Education(String code) { // constructor
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
