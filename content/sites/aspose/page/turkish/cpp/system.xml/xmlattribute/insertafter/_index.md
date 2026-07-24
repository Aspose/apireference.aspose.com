---
title: "System::Xml::XmlAttribute::InsertAfter yöntemi"
linktitle: "InsertAfter"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlAttribute::InsertAfter yöntemi. Belirtilen düğümü, belirtilen referans düğümünün hemen sonuna C++'ta ekler."
type: docs
weight: 1400
url: /tr/cpp/system.xml/xmlattribute/insertafter/
---
## XmlAttribute::InsertAfter method


Belirtilen düğümü belirtilen referans düğümünden hemen sonra ekler.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertAfter(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | Eklenecek [XmlNode](../../xmlnode/). |
| refChild | SharedPtr\<XmlNode\> | Referans düğümü olan [XmlNode](../../xmlnode/). **newChild**, **refChild**'in ardından yerleştirilir. |

### ReturnValue

Ekleme yapılan [XmlNode](../../xmlnode/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
