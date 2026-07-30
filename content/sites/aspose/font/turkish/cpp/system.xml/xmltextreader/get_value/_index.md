---
title: "System::Xml::XmlTextReader::get_Value yöntemi"
linktitle: "get_Value"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlTextReader::get_Value yöntemi. C++'da geçerli düğümün metin değerini döndürür."
type: docs
weight: 2900
url: /tr/cpp/system.xml/xmltextreader/get_value/
---
## XmlTextReader::get_Value method


Geçerli düğümün metin değerini döndürür.

```cpp
String System::Xml::XmlTextReader::get_Value() override
```


### ReturnValue

Dönen değer, düğümün [XmlTextReader::get_NodeType](../get_nodetype/) değerine bağlıdır.
## Açıklamalar



Aşağıdaki tablo, döndürülecek bir değere sahip düğüm tiplerini listeler. Diğer tüm düğüm tipleri [String::Empty](../../../system/string/empty/) döndürür. |||
|-|-|
| Düğüm Tipi | Değer |
| Attribute | Özelliğin değeri. |
| CDATA | CDATA bölümünün içeriği. |
| Yorum | Yorumun içeriği. |
| BelgeTürü | İç alt küme. |
| İşlemeTalimatı | Hedef dışındaki tüm içerik. |
| ÖnemliBoşluk | xml:space='preserve' kapsamı içindeki boşluk. |
| Text | Metin düğümünün içeriği. |
| Boşluk | İşaretleme arasındaki boşluk. |
| XmlDeclaration | Deklarasyonun içeriği. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
