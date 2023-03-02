package org.example;

import org.example.container.Sc;

public class Main {

    public static void main(String[] args) {
        App app = new App();
        Sc.init();
        app.start();
        Sc.close();
//        load();
//        System.out.println("== 명언 앱 ==");
//        while (true){
//            System.out.print("명령) ");
//            String commend = sc.nextLine();
//            if("종료".equals(commend)){
//                System.out.println("빌드를 통해 저장하시겠습니까?(Y/N)");
//                String isSave = sc.nextLine();
//                if("Y".equals(isSave) || "y".equals(isSave))
//                    save();
//                break;
//            }
//            else if("등록".equals(commend)){
//                post();
//            }
//            else if ("목록".equals(commend)){
//                read();
//            }
//            else if (commend.contains("삭제?id=")) {
//                int idx = commend.charAt(commend.length()-1)-'0';
//                remove(idx);
//            }
//            else if(commend.contains("수정?id=")) {
//                int idx = commend.charAt(commend.length()-1)-'0';
//                update(idx);
//            }
//            else if("빌드".equals(commend)) {
//                save();
//
//            }
//        }
//        sc.close();
    }

//    private static void load() {
//        JSONArray arr = fileLoad();
//        if(arr == null)
//            return;
//        for(int i= 0; i<arr.length(); i++ ){
//            JSONObject obj = (JSONObject) arr.get(i);
//            lifeQuotes.add(new Quote(obj));
//        }
//    }
//
//    private static JSONArray fileLoad() {
//        String json = "";
//        try {
//            File file = new File("C:\\Users\\rla48\\data.json");
//            if(!file.exists())
//                return null;
//            String filePath = "C:\\Users\\rla48\\data.json";
//            FileInputStream fileStream = null;
//
//            fileStream = new FileInputStream( filePath );
//            byte[ ] readBuffer = new byte[fileStream.available()];
//            while (fileStream.read( readBuffer ) != -1){}
//            json =new String(readBuffer);
//
//            fileStream.close();
//        } catch (Exception e) {
//            e.getStackTrace();
//        }
//        return new JSONArray(json);
//    }
//
//
//    private static void save() {
//
//    }
//
//    static public void post(){
//        System.out.print("명언: ");
//        String quote = sc.nextLine();
//        System.out.print("작가: ");
//        String author = sc.nextLine();
//        lifeQuotes.add(new Quote(quote, author));
//        System.out.printf("%d번 명언이 등록되었습니다.\n", Quote.main_id);
//    }
//
//    static public void read(){
//        if(lifeQuotes.size() == 0)
//            System.out.println("등록된 명언이 없습니다.");
//
//        System.out.println("번호 / 작가 / 명언 \n ----------------------");
//        for(int i=lifeQuotes.size()-1; i>=0; i-- ){
//            System.out.printf("%d / %s / %s \n", lifeQuotes.get(i).id, lifeQuotes.get(i).author, lifeQuotes.get(i).quote);
//        }
//    }
//
//    static public void remove(int idx){
//        for(int i=0; i<lifeQuotes.size(); i++){
//            if(lifeQuotes.get(i).id == idx){
//                lifeQuotes.remove(i);
//                System.out.printf("%d번 명언이 삭제되었습니다.\n", idx);
//                return;
//            }
//        }
//
//        System.out.println(idx+"번 명언은 존재하지 않습니다.");
//    }
//
//    static public void update(int idx){
//        for(int i=0; i<lifeQuotes.size(); i++){
//            if(lifeQuotes.get(i).id == idx){
//                System.out.println("명언(기존) : "+lifeQuotes.get(i).quote);
//                System.out.print("명언 : ");
//                String newQuote = sc.nextLine();
//                System.out.println("작가(기존) : "+lifeQuotes.get(i).author);
//                System.out.print("작가 : ");
//                String newAuthor = sc.nextLine();
//                lifeQuotes.get(i).quote = newQuote;
//                lifeQuotes.get(i).author = newAuthor;
//                return;
//            }
//        }
//        System.out.println(idx+"번 명언은 존재하지 않습니다.");
//    }



}