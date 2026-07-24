---
title: "System::Xml::XmlEntityReference::CloneNode metod"
linktitle: "CloneNode"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlEntityReference::CloneNode metod. Skapar en duplikat av denna nod i C++."
type: docs
weight: 100
url: /sv/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


Skapar en duplikat av denna nod.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| deep | bool | **true** för att rekursivt klona underträdet under den angivna noden; **false** för att bara klona själva noden. För [XmlEntityReference](../) noder returnerar denna metod alltid en entitetsreferensnod utan barn. Ersättningstexten sätts när noden infogas i en förälder. |

### ReturnValue

Den klonade noden.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
