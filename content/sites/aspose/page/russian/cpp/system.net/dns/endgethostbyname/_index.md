---
title: "System::Net::Dns::EndGetHostByName метод"
linktitle: "EndGetHostByName"
second_title: "Aspose.Page для C++"
description: "System::Net::Dns::EndGetHostByName метод. Ожидает завершения указанной асинхронной операции по созданию нового экземпляра класса IPHostEntry в C++."
type: docs
weight: 600
url: /ru/cpp/system.net/dns/endgethostbyname/
---
## Dns::EndGetHostByName method


Ожидает завершения указанной асинхронной операции по созданию нового экземпляра IPHostEntry-class.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndGetHostByName(System::SharedPtr<IAsyncResult> asyncResult)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Объект [IAsyncResult](../../../system/iasyncresult/), представляющий асинхронную операцию. |

### ReturnValue

Новый экземпляр класса IPHostEntry.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
