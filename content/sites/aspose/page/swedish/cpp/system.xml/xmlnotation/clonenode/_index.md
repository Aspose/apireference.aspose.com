---
title: "System::Xml::XmlNotation::CloneNode metod"
linktitle: "CloneNode"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlNotation::CloneNode metod. Skapar en duplikat av denna nod. Notationsnoder kan inte klonas. Att anropa denna metod på ett XmlNotation‑objekt kastar ett undantag i C++."
type: docs
weight: 100
url: /sv/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


Skapar en duplikat av denna nod. Notationsnoder kan inte klonas. Att anropa denna metod på ett [XmlNotation](../)‑objekt kastar ett undantag.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| djup | bool | **true** för att rekursivt klona underträdet under den angivna noden; **false** för att bara klona själva noden. |

### ReturnValue

En [XmlNode](../../xmlnode/)‑kopia av noden som metoden anropas från.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
