---
title: "System::Net::Sockets::NetworkStream क्लास"
linktitle: "NetworkStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::NetworkStream क्लास। नेटवर्क एक्सेस के लिए डेटा की अंतर्निहित स्ट्रीम प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 300
url: /hi/cpp/system.net.sockets/networkstream/
---
## NetworkStream class


डेटा की नेटवर्क एक्सेस के लिए अंतर्निहित स्ट्रीम प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class NetworkStream : public System::IO::Stream
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | एक असिंक्रोनस रीड ऑपरेशन शुरू करता है। |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | एक असिंक्रोनस राइट ऑपरेशन शुरू करता है। |
| [Close](./close/)(int) | निर्दिष्ट समय समाप्त होने के बाद वर्तमान इंस्टेंस को बंद करता है। |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | निर्दिष्ट असिंक्रोनस रीड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | एक असिंक्रोनस राइट ऑपरेशन समाप्त करता है। निर्दिष्ट असिंक्रोनस राइट ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| [Flush](./flush/)() override | इस स्ट्रीम के बफ़र को साफ़ करता है और सभी बफ़र किए गए डेटा को अंतर्निहित स्टोरेज में लिखता है। |
| [get_CanRead](./get_canread/)() const override | RTTI जानकारी। |
| [get_CanSeek](./get_canseek/)() const override | निर्धारित करता है कि क्या स्ट्रीम सीकिंग का समर्थन करता है। |
| [get_CanTimeout](./get_cantimeout/)() const override | एक मान प्राप्त करता है जो निर्धारित करता है कि क्या वर्तमान स्ट्रीम टाइम‑आउट हो सकता है। |
| [get_CanWrite](./get_canwrite/)() const override | निर्धारित करता है कि क्या स्ट्रीम लिखने योग्य है। |
| [get_DataAvailable](./get_dataavailable/)() const | एक मान लौटाता है जो संकेत देता है कि पढ़ने के लिए उपलब्ध डेटा है या नहीं। |
| [get_Length](./get_length/)() const override | स्ट्रीम की लंबाई बाइट्स में लौटाता है। |
| [get_Position](./get_position/)() const override | स्ट्रीम की वर्तमान स्थिति लौटाता है। |
| [get_ReadTimeout](./get_readtimeout/)() const override | एक मान मिलिसेकंड में प्राप्त करता है जो निर्धारित करता है कि टाइम‑आउट होने से पहले स्ट्रीम कितनी देर तक पढ़ने का प्रयास करेगा। |
| [get_Socket](./get_socket/)() | अंतर्निहित [Socket](../socket/) प्राप्त करता है। |
| [get_WriteTimeout](./get_writetimeout/)() const override | एक मान प्राप्त करता है, मिलीसेकंड में, जो निर्धारित करता है कि टाइमआउट होने से पहले स्ट्रीम लिखने का प्रयास कितनी देर तक करेगा। |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>) | एक नया उदाहरण बनाता है। |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) | एक नया उदाहरण बनाता है। |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) | एक नया उदाहरण बनाता है। |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की स्थिति सेट करता है। |
| [set_Position](./set_position/)(int64_t) override | स्ट्रीम की स्थिति सेट करता है। |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | एक मान सेट करता है जो निर्धारित करता है कि वर्तमान स्ट्रीम टाइमआउट हो सकता है या नहीं। |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | एक मान सेट करता है, मिलीसेकंड में, जो निर्धारित करता है कि टाइमआउट होने से पहले स्ट्रीम पढ़ने का प्रयास कितनी देर तक करेगा। |
| [SetLength](./setlength/)(int64_t) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की लंबाई सेट करता है। |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| virtual [~NetworkStream](./~networkstream/)() | वर्तमान इंस्टेंस को नष्ट करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Null](../../system.io/stream/null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## संबंधित देखें

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
