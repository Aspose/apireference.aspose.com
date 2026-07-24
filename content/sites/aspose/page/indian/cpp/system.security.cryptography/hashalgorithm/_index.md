---
title: "System::Security::Cryptography::HashAlgorithm क्लास"
linktitle: "HashAlgorithm"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::HashAlgorithm क्लास. हैशिंग एल्गोरिदम के लिए बेस क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 1600
url: /hi/cpp/system.security.cryptography/hashalgorithm/
---
## HashAlgorithm class


हैशिंग एल्गोरिदम के लिए बेस क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HashAlgorithm : public System::Security::Cryptography::ICryptoTransform
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | बफ़र को हैश करता है। |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&, int, int) | बफ़र स्लाइस को हैश करता है। |
| [ComputeHash](./computehash/)(SharedPtr\<IO::Stream\> const\&) | स्ट्रीम को अंत तक पढ़ता है और पढ़े गए डेटा के लिए हैश की गणना करता है। |
| static [Create](./create/)(const String\&) | नाम के आधार पर हैश एल्गोरिदम बनाता है। |
| virtual [get_Hash](./get_hash/)() | गणना किए गए हैश कोड का मान प्राप्त करता है। |
| virtual [get_HashSize](./get_hashsize/)() | गणना किए गए हैश मान का आकार बाइट्स में प्राप्त करता है। |
| [get_InputBlockSize](./get_inputblocksize/)() override | इनपुट ब्लॉक आकार। |
| [get_OutputBlockSize](./get_outputblocksize/)() override | आउटपुट ब्लॉक आकार। |
| virtual [Initialize](./initialize/)() | हैशर को प्रारंभिक स्थिति में रीसेट करता है। |
| [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | डेटा के ब्लॉक को प्रोसेस करता है और डेटा को आउटपुट एरे में कॉपी करता है। |
| [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) override | डेटा के अंतिम ब्लॉक को प्रोसेस करता है और हैश की गणना करता है। |
| virtual [~HashAlgorithm](./~hashalgorithm/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
