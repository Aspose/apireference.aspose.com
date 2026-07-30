---
title: "System::Xml::XmlTextReader::ReadAttributeValue metodu"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlTextReader::ReadAttributeValue metodu. C++'da öznitelik değerini bir veya daha fazla Text, EntityReference veya EndEntity düğümüne ayrıştırır."
type: docs
weight: 4300
url: /tr/cpp/system.xml/xmltextreader/readattributevalue/
---
## XmlTextReader::ReadAttributeValue method


Öznitelik değerini bir veya daha fazla **[Text](../../../system.text/)**, **EntityReference** veya **EndEntity** düğümüne ayrıştırır.

```cpp
bool System::Xml::XmlTextReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Ayrıca Bakınız

* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
