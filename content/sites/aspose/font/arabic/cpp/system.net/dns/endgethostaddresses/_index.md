---
title: "System::Net::Dns::EndGetHostAddresses طريقة"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Dns::EndGetHostAddresses طريقة. ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء كائن جديد من فئة IPHostEntry-class في C++."
type: docs
weight: 500
url: /ar/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء نسخة من IPHostEntry-class.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) الذي يمثل عملية غير متزامنة. |

### ReturnValue

كائن جديد تم إنشاؤه من فئة IPHostEntry-class.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
