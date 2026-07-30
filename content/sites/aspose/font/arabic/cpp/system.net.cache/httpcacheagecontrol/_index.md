---
title: "System::Net::Cache::HttpCacheAgeControl تعداد"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Cache::HttpCacheAgeControl تعداد. يُستخدم CacheAgeControl لتحديد التفضيلات المتعلقة بعمر العنصر المخزن ومُحدّثه في C++."
type: docs
weight: 300
url: /ar/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


يُستخدم CacheAgeControl لتحديد التفضيلات فيما يتعلق بسن العنصر المخزن مؤقتًا وحداثته.

```cpp
enum class HttpCacheAgeControl
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| None | 0 | للاستخدام الداخلي فقط. |
| MinFresh | 1 | يمكن أخذ المحتوى من الذاكرة المؤقتة إذا كان الوقت المتبقي قبل الانتهاء أكبر من أو يساوي الوقت المحدد بهذه القيمة. |
| MaxAge | 2 | يمكن أخذ المحتوى من الذاكرة المؤقتة حتى يصبح أقدم من العمر المحدد بهذه القيمة. |
| MaxStale | 4 | يمكن أخذ المحتوى من الذاكرة المؤقتة بعد انتهاء صلاحيته حتى ينقضي الوقت المحدد بهذه القيمة. |
| MaxAgeAndMinFresh | 3 | MaxAge و MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge و MaxStale. |

## انظر أيضًا

* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
