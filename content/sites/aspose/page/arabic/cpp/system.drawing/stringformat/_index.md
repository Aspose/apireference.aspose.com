---
title: "فئة System::Drawing::StringFormat"
linktitle: "StringFormat"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Drawing::StringFormat. تغلف معلومات تخطيط النص، وتعديلات العرض وميزات OpenType. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2500
url: /ar/cpp/system.drawing/stringformat/
---
## StringFormat class


تغلف معلومات تخطيط النص، وتعديلات العرض وميزات OpenType. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringFormat : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | إرجاع نسخة مطابقة تمامًا من الكائن الحالي. |
| [get_Alignment](./get_alignment/)() const | إرجاع قيمة تشير إلى محاذاة النص أفقياً. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | إرجاع قيمة تشير إلى اللغة المستخدمة عندما يتم استبدال الأرقام المحلية بالأرقام الغربية. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | إرجاع طريقة استبدال الأرقام. |
| [get_FormatFlags](./get_formatflags/)() const | إرجاع مجموعة بتية من [StringFormatFlags](../stringformatflags/) التي تحدد تنسيق السلسلة الممثلة بواسطة الكائن الحالي. |
| static [get_GenericDefault](./get_genericdefault/)() | إرجاع كائن [StringFormat](./) يمثل تنسيقًا افتراضيًا عامًّا. |
| static [get_GenericTypographic](./get_generictypographic/)() | إرجاع كائن [StringFormat](./) يمثل تنسيقًا طباعيًّا عامًّا. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | إرجاع القيمة التي تشير إلى كيفية عرض بادئة المفتاح السريع. |
| [get_LineAlignment](./get_linealignment/)() const | إرجاع قيمة تشير إلى محاذاة النص عمودياً. |
| [get_Trimming](./get_trimming/)() const | إرجاع قيمة تشير إلى كيفية تقليم النص. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | الحصول على حجم مصفوفة [CharacterRange](../characterrange/). |
| [GetTabStops](./gettabstops/)(float\&) const | إرجاع مواضع التبويب للكائن [StringFormat](./) الحالي. |
| [set_Alignment](./set_alignment/)(StringAlignment) | تعيين محاذاة النص أفقياً. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | تعيين أعلام تنسيق السلسلة. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | تعيين القيمة التي تحدد كيفية عرض بادئة المفتاح السريع. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | تعيين محاذاة النص عمودياً. |
| [set_Trimming](./set_trimming/)(StringTrimming) | تعيين قيمة تحدد كيفية تقليم النص. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | تعيين لغة وطريقة استبدال الأرقام. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | تعيين مصفوفة من كائنات [CharacterRange](../characterrange/) التي تمثل نطاقات الأحرف التي تم قياسها عبر استدعاء طريقة MeasureCharacterRanges(). |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | تعيين مواضع التبويب للكائن [StringFormat](./) الحالي. |
| [StringFormat](./stringformat/)() | إنشاء نسخة جديدة من فئة [StringFormat](./). |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | ينشئ مثيلاً جديدًا من فئة [StringFormat](./) مع علامات تنسيق اللغة المحددة. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | منشئ النسخ. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
