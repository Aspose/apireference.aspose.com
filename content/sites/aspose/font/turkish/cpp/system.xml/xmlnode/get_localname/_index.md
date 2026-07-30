---
title: "System::Xml::XmlNode::get_LocalName metodu"
linktitle: "get_LocalName"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNode::get_LocalName metodu. C++'ta türetilmiş bir sınıfta geçersiz kılındığında düğümün yerel adını döndürür."
type: docs
weight: 1400
url: /tr/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


Türetilmiş bir sınıfta geçersiz kılındığında düğümün yerel adını döndürür.

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

Önek kaldırılmış düğümün adı. Örneğin, **LocalName**, **book** olur **<bk:book>** elemanı için.
## Açıklamalar



Dönen ad, düğümün [XmlNode::get_NodeType](../get_nodetype/) değerine bağlıdır: |||
|-|-|
| Tür | Ad |
| Attribute | Özelliğin yerel adı. |
| CDATA | #cdata-section |
| Yorum | #comment |
| Belge | #document |
| BelgeParçası | #document-fragment |
| BelgeTürü | Belge türü adı. |
| Element | Öğenin yerel adı. |
| Varlık | Varlığın adı. |
| EntityReference | Referans verilen varlığın adı. |
| Notasyon | Notasyon adı. |
| İşlemeTalimatı | İşlem talimatının hedefi. |
| Text | #text |
| Boşluk | #whitespace |
| ÖnemliBoşluk | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
