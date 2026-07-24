---
title: "System::Xml::XPath::XPathDocument क्लास"
linktitle: "XPathDocument"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathDocument क्लास। यह XPath डेटा मॉडल का उपयोग करके C++ में XML दस्तावेज़ का तेज़, केवल‑पढ़ने योग्य, इन‑मेमोरी प्रतिनिधित्व प्रदान करता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml.xpath/xpathdocument/
---
## XPathDocument class


XPath डेटा मॉडल का उपयोग करके XML दस्तावेज़ का तेज़, केवल‑पढ़ने योग्य, इन‑मेमोरी प्रतिनिधित्व प्रदान करता है।

```cpp
class XPathDocument : public System::Xml::XPath::IXPathNavigable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CreateNavigator](./createnavigator/)() override | इस [XPathDocument](./) में नोड्स के माध्यम से नेविगेट करने के लिए एक केवल‑पढ़ने योग्य [XPathNavigator](../xpathnavigator/) ऑब्जेक्ट को प्रारंभ करता है। |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&) | निर्दिष्ट [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट में मौजूद XML डेटा से [XPathDocument](./) क्लास की एक नई इंस्टेंस को प्रारंभ करता है। |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<XmlReader\>\&, XmlSpace) | निर्दिष्ट व्हाइट‑स्पेस हैंडलिंग के साथ, निर्दिष्ट [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट में मौजूद XML डेटा से [XPathDocument](./) क्लास की एक नई इंस्टेंस को प्रारंभ करता है। |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::TextReader\>\&) | निर्दिष्ट TextReader ऑब्जेक्ट में मौजूद XML डेटा से [XPathDocument](./) क्लास की एक नई इंस्टेंस को प्रारंभ करता है। |
| [XPathDocument](./xpathdocument/)(const SharedPtr\<IO::Stream\>\&) | निर्दिष्ट Stream ऑब्जेक्ट में मौजूद XML डेटा से [XPathDocument](./) क्लास की एक नई इंस्टेंस को प्रारंभ करता है। |
| [XPathDocument](./xpathdocument/)(const String\&) | निर्दिष्ट फ़ाइल में मौजूद XML डेटा से [XPathDocument](./) क्लास की एक नई इंस्टेंस को प्रारंभ करता है। |
| [XPathDocument](./xpathdocument/)(const String\&, XmlSpace) | निर्दिष्ट व्हाइट‑स्पेस हैंडलिंग के साथ, निर्दिष्ट फ़ाइल में मौजूद XML डेटा से [XPathDocument](./) क्लास की एक नई इंस्टेंस को प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [IXPathNavigable](../ixpathnavigable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
