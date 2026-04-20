---
title: "فئة System::Drawing::PointF"
linktitle: "PointF"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Drawing::PointF. تمثل زوجًا من إحداثيات X و Y ذات نقطة عائمة ذات دقة مفردة على مستوى ثنائي الأبعاد. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 1800
url: /ar/cpp/system.drawing/pointf/
---
## PointF class


تمثل زوجًا من إحداثيات X و Y ذات نقطة عائمة ذات دقة مفردة على مستوى ثنائي الأبعاد. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة [System::SmartPtr](../../system/smartptr/) لإدارة كائنات هذا النوع.

```cpp
class PointF
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Add](./add/)(const PointF\&, const SizeF\&) | يضيف قيم العرض والارتفاع لكائن [SizeF](../sizef/) المحدد إلى قيم إحداثيات X و Y لكائن [PointF](./) المحدد على التوالي. |
| static [Add](./add/)(const PointF\&, const Size\&) | يضيف قيم العرض والارتفاع لكائن [Size](../size/) المحدد إلى قيم إحداثيات X و Y لكائن [PointF](./) المحدد على التوالي. |
| [Equals](./equals/)(const PointF\&) const | يحدد ما إذا كان الكائن الحالي والكائن المحدد متساويين، أي يمثلان نفس زوج قيم إحداثيات X و Y. |
| [get_IsEmpty](./get_isempty/)() const | يحدد ما إذا كانت قيم إحداثيات X و Y كلاهما مساوية للصفر. |
| [get_X](./get_x/)() const | يرجع قيمة إحداثي X التي يمثلها الكائن الحالي. |
| [get_Y](./get_y/)() const | يرجع قيمة إحداثي Y التي يمثلها الكائن الحالي. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة للكائن الحالي. |
| [IsNull](./isnull/)() const | دائمًا تُعيد false. |
| explicit [operator bool](./operatorbool/)() | دائمًا تُعيد true. |
| [PointF](./pointf/)() | ينشئ كائنًا جديدًا من [PointF](./) ويُهيئ قيم إحداثيات X و Y الخاصة به إلى 0. |
| [PointF](./pointf/)(float, float) | ينشئ كائنًا جديدًا من [PointF](./) ويُهيئه بالقيم المحددة. |
| [PointF](./pointf/)(const SizeF\&) | ينشئ كائنًا جديدًا من نوع [PointF](./) ويُهيئ قيم إحداثيات X و Y الخاصة به بقيم العرض والارتفاع لكائن [SizeF](../sizef/) المحدد على التوالي. |
| [set_X](./set_x/)(float) | يضبط قيمة إحداثية X التي يمثلها الكائن الحالي. |
| [set_Y](./set_y/)(float) | يضبط قيمة إحداثية Y التي يمثلها الكائن الحالي. |
| static [Subtract](./subtract/)(const PointF\&, const SizeF\&) | يطرح قيم العرض والارتفاع لكائن [SizeF](../sizef/) المحدد من قيم إحداثيات X و Y لكائن [PointF](./) المحدد على التوالي. |
| static [Subtract](./subtract/)(const PointF\&, const Size\&) | يطرح قيم العرض والارتفاع لكائن [Size](../size/) المحدد من قيم إحداثيات X و Y لكائن [PointF](./) المحدد على التوالي. |
| [ToString](./tostring/)() const | يرجع تمثيلًا نصيًا لزوج قيم إحداثيات X و Y التي يمثلها الكائن الحالي. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Empty](./empty/) | مثيل فارغ من فئة [PointF](./) تكون قيم إحداثيات X و Y فيه صفر. |
## انظر أيضًا

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
