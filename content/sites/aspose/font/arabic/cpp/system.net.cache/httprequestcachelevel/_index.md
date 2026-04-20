---
title: "System::Net::Cache::HttpRequestCacheLevel تعداد"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Cache::HttpRequestCacheLevel تعداد. يصف هذا التعداد إعدادات الذاكرة المؤقتة لـ HTTP في C++."
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
| الافتراضي | 0 | يفي بطلب مورد إما باستخدام النسخة المخزنة مؤقتًا من المورد أو بإرسال طلب للمورد إلى الخادم. |
| BypassCache | 1 | يفي بطلب باستخدام الخادم. |
| CacheOnly | 2 | دائمًا يستخدم ذاكرة التخزين المؤقت للعميل للحصول على مورد. |
| CacheIfAvailable | 3 | يفي بطلب لمورد من الذاكرة المؤقتة إذا كان المورد متاحًا، وإلا يرسل طلبًا إلى الخادم. |
| Revalidate | 4 | استخدام نسخة محلية من المورد إذا كان طابع الوقت للعميل هو نفسه طابع الوقت للمورد على الخادم. وإلا، يتم تنزيل المورد من خادم. |
| Reload | 5 | يتم دائمًا تنزيل المورد من الخادم. |
| NoCacheNoStore | 6 | لا يفي أبدًا بطلب باستخدام الموارد من الذاكرة المؤقتة ولا يخزن الموارد في الذاكرة المؤقتة. |
| CacheOrNextCacheOnly | 7 | يلبي طلبًا للحصول على مورد إما من ذاكرة التخزين المؤقت للجهاز المحلي أو من ذاكرة تخزين مؤقت عن بُعد على الشبكة المحلية. |
| تحديث | 8 | يلبي طلبًا باستخدام الخادم أو ذاكرة تخزين مؤقت غير الذاكرة المؤقتة المحلية. |

## انظر أيضًا

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
