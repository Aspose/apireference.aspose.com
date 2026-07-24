---
title: "System::Xml::XmlDocumentType क्लास"
linktitle: "XmlDocumentType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDocumentType क्लास। C++ में दस्तावेज़ प्रकार घोषणा का प्रतिनिधित्व करता है।"
type: docs
weight: 1600
url: /hi/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


डॉक्यूमेंट टाइप डिक्लेरेशन को दर्शाता है।

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक डुप्लिकेट बनाता है। |
| [get_Entities](./get_entities/)() | दस्तावेज़ प्रकार घोषणा में घोषित [XmlEntity](../xmlentity/) नोड्स का संग्रह लौटाता है। |
| [get_InternalSubset](./get_internalsubset/)() | DOCTYPE घोषणा पर दस्तावेज़ प्रकार परिभाषा (DTD) के आंतरिक उपसमुच्चय का मान लौटाता है। |
| [get_IsReadOnly](./get_isreadonly/)() override | एक मान लौटाता है जो दर्शाता है कि नोड केवल-पढ़ने योग्य है या नहीं। |
| [get_LocalName](./get_localname/)() override | नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | नोड का क्वालिफाइड नाम लौटाता है। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_Notations](./get_notations/)() | दस्तावेज़ प्रकार घोषणा में मौजूद [XmlNotation](../xmlnotation/) नोड्स का संग्रह लौटाता है। |
| [get_PublicId](./get_publicid/)() | DOCTYPE घोषणा पर सार्वजनिक पहचानकर्ता (public identifier) का मान लौटाता है। |
| [get_SystemId](./get_systemid/)() | DOCTYPE घोषणा पर सिस्टम पहचानकर्ता (system identifier) का मान लौटाता है। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | निर्दिष्ट [XmlWriter](../xmlwriter/) में नोड के सभी बच्चों को सहेजता है। [XmlDocumentType](./) नोड्स के लिए, इस मेथड का कोई प्रभाव नहीं होता। |
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
