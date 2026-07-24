---
title: "System::Net::Sockets::TcpClient class"
linktitle: "TcpClient"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::TcpClient क्लास। TCP नेटवर्क सेवाओं के लिए एक क्लाइंट का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 500
url: /hi/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


TCP नेटवर्क सेवाओं के लिए एक क्लाइंट का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class TcpClient : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस कनेक्ट ऑपरेशन शुरू करता है। |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस कनेक्ट ऑपरेशन शुरू करता है। |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | एक असिंक्रोनस कनेक्ट ऑपरेशन शुरू करता है। |
| [Close](./close/)() | कनेक्शन को बंद करता है और वर्तमान इंस्टेंस को नष्ट करता है। |
| [Connect](./connect/)(String, int32_t) | निर्दिष्ट रिमोट होस्ट से कनेक्शन स्थापित करता है। |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | निर्दिष्ट रिमोट होस्ट से कनेक्शन स्थापित करता है। |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | निर्दिष्ट रिमोट होस्ट से कनेक्शन स्थापित करता है। |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | निर्दिष्ट रिमोट होस्ट से कनेक्शन स्थापित करता है। |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | निर्दिष्ट असिंक्रोनस कनेक्ट ऑपरेशन के पूरा होने तक प्रतीक्षा करता है। |
| [get_Available](./get_available/)() | प्राप्त बाइट्स की संख्या लौटाता है जो पढ़ने के लिए तैयार हैं। |
| [get_Client](./get_client/)() | RTTI जानकारी। |
| [get_Connected](./get_connected/)() | एक मान लौटाता है जो दर्शाता है कि सॉकेट रिमोट होस्ट से जुड़ा है या नहीं। |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | एक मान प्राप्त करता है जो दर्शाता है कि वर्तमान इंस्टेंस केवल एक क्लाइंट को पोर्ट उपयोग करने की अनुमति देता है या नहीं। |
| [get_LingerState](./get_lingerstate/)() | एक मान प्राप्त करता है जो दर्शाता है कि सॉकेट सभी पेंडिंग डेटा भेजने के प्रयास में बंद होने में देरी करेगा या नहीं। |
| [get_NoDelay](./get_nodelay/)() | एक मान प्राप्त करता है जो दर्शाता है कि वर्तमान इंस्टेंस Nagle एल्गोरिद्म का उपयोग कर रहा है या नहीं। |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | डेटा प्राप्त करने के लिए उपयोग किए जाने वाले बफ़र का आकार प्राप्त करता है। |
| [get_ReceiveTimeout](./get_receivetimeout/)() | एक मान प्राप्त करता है जो उस समयावधि को दर्शाता है जिसके बाद डेटा प्राप्ति टाइम‑आउट हो जाएगी। |
| [get_SendBufferSize](./get_sendbuffersize/)() | डेटा भेजने के लिए उपयोग किए जाने वाले बफ़र का आकार प्राप्त करता है। |
| [get_SendTimeout](./get_sendtimeout/)() | एक मान प्राप्त करता है जो उस समयावधि को दर्शाता है जिसके बाद डेटा भेजना टाइम‑आउट हो जाएगा। |
| [GetStream](./getstream/)() | डेटा भेजने और प्राप्त करने के लिए उपयोग किए जाने वाले स्ट्रीम को लौटाता है। |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | सॉकेट सेट करता है। |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | एक मान सेट करता है जो दर्शाता है कि वर्तमान इंस्टेंस केवल एक क्लाइंट को पोर्ट उपयोग करने की अनुमति देता है या नहीं। |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | एक मान सेट करता है जो दर्शाता है कि सॉकेट सभी पेंडिंग डेटा भेजने के प्रयास में बंद होने में देरी करेगा या नहीं। |
| [set_NoDelay](./set_nodelay/)(bool) | एक मान सेट करता है जो दर्शाता है कि वर्तमान इंस्टेंस Nagle एल्गोरिद्म का उपयोग कर रहा है या नहीं। |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | डेटा प्राप्त करने के लिए उपयोग किए जाने वाले बफ़र का आकार सेट करता है। |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | एक मान सेट करता है जो उस समयावधि को दर्शाता है जिसके बाद डेटा प्राप्ति टाइम‑आउट हो जाएगी। |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | डेटा भेजने के लिए उपयोग किए जाने वाले बफ़र का आकार सेट करता है। |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | एक मान सेट करता है जो उस समयावधि को दर्शाता है जिसके बाद डेटा भेजना टाइम‑आउट हो जाएगा। |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | एक नया उदाहरण बनाता है। |
| [TcpClient](./tcpclient/)() | एक नया उदाहरण बनाता है। |
| [TcpClient](./tcpclient/)(AddressFamily) | एक नया उदाहरण बनाता है। |
| [TcpClient](./tcpclient/)(String, int32_t) | एक नया उदाहरण बनाता है। |
| virtual [~TcpClient](./~tcpclient/)() | वर्तमान इंस्टेंस को नष्ट करता है। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
