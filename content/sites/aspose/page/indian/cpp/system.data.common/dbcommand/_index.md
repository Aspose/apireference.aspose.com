---
title: "System::Data::Common::DbCommand वर्ग"
linktitle: "DbCommand"
second_title: "Aspose.Page C++ के लिए"
description: "System::Data::Common::DbCommand वर्ग. डेटाबेस कमांड। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.data.common/dbcommand/
---
## DbCommand class


डेटाबेस कमांड। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class DbCommand : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | नॉन-क्वेरी कमांड निष्पादित करता है। |
| virtual [ExecuteReader](./executereader/)() | क्वेरी कमांड निष्पादित करता है। |
| virtual [get_CommandText](./get_commandtext/)() const | RTTI जानकारी। |
| virtual [get_Connection](./get_connection/)() const | कमांड से जुड़ा डेटाबेस कनेक्शन प्राप्त करता है। |
| virtual [set_CommandText](./set_commandtext/)(String) const | डेटाबेस कमांड टेक्स्ट सेट करता है। |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | कमांड से जुड़ा डेटाबेस कनेक्शन प्राप्त करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
