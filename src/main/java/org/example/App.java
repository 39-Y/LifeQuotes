package org.example;

import org.example.container.Sc;
import org.example.controller.QuoteController;
import org.example.controller.SystemController;
import org.example.domain.Req;

public class App {
    QuoteController quoteCtrl = new QuoteController();
    SystemController systemCtrl = new SystemController();

    public void start(){
        System.out.println("== 명언 앱 ==");
        while (true){
            System.out.print("명령) ");
            String command = Sc.get().nextLine();
            if("종료".equals(command)){
                systemCtrl.exit();
                break;
            }
            if("등록".equals(command)){
                quoteCtrl.post();
            }
            else if ("목록".equals(command)){
                quoteCtrl.read();
            }
            else if ("삭제".equals(Req.getAction(command))) {
                try{
                    quoteCtrl.remove((Integer) Req.getParam(command).get("id"));
                } catch (Exception e){}
            }
            else if(command.contains("수정?id=")) {
                try{
                    quoteCtrl.update((Integer) Req.getParam(command).get("id"));
                } catch (Exception e){}
            }
            else if("빌드".equals(command)) {
                systemCtrl.build();
            }

        }
    }


}
