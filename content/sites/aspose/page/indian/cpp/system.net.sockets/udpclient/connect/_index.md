---
title: "System::Net::Sockets::UdpClient::Connect मेथड"
linktitle: "Connect"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::UdpClient::Connect मेथड। C++ में निर्दिष्ट होस्ट पर निर्दिष्ट पोर्ट से कनेक्शन स्थापित करता है।"
type: docs
weight: 300
url: /hi/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


निर्दिष्ट होस्ट पर निर्दिष्ट पोर्ट से कनेक्शन स्थापित करता है।

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| होस्टनाम | String | रिमोट DNS होस्ट का नाम जिससे आप कनेक्ट होना चाहते हैं। |
| पोर्ट | int32_t | जिस स्थानीय पोर्ट नंबर से आप संचार करना चाहते हैं। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


निर्दिष्ट पोर्ट पर निर्दिष्ट पते पर होस्ट के साथ कनेक्शन स्थापित करता है।

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | रिमोट होस्ट का [IPAddress](../../../system.net/ipaddress/) जिससे डेटा भेजा जाता है। |
| पोर्ट | int32_t | जिस स्थानीय पोर्ट नंबर से आप संचार करना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


रिमोट एंड पॉइंट से कनेक्शन स्थापित करता है।

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| endPoint | System::SharedPtr\<IPEndPoint\> | एंडपॉइंट जिससे आप UDP कनेक्शन को बाइंड करते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
