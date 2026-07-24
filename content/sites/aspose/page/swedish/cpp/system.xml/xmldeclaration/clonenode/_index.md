---
title: "System::Xml::XmlDeclaration::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlDeclaration::CloneNode metod. Skapar en kopia av den här noden i C++."
type: docs
weight: 100
url: /sv/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


Skapar en duplikat av denna nod.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| deep | bool | **true** för att rekursivt klona delträdet under den angivna noden; **false** för att bara klona själva noden. Eftersom [XmlDeclaration](../) noder inte har några barn, inkluderar den klonade noden alltid datavärdet, oavsett parameterinställning. |

### ReturnValue

Den klonade noden.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
