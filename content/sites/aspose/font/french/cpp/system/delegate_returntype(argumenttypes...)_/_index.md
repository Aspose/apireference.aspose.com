---
title: "System::Delegate< ReturnType(ArgumentTypes...)> classe"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font pour C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)> classe. Représente un pointeur vers une fonction, une méthode ou un objet fonction. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 2100
url: /fr/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


Représente un pointeur vers une fonction, une méthode ou un objet fonction. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer les objets de ce type.

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Paramètre | Description |
| --- | --- |
| ReturnType | Le type de retour d'une fonction, d'une méthode ou d'un pointeur d'objet fonction qui est représenté par la classe |
| ArgumentTypes | La liste d'arguments d'une fonction, d'une méthode ou d'un pointeur d'objet fonction qui est représenté par la classe |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Delegate](./delegate/)() | Constructeur par défaut. Construit l'objet delegate qui ne pointe vers rien. |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | Constructeur de copie en déplacement. Prend la possession d'une entité pointée par le delegate spécifié. |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | Constructeur. Construit un objet delegate à partir du pointeur spécifié vers une fonction libre ou une méthode statique. |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | Constructeur. Construit un delegate à partir du pointeur spécifié vers l'objet fonction généré par std::bind(). |
| [Delegate](./delegate/)(int, T\&) | Constructeur. Construit un delegate à partir de l'objet fonction spécifié. |
| [Delegate](./delegate/)(long, T\&&) | Constructeur en déplacement. Construit un delegate à partir de l'objet fonction spécifié. |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | Constructeur. Construit un delegate qui pointe vers la méthode non statique spécifiée de l'objet spécifié. |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | Constructeur. Construit un delegate qui pointe vers la méthode non statique spécifiée de l'objet spécifié. |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | Construit un objet delegate qui pointe vers un objet fonction std::function. |
| [Empty](./empty/)() const | Détermine si l'objet delegate actuel est vide, p. ex. ne pointe vers aucune entité. |
| [operator()](./operator()/)(ArgumentTypes...) const | Invoque une fonction, une méthode ou un objet fonction pointé par l'objet delegate actuel. |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | Opérateur d'affectation en déplacement. Prend la possession d'une entité pointée par le delegate spécifié. |
| [operator==](./operator==/)(const Delegate\&) const | Compare deux objets delegate pour vérifier s'ils pointent vers la même entité. |
## Remarques



```cpp
#include "system/delegate.h"
#include <iostream>

// Déclarez le délégué.
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // Assignez à la variable l'adresse de la fonction PrintMessage.
  Message mes = Message(&PrintMessage);

  // Appelez la fonction.
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
