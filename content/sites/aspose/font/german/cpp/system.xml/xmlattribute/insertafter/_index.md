---
title: "System::Xml::XmlAttribute::InsertAfter Methode"
linktitle: "InsertAfter"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlAttribute::InsertAfter Methode. Fügt den angegebenen Knoten unmittelbar nach dem angegebenen Referenzknoten in C++ ein."
type: docs
weight: 1400
url: /de/cpp/system.xml/xmlattribute/insertafter/
---
## XmlAttribute::InsertAfter method


Fügt den angegebenen Knoten unmittelbar nach dem angegebenen Referenzknoten ein.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertAfter(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | Der zu einzufügende [XmlNode](../../xmlnode/). |
| refChild | SharedPtr\<XmlNode\> | Der [XmlNode](../../xmlnode/), der der Referenzknoten ist. Der **newChild** wird nach dem **refChild** platziert. |

### ReturnValue

Der eingefügte [XmlNode](../../xmlnode/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
