---
title: "Метод System::Net::Dns::EndGetHostAddresses"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Font для C++"
description: "Метод System::Net::Dns::EndGetHostAddresses. Ожидает завершения указанной асинхронной операции по созданию нового экземпляра IPHostEntry‑class в C++."
type: docs
weight: 500
url: /ru/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Ожидает завершения указанной асинхронной операции создания нового экземпляра IPHostEntry-class.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Объект [IAsyncResult](../../../system/iasyncresult/), представляющий асинхронную операцию. |

### ReturnValue

Новый экземпляр IPHostEntry‑class.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
