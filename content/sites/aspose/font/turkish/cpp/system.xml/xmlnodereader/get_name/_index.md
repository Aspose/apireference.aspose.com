---
title: "System::Xml::XmlNodeReader::get_Name yöntemi"
linktitle: "get_Name"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeReader::get_Name yöntemi. C++'ta geçerli düğümün nitelikli adını döndürür."
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

Geçerli düğümün nitelikli adı. Örneğin, **Name** **bk:book** için **<bk:book>** öğesidir.
## Açıklamalar



Dönen ad, düğümün [XmlNodeReader::get_NodeType](../get_nodetype/) değerine bağlıdır. Aşağıdaki düğüm tipleri listelenen değerleri döndürür. Diğer tüm düğüm tipleri boş bir dize döndürür. |||
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
