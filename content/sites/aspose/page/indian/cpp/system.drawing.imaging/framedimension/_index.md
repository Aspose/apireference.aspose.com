---
title: "System::Drawing::Imaging::FrameDimension क्लास"
linktitle: "FrameDimension"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Imaging::FrameDimension क्लास। एक इमेज के फ्रेम आयाम प्राप्त करने वाली प्रॉपर्टीज़ प्रदान करती है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 800
url: /hi/cpp/system.drawing.imaging/framedimension/
---
## FrameDimension class


एक इमेज के फ्रेम आयाम प्राप्त करने वाली प्रॉपर्टीज़ प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
class FrameDimension : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(FrameDimensionPtr) | निर्धारित करता है कि निर्दिष्ट [FrameDimension](./) ऑब्जेक्ट वर्तमान ऑब्जेक्ट के बराबर है या नहीं। |
| [FrameDimension](./framedimension/)(const System::Guid\&) | एक नया [FrameDimension](./) ऑब्जेक्ट बनाता है और इसे निर्दिष्ट GUID से प्रारंभ करता है। |
| [get_Guid](./get_guid/)() const | वर्तमान ऑब्जेक्ट से जुड़ा GUID लौटाता है। |
| static [get_Page](./get_page/)() | पेज आयाम लौटाता है। |
| static [get_Resolution](./get_resolution/)() | रिज़ॉल्यूशन आयाम लौटाता है। |
| static [get_Time](./get_time/)() | टाइम आयाम लौटाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
