# SI_lab2_171059

# Втора лабораториска вежба по Софтверско инженерство



## Адеа Камбери, бр. на индекс 171059



### Група на код:
Ја добив групата на код 5

### Control Flow Graph:

![](C:\Users\Adea\Desktop\SI_lab2_171059\image\SILab2.png)



### Цикломатска комплексност
Цикломатската комплексност на овој код е 6, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=5, па цикломатската комплексност изнесува 6.


### Тест случаи според критериумот Every Statement
```java
@Test
    void everystatementTest(){
       RuntimeException ex;
       ex = assertThrows(RuntimeException.class, () -> SILab2.function(null));
       assertTrue(ex.getMessage().contains("List length should be greater than 0"));

       assertEquals(2d, SILab2.function(createList("0d, #")));
       assertEquals(2d, SILab2.function(createList("#, 0d")));
    }
```



### Teст случаи според критериумот Every Path
```java
@Test
void everyPathTest(){
    //ABN
    RuntimeException ex;
    ex = assertThrows(RuntimeException.class, () -> SILab2.function(null));
    assertTrue(ex.getMessage().contains("List length should be greater than 0"));

    //ACD1D2ELD3D2M
    //ACD1D2EFIJKD3D2MN
    //ACD1D2EFGIJKD3D2MN
    assertEquals(2d, SILab2.function(createList("0d, #")));

    //ACD1D2ELD3D2EFGHIJKD3D2MN
    assertEquals(2d, SILab2.function(createList("#, 0d, #")));

    //ACD1D2EFGIKD3D2MN
    assertEquals(0d, SILab2.function(createList("0")));
}
```




### Објаснување на напишаните unit tests

## Every Statement

| every satement | list=null | list=0# | list=#0 |
| -------------- | --------- | ------- | ------- |
| A              | *         | *       | *       |
| B              | *         |         |         |
| C              |           | *       | *       |
| D              |           | *       | *       |
| D2             |           | *       | *       |
| D3             |           | *       | *       |
| E              |           | *       | *       |
| F              |           | *       | *       |
| G              |           | *       | *       |
| H              |           |         | *       |
| I              |           | *       | *       |
| J              |           | *       |         |
| K              |           | *       | *       |
| L              |           | *       | *       |
| M              |           | *       | *       |
| N              | *         | *       | *       |



## Every Path

| every path                | list=null | list=0# | list=#0# | list=0 |
| ------------------------- | --------- | ------- | -------- | ------ |
| ABN                       | *l        |         |          |        |
| ACD1D2ELD3D2M             |           | *       |          |        |
| ACD1D2EFIJKD3D2MN         |           | *       |          |        |
| ACD1D2EFGIKD3D2MN         |           |         |          | *      |
| ACD1D2EFGIJKD3D2MN        |           | *       |          |        |
| ACD1D2ELD3D2EFGHIJKD3D2MN |           |         | *        |        |