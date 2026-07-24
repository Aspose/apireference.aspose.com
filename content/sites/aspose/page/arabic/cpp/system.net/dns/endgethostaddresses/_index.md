---
title: "System::Net::Dns::EndGetHostAddresses طريقة"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Dns::EndGetHostAddresses طريقة. ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء مثيل جديد من الفئة IPHostEntry في C++."
type: docs
weight: 500
url: /ar/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء مثيل من الفئة IPHostEntry.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) يمثل عملية غير متزامنة. |

### ReturnValue

مثيل جديد تم إنشاؤه من الفئة IPHostEntry.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
