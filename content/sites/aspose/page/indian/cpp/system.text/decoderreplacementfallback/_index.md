---
title: "System::Text::DecoderReplacementFallback क्लास"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::DecoderReplacementFallback क्लास। त्रुटिपूर्ण प्रतीक को स्टब से बदलने की फॉलबैक रणनीति प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 700
url: /hi/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


त्रुटिपूर्ण प्रतीक को स्टब से बदलने की फॉलबैक रणनीति प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | फॉलबैक बफ़र बनाता है। |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | डिफ़ॉल्ट "?" प्रतिस्थापन स्ट्रिंग का उपयोग करने वाला कंस्ट्रक्टर। |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | निर्माता। |
| [get_DefaultString](./get_defaultstring/)() const | प्रतिस्थापन स्ट्रिंग प्राप्त करता है। |
| [get_MaxCharCount](./get_maxcharcount/)() const override | इंस्टेंस द्वारा लौटाए जा सकने वाले अक्षरों की अधिकतम संख्या प्राप्त करता है। |
## संबंधित देखें

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
