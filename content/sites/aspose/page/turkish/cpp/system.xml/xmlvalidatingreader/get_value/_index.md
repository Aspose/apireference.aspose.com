---
title: "System::Xml::XmlValidatingReader::get_Value metodu"
linktitle: "get_Value"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlValidatingReader::get_Value metodu. C++'ta mevcut düğümün metin değerini döndürür."
type: docs
weight: 2900
url: /tr/cpp/system.xml/xmlvalidatingreader/get_value/
---
## XmlValidatingReader::get_Value method


Geçerli düğümün metin değerini döndürür.

```cpp
String System::Xml::XmlValidatingReader::get_Value() override
```


### ReturnValue

Döndürülen değer, düğümün XmlValidatingReader::NodeType özelliğine bağlıdır.
## Açıklamalar



Aşağıdaki tablo, döndürülecek bir değere sahip düğüm tiplerini listeler. Diğer tüm düğüm tipleri [String::Empty](../../../system/string/empty/) döndürür. |||
|-|-|
| Düğüm Türü | Değer |
| Attribute | Özelliğin değeri. |
| CDATA | CDATA bölümünün içeriği. |
| Comment | Yorumun içeriği. |
| DocumentType | İç alt küme. |
| ProcessingInstruction | Hedef dışındaki tüm içerik. |
| SignificantWhitespace | Karışık içerik modelinde işaretleme arasındaki boşluk. |
| Text | Metin düğümünün içeriği. |
| Boşluk | İşaretleme arasındaki boşluk. |
| XmlDeclaration | Deklarasyonun içeriği. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
