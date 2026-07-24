---
title: "System::Data::DataRow क्लास"
linktitle: "DataRow"
second_title: "Aspose.Page C++ के लिए"
description: "System::Data::DataRow क्लास। डेटा सेट में पंक्ति। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 500
url: /hi/cpp/system.data/datarow/
---
## DataRow class


डेटा सेट में पंक्ति। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class DataRow : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Table](./get_table/)() | जिस तालिका पंक्ति से यह संबंधित है, उसे प्राप्त करता है। |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | निर्दिष्ट संबंध के माध्यम से चाइल्ड माने जाने वाली पंक्तियों को प्राप्त करता है। |
| [idx_get](./idx_get/)(const int32_t) | RTTI जानकारी। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
