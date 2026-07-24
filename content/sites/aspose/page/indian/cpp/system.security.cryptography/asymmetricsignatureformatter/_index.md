---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter क्लास"
linktitle: "AsymmetricSignatureFormatter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter क्लास। असिमेट्रिक सिग्नेचर फ़ॉर्मेटर्स के लिए बेस क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 400
url: /hi/cpp/system.security.cryptography/asymmetricsignatureformatter/
---
## AsymmetricSignatureFormatter class


असिमेट्रिक सिग्नेचर फ़ॉर्मेटर्स के लिए बेस क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class AsymmetricSignatureFormatter : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) | RTTI जानकारी। |
| virtual [CreateSignature](./createsignature/)(System::SharedPtr\<HashAlgorithm\>) | निर्दिष्ट हैश मान के लिए हस्ताक्षर बनाता है। |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | उपयोग करने के लिए हैश एल्गोरिद्म सेट करता है। |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | हस्ताक्षर की गणना करते समय उपयोग करने के लिए असिमेट्रिक एल्गोरिद्म सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
