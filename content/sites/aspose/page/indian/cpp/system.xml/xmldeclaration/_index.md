---
title: "System::Xml::XmlDeclaration क्लास"
linktitle: "XmlDeclaration"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDeclaration क्लास। C++ में XML घोषणा नोड <?xml version=''1.0''...?> को दर्शाता है।"
type: docs
weight: 1300
url: /hi/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


XML घोषणा नोड **<?xml version='1.0'...?>** को दर्शाता है।

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक डुप्लिकेट बनाता है। |
| [get_Encoding](./get_encoding/)() | XML दस्तावेज़ के एन्कोडिंग स्तर को लौटाता है। |
| [get_InnerText](./get_innertext/)() override | [XmlDeclaration](./) के संयोजित मानों को लौटाता है। |
| [get_LocalName](./get_localname/)() override | नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | नोड का क्वालिफाइड नाम लौटाता है। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_Standalone](./get_standalone/)() | standalone गुण का मान लौटाता है। |
| [get_Value](./get_value/)() override | [XmlDeclaration](./) का मान लौटाता है। |
| [get_Version](./get_version/)() | दस्तावेज़ का XML संस्करण लौटाता है। |
| [set_Encoding](./set_encoding/)(const String\&) | XML दस्तावेज़ के एन्कोडिंग स्तर को सेट करता है। |
| [set_InnerText](./set_innertext/)(String) override | [XmlDeclaration](./) के संयोजित मानों को सेट करता है। |
| [set_Standalone](./set_standalone/)(const String\&) | standalone गुण का मान सेट करता है। |
| [set_Value](./set_value/)(String) override | [XmlDeclaration](./) का मान सेट करता है। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | नोड के चाइल्ड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। क्योंकि [XmlDeclaration](./) नोड्स के कोई चाइल्ड नहीं होते, यह मेथड कोई प्रभाव नहीं डालता। |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | नोड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
