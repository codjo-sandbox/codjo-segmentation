package net.codjo.segmentation.gui.editor;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
/**
 *
 */
public class OperatorHelper {
    private List<OperatorHelp> operatorMap;

    public OperatorHelper() {
        operatorMap = new ArrayList<OperatorHelp>();
        operatorMap.add(new OperatorHelp("+", "Description : plus\nExemple : (Cours d'ouverture + Cours de cl�ture) / 2"));
        operatorMap
              .add(new OperatorHelp("-", "Description : moins\nExemple : (Cours de cl�ture - Cours d'ouverture) / Cours d'ouverture"));
        operatorMap.add(new OperatorHelp("/", "Description : diviser\nExemple : (Cours d'ouverture + Cours de cl�ture) / 2"));
        operatorMap.add(new OperatorHelp("*",
                        "Description : multiplier\nExemple : (Cours de cl�ture - Cours d'ouverture) * (1 / Cours d'ouverture)"));
        operatorMap.add(new OperatorHelp("||", "Description : ou\nExemple : Pays ==\"FRA\" || Pays ==\"ESP\""));
        operatorMap.add(new OperatorHelp("&&", "Description : et\nExemple : Pays ==\"FRA\" && Devise ==\"EUR\""));
        operatorMap.add(new OperatorHelp("==", "Description : �gal\nExemple : Pays ==\"FRA\""));
        operatorMap.add(new OperatorHelp("!=", "Description : diff�rent\nExemple : Pays !=\"FRA\""));
        operatorMap.add(new OperatorHelp(">", "Description : strictement sup�rieur\nExemple : Cours de cl�ture > Cours d'ouverture"));
        operatorMap.add(new OperatorHelp("<", "Description : strictement inf�rieur\nExemple : Cours d'ouverture < Cours de cl�ture"));
        operatorMap.add(new OperatorHelp(">=", "Description : sup�rieur ou �gal\nExemple : Cours de cl�ture >= Cours d'ouverture"));
        operatorMap.add(new OperatorHelp("<=", "Description : inf�rieur ou �gal\nExemple : Cours d'ouverture <= Cours de cl�ture"));
        operatorMap.add(new OperatorHelp("(",
                        "Description : ouverture d'un bloc d'op�rations arithm�tiques ou logiques\nExemple : (Pays ==\"FRA\" || Pays == \"ESP\") && Devise ==\"EUR\""));
        operatorMap.add(new OperatorHelp(")",
                        "Description : fermeture d'un bloc d'op�rations arithm�tiques ou logiques\nExemple : (Cours d'ouverture + Cours de cl�ture) / 2"));
        operatorMap.add(new OperatorHelp(".", "Description : s�parateur de d�cimales\nExemple : Cours d'ouverture <= 15.24"));
        operatorMap.add(new OperatorHelp(",",
                        "Description : s�parateur de param�tres lors de l'utilisation de fonctions\nExemple : Math.min(Cours d'ouverture, Cours de cl�ture)"));
    }


    public List<OperatorHelp> getAllOperators() {
        return operatorMap;
    }

    public class OperatorHelp{
        private String operator;
        private String help;


        public String getHelp() {
            return help;
        }

        @Override
        public String toString(){
            return operator;
        }

        OperatorHelp(String operator, String help){
            this.operator = operator;
            this.help = help;
        }

    }
}
