---
title: "فئة System::Collections::Generic::List"
linktitle: "List"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::List. إعلان مسبق للقائمة في C++."
type: docs
weight: 3300
url: /ar/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | خاص بـ C++. |
| [Add](./add/)(const T\&) override | يضيف العنصر إلى نهاية القائمة. |
| [AddInitializer](./addinitializer/)(int, const T *) | يضيف عناصر إلى القائمة؛ يُستخدم عند ترجمة المُهيئات. |
| [AddRange](./addrange/)(IEnumerablePtr) | يضيف جميع العناصر من المجموعة (أو نفسها) إلى نهاية القائمة الحالية. |
| [AsReadOnly](./asreadonly/)() | يحصل على مرجع للقراءة فقط لهذه المجموعة. |
| [begin](./begin/)() | يحصل على المؤشر إلى العنصر الأول في المجموعة. |
| [begin](./begin/)() const | يحصل على مكرر للعنصر الأول في المجموعة المؤهلة بـ const. |
| [BinarySearch](./binarysearch/)(const T\&) const | يبحث عن عنصر في قائمة مرتبة. |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | يبحث عن عنصر في قائمة مرتبة. |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | يبحث عن عنصر في قائمة مرتبة. |
| [cbegin](./cbegin/)() const | يحصل على مكرر للعنصر الأول المؤهل بـ const في المجموعة. |
| [cend](./cend/)() const | يحصل على مكرر لعنصر غير موجود مؤهل بـ const خلف نهاية المجموعة. |
| [Clear](./clear/)() override | يحذف جميع العناصر. |
| [Contains](./contains/)(const T\&) const override | يتحقق مما إذا كان العنصر موجودًا في القائمة. |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | ينشئ قائمة من العناصر المحوّلة إلى نوع مختلف. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | ينسخ عناصر القائمة إلى عناصر مصفوفة موجودة. |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | ينسخ جميع العناصر إلى عناصر مصفوفة موجودة. |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | ينسخ العناصر بدءًا من الفهرس المحدد إلى عناصر مصفوفة موجودة. |
| [crbegin](./crbegin/)() const | يحصل على مكرر عكسي للعنصر الأخير المؤهل كـ const في المجموعة (الأول في الاتجاه العكسي). |
| [crend](./crend/)() const | يحصل على مكرر عكسي لعنصر غير موجود مؤهل كـ const قبل بداية المجموعة. |
| [data](./data/)() | دالة وصول إلى بنية البيانات الأساسية. |
| [data](./data/)() const | دالة وصول إلى بنية البيانات الأساسية. |
| [end](./end/)() | يحصل على مكرر لعنصر غير موجود خلف نهاية المجموعة. |
| [end](./end/)() const | يحصل على مكرر لعنصر غير موجود خلف نهاية المجموعة المؤهلة بـ const. |
| [Exists](./exists/)(System::Predicate\<T\>) | يتحقق مما إذا كان عنصر يطابق شرطًا محددًا موجودًا في القائمة. |
| [Find](./find/)(System::Predicate\<T\>) | يبحث عن عنصر يطابق شرطًا محددًا. |
| [FindAll](./findall/)(System::Predicate\<T\>) | يبحث عن عناصر تطابق شرطًا محددًا. |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | يبحث عن عنصر يطابق شرطًا محددًا. |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | يبحث عن عنصر يطابق شرطًا محددًا. |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | يبحث عن عنصر يطابق شرطًا محددًا. |
| [FindLast](./findlast/)(System::Predicate\<T\>) | يبحث عن العنصر الأخير الذي يطابق شرطًا محددًا. |
| [ForEach](./foreach/)(System::Action\<T\>) | يطبق الإجراء على جميع العناصر في القائمة. |
| [get_Capacity](./get_capacity/)() const | يحصل على سعة القائمة الحالية. |
| [get_Count](./get_count/)() const override | يحصل على عدد العناصر في القائمة الحالية. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المكرّر للتنقل عبر عناصر القائمة. |
| [GetRange](./getrange/)(int, int) | ينشئ شريحة من القائمة. |
| [idx_get](./idx_get/)(int) const override | يحصل على العنصر في موضع محدد. |
| [idx_set](./idx_set/)(int, T) override | يحدد العنصر في موضع محدد. |
| [IndexOf](./indexof/)(const T\&) const override | يحصل على الفهرس الأول للعنصر المحدد. |
| [IndexOf](./indexof/)(const T\&, int) const | يبحث عن العنصر المحدد في القائمة. |
| [Insert](./insert/)(int, const T\&) override | يدرج العنصر في الموضع المحدد. |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | يدرج نطاق البيانات في موضع محدد. |
| [LastIndexOf](./lastindexof/)(const T\&) const | يبحث عن الكائن المحدد ويعيد الفهرس الصفري للحدوث الأخير داخل القائمة بأكملها. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | يبحث عن الكائن المحدد ويعيد الفهرس الصفري للحدوث الأخير ضمن نطاق العناصر في الـ[List](./) الذي يمتد من العنصر الأول إلى الفهرس المحدد. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | يبحث عن الكائن المحدد ويعيد الفهرس الصفري للحدوث الأخير ضمن نطاق العناصر في الـ[List](./) الذي يحتوي على العدد المحدد من العناصر وينتهي عند الفهرس المحدد. |
| [List](./list/)() | ينشئ قائمة فارغة. |
| [List](./list/)(int) | ينشئ قائمة بسعة محددة مسبقًا. |
| [List](./list/)(IEnumerablePtr) | منشئ النسخ. |
| [operator[]](./operator[]/)(int) | دالة وصول. |
| [operator[]](./operator[]/)(int) const | دالة وصول. |
| [rbegin](./rbegin/)() | يحصل على مكرر عكسي للعنصر الأخير في المجموعة (الأول في الاتجاه العكسي). |
| [rbegin](./rbegin/)() const | يحصل على مكرر عكسي للعنصر الأخير في المجموعة المؤهلة كـ const (الأول في الاتجاه العكسي). |
| [Remove](./remove/)(const T\&) override | يزيل النسخة الأولى من العنصر المحدد من القائمة. |
| [RemoveAll](./removeall/)(Predicate\<T\>) | يزيل جميع العناصر التي تطابق الشرط المحدد. |
| [RemoveAt](./removeat/)(int) override | يزيل العنصر في الموضع المحدد. |
| [RemoveRange](./removerange/)(int, int) | يزيل شريحة من القائمة. |
| [rend](./rend/)() | يحصل على مكرر عكسي لعنصر غير موجود قبل بداية المجموعة. |
| [rend](./rend/)() const | يحصل على مكرر عكسي لعنصر غير موجود قبل بداية المجموعة المؤهلة كـ const. |
| [Reverse](./reverse/)() | يعكس ترتيب العناصر في القائمة بأكملها. |
| [Reverse](./reverse/)(int, int) | يعكس ترتيب العناصر في شريحة القائمة. |
| [set_Capacity](./set_capacity/)(int) | يضبط سعة القائمة. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | يرتب العناصر في القائمة. |
| [Sort](./sort/)() | يرتب العناصر في القائمة باستخدام المقارن الافتراضي. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | يرتب العناصر في شريحة القائمة. |
| [Sort](./sort/)(Comparison\<T\>, bool) | يرتب العناصر في القائمة. |
| [ToArray](./toarray/)() const | يحوّل القائمة إلى مصفوفة. |
| [TrimExcess](./trimexcess/)() | يضبط سعة القائمة لتتناسب مع حجمها. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | يحدد ما إذا كان كل عنصر في المجموعة يطابق الشروط المحددة بواسطة الشرط المحدد. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | نوع الواجهة. |
| [const_iterator](./const_iterator/) | نوع المكرر الثابت. |
| [const_reverse_iterator](./const_reverse_iterator/) | نوع المكرر العكسي الثابت. |
| [IEnumerablePtr](./ienumerableptr/) | حاوية تحتفظ بالعناصر من نفس النوع الذي نحتفظ به. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) نوع. |
| [iterator](./iterator/) | نوع المكرر. |
| [reverse_iterator](./reverse_iterator/) | نوع المكرر العكسي. |
| [ValueType](./valuetype/) | هذا النوع. |
| [vector_t](./vector_t/) | معلومات RTTI. |
## ملاحظات


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // إنشاء القائمة الأولى.
  auto list1 = MakeObject<List<int>>();

  // ملء القائمة الأولى.
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // فرز القائمة الأولى.
  // عناصر القائمة الأولى ستكون: {-5, 1, 3, 8}
  list1->Sort();

  // إزالة العنصر عند الفهرس 2.
  // عناصر القائمة الأولى ستكون: {-5, 1, 8}
  list1->RemoveAt(2);

  // إدراج العنصر في الفهرس 1.
  // عناصر القائمة الأولى ستكون: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // إنشاء القائمة الثانية.
  auto list2 = MakeObject<List<int>>();

  // ملء القائمة الثانية.
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // إلحاق العناصر من القائمة الثانية إلى الأولى.
  list1->AddRange(list2);

  // طباعة عناصر القائمة الأولى.
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## انظر أيضًا

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
