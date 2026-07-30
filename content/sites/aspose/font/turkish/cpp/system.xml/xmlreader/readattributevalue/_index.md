---
title: "System::Xml::XmlReader::ReadAttributeValue metodu"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::ReadAttributeValue metodu. Türetilmiş bir sınıfta geçersiz kılındığında, öznitelik değerini C++'ta bir veya daha fazla Text, EntityReference veya EndEntity düğümüne ayrıştırır."
type: docs
weight: 3800
url: /tr/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


Türetilmiş bir sınıfta geçersiz kılındığında, öznitelik değerini bir veya daha fazla **[Text](../../../system.text/)**, **EntityReference** veya **EndEntity** düğümüne ayrıştırır.

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Ayrıca Bakınız

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
