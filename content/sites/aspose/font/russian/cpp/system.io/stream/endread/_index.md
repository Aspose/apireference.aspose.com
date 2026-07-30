---
title: "System::IO::Stream::EndRead метод"
linktitle: "EndRead"
second_title: "Aspose.Font для C++"
description: "System::IO::Stream::EndRead метод. Ожидает завершения указанной асинхронной операции чтения в C++."
type: docs
weight: 600
url: /ru/cpp/system.io/stream/endread/
---
## Stream::EndRead method


Ожидает завершения указанной асинхронной операции чтения.

```cpp
virtual int System::IO::Stream::EndRead(System::SharedPtr<System::IAsyncResult> asyncResult)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<System::IAsyncResult\> | Объект [IAsyncResult](../../../system/iasyncresult/), представляющий асинхронную операцию чтения. |

### ReturnValue

Количество байтов, прочитанных во время операции чтения, представленной **asyncResult**

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
