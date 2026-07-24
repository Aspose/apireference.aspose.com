---
title: "System::Xml::Schema::XmlSchemaSet क्लास"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSet क्लास। C++ में XML Schema डिफिनिशन लैंग्वेज (XSD) स्कीमा का कैश रखता है।"
type: docs
weight: 5800
url: /hi/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) स्कीमा का कैश रखता है।

```cpp
class XmlSchemaSet : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(String, const String\&) | निर्दिष्ट URL पर XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) स्कीमा को [XmlSchemaSet](./) में जोड़ता है। |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) स्कीमा जो [XmlReader](../../system.xml/xmlreader/) में है, उसे [XmlSchemaSet](./) में जोड़ता है। |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | दिए गए [XmlSchemaSet](./) में सभी XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) स्कीमा को [XmlSchemaSet](./) में जोड़ता है। |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | दिए गए [XmlSchema](../xmlschema/) को [XmlSchemaSet](./) में जोड़ता है। |
| [Compile](./compile/)() | XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) स्कीमा को जो [XmlSchemaSet](./) में जोड़े गए हैं, एक तार्किक स्कीमा में कम्पाइल करता है। |
| [Contains](./contains/)(String) | यह दर्शाता है कि निर्दिष्ट टार्गेट नेमस्पेस URI वाला XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) स्कीमा [XmlSchemaSet](./) में है या नहीं। |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | यह दर्शाता है कि निर्दिष्ट XML [Schema](../) डिफिनिशन लैंग्वेज (XSD) [XmlSchema](../xmlschema/) ऑब्जेक्ट [XmlSchemaSet](./) में है या नहीं। |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | दिए गए इंडेक्स से शुरू करके, सभी [XmlSchema](../xmlschema/) ऑब्जेक्ट को [XmlSchemaSet](./) से दिए गए एरे में कॉपी करता है। |
| [get_CompilationSettings](./get_compilationsettings/)() | वापस करता है [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) को [XmlSchemaSet](./) के लिए। |
| [get_Count](./get_count/)() | वापस करता है [XmlSchemaSet](./) में तार्किक XML [Schema](../) परिभाषा भाषा (XSD) स्कीमाओं की संख्या। |
| [get_GlobalAttributes](./get_globalattributes/)() | वापस करता है सभी वैश्विक गुणधर्म सभी XML [Schema](../) परिभाषा भाषा (XSD) स्कीमाओं में [XmlSchemaSet](./) के भीतर। |
| [get_GlobalElements](./get_globalelements/)() | वापस करता है सभी वैश्विक तत्व सभी XML [Schema](../) परिभाषा भाषा (XSD) स्कीमाओं में [XmlSchemaSet](./) के भीतर। |
| [get_GlobalTypes](./get_globaltypes/)() | वापस करता है सभी वैश्विक सरल और जटिल प्रकार सभी XML [Schema](../) परिभाषा भाषा (XSD) स्कीमाओं में [XmlSchemaSet](./) के भीतर। |
| [get_IsCompiled](./get_iscompiled/)() | वापस करता है एक मान जो दर्शाता है कि क्या XML [Schema](../) परिभाषा भाषा (XSD) स्कीमाओं को [XmlSchemaSet](./) में संकलित किया गया है। |
| [get_NameTable](./get_nametable/)() | वापस करता है डिफ़ॉल्ट [XmlNameTable](../../system.xml/xmlnametable/) जिसे [XmlSchemaSet](./) नई XML [Schema](../) परिभाषा भाषा (XSD) स्कीमाओं को लोड करते समय उपयोग करता है। |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | हटा देता है निर्दिष्ट XML [Schema](../) परिभाषा भाषा (XSD) स्कीमा को [XmlSchemaSet](./) से। |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | हटा देता है निर्दिष्ट XML [Schema](../) परिभाषा भाषा (XSD) स्कीमा और सभी स्कीमाओं को जो वह आयात करता है [XmlSchemaSet](./) से। |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | पुनः प्रक्रिया करता है एक XML [Schema](../) परिभाषा भाषा (XSD) स्कीमा जो पहले से ही [XmlSchemaSet](./) में मौजूद है। |
| [Schemas](./schemas/)() | वापस करता है सभी XML [Schema](../) परिभाषा भाषा (XSD) स्कीमाओं का संग्रह [XmlSchemaSet](./) में। |
| [Schemas](./schemas/)(String) | वापस करता है सभी XML [Schema](../) परिभाषा भाषा (XSD) स्कीमाओं का संग्रह [XmlSchemaSet](./) में जो दिए गए नेमस्पेस से संबंधित हैं। |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | सेट करता है [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) को [XmlSchemaSet](./) के लिए। |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | सेट करता है [XmlResolver](../../system.xml/xmlresolver/) जिसका उपयोग स्कीमा के include और import तत्वों में संदर्भित नेमस्पेस या स्थानों को हल करने के लिए किया जाता है। |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | जोड़ता है एक इवेंट हैंडलर XML [Schema](../) परिभाषा भाषा (XSD) स्कीमा वैलिडेशन त्रुटियों के बारे में जानकारी प्राप्त करने के लिए। |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | हटा देता है एक इवेंट हैंडलर XML [Schema](../) परिभाषा भाषा (XSD) स्कीमा वैलिडेशन त्रुटियों के बारे में जानकारी प्राप्त करने के लिए। |
| [XmlSchemaSet](./xmlschemaset/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaSet](./) क्लास का। |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | एक नया उदाहरण प्रारंभ करता है [XmlSchemaSet](./) क्लास का निर्दिष्ट [XmlNameTable](../../system.xml/xmlnametable/) के साथ। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
