---
title: "System::Net::Security::SslStream::BeginRead method"
linktitle: "BeginRead"
second_title: "Aspose.Font для C++"
description: "System::Net::Security::SslStream::BeginRead method. Инициирует асинхронную операцию чтения в C++."
type: docs
weight: 300
url: /ru/cpp/system.net.security/sslstream/beginread/
---
## SslStream::BeginRead method


Инициирует асинхронную операцию чтения.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Массив байтов, из которого читаются данные. |
| смещение | int32_t | Смещение в байтах в указанном массиве. |
| count | int32_t | Количество байтов для чтения. |
| asyncCallback | AsyncCallback | Обратный вызов, который будет вызван после завершения операции. |
| asyncState | System::SharedPtr\<Object\> | Пользовательские данные, используемые для уникальной идентификации каждой асинхронной операции чтения. |

### ReturnValue

Объект [IAsyncResult](../../../system/iasyncresult/), представляющий инициированную асинхронную операцию чтения.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
