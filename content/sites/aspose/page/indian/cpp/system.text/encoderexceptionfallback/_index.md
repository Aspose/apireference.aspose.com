---
title: "System::Text::EncoderExceptionFallback वर्ग"
linktitle: "EncoderExceptionFallback"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::EncoderExceptionFallback वर्ग। अपवाद-फ़ेंकने वाली फॉलबैक रणनीति प्रदान करता है। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1000
url: /hi/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


अपवाद-फ़ेंकने वाली फॉलबैक रणनीति प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | फॉलबैक बफ़र बनाता है। |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | निर्माता। |
| [get_MaxCharCount](./get_maxcharcount/)() const override | इंस्टेंस द्वारा लौटाए जा सकने वाले अक्षरों की अधिकतम संख्या प्राप्त करता है। |
## संबंधित देखें

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
