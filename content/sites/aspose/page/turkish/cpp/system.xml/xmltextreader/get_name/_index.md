---
title: "System::Xml::XmlTextReader::get_Name yöntemi"
linktitle: "get_Name"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlTextReader::get_Name yöntemi. C++'da geçerli düğümün nitelikli adını döndürür."
type: docs
weight: 1900
url: /tr/cpp/system.xml/xmltextreader/get_name/
---
## XmlTextReader::get_Name method


Geçerli düğümün nitelikli adını döndürür.

```cpp
String System::Xml::XmlTextReader::get_Name() override
```


### ReturnValue

Geçerli düğümün nitelikli adı. Örneğin, **Name** öğesi **<bk:book>** elemanı için **bk:book** olur.
## Açıklamalar



Dönen ad, düğümün [XmlTextReader::get_NodeType](../get_nodetype/) değerine bağlıdır. Aşağıdaki düğüm tipleri listelenen değerleri döndürür. Diğer tüm düğüm tipleri boş bir dize döndürür. |||
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
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
