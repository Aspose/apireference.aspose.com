---
title: "System::Globalization::NumberFormatInfo class"
linktitle: "NumberFormatInfo"
second_title: "Aspose.Font لـ C++"
description: "System::Globalization::NumberFormatInfo class. يحتوي على معلومات حول كيفية تنسيق الأرقام. يتم تمكين عمليات الضبط فقط على الكائنات غير القابلة للقراءة فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1900
url: /ar/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


يحتوي على معلومات حول كيفية تنسيق الأرقام. يتم تمكين عمليات الضبط فقط على الكائنات غير القابلة للقراءة فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينسخ معلومات التنسيق. |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | يحصل على عدد الأرقام العشرية للعملة. |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | يحصل على الفاصل العشري للعملة. |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | يحصل على فاصل مجموعة العملة. |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | يحصل على عدد الأرقام العشرية للعملة لكل مجموعة. |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | يحصل على نمط سالب للعملة. |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | يحصل على نمط موجب للعملة. |
| [get_CurrencySymbol](./get_currencysymbol/)() const | يحصل على رمز العملة. |
| static [get_CurrentInfo](./get_currentinfo/)() | يحصل على معلومات تنسيق الأرقام المحددة بثقافة الخيط الحالي. |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | يحصل على قيمة تحدد كيفية عرض شكل الرقم. |
| static [get_InvariantInfo](./get_invariantinfo/)() | يحصل على معلومات تنسيق الأرقام المحددة بثقافة ثابتة. |
| [get_IsReadOnly](./get_isreadonly/)() const | يتحقق مما إذا كان التنسيق للقراءة فقط. |
| [get_NaNSymbol](./get_nansymbol/)() const | يحصل على رمز غير رقم. |
| [get_NativeDigits](./get_nativedigits/)() const | يحصل على رموز الأرقام (0 إلى 9). |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | يحصل على رمز اللانهاية السالبة. |
| [get_NegativeSign](./get_negativesign/)() const | يحصل على العلامة السالبة. |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | يحصل على عدد الأرقام العشرية. |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | يحصل على الفاصل العشري. |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | يحصل على فاصل مجموعة الأرقام. |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | يحصل على عدد الأرقام لكل مجموعة. |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | يحصل على نمط سالب للرقم. |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | يحصل على عدد المنازل العشرية في قيم النسبة المئوية. |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | يحصل على الفاصل العشري في قيم النسبة المئوية. |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | يحصل على فاصل المجموعة في قيم النسبة المئوية. |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | يحصل على عدد الأرقام لكل مجموعة قيم النسبة المئوية. |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | يحصل على نمط سالب للنسبة المئوية. |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | يحصل على نمط موجب للنسبة المئوية. |
| [get_PercentSymbol](./get_percentsymbol/)() const | يحصل على رمز النسبة المئوية. |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | يحصل على رمز الألفية. |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | يحصل على رمز اللانهاية الموجبة. |
| [get_PositiveSign](./get_positivesign/)() const | يحصل على علامة الإيجاب. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | يحصل على المنسق من النوع المحدد. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | يحصل على المنسق المرتبط بمزود التنسيق. |
| [NumberFormatInfo](./numberformatinfo/)() | البناء الافتراضي (ثابت [NumberFormatInfo](./)). |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | يحصل على نسخة للقراءة فقط من المنسق. |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | يضبط عدد أرقام الفاصلة العشرية للعملة. |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | يضبط فاصل الفاصلة العشرية للعملة. |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | يضبط فاصل مجموعة الأرقام للعملة. |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | يضبط عدد أرقام الفاصلة العشرية للعملة لكل مجموعة. |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | يضبط نمط السالب للعملة. |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | يضبط نمط الموجب للعملة. |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | يضبط رمز العملة. |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | يضبط قيمة تحدد كيفية عرض شكل الرقم. |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | يضبط رمز غير عدد (NaN). |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | يضبط رموز الأرقام (0 إلى 9). |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | يضبط رمز اللانهاية السالبة. |
| [set_NegativeSign](./set_negativesign/)(const String\&) | يضبط علامة السالب. |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | يضبط عدد الأرقام العشرية. |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | يضبط فاصل الفاصلة العشرية. |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | يضبط فاصل مجموعة الأرقام. |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | يضبط عدد الأرقام لكل مجموعة. |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | يضبط نمط السالب للرقم. |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | يضبط عدد المنازل العشرية في قيم النسبة المئوية. |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | يضبط فاصل الفاصلة العشرية في قيم النسبة المئوية. |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | يضبط فاصل المجموعة في قيم النسبة المئوية. |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | يضبط عدد الأرقام لكل مجموعة قيم النسبة المئوية. |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | يضبط نمط النسبة السالبة. |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | يضبط نمط النسبة الموجبة. |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | يضبط رمز النسبة المئوية. |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | يضبط رمز الألفية. |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | يضبط رمز اللانهاية الموجبة. |
| [set_PositiveSign](./set_positivesign/)(const String\&) | يضبط العلامة الموجبة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
