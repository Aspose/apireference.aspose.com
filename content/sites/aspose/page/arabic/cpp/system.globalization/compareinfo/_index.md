---
title: "System::Globalization::CompareInfo فئة"
linktitle: "CompareInfo"
second_title: "Aspose.Page لـ C++"
description: "System::Globalization::CompareInfo فئة. تقوم بإجراء مقارنة سلاسل حساسة للثقافة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.globalization/compareinfo/
---
## CompareInfo class


تقوم بإجراء مقارنة سلاسل حساسة للثقافة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class CompareInfo : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | يقارن السلاسل. غير مُنفَّذ. |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | يقارن السلاسل. يدعم فقط أوضاع Ordinal و OrdinalIgnoreCase. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | يقارن جزءًا من سلسلة واحدة مع جزء من السلسلة الثانية. غير مُنفَّذ. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | يقارن الجزء النهائي من سلسلة واحدة مع الجزء النهائي من السلسلة الثانية باستخدام طرق مقارنة السلاسل. غير مُنفَّذ. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | يقارن الجزء النهائي من سلسلة واحدة مع الجزء النهائي من السلسلة الثانية. غير مُنفَّذ. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | يقارن جزءًا من سلسلة واحدة مع جزء من السلسلة الثانية باستخدام طرق مقارنة السلاسل. غير مُنفَّذ. |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | معلومات RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | يحصل على معرف LCID للثقافة المرتبطة بالمقارن. |
| virtual [get_Name](./get_name/)() const | يحصل على اسم الثقافة المرتبطة بالمقارن. |
| [get_Version](./get_version/)() const | يحصل على معلومات حول نسخة الفرز. |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | يحصل على [CompareInfo](./) المرتبط بالثقافة المحددة ويستخدم طرق مقارنة السلاسل في التجميع المحدد. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | يحصل على [CompareInfo](./) المرتبط بالثقافة المحددة ويستخدم طرق مقارنة السلاسل في التجميع المحدد. |
| static [GetCompareInfo](./getcompareinfo/)(int) | يحصل على [CompareInfo](./) المرتبط بالثقافة المحددة. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | يحصل على [CompareInfo](./) المرتبط بالثقافة المحددة. |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | يحصل على رمز التجزئة للسلسلة بناءً على خيارات المقارنة المحددة. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | يحصل على كائن [SortKey](../sortkey/) للسلسلة المحددة باستخدام خيارات المقارنة المحددة. |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | يحصل على كائن [SortKey](../sortkey/) للسلسلة المحددة. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | يبحث عن سلسلة فرعية. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | يبحث عن سلسلة فرعية. يدعم فقط الوضع الترتيبي. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | يبحث عن سلسلة فرعية. يدعم فقط الوضع الترتيبي. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | يبحث عن الحرف المحدد. يدعم فقط الوضع الترتيبي. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | يبحث عن سلسلة فرعية. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | يبحث عن الحرف المحدد. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | يبحث عن سلسلة فرعية. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | يبحث عن الحرف المحدد. يدعم فقط الوضع الترتيبي. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | يبحث عن الحرف المحدد. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | يبحث عن الحرف المحدد. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | يبحث عن سلسلة فرعية. يدعم فقط الوضع الترتيبي. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | يبحث عن الحرف المحدد. يدعم فقط الوضع الترتيبي. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | يتحقق مما إذا كانت السلسلة المحددة تبدأ بالبادئة المحددة باستخدام خيارات المقارنة المحددة. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | يتحقق مما إذا كانت السلسلة المحددة تبدأ بالبادئة المحددة. |
| static [IsSortable](./issortable/)(char16_t) | يتحقق مما إذا كان الحرف المحدد قابلًا للترتيب. |
| static [IsSortable](./issortable/)(const String\&) | يتحقق مما إذا كانت السلسلة المحددة قابلة للترتيب. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | يتحقق مما إذا كانت السلسلة المحددة تنتهي باللاحقة المحددة باستخدام خيارات المقارنة المحددة. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | يتحقق مما إذا كانت السلسلة المحددة تنتهي باللاحقة المحددة. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | يبحث عن آخر ظهور للسلسلة الفرعية المحددة. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | يبحث عن آخر ظهور للسلسلة الفرعية المحددة باستخدام خيارات المقارنة المحددة. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | يبحث عن آخر ظهور للحرف المحدد باستخدام خيارات المقارنة المحددة. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | يبحث عن آخر ظهور للسلسلة المحددة. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | يبحث عن آخر ظهور للسلسلة المحددة باستخدام خيارات المقارنة المحددة. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | يبحث عن آخر ظهور للحرف المحدد باستخدام خيارات المقارنة المحددة. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | يبحث عن آخر ظهور للسلسلة المحددة. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | يبحث عن آخر ظهور للحرف المحدد. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | يبحث عن آخر ظهور للسلسلة المحددة باستخدام خيارات المقارنة المحددة. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | يبحث عن آخر ظهور للحرف المحدد باستخدام خيارات المقارنة المحددة. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | يبحث عن آخر ظهور للحرف المحدد. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | يبحث عن آخر ظهور للحرف المحدد. |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
