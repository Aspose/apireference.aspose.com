---
title: "System::IO::MemoryStream class"
linktitle: "MemoryStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::MemoryStream class. यह एक स्ट्रीम का प्रतिनिधित्व करता है जो मेमोरी से पढ़ती और लिखती है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन के तर्क के रूप में पास करें।"
type: docs
weight: 1800
url: /hi/cpp/system.io/memorystream/
---
## MemoryStream class


मेमोरी से पढ़ने और लिखने वाली एक स्ट्रीम का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class MemoryStream : public System::IO::Stream
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() override | स्ट्रीम को बंद करता है। |
| [Flush](./flush/)() override | कुछ नहीं करता। |
| [get_CanRead](./get_canread/)() const override | निर्धारित करता है कि स्ट्रीम पढ़ने योग्य है या नहीं। |
| [get_CanSeek](./get_canseek/)() const override | निर्धारित करता है कि क्या स्ट्रीम सीकिंग का समर्थन करता है। |
| [get_CanWrite](./get_canwrite/)() const override | निर्धारित करता है कि क्या स्ट्रीम लिखने योग्य है। |
| [get_Capacity](./get_capacity/)() | अंतर्निहित मेमोरी बफ़र की वर्तमान क्षमता लौटाता है। |
| [get_Length](./get_length/)() const override | स्ट्रीम की लंबाई बाइट्स में लौटाता है। |
| [get_Position](./get_position/)() const override | स्ट्रीम की वर्तमान स्थिति लौटाता है। |
| virtual [GetBuffer](./getbuffer/)() | अधोस्त बफ़र का पॉइंटर लौटाता है। |
| [MemoryStream](./memorystream/)() | शुरुआती क्षमता 0 के बराबर के साथ [MemoryStream](./) क्लास का एक नया इंस्टेंस बनाता है। |
| [MemoryStream](./memorystream/)(int) | निर्दिष्ट आकार के मेमोरी बफ़र पर आधारित एक स्ट्रीम का प्रतिनिधित्व करने वाले [MemoryStream](./) क्लास का एक नया इंस्टेंस बनाता है। |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | निर्दिष्ट मेमोरी बफ़र से जुड़ी एक मेमोरी स्ट्रीम का प्रतिनिधित्व करने वाले [MemoryStream](./) क्लास का एक नया इंस्टेंस बनाता है। एक पैरामीटर यह निर्दिष्ट करता है कि स्ट्रीम लिखने योग्य है या नहीं। |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | निर्दिष्ट मेमोरी बफ़र के एक खंड से जुड़ी, निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को शामिल करने वाली मेमोरी स्ट्रीम का प्रतिनिधित्व करने वाले [MemoryStream](./) क्लास का एक नया इंस्टेंस बनाता है। पैरामीटर यह निर्दिष्ट करता है कि स्ट्रीम लिखने योग्य है और क्या GetBytes() मेथड को कॉल किया जा सकता है। |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [ReadByte](./readbyte/)() override | स्ट्रीम से एक बाइट पढ़ता है और पढ़े गए बाइट के मान के बराबर 32-बिट पूर्णांक मान लौटाता है। |
| [Seek](./seek/)(int64_t, SeekOrigin) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की स्थिति सेट करता है। |
| [set_Capacity](./set_capacity/)(int) | अधोस्त मेमोरी बफ़र की क्षमता सेट करता है। |
| [set_Position](./set_position/)(int64_t) override | स्ट्रीम की स्थिति सेट करता है। |
| [SetLength](./setlength/)(int64_t) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की लंबाई सेट करता है। |
| virtual [ToArray](./toarray/)() | अधोस्त मेमोरी बफ़र की एक कॉपी बाइट्स की एरे के रूप में लौटाता है। |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | उस अनसाइनड बाइट्स की एरे लौटाता है जिससे यह स्ट्रीम बनाई गई थी। |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| [WriteByte](./writebyte/)(uint8_t) override | निर्दिष्ट अनसाइनड 8-बिट पूर्णांक मान को स्ट्रीम में लिखता है। |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | अधोस्त बफ़र की सामग्री को निर्दिष्ट स्ट्रीम में लिखता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Null](../stream/null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | स्वयं के लिए एक साझा पॉइंटर का उपनाम है। |
## संबंधित देखें

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
