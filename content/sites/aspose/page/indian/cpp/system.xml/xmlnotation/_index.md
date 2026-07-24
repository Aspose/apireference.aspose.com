---
title: "System::Xml::XmlNotation क्लास"
linktitle: "XmlNotation"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNotation क्लास। एक नोटेशन घोषणा का प्रतिनिधित्व करता है, जैसे C++ में <!NOTATION... >।"
type: docs
weight: 2900
url: /hi/cpp/system.xml/xmlnotation/
---
## XmlNotation class


**<!NOTATION... >** जैसी नोटेशन घोषणा का प्रतिनिधित्व करता है।

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | इस नोड की एक प्रतिलिपि बनाता है। नोटेशन नोड्स को क्लोन नहीं किया जा सकता। इस मेथड को [XmlNotation](./) ऑब्जेक्ट पर कॉल करने पर अपवाद फेंका जाता है। |
| [get_InnerXml](./get_innerxml/)() override | इस नोड के चाइल्ड्स का प्रतिनिधित्व करने वाला मार्कअप लौटाता है। |
| [get_IsReadOnly](./get_isreadonly/)() override | एक मान लौटाता है जो दर्शाता है कि नोड केवल-पढ़ने योग्य है या नहीं। |
| [get_LocalName](./get_localname/)() override | वर्तमान नोड का नाम बिना नेमस्पेस उपसर्ग के लौटाता है। |
| [get_Name](./get_name/)() override | वर्तमान नोड का नाम लौटाता है। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_OuterXml](./get_outerxml/)() override | इस नोड और इसके सभी बच्चों का प्रतिनिधित्व करने वाला मार्कअप लौटाता है। |
| [get_PublicId](./get_publicid/)() | नोटेशन घोषणा पर सार्वजनिक पहचानकर्ता का मान लौटाता है। |
| [get_SystemId](./get_systemid/)() | नोटेशन घोषणा पर सिस्टम पहचानकर्ता का मान लौटाता है। |
| [set_InnerXml](./set_innerxml/)(String) override | इस नोड के बच्चों का प्रतिनिधित्व करने वाला मार्कअप सेट करता है। |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | नोड के बच्चों को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। यह मेथड [XmlNotation](./) नोड्स पर कोई प्रभाव नहीं डालता है। |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | नोड को निर्दिष्ट [XmlWriter](../xmlwriter/) में सहेजता है। यह मेथड [XmlNotation](./) नोड्स पर कोई प्रभाव नहीं डालता है। |
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
