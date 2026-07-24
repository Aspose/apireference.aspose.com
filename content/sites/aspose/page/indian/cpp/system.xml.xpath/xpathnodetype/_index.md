---
title: "System::Xml::XPath::XPathNodeType एन्‍युम"
linktitle: "XPathNodeType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNodeType एन्‍युम। C++ में XPathNavigator क्लास से लौटाए जा सकने वाले XPath नोड प्रकारों को परिभाषित करता है।"
type: docs
weight: 1100
url: /hi/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


[XPath](../) नोड प्रकारों को परिभाषित करता है जो [XPathNavigator](../xpathnavigator/) क्लास से लौटाए जा सकते हैं।

```cpp
enum class XPathNodeType
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| रूट | 0 | XML दस्तावेज़ या नोड ट्री का रूट नोड। |
| Element | 1 | एक तत्व, जैसे **<element>**। |
| Attribute | 2 | एक एट्रिब्यूट, जैसे **id='123'**। |
| नामस्थान | 3 | एक नेमस्पेस, जैसे **xmlns="namespace"**। |
| Text | 4 | एक नोड की टेक्स्ट सामग्री। यह डॉक्यूमेंट [Object](../../system/object/) मॉडल (DOM) [Text](../../system.text/) और CDATA नोड प्रकारों के बराबर है। इसमें कम से कम एक अक्षर होता है। |
| SignificantWhitespace | 5 | एक नोड जिसमें व्हाइटस्पेस कैरेक्टर होते हैं और **xml:space** को **preserve** पर सेट किया गया है। |
| रिक्त स्थान | 6 | एक नोड जिसमें केवल व्हाइटस्पेस कैरेक्टर होते हैं और कोई महत्वपूर्ण व्हाइटस्पेस नहीं होता। व्हाइटस्पेस कैरेक्टर हैं **'\x20'**, **'\x0d'**, **'\x0a'**, **'\x09'**। |
| ProcessingInstruction | 7 | एक प्रोसेसिंग इंस्ट्रक्शन, जैसे **<?pi test?>**। इसमें XML डिक्लेरेशन्स शामिल नहीं हैं, जो [XPathNavigator](../xpathnavigator/) क्लास को दिखाई नहीं देतीं। |
| Comment | 8 | एक टिप्पणी, जैसे ****। |
| All | 9 | किसी भी [XPathNodeType](./) नोड प्रकार। |

## संबंधित देखें

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
