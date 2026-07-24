---
title: "System::Net::Cache::HttpRequestCacheLevel تعداد"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Cache::HttpRequestCacheLevel تعداد. يصف هذا التعداد إعدادات التخزين المؤقت لـ HTTP في C++."
type: docs
weight: 400
url: /ar/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


يصف التعداد إعدادات التخزين المؤقت لـ HTTP.

```cpp
enum class HttpRequestCacheLevel
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Default | 0 | يفي بطلب مورد إما باستخدام النسخة المخزنة مؤقتًا من المورد أو بإرسال طلب للمورد إلى الخادم. |
| BypassCache | 1 | يفي بطلب باستخدام الخادم. |
| CacheOnly | 2 | دائمًا يستخدم التخزين المؤقت للعميل للحصول على مورد. |
| CacheIfAvailable | 3 | يُلبي طلبًا لمورد من الذاكرة المؤقتة إذا كان المورد متاحًا، وإلا يرسل طلبًا إلى الخادم. |
| إعادة التحقق | 4 | استخدام نسخة محلية من المورد إذا كان طابع الوقت الخاص بالعميل هو نفسه طابع الوقت للمورد على الخادم. وإلا يتم تنزيل المورد من الخادم. |
| إعادة التحميل | 5 | يتم دائمًا تنزيل المورد من الخادم. |
| NoCacheNoStore | 6 | لا يلبي الطلب أبدًا باستخدام الموارد من الذاكرة المؤقتة ولا يقوم بتخزين الموارد. |
| CacheOrNextCacheOnly | 7 | يفي بطلب مورد إما من التخزين المؤقت للكمبيوتر المحلي أو من تخزين مؤقت بعيد على الشبكة المحلية. |
| Refresh | 8 | يفي بطلب باستخدام الخادم أو تخزين مؤقت غير التخزين المؤقت المحلي. |

## انظر أيضًا

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
