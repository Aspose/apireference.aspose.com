---
title: "System::IO::BufferedStream क्लास"
linktitle: "BufferedStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BufferedStream क्लास। किसी अन्य स्ट्रीम के ऊपर एक बफ़रिंग लेयर जोड़ता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1000
url: /hi/cpp/system.io/bufferedstream/
---
## BufferedStream class


किसी अन्य स्ट्रीम के ऊपर एक बफ़रिंग लेयर जोड़ता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class BufferedStream : public System::IO::Stream
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | [BufferedStream](./) ऑब्जेक्ट बनाता है जो निर्दिष्ट स्ट्रीम को लपेटता है और 4096 बाइट लंबा बफ़र उपयोग करता है। |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | [BufferedStream](./) ऑब्जेक्ट बनाता है जो निर्दिष्ट स्ट्रीम को लपेटता है और निर्दिष्ट आकार के बफ़र का उपयोग करता है। |
| [Flush](./flush/)() override | बफ़र की सामग्री को आधारभूत स्ट्रीम में लिखता है। |
| [get_CanRead](./get_canread/)() const override | निर्धारित करता है कि स्ट्रीम पढ़ने योग्य है या नहीं। |
| [get_CanSeek](./get_canseek/)() const override | निर्धारित करता है कि क्या स्ट्रीम सीकिंग का समर्थन करता है। |
| [get_CanWrite](./get_canwrite/)() const override | निर्धारित करता है कि क्या स्ट्रीम लिखने योग्य है। |
| [get_Length](./get_length/)() const override | स्ट्रीम की लंबाई लौटाता है। |
| [get_Position](./get_position/)() const override | स्ट्रीम की वर्तमान स्थिति लौटाता है। |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | आधारभूत स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | आधारभूत स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [ReadByte](./readbyte/)() override | आधारभूत स्ट्रीम से एक बाइट पढ़ता है और पढ़े गए बाइट के मान के बराबर 32-बिट पूर्णांक मान लौटाता है। |
| [Seek](./seek/)(int64_t, SeekOrigin) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की स्थिति सेट करता है। |
| [set_Position](./set_position/)(int64_t) override | बफ़र को आधारभूत स्ट्रीम में फ़्लश करता है और फिर स्ट्रीम की स्थिति सेट करता है। |
| [SetLength](./setlength/)(int64_t) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की लंबाई सेट करता है। |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-श्रेणी को आधारभूत स्ट्रीम में लिखता है। |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-श्रेणी को आधारभूत स्ट्रीम में लिखता है। |
| [WriteByte](./writebyte/)(uint8_t) override | निर्दिष्ट अनसाइनड 8-बिट पूर्णांक मान को आधारभूत स्ट्रीम में लिखता है। |
| virtual [~BufferedStream](./~bufferedstream/)() | डिस्ट्रक्टर। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Null](../stream/null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## संबंधित देखें

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
