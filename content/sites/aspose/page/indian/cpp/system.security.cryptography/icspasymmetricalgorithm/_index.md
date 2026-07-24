---
title: "System::Security::Cryptography::ICspAsymmetricAlgorithm क्लास"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::ICspAsymmetricAlgorithm क्लास। असिमेट्रिक एल्गोरिद्म बेस क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2100
url: /hi/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


असिमेट्रिक एल्गोरिद्म बेस क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | कुंजी जानकारी के साथ ब्लॉब निर्यात करता है। |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | RTTI जानकारी। |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | डेटा ब्लॉब से कुंजी जानकारी आयात करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
