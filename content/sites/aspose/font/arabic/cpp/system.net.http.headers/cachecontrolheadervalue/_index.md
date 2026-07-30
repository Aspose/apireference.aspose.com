---
title: "فئة System::Net::Http::Headers::CacheControlHeaderValue"
linktitle: "CacheControlHeaderValue"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::Http::Headers::CacheControlHeaderValue. تمثّل قيمة رأس ''Cache-Control''. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أخطاءً في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


يمثّل قيمة رأس 'Cache-Control'. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أخطاءً في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | ينشئ نسخة جديدة. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_Extensions](./get_extensions/)() | يعيد مجموعة رموز امتداد الذاكرة المؤقتة. |
| [get_MaxAge](./get_maxage/)() | يحصل على قيمة العمر الأقصى بالثواني التي تحدد الفترة التي سيقبل فيها العميل الاستجابة. |
| [get_MaxStale](./get_maxstale/)() | يحصل على القيمة التي تحدد ما إذا كان العميل سيقبل الاستجابات المنتهية الصلاحية. |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | يحصل على القيمة بالثواني التي تحدد الفترة التي سيقبل فيها العميل الاستجابات المنتهية الصلاحية. |
| [get_MinFresh](./get_minfresh/)() | يحصل على القيمة التي تحدد عمر الصلاحية. |
| [get_MustRevalidate](./get_mustrevalidate/)() | يحصل على القيمة التي تحدد ما إذا كان الخادم يتطلب إعادة التحقق من صحة إدخال الذاكرة المؤقتة عندما يصبح قديمًا. |
| [get_NoCache](./get_nocache/)() | معلومات RTTI. |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | يحصل على مجموعة أسماء الحقول في توجيه 'no-cache' في رأس 'Cache-Control'. |
| [get_NoStore](./get_nostore/)() | يحصل على القيمة التي تحدد ما إذا كان يجب على الذاكرة المؤقتة عدم تخزين أي جزء من طلب HTTP أو استجابة. |
| [get_NoTransform](./get_notransform/)() | يحصل على القيمة التي تحدد ما إذا كان يجب على الذاكرة المؤقتة أو الوكيل عدم تغيير أي جزء من جسم الكيان. |
| [get_OnlyIfCached](./get_onlyifcached/)() | يحصل على القيمة التي تحدد ما إذا كان يجب على العميل استخدام إدخالات مخزنة فقط. |
| [get_Private](./get_private/)() | يحصل على القيمة التي تحدد ما إذا كانت رسالة استجابة HTTP أو جزء منها موجهة لمستخدم واحد ولا يجب أن تُخزن في ذاكرة مؤقتة مشتركة. |
| [get_PrivateHeaders](./get_privateheaders/)() | يحصل على مجموعة أسماء الحقول في توجيه 'private' في رأس 'Cache-Control'. |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | يحصل على القيمة التي تحدد ما إذا كان الخادم يتطلب إعادة التحقق من صحة إدخال الذاكرة المؤقتة عندما يصبح قديمًا للذاكرات المؤقتة المشتركة لوكلاء المستخدم. |
| [get_Public](./get_public/)() | يحصل على القيمة التي تحدد ما إذا كان يمكن تخزين استجابة HTTP في أي ذاكرة مؤقتة. |
| [get_SharedMaxAge](./get_sharedmaxage/)() | يحصل على قيمة العمر الأقصى المشتركة بالثواني التي تتجاوز توجيه 'max-age' في رأس 'Cache-Control'. أو رأس 'Expires' لذاكرة مؤقتة مشتركة. |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى نسخة من الفئة [CacheControlHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [Parse](./parse/)(String) | يحوّل سلسلة مُمرَّرة إلى نسخة من الفئة [CacheControlHeaderValue](./). |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | يضبط قيمة العمر الأقصى بالثواني التي تحدد فترة زمنية يمكن للعميل خلالها قبول استجابة. |
| [set_MaxStale](./set_maxstale/)(bool) | يضبط القيمة التي تحدد ما إذا كان العميل سيقبل الاستجابات المنتهية. |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | يضبط القيمة بالثواني التي تحدد الوقت الذي يمكن للعميل خلاله قبول الاستجابات المنتهية. |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | يضبط القيمة التي تحدد عمر الصلاحية. |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | يضبط القيمة التي تحدد ما إذا كان الخادم يتطلب إعادة التحقق من صحة إدخال الذاكرة المؤقتة عندما يصبح قديمًا. |
| [set_NoCache](./set_nocache/)(bool) | يضبط القيمة التي تحدد ما إذا كان العميل سيقبل استجابة مخزنة. |
| [set_NoStore](./set_nostore/)(bool) | يضبط القيمة التي تحدد ما إذا كان يجب على الذاكرة المؤقتة عدم تخزين أي جزء من طلب HTTP أو استجابة. |
| [set_NoTransform](./set_notransform/)(bool) | يضبط القيمة التي تحدد ما إذا كان يجب على الذاكرة المؤقتة أو الوكيل عدم تغيير أي جزء من جسم الكيان. |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | يضبط القيمة التي تحدد ما إذا كان يجب على العميل استخدام إدخالات مخزنة فقط. |
| [set_Private](./set_private/)(bool) | يضبط القيمة التي تحدد ما إذا كانت رسالة استجابة HTTP أو جزء منها موجهة لمستخدم واحد ولا يجب أن تُخزن في ذاكرة مؤقتة مشتركة. |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | يضبط القيمة التي تحدد ما إذا كان الخادم يتطلب إعادة التحقق من صحة إدخال الذاكرة المؤقتة عندما يصبح قديمًا للذاكرات المؤقتة المشتركة لوكلاء المستخدم. |
| [set_Public](./set_public/)(bool) | يضبط القيمة التي تحدد ما إذا كان يمكن تخزين استجابة HTTP في أي ذاكرة مؤقتة. |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | يضبط قيمة العمر الأقصى المشتركة بالثواني التي تتجاوز توجيه 'max-age' في رأس 'Cache-Control'. أو رأس 'Expires' لذاكرة مؤقتة مشتركة. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | يحاول تحويل سلسلة مُمرَّرة إلى نسخة من الفئة [CacheControlHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
