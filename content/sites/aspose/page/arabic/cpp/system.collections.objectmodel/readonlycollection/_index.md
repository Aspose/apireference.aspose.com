---
title: "System::Collections::ObjectModel::ReadOnlyCollection فئة"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Page لـ C++"
description: "System::Collections::ObjectModel::ReadOnlyCollection فئة. يلف حاوية محددة للوصول إليها في وضع القراءة فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على لف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


يلف حاوية محددة للوصول إليها في وضع القراءة فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على لف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| Parameter | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | يتحقق مما إذا كانت الحاوية تحتوي على العنصر المحدد. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | ينسخ عناصر الحاوية إلى عناصر مصفوفة موجودة. |
| [get_Count](./get_count/)() const override | يحصل على عدد عناصر الحاوية. |
| [get_IsReadOnly](./get_isreadonly/)() const override | يتحقق مما إذا كانت المجموعة للقراءة فقط. |
| [GetEnumerator](./getenumerator/)() override | يحصل على مُعدِّد المجموعة. |
| [idx_get](./idx_get/)(int) const override | يحصل على العنصر في موقع محدد. |
| [IndexOf](./indexof/)(const T\&) const override | يبحث عن العنصر المحدد في المجموعة. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | يلف مجموعة للقراءة فقط حول مجموعة محددة. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | لا يفعل شيئًا لأن مجموعة القراءة فقط تقوم فقط بلف البيانات ولا تخزن شيئًا. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يسترجع تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يسترجع تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يسترجع تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يسترجع تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | الواجهة المُنفذة. |
| [IEnumeratorPtr](./ienumeratorptr/) | حاوية من نفس العناصر. |
| [ValueType](./valuetype/) | نوع القيمة. |

## انظر أيضًا

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
