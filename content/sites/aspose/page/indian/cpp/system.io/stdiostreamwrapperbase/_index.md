---
title: "System::IO::STDIOStreamWrapperBase क्लास"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::STDIOStreamWrapperBase क्लास। System.IO.Stream-समरूप रैपरों के लिए एक बेस क्लास का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 2000
url: /hi/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


[System.IO.Stream](../stream/)-समरूप रैपरों के लिए एक बेस क्लास का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | निर्धारित करता है कि क्या स्ट्रीम पढ़ने का समर्थन करता है। |
| [get_CanSeek](./get_canseek/)() const override | निर्धारित करता है कि क्या स्ट्रीम सीकिंग का समर्थन करता है। |
| [get_CanWrite](./get_canwrite/)() const override | निर्धारित करता है कि क्या स्ट्रीम लिखने का समर्थन करता है। |
| [get_Length](./get_length/)() const override | स्ट्रीम की लंबाई लौटाता है। |
| [get_Position](./get_position/)() const override | स्ट्रीम की वर्तमान स्थिति लौटाता है। |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | कॉपी असाइनमेंट ऑपरेटर। हटाया गया। |
| [Seek](./seek/)(int64_t, SeekOrigin) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की स्थिति सेट करता है। |
| [set_Position](./set_position/)(int64_t) override | स्ट्रीम की स्थिति सेट करता है। |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | कॉपी कंस्ट्रक्टर। हटाया गया। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Null](../stream/null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI जानकारी। |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## संबंधित देखें

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
