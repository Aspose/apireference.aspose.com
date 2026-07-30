---
title: "System::Collections::Generic::LinkedListNode classe"
linktitle: "LinkedListNode"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::LinkedListNode classe. Nœud de liste chaînée. Implémente un wrapper autour d'un itérateur de std::list qui est encapsulé dans une liste chaînée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 3200
url: /fr/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


Nœud de liste chaînée. Implémente un wrapper autour d'un itérateur de std::list qui est encapsulé dans une liste chaînée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| Paramètre | Description |
| --- | --- |
| T | Type de valeur stockée. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [get_List](./get_list/)() const | Obtient la liste contenant. |
| [get_Next](./get_next/)() const | Obtient le nœud suivant. |
| [get_Previous](./get_previous/)() const | Obtient le nœud précédent. |
| [get_Value](./get_value/)() const | Obtient la valeur stockée. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | Constructeur. |
| [set_Value](./set_value/)(const T\&) | Définit la valeur stockée. |

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
