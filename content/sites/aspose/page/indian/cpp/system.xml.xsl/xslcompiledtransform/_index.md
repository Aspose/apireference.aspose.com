---
title: "System::Xml::Xsl::XslCompiledTransform class"
linktitle: "XslCompiledTransform"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XslCompiledTransform क्लास। C++ में XSLT स्टाइल शीट का उपयोग करके XML डेटा को परिवर्तित करता है।"
type: docs
weight: 300
url: /hi/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


XSLT स्टाइल शीट का उपयोग करके XML डेटा को ट्रांसफ़ॉर्म करता है।

```cpp
class XslCompiledTransform : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | स्टाइल शीट के **xsl:output** तत्व से प्राप्त आउटपुट जानकारी वाले एक [XmlWriterSettings](../../system.xml/xmlwritersettings/) ऑब्जेक्ट लौटाता है। |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | [XmlReader](../../system.xml/xmlreader/) में सम्मिलित स्टाइल शीट को संकलित करता है। |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/) में सम्मिलित XSLT स्टाइल शीट को संकलित करता है। [XmlResolver](../../system.xml/xmlresolver/) किसी भी XSLT **import** या **include** तत्व को हल करता है और XSLT सेटिंग्स स्टाइल शीट के लिए अनुमतियों को निर्धारित करती हैं। |
| [Load](./load/)(const String\&) | निर्दिष्ट URI पर स्थित स्टाइल शीट को लोड करता है और संकलित करता है। |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | URI द्वारा निर्दिष्ट XSLT स्टाइल शीट को लोड करता है और संकलित करता है। [XmlResolver](../../system.xml/xmlresolver/) किसी भी XSLT **import** या **include** तत्व को हल करता है और XSLT सेटिंग्स स्टाइल शीट के लिए अनुमतियों को निर्धारित करती हैं। |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | IXPathNavigable ऑब्जेक्ट में निहित शैली पत्रक को संकलित करता है। |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | IXPathNavigable में निहित XSLT शैली पत्रक को संकलित करता है। [XmlResolver](../../system.xml/xmlresolver/) किसी भी XSLT **import** या **include** तत्व को हल करता है और XSLT सेटिंग्स शैली पत्रक के लिए अनुमतियों को निर्धारित करती हैं। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। [XsltArgumentList](../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक TextWriter में आउटपुट करता है। [XsltArgumentList](../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक स्ट्रीम में आउटपुट करता है। [XsltArgumentList](../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है। |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। [XsltArgumentList](../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है। |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक TextWriter में आउटपुट करता है। [XsltArgumentList](../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है। |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक स्ट्रीम में आउटपुट करता है। [XsltArgumentList](../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है। |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | URI द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | URI द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। [XsltArgumentList](../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है। |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | URI द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक TextWriter में आउटपुट करता है। |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | URI द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक स्ट्रीम में आउटपुट करता है। [XsltArgumentList](../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है। |
| [Transform](./transform/)(const String\&, const String\&) | URI द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक फ़ाइल में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | [XmlReader](../../system.xml/xmlreader/) ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। [XsltArgumentList](../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है और [XmlResolver](../../system.xml/xmlresolver/) XSLT **document()** फ़ंक्शन को हल करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | IXPathNavigable ऑब्जेक्ट द्वारा निर्दिष्ट इनपुट दस्तावेज़ का उपयोग करके रूपांतरण को निष्पादित करता है और परिणामों को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। [XsltArgumentList](../xsltargumentlist/) अतिरिक्त रन‑टाइम तर्क प्रदान करता है और [XmlResolver](../../system.xml/xmlresolver/) XSLT **document()** फ़ंक्शन को हल करता है। |
| [XslCompiledTransform](./xslcompiledtransform/)() | [XslCompiledTransform](./) क्लास का नया उदाहरण प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
