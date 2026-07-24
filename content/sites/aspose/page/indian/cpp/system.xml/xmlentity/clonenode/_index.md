---
title: "System::Xml::XmlEntity::CloneNode विधि"
linktitle: "CloneNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlEntity::CloneNode विधि। यह नोड की एक प्रतिलिपि बनाती है। एंटिटी नोड्स को क्लोन नहीं किया जा सकता। इस विधि को XmlEntity ऑब्जेक्ट पर कॉल करने से C++ में एक अपवाद उत्पन्न होता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


इस नोड की एक प्रतिलिपि बनाता है। एंटिटी नोड्स को क्लोन नहीं किया जा सकता। इस विधि को [XmlEntity](../) ऑब्जेक्ट पर कॉल करने से एक अपवाद उत्पन्न होता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| गहरा | bool | **true** निर्दिष्ट नोड के नीचे उपवृक्ष को पुनरावर्ती रूप से क्लोन करने के लिए; **false** केवल नोड को स्वयं क्लोन करने के लिए। |

### ReturnValue

विधि जिस [XmlNode](../../xmlnode/) से कॉल की गई है, उसकी एक कॉपी।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
