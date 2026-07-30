---
title: "System::Xml::XmlReader::get_Value metodu"
linktitle: "get_Value"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::get_Value metodu. Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün metin değerini C++'ta alır."
type: docs
weight: 2400
url: /tr/cpp/system.xml/xmlreader/get_value/
---
## XmlReader::get_Value method


Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün metin değerini alır.

```cpp
virtual String System::Xml::XmlReader::get_Value()=0
```


### ReturnValue

Dönen değer, düğümün [XmlReader::get_NodeType](../get_nodetype/) değerine bağlıdır.
## Açıklamalar



Aşağıdaki tablo, döndürülecek bir değere sahip düğüm tiplerini listeler. Diğer tüm düğüm tipleri [String::Empty](../../../system/string/empty/) döndürür. |||
|-|-|
| Düğüm türü | Değer |
| Attribute | Özelliğin değeri. |
| CDATA | CDATA bölümünün içeriği. |
| Yorum | Yorumun içeriği. |
| BelgeTürü | İç alt küme. |
| İşlemeTalimatı | Hedef dışındaki tüm içerik. |
| ÖnemliBoşluk | Karışık içerik modelinde işaretleme arasındaki boşluk. |
| Text | Metin düğümünün içeriği. |
| Boşluk | İşaretleme arasındaki boşluk. |
| XmlDeclaration | Deklarasyonun içeriği. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
