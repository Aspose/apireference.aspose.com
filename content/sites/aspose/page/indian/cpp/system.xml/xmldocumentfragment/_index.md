---
title: "System::Xml::XmlDocumentFragment क्लास"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDocumentFragment क्लास। एक हल्का ऑब्जेक्ट दर्शाता है जो C++ में ट्री इन्सर्ट ऑपरेशन्स के लिए उपयोगी है।"
type: docs
weight: 1500
url: /hi/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


ट्री इन्सर्ट ऑपरेशन्स के लिए उपयोगी एक हल्का ऑब्जेक्ट दर्शाता है।

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक डुप्लिकेट बनाता है। |
| [get_InnerXml](./get_innerxml/)() override | इस नोड के चाइल्ड्स का प्रतिनिधित्व करने वाला मार्कअप लौटाता है। |
| [get_LocalName](./get_localname/)() override | नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | नोड का क्वालिफाइड नाम लौटाता है। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_OwnerDocument](./get_ownerdocument/)() override | इस नोड से संबंधित [XmlDocument](../xmldocument/) लौटाता है। |
| [set_InnerXml](./set_innerxml/)(String) override | इस नोड के बच्चों का प्रतिनिधित्व करने वाला मार्कअप सेट करता है। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | नोड के सभी चाइल्ड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | नोड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
