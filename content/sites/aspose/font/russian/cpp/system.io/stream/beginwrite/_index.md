---
title: "System::IO::Stream::BeginWrite метод"
linktitle: "BeginWrite"
second_title: "Aspose.Font для C++"
description: "System::IO::Stream::BeginWrite метод. Инициирует асинхронную операцию записи в C++."
type: docs
weight: 200
url: /ru/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


Инициирует асинхронную операцию записи.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | Буфер, содержащий данные для записи |
| смещение | int | Смещение, начинающееся с 0, в **buffer**, указывающее позицию, с которой начинаются данные для записи. |
| count | int | Количество байтов для записи |
| обратный вызов | System::AsyncCallback | Обратный вызов, который будет вызван после завершения операции. |
| состояние | System::SharedPtr\<System::Object\> | Данные, предоставленные пользователем, используемые для уникальной идентификации каждой асинхронной операции записи |

### ReturnValue

Объект [IAsyncResult](../../../system/iasyncresult/), представляющий инициированную асинхронную операцию записи

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
