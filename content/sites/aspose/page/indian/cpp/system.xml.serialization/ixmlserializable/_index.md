---
title: "System::Xml::Serialization::IXmlSerializable class"
linktitle: "IXmlSerializable"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Serialization::IXmlSerializable class. XML सीरियलाइज़ेशन और डीसीरियलाइज़ेशन के लिए कस्टम फॉर्मेटिंग प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में आर्ग्यूमेंट के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


XML सीरियलाइज़ेशन और डीसीरियलाइज़ेशन के लिए कस्टम फॉर्मेटिंग प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class IXmlSerializable : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [GetSchema](./getschema/)() | [WriteXml()](./writexml/) मेथड द्वारा लौटाए गए और [ReadXml()](./readxml/) मेथड द्वारा स्वीकार किए गए ऑब्जेक्ट की XML प्रतिनिधित्व का वर्णन करने वाला एक XmlSchema ऑब्जेक्ट। |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | ऑब्जेक्ट को उसकी XML प्रतिनिधित्व से डीसीरियलाइज़ करता है। |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | वर्तमान ऑब्जेक्ट को XML प्रतिनिधित्व में सीरियलाइज़ करता है। |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
