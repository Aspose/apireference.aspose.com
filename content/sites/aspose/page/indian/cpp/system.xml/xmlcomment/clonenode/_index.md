---
title: "System::Xml::XmlComment::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlComment::CloneNode method. C++ में इस नोड की एक प्रतिलिपि बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


इस नोड की एक डुप्लिकेट बनाता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| गहरा | bool | **true** निर्दिष्ट नोड के नीचे सबट्री को पुनरावर्ती रूप से क्लोन करने के लिए; **false** केवल नोड को ही क्लोन करने के लिए। चूँकि टिप्पणी नोड्स के कोई चाइल्ड नहीं होते, क्लोन किया गया नोड हमेशा टेक्स्ट सामग्री शामिल करता है, चाहे पैरामीटर सेटिंग कुछ भी हो। |

### ReturnValue

क्लोन किया गया नोड।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
