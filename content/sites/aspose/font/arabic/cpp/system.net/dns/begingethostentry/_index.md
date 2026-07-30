---
title: "طريقة System::Net::Dns::BeginGetHostEntry"
linktitle: "BeginGetHostEntry"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::Dns::BeginGetHostEntry. تبدأ عملية غير متزامنة لإنشاء نسخة جديدة من فئة IPHostEntry باستخدام السلسلة المحددة التي تحتوي على اسم مضيف أو عنوان IP في C++."
type: docs
weight: 300
url: /ar/cpp/system.net/dns/begingethostentry/
---
## Dns::BeginGetHostEntry(String, AsyncCallback, System::SharedPtr\<Object\>) method


يبدأ عملية غير متزامنة لإنشاء نسخة من IPHostEntry-class باستخدام السلسلة المحددة التي تحتوي على اسم مضيف أو عنوان IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| hostNameOrAddress | String | السلسلة التي تحتوي على اسم مضيف أو عنوان IP. |
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
## Dns::BeginGetHostEntry(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) method


يبدأ عملية غير متزامنة لإنشاء نسخة من IPHostEntry-class باستخدام عنوان IP المحدد.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(System::SharedPtr<IPAddress> address, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| العنوان | System::SharedPtr\<IPAddress\> | عنوان IP. |
| requestCallback | AsyncCallback | دالة رد نداء تُستدعى عند إكمال العملية. |
| stateObject | System::SharedPtr\<Object\> | بيانات يقدمها المستخدم تُستخدم لتحديد كل عملية غير متزامنة بشكل فريد. |

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
* Library [Aspose.Font for C++](../../../)
