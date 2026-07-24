---
title: "System::Xml::XmlCDataSection::CloneNode metod"
linktitle: "CloneNode"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlCDataSection::CloneNode metod. Skapar en duplikat av denna nod i C++."
type: docs
weight: 100
url: /sv/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


Skapar en duplikat av denna nod.

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| djup | bool | **true** för att rekursivt klona underträdet under den angivna noden; **false** för att klona endast noden själv. Eftersom CDATA-noder inte har barn, oavsett parameterinställning, kommer den klonade noden alltid att inkludera datainnehållet. |

### ReturnValue

Den klonade noden.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
