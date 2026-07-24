---
title: "System::Xml::XmlComment क्लास"
linktitle: "XmlComment"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlComment क्लास। C++ में XML टिप्पणी की सामग्री का प्रतिनिधित्व करता है।"
type: docs
weight: 1100
url: /hi/cpp/system.xml/xmlcomment/
---
## XmlComment class


XML टिप्पणी की सामग्री को दर्शाता है।

```cpp
class XmlComment : public System::Xml::XmlCharacterData
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक डुप्लिकेट बनाता है। |
| [get_LocalName](./get_localname/)() override | नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | नोड का क्वालिफाइड नाम लौटाता है। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | नोड के सभी चाइल्ड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। क्योंकि टिप्पणी नोड के कोई चाइल्ड नहीं होते, यह मेथड कोई प्रभाव नहीं डालता। |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | नोड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
