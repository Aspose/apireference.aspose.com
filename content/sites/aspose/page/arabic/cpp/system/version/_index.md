---
title: "فئة System::Version"
linktitle: "إصدار"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Version. تمثل رقم إصدار. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 7300
url: /ar/cpp/system/version/
---
## Version class


يمثل رقم إصدار. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
class Version
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CompareTo](./compareto/)(const Version\&) const | يقارن الإصدارات التي يمثلها الكائن الحالي والكائن المحدد. |
| [Equals](./equals/)(const Version\&) const | يحدد ما إذا كانت أرقام الإصدارات التي يمثلها الكائنان الحالي والمحدد متساوية. |
| [get_Build](./get_build/)() const | يعيد رقم البناء. |
| [get_Major](./get_major/)() const | يعيد الإصدار الرئيسي. |
| [get_MajorRevision](./get_majorrevision/)() const | يعيد القيمة العليا ذات 16 بت لرقم المراجعة. |
| [get_Minor](./get_minor/)() const | يعيد الإصدار الفرعي. |
| [get_MinorRevision](./get_minorrevision/)() const | يعيد القيمة الدنيا ذات 16 بت لرقم المراجعة. |
| [get_Revision](./get_revision/)() const | يعيد رقم المراجعة. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة للكائن الحالي. |
| static [Parse](./parse/)(const String\&) | يحوّل تمثيل السلسلة لرقم الإصدار إلى نسخة مكافئة من فئة [Version](./). |
| [ToString](./tostring/)() const | يعيد تمثيل السلسلة لرقم الإصدار الذي يمثله الكائن الحالي. |
| [ToString](./tostring/)(int) const | يعيد تمثيل السلسلة للعدد المحدد من أقسام رقم الإصدار الذي يمثله الكائن الحالي. |
| [Version](./version/)(int, int, int, int) | يبني نسخة تمثل القيم المحددة للإصدار الرئيسي، الفرعي، البناء والمراجعة. |
| [Version](./version/)(int, int, int) | يبني نسخة تمثل القيم المحددة للإصدار الرئيسي، الفرعي والبناء. |
| [Version](./version/)(int, int) | يبني نسخة تمثل القيم المحددة للإصدار الرئيسي والقيم. |
| [Version](./version/)(const String\&) | يبني نسخة تمثل رقم الإصدار الممثل كسلسلة. |
| [Version](./version/)() | ينشئ مثيلاً يمثل رقم الإصدار 0.0.-1.-1. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
