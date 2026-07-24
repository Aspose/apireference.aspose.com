---
title: "System::Security::Cryptography::Xml::XmlDsigC14NTransform क्लास"
linktitle: "XmlDsigC14NTransform"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::Xml::XmlDsigC14NTransform क्लास। टिप्पणियों के बिना डिजिटल सिग्नेचर के लिए C14N XML कैनोनिकलाइज़ेशन ट्रांसफ़ॉर्म का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार को स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन्स को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1400
url: /hi/cpp/system.security.cryptography.xml/xmldsigc14ntransform/
---
## XmlDsigC14NTransform class


टिप्पणियों के बिना डिजिटल सिग्नेचर के लिए C14N XML कैनोनिकलाइज़ेशन ट्रांसफ़ॉर्म का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार को स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन्स को तर्क के रूप में पास करने के लिए करें।

```cpp
class XmlDsigC14NTransform : public System::Security::Cryptography::Xml::Transform
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_InputTypes](./get_inputtypes/)() override |  |
| [get_OutputTypes](./get_outputtypes/)() override |  |
| [GetDigestedOutput](./getdigestedoutput/)(SharedPtr\<HashAlgorithm\>) override |  |
| [GetOutput](./getoutput/)() override |  |
| [GetOutput](./getoutput/)(const TypeInfo\&) override |  |
| [LoadInnerXml](./loadinnerxml/)(SharedPtr\<System::Xml::XmlNodeList\>) override |  |
| [LoadInput](./loadinput/)(SharedPtr\<Object\>) override |  |
| [XmlDsigC14NTransform](./xmldsigc14ntransform/)() |  |
| [XmlDsigC14NTransform](./xmldsigc14ntransform/)(bool) |  |
## संबंधित देखें

* Class [Transform](../transform/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Page for C++](../../)
