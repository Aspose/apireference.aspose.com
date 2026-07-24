---
title: "System::Net::Sockets::TcpListener क्लास"
linktitle: "TcpListener"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::TcpListener क्लास। TCP नेटवर्क सेवाओं के लिए एक लिस्नर का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 600
url: /hi/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


TCP नेटवर्क सेवाओं के लिए एक लिस्नर का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class TcpListener : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | लंबित कनेक्शन अनुरोध को स्वीकार करता है और वह सॉकेट लौटाता है जिसका उपयोग डेटा भेजने और प्राप्त करने के लिए किया जाता है। |
| [AcceptTcpClient](./accepttcpclient/)() | लंबित कनेक्शन अनुरोध को स्वीकार करता है और वह TcpClient-क्लास इंस्टेंस लौटाता है जिसका उपयोग डेटा भेजने और प्राप्त करने के लिए किया जाता है। |
| [AllowNatTraversal](./allownattraversal/)(bool) | NAT ट्रैवर्सल को सक्षम या अक्षम करता है। |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस एक्सेप्ट ऑपरेशन को प्रारंभ करता है। |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस एक्सेप्ट ऑपरेशन को प्रारंभ करता है। |
| static [Create](./create/)(int32_t) | निर्दिष्ट पोर्ट नंबर का उपयोग करके एक नया इंस्टेंस बनाता है। |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | निर्दिष्ट असिंक्रोनस एक्सेप्ट ऑपरेशन के पूर्ण होने तक प्रतीक्षा करता है। |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | निर्दिष्ट असिंक्रोनस एक्सेप्ट ऑपरेशन के पूर्ण होने तक प्रतीक्षा करता है। |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | एक मान प्राप्त करता है जो दर्शाता है कि वर्तमान इंस्टेंस केवल एक क्लाइंट को पोर्ट उपयोग करने की अनुमति देता है या नहीं। |
| [get_LocalEndpoint](./get_localendpoint/)() | अधीनस्थ एंडपॉइंट लौटाता है। |
| [get_Server](./get_server/)() | RTTI जानकारी। |
| [Pending](./pending/)() | एक मान लौटाता है जो दर्शाता है कि क्या लंबित कनेक्शन अनुरोध मौजूद हैं। |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | एक मान सेट करता है जो दर्शाता है कि वर्तमान इंस्टेंस केवल एक क्लाइंट को पोर्ट उपयोग करने की अनुमति देता है या नहीं। |
| [Start](./start/)() | आगामी कनेक्शनों के लिए सुनना शुरू करता है। |
| [Start](./start/)(int32_t) | आगामी कनेक्शनों के लिए सुनना शुरू करता है। |
| [Stop](./stop/)() | आगामी कनेक्शनों के लिए सुनना बंद करता है। |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | एक नया उदाहरण बनाता है। |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | एक नया उदाहरण बनाता है। |
| [TcpListener](./tcplistener/)(int32_t) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
