---
title: "System::Net::Dns::BeginResolve الطريقة"
linktitle: "BeginResolve"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Dns::BeginResolve الطريقة. يبدأ عملية غير متزامنة لإنشاء نسخة جديدة من الفئة IPHostEntry باستخدام اسم المضيف المحدد في C++."
type: docs
weight: 400
url: /ar/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


يبدأ عملية غير متزامنة لإنشاء مثيل من الفئة IPHostEntry باستخدام اسم المضيف المحدد.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| hostName | String | اسم مضيف يُستخدم لإنشاء نسخة جديدة من الفئة [IPHostEntry](../../iphostentry/). |
| requestCallback | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| stateObject | System::SharedPtr\<Object\> | بيانات مقدمة من المستخدم تُستخدم لتحديد كل عملية غير متزامنة بشكل فريد. |

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
* Library [Aspose.Page for C++](../../../)
