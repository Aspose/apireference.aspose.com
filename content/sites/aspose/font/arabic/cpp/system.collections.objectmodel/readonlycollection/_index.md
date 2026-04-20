---
title: "System::Collections::ObjectModel::ReadOnlyCollection فئة"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::ObjectModel::ReadOnlyCollection class. يلف حاوية محددة للوصول إليها في وضع القراءة فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


يلف حاوية محددة للوصول إليها في وضع القراءة فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | يتحقق مما إذا كانت الحاوية تحتوي على عنصر محدد. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | ينسخ عناصر الحاوية إلى عناصر مصفوفة موجودة. |
| [get_Count](./get_count/)() const override | يحصل على عدد عناصر الحاوية. |
| [get_IsReadOnly](./get_isreadonly/)() const override | يتحقق مما إذا كانت المجموعة للقراءة فقط. |
| [GetEnumerator](./getenumerator/)() override | يحصل على مُعدِّد المجموعة. |
| [idx_get](./idx_get/)(int) const override | يحصل على العنصر في موضع محدد. |
| [IndexOf](./indexof/)(const T\&) const override | يبحث عن عنصر محدد في المجموعة. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | يُغلف مجموعة للقراءة فقط حول مجموعة محددة. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | لا يفعل شيئًا لأن مجموعة القراءة فقط تُغلف البيانات فقط ولا تخزن شيئًا. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | الواجهة المُنفذة. |
| [IEnumeratorPtr](./ienumeratorptr/) | حاوية للعناصر المتشابهة. |
| [ValueType](./valuetype/) | نوع القيمة. |

## انظر أيضًا

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
