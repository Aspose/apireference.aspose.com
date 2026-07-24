---
title: "System::Xml::XmlAttribute::PrependChild yöntemi"
linktitle: "PrependChild"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlAttribute::PrependChild yöntemi. Belirtilen düğümü, bu düğümün alt düğüm listesine başa ekler C++'ta."
type: docs
weight: 1600
url: /tr/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


Belirtilen düğümü bu düğümün alt düğüm listesine başa ekler.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | Eklenecek [XmlNode](../../xmlnode/). Eğer bir [XmlDocumentFragment](../../xmldocumentfragment/) ise, belge parçacığının tüm içeriği bu düğümün alt düğüm listesine taşınır. |

### ReturnValue

Eklenen [XmlNode](../../xmlnode/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
