---
title: "Classe System::DefaultBoxedValue"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::DefaultBoxedValue. Implémentation de la classe BoxedValue. Permet aux spécialisations de BoxingValue d'être déclarées sans dupliquer le code commun. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2000
url: /fr/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | Construit une nouvelle instance de la classe [DefaultBoxedValue](./) qui représente la valeur spécifiée. |
| [Equals](./equals/)(ptr) override | Détermine l'égalité des valeurs encapsulées représentées par les objets actuel et spécifié. |
| [GetHashCode](./gethashcode/)() const override | Renvoie un code de hachage pour l'objet actuel. |
| [GetType](./gettype/)() const override | Obtient le type réel de l'objet. |
| [is](./is/)() const | Détermine si le type de la valeur encapsulée représentée par l'objet actuel est **V**. |
| [ToString](./tostring/)() const override | Renvoie la représentation sous forme de chaîne de la valeur encapsulée. |
| [unbox](./unbox/)() const | Déboîte la valeur empaquetée. |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
