---
title: "System::Net::Dns::BeginGetHostByName طريقة"
linktitle: "BeginGetHostByName"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Dns::BeginGetHostByName طريقة. يبدأ عملية غير متزامنة لإنشاء مثيل جديد من الفئة IPHostEntry باستخدام اسم المضيف المحدد في C++."
type: docs
weight: 200
url: /ar/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


يبدأ عملية غير متزامنة لإنشاء مثيل من الفئة IPHostEntry باستخدام اسم المضيف المحدد.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| hostName | String | اسم مضيف. |
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
