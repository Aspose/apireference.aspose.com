---
title: "فئة System::StringComparer"
linktitle: "StringComparer"
second_title: "Aspose.Font لـ C++"
description: "فئة System::StringComparer. تقارن السلاسل باستخدام أوضاع مقارنة مختلفة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو فشل في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 5900
url: /ar/cpp/system/stringcomparer/
---
## StringComparer class


يقارن السلاسل باستخدام أوضاع مقارنة مختلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | يقارن سلسلتين باستخدام الإعدادات الحالية. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | ينشئ مُقارنًا خاصًا بالثقافة. |
| [Equals](./equals/)(String, String) const override | يفحص ما إذا كانت سلسلتان متساويتان باستخدام الإعدادات الحالية. |
| static [get_CurrentCulture](./get_currentculture/)() | كائن مفرد لمقارن الثقافة الحالية. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | كائن مفرد لمقارن الثقافة الحالية متجاهل حالة الأحرف. |
| static [get_InvariantCulture](./get_invariantculture/)() | كائن مفرد لمقارن الثقافة الثابتة. |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | كائن مفرد لمقارن الثقافة الثابتة متجاهل حالة الأحرف. |
| static [get_Ordinal](./get_ordinal/)() | كائن مفرد لمقارن ترتيبي. |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | كائن مفرد لمقارن ترتيبي متجاهل حالة الأحرف. |
| [GetHashCode](./gethashcode/)(String) const override | يحصل على قيمة التجزئة للسلسلة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [args_type](./args_type/) | معلومات RTTI. |
## انظر أيضًا

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
