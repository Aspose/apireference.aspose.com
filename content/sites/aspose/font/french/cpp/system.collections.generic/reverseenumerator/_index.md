---
title: "Classe System::Collections::Generic::ReverseEnumerator"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::ReverseEnumerator. Énumérateur qui parcourt le conteneur en sens inverse. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu’argument en C++."
type: docs
weight: 3800
url: /fr/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| Paramètre | Description |
| --- | --- |
| Conteneur | Conteneur à parcourir. |
| Élément | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Current](./get_current/)() const override | Obtient l'élément 'courant'. |
| [IsValid](./isvalid/)() const | Vérifie si [MoveNext()](./movenext/) a été appelé et que la fin n'a pas été atteinte. |
| [MoveNext](./movenext/)() override | Incrémentation de type énumérateur. |
| [Reset](./reset/)() override | Réinitialise l'énumérateur pour permettre de réénumérer les éléments. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | Initialise l'itérateur. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | Destructeur. |

## Voir aussi

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
