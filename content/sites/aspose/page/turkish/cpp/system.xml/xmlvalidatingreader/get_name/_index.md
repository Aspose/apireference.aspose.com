---
title: "System::Xml::XmlValidatingReader::get_Name method"
linktitle: "get_Name"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlValidatingReader::get_Name yöntemi. Geçerli düğümün nitelikli adını C++'ta döndürür."
type: docs
weight: 1700
url: /tr/cpp/system.xml/xmlvalidatingreader/get_name/
---
## XmlValidatingReader::get_Name method


Geçerli düğümün nitelikli adını döndürür.

```cpp
String System::Xml::XmlValidatingReader::get_Name() override
```


### ReturnValue

Geçerli düğümün nitelikli adı. Örneğin, **Name** öğesi **<bk:book>** elemanı için **bk:book** olur.
## Açıklamalar



Döndürülen ad, düğümün XmlValidatingReader::NodeType değerine bağlıdır. Aşağıdaki düğüm tipleri listelenen değerleri döndürür. Diğer tüm düğüm tipleri boş bir dize döndürür. |||
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
