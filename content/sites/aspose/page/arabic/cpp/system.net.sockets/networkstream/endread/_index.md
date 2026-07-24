---
title: "System::Net::Sockets::NetworkStream::EndRead طريقة"
linktitle: "EndRead"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Sockets::NetworkStream::EndRead طريقة. ينتظر حتى تكتمل عملية القراءة غير المتزامنة المحددة في C++."
type: docs
weight: 600
url: /ar/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


ينتظر حتى تكتمل عملية القراءة غير المتزامنة المحددة.

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية قراءة غير متزامنة |

### ReturnValue

عدد البايتات المقروءة أثناء عملية القراءة التي يمثلها **asyncResult**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
