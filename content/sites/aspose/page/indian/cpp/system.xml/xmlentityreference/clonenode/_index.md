---
title: "System::Xml::XmlEntityReference::CloneNode विधि"
linktitle: "CloneNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlEntityReference::CloneNode विधि। C++ में इस नोड की एक प्रतिलिपि बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


इस नोड की एक डुप्लिकेट बनाता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| deep | bool | **true** निर्दिष्ट नोड के नीचे उपवृक्ष को पुनरावर्ती रूप से क्लोन करने के लिए; **false** केवल नोड को स्वयं क्लोन करने के लिए। [XmlEntityReference](../) नोड्स के लिए, यह विधि हमेशा बिना बच्चों के एक एंटिटी रेफ़रेंस नोड लौटाती है। प्रतिस्थापन पाठ तब सेट किया जाता है जब नोड को पैरेंट में सम्मिलित किया जाता है। |

### ReturnValue

क्लोन किया गया नोड।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
