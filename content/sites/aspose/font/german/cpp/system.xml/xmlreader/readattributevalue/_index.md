---
title: "System::Xml::XmlReader::ReadAttributeValue Methode"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::ReadAttributeValue Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, analysiert sie den Attributwert in einen oder mehrere Text-, EntityReference- oder EndEntity‑Knoten in C++."
type: docs
weight: 3800
url: /de/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, analysiert sie den Attributwert in einen oder mehrere **[Text](../../../system.text/)**, **EntityReference** oder **EndEntity** Knoten.

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Siehe auch

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
