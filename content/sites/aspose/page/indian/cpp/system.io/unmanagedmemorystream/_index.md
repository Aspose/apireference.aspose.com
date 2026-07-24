---
title: "System::IO::UnmanagedMemoryStream क्लास"
linktitle: "UnmanagedMemoryStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::UnmanagedMemoryStream क्लास। अनमैनेज्ड मेमोरी तक पहुँच प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2800
url: /hi/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


अनमैनेज्ड मेमोरी तक पहुँच प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Flush](./flush/)() override | कुछ नहीं करता। |
| [get_CanRead](./get_canread/)() const override | निर्धारित करता है कि स्ट्रीम पढ़ने योग्य है या नहीं। |
| [get_CanSeek](./get_canseek/)() const override | निर्धारित करता है कि क्या स्ट्रीम सीकिंग का समर्थन करता है। |
| [get_CanWrite](./get_canwrite/)() const override | निर्धारित करता है कि क्या स्ट्रीम लिखने योग्य है। |
| virtual [get_Capacity](./get_capacity/)() const | अंतर्निहित मेमोरी बफ़र की वर्तमान क्षमता लौटाता है। |
| [get_Length](./get_length/)() const override | स्ट्रीम की लंबाई बाइट्स में लौटाता है। |
| [get_Position](./get_position/)() const override | स्ट्रीम की वर्तमान स्थिति लौटाता है। |
| [get_PositionPointer](./get_positionpointer/)() | लागू नहीं किया गया। |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [Seek](./seek/)(int64_t, SeekOrigin) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की स्थिति सेट करता है। |
| [set_Position](./set_position/)(int64_t) override | स्ट्रीम की स्थिति सेट करता है। |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | लागू नहीं किया गया। |
| [SetLength](./setlength/)(int64_t) override | लागू नहीं किया गया। |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | [UnmanagedMemoryStream](./) का नया इंस्टेंस बनाता है। |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | [UnmanagedMemoryStream](./) का नया इंस्टेंस बनाता है। |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | लागू नहीं किया गया। |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | लागू नहीं किया गया। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Null](../stream/null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## संबंधित देखें

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
