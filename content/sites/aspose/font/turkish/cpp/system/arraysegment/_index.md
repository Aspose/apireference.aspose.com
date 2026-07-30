---
title: "System::ArraySegment sınıfı"
linktitle: "ArraySegment"
second_title: "Aspose.Font için C++"
description: "System::ArraySegment sınıfı. Tek boyutlu bir dizinin bir segmentini temsil eder. Bu tip yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'ta bu tipin nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 300
url: /tr/cpp/system/arraysegment/
---
## ArraySegment class


Tek boyutlu bir dizinin bir segmentini temsil eder. Bu tip yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tipin nesnelerini yönetmek için [System::SmartPtr](../smartptr/) sınıfını asla kullanmayın.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| Parametre | Açıklama |
| --- | --- |
| T | Dizi segmenti öğelerinin tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../object/gethashcode/) yönteminin bir benzeridir. Özel nesnelerin hashlenmesini sağlar. |
## Açıklamalar



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
  // Diziyi oluştur ve doldur.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // Tüm diziyi içeren dizi segmentini oluştur.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // Dizi segmenti öğelerini yazdır.
  Print(fullArray);

  // Dizi segmentini oluştur.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // Dizi segmenti öğelerini yazdır.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
