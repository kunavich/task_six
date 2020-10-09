/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task6;

import by.kunavich.task6.data.*;
import by.kunavich.task6.data.dataAcquirer.DataAcquirer;
import by.kunavich.task6.data.dataAcquirer.DataAcquirerFactory;
import by.kunavich.task6.logic.StringProcessor;
import by.kunavich.task6.view.ConcoleResultPrinter;
import by.kunavich.task6.view.ResultPrinter;
import org.apache.log4j.xml.DOMConfigurator;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


/**
 *
 * @author Lord
 */


public class Main {
     static Logger LOGGER = Logger.getLogger(Main.class);

     public static void main(String[] args) throws Exception {

         //DOMConfigurator is used to configure logger from xml configuration file
         DOMConfigurator.configure("log4j.xml");

         //Log in console in and log file
         LOGGER.info("Log4j appender configuration is successful !!");

         // get
         DataAcquirerFactory dataAcquirerFactory = new DataAcquirerFactory();
         DataAcquirer dataAcquirer = dataAcquirerFactory.getDataAcquirer("CONSOLE");

         String string =dataAcquirer.getData();

         //count
        // StringProcessor stringProcessor = new StringProcessor();
        // String withRgx =stringProcessor.processWithRgx(string);
         //String withOutRgx =stringProcessor.processWithString(string);


         //out
        // ResultPrinter printer= new ConcoleResultPrinter();
         //printer.printResult(withRgx);
        // printer.printResult(withOutRgx);


    }
}
