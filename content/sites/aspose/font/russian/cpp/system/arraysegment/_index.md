---
title: "Класс System::ArraySegment"
linktitle: "ArraySegment"
second_title: "Aspose.Font для C++"
description: "Класс System::ArraySegment. Представляет сегмент одномерного массива. Этот тип должен выделяться в стеке и передаваться в функции по значению или по ссылке. Никогда не используйте класс System::SmartPtr для управления объектами этого типа в C++."
type: docs
weight: 300
url: /ru/cpp/system/arraysegment/
---
## ArraySegment class


Представляет сегмент одномерного массива. Этот тип должен выделяться в стеке и передаваться в функции по значению или по ссылке. Никогда не используйте класс [System::SmartPtr](../smartptr/) для управления объектами этого типа.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов сегмента массива. |
## Методы

| Метод | Описание |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | Аналог метода C# [Object.GetHashCode()](../object/gethashcode/). Позволяет хешировать пользовательские объекты. |
## Примечания



```cpp
#include <system/array_segment.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<ArraySegment<String>> &segment)
{
  for (auto i = segment->get_Offset(); i < segment->get_Offset() + segment->get_Count(); i++)
  {
    std::cout << segment->get_Array()[i] << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Создайте и заполните массив.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // Создайте сегмент массива, содержащий весь массив.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // Выведите элементы сегмента массива.
  Print(fullArray);

  // Создайте сегмент массива.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // Выведите элементы сегмента массива.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## См. также

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
