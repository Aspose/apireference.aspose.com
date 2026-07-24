---
title: "System::Xml::XPath::XPathNavigator::LookupNamespace method"
linktitle: "LookupNamespace"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::LookupNamespace method. C++ में निर्दिष्ट प्रीफ़िक्स के लिए नेमस्पेस URI लौटाता है।"
type: docs
weight: 4700
url: /hi/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


निर्दिष्ट प्रीफ़िक्स के लिए नेमस्पेस URI लौटाता है।

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| prefix | const String\& | उपसर्ग जिसका नेमस्पेस URI आप हल करना चाहते हैं। डिफ़ॉल्ट नेमस्पेस से मेल करने के लिए, [String::Empty](../../../system/string/empty/) पास करें। |

### ReturnValue

एक [String](../../../system/string/) जिसमें निर्दिष्ट नेमस्पेस प्रीफ़िक्स को सौंपा गया नेमस्पेस URI शामिल है; यदि प्रीफ़िक्स को कोई नेमस्पेस URI नहीं सौंपा गया है तो **nullptr**। लौटाया गया [String](../../../system/string/) एटोमाइज़्ड है।

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
