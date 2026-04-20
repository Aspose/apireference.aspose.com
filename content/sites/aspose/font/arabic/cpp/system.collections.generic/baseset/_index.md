---
title: "فئة System::Collections::Generic::BaseSet"
linktitle: "BaseSet"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام فئة System::Collections::Generic::BaseSet في C++."
type: docs
weight: 800
url: /ar/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | خاص بـ C++. |
| [Add](./add/)(const T\&) override | يضيف عنصرًا إلى المجموعة. |
| [begin](./begin/)() const | يحصل على مكرر للعنصر الأول في المجموعة المؤهلة بـ const. |
| [cbegin](./cbegin/)() const | يحصل على مكرر للعنصر الأول المؤهل بـ const في المجموعة. |
| [cend](./cend/)() const | يحصل على مكرر لعنصر غير موجود مؤهل بـ const خلف نهاية المجموعة. |
| [Clear](./clear/)() override | يحذف جميع العناصر في المجموعة. |
| [Contains](./contains/)(const T\&) const override | يتحقق مما إذا كان العنصر موجودًا في المجموعة. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | ينسخ محتويات التجزئة إلى عناصر المصفوفة الموجودة. |
| [data](./data/)() | مُدخل للوصول إلى بنية البيانات الأساسية. |
| [data](./data/)() const | مُدخل للوصول إلى بنية البيانات الأساسية. |
| [end](./end/)() const | يحصل على مكرر لعنصر غير موجود خلف نهاية المجموعة المؤهلة بـ const. |
| [get_Count](./get_count/)() const override | يحصل على عدد العناصر في المجموعة. |
| [GetEnumerator](./getenumerator/)() override | ينشئ مُعدِّد. |
| [Remove](./remove/)(const T\&) override | يزيل العنصر من المجموعة. |
| [TryAdd](./tryadd/)(const T\&) | يضيف عنصرًا إلى المجموعة. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | الواجهة المُنفذة. |
| [const_iterator](./const_iterator/) | نوع المكرر الثابت. |
| [IEnumerablePtr](./ienumerableptr/) | مؤشر واجهة قابلة للتعداد. |
| [IEnumeratorPtr](./ienumeratorptr/) | مؤشر [Enumerator](./enumerator/). |
| [iterator](./iterator/) | نوع المكرر. |
| [set_t](./set_t/) | نوع البيانات الأساسي. |
| [ThisPtr](./thisptr/) | نوع المؤشر. |
| [ThisType](./thistype/) | النوع الذاتي. |
| [ValueType](./valuetype/) | نوع القيمة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
