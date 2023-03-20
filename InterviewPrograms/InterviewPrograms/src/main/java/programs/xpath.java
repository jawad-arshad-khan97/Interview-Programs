package programs;

public class xpath {
//    1. //𝐢𝐧𝐩𝐮𝐭[@𝐢𝐝='𝐮𝐬𝐞𝐫𝐧𝐚𝐦𝐞'] - Selects an input element with the attribute "𝐢𝐝" equal to "𝐮𝐬𝐞𝐫𝐧𝐚𝐦𝐞".
//
//            2. //𝐚[@𝐡𝐫𝐞𝐟='𝐡𝐭𝐭𝐩𝐬://𝐰𝐰𝐰.𝐞𝐱𝐚𝐦𝐩𝐥𝐞.𝐜𝐨𝐦'] - Selects a link element with the attribute "𝐡𝐫𝐞𝐟" equal to "https://www.example.com".
//
//            3. //𝐛𝐮𝐭𝐭𝐨𝐧[@𝐭𝐲𝐩𝐞='𝐬𝐮𝐛𝐦𝐢𝐭'] - Selects a button element with the attribute "type" 𝐞𝐪𝐮𝐚𝐥 to "submit".
//
//            4. //𝐢𝐦𝐠[@𝐚𝐥𝐭='𝐢𝐦𝐚𝐠𝐞 𝐝𝐞𝐬𝐜𝐫𝐢𝐩𝐭𝐢𝐨𝐧'] - Selects an image element with the attribute "alt" equal to "image description".
//
//            5. //𝐢𝐧𝐩𝐮𝐭[@𝐧𝐚𝐦𝐞='𝐞𝐦𝐚𝐢𝐥']/𝐟𝐨𝐥𝐥𝐨𝐰𝐢𝐧𝐠::𝐥𝐚𝐛𝐞𝐥 - Selects a label element that immediately follows(comes after) an input element with the attribute "𝐧𝐚𝐦𝐞" equal to "𝐞𝐦𝐚𝐢𝐥".
//
//            6. //𝐢𝐧𝐩𝐮𝐭[@𝐧𝐚𝐦𝐞='𝐞𝐦𝐚𝐢𝐥']/𝐩𝐫𝐞𝐜𝐞𝐝𝐢𝐧𝐠::𝐥𝐚𝐛𝐞𝐥 - Selects a label element that immediately precedes(comes before) an input element with the attribute "𝐧𝐚𝐦𝐞" equal to "𝐞𝐦𝐚𝐢𝐥".
//
//            7. //𝐢𝐧𝐩𝐮𝐭[@𝐧𝐚𝐦𝐞='𝐞𝐦𝐚𝐢𝐥']/𝐚𝐧𝐜𝐞𝐬𝐭𝐨𝐫::𝐟𝐨𝐫𝐦 - Selects a form element that is an 𝐚𝐧𝐜𝐞𝐬𝐭𝐨𝐫(𝐩𝐚𝐫𝐞𝐧𝐭/𝐚𝐧𝐲 𝐥𝐞𝐯𝐞𝐥 𝐨𝐟 𝐩𝐚𝐫𝐞𝐧𝐭 - 𝐠𝐫𝐚𝐧𝐝 𝐩𝐚𝐫𝐞𝐧𝐭, 𝐠𝐫𝐞𝐚𝐭 𝐠𝐫𝐚𝐧𝐝 𝐩𝐚𝐫𝐞𝐧𝐭, 𝐞𝐭𝐜) of an input element with the attribute "𝐧𝐚𝐦𝐞" equal to "𝐞𝐦𝐚𝐢𝐥".
//
//            8. //𝐢𝐧𝐩𝐮𝐭[@𝐧𝐚𝐦𝐞='𝐞𝐦𝐚𝐢𝐥']/𝐩𝐚𝐫𝐞𝐧𝐭::𝐝𝐢𝐯 - Selects a div element that is the 𝐩𝐚𝐫𝐞𝐧𝐭 of an input element with the attribute "𝐧𝐚𝐦𝐞" equal to "𝐞𝐦𝐚𝐢𝐥".
//
//            9. //𝐢𝐧𝐩𝐮𝐭[@𝐧𝐚𝐦𝐞='𝐞𝐦𝐚𝐢𝐥']/𝐝𝐞𝐬𝐜𝐞𝐧𝐝𝐚𝐧𝐭::𝐬𝐩𝐚𝐧 - Selects all span elements that are 𝐝𝐞𝐬𝐜𝐞𝐧𝐝𝐚𝐧𝐭𝐬(𝐜𝐡𝐢𝐥𝐝/𝐠𝐫𝐚𝐧𝐝𝐜𝐡𝐢𝐥𝐝/𝐚𝐧𝐲 𝐥𝐞𝐯𝐞𝐥 𝐨𝐟 𝐜𝐡𝐢𝐥𝐝) of an input element with the attribute "𝐧𝐚𝐦𝐞" equal to "𝐞𝐦𝐚𝐢𝐥".
//
//            10. //𝐢𝐧𝐩𝐮𝐭[@𝐧𝐚𝐦𝐞='𝐞𝐦𝐚𝐢𝐥']/𝐟𝐨𝐥𝐥𝐨𝐰𝐢𝐧𝐠-𝐬𝐢𝐛𝐥𝐢𝐧𝐠::𝐢𝐧𝐩𝐮𝐭 - Selects all input elements that are 𝐟𝐨𝐥𝐥𝐨𝐰𝐢𝐧𝐠 𝐬𝐢𝐛𝐥𝐢𝐧𝐠𝐬 of an input element with the attribute "𝐧𝐚𝐦𝐞" equal to "𝐞𝐦𝐚𝐢𝐥".
//
//    If you need any more clarification or detail, feel free Connect with and clear your doubts over a chat.
}
