---
title: "System::Xml::XmlNode::get_Name metodu"
linktitle: "get_Name"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNode::get_Name metodu. C++'da türetilmiş bir sınıfta geçersiz kılındığında düğümün nitelikli adını döndürür."
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



Döndürülen ad, düğümün [XmlNode::get_NodeType](../get_nodetype/) değerine bağlıdır: |||
|-|-|
| Type | Ad |
| Attribute | Özniteliğin nitelikli adı. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Belge türü adı. |
| Element | Öğenin nitelikli adı. |
| Entity | Varlığın adı. |
| EntityReference | Başvurulan varlığın adı. |
| Notasyon | Notasyon adı. |
| ProcessingInstruction | İşlem talimatının hedefi. |
| Text | #text |
| Boşluk | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
