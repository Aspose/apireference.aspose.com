---
title: "System::Text::DecoderExceptionFallbackBuffer क्लास"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::DecoderExceptionFallbackBuffer क्लास। अपवाद-फेंकने वाली डिकोडिंग फॉलबैक रणनीति के लिए बफ़र। वास्तव में कुछ भी संग्रहीत नहीं करता, बल्कि फेंकता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 400
url: /hi/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | निर्माता। |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | डिकोडिंग विफलता को संभालता है। |
| [get_Remaining](./get_remaining/)() const override | शेष अक्षरों की संख्या प्राप्त करता है। |
| [GetNextChar](./getnextchar/)() override | अगला उपलब्ध अक्षर प्राप्त करता है। |
| [MovePrevious](./moveprevious/)() override | पिछले अक्षर पर जाता है। |
## संबंधित देखें

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
