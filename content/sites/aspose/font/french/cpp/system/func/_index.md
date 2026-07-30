---
title: "System::Func class"
linktitle: "Func"
second_title: "Aspose.Font pour C++"
description: "System::Func class. Délégation de fonction. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 2800
url: /fr/cpp/system/func/
---
## Func class


Délégation de fonction. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer les objets de ce type.

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| Paramètre | Description |
| --- | --- |
| Args | Arguments d'appel, puis type de retour obligatoire. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Func](./func/)() | Constructeur par défaut qui crée un Func nul. |
| [Func](./func/)(T\&&) | Constructeur qui crée l'objet [Func](./) et lui assigne une valeur (soit un rappel réel, soit nullptr). |
| [Func](./func/)(const Func\&) | Constructeur de copie. |
| [Func](./func/)(Func\&&) | Constructeur de déplacement. |
| [operator=](./operator=/)(const Func\&) | Assignation par copie. |
| [operator=](./operator=/)(Func\&&) | Assignation par déplacement. |
| [~Func](./~func/)() | Destructeur. |
## Remarques



```cpp
#include "system/func.h"
#include <iostream>

// Cette fonction accepte une instance de la délégation System::Func en tant que paramètre.
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // Créez une instance de la délégation System::Func.
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // Passez l'instance créée comme argument de fonction.
  Print(1, func);
  Print(2, func);
  Print(3, func);

  return 0;
}
/*
This code example produces the following output:
1
4
9
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
