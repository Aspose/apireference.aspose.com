---
title: "System::Xml::XmlTextReader::ReadAttributeValue मेथड"
linktitle: "ReadAttributeValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextReader::ReadAttributeValue मेथड। C++ में एट्रिब्यूट वैल्यू को एक या अधिक Text, EntityReference, या EndEntity नोड्स में पार्स करता है।"
type: docs
weight: 4300
url: /hi/cpp/system.xml/xmltextreader/readattributevalue/
---
## XmlTextReader::ReadAttributeValue method


एट्रिब्यूट मान को एक या अधिक **[Text](../../../system.text/)**, **EntityReference**, या **EndEntity** नोड्स में पार्स करता है।

```cpp
bool System::Xml::XmlTextReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## संबंधित देखें

* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
