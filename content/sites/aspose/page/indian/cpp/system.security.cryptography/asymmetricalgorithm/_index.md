---
title: "System::Security::Cryptography::AsymmetricAlgorithm क्लास"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::AsymmetricAlgorithm क्लास। असममित एन्क्रिप्शन एल्गोरिदम के लिए सारभूत बेस क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें C++ में।"
type: docs
weight: 200
url: /hi/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


असममित एन्क्रिप्शन एल्गोरिदम के लिए सारभूत बेस क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clear](./clear/)() | सभी संसाधनों को मुक्त करता है। |
| static [Create](./create/)() | डिफ़ॉल्ट एल्गोरिदम बनाता है। लागू नहीं किया गया। |
| static [Create](./create/)(const String\&) | नाम द्वारा एल्गोरिदम बनाता है। लागू नहीं किया गया। |
| [Dispose](./dispose/)() override | वर्तमान ऑब्जेक्ट द्वारा स्वामित्व वाले संसाधनों को रिलीज़ करता है। |
| virtual [FromXmlString](./fromxmlstring/)(String) | XML स्ट्रिंग से एल्गोरिदम पैरामीटर पढ़ता है। |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | उपयोग के लिए कुंजी विनिमय एल्गोरिदम प्राप्त करता है। |
| virtual [get_KeySize](./get_keysize/)() | RTTI जानकारी। |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | अनुमत कुंजी आकारों की एरे प्राप्त करता है। |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | उपयोग के लिए हस्ताक्षर एल्गोरिदम प्राप्त करता है। |
| virtual [set_KeySize](./set_keysize/)(int32_t) | कुंजी आकार सेट करता है। |
| virtual [ToXmlString](./toxmlstring/)(bool) | एल्गोरिदम पैरामीटर को XML स्ट्रिंग में लिखता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
