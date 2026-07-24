---
title: "System::Data::IDataRecord क्लास"
linktitle: "IDataRecord"
second_title: "Aspose.Page C++ के लिए"
description: "System::Data::IDataRecord class. कॉलम वाले रिकॉर्ड के लिए इंटरफ़ेस। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 1300
url: /hi/cpp/system.data/idatarecord/
---
## IDataRecord class


कॉलम वाले रिकॉर्ड के लिए इंटरफ़ेस। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class IDataRecord : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | RTTI जानकारी। |
| virtual [GetName](./getname/)(const int32_t) | निर्दिष्ट स्थिति पर फ़ील्ड का नाम प्राप्त करता है। |
| virtual [idx_get](./idx_get/)(const int32_t) | निर्दिष्ट इंडेक्स पर मान प्राप्त करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
