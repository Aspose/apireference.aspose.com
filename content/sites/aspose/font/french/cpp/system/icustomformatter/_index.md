---
title: "Classe System::ICustomFormatter"
linktitle: "ICustomFormatter"
second_title: "Aspose.Font pour C++"
description: "classe System::ICustomFormatter. Définit une méthode qui effectue un formatage personnalisé d’une représentation sous forme de chaîne d’une valeur représentée par l’objet spécifié. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 3500
url: /fr/cpp/system/icustomformatter/
---
## ICustomFormatter class


Définit une méthode qui effectue un formatage personnalisé d’une représentation sous forme de chaîne d’une valeur représentée par l’objet spécifié. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d’instance de ce type sur la pile ou en utilisant l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des fautes d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu’argument.

```cpp
class ICustomFormatter : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | Renvoie une représentation sous forme de chaîne d’une valeur représentée par l’objet actuel en utilisant le format spécifié. |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
