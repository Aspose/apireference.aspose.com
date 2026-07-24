---
title: "System::Globalization::TextElementEnumerator class"
linktitle: "TextElementEnumerator"
second_title: "Aspose.Page لـ C++"
description: "System::Globalization::TextElementEnumerator class. عداد للتنقل عبر عناصر السلسلة (الأحرف). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2700
url: /ar/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


عداد للتنقل عبر عناصر السلسلة (الأحرف). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TextElementEnumerator : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Current](./get_current/)() const | يحصل على عنصر النص الحالي. |
| [get_ElementIndex](./get_elementindex/)() const | يحصل على فهرس عنصر النص الحالي. |
| [GetTextElement](./gettextelement/)() const | يحصل على العنصر الحالي. |
| [MoveNext](./movenext/)() | ينتقل إلى العنصر التالي. |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | يضبط العداد على الوضع الأولي. |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
