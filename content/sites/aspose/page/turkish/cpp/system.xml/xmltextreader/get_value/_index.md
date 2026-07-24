---
title: "System::Xml::XmlTextReader::get_Value yöntemi"
linktitle: "get_Value"
second_title: "Aspose.Page için C++"
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

Döndürülen değer, düğümün [XmlTextReader::get_NodeType](../get_nodetype/) değerine bağlıdır.
## Açıklamalar



Aşağıdaki tablo, döndürülecek bir değere sahip düğüm tiplerini listeler. Diğer tüm düğüm tipleri [String::Empty](../../../system/string/empty/) döndürür. |||
|-|-|
| Düğüm Türü | Değer |
| Attribute | Özelliğin değeri. |
| CDATA | CDATA bölümünün içeriği. |
| Comment | Yorumun içeriği. |
| DocumentType | İç alt küme. |
| ProcessingInstruction | Hedef dışındaki tüm içerik. |
| SignificantWhitespace | xml:space='preserve' kapsamı içindeki boşluk karakterleri. |
| Text | Metin düğümünün içeriği. |
| Boşluk | İşaretleme arasındaki boşluk. |
| XmlDeclaration | Deklarasyonun içeriği. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
