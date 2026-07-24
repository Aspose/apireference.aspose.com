---
title: "System::Xml::Serialization::XmlSerializer क्लास"
linktitle: "XmlSerializer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Serialization::XmlSerializer क्लास। ऑब्जेक्ट्स को XML दस्तावेज़ों में और उनसे सीरियलाइज़ और डीसीरियलाइज़ करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 600
url: /hi/cpp/system.xml.serialization/xmlserializer/
---
## XmlSerializer class


ऑब्जेक्ट्स को XML दस्तावेज़ों में और उनसे सीरियलाइज़ और डीसीरियलाइज़ करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class XmlSerializer : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [CanDeserialize](./candeserialize/)(System::SharedPtr\<XmlReader\>) | जाँचता है कि विशिष्ट रीडर डीसीरियलाइज़ेबल स्थिति में है या नहीं। |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::Stream\>) | XML दस्तावेज़ को ऑब्जेक्ट में डीसीरियलाइज़ करता है। |
| [Deserialize](./deserialize/)(System::SharedPtr\<IO::TextReader\>) | XML दस्तावेज़ को ऑब्जेक्ट में डीसीरियलाइज़ करता है। |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>) | XML दस्तावेज़ को ऑब्जेक्ट में डीसीरियलाइज़ करता है। |
| [Deserialize](./deserialize/)(System::SharedPtr\<XmlReader\>, String) | XML दस्तावेज़ को ऑब्जेक्ट में डीसीरियलाइज़ करता है। |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>) | दस्तावेज़ को XML में सीरियलाइज़ करता है। |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>) | दस्तावेज़ को XML में सीरियलाइज़ करता है। |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>) | दस्तावेज़ को XML में सीरियलाइज़ करता है। |
| [Serialize](./serialize/)(System::SharedPtr\<IO::Stream\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | दस्तावेज़ को XML में सीरियलाइज़ करता है। |
| [Serialize](./serialize/)(System::SharedPtr\<IO::TextWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | दस्तावेज़ को XML में सीरियलाइज़ करता है। |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>) | दस्तावेज़ को XML में सीरियलाइज़ करता है। |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String) | दस्तावेज़ को XML में सीरियलाइज़ करता है। |
| [Serialize](./serialize/)(System::SharedPtr\<XmlWriter\>, System::SharedPtr\<Object\>, System::SharedPtr\<XmlSerializerNamespaces\>, String, String) | दस्तावेज़ को XML में सीरियलाइज़ करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [EncodingNamespace](./encodingnamespace/) | नेमस्पेस नाम को एन्कोड करना। |
| static [WsdlNamespace](./wsdlnamespace/) | RTTI। |
| static [WsdlTypesNamespace](./wsdltypesnamespace/) | WSDL प्रकारों के नेमस्पेस नाम। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
