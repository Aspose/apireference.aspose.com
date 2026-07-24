---
title: "System::Xml::Schema::XmlSchemaInclude क्लास"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaInclude क्लास। XML Schema से include एलिमेंट को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट है। इस क्लास का उपयोग बाहरी स्कीमा से घोषणाओं और परिभाषाओं को शामिल करने के लिए किया जाता है। शामिल की गई घोषणाएँ और परिभाषाएँ फिर C++ में सम्मिलित स्कीमा के प्रोसेसिंग के लिए उपलब्ध होती हैं।"
type: docs
weight: 3600
url: /hi/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


XML [Schema](../) से **include** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट किया गया है। यह क्लास बाहरी स्कीमा से घोषणाएँ और परिभाषाएँ शामिल करने के लिए उपयोग की जाती है। शामिल घोषणाएँ और परिभाषाएँ फिर कंटेनिंग स्कीमा में प्रोसेसिंग के लिए उपलब्ध होती हैं।

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** मान को लौटाता है। |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** मान को सेट करता है। |
| [XmlSchemaInclude](./xmlschemainclude/)() | नया उदाहरण प्रारंभ करता है [XmlSchemaInclude](./) क्लास का। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
