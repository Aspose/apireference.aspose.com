---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion क्लास"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion क्लास. XML स्कीमा से सरल प्रकारों के लिए यूनियन तत्व का प्रतिनिधित्व करता है जैसा कि वर्ल्ड वाइड वेब कंसोर्टियम (W3C) द्वारा निर्दिष्ट किया गया है। एक यूनियन डेटा प्रकार का उपयोग एक simpleType की सामग्री निर्दिष्ट करने के लिए किया जा सकता है। simpleType तत्व का मान यूनियन में निर्दिष्ट वैकल्पिक डेटा प्रकारों के सेट में से कोई भी एक होना चाहिए। यूनियन प्रकार हमेशा व्युत्पन्न प्रकार होते हैं और C++ में कम से कम दो वैकल्पिक डेटा प्रकारों को शामिल करना चाहिए।"
type: docs
weight: 6600
url: /hi/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


XML [Schema](../) से सरल प्रकारों के लिए **union** तत्व का प्रतिनिधित्व करता है जैसा कि वर्ल्ड वाइड [Web](../../system.web/) कंसोर्टियम (W3C) द्वारा निर्दिष्ट किया गया है। एक **union** डेटा प्रकार का उपयोग **simpleType** की सामग्री निर्दिष्ट करने के लिए किया जा सकता है। **simpleType** तत्व का मान यूनियन में निर्दिष्ट वैकल्पिक डेटा प्रकारों के सेट में से कोई भी एक होना चाहिए। यूनियन प्रकार हमेशा व्युत्पन्न प्रकार होते हैं और कम से कम दो वैकल्पिक डेटा प्रकारों को शामिल करना चाहिए।

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | **simpleType** तत्व के प्रकार का प्रतिनिधित्व करने वाले [XmlSchemaSimpleType](../xmlschemasimpletype/) वस्तुओं की एक सरणी लौटाता है, जो सरल प्रकार के [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) और [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) मानों पर आधारित है। |
| [get_BaseTypes](./get_basetypes/)() | बेस प्रकारों का संग्रह लौटाता है। |
| [get_MemberTypes](./get_membertypes/)() | इस स्कीमा में परिभाषित निर्मित डेटा प्रकारों या **simpleType** तत्वों के योग्य सदस्य नामों की सरणी लौटाता है (या निर्दिष्ट नेमस्पेस द्वारा संकेतित किसी अन्य स्कीमा)। |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | इस स्कीमा में परिभाषित निर्मित डेटा प्रकारों या **simpleType** तत्वों के योग्य सदस्य नामों की सरणी सेट करता है (या निर्दिष्ट नेमस्पेस द्वारा संकेतित किसी अन्य स्कीमा)। |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | एक नया उदाहरण प्रारंभ करता है [XmlSchemaSimpleTypeUnion](./) क्लास का। |
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
