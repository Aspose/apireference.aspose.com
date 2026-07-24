---
title: "System::Xml::XmlEntity class"
linktitle: "XmlEntity"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlEntity क्लास। C++ में <!ENTITY... > जैसी एंटिटी घोषणा का प्रतिनिधित्व करता है।"
type: docs
weight: 1800
url: /hi/cpp/system.xml/xmlentity/
---
## XmlEntity class


एक एंटिटी डिक्लेरेशन को दर्शाता है, जैसे **<!ENTITY... >**।

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक प्रतिलिपि बनाता है। एंटिटी नोड को क्लोन नहीं किया जा सकता। इस मेथड को [XmlEntity](./) ऑब्जेक्ट पर कॉल करने पर एक अपवाद फेंका जाता है। |
| [get_BaseURI](./get_baseuri/)() override | वर्तमान नोड का बेस यूनिफॉर्म रिसोर्स आइडेंटिफ़ायर (URI) लौटाता है। |
| [get_InnerText](./get_innertext/)() override | एंटिटी नोड और उसके सभी चाइल्ड्स के संयोजित मान लौटाता है। |
| [get_InnerXml](./get_innerxml/)() override | इस नोड के चाइल्ड्स का प्रतिनिधित्व करने वाला मार्कअप लौटाता है। |
| [get_IsReadOnly](./get_isreadonly/)() override | एक मान लौटाता है जो दर्शाता है कि नोड केवल-पढ़ने योग्य है या नहीं। |
| [get_LocalName](./get_localname/)() override | नेमस्पेस प्रीफ़िक्स के बिना नोड का नाम लौटाता है। |
| [get_Name](./get_name/)() override | नोड का नाम लौटाता है। |
| [get_NodeType](./get_nodetype/)() override | नोड का प्रकार लौटाता है। |
| [get_NotationName](./get_notationname/)() | इकाई घोषणा पर वैकल्पिक NDATA विशेषता का नाम लौटाता है। |
| [get_OuterXml](./get_outerxml/)() override | इस नोड और इसके सभी बच्चों का प्रतिनिधित्व करने वाला मार्कअप लौटाता है। |
| [get_PublicId](./get_publicid/)() | इकाई घोषणा पर सार्वजनिक पहचानकर्ता का मान लौटाता है। |
| [get_SystemId](./get_systemid/)() | इकाई घोषणा पर सिस्टम पहचानकर्ता का मान लौटाता है। |
| [set_InnerText](./set_innertext/)(String) override | इकाई नोड और उसके सभी बच्चों के संयोजित मान सेट करता है। |
| [set_InnerXml](./set_innerxml/)(String) override | इस नोड के बच्चों का प्रतिनिधित्व करने वाला मार्कअप सेट करता है। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | नोड के सभी बच्चों को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। [XmlEntity](./) नोड्स के लिए, इस विधि का कोई प्रभाव नहीं होता। |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | नोड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। [XmlEntity](./) नोड्स के लिए, इस विधि का कोई प्रभाव नहीं होता। |
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
