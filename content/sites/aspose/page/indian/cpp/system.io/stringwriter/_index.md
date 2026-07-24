---
title: "System::IO::StringWriter क्लास"
linktitle: "StringWriter"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::StringWriter क्लास। एक TextWriter को लागू करता है जो जानकारी को स्ट्रिंग में लिखता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2500
url: /hi/cpp/system.io/stringwriter/
---
## StringWriter class


एक [TextWriter](../textwriter/) को लागू करता है जो जानकारी को स्ट्रिंग में लिखता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class StringWriter : public System::IO::TextWriter
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | वापस देता है वर्तमान में उपयोग की जा रही एन्कोडिंग। |
| virtual [GetStringBuilder](./getstringbuilder/)() | वर्तमान में उपयोग किए जा रहे StringBuilder को लौटाता है। |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | निर्दिष्ट StringBuilder और [IFormatProvider](../../system/iformatprovider/) का उपयोग करके [StringWriter](./) का नया इंस्टेंस बनाता है। |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | वर्तमान संस्कृति से निर्दिष्ट StringBuilder और [IFormatProvider](../../system/iformatprovider/) का उपयोग करके [StringWriter](./) का नया इंस्टेंस बनाता है। |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | निर्दिष्ट [IFormatProvider](../../system/iformatprovider/) का उपयोग करके [StringWriter](./) का नया इंस्टेंस बनाता है। |
| [StringWriter](./stringwriter/)() | वर्तमान संस्कृति से [IFormatProvider](../../system/iformatprovider/) का उपयोग करके [StringWriter](./) का नया इंस्टेंस बनाता है। |
| [ToString](./tostring/)() const override | अधोस्थित स्ट्रिंग को लौटाता है। |
| [Write](./write/)(char_t) override | निर्दिष्ट अक्षर को स्ट्रीम में लिखता है। |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | निर्दिष्ट कैरेक्टर एरे से निर्दिष्ट उप-रेंज के कैरेक्टर्स को स्ट्रीम में लिखता है। |
| [Write](./write/)(const String\&) override | निर्दिष्ट स्ट्रिंग को स्ट्रीम में लिखता है। |
## संबंधित देखें

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
