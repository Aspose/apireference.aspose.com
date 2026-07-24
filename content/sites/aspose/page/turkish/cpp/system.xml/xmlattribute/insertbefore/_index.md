---
title: "System::Xml::XmlAttribute::InsertBefore yöntemi"
linktitle: "InsertBefore"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlAttribute::InsertBefore yöntemi. C++'de belirtilen düğümü, belirtilen referans düğümünün hemen önüne ekler."
type: docs
weight: 1500
url: /tr/cpp/system.xml/xmlattribute/insertbefore/
---
## XmlAttribute::InsertBefore method


Belirtilen düğümü belirtilen referans düğümünden hemen önce ekler.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertBefore(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | Eklenecek [XmlNode](../../xmlnode/). |
| refChild | SharedPtr\<XmlNode\> | Referans düğümü olan [XmlNode](../../xmlnode/). **newChild** bu düğümün önüne yerleştirilir. |

### ReturnValue

Ekleme yapılan [XmlNode](../../xmlnode/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
