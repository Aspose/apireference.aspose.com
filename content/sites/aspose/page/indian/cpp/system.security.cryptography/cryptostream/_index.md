---
title: "System::Security::Cryptography::CryptoStream वर्ग"
linktitle: "CryptoStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::CryptoStream वर्ग। एक स्ट्रीम कार्यान्वयन जो मौजूदा स्ट्रीम को एक क्रिप्टोग्राफिक फ़ंक्शन के साथ लपेटता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें C++ में।"
type: docs
weight: 500
url: /hi/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


क्रिप्टोग्राफिक फ़ंक्शन के साथ मौजूदा स्ट्रीम को लपेटने वाला स्ट्रीम कार्यान्वयन। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class CryptoStream : public System::IO::Stream
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() override | कनेक्शन बंद करता है। |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | निर्माता। |
| [Flush](./flush/)() override | बफ़र को लिपटे हुए स्ट्रीम में खाली करता है। कुछ नहीं करता क्योंकि ट्रांसफ़ॉर्म एल्गोरिदम अभी भी अधिक डेटा की प्रतीक्षा कर सकता है। |
| [FlushFinalBlock](./flushfinalblock/)() | बफ़र में अभी भी मौजूद डेटा को स्ट्रीम में लिखता है। |
| [get_CanRead](./get_canread/)() const override | जाँचता है कि स्ट्रीम पढ़ने योग्य है या नहीं। |
| [get_CanSeek](./get_canseek/)() const override | जाँचता है कि स्ट्रीम सीक करने योग्य है या नहीं। |
| [get_CanWrite](./get_canwrite/)() const override | जाँचता है कि स्ट्रीम लिखने योग्य है या नहीं। |
| [get_Length](./get_length/)() const override | स्ट्रीम की लंबाई प्राप्त करता है। समर्थित नहीं है। |
| [get_Position](./get_position/)() const override | स्ट्रीम में वर्तमान स्थिति प्राप्त करता है। समर्थित नहीं है। |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से डेटा पढ़ता है। |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से डेटा पढ़ता है। |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | स्ट्रीम में स्थिति खोजता है। समर्थित नहीं है। |
| [set_Position](./set_position/)(int64_t) override | स्ट्रीम में स्थिति खोजता है। समर्थित नहीं है। |
| [SetLength](./setlength/)(int64_t) override | स्ट्रीम का आकार खोजता है। समर्थित नहीं है। |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | डेटा को स्ट्रीम में लिखता है। |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | डेटा को स्ट्रीम में लिखता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Null](../../system.io/stream/null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## संबंधित देखें

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
