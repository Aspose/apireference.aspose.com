---
title: "System::Net::Sockets::NetworkStream::EndRead method"
linktitle: "EndRead"
second_title: "Aspose.Font для C++"
description: "System::Net::Sockets::NetworkStream::EndRead method. Ожидает завершения указанной асинхронной операции чтения в C++."
type: docs
weight: 600
url: /ru/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


Ожидает завершения указанной асинхронной операции чтения.

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Объект [IAsyncResult](../../../system/iasyncresult/), представляющий асинхронную операцию чтения. |

### ReturnValue

Количество байтов, прочитанных во время операции чтения, представленной **asyncResult**

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
