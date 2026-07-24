---
title: "System::Xml::XmlCharacterData क्लास"
linktitle: "XmlCharacterData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlCharacterData क्लास। C++ में कई क्लासों द्वारा उपयोग की जाने वाली टेक्स्ट हेरफेर विधियों को प्रदान करता है।"
type: docs
weight: 900
url: /hi/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


कई क्लासों द्वारा उपयोग किए जाने वाले टेक्स्ट मैनिपुलेशन मेथड्स प्रदान करता है।

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | निर्दिष्ट स्ट्रिंग को नोड के कैरेक्टर डेटा के अंत में जोड़ता है। |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | नोड से कैरेक्टरों की एक रेंज हटाता है। |
| virtual [get_Data](./get_data/)() | नोड का डेटा लौटाता है। |
| [get_InnerText](./get_innertext/)() override | नोड और उसके सभी चाइल्ड नोड्स के संयोजित मानों को लौटाता है। |
| virtual [get_Length](./get_length/)() | डेटा की लंबाई, अक्षरों में, लौटाता है। |
| [get_Value](./get_value/)() override | नोड का मान लौटाता है। |
| virtual [InsertData](./insertdata/)(int32_t, String) | निर्दिष्ट अक्षर ऑफ़सेट पर निर्दिष्ट स्ट्रिंग डालता है। |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | निर्दिष्ट ऑफ़सेट से शुरू होने वाले निर्दिष्ट संख्या के अक्षरों को निर्दिष्ट स्ट्रिंग से बदलता है। |
| virtual [set_Data](./set_data/)(String) | नोड का डेटा सेट करता है। |
| [set_InnerText](./set_innertext/)(String) override | नोड और उसके सभी चाइल्ड नोड्स के संयोजित मानों को सेट करता है। |
| [set_Value](./set_value/)(String) override | नोड का मान सेट करता है। |
| virtual [Substring](./substring/)(int32_t, int32_t) | निर्दिष्ट रेंज से पूर्ण स्ट्रिंग का उपस्ट्रिंग प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
