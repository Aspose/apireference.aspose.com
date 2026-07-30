---
title: "System::Net::Sockets::UdpClient::Receive метод"
linktitle: "Получить"
second_title: "Aspose.Font для C++"
description: "System::Net::Sockets::UdpClient::Receive метод. Возвращает датаграмму, отправленную сервером в C++."
type: docs
weight: 600
url: /ru/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


Возвращает датаграмму, отправленную сервером.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | Объект [IPEndPoint](../../../system.net/ipendpoint/) представляющий удалённый хост, от которого были отправлены данные. |

### ReturnValue

Массив байтов, в который будут записаны полученные данные.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
