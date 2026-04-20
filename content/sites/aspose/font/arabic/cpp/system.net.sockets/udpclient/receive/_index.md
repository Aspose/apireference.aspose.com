---
title: "System::Net::Sockets::UdpClient::Receive method"
linktitle: "استلام"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::UdpClient::Receive method. يُرجِع حزمة بيانات أُرسلت من خادم في C++."
type: docs
weight: 600
url: /ar/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


يرجع حزمة بيانات أُرسلت من قبل الخادم.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | ‏[IPEndPoint](../../../system.net/ipendpoint/) الذي يمثل المضيف البعيد الذي أُرسلت منه البيانات. |

### ReturnValue

مصفوفة بايت حيث سيتم تعيين البيانات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
