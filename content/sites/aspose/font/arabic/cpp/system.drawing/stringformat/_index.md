---
title: "فئة System::Drawing::StringFormat"
linktitle: "StringFormat"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::StringFormat class. تُغلف معلومات تخطيط النص، وتعديلات العرض وميزات OpenType. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2500
url: /ar/cpp/system.drawing/stringformat/
---
## StringFormat class


تُغلف معلومات تخطيط النص، وتعديلات العرض وميزات OpenType. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringFormat : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() | يعيد نسخة مطابقة تمامًا من الكائن الحالي. |
| [get_Alignment](./get_alignment/)() const | يعيد قيمة تشير إلى محاذاة النص أفقياً. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | يعيد قيمة تشير إلى اللغة المستخدمة عندما يتم استبدال الأرقام المحلية بالأرقام الغربية. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | يعيد طريقة استبدال الأرقام. |
| [get_FormatFlags](./get_formatflags/)() const | يعيد تركيبة بتية من [StringFormatFlags](../stringformatflags/) التي تحدد تنسيق السلسلة الممثل بواسطة الكائن الحالي. |
| static [get_GenericDefault](./get_genericdefault/)() | يعيد كائن [StringFormat](./) يمثل تنسيقًا افتراضيًا عامًّا. |
| static [get_GenericTypographic](./get_generictypographic/)() | يعيد كائن [StringFormat](./) يمثل تنسيقًا طباعيًّا عامًّا. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | يعيد القيمة التي تشير إلى كيفية عرض بادئة المفتاح السريع. |
| [get_LineAlignment](./get_linealignment/)() const | يعيد قيمة تشير إلى محاذاة النص عموديًا. |
| [get_Trimming](./get_trimming/)() const | يعيد قيمة تشير إلى كيفية تقليم النص. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | يحصل على حجم مصفوفة [CharacterRange](../characterrange/). |
| [GetTabStops](./gettabstops/)(float\&) const | يعيد نقاط التبويب للكائن [StringFormat](./) الحالي. |
| [set_Alignment](./set_alignment/)(StringAlignment) | يضبط محاذاة النص أفقياً. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | يضبط أعلام تنسيق السلسلة. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | يضبط القيمة التي تحدد كيفية عرض بادئة المفتاح السريع. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | يضبط محاذاة النص عموديًا. |
| [set_Trimming](./set_trimming/)(StringTrimming) | يضبط قيمة تحدد كيفية تقليم النص. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | يضبط لغة وطريقة استبدال الأرقام. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | يضبط مصفوفة من كائنات [CharacterRange](../characterrange/) التي تمثل نطاقات الأحرف التي تم قياسها بواسطة استدعاء طريقة MeasureCharacterRanges(). |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | يضبط نقاط التبويب للكائن [StringFormat](./) الحالي. |
| [StringFormat](./stringformat/)() | ينشئ نسخة جديدة من فئة [StringFormat](./). |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | ينشئ نسخة جديدة من فئة [StringFormat](./) مع أعلام التنسيق واللغة المحددة. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | منشئ النسخ. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
