---
title: "System::Text::DecoderFallbackBuffer क्लास"
linktitle: "DecoderFallbackBuffer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::DecoderFallbackBuffer क्लास। फॉलबैक कार्यान्वयन के लिए बफ़र प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 600
url: /hi/cpp/system.text/decoderfallbackbuffer/
---
## DecoderFallbackBuffer class


फॉलबैक कार्यान्वयन के लिए बफ़र प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
class DecoderFallbackBuffer : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) | वास्तविक फॉलबैक प्रक्रिया को लागू करता है। |
| virtual [get_Remaining](./get_remaining/)() const | प्रसंस्करण के लिए शेष अक्षरों की गिनती प्राप्त करता है। |
| virtual [GetNextChar](./getnextchar/)() | फॉलबैक बफ़र में अगला अक्षर निकालता है। |
| virtual [MovePrevious](./moveprevious/)() | यदि संभव हो तो बफ़र स्थिति को एक कदम पीछे ले जाता है। |
| virtual [Reset](./reset/)() | बफ़र को प्रारंभिक स्थिति में रीसेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
