---
title: "System::Xml::Schema::XmlSchemaSimpleType क्लास"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSimpleType क्लास। XML Schema से सरल सामग्री के लिए simpleType तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास एक सरल प्रकार को परिभाषित करती है। सरल प्रकार C++ में केवल‑पाठ सामग्री वाले गुणों या तत्वों के मान के लिए जानकारी और प्रतिबंध निर्दिष्ट कर सकते हैं।"
type: docs
weight: 6200
url: /hi/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


XML [Schema](../) से सरल सामग्री के लिए **simpleType** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास एक सरल प्रकार को परिभाषित करती है। सरल प्रकार केवल‑पाठ सामग्री वाले गुणों या तत्वों के मान के लिए जानकारी और प्रतिबंध निर्दिष्ट कर सकते हैं।

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Content](./get_content/)() | [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), या [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/) में से एक को लौटाता है। |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), या [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/) में से एक को सेट करता है। |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | [XmlSchemaSimpleType](./) क्लास की नई इंस्टेंस को इनिशियलाइज़ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
