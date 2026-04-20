---
title: "System::Net::Cache::HttpRequestCachePolicy فئة"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Cache::HttpRequestCachePolicy فئة. سياسة ذاكرة التخزين المؤقت HTTP التي تعبر عن دلالات التخزين المؤقت وفق RFC2616. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


سياسة ذاكرة التخزين المؤقت HTTP التي تعبر عن دلالات التخزين المؤقت وفق RFC2616. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | يحصل على الوقت الذي يجب فيه إعادة التحقق من صحة الموارد المخزنة في الذاكرة المؤقتة. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | يحصل على الوقت بتنسيق UTC الذي يجب فيه إعادة التحقق من صحة الموارد المخزنة في الذاكرة المؤقتة. للاستخدام الداخلي فقط. |
| [get_Level](./get_level/)() const | معلومات RTTI. |
| [get_MaxAge](./get_maxage/)() const | يحصل على الحد الأقصى للعمر المسموح به للمورد. |
| [get_MaxStale](./get_maxstale/)() const | يحصل على أقصى قيمة للقدم المسموح بها للمورد. |
| [get_MinFresh](./get_minfresh/)() const | يحصل على الحد الأدنى للعمر المسموح به للمورد. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | ينشئ نسخة جديدة. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | ينشئ نسخة جديدة. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | ينشئ نسخة جديدة. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | ينشئ نسخة جديدة. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | ينشئ نسخة جديدة. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | ينشئ نسخة جديدة. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## انظر أيضًا

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Font for C++](../../)
