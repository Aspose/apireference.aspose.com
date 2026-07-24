---
title: "System::Text::EncoderReplacementFallback क्लास"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::EncoderReplacementFallback क्लास। त्रुटिपूर्ण प्रतीक को एक स्टब के साथ बदलने की फॉलबैक रणनीति प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 1400
url: /hi/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


त्रुटिपूर्ण प्रतीक को स्टब से बदलने की फॉलबैक रणनीति प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | फॉलबैक बफ़र बनाता है। |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | डिफ़ॉल्ट "?" प्रतिस्थापन स्ट्रिंग का उपयोग करने वाला कंस्ट्रक्टर। |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | निर्माता। |
| [get_DefaultString](./get_defaultstring/)() const | प्रतिस्थापन स्ट्रिंग प्राप्त करता है। |
| [get_MaxCharCount](./get_maxcharcount/)() const override | इंस्टेंस द्वारा लौटाए जा सकने वाले अक्षरों की अधिकतम संख्या प्राप्त करता है। |
## संबंधित देखें

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
