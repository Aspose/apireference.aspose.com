---
title: "System::Collections::Generic::Stack فئة"
linktitle: "المكدس"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::Stack فئة. إعلان مسبق لفئة المكدس في C++."
type: docs
weight: 4600
url: /ar/cpp/system.collections.generic/stack/
---
## Stack class


[Stack](./) class forward declaration.

```cpp
template<typename T>class Stack : public System::Collections::Generic::IEnumerable<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddRange](./addrange/)(IEnumerablePtr) | يضع العناصر في المكدس. |
| virtual [Clear](./clear/)() | يحذف جميع العناصر من المكدس. |
| virtual [Contains](./contains/)(const T\&) const | يتحقق مما إذا كان العنصر المحدد موجودًا في الحاوية؛ يستخدم العامل == للمقارنة. |
| [data](./data/)() | مُستَخدِم بنية البيانات الداخلية. |
| [data](./data/)() const | مُستَخدِم بنية البيانات الداخلية. |
| virtual [get_Count](./get_count/)() const | يحصل على عدد العناصر في المكدس. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد للتنقل عبر المكدس الحالي. |
| [Peek](./peek/)() | يحصل على العنصر من قمة المكدس، لكنه يبقى في المكدس. |
| [Pop](./pop/)() | يحصل على العنصر من أعلى المكدس. |
| [Push](./push/)(const T\&) | يضع عنصرًا في أعلى المكدس. |
| [Stack](./stack/)() | يبني مكدسًا فارغًا. |
| [Stack](./stack/)(int) | يبني مكدسًا فارغًا. |
| [Stack](./stack/)(IEnumerablePtr) | منشئ النسخ. |
| virtual [ToArray](./toarray/)() | يحوّل المكدس إلى مصفوفة. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | مجموعة تحتوي على عناصر من نفس النوع. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) نوع. |
| [stack_t](./stack_t/) | معلومات RTTI. |
| [ValueType](./valuetype/) | نوع القيمة. |
## ملاحظات


[Stack](./) class wrapping std::list. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/stack.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void PrintItems(const SmartPtr<IEnumerable<int>> &stack)
{
  for (const auto item: stack)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // أنشئ نسخة من فئة Stack.
  auto stack = MakeObject<Stack<int>>();

  // املأ المكدس.
  stack->Push(1);
  stack->Push(2);
  stack->Push(3);

  // اطبع العنصر الأخير من المكدس. طريقة Peek لا تُزيل العنصر من المكدس.
  std::cout << stack->Peek() << std::endl;
  PrintItems(stack);

  // اطبع العنصر الأخير من المكدس. طريقة Pop تُزيل العنصر من المكدس.
  std::cout << stack->Pop() << std::endl;
  PrintItems(stack);

  return 0;
}
/*
This code example produces the following output:
3
3 2 1
3
2 1
*/
```

## انظر أيضًا

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
