package ir.mehrshad.entity;

import ir.mehrshad.base.basedomain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "borrow")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrow extends BaseEntity<Long> {
    @Column
    private Long userId;
    @Column
    private Long bookId;
    @Column
    private LocalDate date;

}
