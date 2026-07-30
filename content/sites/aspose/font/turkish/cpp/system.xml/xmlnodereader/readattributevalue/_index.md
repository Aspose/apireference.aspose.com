---
title: "System::Xml::XmlNodeReader::ReadAttributeValue yöntemi"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeReader::ReadAttributeValue yöntemi. Öznitelik değerini C++'ta bir veya daha fazla Text, EntityReference veya EndEntity düğümüne ayrıştırır."
type: docs
weight: 3100
url: /tr/cpp/system.xml/xmlnodereader/readattributevalue/
---
## XmlNodeReader::ReadAttributeValue method


Öznitelik değerini bir veya daha fazla **[Text](../../../system.text/)**, **EntityReference** veya **EndEntity** düğümüne ayrıştırır.

```cpp
bool System::Xml::XmlNodeReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Ayrıca Bakınız

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
