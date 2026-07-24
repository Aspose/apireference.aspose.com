---
title: "System::Net::ServicePoint क्लास"
linktitle: "ServicePoint"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::ServicePoint क्लास। HTTP कनेक्शन प्रबंधन प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 3100
url: /hi/cpp/system.net/servicepoint/
---
## ServicePoint class


HTTP कनेक्शन प्रबंधन प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ServicePoint : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | निर्दिष्ट कनेक्शन समूह से संबंधित कनेक्शनों को बंद करता है और हटाता है। |
| [get_Address](./get_address/)() | वर्तमान इंस्टेंस जिस सर्वर URI से जुड़ता है, उसे लौटाता है। |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | RTTI जानकारी। |
| [get_Certificate](./get_certificate/)() | वर्तमान इंस्टेंस द्वारा उपयोग किया जाने वाला प्रमाणपत्र लौटाता है। |
| [get_ClientCertificate](./get_clientcertificate/)() | अंतिम क्लाइंट प्रमाणपत्र लौटाता है। |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | एक टाइमआउट मिलीसेकंड में प्राप्त करता है, जिसके बाद सक्रिय [ServicePoint](./) बंद हो जाएगा। |
| [get_ConnectionLimit](./get_connectionlimit/)() | वर्तमान इंस्टेंस द्वारा अनुमत अधिकतम कनेक्शन संख्या प्राप्त करता है। |
| [get_ConnectionName](./get_connectionname/)() | कनेक्शन का नाम लौटाता है। |
| [get_CurrentConnections](./get_currentconnections/)() | खुले कनेक्शनों की संख्या लौटाता है। |
| [get_Expect100Continue](./get_expect100continue/)() | एक मान प्राप्त करता है जो दर्शाता है कि 100-Continue व्यवहार उपयोग किया गया है या नहीं। |
| [get_IdleSince](./get_idlesince/)() | होस्ट के साथ नवीनतम कनेक्शन की तिथि और समय लौटाता है। |
| [get_MaxIdleTime](./get_maxidletime/)() | एक अवधि (मिलीसेकंड में) प्राप्त करता है जिसके बाद निष्क्रिय कनेक्शन बंद हो जाएगा। |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | HTTP संस्करण लौटाता है। |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | रिसीव बफ़र का आकार प्राप्त करता है। |
| [get_SupportsPipelining](./get_supportspipelining/)() | एक मान लौटाता है जो दर्शाता है कि वर्तमान इंस्टेंस पाइपलाइन कनेक्शनों का समर्थन करता है या नहीं। |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | एक मान प्राप्त करता है जो दर्शाता है कि वर्तमान इंस्टेंस द्वारा प्रबंधित कनेक्शनों में Nagle एल्गोरिद्म उपयोग किया गया है या नहीं। |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | डेलीगेट सेट करता है जो स्थानीय [IPEndPoint](../ipendpoint/) को वर्तमान इंस्टेंस से जोड़ने के लिए उपयोग किया जाता है। |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | एक टाइमआउट (मिलीसेकंड में) सेट करता है जिसके बाद सक्रिय [ServicePoint](./) बंद हो जाएगा। |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | वर्तमान इंस्टेंस द्वारा अनुमति दी गई अधिकतम कनेक्शनों की संख्या सेट करता है। |
| [set_Expect100Continue](./set_expect100continue/)(bool) | एक मान सेट करता है जो दर्शाता है कि 100-Continue व्यवहार उपयोग किया गया है या नहीं। |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | एक अवधि (मिलीसेकंड में) सेट करता है जिसके बाद निष्क्रिय कनेक्शन बंद हो जाएगा। |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | रिसीव बफ़र का आकार सेट करता है। |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | एक मान सेट करता है जो दर्शाता है कि वर्तमान इंस्टेंस द्वारा प्रबंधित कनेक्शनों में Nagle एल्गोरिद्म उपयोग किया गया है या नहीं। |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | 'Keep-Alive' विकल्प सक्षम है या नहीं, यह दर्शाने वाला मान सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
