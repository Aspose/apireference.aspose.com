---
title: "System::Net::FileWebRequest class"
linktitle: "FileWebRequest"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::FileWebRequest class. फ़ाइल सिस्टम के साथ काम करने के लिए WebRequest एब्स्ट्रैक्ट क्लास की कार्यान्वयन प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 1000
url: /hi/cpp/system.net/filewebrequest/
---
## FileWebRequest class


[WebRequest](../webrequest/) एब्स्ट्रैक्ट क्लास की कार्यान्वयन प्रदान करता है ताकि फ़ाइल सिस्टम के साथ काम किया जा सके। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Abort](./abort/)() override | वर्तमान अनुरोध को रोकता है। |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | संसाधन में डेटा लिखने के लिए एक स्ट्रीम प्राप्त करने हेतु असिंक्रोनस ऑपरेशन शुरू करता है। |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | संसाधन के लिए असिंक्रोनस अनुरोध शुरू करता है। |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | स्ट्रीम प्राप्त करने के निर्दिष्ट असिंक्रोनस ऑपरेशन के समाप्त होने तक प्रतीक्षा करता है। |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | संसाधन के लिए निर्दिष्ट असिंक्रोनस अनुरोध के समाप्त होने तक प्रतीक्षा करता है। |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | एक नया उदाहरण बनाता है। |
| [get_ContentType](./get_contenttype/)() override | अनुरोध का MIME प्रकार प्राप्त करता है। |
| [get_Headers](./get_headers/)() override | HTTP हेडर का संग्रह प्राप्त करता है। |
| [get_Method](./get_method/)() override | HTTP विधि प्राप्त करता है। |
| [get_RequestUri](./get_requesturi/)() override | अनुरोध URI लौटाता है। |
| [GetResponse](./getresponse/)() override | वर्तमान वेब अनुरोध से संबंधित वेब प्रतिक्रिया लौटाता है। |
| [set_ContentType](./set_contenttype/)(String) override | अनुरोध का MIME प्रकार सेट करता है। |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | HTTP हेडर का संग्रह सेट करता है। |
| [set_Method](./set_method/)(String) override | HTTP मेथड सेट करता है। |
| [set_Timeout](./set_timeout/)(int) override | RTTI जानकारी। |
## संबंधित देखें

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
