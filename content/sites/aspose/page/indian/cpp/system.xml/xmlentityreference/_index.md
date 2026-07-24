---
title: "System::Xml::XmlEntityReference वर्ग"
linktitle: "XmlEntityReference"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlEntityReference वर्ग। C++ में एक एंटिटी रेफ़रेंस नोड का प्रतिनिधित्व करता है।"
type: docs
weight: 1900
url: /hi/cpp/system.xml/xmlentityreference/
---
## XmlEntityReference class


एक एंटिटी रेफ़रेंस नोड को दर्शाता है।

```cpp
class XmlEntityReference : public System::Xml::XmlLinkedNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक डुप्लिकेट बनाता है। |
| [get_BaseURI](./get_baseuri/)() override | वर्तमान नोड का बेस यूनिफॉर्म रिसोर्स आइडेंटिफ़ायर (URI) लौटाता है। |
| [get_IsReadOnly](./get_isreadonly/)() override | एक मान लौटाता है जो दर्शाता है कि नोड केवल-पढ़ने योग्य है या नहीं। |
| [get_LocalName](./get_localname/)() override | नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | नोड का नाम लौटाता है। |
| [get_NodeType](./get_nodetype/)() override | नोड का प्रकार लौटाता है। |
| [get_Value](./get_value/)() override | नोड का मान लौटाता है। |
| [set_Value](./set_value/)(String) override | नोड का मान सेट करता है। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | नोड के सभी चाइल्ड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
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
