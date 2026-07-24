---
title: "System::Xml::Schema::XmlSchemaSimpleContent क्लास"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSimpleContent क्लास। XML Schema द्वारा निर्दिष्ट simpleContent तत्व को दर्शाता है, जैसा कि World Wide Web Consortium (W3C) द्वारा परिभाषित है। यह क्लास C++ में सरल और जटिल प्रकारों के लिए सरल कंटेंट मॉडल के साथ है।"
type: docs
weight: 5900
url: /hi/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


XML [Schema](../) से **simpleContent** तत्व को दर्शाता है, जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास सरल और जटिल प्रकारों के लिए सरल कंटेंट मॉडल के साथ है।

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Content](./get_content/)() override | वापस देता है [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) या [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/) में से एक। |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | वापस देता है [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) या [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/) में से एक। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
