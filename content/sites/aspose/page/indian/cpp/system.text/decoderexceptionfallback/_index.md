---
title: "System::Text::DecoderExceptionFallback क्लास"
linktitle: "DecoderExceptionFallback"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::DecoderExceptionFallback क्लास। अपवाद-फ़ेंकने वाली फॉलबैक रणनीति प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 300
url: /hi/cpp/system.text/decoderexceptionfallback/
---
## DecoderExceptionFallback class


अपवाद-फ़ेंकने वाली फॉलबैक रणनीति प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class DecoderExceptionFallback : public System::Text::DecoderFallback
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | फॉलबैक बफ़र बनाता है। |
| [get_MaxCharCount](./get_maxcharcount/)() const override | इंस्टेंस द्वारा लौटाए जा सकने वाले अक्षरों की अधिकतम संख्या प्राप्त करता है। |
## संबंधित देखें

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
