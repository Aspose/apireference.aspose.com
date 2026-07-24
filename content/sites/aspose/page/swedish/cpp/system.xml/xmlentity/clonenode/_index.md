---
title: "System::Xml::XmlEntity::CloneNode metod"
linktitle: "CloneNode"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlEntity::CloneNode metod. Skapar en duplikat av denna nod. Entitetsnoder kan inte klonas. Att anropa denna metod på ett XmlEntity-objekt kastar ett undantag i C++."
type: docs
weight: 100
url: /sv/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


Skapar en duplikat av denna nod. Entitetsnoder kan inte klonas. Att anropa denna metod på ett [XmlEntity](../) objekt kastar ett undantag.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| djup | bool | **true** för att rekursivt klona underträdet under den angivna noden; **false** för att bara klona själva noden. |

### ReturnValue

En kopia av [XmlNode](../../xmlnode/) som metoden anropas från.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
