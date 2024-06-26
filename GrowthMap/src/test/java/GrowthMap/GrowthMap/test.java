package GrowthMap.GrowthMap;

import jakarta.persistence.*;
import lombok.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "test")
    public class test {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long test_id;

        @Column(name="t",nullable = false)
        private  String textText;
    }

