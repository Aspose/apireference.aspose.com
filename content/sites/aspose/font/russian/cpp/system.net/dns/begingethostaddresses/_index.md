---
title: "Метод System::Net::Dns::BeginGetHostAddresses"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Font для C++"
description: "Метод System::Net::Dns::BeginGetHostAddresses. Инициирует асинхронную операцию по созданию нового экземпляра IPHostEntry-class, используя указанную строку, содержащую имя хоста или IP-адрес, в C++."
type: docs
weight: 100
url: /ru/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


Инициирует асинхронную операцию создания нового экземпляра IPHostEntry-class, используя указанную строку, содержащую имя хоста или IP-адрес.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| hostNameOrAddress | String | Строка, содержащая имя хоста или IP‑адрес. |
| requestCallback | AsyncCallback | Обратный вызов, который будет вызван после завершения операции. |
| состояние | System::SharedPtr\<Object\> | Пользовательские данные, используемые для уникальной идентификации каждой асинхронной операции. |

### ReturnValue

Объект [IAsyncResult](../../../system/iasyncresult/), представляющий инициированную асинхронную операцию.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
