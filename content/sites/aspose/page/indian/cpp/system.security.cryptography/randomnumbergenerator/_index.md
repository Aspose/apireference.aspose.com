---
title: "System::Security::Cryptography::RandomNumberGenerator क्लास"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RandomNumberGenerator क्लास। रैंडम नंबर जेनरेटर के लिए विरासत में लेने हेतु एक अमूर्त क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 2600
url: /hi/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


रैंडम नंबर जेनरेटर के लिए विरासत में लेने हेतु एक अमूर्त क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Create](./create/)() | क्रिप्टोग्राफिक रैंडम नंबर जेनरेटर की डिफ़ॉल्ट कार्यान्वयन का एक उदाहरण बनाता है जिसे रैंडम डेटा उत्पन्न करने के लिए उपयोग किया जा सकता है। लागू नहीं किया गया। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | मौजूदा एरे तत्वों को रैंडम बाइट्स से भरता है। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | मौजूदा एरे स्लाइस को रैंडम बाइट्स से भरता है। |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | मौजूदा एरे व्यू तत्वों को रैंडम बाइट्स से भरता है। |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | मौजूदा एरे व्यू स्लाइस को रैंडम बाइट्स से भरता है। |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | मौजूदा स्टैक एरे तत्वों को रैंडम बाइट्स से भरता है। |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | मौजूदा स्टैक एरे स्लाइस को रैंडम बाइट्स से भरता है। |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | मौजूदा एरे तत्वों को रैंडम शून्य-रहित बाइट्स से भरता है। |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | मौजूदा एरे व्यू तत्वों को रैंडम शून्य-रहित बाइट्स से भरता है। |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | मौजूदा स्टैक एरे तत्वों को रैंडम शून्य-रहित बाइट्स से भरता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
