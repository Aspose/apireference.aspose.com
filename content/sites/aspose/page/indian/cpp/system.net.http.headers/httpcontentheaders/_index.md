---
title: "System::Net::Http::Headers::HttpContentHeaders class"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::HttpContentHeaders क्लास। ''Content'' हेडरों के संग्रह का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 600
url: /hi/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


'Content' हेडरों के संग्रह का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | ज्ञात हेडर को निर्दिष्ट संग्रह में जोड़ता है। |
| [get_Allow](./get_allow/)() | RTTI जानकारी। |
| [get_ContentDisposition](./get_contentdisposition/)() | 'Content-Disposition' हेडर का मान प्राप्त करता है। |
| [get_ContentEncoding](./get_contentencoding/)() | 'Content-Encoding' हेडर का मान प्राप्त करता है। |
| [get_ContentLanguage](./get_contentlanguage/)() | 'Content-Language' हेडर का मान प्राप्त करता है। |
| [get_ContentLength](./get_contentlength/)() | 'Content-Length' हेडर का मान प्राप्त करता है। |
| [get_ContentLocation](./get_contentlocation/)() | 'Content-Location' हेडर का मान प्राप्त करता है। |
| [get_ContentMD5](./get_contentmd5/)() | 'Content-MD5' हेडर का मान प्राप्त करता है। |
| [get_ContentRange](./get_contentrange/)() | 'Content-Range' हेडर का मान प्राप्त करता है। |
| [get_ContentType](./get_contenttype/)() | 'Content-Type' हेडर का मान प्राप्त करता है। |
| [get_Expires](./get_expires/)() | 'Expires' हेडर का मान प्राप्त करता है। |
| [get_LastModified](./get_lastmodified/)() | 'Last-Modified' हेडर का मान प्राप्त करता है। |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | एक नया उदाहरण बनाता है। |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | 'Content-Disposition' हेडर का मान सेट करता है। |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | 'Content-Length' हेडर का मान सेट करता है। |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | 'Content-Location' हेडर का मान सेट करता है। |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | 'Content-MD5' हेडर का मान सेट करता है। |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | 'Content-Range' हेडर का मान सेट करता है। |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | 'Content-Type' हेडर का मान सेट करता है। |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | 'Expires' हेडर का मान सेट करता है। |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | 'Last-Modified' हेडर का मान सेट करता है। |
## संबंधित देखें

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
