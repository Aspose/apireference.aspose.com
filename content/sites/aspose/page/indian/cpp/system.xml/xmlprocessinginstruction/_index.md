---
title: "System::Xml::XmlProcessingInstruction class"
linktitle: "XmlProcessingInstruction"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlProcessingInstruction class। एक प्रोसेसिंग इंस्ट्रक्शन का प्रतिनिधित्व करता है, जिसे XML C++ में दस्तावेज़ के टेक्स्ट में प्रोसेसर-विशिष्ट जानकारी रखने के लिए परिभाषित करता है।"
type: docs
weight: 3100
url: /hi/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


प्रोसेसर‑विशिष्ट जानकारी को दस्तावेज़ के पाठ में रखने के लिए XML द्वारा परिभाषित प्रोसेसिंग इंस्ट्रक्शन का प्रतिनिधित्व करता है।

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक डुप्लिकेट बनाता है। |
| [get_Data](./get_data/)() | टार्गेट को छोड़कर प्रोसेसिंग इंस्ट्रक्शन की सामग्री लौटाता है। |
| [get_InnerText](./get_innertext/)() override | नोड और उसके सभी बच्चों के जुड़े हुए मान लौटाता है। |
| [get_LocalName](./get_localname/)() override | नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | नोड का क्वालिफाइड नाम लौटाता है। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_Target](./get_target/)() | प्रोसेसिंग इंस्ट्रक्शन का टार्गेट लौटाता है। |
| [get_Value](./get_value/)() override | नोड का मान लौटाता है। |
| [set_Data](./set_data/)(const String\&) | टार्गेट को छोड़कर प्रोसेसिंग इंस्ट्रक्शन की सामग्री सेट करता है। |
| [set_InnerText](./set_innertext/)(String) override | नोड और उसकी सभी संतानों के संयोजित मान सेट करता है। |
| [set_Value](./set_value/)(String) override | नोड का मान सेट करता है। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | निर्दिष्ट [XmlWriter](../xmlwriter/) में नोड के सभी चाइल्ड को सहेजता है। क्योंकि ProcessingInstruction नोड्स के पास चाइल्ड नहीं होते, यह मेथड कोई प्रभाव नहीं रखता। |
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
