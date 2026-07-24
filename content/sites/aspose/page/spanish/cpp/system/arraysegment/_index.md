---
title: "Clase System::ArraySegment"
linktitle: "ArraySegment"
second_title: "Aspose.Page para C++"
description: "Clase System::ArraySegment. Representa un segmento del arreglo unidimensional. Este tipo debe ser asignado en la pila y pasado a funciones por valor o por referencia. Nunca use la clase System::SmartPtr para gestionar objetos de este tipo en C++."
type: docs
weight: 300
url: /es/cpp/system/arraysegment/
---
## ArraySegment class


Representa un segmento del arreglo unidimensional. Este tipo debe ser asignado en la pila y pasado a funciones por valor o por referencia. Nunca use la clase [System::SmartPtr](../smartptr/) para gestionar objetos de este tipo.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de los elementos del segmento de arreglo. |
## Métodos

| Método | Descripción |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | Análogo del método C# [Object.GetHashCode()](../object/gethashcode/). Permite el hash de objetos personalizados. |
## Observaciones



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
  // Cree y rellene la matriz.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // Cree el segmento de arreglo que contiene todo el arreglo.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // Imprima los elementos del segmento de arreglo.
  Print(fullArray);

  // Crear el segmento de matriz.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // Imprima los elementos del segmento de arreglo.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## Ver también

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
