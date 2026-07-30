---
title: "Classe System::IFormatProvider"
linktitle: "IFormatProvider"
second_title: "Aspose.Font pour C++"
description: "Classe System::IFormatProvider. Définit une méthode qui fournit des informations de formatage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3800
url: /fr/cpp/system/iformatprovider/
---
## IFormatProvider class


Définit une méthode qui fournit des informations de formatage. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class IFormatProvider : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | Renvoie un objet qui fournit des services de formatage pour le type spécifié. |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
