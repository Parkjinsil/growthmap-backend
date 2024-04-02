package com.growtMap.domain;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class Book {

    @Id
//    @Column(name="menu_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "menuSequence")
    @SequenceGenerator(name = "menuSequence", sequenceName = "SEQ_MENU", allocationSize = 1)
    private int menuCode;

//    @Column(name="menu_name")
    private String menuName;

//    @Column(name="menu_price")
    private String menuPrice;

//    @Column(name="menu_picture")
    private String menuPicture;

//    @Column(name="menu_desc")
    private String menuDesc;

    @ManyToOne
    @JoinColumn(name="res_code")
    private Restaurant restaurant;

}