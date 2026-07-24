---
title: "System::Net::Http::StringContent क्लास"
linktitle: "StringContent"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::StringContent क्लास। HTTP सामग्री को स्ट्रिंग के रूप में दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1100
url: /hi/cpp/system.net.http/stringcontent/
---
## StringContent class


HTTP सामग्री को स्ट्रिंग के रूप में दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class StringContent : public System::Net::Http::ByteArrayContent
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [StringContent](./stringcontent/)(String) | RTTI जानकारी। |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>) | एक नया उदाहरण बनाता है। |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>, String) | एक नया उदाहरण बनाता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | डिफ़ॉल्ट एन्कोडिंग। |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | बाइट्स की अधिकतम संख्या। |
## संबंधित देखें

* Class [ByteArrayContent](../bytearraycontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
