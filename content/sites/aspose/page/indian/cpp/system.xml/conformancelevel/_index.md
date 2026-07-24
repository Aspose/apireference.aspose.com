---
title: "System::Xml::ConformanceLevel एन्‍युम"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::ConformanceLevel एन्‍युम। यह निर्दिष्ट करता है कि C++ में XmlReader और XmlWriter ऑब्जेक्ट कितनी इनपुट या आउटपुट जाँच करते हैं।"
type: docs
weight: 4600
url: /hi/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


[XmlReader](../xmlreader/) और [XmlWriter](../xmlwriter/) ऑब्जेक्ट द्वारा किए जाने वाले इनपुट या आउटपुट जाँच की मात्रा को निर्दिष्ट करता है।

```cpp
enum class ConformanceLevel
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| Auto | 0 | [XmlReader](../xmlreader/) या [XmlWriter](../xmlwriter/) ऑब्जेक्ट स्वचालित रूप से निर्धारित करता है कि दस्तावेज़-स्तर या फ्रैगमेंट-स्तर की जाँच करनी चाहिए, और उपयुक्त जाँच करता है। यदि आप किसी अन्य [XmlReader](../xmlreader/) या [XmlWriter](../xmlwriter/) ऑब्जेक्ट को रैप कर रहे हैं, तो बाहरी ऑब्जेक्ट अतिरिक्त कन्फॉर्मेंस जाँच नहीं करता। कन्फॉर्मेंस जाँच अंतर्निहित ऑब्जेक्ट पर छोड़ दी जाती है। |
| Fragment | 1 | XML डेटा एक [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) है, जैसा कि W3C द्वारा परिभाषित किया गया है। यह कन्फॉर्मेंस स्तर एक ऐसे XML दस्तावेज़ को दर्शाता है जिसमें मूल तत्व नहीं हो सकता है, लेकिन अन्यथा यह सही रूप से निर्मित है। यह जाँच स्तर सुनिश्चित करता है कि पढ़ी या लिखी जा रही स्ट्रीम को कोई भी प्रोसेसर एक [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) के रूप में उपभोग कर सके। |
| Document | 2 | XML डेटा W3C द्वारा परिभाषित एक सही रूप से निर्मित [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) के नियमों का पालन करता है। यह जाँच स्तर सुनिश्चित करता है कि पढ़ी या लिखी जा रही स्ट्रीम को कोई भी प्रोसेसर एक [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) के रूप में उपभोग कर सके। |

## संबंधित देखें

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
