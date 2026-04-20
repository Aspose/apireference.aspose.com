---
title: "الفئة System::Version"
linktitle: "الإصدار"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Version. تمثل رقم إصدار. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً الفئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 7300
url: /ar/cpp/system/version/
---
## Version class


تمثل رقم إصدار. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً الفئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
class Version
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CompareTo](./compareto/)(const Version\&) const | يقارن الإصدارات الممثلة بواسطة الكائن الحالي والكائن المحدد. |
| [Equals](./equals/)(const Version\&) const | يحدد ما إذا كانت أرقام الإصدارات الممثلة بواسطة الكائنين الحالي والمحدد متساوية. |
| [get_Build](./get_build/)() const | يعيد رقم البناء. |
| [get_Major](./get_major/)() const | يعيد الإصدار الرئيسي. |
| [get_MajorRevision](./get_majorrevision/)() const | يعيد القيمة العليا ذات الـ 16 بت لرقم المراجعة. |
| [get_Minor](./get_minor/)() const | يعيد الإصدار الفرعي. |
| [get_MinorRevision](./get_minorrevision/)() const | يعيد القيمة الدنيا ذات الـ 16 بت لرقم المراجعة. |
| [get_Revision](./get_revision/)() const | يعيد رقم المراجعة. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة للكائن الحالي. |
| static [Parse](./parse/)(const String\&) | يحوّل تمثيل النص لرقم الإصدار إلى نسخة مكافئة من الفئة [Version](./). |
| [ToString](./tostring/)() const | يعيد تمثيل النص لرقم الإصدار الممثل بواسطة الكائن الحالي. |
| [ToString](./tostring/)(int) const | يعيد تمثيل النص للعدد المحدد من أقسام رقم الإصدار الممثل بواسطة الكائن الحالي. |
| [Version](./version/)(int, int, int, int) | يبني نسخة تمثل القيم المحددة للإصدار الرئيسي والفرعي والبناء والمراجعة. |
| [Version](./version/)(int, int, int) | يبني نسخة تمثل القيم المحددة للإصدار الرئيسي والفرعي والبناء. |
| [Version](./version/)(int, int) | يبني نسخة تمثل القيم المحددة للإصدار الرئيسي والقيم. |
| [Version](./version/)(const String\&) | يبني نسخة تمثل رقم الإصدار الممثل كنص. |
| [Version](./version/)() | يبني نسخة تمثل رقم الإصدار 0.0.-1.-1. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
