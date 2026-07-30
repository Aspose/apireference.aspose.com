---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "Aspose.Font pour C++"
description: "System::BoxedEnum class. Représente une valeur d'énumération empaquetée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 700
url: /fr/cpp/system/boxedenum/
---
## BoxedEnum class


Représente une valeur d'énumération empaquetée. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| Paramètre | Description |
| --- | --- |
| E | Type de la valeur d'énumération |
| UT | Le type sous-jacent de l'énumération **E** |
## Méthodes

| Méthode | Description |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | Construit une instance qui représente la valeur d'énumération spécifiée. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Convertit la valeur de la constante d'énumération empaquetée en une valeur entière 64 bits. |
| [IsBoxedEnum](./isboxedenum/)() override | Détermine si l'objet actuel représente une valeur empaquetée d'un type d'énumération. |
| [ToString](./tostring/)() const override | Convertit la valeur empaquetée représentée par l'objet actuel en chaîne. |

## Voir aussi

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
