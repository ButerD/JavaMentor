package JavaCore.Lection2;

public class task2419 {
    public static void main(String[] args) {

        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] text = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, text));
    }

public static String printTextPerRole(String[] roles, String[] textLines) {
    StringBuilder builder = new StringBuilder();
    for(String name : roles) {
        builder.append(name).append(":\n");
        for (int i = 0; i < textLines.length; i++) {
            if (textLines[i].startsWith(name + ":") ) {
                builder.append(textLines[i].replaceFirst(name + ":", i + 1 + ")")).append("\n");
            }
        }
        builder.append("\n");
    }
    return builder.toString();
}

}
