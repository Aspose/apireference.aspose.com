---
title: "System::Text::EncoderFallback क्लास"
linktitle: "EncoderFallback"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::EncoderFallback क्लास। एन्कोडिंग त्रुटि को संभालने के लिए फॉलबैक API प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 1200
url: /hi/cpp/system.text/encoderfallback/
---
## EncoderFallback class


एन्कोडिंग त्रुटि को संभालने के लिए फॉलबैक API प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
class EncoderFallback : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | फॉलबैक एल्गोरिदम से संबंधित बफ़र प्राप्त करता है। |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | डिफ़ॉल्ट अपवाद फॉलबैक कार्यान्वयन प्राप्त करता है। |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | फॉलबैक द्वारा लौटाए जा सकने वाले अधिकतम अक्षरों की संख्या प्राप्त करता है। |
| static [get_ReplacementFallback](./get_replacementfallback/)() | डिफ़ॉल्ट प्रतिस्थापन फॉलबैक कार्यान्वयन प्राप्त करता है। |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | डिफ़ॉल्ट मानक सुरक्षित फॉलबैक कार्यान्वयन प्राप्त करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
