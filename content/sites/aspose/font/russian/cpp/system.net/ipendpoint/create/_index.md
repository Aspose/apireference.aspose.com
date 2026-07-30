---
title: "System::Net::IPEndPoint::Create метод"
linktitle: "Create"
second_title: "Aspose.Font для C++"
description: "System::Net::IPEndPoint::Create метод. Создайте новый экземпляр класса EndPoint, используя указанный socket-адрес в C++."
type: docs
weight: 200
url: /ru/cpp/system.net/ipendpoint/create/
---
## IPEndPoint::Create method


Создайте новый экземпляр класса [EndPoint](../../endpoint/) с использованием указанного socket-адреса.

```cpp
System::SharedPtr<EndPoint> System::Net::IPEndPoint::Create(System::SharedPtr<SocketAddress> socketAddress) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| socketAddress | System::SharedPtr\<SocketAddress\> | Socket-адрес, который будет использоваться для инициализации нового экземпляра. |

### ReturnValue

Новосозданный экземпляр класса EndPoint.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../endpoint/)
* Class [SocketAddress](../../socketaddress/)
* Class [IPEndPoint](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
