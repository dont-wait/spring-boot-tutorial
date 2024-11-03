package com.dontwait.springcore.others;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy //chừng naof gọi tới tui thì tui mơới khởi tạo - ko cầm đèn chạy trước oto
//@Scope("prototype")
//Cập bài trùng @Scope("prototype") @Lazy
public class Girl {
    public Girl() {
        System.out.println("Girl has initialization");
    }
}
