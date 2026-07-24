---
title: "System::Text::EncoderReplacementFallbackBuffer क्लास"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::EncoderReplacementFallbackBuffer क्लास। एन्कोडिंग फॉलबैक रणनीति को बदलने के लिए बफ़र। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1500
url: /hi/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | निर्माता। |
| [Fallback](./fallback/)(char_t, int) override | एन्कोडिंग विफलता को संभालता है। |
| [Fallback](./fallback/)(char_t, char_t, int) override | एन्कोडिंग विफलता को संभालता है। |
| [get_Remaining](./get_remaining/)() const override | बफ़र में शेष अक्षरों की संख्या प्राप्त करता है। |
| [GetNextChar](./getnextchar/)() override | अगला उपलब्ध अक्षर प्राप्त करता है। |
| [MovePrevious](./moveprevious/)() override | पिछले अक्षर पर जाता है। |
| [Reset](./reset/)() override | बफ़र को प्रारंभिक स्थिति में रीसेट करता है ( [Fallback()](./fallback/) कॉल से पहले)। |
## संबंधित देखें

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
