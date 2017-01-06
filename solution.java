package com.google.challenges; 

public class Answer {   
    public static String answer(String plaintext) { 
        
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch: plaintext.toCharArray()){
            if (Character.isUpperCase(ch)){
                stringBuilder.append("000001");
            };
            
            switch (Character.toLowerCase(ch)){
                case 'a':
                    stringBuilder.append("100000");
                    break;
                case 'b':
                    stringBuilder.append("110000");
                    break;
                case 'c':
                    stringBuilder.append("100100");
                    break;
                case 'd':
                    stringBuilder.append("100110");
                    break;
                case 'e':
                    stringBuilder.append("100010");
                    break;
                case 'f':
                    stringBuilder.append("110100");
                    break;
                case 'g':
                    stringBuilder.append("110110");
                    break;
                case 'h':
                    stringBuilder.append("110010");
                    break;
                case 'i':
                    stringBuilder.append("010100");
                    break;
                case 'j':
                    stringBuilder.append("010110");
                    break;
                case 'k':
                    stringBuilder.append("101000");
                    break;
                case 'l':
                    stringBuilder.append("111000");
                    break;
                case 'm':
                    stringBuilder.append("101100");
                    break;
                case 'n':
                    stringBuilder.append("101110");
                    break;
                case 'o':
                    stringBuilder.append("101010");
                    break;
                case 'p':
                    stringBuilder.append("111100");
                    break;
                case 'q':
                    stringBuilder.append("111110");
                    break;
                case 'r':
                    stringBuilder.append("111010");
                    break;
                case 's':
                    stringBuilder.append("011100");
                    break;
                case 't':
                    stringBuilder.append("011110");
                    break;
                case 'u':
                    stringBuilder.append("101001");
                    break;
                case 'v':
                    stringBuilder.append("111001");
                    break;
                case 'w':
                    stringBuilder.append("010111");
                    break;
                case 'x':
                    stringBuilder.append("101101");
                    break;
                case 'y':
                    stringBuilder.append("101111");
                    break;
                case 'z':
                    stringBuilder.append("101011");
                    break;
                default:
                    stringBuilder.append("000000");
                    break;
            }
        };
        
        return stringBuilder.toString();
    } 
}