---
title: "System::IO::FileStream क्लास"
linktitle: "FileStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::FileStream क्लास। एक फ़ाइल स्ट्रीम का प्रतिनिधित्व करता है जो समकालिक और असमकालिक पढ़ने और लिखने के संचालन का समर्थन करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1500
url: /hi/cpp/system.io/filestream/
---
## FileStream class


एक फ़ाइल स्ट्रीम का प्रतिनिधित्व करता है जो समकालिक और असमकालिक पढ़ने और लिखने के संचालन का समर्थन करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class FileStream : public System::IO::Stream
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() override | वर्तमान [FileStream](./) ऑब्जेक्ट को बंद करता है। |
| [FileStream](./filestream/)(const String\&, FileMode) | एक नया [FileStream](./) क्लास का इंस्टेंस बनाता है और इसे निर्दिष्ट पैरामीटरों से प्रारंभ करता है। |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | एक नया [FileStream](./) क्लास का इंस्टेंस बनाता है और इसे निर्दिष्ट पैरामीटरों से प्रारंभ करता है। |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | एक नया [FileStream](./) क्लास का इंस्टेंस बनाता है और इसे निर्दिष्ट पैरामीटरों से प्रारंभ करता है। |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | इस स्ट्रीम के बफ़र्स को साफ़ करता है और सभी बफ़र किए गए डेटा को अंतर्निहित फ़ाइल में लिखता है। |
| [Flush](./flush/)(bool) | इस स्ट्रीम के बफ़र्स को साफ़ करता है और सभी बफ़र किए गए डेटा को अंतर्निहित फ़ाइल में लिखता है। विधि [Flush()](./flush/) का पर्याय। |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | असिंक्रोनस रूप से इस स्ट्रीम के सभी बफ़र साफ़ करता है, बफ़र किए गए डेटा को आधारभूत डिवाइस में लिखवाता है, और रद्दीकरण अनुरोधों की निगरानी करता है। |
| [get_CanRead](./get_canread/)() const override | निर्धारित करता है कि स्ट्रीम पढ़ने योग्य है या नहीं। |
| [get_CanSeek](./get_canseek/)() const override | निर्धारित करता है कि क्या स्ट्रीम सीकिंग का समर्थन करता है। |
| [get_CanWrite](./get_canwrite/)() const override | निर्धारित करता है कि क्या स्ट्रीम लिखने योग्य है। |
| [get_Length](./get_length/)() const override | स्ट्रीम की लंबाई बाइट्स में लौटाता है। |
| [get_Name](./get_name/)() const | वर्तमान [FileStream](./) ऑब्जेक्ट द्वारा संलग्न फ़ाइल का नाम लौटाता है। |
| [get_Position](./get_position/)() const override | स्ट्रीम की वर्तमान स्थिति लौटाता है। |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | असिंक्रोनस रूप से वर्तमान स्ट्रीम से बाइट्स की क्रमिकता पढ़ता है, पढ़े गए बाइट्स की संख्या से स्ट्रीम में स्थिति को आगे बढ़ाता है, और रद्दीकरण अनुरोधों की निगरानी करता है। |
| [ReadByte](./readbyte/)() override | स्ट्रीम से एक बाइट पढ़ता है और पढ़े गए बाइट के मान के बराबर 32-बिट पूर्णांक मान लौटाता है। |
| [Seek](./seek/)(int64_t, SeekOrigin) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की स्थिति सेट करता है। |
| [set_Position](./set_position/)(int64_t) override | स्ट्रीम को फ़्लश करता है और फिर स्ट्रीम की स्थिति सेट करता है। |
| [SetLength](./setlength/)(int64_t) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की लंबाई सेट करता है। |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | असिंक्रोनस रूप से वर्तमान स्ट्रीम में बाइट्स की क्रमिकता लिखता है, लिखे गए बाइट्स की संख्या से इस स्ट्रीम में वर्तमान स्थिति को आगे बढ़ाता है, और रद्दीकरण अनुरोधों की निगरानी करता है। |
| [WriteByte](./writebyte/)(uint8_t) override | निर्दिष्ट अनसाइनड 8-बिट पूर्णांक मान को स्ट्रीम में लिखता है। |
| [~FileStream](./~filestream/)() | डिस्ट्रक्टर। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | पढ़ने और लिखने के संचालन के दौरान बफ़र किए गए बाइट्स की संख्या का डिफ़ॉल्ट मान। |
| static [Null](../stream/null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## संबंधित देखें

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
