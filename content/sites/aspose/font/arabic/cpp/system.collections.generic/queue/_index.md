---
title: "فئة System::Collections::Generic::Queue"
linktitle: "Queue"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::Queue. إعلان مسبق لفئة Queue في C++."
type: docs
weight: 3600
url: /ar/cpp/system.collections.generic/queue/
---
## Queue class


[Queue](./) class forward declaration.

```cpp
template<typename T>class Queue : public System::Collections::Generic::IEnumerable<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Clear](./clear/)() | يحذف جميع العناصر في الطابور. |
| virtual [Contains](./contains/)(const T\&) const | يتحقق مما إذا كان الطابور يحتوي على عنصر محدد باستخدام العامل == لمقارنة العناصر. |
| [data](./data/)() | مُدخل للوصول إلى بنية البيانات الأساسية. |
| [data](./data/)() const | مُدخل للوصول إلى بنية البيانات الأساسية. |
| [Dequeue](./dequeue/)() | يحصل على العنصر من بداية الطابور. |
| [Enqueue](./enqueue/)(const T\&) | يضع العنصر في نهاية الطابور. |
| virtual [get_Count](./get_count/)() const | يحصل على عدد العناصر في الطابور. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدد للتنقل عبر الطابور. |
| [Peek](./peek/)() | يحصل على العنصر من بداية الطابور، لكنه لا يزيله من الطابور. |
| [Queue](./queue/)() | ينشئ طابورًا فارغًا. |
| [Queue](./queue/)(int) | ينشئ طابورًا فارغًا. |
| [Queue](./queue/)(const SharedPtr\<IEnumerable\<T\>\>\&) | منشئ النسخ. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | حاوية لعناصر من نفس النوع. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) نوع. |
| [queue_t](./queue_t/) | معلومات RTTI. |
| [ValueType](./valuetype/) | هذا النوع. |
## ملاحظات


[Queue](./) container wrapping STL list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/queue.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &queue)
{
  for (const int item: queue)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // إنشاء مثيل فئة Queue.
  auto queue = MakeObject<Queue<int>>();

  // املأ الطابور.
  queue->Enqueue(1);
  queue->Enqueue(2);
  queue->Enqueue(3);

  // اطبع العنصر الأول في الطابور. طريقة Peek لا تزيل العنصر من الطابور.
  std::cout << queue->Peek() << std::endl;
  // اطبع عناصر الطابور.
  PrintItems(queue);

  // اطبع العنصر الأول في الطابور. طريقة Dequeue تزيل العنصر من الطابور.
  std::cout << queue->Dequeue() << std::endl;
  // اطبع عناصر الطابور.
  PrintItems(queue);

  return 0;
}
/*
This code example produces the following output:
1
1 2 3
1
2 3
*/
```

## انظر أيضًا

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
