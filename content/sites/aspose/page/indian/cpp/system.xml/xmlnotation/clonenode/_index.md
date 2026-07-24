---
title: "System::Xml::XmlNotation::CloneNode मेथड"
linktitle: "CloneNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNotation::CloneNode मेथड। इस नोड की एक डुप्लिकेट बनाता है। नोटेशन नोड्स को क्लोन नहीं किया जा सकता। इस मेथड को XmlNotation ऑब्जेक्ट पर कॉल करने से C++ में एक अपवाद फेंका जाता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


इस नोड की एक डुप्लिकेट बनाता है। नोटेशन नोड्स को क्लोन नहीं किया जा सकता। इस मेथड को [XmlNotation](../) ऑब्जेक्ट पर कॉल करने से अपवाद फेंका जाता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| गहरा | bool | **true** निर्दिष्ट नोड के नीचे उपवृक्ष को पुनरावर्ती रूप से क्लोन करने के लिए; **false** केवल नोड को स्वयं क्लोन करने के लिए। |

### ReturnValue

एक [XmlNode](../../xmlnode/) कॉपी उस नोड की जिससे मेथड को कॉल किया गया है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
