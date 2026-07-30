---
title: "System::Xml::XmlReader::get_Name yöntemi"
linktitle: "get_Name"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::get_Name yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün nitelikli adını C++'ta alır."
type: docs
weight: 1500
url: /tr/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


Türetilmiş bir sınıfta geçersiz kılındığında, geçerli düğümün nitelikli adını alır.

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

Geçerli düğümün nitelikli adı. Örneğin, **Name** **bk:book** için **<bk:book>** öğesidir.
## Açıklamalar



Dönen ad, düğümün [XmlReader::get_NodeType](../get_nodetype/) değerine bağlıdır. Aşağıdaki düğüm tipleri listelenen değerleri döndürür. Diğer tüm düğüm tipleri boş bir dize döndürür. |||
|-|-|
| Düğüm türü | Ad |
| Attribute | Özelliğin adı. |
| BelgeTürü | Belge türü adı. |
| Element | Etiket adı. |
| EntityReference | Referans verilen varlığın adı. |
| İşlemeTalimatı | İşlem talimatının hedefi. |
| XmlDeclaration | Düz metin xml. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
