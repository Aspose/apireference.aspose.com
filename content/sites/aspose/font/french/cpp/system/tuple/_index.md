---
title: "classe System::Tuple"
linktitle: "Tuple"
second_title: "Aspose.Font pour C++"
description: "classe System::Tuple. Classe qui représente une structure de données tuple. Le nombre maximal d'éléments est de 8 en C++."
type: docs
weight: 6400
url: /fr/cpp/system/tuple/
---
## Tuple class


Classe qui représente une structure de données tuple. Le nombre maximal d'éléments est 8.

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| Paramètre | Description |
| --- | --- |
| Args | Les types des éléments du tuple. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Détermine si l'objet actuel et l'objet spécifié sont identiques. |
| [get_Item](./get_item/)() const | Obtient la valeur du composant de l'objet [Tuple](./). |
| [Tuple](./tuple/)(Args...) | Construit un objet tuple. |
## Remarques



```cpp
#include "system/smart_ptr.h"
#include "system/tuple.h"
#include <iostream>

int main()
{
  const auto tuple = System::MakeObject<System::Tuple<int, int, int>>(32, 16, 128);

  std::cout <<
    "Item 1: " << tuple->get_Item<0>() << std::endl <<
    "Item 2: " << tuple->get_Item<1>() << std::endl <<
    "Item 3: " << tuple->get_Item<2>() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Item 1: 32
Item 2: 16
Item 3: 128
*/
```

## Voir aussi

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
