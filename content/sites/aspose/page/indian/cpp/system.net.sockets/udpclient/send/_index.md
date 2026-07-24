---
title: "System::Net::Sockets::UdpClient::Send मेथड"
linktitle: "भेजें"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::UdpClient::Send मेथड। C++ में एक UDP डेटाग्राम को रिमोट होस्ट पर भेजता है।"
type: docs
weight: 700
url: /hi/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


रिमोट होस्ट को UDP डेटाग्राम भेजता है।

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | भेजने के लिए [Byte](../../../system/byte/) प्रकार की एक एरे। |
| बाइट्स | int32_t | डेटाग्राम में बाइट्स की संख्या। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


निर्दिष्ट रिमोट होस्ट पर निर्दिष्ट पोर्ट को UDP डेटाग्राम भेजता है।

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | भेजने के लिए [Byte](../../../system/byte/) प्रकार की एक एरे |
| बाइट्स | int32_t | डेटाग्राम में बाइट्स की संख्या। |
| होस्टनाम | String | रिमोट होस्ट का नाम। |
| पोर्ट | int32_t | रिमोट पोर्ट नंबर। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


रिमोट एंड पॉइंट पर होस्ट को UDP डेटाग्राम भेजता है।

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | भेजने के लिए [Byte](../../../system/byte/) प्रकार की एक एरे |
| बाइट्स | int32_t | डेटाग्राम में बाइट्स की संख्या। |
| endPoint | System::SharedPtr\<IPEndPoint\> | एक [IPEndPoint](../../../system.net/ipendpoint/) जो होस्ट और पोर्ट को दर्शाता है जिससे डेटाग्राम भेजा जाएगा। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
