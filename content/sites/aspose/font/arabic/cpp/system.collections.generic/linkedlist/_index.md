---
title: "فئة System::Collections::Generic::LinkedList"
linktitle: "LinkedList"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::LinkedList. إعلان مقدَّم لـ LinkedList في C++."
type: docs
weight: 3100
url: /ar/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة المحتواة. |
## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const T\&) override | يضيف **element** إلى نهاية القائمة. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | يضيف **element** بعد **node** في القائمة. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | يضيف **newNode** بعد **node** في القائمة. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | يضيف **element** قبل **node** في القائمة. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | يضيف **newNode** قبل **node** في القائمة. |
| [AddFirst](./addfirst/)(const T\&) | يضيف **element** إلى بداية القائمة. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | يضيف **newNode** إلى بداية القائمة. |
| [AddLast](./addlast/)(const T\&) | يضيف **element** إلى نهاية القائمة. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | يضيف **newNode** إلى نهاية القائمة. |
| [begin](./begin/)() | يحصل على المؤشر إلى العنصر الأول في المجموعة. |
| [begin](./begin/)() const | يحصل على مكرر للعنصر الأول في المجموعة المؤهلة بـ const. |
| [cbegin](./cbegin/)() const | يحصل على مكرر للعنصر الأول المؤهل بـ const في المجموعة. |
| [cend](./cend/)() const | يحصل على مكرر لعنصر غير موجود مؤهل بـ const خلف نهاية المجموعة. |
| [Clear](./clear/)() override | يحذف جميع العناصر في القائمة. |
| [Contains](./contains/)(const T\&) const override | يتحقق مما إذا كان **element** موجودًا في القائمة. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | ينسخ بيانات الحاوية إلى عناصر المصفوفة الموجودة. |
| [crbegin](./crbegin/)() const | يحصل على مكرر عكسي للعنصر الأخير المؤهل كـ const في المجموعة (الأول في الاتجاه العكسي). |
| [crend](./crend/)() const | يحصل على مكرر عكسي لعنصر غير موجود مؤهل كـ const قبل بداية المجموعة. |
| [end](./end/)() | يحصل على مكرر لعنصر غير موجود خلف نهاية المجموعة. |
| [end](./end/)() const | يحصل على مكرر لعنصر غير موجود خلف نهاية المجموعة المؤهلة بـ const. |
| [Find](./find/)(const T\&) const | ينفّذ بحثًا في الاتجاه الأمامي عن **element** في القائمة. |
| [FindLast](./findlast/)(const T\&) const | ينفّذ بحثًا في الاتجاه العكسي عن **element** في القائمة. |
| [get_Count](./get_count/)() const override | يحصل على عدد العناصر في القائمة. |
| [get_First](./get_first/)() const | يحصل على مؤشر إلى العنصر الأول في القائمة. |
| [get_Last](./get_last/)() const | يحصل على مؤشر إلى العنصر الأخير في القائمة. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المكرّر للتنقل عبر [LinkedList](./) الحالي. |
| [LinkedList](./linkedlist/)() | ينشئ [LinkedList](./) فارغًا. |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | منشئ النسخ. |
| [rbegin](./rbegin/)() | يحصل على مكرر عكسي للعنصر الأخير في المجموعة (الأول في الاتجاه العكسي). |
| [rbegin](./rbegin/)() const | يحصل على مكرر عكسي للعنصر الأخير في المجموعة المؤهلة كـ const (الأول في الاتجاه العكسي). |
| [Remove](./remove/)(const T\&) override | يزيل أول ظهور للـ **element** المحدد من القائمة. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | يزيل العقدة من القائمة. |
| [RemoveFirst](./removefirst/)() | يزيل أول عقدة من القائمة. |
| [RemoveLast](./removelast/)() | يزيل العقدة الأخيرة من القائمة. |
| [rend](./rend/)() | يحصل على مكرر عكسي لعنصر غير موجود قبل بداية المجموعة. |
| [rend](./rend/)() const | يحصل على مكرر عكسي لعنصر غير موجود قبل بداية المجموعة المؤهلة كـ const. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [const_iterator](./const_iterator/) | نوع المكرر الثابت. |
| [const_reverse_iterator](./const_reverse_iterator/) | نوع المكرر العكسي الثابت. |
| [iterator](./iterator/) | نوع المكرر. |
| [list_t](./list_t/) | نوع البيانات الأساسي. |
| [reverse_iterator](./reverse_iterator/) | نوع المكرر العكسي. |
## ملاحظات


حاوية قائمة مرتبطة. تنفّذ غلافًا فوق std::list. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // أنشئ نسخة من فئة LinkedList.
  auto list = MakeObject<LinkedList<int>>();

  // املأ القائمة المرتبطة.
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // اطبع عناصر القائمة المرتبطة.
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## انظر أيضًا

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
