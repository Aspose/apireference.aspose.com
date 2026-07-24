---
title: "System::Xml::XmlReader::ReadAttributeValue मेथड"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::ReadAttributeValue मेथड। जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो C++ में गुण मान को एक या अधिक Text, EntityReference, या EndEntity नोड्स में पार्स करता है।"
type: docs
weight: 3800
url: /hi/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो गुण मान को एक या अधिक **[Text](../../../system.text/)**, **EntityReference**, या **EndEntity** नोड्स में पार्स करता है।

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## संबंधित देखें

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
