---
title: "فئة System::ObjectExt"
linktitle: "ObjectExt"
second_title: "Aspose.Font لـ C++"
description: "فئة System::ObjectExt. توفر طرقًا ثابتة تحاكي طرق Object في C# تُستدعى لأنواع C++ غير الـObject (سلاسل، أعداد، إلخ). هذا نوع ثابت بدون خدمات مثيلات. يجب ألا تقوم بإنشاء مثيلات منه بأي وسيلة في C++."
type: docs
weight: 4900
url: /ar/cpp/system/objectext/
---
## ObjectExt class


توفر طرقًا ثابتة تحاكي طرق C# [Object](../object/) تُستدعى لأنواع C++ غير الـObject (سلاسل، أعداد، إلخ). هذا نوع ثابت بدون خدمات مثيلات. يجب ألا تقوم بإنشاء مثيلات منه بأي وسيلة.

```cpp
class ObjectExt : public System::ObjectType
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | تحول القيم الأساسية للمصفوفة (التي يقوم C# بتحويلها ضمنيًا لكن C++ يبدو أنه لا يفعل ذلك). |
| static [Box](./box/)(const T\&) | يعبئ الأنواع القيمية للتحويل إلى [Object](../object/). تنفيذ لأنواع التعداد. |
| static [Box](./box/)(const T\&) | يعبئ الأنواع القيمية للتحويل إلى [Object](../object/). تنفيذ للأنواع غير التعداد. |
| static [Box](./box/)(const T\&) | يعبئ الأنواع [Nullable](../nullable/) للتحويل إلى [Object](../object/). |
| static [Box](./box/)(const String\&) | يعبئ قيم السلاسل. |
| static [BoxEnum](./boxenum/)(T) | يعبئ أنواع التعداد لتُنشر كـ [Object](../object/). |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | تنفيذ ترجمة العامل '??' للأنواع غير القابلة للـ null. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | تنفيذ ترجمة العامل '??' للأنواع القابلة للـ null. |
| static [CoalesceAssign](./coalesceassign/)(T0\&, T1) | تنفيذ ترجمة العامل '??='. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | تنفيذ ترجمة العامل '??' للأنواع غير القابلة للـ null. تحميل زائد للحالة إذا كان RT2 قابلًا للتحويل إلى RT1. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | بديل لاستدعاءات C# [Object.Equals](../object/equals/) التي تعمل مع أي نوع في C++. تحميل زائد لأنواع المؤشرات الذكية. |
| static [Equals](./equals/)(T, const T2\&) | بديل لاستدعاءات C# [Object.Equals](../object/equals/) التي تعمل مع أي نوع في C++. تحميل زائد لأنواع البنى. |
| static [Equals](./equals/)(const T\&, const T2\&) | بديل لاستدعاءات C# [Object.Equals](../object/equals/) التي تعمل مع أي نوع في C++. تحميل زائد للأنواع العددية. |
| static [Equals](./equals/)(const char_t(&), String) | بديل لاستدعاءات C# [Object.Equals](../object/equals/) التي تعمل مع أي نوع في C++. تحميل زائد للثوابت النصية مع مقارنة النصوص. |
| static [Equals](./equals/)(const float\&, const float\&) | يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين رغم أنه وفقًا للمعيار IEC 60559:1989 لا يُعتبر NaN مساويًا لأي قيمة، بما في ذلك NaN. |
| static [Equals](./equals/)(const double\&, const double\&) | يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين رغم أنه وفقًا للمعيار IEC 60559:1989 لا يُعتبر NaN مساويًا لأي قيمة، بما في ذلك NaN. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | ينفّذ استدعاءات [GetHashCode()](./gethashcode/); يعمل على كل من الفئات الفرعية لـ [Object](../object/) والأنواع غير المرتبطة. |
| static [Is](./is/)(const T\&) | ينفّذ ترجمة العامل 'is'. تخصيص للأنواع القابلة للتعبئة (القيمية) التي هي بالضبط ذلك. |
| static [Is](./is/)(const U\&) | ينفّذ ترجمة العامل 'is'. تخصيص لأنواع المؤشرات المُحسّنة للفئات 'final'. |
| static [Is](./is/)(const U\&) | ينفّذ ترجمة العامل 'is'. تخصيص لأنواع المؤشرات. |
| static [Is](./is/)(const Object\&) | ينفّذ ترجمة العامل 'is'. تخصيص للأنواع القيمية. |
| static [Is](./is/)(const Object\&) | ينفّذ ترجمة العامل 'is'. تخصيص للأنواع غير القابلة للتحويل. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | ينفّذ ترجمة العامل 'is'. تخصيص لأنواع المؤشرات. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | ينفّذ ترجمة العامل 'is'. تخصيص لأنواع غلاف الاستثناء. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | يُنفّذ ترجمة عامل 'is'. تخصيص للأنواع القابلة للإلغاء. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | يُنفّذ ترجمة عامل 'is'. تخصيص للأنواع القابلة للتعبئة مع تعريف عامل ==. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | يُنفّذ ترجمة عامل 'is'. تخصيص للأنواع القابلة للتعبئة بدون تعريف عامل ==. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | يُنفّذ ترجمة عامل 'is'. تخصيص للأنواع القيمية المُعبأة إلى الواجهات. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | يُنفّذ ترجمة عامل 'is'. تخصيص لأنواع التعداد. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | يُنفّذ ترجمة عامل 'is'. تخصيص لأنواع التعداد مقابل المؤشرات الضعيفة. |
| static [Is](./is/)(const Nullable\<U\>\&) | يُنفّذ ترجمة عامل 'is'. تخصيص لنوع [Nullable](../nullable/). |
| static [Is](./is/)(const char16_t *) | يُنفّذ ترجمة عامل 'is'. تخصيص للثابت النصي. |
| static [Is](./is/)(int32_t) | يُنفّذ ترجمة عامل 'is'. تخصيص للثابت العددي. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | يتحقق مما إذا كان الكائن قيمة مُعبأة. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | يحوّل [Object](../object/) إلى نوع غير معروف، مع معالجة كل من نوع المؤشر الذكي وحالات القيمة bpxed. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | يحوّل [Object](../object/) إلى نوع غير معروف، مع معالجة كل من نوع المؤشر الذكي وحالات القيمة المُعبأة. |
| static [ToString](./tostring/)(const char_t *) | بديل لطريقة C# ToString لتعمل على أي نوع C++. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | بديل لطريقة C# ToString لتعمل على أي نوع C++. |
| static [ToString](./tostring/)(const T\&) | بديل لطريقة C# ToString لتعمل على أي نوع C++. |
| static [ToString](./tostring/)(const T\&) | بديل لطريقة C# ToString لتعمل على أي نوع C++. |
| static [ToString](./tostring/)(T\&) | بديل لطريقة C# ToString لتعمل على أي نوع C++. |
| static [ToString](./tostring/)(T\&) | بديل لطريقة C# ToString لتعمل على أي نوع C++. |
| static [ToString](./tostring/)(T\&&) | بديل لطريقة C# ToString لتعمل على أي نوع C++. |
| static [ToString](./tostring/)(T\&) | بديل لطريقة C# ToString لتعمل على أي نوع C++. |
| static [ToString](./tostring/)(const T\&) | بديل لطريقة C# ToString لتعمل على أي نوع C++. |
| static [ToString](./tostring/)(T\&&) | بديل لطريقة C# ToString لتعمل على أي نوع C++. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | يفك تعبئة الأنواع القيمية بعد التحويل إلى [Object](../object/). تنفيذ لأنواع التعداد. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | يفك تعبئة الأنواع القيمية بعد التحويل إلى [Object](../object/). تنفيذ للأنواع غير التعدادية وغير القابلة للإلغاء. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | يفك تعبئة الأنواع القيمية بعد التحويل إلى [Object](../object/). تنفيذ للأنواع غير التعدادية وغير القابلة للإلغاء. |
| static [Unbox](./unbox/)(E) | يفك تعبئة أنواع التعداد إلى عدد صحيح. |
| static [Unbox](./unbox/)(E) | يحوّل أنواع التعداد. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | يفك تعبئة قيم السلسلة. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | يفك تعبئة السلسلة من قيمة مُعبأة. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | يفك تعبئة الكائن إلى نوع قابل للإلغاء. |
| static [UnknownIsNull](./unknownisnull/)(T) | يتحقق مما إذا كان كائن النوع غير المعروف يساوي nullptr. تحميل زائد للأنواع غير العددية. |
| static [UnknownIsNull](./unknownisnull/)(T) | يتحقق مما إذا كان كائن النوع غير المعروف يساوي nullptr. تحميل زائد للأنواع العددية. |
| static [UnknownToObject](./unknowntoobject/)(T) | يحوّل النوع غير المعروف إلى [Object](../object/)، مع معالجة كل من نوع المؤشر الذكي وحالات النوع القيمي. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | يحوّل النوع غير المعروف إلى [Object](../object/)، مع معالجة كل من نوع المؤشر الذكي وحالات النوع القيمي. |
## انظر أيضًا

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
