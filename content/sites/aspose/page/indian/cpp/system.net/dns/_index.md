---
title: "System::Net::Dns class"
linktitle: "Dns"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Dns class. C++ में DNS के साथ काम करने के लिए विधियाँ प्रदान करता है।"
type: docs
weight: 700
url: /hi/cpp/system.net/dns/
---
## Dns class


DNS के साथ काम करने के लिए मेथड प्रदान करता है।

```cpp
class Dns : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | निर्दिष्ट स्ट्रिंग का उपयोग करके जिसमें होस्ट नाम या IP पता हो, एक नया IPHostEntry-class इंस्टेंस बनाने के लिए एक असिंक्रोनस ऑपरेशन शुरू करता है। |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | निर्दिष्ट होस्ट नाम का उपयोग करके एक नया IPHostEntry-class इंस्टेंस बनाने के लिए एक असिंक्रोनस ऑपरेशन शुरू करता है। |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | निर्दिष्ट स्ट्रिंग का उपयोग करके जिसमें होस्ट नाम या IP पता हो, एक नया IPHostEntry-class इंस्टेंस बनाने के लिए एक असिंक्रोनस ऑपरेशन शुरू करता है। |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | निर्दिष्ट IP पते का उपयोग करके एक नया IPHostEntry-class इंस्टेंस बनाने के लिए एक असिंक्रोनस ऑपरेशन शुरू करता है। |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | निर्दिष्ट होस्ट नाम का उपयोग करके एक नया IPHostEntry-class इंस्टेंस बनाने के लिए एक असिंक्रोनस ऑपरेशन शुरू करता है। |
| [Dns](./dns/)() | हटाया गया डिफ़ॉल्ट कंस्ट्रक्टर। |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | निर्दिष्ट असिंक्रोनस ऑपरेशन जो एक नया IPHostEntry-class इंस्टेंस बनाता है, के पूरा होने तक प्रतीक्षा करता है। |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | निर्दिष्ट असिंक्रोनस ऑपरेशन जो एक नया IPHostEntry-class इंस्टेंस बनाता है, के पूरा होने तक प्रतीक्षा करता है। |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | निर्दिष्ट असिंक्रोनस ऑपरेशन जो एक नया IPHostEntry-class इंस्टेंस बनाता है, के पूरा होने तक प्रतीक्षा करता है। |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | निर्दिष्ट असिंक्रोनस ऑपरेशन जो एक नया IPHostEntry-class इंस्टेंस बनाता है, के पूरा होने तक प्रतीक्षा करता है। |
| static [GetHostAddresses](./gethostaddresses/)(String) | निर्दिष्ट होस्ट नाम या IP पते के IP पतों का संग्रह लौटाता है। |
| static [GetHostByAddress](./gethostbyaddress/)(String) | निर्दिष्ट IP पते की स्ट्रिंग प्रतिनिधित्व का उपयोग करके एक नया IPHostEntry-class इंस्टेंस बनाता है। |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | निर्दिष्ट IP पते का उपयोग करके एक नया IPHostEntry-class इंस्टेंस बनाता है। |
| static [GetHostByName](./gethostbyname/)(String) | RTTI जानकारी। |
| static [GetHostEntry](./gethostentry/)(String) | निर्दिष्ट स्ट्रिंग जिसका उपयोग होस्ट नाम या IP पता शामिल करता है, से एक नया IPHostEntry-class इंस्टेंस बनाता है। |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | निर्दिष्ट IP पते का उपयोग करके एक नया IPHostEntry-class इंस्टेंस बनाता है। |
| static [GetHostName](./gethostname/)() | स्थानीय मशीन का होस्ट नाम लौटाता है। |
| static [Resolve](./resolve/)(String) | निर्दिष्ट होस्ट नाम का उपयोग करके एक नया IPHostEntry-class इंस्टेंस बनाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
