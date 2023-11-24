package fun.bookshop;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class BookEntity {

  @Id
          @Column(name="id")
  Integer bookId;

  String name;

  String author;

  public BookEntity(Integer bookId,
                    String name, String author) {

    this.bookId = bookId;
    this.name = name;
    this.author = author;
  }

  public BookEntity() {
  }
}
