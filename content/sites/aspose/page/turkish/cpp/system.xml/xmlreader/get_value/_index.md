---
title: "System::Xml::XmlReader::get_Value yöntemi"
linktitle: "get_Value"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlReader::get_Value yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün metin değerini C++'da alır."
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

Döndürülen değer, düğümün [XmlReader::get_NodeType](../get_nodetype/) değerine bağlıdır.
## Açıklamalar



Aşağıdaki tablo, döndürülecek bir değere sahip düğüm tiplerini listeler. Diğer tüm düğüm tipleri [String::Empty](../../../system/string/empty/) döndürür. |||
|-|-|
| Düğüm tipi | Değer |
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
