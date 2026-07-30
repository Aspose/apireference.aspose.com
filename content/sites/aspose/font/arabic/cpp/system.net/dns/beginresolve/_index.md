---
title: "طريقة System::Net::Dns::BeginResolve"
linktitle: "BeginResolve"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Dns::BeginResolve. تبدأ عملية غير متزامنة لإنشاء نسخة جديدة من فئة IPHostEntry باستخدام اسم المضيف المحدد في C++."
type: docs
weight: 400
url: /ar/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


يبدأ عملية غير متزامنة لإنشاء نسخة من IPHostEntry-class باستخدام اسم المضيف المحدد.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| hostName | String | اسم مضيف يُستخدم لإنشاء نسخة جديدة من الفئة [IPHostEntry](../../iphostentry/). |
| requestCallback | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| stateObject | System::SharedPtr\<Object\> | بيانات يقدمها المستخدم تُستخدم لتحديد كل عملية غير متزامنة بشكل فريد. |

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
