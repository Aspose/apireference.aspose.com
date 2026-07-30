---
title: "System::Xml::XmlNodeReader::ReadAttributeValue metodo"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNodeReader::ReadAttributeValue metodo. Analizza il valore dell'attributo in uno o più nodi Text, EntityReference o EndEntity in C++."
type: docs
weight: 3100
url: /it/cpp/system.xml/xmlnodereader/readattributevalue/
---
## XmlNodeReader::ReadAttributeValue method


Analizza il valore dell'attributo in uno o più **[Text](../../../system.text/)**, **EntityReference**, o **EndEntity** nodi.

```cpp
bool System::Xml::XmlNodeReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Vedi anche

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
