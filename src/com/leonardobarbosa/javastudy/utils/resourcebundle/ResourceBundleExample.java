package com.leonardobarbosa.javastudy.utils.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {

        /**
         * ResourceBundle - Internacionalização de mensagens
         * Externaliza textos do código em arquivos .properties

         * Conversão de nomes dos arquivos:
         * messages_en_US.properties    - idioma + país
         * message_en.properties    - só o idioma (sem país)
         * message.properties   - fallback (usado quando nenhum bate)
         * Ordem de busca = (idioma + país) -> (só idioma) -> (fallback)

         * Criar o arquivo .properties na pasta src do projeto
         */

        // getString() -> Retorna valor pela chave
        ResourceBundle en = ResourceBundle.getBundle("messages", Locale.getDefault());
        System.out.println(en.containsKey("welcome"));  // false
        String message = en.getString("app.welcome");

        Locale ptBR = Locale.of("pt", "BR");
        ResourceBundle pt = ResourceBundle.getBundle("messages", ptBR);
        System.out.println(pt.getString("app.welcome"));
        System.out.println(pt.getString("app.name"));

        // MessageFormat -> substitui os placeholders {0}
        String userWelcome = MessageFormat.format(message, "Leonardo", "Skywalker");
        System.out.println(userWelcome);

        String userFarewell = MessageFormat.format(en.getString("app.farewell"), "my old friend", "May the force be with you");
        System.out.println(userFarewell);

        // Verificar se a chave existe
        String key = "app.name";
        if (en.containsKey(key)) {
            System.out.println("Key: " + en.getString(key));    // Caso não exista não imprime e nem avisa nada
        }

        // Exception
        try {
            en.getString("key.message");
        } catch (MissingResourceException e) {
            System.out.println("Missing resource: " + e.getMessage());
        }
    }
}
