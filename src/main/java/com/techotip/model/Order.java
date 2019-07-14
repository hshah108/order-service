package com.techotip.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private Integer orderId;
    private String name;
    private String description;
    private Integer userId;
}
