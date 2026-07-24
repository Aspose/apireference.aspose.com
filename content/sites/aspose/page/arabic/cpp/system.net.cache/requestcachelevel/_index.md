---
title: "System::Net::Cache::RequestCacheLevel enum"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Cache::RequestCacheLevel enum. يصف الـenum إعدادات الذاكرة المؤقتة القابلة للتطبيق على أي WebRequest في C++."
type: docs
weight: 500
url: /ar/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


يصف الـenum إعدادات الذاكرة المؤقتة القابلة للتطبيق على أي [WebRequest](../../system.net/webrequest/).

```cpp
enum class RequestCacheLevel
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| Default | 0 | يفي بطلب مورد إما باستخدام النسخة المخزنة مؤقتًا من المورد أو بإرسال طلب للمورد إلى الخادم. |
| BypassCache | 1 | يفي بطلب باستخدام الخادم. لا يتم أخذ أي مدخلات من الذاكرة المؤقتة. |
| CacheOnly | 2 | يفي بطلب لمورد فقط من الذاكرة المؤقتة. سيتم رمي [WebException](../../system.net/webexception/) عندما لا يكون المورد في ذاكرة العميل المؤقتة. |
| CacheIfAvailable | 3 | يُلبي طلبًا لمورد من الذاكرة المؤقتة إذا كان المورد متاحًا، وإلا يرسل طلبًا إلى الخادم. |
| إعادة التحقق | 4 | استخدام نسخة محلية من المورد إذا كان طابع الوقت الخاص بالعميل هو نفسه طابع الوقت للمورد على الخادم. وإلا يتم تنزيل المورد من الخادم. |
| إعادة التحميل | 5 | يتم دائمًا تنزيل المورد من الخادم. |
| NoCacheNoStore | 6 | لا يلبي الطلب أبدًا باستخدام الموارد من الذاكرة المؤقتة ولا يقوم بتخزين الموارد. |

## انظر أيضًا

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
