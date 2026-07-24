---
title: "System::Data::DataView क्लास"
linktitle: "DataView"
second_title: "Aspose.Page C++ के लिए"
description: "System::Data::DataView क्लास। तालिका पर काम करने वाला दृश्य। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 1100
url: /hi/cpp/system.data/dataview/
---
## DataView class


तालिका पर काम करने वाला दृश्य। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।

```cpp
class DataView : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Count](./get_count/)() | RTTI जानकारी। |
| [get_Table](./get_table/)() | वह तालिका प्राप्त करता है जिससे दृश्य संबंधित है। |
| [idx_get](./idx_get/)(const int32_t) | पंक्ति दृश्यों को प्राप्त करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
