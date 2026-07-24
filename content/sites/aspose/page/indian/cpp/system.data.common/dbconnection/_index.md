---
title: "System::Data::Common::DbConnection वर्ग"
linktitle: "DbConnection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Data::Common::DbConnection वर्ग. डेटाबेस कनेक्शन. इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 200
url: /hi/cpp/system.data.common/dbconnection/
---
## DbConnection class


डेटाबेस कनेक्शन. इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class DbConnection : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | RTTI जानकारी। |
| virtual [Open](./open/)() | डेटाबेस से कनेक्शन खोलता है। |
| virtual [set_ConnectionString](./set_connectionstring/)(String) const | कनेक्शन जानकारी सेट करता है (जैसे सर्वर और पोर्ट)। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
