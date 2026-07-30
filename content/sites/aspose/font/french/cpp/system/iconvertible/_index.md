---
title: "Classe System::IConvertible"
linktitle: "IConvertible"
second_title: "Aspose.Font pour C++"
description: "Classe System::IConvertible. Définit des méthodes qui convertissent la valeur du type de référence ou de valeur implémentant en un type du runtime du langage commun ayant une valeur équivalente. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 3400
url: /fr/cpp/system/iconvertible/
---
## IConvertible class


Définit des méthodes qui convertissent la valeur du type de référence ou de valeur implémentant en un type du runtime du langage commun ayant une valeur équivalente. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class IConvertible : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | Renvoie le code de type pour cette instance. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en une valeur [Boolean](../boolean/) équivalente en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un uint32_teger 8 bits équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un caractère Unicode équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un [System::DateTime](../datetime/) équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un nombre [System::Decimal](../decimal/) équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un nombre à virgule flottante double précision équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées.. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un entier signé 16 bits équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un entier signé 32 bits équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un entier signé 64 bits équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un entier signé 8 bits équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un nombre à virgule flottante simple précision équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un [System::String](../string/) équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToString](./tostring/)() const | Analogue de la méthode C# [Object.ToString()](../object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un [System::Object](../object/) du type System::Type spécifié qui a une valeur équivalente, en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un uint32_teger 16 bits équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un uint32_teger 32 bits équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | Convertit la valeur de cette instance en un uint32_teger 64 bits équivalent en utilisant les informations de formatage spécifiques à la culture spécifiées. |
## Voir aussi

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
