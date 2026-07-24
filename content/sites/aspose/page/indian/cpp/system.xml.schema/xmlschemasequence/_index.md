---
title: "System::Xml::Schema::XmlSchemaSequence क्लास"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSequence क्लास। XML Schema से क्रम (कॉम्पोजिटर) तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट किया गया है। क्रम को समूह में तत्वों को निर्दिष्ट क्रम में सम्मिलित तत्व के भीतर प्रकट होना आवश्यक है C++ में।"
type: docs
weight: 5700
url: /hi/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


XML [Schema](../) से **sequence** तत्व (कॉम्पोजिटर) को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट किया गया है। **sequence** को समूह में तत्वों को निर्दिष्ट क्रम में सम्मिलित तत्व के भीतर प्रकट होना आवश्यक है।

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Items](./get_items/)() override | कॉम्पोजिटर के भीतर समाहित तत्व। [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaSequence](./) या [XmlSchemaAny](../xmlschemaany/) का संग्रह। |
| [XmlSchemaSequence](./xmlschemasequence/)() | [XmlSchemaSequence](./) क्लास का नया उदाहरण आरंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
