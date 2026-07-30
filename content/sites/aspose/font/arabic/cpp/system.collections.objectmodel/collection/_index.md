---
title: "System::Collections::ObjectModel::Collection فئة"
linktitle: "مجموعة"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::ObjectModel::Collection class. النوع الأساسي للمجموعات العامة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.collections.objectmodel/collection/
---
## Collection class


النوع الأساسي للمجموعات العامة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const T\&) override | يضيف قيمة إلى الحاوية. |
| [Clear](./clear/)() override | يحذف جميع العناصر. |
| [Collection](./collection/)() | ينشئ مجموعة فارغة. |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | يتحقق مما إذا كان العنصر موجودًا في المجموعة. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | ينسخ عناصر المجموعة إلى عناصر المصفوفة الموجودة. |
| [crbegin](./crbegin/)() const | يحصل على مكرر عكسي للعنصر الأخير المؤهل كـ const في المجموعة (الأول في الاتجاه العكسي). |
| [crend](./crend/)() const | يحصل على مكرر عكسي لعنصر غير موجود مؤهل كـ const قبل بداية المجموعة. |
| [get_Count](./get_count/)() const override | يحصل على عدد العناصر. |
| [get_Items](./get_items/)() | مُستَخدِم بنية البيانات الداخلية. |
| [get_Items](./get_items/)() const | مُستَخدِم بنية البيانات الداخلية. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد للتنقل عبر المجموعة. |
| [idx_get](./idx_get/)(int) const override | يحصل على القيمة في الفهرس المحدد. |
| [idx_set](./idx_set/)(int, T) override | يضبط القيمة في الفهرس المحدد. |
| [IndexOf](./indexof/)(const T\&) const override | يبحث عن عنصر في المجموعة. |
| [Insert](./insert/)(int, const T\&) override | يدرج العنصر في الموضع المحدد. |
| [operator[]](./operator[]/)(int) | يحصل على القيمة في الفهرس المحدد. |
| [operator[]](./operator[]/)(int) const | يحصل على القيمة في الفهرس المحدد. |
| [rbegin](./rbegin/)() | يحصل على مكرر عكسي للعنصر الأخير في المجموعة (الأول في الاتجاه العكسي). |
| [rbegin](./rbegin/)() const | يحصل على مكرر عكسي للعنصر الأخير في المجموعة المؤهلة كـ const (الأول في الاتجاه العكسي). |
| [Remove](./remove/)(const T\&) override | يزيل العنصر المحدد. |
| [RemoveAt](./removeat/)(int) override | يزيل العنصر في موضع محدد. |
| [rend](./rend/)() | يحصل على مكرر عكسي لعنصر غير موجود قبل بداية المجموعة. |
| [rend](./rend/)() const | يحصل على مكرر عكسي لعنصر غير موجود قبل بداية المجموعة المؤهلة كـ const. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | يجعل المؤشرات المخزنة ضعيفة (إن كان ذلك ممكناً). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## انظر أيضًا

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Font for C++](../../)
