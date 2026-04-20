---
title: "طريقة System::Net::Sockets::UdpClient::Connect"
linktitle: "Connect"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Sockets::UdpClient::Connect. تُنشئ اتصالاً بالمنفذ المحدد على المضيف المحدد في C++."
type: docs
weight: 300
url: /ar/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


يقوم بإنشاء اتصال إلى المنفذ المحدد على المضيف المحدد.

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| اسم المضيف | String | اسم مضيف DNS البعيد الذي تنوي الاتصال به. |
| منفذ | int32_t | رقم المنفذ المحلي الذي تنوي التواصل من خلاله. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


يقوم بإنشاء اتصال مع المضيف على العنوان المحدد على المنفذ المحدد.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | [IPAddress](../../../system.net/ipaddress/) للمضيف البعيد الذي تُرسل إليه البيانات. |
| منفذ | int32_t | رقم المنفذ المحلي الذي تنوي التواصل من خلاله. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


يقوم بإنشاء اتصال بنقطة النهاية البعيدة.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| نقطة النهاية | System::SharedPtr\<IPEndPoint\> | نقطة النهاية التي تربط بها اتصال UDP. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
