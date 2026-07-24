---
title: "System::Net::Sockets::UdpClient class"
linktitle: "UdpClient"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::UdpClient class. यूज़र डेटाग्राम प्रोटोकॉल (UDP) नेटवर्क सेवाएँ प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 700
url: /hi/cpp/system.net.sockets/udpclient/
---
## UdpClient class


User Datagram Protocol (UDP) नेटवर्क सेवाएँ प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class UdpClient : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() | UDP कनेक्शन को बंद करता है। |
| [Connect](./connect/)(String, int32_t) | निर्दिष्ट होस्ट पर निर्दिष्ट पोर्ट से कनेक्शन स्थापित करता है। |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | निर्दिष्ट पोर्ट पर निर्दिष्ट पते पर होस्ट के साथ कनेक्शन स्थापित करता है। |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | रिमोट एंड पॉइंट से कनेक्शन स्थापित करता है। |
| [Dispose](./dispose/)() override | प्रबंधित और अप्रबंधित संसाधनों को रिलीज़ करता है जो [UdpClient](./) द्वारा उपयोग किए जाते हैं। |
| [get_Client](./get_client/)() | RTTI जानकारी। |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | सर्वर द्वारा भेजा गया डेटाग्राम वापस करता है। |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | रिमोट एंड पॉइंट पर होस्ट को UDP डेटाग्राम भेजता है। |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | निर्दिष्ट रिमोट होस्ट पर निर्दिष्ट पोर्ट को UDP डेटाग्राम भेजता है। |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | रिमोट होस्ट को UDP डेटाग्राम भेजता है। |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | आधारभूत नेटवर्क सॉकेट प्रदान करने के लिए उपयोग किया जाता है। |
| [UdpClient](./udpclient/)() | नए [UdpClient](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
| [UdpClient](./udpclient/)(AddressFamily) | नए [UdpClient](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
| [UdpClient](./udpclient/)(int32_t) | नए [UdpClient](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | नए [UdpClient](./) क्लास का एक नया उदाहरण प्रारंभ करता है। |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | नए [UdpClient](./) क्लास का एक नया उदाहरण प्रारंभ करता है। param local EP वह स्थानीय अंतबिंदु जिससे आप UDP कनेक्शन बाइंड करते हैं। |
| [UdpClient](./udpclient/)(String, int32_t) | नए [UdpClient](./) क्लास का एक नया उदाहरण बनाता है और निर्दिष्ट पोर्ट पर निर्दिष्ट रिमोट होस्ट से कनेक्ट करता है। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
