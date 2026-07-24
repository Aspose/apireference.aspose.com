---
title: "System::Net::IPAddress क्लास"
linktitle: "IPAddress"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::IPAddress क्लास। IP पता का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 2400
url: /hi/cpp/system.net/ipaddress/
---
## IPAddress class


IP पते का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके फ़ंक्शनों को तर्क के रूप में पास करें।

```cpp
class IPAddress : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_AddressFamily](./get_addressfamily/)() | पता परिवार लौटाता है। |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | एक मान लौटाता है जो दर्शाता है कि पता IPv4 पता है और IPv6 पते में मैप किया गया है या नहीं। |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | एक मान लौटाता है जो दर्शाता है कि पता IPv6 लिंक-लोकल पता है या नहीं। |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | एक मान लौटाता है जो दर्शाता है कि पता एक वैश्विक IPv6 मल्टीकास्ट पता है या नहीं। |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | एक मान लौटाता है जो दर्शाता है कि पता IPv6 साइट-लोकल पता है या नहीं। |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | एक मान लौटाता है जो दर्शाता है कि पता IPv6 टेरिडो पता है या नहीं। |
| [get_ScopeId](./get_scopeid/)() | IPv6 पते का स्कोप पहचानकर्ता प्राप्त करता है। |
| [GetAddressBytes](./getaddressbytes/)() | IP पते का बाइट एरे लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| [GetImpl](./getimpl/)() const | इम्प्लीमेंटेशन के लिए एक पॉइंटर लौटाता है। |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | निर्दिष्ट होस्ट बाइट क्रम को संबंधित नेटवर्क बाइट क्रम में परिवर्तित करता है। |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | निर्दिष्ट होस्ट बाइट क्रम को संबंधित नेटवर्क बाइट क्रम में परिवर्तित करता है। |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | निर्दिष्ट होस्ट बाइट क्रम को संबंधित नेटवर्क बाइट क्रम में परिवर्तित करता है। |
| [IPAddress](./ipaddress/)(int64_t) | एक नया उदाहरण बनाता है। |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | एक नया उदाहरण बनाता है। |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | एक नया उदाहरण बनाता है। |
| [IPAddress](./ipaddress/)() | एक नया उदाहरण बनाता है। |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | एक मान लौटाता है जो दर्शाता है कि निर्दिष्ट पता लूपबैक पता है या नहीं। |
| [MapToIPv4](./maptoipv4/)() | पते को IPv4 पते में मैप करता है। |
| [MapToIPv6](./maptoipv6/)() | पते को IPv6 पते में मैप करता है। |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | निर्दिष्ट नेटवर्क बाइट क्रम को संबंधित होस्ट बाइट क्रम में परिवर्तित करता है। |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | निर्दिष्ट नेटवर्क बाइट क्रम को संबंधित होस्ट बाइट क्रम में परिवर्तित करता है। |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | निर्दिष्ट नेटवर्क बाइट क्रम को संबंधित होस्ट बाइट क्रम में परिवर्तित करता है। |
| static [Parse](./parse/)(String) | प्रदान की गई स्ट्रिंग को [IPAddress](./) क्लास की एक इंस्टेंस में परिवर्तित करता है। |
| [set_ScopeId](./set_scopeid/)(int64_t) | IPv6 पता का स्कोप पहचानकर्ता सेट करता है। |
| [SetImpl](./setimpl/)(ImplPtr) | इम्प्लीमेंटेशन के लिए एक पॉइंटर सेट करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | पास की गई स्ट्रिंग को [IPAddress](./) क्लास का एक इंस्टेंस में बदलने का प्रयास करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Any](./any/) | RTTI जानकारी। |
| static [Broadcast](./broadcast/) | IPv4 ब्रॉडकास्ट पता। |
| static [IPv6Any](./ipv6any/) | IPv6 पता जो दर्शाता है कि सर्वर को सभी नेटवर्क इंटरफ़ेस सुनने चाहिए। |
| static [IPv6Loopback](./ipv6loopback/) | IPv6 लूपबैक पता। |
| static [IPv6None](./ipv6none/) | IPv6 पता जो दर्शाता है कि सर्वर को किसी भी नेटवर्क इंटरफ़ेस को सुनना नहीं चाहिए। |
| static [Loopback](./loopback/) | IPv4 लूपबैक पता। |
| static [None](./none/) | IPv4 पता जो दर्शाता है कि सर्वर को किसी भी नेटवर्क इंटरफ़ेस को सुनना नहीं चाहिए। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ImplPtr](./implptr/) | इम्प्लीमेंटेशन प्रकार के लिए एक पॉइंटर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
