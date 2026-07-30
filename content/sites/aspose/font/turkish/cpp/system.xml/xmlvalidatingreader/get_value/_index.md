---
title: "System::Xml::XmlValidatingReader::get_Value yöntemi"
linktitle: "get_Value"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlValidatingReader::get_Value yöntemi. C++'ta geçerli düğümün metin değerini döndürür."
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
| Düğüm Tipi | Değer |
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
