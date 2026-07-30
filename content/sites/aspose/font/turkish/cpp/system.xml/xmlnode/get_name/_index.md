---
title: "System::Xml::XmlNode::get_Name yöntemi"
linktitle: "get_Name"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNode::get_Name yöntemi. C++'ta türetilmiş bir sınıfta geçersiz kılındığında, düğümün nitelikli adını döndürür."
type: docs
weight: 1500
url: /tr/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Türetilmiş bir sınıfta geçersiz kılındığında düğümün nitelikli adını döndürür.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

Düğümün nitelikli adı.
## Açıklamalar



Dönen ad, düğümün [XmlNode::get_NodeType](../get_nodetype/) değerine bağlıdır: |||
|-|-|
| Tür | Ad |
| Attribute | Özniteliğin nitelikli adı. |
| CDATA | #cdata-section |
| Yorum | #comment |
| Belge | #document |
| BelgeParçası | #document-fragment |
| BelgeTürü | Belge türü adı. |
| Element | Elemanın nitelikli adı. |
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
