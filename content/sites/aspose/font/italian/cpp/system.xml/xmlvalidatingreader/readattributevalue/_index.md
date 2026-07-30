---
title: "System::Xml::XmlValidatingReader::ReadAttributeValue metodo"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlValidatingReader::ReadAttributeValue metodo. Analizza il valore dell'attributo in uno o più nodi Text, EntityReference o EndEntity in C++."
type: docs
weight: 4000
url: /it/cpp/system.xml/xmlvalidatingreader/readattributevalue/
---
## XmlValidatingReader::ReadAttributeValue method


Analizza il valore dell'attributo in uno o più **[Text](../../../system.text/)**, **EntityReference**, o **EndEntity** nodi.

```cpp
bool System::Xml::XmlValidatingReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Vedi anche

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
