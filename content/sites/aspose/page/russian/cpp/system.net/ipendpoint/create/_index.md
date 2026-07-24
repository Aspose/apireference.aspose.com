---
title: "System::Net::IPEndPoint::Create метод"
linktitle: "Создать"
second_title: "Aspose.Page для C++"
description: "System::Net::IPEndPoint::Create метод. Создаёт новый экземпляр класса EndPoint, используя указанный socket address в C++."
type: docs
weight: 200
url: /ru/cpp/system.net/ipendpoint/create/
---
## IPEndPoint::Create method


Создайте новый экземпляр класса [EndPoint](../../endpoint/) с использованием указанного socket address.

```cpp
System::SharedPtr<EndPoint> System::Net::IPEndPoint::Create(System::SharedPtr<SocketAddress> socketAddress) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| socketAddress | System::SharedPtr\<SocketAddress\> | Сокет-адрес, который будет использоваться для инициализации нового экземпляра. |

### ReturnValue

Новый созданный экземпляр класса EndPoint.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../endpoint/)
* Class [SocketAddress](../../socketaddress/)
* Class [IPEndPoint](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
