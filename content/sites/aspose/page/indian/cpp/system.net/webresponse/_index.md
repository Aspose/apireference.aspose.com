---
title: "System::Net::WebResponse क्लास"
linktitle: "WebResponse"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebResponse क्लास। एक वेब प्रतिक्रिया का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 4000
url: /hi/cpp/system.net/webresponse/
---
## WebResponse class


एक वेब प्रतिक्रिया का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class WebResponse : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Close](./close/)() | प्रतिक्रिया स्ट्रीम को बंद करता है। |
| [Dispose](./dispose/)() override | कुछ नहीं करता। |
| virtual [get_ContentLength](./get_contentlength/)() | RTTI जानकारी। |
| virtual [get_ContentType](./get_contenttype/)() | संसाधन का MIME प्रकार लौटाता है। |
| virtual [get_Headers](./get_headers/)() | वर्तमान प्रतिक्रिया से संबंधित हेडर के संग्रह को लौटाता है। |
| virtual [get_ResponseUri](./get_responseuri/)() | संसाधन का URI लौटाता है। |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | एक मान लौटाता है जो दर्शाता है कि वर्तमान प्रतिक्रिया हेडर का समर्थन करती है या नहीं। |
| virtual [GetResponseStream](./getresponsestream/)() | प्रतिक्रिया स्ट्रीम लौटाता है। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
