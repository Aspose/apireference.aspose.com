---
title: "System::Globalization::RegionInfo فئة"
linktitle: "RegionInfo"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Globalization::RegionInfo. توفر معلومات عن المنطقة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2100
url: /ar/cpp/system.globalization/regioninfo/
---
## RegionInfo class


توفر معلومات عن المنطقة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RegionInfo : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | يحصل على الاسم الإنجليزي للعملة. |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | يحصل على الاسم الأصلي للعملة. |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | يحصل على رمز العملة. |
| static [get_CurrentRegion](./get_currentregion/)() | يحصل على المنطقة المحددة في النظام. |
| virtual [get_DisplayName](./get_displayname/)() const | يحصل على الاسم الكامل للمنطقة. |
| virtual [get_EnglishName](./get_englishname/)() const | يحصل على الاسم الإنجليزي للمنطقة. |
| virtual [get_GeoId](./get_geoid/)() const | يحصل على معرف فريد للمنطقة. |
| virtual [get_IsMetric](./get_ismetric/)() const | يتحقق مما إذا كانت المنطقة تستخدم النظام المتري. |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | يحصل على رمز العملة وفق ISO. |
| virtual [get_Name](./get_name/)() const | يحصل على اسم المنطقة. |
| virtual [get_NativeName](./get_nativename/)() const | يحصل على الاسم الأصلي للمنطقة. |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | يحصل على رمز المنطقة المكوّن من 3 أحرف وفق ISO. |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | يحصل على رمز المنطقة المكوّن من 3 أحرف وفق [Windows](../../system.windows/). |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | يحصل على رمز المنطقة المكوّن من حرفين وفق ISO. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | معلومات RTTI. |
| [RegionInfo](./regioninfo/)(int) | منشئ. |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
