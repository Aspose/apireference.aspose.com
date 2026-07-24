---
title: "طريقة System::Net::Security::SslStream::EndRead"
linktitle: "EndRead"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::Security::SslStream::EndRead. تنتظر حتى يكتمل عملية القراءة غير المتزامنة المحددة في C++."
type: docs
weight: 700
url: /ar/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


ينتظر حتى تكتمل عملية القراءة غير المتزامنة المحددة.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية قراءة غير متزامنة |

### ReturnValue

عدد البايتات المقروءة أثناء عملية القراءة التي يمثلها **asyncResult**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
