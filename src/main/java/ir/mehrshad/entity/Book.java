package ir.mehrshad.entity;

import ir.mehrshad.base.basedomain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public class Book extends BaseEntity<Long> {
    @Column
    private String name;
    @Column
    private String author;
}
