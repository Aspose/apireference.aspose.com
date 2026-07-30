---
title: "Classe System::Array::Enumerator"
linktitle: "Énumérateur"
second_title: "Aspose.Font pour C++"
description: "Classe System::Array::Enumerator. Implémente l'interface IEnumerator qui permet l'énumération des éléments d'un objet Array. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 6800
url: /fr/cpp/system/array/enumerator/
---
## Enumerator class


Implémente l'interface IEnumerator qui permet l'énumération des éléments d'un objet [Array](../). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | Construit un nouvel objet [Enumerator](./) qui représente le tableau spécifié. |
| [get_Current](./get_current/)() const override | Renvoie une copie de l'élément actuel. |
| [MoveNext](./movenext/)() override | Vérifie si l'index de l'élément actuel ne pointe pas vers le dernier élément du tableau et l'avance si ce n'est pas le cas. |
| [Reset](./reset/)() override | Réinitialise l'index de l'élément actuel. |
| virtual [~Enumerator](./~enumerator/)() | Destructeur. |
## Voir aussi

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
