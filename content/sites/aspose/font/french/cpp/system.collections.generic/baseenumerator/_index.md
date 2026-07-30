---
title: "Classe System::Collections::Generic::BaseEnumerator"
linktitle: "BaseEnumerator"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::BaseEnumerator. Définition d’un énumérateur pour encapsuler les types de style STL afin d’une utilisation de style C#. Ne fait aucune assertion sur la structure du conteneur sauf l’existence d’un itérateur séquentiel. Utilise les fonctions begin() et end(). Les objets de cette classe doivent être alloués uniquement à l’aide de la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| Paramètre | Description |
| --- | --- |
| Conteneur | Type de conteneur de style STL. |
| Élément | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | Initialise l'itérateur. |
| [IsValid](./isvalid/)() const | Vérifie si [MoveNext()](./movenext/) a été appelé et que la fin n'a pas été atteinte. |
| [MoveNext](./movenext/)() override | Incrémentation de type énumérateur. |
| [Reset](./reset/)() override | Réinitialise l'énumérateur pour permettre de réénumérer les éléments. |

## Voir aussi

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
