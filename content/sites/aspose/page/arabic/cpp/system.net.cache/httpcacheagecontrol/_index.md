---
title: "System::Net::Cache::HttpCacheAgeControl تعداد"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Cache::HttpCacheAgeControl تعداد. يُستخدم CacheAgeControl لتحديد التفضيلات المتعلقة بعمر العنصر المخزن المؤقتًا وحداثته في C++."
type: docs
weight: 300
url: /ar/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


يُستخدم CacheAgeControl لتحديد التفضيلات المتعلقة بعمر العنصر المخزن وتحديثه.

```cpp
enum class HttpCacheAgeControl
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| لا شيء | 0 | للاستخدام الداخلي فقط. |
| MinFresh | 1 | يمكن أخذ المحتوى من التخزين المؤقت إذا كان الوقت المتبقي قبل الانتهاء أكبر من أو يساوي الوقت المحدد بهذه القيمة. |
| MaxAge | 2 | يمكن جلب المحتوى من الذاكرة المؤقتة حتى يصبح أقدم من العمر المحدد بهذه القيمة. |
| MaxStale | 4 | يمكن أخذ المحتوى من الذاكرة المؤقتة بعد انتهاء صلاحيته حتى ينقضي الوقت المحدد بهذه القيمة. |
| MaxAgeAndMinFresh | 3 | MaxAge و MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge و MaxStale. |

## انظر أيضًا

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
