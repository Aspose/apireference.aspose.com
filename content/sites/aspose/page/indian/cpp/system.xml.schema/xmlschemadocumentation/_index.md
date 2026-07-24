---
title: "System::Xml::Schema::XmlSchemaDocumentation class"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaDocumentation class. World Wide Web Consortium (W3C) द्वारा निर्दिष्ट XML Schema से दस्तावेज़ीकरण तत्व का प्रतिनिधित्व करता है। यह क्लास C++ में एनोटेशन के भीतर मनुष्यों द्वारा पढ़ी या उपयोग की जाने वाली जानकारी निर्दिष्ट करती है।"
type: docs
weight: 2500
url: /hi/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


XML [Schema](../) से **documentation** तत्व का प्रतिनिधित्व करता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास **annotation** के भीतर मनुष्यों द्वारा पढ़ी या उपयोग की जाने वाली जानकारी निर्दिष्ट करती है।

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Language](./get_language/)() | **xml:lang** विशेषता लौटाता है। यह सामग्री में उपयोग की गई भाषा का संकेतक के रूप में कार्य करता है। |
| [get_Markup](./get_markup/)() | एक एरे लौटाता है जिसमें [XmlNode](../../system.xml/xmlnode/) वस्तुएँ होती हैं जो दस्तावेज़ीकरण चाइल्ड नोड्स का प्रतिनिधित्व करती हैं। |
| [get_Source](./get_source/)() | सूचना का यूनिफ़ॉर्म रिसोर्स आइडेंटिफ़ायर (URI) स्रोत लौटाता है। |
| [set_Language](./set_language/)(const String\&) | **xml:lang** विशेषता सेट करता है। यह सामग्री में उपयोग की गई भाषा का संकेतक के रूप में कार्य करता है। |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | एक एरे सेट करता है जिसमें [XmlNode](../../system.xml/xmlnode/) वस्तुएँ होती हैं जो दस्तावेज़ीकरण चाइल्ड नोड्स का प्रतिनिधित्व करती हैं। |
| [set_Source](./set_source/)(const String\&) | सूचना का यूनिफ़ॉर्म रिसोर्स आइडेंटिफ़ायर (URI) स्रोत सेट करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
