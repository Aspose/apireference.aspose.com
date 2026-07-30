---
title: "طريقة System::Net::Dns::BeginGetHostAddresses"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Dns::BeginGetHostAddresses. تبدأ عملية غير متزامنة لإنشاء مثيل جديد من الفئة IPHostEntry‑class باستخدام السلسلة المحددة التي تحتوي على اسم مضيف أو عنوان IP في C++."
type: docs
weight: 100
url: /ar/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


يبدأ عملية غير متزامنة لإنشاء نسخة من IPHostEntry-class باستخدام السلسلة المحددة التي تحتوي على اسم مضيف أو عنوان IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| hostNameOrAddress | String | سلسلة تحتوي على اسم مضيف أو عنوان IP. |
| requestCallback | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| الحالة | System::SharedPtr\<Object\> | بيانات يقدمها المستخدم تُستخدم لتحديد كل عملية غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل العملية غير المتزامنة التي تم بدءها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
