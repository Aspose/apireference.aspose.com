---
title: "System::Xml::XmlValidatingReader::get_Name metodu"
linktitle: "get_Name"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlValidatingReader::get_Name metodu. Geçerli düğümün nitelikli adını C++'de döndürür."
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

Geçerli düğümün nitelikli adı. Örneğin, **Name** **bk:book** için **<bk:book>** öğesidir.
## Açıklamalar



Dönen ad, düğümün XmlValidatingReader::NodeType değerine bağlıdır. Aşağıdaki düğüm tipleri listelenen değerleri döndürür. Diğer tüm düğüm tipleri boş bir dize döndürür. |||
|-|-|
| Düğüm Tipi | Ad |
| Attribute | Özelliğin adı. |
| BelgeTürü | Belge türü adı. |
| Element | Etiket adı. |
| EntityReference | Referans verilen varlığın adı. |
| İşlemeTalimatı | İşlem talimatının hedefi. |
| XmlDeclaration | Düz metin xml. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
