---
title: "فئة System::Object"
linktitle: "Object"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Object. الفئة الأساسية التي تتيح استخدام الأساليب المتوفرة لفئة System.Object في C#. يجب أن ترث جميع الفئات غير التافهة المستخدمة في البيئة المترجمة منها في C++."
type: docs
weight: 4800
url: /ar/cpp/system/object/
---
## Object class


الفئة الأساسية التي تتيح استخدام الأساليب المتوفرة لفئة [System.Object](./) في C#. يجب أن ترث جميع الفئات غير التافهة المستخدمة في البيئة المترجمة منها.

```cpp
class Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | يقارن الكائنات باستخدام دلالة [Object.Equals](./equals/) في C#. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | يقارن كائنات النوع المرجعي بأسلوب C#. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | يقارن كائنات النوع القيمي بأسلوب C#. |
| static [Equals](./equals/)(float const\&, float const\&) | يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين رغم أنه وفقًا للمعيار IEC 60559:1989 لا يُعتبر NaN مساويًا لأي قيمة، بما في ذلك NaN. |
| static [Equals](./equals/)(double const\&, double const\&) | يحاكي مقارنة النقطة العائمة بأسلوب C# حيث يُعتبر NaNانان متساويين رغم أنه وفقًا للمعيار IEC 60559:1989 لا يُعتبر NaN مساويًا لأي قيمة، بما في ذلك NaN. |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | لأغراض داخلية فقط. |
| [GetCounter](./getcounter/)() | يحصل على بنية عداد المرجع المرتبطة بالكائن. |
| virtual [GetHashCode](./gethashcode/)() const | نظير طريقة [Object.GetHashCode()](./gethashcode/) في C#. يتيح تجزئة الكائنات المخصصة. |
| virtual [GetType](./gettype/)() const | يحصل على النوع الفعلي للكائن. نظير استدعاء [System.Object.GetType()](./gettype/) في C#. |
| virtual [Is](./is/)(const TypeInfo\&) const | تحقق مما إذا كان الكائن يمثل مثيلًا للنوع الموصوف بـ targetType. نظير عامل 'is' في C#. |
| [Lock](./lock/)() | ينفّذ قفل عبارة lock() في C#. استدعِه مباشرة أو استخدم كائن الحارس [LockContext](../lockcontext/). |
| virtual [MemberwiseClone](./memberwiseclone/)() const | نظير طريقة [Object.MemberwiseClone()](./memberwiseclone/) في C#. يتيح استنساخ الأنواع المخصصة. |
| [Object](./object/)() | ينشئ كائنًا. يهيئ جميع بنى البيانات الداخلية. |
| [Object](./object/)(Object const\&) | منشئ النسخ. لا ينسخ شيئًا فعليًا، بل يهيئ كائنًا جديدًا ويسمح بإنشاء نسخ فرعية. |
| [operator=](./operator=/)(Object const\&) | عامل الإسناد. لا ينسخ شيئًا فعليًا، بل يهيئ كائنًا جديدًا ويسمح بإنشاء نسخ فرعية. |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | يقارن الكائنات بالمرجع. |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | يقارن الكائنات بالمرجع. |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | يقارن مرجعيًا كائن النوع القيمي مع nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | تخصيص لـ [Object::ReferenceEquals](./referenceequals/) لحالة السلسلة و nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | تخصيص لـ [Object::ReferenceEquals](./referenceequals/) لحالة السلاسل. |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | يقلل عداد الإشارة المشتركة بالقيمة المحددة. |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | عيّن معامل القالب الـ n'th إلى مؤشر ضعيف (بدلاً من المشترك). يسمح بتبديل المؤشرات في الحاويات إلى الوضع الضعيف. |
| [SharedCount](./sharedcount/)() const | يحصل على القيمة الحالية لعداد الإشارة المشتركة. |
| [SharedRefAdded](./sharedrefadded/)() | يزيد عداد الإشارة المشتركة. لا ينبغي استدعاؤه مباشرة؛ بدلاً من ذلك، استخدم المؤشرات الذكية أو ThisProtector. |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | يقلل ويعيد قيمة عداد الإشارة المشتركة. لا ينبغي استدعاؤه مباشرة؛ بدلاً من ذلك، استخدم المؤشرات الذكية أو ThisProtector. |
| virtual [ToString](./tostring/)() const | نظير طريقة C# [Object.ToString()](./tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [Type](./type/)() | ينفّذ بنية C# typeof([System.Object](./)). |
| [Unlock](./unlock/)() | ينفّذ إلغاء قفل عبارة C# lock(). استدعِه مباشرة أو استخدم كائن الحراسة [LockContext](../lockcontext/). |
| [WeakRefAdded](./weakrefadded/)() | يزيد عداد الإشارة الضعيفة. لا ينبغي استدعاؤه مباشرة؛ بدلاً من ذلك، استخدم المؤشرات الذكية أو ThisProtector. |
| [WeakRefRemoved](./weakrefremoved/)() | يقلل عداد الإشارة الضعيفة. لا ينبغي استدعاؤه مباشرة؛ بدلاً من ذلك، استخدم المؤشرات الذكية أو ThisProtector. |
| virtual [~Object](./~object/)() | يدمر الكائن. يحرّر جميع هياكل البيانات الداخلية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [ptr](./ptr/) | اسم مستعار لنوع المؤشر الذكي. |
## ملاحظات


إلى جانب الطرق المتاحة في فئة C# [System.Object](./)، يتيح أيضًا دعم بعض المفاهيم الخاصة ببيئة الشيفرة المترجمة. يشمل ذلك عدّ الإشارات المستخدم من قبل فئات المؤشرات الذكية ([System::SmartPtr](../smartptr/)، [System::WeakPtr](../weakptr/)، [System::DynamicWeakPtr](../dynamicweakptr/)) وغيرها من الخدمات المتعلقة بإدارة الذاكرة، وتصحيح الأخطاء، إلخ.

كل [Object](./) يحتوي على عدّادين للإشارة: عدّاد الإشارة المشتركة وعدّاد الإشارة الضعيفة. يُخزن عدّاد الإشارة الضعيفة دائمًا في هيكل بيانات منفصل بدلاً من داخل [Object](./) نفسه، مما يسمح للمؤشرات الضعيفة بالبقاء بعد انتهاء عمر الكائن المشار إليه. يُخزن عدّاد الإشارة الذكية إما داخل الكائن نفسه أو في نفس الهيكل المنفصل، حسب حالة ماكرو ENABLE_EXTERNAL_REFCOUNT. بشكل افتراضي، يكون مفعلاً في بناءات التصحيح ومُعطلاً في بناءات الإصدار. إذا تم تخزين عدّاد المؤشر الذكي داخل الكائن نفسه، يُنشأ الهيكل المنفصل فقط إذا وجدت مؤشرات ضعيفة إلى الكائن. وإلا، يُنشأ إلى جانب الكائن نفسه.

جميع المؤشرات الذكية تستخدم هذين عدّادي الإشارة وتساهم في مجموعة الملكية الواحدة والوحيدة.

إذا تم إنشاء فئة فرعية من [Object](./) على المكدس، لا يجوز إنشاء مؤشرات ذكية لها، وإلا ستظهر مشكلة حذف المكدس.

يمكن تخصيص هذا النوع إما على المكدس كنوع قيمة أو على الكومة باستخدام الدالة [System::MakeObject()](../makeobject/). بمجرد تخصيص الكائن، لا تخلط بين هاتين الحالتين أبداً: وجود مؤشرات [SmartPtr](../smartptr/) إلى كائنات مُخصَّصة على المكدس محظور تمامًا.
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
