/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import javax.persistence.Persistence;

/**
 *
 * @author Mantzius Lykke
 */
public class SchemaGenerator {
    public static void main(String args[]) {
        Persistence.generateSchema("Uge5ExPU", null);
    }
}
