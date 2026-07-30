---
title: "System::Xml::XmlReader::ReadAttributeValue метод"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlReader::ReadAttributeValue метод. При переопределении в производном классе разбирает значение атрибута в один или несколько узлов Text, EntityReference или EndEntity в C++."
type: docs
weight: 3800
url: /ru/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


При переопределении в производном классе разбирает значение атрибута в один или несколько **[Text](../../../system.text/)**, **EntityReference** или **EndEntity** узлов.

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## См. также

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
