package pl.comarch.szkolenia.rest.client;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private int quantity;
}
