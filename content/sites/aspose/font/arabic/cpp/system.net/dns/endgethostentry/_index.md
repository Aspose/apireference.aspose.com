---
title: "طريقة System::Net::Dns::EndGetHostEntry"
linktitle: "EndGetHostEntry"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Dns::EndGetHostEntry. تنتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء نسخة جديدة من فئة IPHostEntry في C++."
type: docs
weight: 700
url: /ar/cpp/system.net/dns/endgethostentry/
---
## Dns::EndGetHostEntry method


ينتظر حتى تكتمل العملية غير المتزامنة المحددة لإنشاء نسخة من IPHostEntry-class.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndGetHostEntry(System::SharedPtr<IAsyncResult> asyncResult)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | كائن [IAsyncResult](../../../system/iasyncresult/) الذي يمثل عملية غير متزامنة. |

### ReturnValue

كائن جديد تم إنشاؤه من فئة IPHostEntry-class.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
