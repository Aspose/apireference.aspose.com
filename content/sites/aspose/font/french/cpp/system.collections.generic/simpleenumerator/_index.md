---
title: "System::Collections::Generic::SimpleEnumerator classe"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::SimpleEnumerator classe. Classe d'itérateur pour les conteneurs simples contenant directement les éléments en utilisant les fonctions rbegin() et rend(). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3900
url: /fr/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


Classe d'itérateur pour des conteneurs simples contenant directement des éléments en utilisant les fonctions rbegin() et rend(). Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Paramètre | Description |
| --- | --- |
| Conteneur | Type de conteneur à parcourir. |
| Élément | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clone l'itérateur actuel. |
| [get_Current](./get_current/)() const override | Obtient l'élément 'courant'. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | Crée un itérateur simple. |

## Voir aussi

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
