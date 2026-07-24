---
title: "فئة System::StringComparer"
linktitle: "StringComparer"
second_title: "Aspose.Page لـ C++"
description: "فئة System::StringComparer. تقارن السلاسل باستخدام أوضاع مقارنة مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 5900
url: /ar/cpp/system/stringcomparer/
---
## StringComparer class


يقارن السلاسل باستخدام أوضاع مقارنة مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | يقارن سلسلتين باستخدام الإعدادات الحالية. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | ينشئ مُقارنًا مخصصًا للثقافة. |
| [Equals](./equals/)(String, String) const override | يتحقق مما إذا كانت سلسلتان متساويتان باستخدام الإعدادات الحالية. |
| static [get_CurrentCulture](./get_currentculture/)() | مُقارن الثقافة الحالية ككائن مفرد. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | مُقارن الثقافة الحالية متجاهل حالة الأحرف ككائن مفرد. |
| static [get_InvariantCulture](./get_invariantculture/)() | مُقارن الثقافة غير المتغيرة ككائن مفرد. |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | مُقارن الثقافة غير المتغيرة متجاهل حالة الأحرف ككائن مفرد. |
| static [get_Ordinal](./get_ordinal/)() | مُقارن ترتيبي ككائن مفرد. |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | مُقارن ترتيبي متجاهل حالة الأحرف ككائن مفرد. |
| [GetHashCode](./gethashcode/)(String) const override | يحصل على رمز التجزئة للسلسلة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [args_type](./args_type/) | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
