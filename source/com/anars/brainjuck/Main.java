/**
 * BrainJuck - Rapid Application Development with only 3 bits!
 * 
 * Main / Parameter Parser Class for BrainJuck Tools - Version 1.0
 * 
 * Copyright (c) 2016 Anar Software LLC. < http://anars.com >
 * 
 * This program is free software: you can redistribute it and/or modify it under 
 * the terms of the GNU General Public License as published by the Free Software 
 * Foundation, either version 3 of the License, or (at your option) any later 
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with 
 * this program.  If not, see < http://www.gnu.org/licenses/ >
 * 
 */
package com.anars.brainjuck;

import java.io.File;

import java.util.Calendar;

public class Main
{
  public Main()
  {
    super();
  }
  public static void main(String[] args)
  {
    // Main main = new Main();
    if(args[0].equalsIgnoreCase("-interpreter"))
    {
      boolean debug = false;
      File sourceFile = null;
      for(int index = 1; index < args.length; index++)
        if(args[index].equalsIgnoreCase("-debug"))
          debug = true;
        else if(args[index].equalsIgnoreCase("-help"))
          interpreterHelp();
        else
          sourceFile = new File(args[index]);
      if(sourceFile == null)
        errorExit("Please specify Brainfuck source file.", -1);
      new Interpreter(sourceFile, debug);
    }
    else if(args[0].equalsIgnoreCase("-optimizer"))
    {
      if(args.length != 3)
        errorExit("Please specify input and output files.", -1);
      new Optimizer(new File(args[1]), new File(args[2]));
    }
    else if(args[0].equalsIgnoreCase("-formatter"))
    {
      if(args.length != 3)
        errorExit("Please specify input and output files.", -1);
      new Formatter(new File(args[1]), new File(args[2]));
    }
    else if(args[0].equalsIgnoreCase("-generator"))
    {
      if(args.length != 3)
        errorExit("Please specify input and output files.", -1);
      new Generator(new File(args[1]), new File(args[2]));
    }
    else
    {
      help();
    }
  }

  private static void errorExit(String message, int errorCode)
  {
    System.err.println(message + ". Please type -help for details.");
    System.exit(errorCode);
  }
  private static void help()
  {
    helpHeader();
    System.out.println("USAGE:\n" + //
      "\tjava -jar BrainJuck.jar SUBMODULE -help\n\n" + //
      "SUBMODULES:\n\n" + //
      "-interpreter\n" + //
      "\tInterpreters Brainfuck source code.\n" + //
      "-optimizer\n" + //
      "\tOptimizes Brainfuck source code.\n" + //
      "-formatter\n" + //
      "\tFormats Brainfuck source code.\n" + //
      "-generator\n" + //
      "\tConverts text file to Brainfuck source code.\n");
    System.exit(0);
  }

  private static void interpreterHelp()
  {
    helpHeader();
    System.out.println("Brainfuck Interpreter Version 1.0\n" + //
      "----------------------------\n\n" + //
      "USAGE:\n" + //
      "\tjava -jar BrainJuck.jar -interpreter [-debug] file\n" + //
      "\tjava -jar BrainJuck.jar -interpreter -help\n\n" + //
      "DESCRIPTION:\n\n" + //
      "-debug\n" + //
      "\tEnables debug (#) command\n" + //
      "-help\n" + //
      "\tDisplays this help\n");
    System.exit(0);
  }

  private static void helpHeader()
  {
    System.out.println("\nBrainJuck - Rapid Application Development with only 3 bits!\n" + //
      "Copyright (c) " + Calendar.getInstance().get(Calendar.YEAR) + " Anar Software LLC. < http://anars.com >\n\n" + //
      "This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.\n\n" + //
      "This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.\n" + //
      "See the GNU General Public License for more details at http://www.gnu.org/licenses\n");
  }
}
