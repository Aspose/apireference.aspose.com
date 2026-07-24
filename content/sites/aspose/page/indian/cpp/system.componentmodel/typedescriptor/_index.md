---
title: "System::ComponentModel::TypeDescriptor वर्ग"
linktitle: "TypeDescriptor"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::TypeDescriptor वर्ग. TypeDescriptor-उपयोग कोड को अनुवाद के बाद संकलित करने के लिए डमी वर्ग. इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए. इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी. हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन के तर्क के रूप में पास करें."
type: docs
weight: 1500
url: /hi/cpp/system.componentmodel/typedescriptor/
---
## TypeDescriptor class


अनुवाद के बाद संकलन के लिए TypeDescriptor-उपयोगी कोड के लिए डमी क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class TypeDescriptor : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [GetConverter](./getconverter/)(const TypeInfo\&) | RTTI जानकारी। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
