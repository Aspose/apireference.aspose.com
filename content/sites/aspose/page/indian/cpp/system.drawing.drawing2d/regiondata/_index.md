---
title: "System::Drawing::Drawing2D::RegionData class"
linktitle: "RegionData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Drawing2D::RegionData class. एक क्षेत्र को परिभाषित करने वाला डेटा रखता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 1300
url: /hi/cpp/system.drawing.drawing2d/regiondata/
---
## RegionData class


एक क्षेत्र को परिभाषित करने वाला डेटा रखता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class RegionData : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Data](./get_data/)() | एक बाइट एरे लौटाता है जिसमें वह डेटा होता है जो एक क्षेत्र को परिभाषित करता है। |
| [RegionData](./regiondata/)(const ArrayPtr\<uint8_t\>\&) | निर्दिष्ट डेटा के साथ एक नया [RegionData](./) क्लास का इंस्टेंस बनाता है और उसे प्रारंभ करता है। |
| [set_Data](./set_data/)(const ArrayPtr\<uint8_t\>\&) | वर्तमान ऑब्जेक्ट के लिए क्षेत्र डेटा सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
