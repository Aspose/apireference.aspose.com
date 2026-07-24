---
title: "System::IConvertible क्लास"
linktitle: "IConvertible"
second_title: "Aspose.Page C++ के लिए"
description: "System::IConvertible क्लास। यह मेथड्स परिभाषित करता है जो लागू करने वाले रेफ़रेंस या वैल्यू टाइप के मान को एक समान भाषा रनटाइम टाइप में परिवर्तित करते हैं जिसका समकक्ष मान हो। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 3400
url: /hi/cpp/system/iconvertible/
---
## IConvertible class


वह मेथड्स परिभाषित करता है जो लागू करने वाले रेफ़रेंस या वैल्यू टाइप के मान को एक समान भाषा रनटाइम टाइप में परिवर्तित करते हैं जिसका समकक्ष मान हो। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class IConvertible : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | इस इंस्टेंस के लिए टाइप कोड लौटाता है। |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष [Boolean](../boolean/) मान में परिवर्तित करता है। |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष 8‑bit uint32_teger में परिवर्तित करता है। |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष Unicode अक्षर में परिवर्तित करता है। |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष [System::DateTime](../datetime/) में परिवर्तित करता है। |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष [System::Decimal](../decimal/) संख्या में परिवर्तित करता है। |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष डबल‑प्रिसिजन फ्लोटिंग‑पॉइंट संख्या में परिवर्तित करता है। |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष 16‑bit साइन्ड इंटीजर में परिवर्तित करता है। |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष 32‑bit साइन्ड इंटीजर में परिवर्तित करता है। |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष 64‑bit साइन्ड इंटीजर में परिवर्तित करता है। |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष 8‑bit साइन्ड इंटीजर में परिवर्तित करता है। |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष सिंगल‑प्रिसिजन फ्लोटिंग‑पॉइंट संख्या में परिवर्तित करता है। |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष [System::String](../string/) में परिवर्तित करता है। |
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](../object/tostring/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को निर्दिष्ट System::Type के [System::Object](../object/) में परिवर्तित करता है, जिसका समकक्ष मान हो। |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | निर्दिष्ट सांस्कृतिक‑विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके इस इंस्टेंस के मान को समकक्ष 16‑bit uint32_teger में परिवर्तित करता है। |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | इस उदाहरण के मान को निर्दिष्ट सांस्कृतिक-विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके समकक्ष 32-बिट uint32_teger में परिवर्तित करता है। |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | इस उदाहरण के मान को निर्दिष्ट सांस्कृतिक-विशिष्ट फ़ॉर्मेटिंग जानकारी का उपयोग करके समकक्ष 64-बिट uint32_teger में परिवर्तित करता है। |
## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
