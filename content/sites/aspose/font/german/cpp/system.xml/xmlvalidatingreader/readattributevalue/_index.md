---
title: "System::Xml::XmlValidatingReader::ReadAttributeValue Methode"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlValidatingReader::ReadAttributeValue Methode. Analysiert den Attributwert in einen oder mehrere Text-, EntityReference- oder EndEntity-Knoten in C++."
type: docs
weight: 4000
url: /de/cpp/system.xml/xmlvalidatingreader/readattributevalue/
---
## XmlValidatingReader::ReadAttributeValue method


Analysiert den Attributwert in einen oder mehrere **[Text](../../../system.text/)**, **EntityReference**, oder **EndEntity**-Knoten.

```cpp
bool System::Xml::XmlValidatingReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Siehe auch

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
