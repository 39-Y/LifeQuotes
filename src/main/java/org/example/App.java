package org.example;

import org.example.Entity.Quotes;
import org.example.container.Sc;
import org.example.controller.QuoteController;
import org.example.controller.SystemController;
import org.example.domain.Req;

public class App {
    QuoteController quoteCtrl = new QuoteController();
    SystemController systemCtrl = new SystemController();

    public void start(){
        System.out.println("== 명언 앱 ==");
        systemCtrl.load();
        while (true){
            System.out.print("명령) ");
            String command = Sc.get().nextLine();

            switch (Req.getAction(command)){
                case "종료":
                    systemCtrl.save();
                    return;
                case "등록":
                    quoteCtrl.post();
                    break;
                case "목록":
                    quoteCtrl.read();
                    break;
                case "삭제":
                    try{
                        quoteCtrl.remove(Req.getId(command));
                    } catch (Exception e){
                        System.out.println("명령어를 다시 입력해 주세요. -> 삭제?id=번호");
                    }
                    break;
                case "수정":
                    try{
                        quoteCtrl.update(Req.getId(command));
                    } catch (Exception e){
                        System.out.println("명령어를 다시 입력해 주세요. -> 수정?id=번호");
                    }
                    break;
                case "빌드":
                    systemCtrl.build();
                    break;
                case "console":
                    System.out.println(Quotes.getList().toString());
            }

        }
    }


}
