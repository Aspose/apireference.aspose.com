---
title: "System::Net::Security::SslStream::EndRead method"
linktitle: "EndRead"
second_title: "Aspose.Font для C++"
description: "System::Net::Security::SslStream::EndRead method. Ожидает завершения указанной асинхронной операции чтения в C++."
type: docs
weight: 700
url: /ru/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


Ожидает завершения указанной асинхронной операции чтения.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Объект [IAsyncResult](../../../system/iasyncresult/), представляющий асинхронную операцию чтения. |

### ReturnValue

Количество байтов, прочитанных во время операции чтения, представленной **asyncResult**

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
