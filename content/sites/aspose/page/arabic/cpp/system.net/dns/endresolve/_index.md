---
title: "System::Net::Dns::EndResolve الطريقة"
linktitle: "EndResolve"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Dns::EndResolve الطريقة. ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء نسخة جديدة من الفئة IPHostEntry في C++."
type: docs
weight: 800
url: /ar/cpp/system.net/dns/endresolve/
---
## Dns::EndResolve method


ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء مثيل من الفئة IPHostEntry.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndResolve(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية غير متزامنة. |

### ReturnValue

مثيل جديد تم إنشاؤه من الفئة IPHostEntry.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
