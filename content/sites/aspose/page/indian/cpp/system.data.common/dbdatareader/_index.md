---
title: "System::Data::Common::DbDataReader क्लास"
linktitle: "DbDataReader"
second_title: "Aspose.Page C++ के लिए"
description: "System::Data::Common::DbDataReader क्लास। डेटाबेस से डेटा प्राप्त करने के लिए API। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें। C++ में।"
type: docs
weight: 400
url: /hi/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


डेटाबेस से डेटा प्राप्त करने के लिए API। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class DbDataReader : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Close](./close/)() | डेटा पुनर्प्राप्ति चैनल को बंद करता है। |
| virtual [idx_get](./idx_get/)(String) | नामित आइटम प्राप्त करता है। |
| virtual [idx_get](./idx_get/)(int) | इंडेक्स द्वारा आइटम प्राप्त करता है। |
| virtual [Read](./read/)() | डेटाबेस से अगला रिकॉर्ड पढ़ता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | RTTI जानकारी। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
