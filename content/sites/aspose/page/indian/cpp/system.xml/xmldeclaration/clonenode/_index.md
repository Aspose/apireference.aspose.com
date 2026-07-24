---
title: "System::Xml::XmlDeclaration::CloneNode मेथड"
linktitle: "CloneNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDeclaration::CloneNode मेथड। C++ में इस नोड की एक प्रतिलिपि बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


इस नोड की एक डुप्लिकेट बनाता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| deep | bool | **true** निर्दिष्ट नोड के नीचे उपवृक्ष को पुनरावर्ती रूप से क्लोन करने के लिए; **false** केवल नोड को ही क्लोन करने के लिए। क्योंकि [XmlDeclaration](../) नोड्स के पास बच्चे नहीं होते, क्लोन किया गया नोड हमेशा डेटा मान को शामिल करता है, पैरामीटर सेटिंग की परवाह किए बिना। |

### ReturnValue

क्लोन किया गया नोड।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
