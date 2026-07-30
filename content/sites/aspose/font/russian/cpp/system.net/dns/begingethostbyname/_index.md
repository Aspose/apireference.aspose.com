---
title: "Метод System::Net::Dns::BeginGetHostByName"
linktitle: "BeginGetHostByName"
second_title: "Aspose.Font для C++"
description: "Метод System::Net::Dns::BeginGetHostByName. Инициирует асинхронную операцию по созданию нового экземпляра IPHostEntry‑class с использованием указанного имени хоста в C++."
type: docs
weight: 200
url: /ru/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


Инициирует асинхронную операцию создания нового экземпляра IPHostEntry-class, используя указанное имя хоста.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| hostName | String | Имя хоста. |
| requestCallback | AsyncCallback | Обратный вызов, который будет вызван после завершения операции. |
| stateObject | System::SharedPtr\<Object\> | Пользовательские данные, используемые для уникальной идентификации каждой асинхронной операции. |

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
