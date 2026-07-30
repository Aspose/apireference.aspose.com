---
title: "System::Xml::XmlTextReader::get_Name yöntemi"
linktitle: "get_Name"
second_title: "Aspose.Font için C++"
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

Geçerli düğümün nitelikli adı. Örneğin, **Name** **bk:book** için **<bk:book>** öğesidir.
## Açıklamalar



Dönen ad, düğümün [XmlTextReader::get_NodeType](../get_nodetype/) değerine bağlıdır. Aşağıdaki düğüm tipleri listelenen değerleri döndürür. Diğer tüm düğüm tipleri boş bir dize döndürür. |||
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
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
