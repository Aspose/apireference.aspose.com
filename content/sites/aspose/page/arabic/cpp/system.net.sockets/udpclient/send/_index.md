---
title: "طريقة System::Net::Sockets::UdpClient::Send"
linktitle: "إرسال"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::Sockets::UdpClient::Send. تُرسل حزمة UDP إلى مضيف بعيد في C++."
type: docs
weight: 700
url: /ar/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


يرسل حزمة UDP إلى مضيف بعيد.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | مصفوفة من النوع [Byte](../../../system/byte/) للإرسال. |
| بايتات | int32_t | عدد البايتات في الحزمة. |

### ReturnValue

عدد البايتات التي تم إرسالها.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


يرسل حزمة UDP إلى المنفذ المحدد على المضيف البعيد المحدد.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | مصفوفة من النوع [Byte](../../../system/byte/) للإرسال |
| بايتات | int32_t | عدد البايتات في الحزمة. |
| اسم المضيف | String | اسم المضيف البعيد. |
| port | int32_t | رقم المنفذ البعيد. |

### ReturnValue

عدد البايتات التي تم إرسالها.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


يرسل حزمة UDP إلى المضيف عند نقطة النهاية البعيدة.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | مصفوفة من النوع [Byte](../../../system/byte/) للإرسال |
| بايتات | int32_t | عدد البايتات في الحزمة. |
| endPoint | System::SharedPtr\<IPEndPoint\> | [IPEndPoint](../../../system.net/ipendpoint/) الذي يمثل المضيف والمنفذ الذي تُرسل إليه الحزمة. |

### ReturnValue

عدد البايتات التي تم إرسالها.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
