---
title: "System::Net::Sockets::UdpClient::Connect طريقة"
linktitle: "Connect"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Sockets::UdpClient::Connect طريقة. يُنشئ اتصالاً بالمنفذ المحدد على المضيف المحدد في C++."
type: docs
weight: 300
url: /ar/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


يقيم اتصالًا إلى المنفذ المحدد على المضيف المحدد.

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| اسم المضيف | String | اسم مضيف DNS البعيد الذي تنوي الاتصال به. |
| port | int32_t | رقم المنفذ المحلي الذي تنوي التواصل من خلاله. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


يقيم اتصالًا مع المضيف على العنوان المحدد على المنفذ المحدد.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | عنوان [IPAddress](../../../system.net/ipaddress/) للمضيف البعيد الذي تُرسل إليه البيانات. |
| port | int32_t | رقم المنفذ المحلي الذي تنوي التواصل من خلاله. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


يقيم اتصالًا بنقطة النهاية البعيدة.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| نقطة النهاية | System::SharedPtr\<IPEndPoint\> | نقطة النهاية التي تقوم بربط اتصال UDP بها. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
