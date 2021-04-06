package com.wrz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class house {
    private int h_id;
    private int h_shi;
    private int h_ting;
    private String h_man;
    private String h_address;
}
