---
title: "System::Globalization::StringInfo class"
linktitle: "StringInfo"
second_title: "Aspose.Font لـ C++"
description: "System::Globalization::StringInfo class. أداة تقسيم للتنقل عبر أجزاء السلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2400
url: /ar/cpp/system.globalization/stringinfo/
---
## StringInfo class


أداة تقسيم للتنقل عبر أجزاء السلسلة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringInfo : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | يحصل على عدد عناصر النص في كائن [StringInfo](./). |
| [get_String](./get_string/)() const | يحصل على قيمة كائن [StringInfo](./). |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | يحصل على العنصر الأول في السلسلة المحددة. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | يحصل على العنصر عند الفهرس المحدد في السلسلة المحددة. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | ينشئ عدادًا للتكرار عبر أحرف السلسلة. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | ينشئ عدادًا للتكرار عبر أحرف السلسلة بدءًا من الفهرس المحدد. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | يحصل على فهارس الأحرف الأساسية، والبدائل العليا، والأحرف التحكمية. |
| [set_String](./set_string/)(const String\&) | يضبط قيمة كائن [StringInfo](./). |
| [StringInfo](./stringinfo/)() | معلومات RTTI. |
| [StringInfo](./stringinfo/)(const String\&) | المُنشئ. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | يحصل على جزء فرعي من عناصر النص من العنصر النصي المحدد حتى العنصر النصي الأخير. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | يحصل على جزء فرعي من عناصر النص من العنصر النصي المحدد حتى عدد محدد من عناصر النص. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
