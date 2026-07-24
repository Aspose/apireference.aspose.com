---
title: "System::Xml::XmlNodeReader::get_Name yöntemi"
linktitle: "get_Name"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNodeReader::get_Name yöntemi. C++'de geçerli düğümün nitelikli adını döndürür."
type: docs
weight: 1400
url: /tr/cpp/system.xml/xmlnodereader/get_name/
---
## XmlNodeReader::get_Name method


Geçerli düğümün nitelikli adını döndürür.

```cpp
String System::Xml::XmlNodeReader::get_Name() override
```


### ReturnValue

Geçerli düğümün nitelikli adı. Örneğin, **Name** öğesi **<bk:book>** elemanı için **bk:book** olur.
## Açıklamalar



Döndürülen ad, düğümün [XmlNodeReader::get_NodeType](../get_nodetype/) değerine bağlıdır. Aşağıdaki düğüm türleri listelenen değerleri döndürür. Diğer tüm düğüm türleri boş bir dize döndürür. |||
|-|-|
| Düğüm Türü | Ad |
| Attribute | Özelliğin adı. |
| DocumentType | Belge türü adı. |
| Element | Etiket adı. |
| EntityReference | Başvurulan varlığın adı. |
| ProcessingInstruction | İşlem talimatının hedefi. |
| XmlDeclaration | Düz metin dizesi xml. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
