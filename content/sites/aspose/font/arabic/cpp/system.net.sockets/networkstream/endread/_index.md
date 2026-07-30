---
title: "طريقة System::Net::Sockets::NetworkStream::EndRead"
linktitle: "EndRead"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Sockets::NetworkStream::EndRead. تنتظر حتى تكتمل عملية القراءة غير المتزامنة المحددة في C++."
type: docs
weight: 600
url: /ar/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


ينتظر حتى يكتمل عملية القراءة غير المتزامنة المحددة.

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية قراءة غير متزامنة |

### ReturnValue

عدد البايتات المقروءة أثناء عملية القراءة الممثلة بـ **asyncResult**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
