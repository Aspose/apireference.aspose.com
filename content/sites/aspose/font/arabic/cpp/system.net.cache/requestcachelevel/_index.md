---
title: "System::Net::Cache::RequestCacheLevel تعداد"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Cache::RequestCacheLevel تعداد. يصف التعداد إعدادات الذاكرة المؤقتة القابلة للتطبيق على أي WebRequest في C++."
type: docs
weight: 500
url: /ar/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


يصف التعداد إعدادات الذاكرة المؤقتة القابلة للتطبيق على أي [WebRequest](../../system.net/webrequest/).

```cpp
enum class RequestCacheLevel
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| الافتراضي | 0 | يفي بطلب مورد إما باستخدام النسخة المخزنة مؤقتًا من المورد أو بإرسال طلب للمورد إلى الخادم. |
| BypassCache | 1 | يفي بطلب باستخدام الخادم. لا يتم أخذ أي مدخلات من الذاكرة المؤقتة. |
| CacheOnly | 2 | يفي بطلب لمورد فقط من الذاكرة المؤقتة. سيتم إلقاء [WebException](../../system.net/webexception/) عندما لا يكون المورد في ذاكرة التخزين المؤقت للعميل. |
| CacheIfAvailable | 3 | يفي بطلب لمورد من الذاكرة المؤقتة إذا كان المورد متاحًا، وإلا يرسل طلبًا إلى الخادم. |
| Revalidate | 4 | استخدام نسخة محلية من المورد إذا كان طابع الوقت للعميل هو نفسه طابع الوقت للمورد على الخادم. وإلا، يتم تنزيل المورد من خادم. |
| Reload | 5 | يتم دائمًا تنزيل المورد من الخادم. |
| NoCacheNoStore | 6 | لا يفي أبدًا بطلب باستخدام الموارد من الذاكرة المؤقتة ولا يخزن الموارد في الذاكرة المؤقتة. |

## انظر أيضًا

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
