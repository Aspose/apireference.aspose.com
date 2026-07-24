---
title: "System::Xml::XmlNode::Supports मेथड"
linktitle: "Supports"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNode::Supports मेथड। यह परीक्षण करता है कि क्या DOM इम्प्लीमेंटेशन C++ में कोई विशिष्ट फ़ीचर लागू करता है।"
type: docs
weight: 4400
url: /hi/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


जाँचता है कि DOM इम्प्लीमेंटेशन कोई विशिष्ट फीचर लागू करता है या नहीं।

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| फ़ीचर | String | परीक्षण करने वाले फीचर का पैकेज नाम। यह नाम केस-सेंसिटिव नहीं है। |
| संस्करण | String | परीक्षण के लिए पैकेज नाम का संस्करण संख्या। यदि संस्करण निर्दिष्ट नहीं किया गया है (null), तो फ़ीचर के किसी भी संस्करण का समर्थन करने से मेथड true लौटाता है। |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## टिप्पणियाँ



निम्न तालिका उन संयोजनों का वर्णन करती है जो **true** लौटाते हैं। |||
|-|-|
| फ़ीचर | संस्करण |
| XML | 1.0 |
| XML | 2.0 |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
