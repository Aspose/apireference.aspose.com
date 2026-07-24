---
title: "System::Security::Cryptography::ToBase64Transform क्लास"
linktitle: "ToBase64Transform"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::ToBase64Transform क्लास। CryptoStream क्लास की इंस्टेंस को बेस 64 में परिवर्तित करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 5000
url: /hi/cpp/system.security.cryptography/tobase64transform/
---
## ToBase64Transform class


[CryptoStream](../cryptostream/) क्लास की इंस्टेंस को बेस 64 में परिवर्तित करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ToBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clear](./clear/)() | सभी संसाधनों को मुक्त करता है। |
| [Dispose](./dispose/)() | वर्तमान ऑब्जेक्ट द्वारा प्राप्त ऑपरेटिंग सिस्टम संसाधनों को रिलीज़ करता है। |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | एक मान प्राप्त करता है जो दर्शाता है कि वर्तमान ट्रांसफ़ॉर्म को पुन: उपयोग किया जा सकता है या नहीं। |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | एक मान प्राप्त करता है जो दर्शाता है कि कई ब्लॉकों को ट्रांसफ़ॉर्म किया जा सकता है या नहीं। |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | इनपुट ब्लॉक आकार। |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | आउटपुट ब्लॉक आकार। |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) | डेटा के ब्लॉक को प्रोसेस करता है और डेटा को आउटपुट एरे में कॉपी करता है। |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | डेटा के अंतिम ब्लॉक को प्रोसेस करता है और आउटपुट मान की गणना करता है। |
| virtual [~ToBase64Transform](./~tobase64transform/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
