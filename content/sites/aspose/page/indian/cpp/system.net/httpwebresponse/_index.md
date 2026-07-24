---
title: "System::Net::HttpWebResponse क्लास"
linktitle: "HttpWebResponse"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::HttpWebResponse क्लास। HTTP वेब प्रतिक्रिया का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2100
url: /hi/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


HTTP वेब प्रतिक्रिया का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() override | प्रतिक्रिया स्ट्रीम को बंद करता है। |
| [get_CharacterSet](./get_characterset/)() | लागू नहीं किया गया। |
| [get_ContentLength](./get_contentlength/)() override | RTTI जानकारी। |
| [get_ContentType](./get_contenttype/)() override | संसाधन का MIME प्रकार लौटाता है। |
| virtual [get_Cookies](./get_cookies/)() | वेब प्रतिक्रिया से संबंधित कुकीज़ लौटाता है। |
| [get_Headers](./get_headers/)() override | वर्तमान प्रतिक्रिया से संबंधित हेडर के संग्रह को लौटाता है। |
| virtual [get_Method](./get_method/)() | HTTP मेथड लौटाता है। |
| [get_ResponseUri](./get_responseuri/)() override | संसाधन का URI लौटाता है। |
| virtual [get_StatusCode](./get_statuscode/)() | वेब प्रतिक्रिया से संबंधित HTTP स्थिति कोड लौटाता है। |
| virtual [get_StatusDescription](./get_statusdescription/)() | स्थिति कोड का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [get_SupportsHeaders](./get_supportsheaders/)() override | एक मान लौटाता है जो दर्शाता है कि वर्तमान प्रतिक्रिया हेडर का समर्थन करती है या नहीं। |
| [GetResponseHeader](./getresponseheader/)(String) | निर्दिष्ट हेडर नाम के लिए संबंधित मान लौटाता है। |
| [GetResponseStream](./getresponsestream/)() override | प्रतिक्रिया स्ट्रीम लौटाता है। |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
