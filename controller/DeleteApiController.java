package com.example.delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{user-id}")
    public void delete(@PathVariable(name = "user-id") String userId, @RequestParam String account) {
        // delete는 받는 값이 제한적이기 때문에 (다른 API처럼 많거나 다양한 값을 받지 않기 때문에)
        // 따로 dto를 만들지 않고 @RequestParam 사용
        System.out.println(userId);
        System.out.println(account);
        // delete는 요청 받은 것이 이미 존재하지 않더라도 delete의 동작 자체가
        // 뭔갈 삭제시켜서 없는 상태로 만드는 것이기 때문에 결과는 없는 상태로 동일.
        // 따라서 이미 없는 것 삭제 요청 받아도 200 OK (error 아님) -> 멱등성
    }
}
