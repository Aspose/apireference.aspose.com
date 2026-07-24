---
title: "System::Xml::XmlValidatingReader::ReadAttributeValue method"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlValidatingReader::ReadAttributeValue method. C++ में एट्रिब्यूट मान को एक या अधिक Text, EntityReference, या EndEntity नोड्स में पार्स करता है।"
type: docs
weight: 4000
url: /hi/cpp/system.xml/xmlvalidatingreader/readattributevalue/
---
## XmlValidatingReader::ReadAttributeValue method


एट्रिब्यूट मान को एक या अधिक **[Text](../../../system.text/)**, **EntityReference**, या **EndEntity** नोड्स में पार्स करता है।

```cpp
bool System::Xml::XmlValidatingReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## संबंधित देखें

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
