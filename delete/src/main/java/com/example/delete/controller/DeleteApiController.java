package com.example.delete.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{user}")
    public void delete(@PathVariable("user") String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);

        // 리소스가 있는데 삭제 후의 상태나 리소스가 없는 상태에서 DELETE 후의 상태가 똑같기 때문에리소스의 삭제 메시지를 알려줄 필요가 없다.
        //delete -> 리소스 삭제 (리소스가 없는 상태에서 삭제를 해도 200 OK )(멱등성)

    }


}
