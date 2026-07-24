---
title: "System::Collections::Generic::BaseSet فئة"
linktitle: "BaseSet"
second_title: "Aspose.Page لـ C++"
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
| [begin](./begin/)() const | يحصل على مُكرّر للعنصر الأول في المجموعة المؤهلة بـ const. |
| [cbegin](./cbegin/)() const | يحصل على المؤشر إلى العنصر الأول المؤهل كـ const في المجموعة. |
| [cend](./cend/)() const | يحصل على المؤشر لعنصر غير موجود مؤهل كـ const يقع خلف نهاية المجموعة. |
| [Clear](./clear/)() override | يحذف جميع العناصر في المجموعة. |
| [Contains](./contains/)(const T\&) const override | يتحقق مما إذا كان العنصر موجودًا في المجموعة. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | ينسخ محتويات التجزئة إلى عناصر المصفوفة الموجودة. |
| [data](./data/)() | مُستَخدِم بنية البيانات الأساسية. |
| [data](./data/)() const | مُستَخدِم بنية البيانات الأساسية. |
| [end](./end/)() const | يحصل على المؤشر لعنصر غير موجود يقع خلف نهاية المجموعة المؤهلة كـ const. |
| [get_Count](./get_count/)() const override | يحصل على عدد العناصر في المجموعة. |
| [GetEnumerator](./getenumerator/)() override | ينشئ مُعدِّداً. |
| [Remove](./remove/)(const T\&) override | يزيل العنصر من المجموعة. |
| [TryAdd](./tryadd/)(const T\&) | يضيف عنصرًا إلى المجموعة. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يسترجع تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يسترجع تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يسترجع تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يسترجع تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | الواجهة المُنفذة. |
| [const_iterator](./const_iterator/) | نوع المكرّر الثابت. |
| [IEnumerablePtr](./ienumerableptr/) | مؤشر واجهة Enumerable. |
| [IEnumeratorPtr](./ienumeratorptr/) | مؤشر [Enumerator](./enumerator/). |
| [iterator](./iterator/) | نوع المكرّر. |
| [set_t](./set_t/) | نوع البيانات الأساسي. |
| [ThisPtr](./thisptr/) | نوع المؤشر. |
| [ThisType](./thistype/) | النوع الذاتي. |
| [ValueType](./valuetype/) | نوع القيمة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
