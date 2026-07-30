---
title: "System::ArraySegment classe"
linktitle: "ArraySegment"
second_title: "Aspose.Font pour C++"
description: "System::ArraySegment classe. Représente un segment du tableau unidimensionnel. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 300
url: /fr/cpp/system/arraysegment/
---
## ArraySegment class


Représente un segment du tableau unidimensionnel. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer les objets de ce type.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments du segment de tableau. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../object/gethashcode/). Permet le hachage d'objets personnalisés. |
## Remarques



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
  // Crée et remplit le tableau.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // Créez le segment de tableau qui contient le tableau complet.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // Imprimez les éléments du segment de tableau.
  Print(fullArray);

  // Créez le segment de tableau.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // Imprimez les éléments du segment de tableau.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
