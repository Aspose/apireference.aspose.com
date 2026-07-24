---
title: "System::ArraySegment klasse"
linktitle: "ArraySegment"
second_title: "Aspose.Page voor C++"
description: "System::ArraySegment klasse. Vertegenwoordigt een segment van de één-dimensionale array. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr klasse om objecten van dit type in C++ te beheren."
type: docs
weight: 300
url: /nl/cpp/system/arraysegment/
---
## ArraySegment class


Vertegenwoordigt een segment van de één-dimensionale array. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/) klasse om objecten van dit type te beheren.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| Parameter | Beschrijving |
| --- | --- |
| T | Het type van de elementen van het array‑segment. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | Analoge van de C#-methode [Object.GetHashCode()](../object/gethashcode/). Maakt het hashen van aangepaste objecten mogelijk. |
## Opmerkingen



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
  // Maak en vul de array.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // Maak het array‑segment dat de volledige array bevat.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // Print de items van het arraysegment.
  Print(fullArray);

  // Maak het arraysegment.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // Print de items van het arraysegment.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
