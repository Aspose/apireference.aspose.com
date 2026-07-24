---
title: "System::Net::Dns::BeginGetHostEntry الطريقة"
linktitle: "BeginGetHostEntry"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Dns::BeginGetHostEntry الطريقة. يبدأ عملية غير متزامنة لإنشاء نسخة جديدة من الفئة IPHostEntry باستخدام السلسلة المحددة التي تحتوي على اسم مضيف أو عنوان IP في C++."
type: docs
weight: 300
url: /ar/cpp/system.net/dns/begingethostentry/
---
## Dns::BeginGetHostEntry(String, AsyncCallback, System::SharedPtr\<Object\>) method


يبدأ عملية غير متزامنة لإنشاء مثيل من الفئة IPHostEntry باستخدام السلسلة المحددة التي تحتوي على اسم مضيف أو عنوان IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| hostNameOrAddress | String | السلسلة التي تحتوي على اسم مضيف أو عنوان IP. |
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
## Dns::BeginGetHostEntry(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) method


يبدأ عملية غير متزامنة لإنشاء مثيل من الفئة IPHostEntry باستخدام عنوان IP المحدد.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(System::SharedPtr<IPAddress> address, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| عنوان | System::SharedPtr\<IPAddress\> | عنوان IP. |
| requestCallback | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| stateObject | System::SharedPtr\<Object\> | بيانات مقدمة من المستخدم تُستخدم لتحديد كل عملية غير متزامنة بشكل فريد. |

### ReturnValue

كائن [IAsyncResult](../../../system/iasyncresult/) يمثل العملية غير المتزامنة التي تم بدءها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
