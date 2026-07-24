---
title: "System::Xml::XmlCDataSection::CloneNode मेथड"
linktitle: "CloneNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlCDataSection::CloneNode मेथड। C++ में इस नोड की एक डुप्लिकेट बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


इस नोड की एक डुप्लिकेट बनाता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| गहरा | bool | **true** निर्दिष्ट नोड के तहत सबट्री को पुनरावर्ती रूप से क्लोन करने के लिए; **false** केवल नोड को स्वयं क्लोन करने के लिए। क्योंकि CDATA नोड्स के पास चाइल्ड नहीं होते, पैरामीटर सेटिंग चाहे जो भी हो, क्लोन किया गया नोड हमेशा डेटा कंटेंट शामिल करेगा। |

### ReturnValue

क्लोन किया गया नोड।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
