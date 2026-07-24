---
title: "فئة System::Object"
linktitle: "Object"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Object. الفئة الأساسية التي تمكّن من استخدام الأساليب المتوفرة لفئة System.Object في C#. يجب أن ترث جميع الفئات غير التافهة المستخدمة مع البيئة المترجمة منها في C++."
type: docs
weight: 4800
url: /ar/cpp/system/object/
---
## Object class


الفئة الأساسية التي تمكّن من استخدام الأساليب المتوفرة لفئة [System.Object](./) في C#. يجب أن ترث جميع الفئات غير التافهة المستخدمة مع البيئة المترجمة منها.

```cpp
class Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | يقارن الكائنات باستخدام دلالات [Object.Equals](./equals/) في C#. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | يقارن كائنات النوع المرجعي بأسلوب C#. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | يقارن كائنات النوع القيمي بأسلوب C#. |
| static [Equals](./equals/)(float const\&, float const\&) | يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين بالرغم من أن معيار IEC 60559:1989 يحدد أن NaN ليس مساويًا لأي قيمة، بما في ذلك NaN. |
| static [Equals](./equals/)(double const\&, double const\&) | يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين بالرغم من أن معيار IEC 60559:1989 يحدد أن NaN ليس مساويًا لأي قيمة، بما في ذلك NaN. |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | لأغراض داخلية فقط. |
| [GetCounter](./getcounter/)() | يحصل على بنية بيانات عدّاد المرجع المرتبط بالكائن. |
| virtual [GetHashCode](./gethashcode/)() const | نظير طريقة [Object.GetHashCode()](./gethashcode/) في C#. يتيح تجزئة الكائنات المخصصة. |
| virtual [GetType](./gettype/)() const | يحصل على النوع الفعلي للكائن. نظير استدعاء [System.Object.GetType()](./gettype/) في C#. |
| virtual [Is](./is/)(const TypeInfo\&) const | تحقق مما إذا كان الكائن يمثل مثيلًا للنوع الموصوف بـ targetType. نظير عامل 'is' في C#. |
| [Lock](./lock/)() | ينفّذ قفل بيان lock() في C#. استدعِه مباشرة أو استخدم كائن الحارس [LockContext](../lockcontext/). |
| virtual [MemberwiseClone](./memberwiseclone/)() const | نظير طريقة [Object.MemberwiseClone()](./memberwiseclone/) في C#. يتيح استنساخ الأنواع المخصصة. |
| [Object](./object/)() | ينشئ كائنًا. يهيّئ جميع بنى البيانات الداخلية. |
| [Object](./object/)(Object const\&) | منشئ النسخ. لا ينسخ شيئًا فعليًا، بل يهيّئ كائنًا جديدًا ويسمح بإنشاء نسخ من الفئات الفرعية. |
| [operator=](./operator=/)(Object const\&) | عامل الإسناد. لا ينسخ شيئًا فعليًا، بل يهيّئ كائنًا جديدًا ويسمح بإنشاء نسخ من الفئات الفرعية. |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | يقارن الكائنات بالمرجع. |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | يقارن الكائنات بالمرجع. |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | يقارن المرجع كائن نوع القيمة مع nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | تخصيص لـ [Object::ReferenceEquals](./referenceequals/) لحالة السلسلة و nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | تخصيص لـ [Object::ReferenceEquals](./referenceequals/) لحالة السلاسل. |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | يقلل عداد المرجع المشترك بالقيمة المحددة. |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | عيّن الوسيط القالب رقم n كإشارة ضعيفة (بدلاً من المشتركة). يسمح بتبديل المؤشرات في الحاويات إلى وضع الضعيفة. |
| [SharedCount](./sharedcount/)() const | يحصل على القيمة الحالية لعداد المرجع المشترك. |
| [SharedRefAdded](./sharedrefadded/)() | يزيد عداد المرجع المشترك. لا ينبغي استدعاؤه مباشرة؛ بدلاً من ذلك، استخدم المؤشرات الذكية أو ThisProtector. |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | يقلل ويعيد عداد المرجع المشترك. لا ينبغي استدعاؤه مباشرة؛ بدلاً من ذلك، استخدم المؤشرات الذكية أو ThisProtector. |
| virtual [ToString](./tostring/)() const | نظير طريقة C# [Object.ToString()](./tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [Type](./type/)() | ينفذ بنية C# typeof([System.Object](./)). |
| [Unlock](./unlock/)() | ينفذ فك قفل عبارة C# lock(). استدعِ مباشرة أو استخدم كائن الحارس [LockContext](../lockcontext/). |
| [WeakRefAdded](./weakrefadded/)() | يزيد عداد المرجع الضعيف. لا ينبغي استدعاؤه مباشرة؛ بدلاً من ذلك، استخدم المؤشرات الذكية أو ThisProtector. |
| [WeakRefRemoved](./weakrefremoved/)() | يقلل عداد المرجع الضعيف. لا ينبغي استدعاؤه مباشرة؛ بدلاً من ذلك، استخدم المؤشرات الذكية أو ThisProtector. |
| virtual [~Object](./~object/)() | يدمر الكائن. يحرر جميع هياكل البيانات الداخلية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ptr](./ptr/) | اسم مستعار لنوع المؤشر الذكي. |
## ملاحظات


بالإضافة إلى الطرق المتاحة في فئة C# [System.Object](./)، فإنه يتيح أيضًا دعم بعض المفاهيم الخاصة ببيئة الكود المترجم. يشمل ذلك عدّ المرجع المستخدم من قبل فئات المؤشرات الذكية ([System::SmartPtr](../smartptr/)، [System::WeakPtr](../weakptr/)، [System::DynamicWeakPtr](../dynamicweakptr/)) وغيرها من الخدمات المتعلقة بإدارة الذاكرة، وتصحيح الأخطاء، إلخ.

كل [Object](./) يحتوي على عدّائين للمرجع: عداد المرجع المشترك وعداد المرجع الضعيف. يتم دائمًا تخزين عداد المرجع الضعيف في بنية بيانات منفصلة بدلاً من داخل [Object](./) نفسه، مما يسمح للمؤشرات الضعيفة بالاستمرار بعد كائن المرجع. يتم تخزين عداد المرجع الذكي إما داخل الكائن نفسه أو في نفس البنية المنفصلة، اعتمادًا على حالة الماكرو ENABLE_EXTERNAL_REFCOUNT. بشكل افتراضي، يكون مفعلاً في بنى التصحيح ومعطلاً في بنى الإصدار. إذا تم تخزين عداد المؤشر الذكي داخل الكائن نفسه، تُنشأ البنية المنفصلة فقط إذا وجدت مؤشرات ضعيفة إلى الكائن. وإلا، تُنشأ جنبًا إلى جنب مع الكائن نفسه.

جميع المؤشرات الذكية تستخدم هذين عدّائي المرجع وتساهم في مجموعة الملكية الواحدة والوحيدة.

إذا تم إنشاء فئة فرعية من [Object](./) على المكدس، لا يجوز إنشاء مؤشرات ذكية لها، وإلا ستظهر مشكلة حذف المكدس.

يمكن تخصيص هذا النوع إما على المكدس كنوع قيمة أو على الكومة باستخدام دالة [System::MakeObject()](../makeobject/). بمجرد تخصيص الكائن، لا تخلط بين هاتين الحالتين أبداً: وجود مؤشرات [SmartPtr](../smartptr/) على كائنات مخصصة على المكدس محظور تمامًا.
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
