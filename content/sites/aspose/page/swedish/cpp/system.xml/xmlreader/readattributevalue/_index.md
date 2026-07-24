---
title: "System::Xml::XmlReader::ReadAttributeValue metod"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlReader::ReadAttributeValue metod. När den åsidosätts i en avledd klass analyserar den attributvärdet till ett eller flera Text, EntityReference eller EndEntity-noder i C++."
type: docs
weight: 3800
url: /sv/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


När den åsidosätts i en avledd klass analyserar den attributvärdet till ett eller flera **[Text](../../../system.text/)**, **EntityReference** eller **EndEntity**-noder.

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## Se även

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
