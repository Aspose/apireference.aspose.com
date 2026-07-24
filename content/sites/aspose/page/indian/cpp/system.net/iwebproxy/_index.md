---
title: "System::Net::IWebProxy क्लास"
linktitle: "IWebProxy"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::IWebProxy क्लास। यह इंटरफ़ेस WebRequest क्लास के लिए प्रॉक्सी एक्सेस को लागू करने हेतु उपयोग किया जाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 2700
url: /hi/cpp/system.net/iwebproxy/
---
## IWebProxy class


यह इंटरफ़ेस [WebRequest](../webrequest/) क्लास के लिए प्रॉक्सी एक्सेस को लागू करने हेतु उपयोग किया जाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class IWebProxy : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_Credentials](./get_credentials/)() | RTTI जानकारी। |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | प्रॉक्सी URI लौटाता है। |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | एक मान लौटाता है जो दर्शाता है कि निर्दिष्ट होस्ट के लिए प्रॉक्सी का उपयोग नहीं किया जाना चाहिए। |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | प्रॉक्सी सर्वर पर प्रमाणीकरण के लिए क्रेडेंशियल सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
