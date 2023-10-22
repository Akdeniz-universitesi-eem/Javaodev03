# Javaodev3
Akdeniz Universitesi İleri Programlama Dersi 3.Odevi




1)Yazılımda oluşabilecek hatalar genel itibariyle 2 ye ayrılabilir bunlar:

Error,
Exception
Olarak anılırlar. 

Errorlar, bir programın görevini tamamlamasını tamamen engelleyen bir tip sorunken, Exceptionlar  programın normal akışını bölen kullanıcı tarafından istenmeyen değerler girildiğinde meydana gelebilecek bölünmelerdir.


Java dilindeki runtime exceptionlar oracle sitesinin Class RuntimeException bölümünde ayrıntılarıyla verilmişlerdir. Bunlardan en sık karşılaşınlanlardan birkaçı şunlardır:


NumberFormatException: Bu ifade, bir uygulamanın bir dizgiyi sayısal türlerden birine dönüştürmeye çalıştığını, ancak dizginin uygun biçime sahip olmadığını belirtmek için kullanılır.

NullPointerException: Bir uygulama, bir nesnenin gerektiği bir durumda null kullanmaya çalıştığında ortaya çıkar.

ArithmeticException: Bu sınıf, olağandışı bir aritmetik durum meydana geldiğinde fırlatılır. Örneğin, bir tam sayı "sıfıra bölmeye" çalıştığında bu sınıfın bir örneği fırlatılır.


Bu hataların hepsi:

https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html
sitesinden alınmıştır. Karışlaşılabilecek diğer hatalarda bu sitede bulunabilir.

En az hata ile kod yazmanın yolu program yazilirken sık sık compile edilmesi ve karşılaşılan hatalarda hata tipinin aratılması ve çözümünün bulunmasıyla mümkündür. Buna ek olarak programın tekrar eden kod satırları bulunmamalıdır. Program metot ve classlar kullanılarak anlaşılması kolay bir hale getirilmeli bunun yanında açıklama satırlarıda eklenmelidirki programcı koduna hakim olsun.

