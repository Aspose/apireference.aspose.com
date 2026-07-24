---
title: "System::IO::Stream क्लास"
linktitle: "Stream"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::Stream क्लास। विभिन्न स्ट्रीम कार्यान्वयनों के लिए एक बेस क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2100
url: /hi/cpp/system.io/stream/
---
## Stream class


विभिन्न स्ट्रीम कार्यान्वयनों के लिए एक बेस क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class Stream : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | एक असिंक्रोनस रीड ऑपरेशन शुरू करता है। |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | एक असिंक्रोनस राइट ऑपरेशन शुरू करता है। |
| virtual [Close](./close/)() | स्ट्रीम को बंद करता है। |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | निर्दिष्ट स्ट्रीम में बाइट्स की प्रतिलिपि बनाता है। |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | निर्दिष्ट बफ़र आकार का उपयोग करके, निर्दिष्ट स्ट्रीम में बाइट्स की प्रतिलिपि बनाता है। |
| [Dispose](./dispose/)() override | वर्तमान ऑब्जेक्ट द्वारा उपयोग किए गए सभी संसाधनों को मुक्त करता है और स्ट्रीम को बंद करता है। |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | निर्दिष्ट असिंक्रोनस रीड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | एक असिंक्रोनस राइट ऑपरेशन समाप्त करता है। निर्दिष्ट असिंक्रोनस राइट ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| virtual [Flush](./flush/)() | इस स्ट्रीम के बफ़र को साफ़ करता है और सभी बफ़र किए गए डेटा को अंतर्निहित स्टोरेज में लिखता है। |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | असिंक्रोनस रूप से इस स्ट्रीम के सभी बफ़र साफ़ करता है, बफ़र किए गए डेटा को आधारभूत डिवाइस में लिखवाता है, और रद्दीकरण अनुरोधों की निगरानी करता है। |
| [FlushAsync](./flushasync/)() | असिंक्रोनस रूप से इस स्ट्रीम के सभी बफ़र साफ़ करता है, बफ़र किए गए डेटा को आधारभूत डिवाइस में लिखवाता है, और रद्दीकरण अनुरोधों की निगरानी करता है। |
| virtual [get_CanRead](./get_canread/)() const | निर्धारित करता है कि स्ट्रीम पढ़ने योग्य है या नहीं। |
| virtual [get_CanSeek](./get_canseek/)() const | निर्धारित करता है कि क्या स्ट्रीम सीकिंग का समर्थन करता है। |
| virtual [get_CanTimeout](./get_cantimeout/)() const | एक मान प्राप्त करता है जो निर्धारित करता है कि क्या वर्तमान स्ट्रीम टाइम‑आउट हो सकता है। |
| virtual [get_CanWrite](./get_canwrite/)() const | निर्धारित करता है कि क्या स्ट्रीम लिखने योग्य है। |
| virtual [get_Length](./get_length/)() const | स्ट्रीम की लंबाई बाइट्स में लौटाता है। |
| virtual [get_Position](./get_position/)() const | स्ट्रीम की वर्तमान स्थिति लौटाता है। |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | एक मान मिलिसेकंड में प्राप्त करता है जो निर्धारित करता है कि टाइम‑आउट होने से पहले स्ट्रीम कितनी देर तक पढ़ने का प्रयास करेगा। |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | एक मान प्राप्त करता है, मिलीसेकंड में, जो निर्धारित करता है कि टाइमआउट होने से पहले स्ट्रीम लिखने का प्रयास कितनी देर तक करेगा। |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | असिंक्रोनस रूप से वर्तमान स्ट्रीम से बाइट्स की क्रमिकता पढ़ता है, पढ़े गए बाइट्स की संख्या से स्ट्रीम में स्थिति को आगे बढ़ाता है, और रद्दीकरण अनुरोधों की निगरानी करता है। |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | असिंक्रोनस रूप से वर्तमान स्ट्रीम से बाइट्स की क्रमिकता पढ़ता है, पढ़े गए बाइट्स की संख्या से स्ट्रीम में स्थिति को आगे बढ़ाता है, और रद्दीकरण अनुरोधों की निगरानी करता है। |
| virtual [ReadByte](./readbyte/)() | स्ट्रीम से एक बाइट पढ़ता है और पढ़े गए बाइट के मान के बराबर 32-बिट पूर्णांक मान लौटाता है। |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की स्थिति सेट करता है। |
| virtual [set_Position](./set_position/)(int64_t) | स्ट्रीम की स्थिति सेट करता है। |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | एक मान सेट करता है जो निर्धारित करता है कि वर्तमान स्ट्रीम टाइमआउट हो सकता है या नहीं। |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | एक मान सेट करता है, मिलीसेकंड में, जो निर्धारित करता है कि टाइमआउट होने से पहले स्ट्रीम पढ़ने का प्रयास कितनी देर तक करेगा। |
| virtual [SetLength](./setlength/)(int64_t) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की लंबाई सेट करता है। |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | असिंक्रोनस रूप से वर्तमान स्ट्रीम में बाइट्स की क्रमिकता लिखता है, लिखे गए बाइट्स की संख्या से इस स्ट्रीम में वर्तमान स्थिति को आगे बढ़ाता है, और रद्दीकरण अनुरोधों की निगरानी करता है। |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | असिंक्रोनस रूप से वर्तमान स्ट्रीम में बाइट्स की क्रमिकता लिखता है, लिखे गए बाइट्स की संख्या से इस स्ट्रीम में वर्तमान स्थिति को आगे बढ़ाता है, और रद्दीकरण अनुरोधों की निगरानी करता है। |
| virtual [WriteByte](./writebyte/)(uint8_t) | निर्दिष्ट अनसाइनड 8-बिट पूर्णांक मान को स्ट्रीम में लिखता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Null](./null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के साझा पॉइंटर के लिए एक उपनाम। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
