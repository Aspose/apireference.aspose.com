---
title: "System::Xml::Schema::XmlSchemaImport क्लास"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaImport क्लास। XML Schema से आयात तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास C++ में अन्य स्कीमा से स्कीमा घटकों को आयात करने के लिए उपयोग की जाती है।"
type: docs
weight: 3500
url: /hi/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


XML [Schema](../) से **import** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास अन्य स्कीमा से स्कीमा घटकों को आयात करने के लिए उपयोग की जाती है।

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** मान को लौटाता है। |
| [get_Namespace](./get_namespace/)() | आयातित स्कीमा के लक्ष्य नेमस्पेस को Uniform Resource Identifier (URI) संदर्भ के रूप में लौटाता है। |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** मान को सेट करता है। |
| [set_Namespace](./set_namespace/)(const String\&) | आयातित स्कीमा के लक्ष्य नेमस्पेस को Uniform Resource Identifier (URI) संदर्भ के रूप में सेट करता है। |
| [XmlSchemaImport](./xmlschemaimport/)() | [XmlSchemaImport](./) क्लास की नई इंस्टेंस को इनिशियलाइज़ करता है। |
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
