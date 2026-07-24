---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::FileWebResponse क्लास। फ़ाइल प्रणाली के साथ काम करने के लिए WebResponse एब्स्ट्रैक्ट क्लास का कार्यान्वयन प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 1100
url: /hi/cpp/system.net/filewebresponse/
---
## FileWebResponse class


फ़ाइल प्रणाली के साथ काम करने के लिए [WebResponse](../webresponse/) एब्स्ट्रैक्ट क्लास का कार्यान्वयन प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() override | प्रतिक्रिया स्ट्रीम को बंद करता है। |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | एक नया उदाहरण बनाता है। |
| [get_ContentLength](./get_contentlength/)() override | RTTI जानकारी। |
| [get_ContentType](./get_contenttype/)() override | संसाधन का MIME प्रकार लौटाता है। |
| [get_Headers](./get_headers/)() override | वर्तमान प्रतिक्रिया से संबंधित हेडर के संग्रह को लौटाता है। |
| [get_ResponseUri](./get_responseuri/)() override | संसाधन का URI लौटाता है। |
| [get_SupportsHeaders](./get_supportsheaders/)() override | एक मान लौटाता है जो दर्शाता है कि वर्तमान प्रतिक्रिया हेडर का समर्थन करती है या नहीं। |
| [GetResponseStream](./getresponsestream/)() override | प्रतिक्रिया स्ट्रीम लौटाता है। |
## संबंधित देखें

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
