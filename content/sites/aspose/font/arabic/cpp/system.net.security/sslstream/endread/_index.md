---
title: "System::Net::Security::SslStream::EndRead طريقة"
linktitle: "EndRead"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Security::SslStream::EndRead طريقة. ينتظر حتى تكتمل عملية القراءة غير المتزامنة المحددة في C++."
type: docs
weight: 700
url: /ar/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


ينتظر حتى يكتمل عملية القراءة غير المتزامنة المحددة.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية قراءة غير متزامنة |

### ReturnValue

عدد البايتات المقروءة أثناء عملية القراءة الممثلة بـ **asyncResult**

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
