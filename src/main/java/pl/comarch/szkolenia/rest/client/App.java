package pl.comarch.szkolenia.rest.client;

import org.springframework.web.client.RestTemplate;

public class App {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/rest/api/test1";
        Book book = restTemplate.getForObject(url, Book.class);
        System.out.println(book);

        //Book book1 = restTemplate.postForObject("http://????", new Book(), Book.class);
    }
}
