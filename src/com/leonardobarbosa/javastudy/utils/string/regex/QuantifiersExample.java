package com.leonardobarbosa.javastudy.utils.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersExample {
    public static void main(String[] args) {

        /*
        ?       -> zero ou uma
        *       -> zero ou mais
        +       -> uma ou mais
        {n,m}   -> entre n e m vezes        -> [n,} -> n ou mais vezes
        ()      -> agrupamento
        |       -> ou       -> o(v|c)o = ovo ou oco
        $       -> final da String
         */

        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        String regex = "0[xX][0-9a-fA-F]+(\\s|$)";
        /*
        ^           -> inicio da linha
        [^abc]      -> negação = tudo o que NÃO forem a,b ou c
        .           -> qualquer coisa
        0           -> inicia com 0
        [xX]        -> seguido de x minúsculo ou X maiúsculo
        [0-9a-fA-F] -> o a 9 ou de a-f ou A-F
        +           -> uma ou mais vezes
        (\\s|$)     -> seguido de espaço em branco ou fim da String
        []          -> dentro de colchetes quase todos os caracteres perdem o significado especial (não necessita escape (\\)
         */

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print("Position: " + matcher.start() + " Text: " + matcher.group() + "\n");
        }

        String email = "luffy@hotmail.com, 123zoro@gmail.com.br, #@!Joel-miller@mail.br, sakura@email";
        String regexEmail = "[a-zA-Z0-9._-]+@[a-zA-Z]+(\\.([a-zA-Z])+)+";

        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(email);
        while (matcherEmail.find()) {
            System.out.print("Email encontrado: " + matcherEmail.group() + "\n");
        }

    }
}
