---
title: "System::ArraySegment‑Klasse"
linktitle: "ArraySegment"
second_title: "Aspose.Font für C++"
description: "System::ArraySegment‑Klasse. Stellt ein Segment des eindimensionalen Arrays dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die System::SmartPtr‑Klasse, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 300
url: /de/cpp/system/arraysegment/
---
## ArraySegment class


Stellt ein Segment des eindimensionalen Arrays dar. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die [System::SmartPtr](../smartptr/)-Klasse, um Objekte dieses Typs zu verwalten.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Elemente des Array‑Segments. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
## Hinweise



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
  // Erstelle und fülle das Array.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // Erstelle das Array‑Segment, das das gesamte Array enthält.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // Gib die Elemente des Array‑Segments aus.
  Print(fullArray);

  // Erstelle das Array‑Segment.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // Gib die Elemente des Array‑Segments aus.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
