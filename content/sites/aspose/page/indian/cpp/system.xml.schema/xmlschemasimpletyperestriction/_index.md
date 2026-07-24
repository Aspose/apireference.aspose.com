---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction क्लास"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction क्लास। XML Schema से simple types के लिए restriction तत्व को दर्शाता है जैसा कि World Wide Web Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास C++ में simpleType तत्व को प्रतिबंधित करने के लिए उपयोग की जा सकती है।"
type: docs
weight: 6500
url: /hi/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


XML [Schema](../) से **restriction** तत्व को दर्शाता है जैसा कि World Wide [Web](../../system.web/) Consortium (W3C) द्वारा निर्दिष्ट है। यह क्लास **simpleType** तत्व को प्रतिबंधित करने के लिए उपयोग की जा सकती है।

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_BaseType](./get_basetype/)() | बेस टाइप के बारे में जानकारी लौटाता है। |
| [get_BaseTypeName](./get_basetypename/)() | क्वालिफाइड बेस टाइप का नाम लौटाता है। |
| [get_Facets](./get_facets/)() | एक [Xml](../../system.xml/)[Schema](../) फ़ैसेट लौटाता है। |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | बेस टाइप के बारे में जानकारी सेट करता है। |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | क्वालिफाइड बेस टाइप का नाम सेट करता है। |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaSimpleTypeRestriction](./) वर्ग का। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
