---
title: "System::Xml::XmlImplementation::HasFeature method"
linktitle: "HasFeature"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlImplementation::HasFeature method. C++ में Document Object Model (DOM) इम्प्लीमेंटेशन किसी विशिष्ट फीचर को लागू करता है या नहीं, इसका परीक्षण करता है।"
type: docs
weight: 300
url: /hi/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


जाँचता है कि Document [Object](../../../system/object/) Model (DOM) इम्प्लीमेंटेशन कोई विशिष्ट फीचर लागू करता है या नहीं।

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| strFeature | const String\& | परीक्षण करने वाले फीचर का पैकेज नाम। यह नाम केस-सेंसिटिव नहीं है। |
| strVersion | const String\& | यह पैकेज नाम के परीक्षण के लिए संस्करण संख्या है। यदि संस्करण निर्दिष्ट नहीं किया गया है (**nullptr**), तो फीचर के किसी भी संस्करण का समर्थन करने से मेथड **true** लौटाता है। |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## टिप्पणियाँ



निम्न तालिका उन संयोजनों को दिखाती है जो **HasFeature** को **true** लौटाने का कारण बनते हैं। |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
