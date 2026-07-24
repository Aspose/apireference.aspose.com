---
title: "System::IO::BasicSTDIStreamWrapper class"
linktitle: "BasicSTDIStreamWrapper"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::BasicSTDIStreamWrapper क्लास। यह std::basic_istream और उसके व्युत्पन्न ऑब्जेक्ट्स के लिए System.IO.Stream-समतुल्य रैपर का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 200
url: /hi/cpp/system.io/basicstdistreamwrapper/
---
## BasicSTDIStreamWrapper class


यह [System.IO.Stream](../stream/)-समतुल्य रैपर std::basic_istream और उसके व्युत्पन्न ऑब्जेक्ट्स के लिए प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
template<typename T,typename>class BasicSTDIStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | [BasicSTDIStreamWrapper](./) का नया इंस्टेंस बनाता है। |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(const BasicSTDIStreamWrapper\&) | कॉपी कंस्ट्रक्टर। हटाया गया। |
| [Flush](./flush/)() override | इस स्ट्रीम के बफ़र को साफ़ करता है और सभी बफ़र किए गए डेटा को आधारभूत स्टोरेज में लिखता है। समर्थित नहीं! |
| [operator=](./operator=/)(const BasicSTDIStreamWrapper\&) | कॉपी असाइनमेंट ऑपरेटर। हटाया गया। |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | यदि रैपिंग मोड बाइनरी है, तो स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है, अन्यथा निर्दिष्ट संख्या में अक्षर पढ़ता है और उन्हें uint8_t प्रकार में परिवर्तित करता है। पढ़ने के परिणाम को निर्दिष्ट बाइट एरे में लिखता है। |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | स्ट्रीम से निर्दिष्ट संख्या में बाइट्स पढ़ता है और उन्हें निर्दिष्ट बाइट एरे में लिखता है। |
| [ReadByte](./readbyte/)() override | यदि रैपिंग मोड बाइनरी है, तो अंतिम डिकोड किए गए अक्षर भंडार से एक एकल बाइट पढ़ता है, अन्यथा स्ट्रीम से एक एकल अक्षर पढ़ता है और उसे uint8_t प्रकार में परिवर्तित करता है। |
| [SetLength](./setlength/)(int64_t) override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की लंबाई सेट करता है। समर्थित नहीं! |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | यदि रैपिंग मोड बाइनरी है, तो निर्दिष्ट बाइट एरे से निर्दिष्ट बाइटों की उप-रेंज को स्ट्रीम में लिखता है; अन्यथा निर्दिष्ट बाइट एरे से निर्दिष्ट बाइटों की उप-रेंज को [char_type](./char_type/) प्रकार में परिवर्तित करता है और फिर परिणाम को स्ट्रीम में लिखता है। समर्थित नहीं! |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | निर्दिष्ट बाइट एरे से निर्दिष्ट बाइट्स की उप-सीमा को स्ट्रीम में लिखता है। |
| [WriteByte](./writebyte/)(uint8_t) override | यदि रैपिंग मोड बाइनरी है, तो निर्दिष्ट अनसाइनड 8-बिट पूर्णांक मान को स्ट्रीम में लिखता है; अन्यथा इसे [char_type](./char_type/) प्रकार में परिवर्तित करता है और फिर परिणाम को स्ट्रीम में लिखता है। समर्थित नहीं! |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Null](../stream/null/) | एक स्ट्रीम जिसमें कोई अंतर्निहित संग्रह नहीं है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI जानकारी। |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## संबंधित देखें

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
