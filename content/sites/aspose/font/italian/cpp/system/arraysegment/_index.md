---
title: "Classe System::ArraySegment"
linktitle: "ArraySegment"
second_title: "Aspose.Font per C++"
description: "Classe System::ArraySegment. Rappresenta un segmento dell'array monodimensionale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 300
url: /it/cpp/system/arraysegment/
---
## ArraySegment class


Rappresenta un segmento dell'array monodimensionale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi del segmento di array. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
## Osservazioni



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
  // Crea e riempi l'array.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // Crea il segmento di array che contiene l'intero array.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // Stampa gli elementi del segmento di array.
  Print(fullArray);

  // Crea il segmento di array.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // Stampa gli elementi del segmento di array.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
