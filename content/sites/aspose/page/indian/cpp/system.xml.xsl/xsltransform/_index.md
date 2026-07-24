---
title: "System::Xml::Xsl::XslTransform class"
linktitle: "XslTransform"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XslTransform वर्ग। C++ में Extensible Stylesheet Language for Transformations (XSLT) शैली पत्रिका का उपयोग करके XML डेटा को परिवर्तित करता है।"
type: docs
weight: 700
url: /hi/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


Extensible Stylesheet Language for Transformations (XSLT) स्टाइल शीट का उपयोग करके XML डेटा को ट्रांसफ़ॉर्म करता है।

```cpp
class XslTransform : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | XSLT शैली पत्रिका को [XmlReader](../../system.xml/xmlreader/) में लोड करता है। |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XSLT शैली पत्रिका को [XmlReader](../../system.xml/xmlreader/) में लोड करता है। |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | XSLT शैली पत्रिका को IXPathNavigable में लोड करता है। |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XSLT शैली पत्रिका को IXPathNavigable में लोड करता है। |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | XSLT शैली पत्रिका को XPathNavigator में लोड करता है। |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XSLT शैली पत्रिका को XPathNavigator में लोड करता है। |
| [Load](./load/)(const String\&) | URL द्वारा निर्दिष्ट XSLT शैली पत्रिका को लोड करता है। |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | URL द्वारा निर्दिष्ट XSLT शैली पत्रिका को लोड करता है। |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XslTransform::Transform](./transform/) विधि को कॉल किए जाने पर बाहरी संसाधनों को हल करने के लिए उपयोग किए जाने वाले [XmlResolver](../../system.xml/xmlresolver/) को सेट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक [XmlReader](../../system.xml/xmlreader/) में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | XPathNavigator में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक [XmlReader](../../system.xml/xmlreader/) में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator में XML डेटा को निर्दिष्ट args का उपयोग करके परिवर्तित करता है और परिणाम को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | XPathNavigator में XML डेटा को निर्दिष्ट args का उपयोग करके परिवर्तित करता है और परिणाम को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक Stream में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | XPathNavigator में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक Stream में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | XPathNavigator में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक TextWriter में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | XPathNavigator में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक TextWriter में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक [XmlReader](../../system.xml/xmlreader/) में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक [XmlReader](../../system.xml/xmlreader/) में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक TextWriter में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक TextWriter में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक Stream में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक Stream में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक [XmlWriter](../../system.xml/xmlwriter/) में आउटपुट करता है। |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | इनपुट फ़ाइल में XML डेटा को परिवर्तित करता है और परिणाम को आउटपुट फ़ाइल में आउटपुट करता है। |
| [Transform](./transform/)(const String\&, const String\&) | इनपुट फ़ाइल में XML डेटा को परिवर्तित करता है और परिणाम को आउटपुट फ़ाइल में आउटपुट करता है। |
| [XslTransform](./xsltransform/)() | [XslTransform](./) वर्ग का एक नया उदाहरण प्रारंभ करता है। |
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
