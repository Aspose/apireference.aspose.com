---
title: "System::Decimal classe"
linktitle: "Décimal"
second_title: "Aspose.Font pour C++"
description: "System::Decimal classe. Représente un nombre décimal. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe System::SmartPtr pour gérer les objets de ce type en C++."
type: docs
weight: 1900
url: /fr/cpp/system/decimal/
---
## Decimal class


Représente un nombre décimal. Ce type doit être alloué sur la pile et passé aux fonctions par valeur ou par référence. N'utilisez jamais la classe [System::SmartPtr](../smartptr/) pour gérer les objets de ce type.

```cpp
class Decimal
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | Ajoute deux valeurs [Decimal](./) spécifiées. |
| static [Ceiling](./ceiling/)(const Decimal\&) | Renvoie la plus petite valeur entière supérieure ou égale à la valeur spécifiée. |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | Détermine si la valeur représentée par le premier objet [Decimal](./) est inférieure, égale ou supérieure à la valeur représentée par le second objet [Decimal](./). |
| [CompareTo](./compareto/)(const Decimal\&) const | Détermine si la valeur représentée par l'objet actuel est inférieure, égale ou supérieure à la valeur représentée par l'objet spécifié. |
| [Decimal](./decimal/)() | Construit une instance qui représente 0. |
| [Decimal](./decimal/)(std::int8_t) | Construit une instance qui représente la valeur spécifiée. |
| [Decimal](./decimal/)(std::int16_t) | Construit une instance qui représente la valeur spécifiée. |
| [Decimal](./decimal/)(std::int32_t) | Construit une instance qui représente la valeur spécifiée. |
| [Decimal](./decimal/)(std::int64_t) | Construit une instance qui représente la valeur spécifiée. |
| [Decimal](./decimal/)(std::uint8_t) | Construit une instance qui représente la valeur spécifiée. |
| [Decimal](./decimal/)(std::uint16_t) | Construit une instance qui représente la valeur spécifiée. |
| [Decimal](./decimal/)(std::uint32_t) | Construit une instance qui représente la valeur spécifiée. |
| [Decimal](./decimal/)(std::uint64_t) | Construit une instance qui représente la valeur spécifiée. |
| [Decimal](./decimal/)(float) | Construit une instance qui représente la valeur spécifiée. |
| [Decimal](./decimal/)(double) | Construit une instance qui représente la valeur spécifiée. |
| explicit [Decimal](./decimal/)(const std::string\&) | Construit une instance qui représente une valeur dont la représentation sous forme de chaîne est spécifiée comme une instance de la classe std::string. |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | Construit un objet [Decimal](./) à partir des composants spécifiés. |
| [Decimal](./decimal/)(const Decimal\&) | Construit une instance de la classe [Decimal](./) qui représente le même nombre que l'objet [Decimal](./) spécifié. |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | Construit une instance de la classe [Decimal](./) à partir d'un tableau d'entiers contenant une représentation binaire. |
| [Decimal](./decimal/)(std::nullptr_t) | Lance toujours ArgumentNullException. |
| [Decimal](./decimal/)(const number_type\&) | Construit une instance de la classe [Decimal](./) représentant la valeur spécifiée. |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | Divise deux valeurs [Decimal](./) spécifiées. |
| [Equals](./equals/)(const Decimal\&) const | Détermine si les valeurs représentées par l'objet actuel et l'objet spécifié sont égales. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Détermine si les valeurs représentées par l'objet actuel et l'objet spécifié sont égales. |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | Détermine si les valeurs représentées par les objets spécifiés sont égales. |
| static [Floor](./floor/)(const Decimal\&) | Renvoie la plus grande valeur entière inférieure ou égale à la valeur spécifiée. |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) la valeur monétaire OLE spécifiée en la valeur [Decimal](./) équivalente. NOT IMPLEMENTED. |
| static [GetBits](./getbits/)(const Decimal\&) | Convertit l'objet [Decimal](./) spécifié en la représentation binaire de la valeur qu'il représente. |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) la valeur [Decimal](./) spécifiée en un tableau d'octets. |
| [GetHashCode](./gethashcode/)() const | Renvoie un code de hachage pour l'objet actuel. |
| [GetTypeCode](./gettypecode/)() const | Obtient le code de type de l'objet. |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | Multiplie deux valeurs [Decimal](./) spécifiées. |
| static [Negate](./negate/)(const Decimal\&) | Renvoie une nouvelle instance de la classe [Decimal](./) qui représente une valeur résultant de la négation de la valeur représentée par l'objet spécifié. |
| explicit [operator bool](./operatorbool/)() const | Convertit la valeur représentée par l'objet actuel en une valeur booléenne. |
| explicit [operator double](./operatordouble/)() const | Convertit la valeur représentée par l'objet actuel en une valeur à virgule flottante double précision. |
| explicit [operator float](./operatorfloat/)() const | Convertit la valeur représentée par l'objet actuel en une valeur à virgule flottante simple précision. |
| [operator!=](./operator!=/)(const Decimal\&) const | Détermine si les valeurs représentées par l'objet actuel et l'objet spécifié ne sont pas égales. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Détermine si la valeur représentée par l'objet actuel est différente de 0. |
| [operator%](./operator%/)(const Decimal\&) const | Renvoie une nouvelle instance de la classe [Decimal](./) qui représente une valeur résultant d'une opération modulo avec les valeurs représentées par l'objet actuel et l'objet spécifié. |
| [operator%=](./operator%=/)(const Decimal\&) | Attribue à l'objet actuel une nouvelle valeur résultant d'une opération modulo avec les valeurs représentées par l'objet actuel et l'objet spécifié. |
| [operator*](./operator_/)(const Decimal\&) const | Renvoie une nouvelle instance de la classe [Decimal](./) qui représente une valeur résultant de la multiplication des valeurs représentées par l'objet actuel et l'objet spécifié. |
| [operator*=](./operator_=/)(const Decimal\&) | Attribue à l'objet actuel une nouvelle valeur résultant de la multiplication des valeurs représentées par l'objet actuel et l'objet spécifié. |
| [operator+](./operator+/)(const Decimal\&) const | Renvoie une nouvelle instance de la classe [Decimal](./) qui représente une valeur qui est la somme des valeurs représentées par l'objet actuel et l'objet spécifié. |
| [operator++](./operator++/)() | Incrémente la valeur représentée par l'objet actuel. |
| [operator+=](./operator+=/)(const Decimal\&) | Attribue à l'objet actuel une nouvelle valeur qui est la somme des valeurs représentées par l'objet actuel et l'objet spécifié. |
| [operator-](./operator-/)(const Decimal\&) const | Renvoie une nouvelle instance de la classe [Decimal](./) qui représente une valeur résultant de la soustraction de la valeur représentée par l'objet spécifié de la valeur représentée par l'objet actuel. |
| [operator-](./operator-/)() const | Renvoie une nouvelle instance de la classe [Decimal](./) qui représente une valeur résultant de la négation de la valeur représentée par l'objet actuel. |
| [operator--](./operator--/)() | Décrémente la valeur représentée par l'objet actuel. |
| [operator-=](./operator-=/)(const Decimal\&) | Attribue à l'objet actuel une nouvelle valeur résultant de la soustraction de la valeur représentée par l'objet spécifié de la valeur représentée par l'objet actuel. |
| [operator/](./operator//)(const Decimal\&) const | Renvoie une nouvelle instance de la classe [Decimal](./) qui représente une valeur résultant de la division de la valeur représentée par l'objet actuel par la valeur représentée par l'objet spécifié. |
| [operator/=](./operator/=/)(const Decimal\&) | Attribue à l'objet actuel une nouvelle valeur résultant de la division de la valeur représentée par l'objet actuel par la valeur représentée par l'objet spécifié. |
| [operator<](./operator_/)(const Decimal\&) const | Détermine si la valeur représentée par l'objet actuel est inférieure à la valeur représentée par l'objet spécifié. |
| [operator<=](./operator_=/)(const Decimal\&) const | Détermine si la valeur représentée par l'objet actuel est inférieure ou égale à la valeur représentée par l'objet spécifié. |
| [operator=](./operator=/)(const Decimal\&) | Attribue la valeur représentée par l'objet spécifié à l'objet actuel. |
| [operator==](./operator==/)(const Decimal\&) const | Détermine si les valeurs représentées par l'objet actuel et l'objet spécifié sont égales. |
| [operator==](./operator==/)(std::nullptr_t) const | Détermine si la valeur représentée par l'objet actuel est 0. |
| [operator>](./operator_/)(const Decimal\&) const | Détermine si la valeur représentée par l'objet actuel est supérieure à la valeur représentée par l'objet spécifié. |
| [operator>=](./operator_=/)(const Decimal\&) const | Détermine si la valeur représentée par l'objet actuel est supérieure ou égale à la valeur représentée par l'objet spécifié. |
| static [Parse](./parse/)(const String\&) | Convertit la représentation sous forme de chaîne d'un nombre décimal en une instance équivalente de la classe [Decimal](./). |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | Convertit la représentation sous forme de chaîne d'un nombre décimal en une instance équivalente de la classe [Decimal](./) en utilisant le style spécifié. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Convertit la représentation sous forme de chaîne d'un nombre décimal en une instance équivalente de la classe [Decimal](./) en utilisant le fournisseur de format spécifié. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Convertit la représentation sous forme de chaîne d'un nombre décimal en une instance équivalente de la classe [Decimal](./) en utilisant le style et le fournisseur de format spécifiés. |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | Calcule le reste après la division de deux valeurs [Decimal](./). |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | Arrondit la valeur spécifiée au nombre entier le plus proche. Un paramètre indique le comportement de la fonction si la valeur spécifiée est également proche de deux nombres les plus proches. |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | Arrondit la valeur spécifiée à la valeur la plus proche avec le nombre spécifié de chiffres fractionnels. Un paramètre indique le comportement de la fonction si la valeur spécifiée est également proche de deux valeurs les plus proches. |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | Soustrait une valeur [Decimal](./) spécifiée d'une autre. |
| static [ToByte](./tobyte/)(Decimal) | Convertit la valeur [Decimal](./) en entier non signé de 8 bits. |
| static [ToDouble](./todouble/)(Decimal) | Convertit la valeur [Decimal](./) en nombre à virgule flottante double précision. |
| static [ToInt16](./toint16/)(Decimal) | Convertit la valeur [Decimal](./) en entier signé de 16 bits. |
| static [ToInt32](./toint32/)(Decimal) | Convertit la valeur [Decimal](./) en entier signé de 32 bits. |
| static [ToInt64](./toint64/)(Decimal) | Convertit la valeur [Decimal](./) en entier signé de 64 bits. |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) la valeur [Decimal](./) spécifiée en la valeur monétaire OLE équivalente. NON IMPLEMENTÉ. |
| static [ToSByte](./tosbyte/)(Decimal) | Convertit la valeur [Decimal](./) en entier signé de 8 bits. |
| static [ToSingle](./tosingle/)(Decimal) | Convertit la valeur [Decimal](./) en nombre à virgule flottante simple précision. |
| [ToStdString](./tostdstring/)() const | Renvoie une instance de std::string qui contient la représentation sous forme de chaîne de la valeur représentée par l'objet. |
| [ToString](./tostring/)() const | Renvoie la représentation sous forme de chaîne de la valeur représentée par l'objet. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Convertit l'objet actuel en chaîne en utilisant les informations de format spécifiques à la culture. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Convertit l'objet actuel en sa représentation sous forme de chaîne en utilisant le format de chaîne spécifié et les informations de format spécifiques à la culture fournies par l'objet [IFormatProvider](../iformatprovider/) spécifié. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | Renvoie la représentation sous forme de chaîne de la valeur représentée par l'objet. Pour usage interne. |
| static [ToUInt16](./touint16/)(Decimal) | Convertit la valeur [Decimal](./) en entier non signé de 16 bits. |
| static [ToUInt32](./touint32/)(Decimal) | Convertit la valeur [Decimal](./) en entier non signé de 32 bits. |
| static [ToUInt64](./touint64/)(Decimal) | Convertit la valeur [Decimal](./) en entier non signé de 64 bits. |
| static [Truncate](./truncate/)(const Decimal\&) | Renvoie l'objet [Decimal](./) représentant une valeur dont la partie entière est égale à celle de la valeur représentée par l'objet [Decimal](./) spécifié, tous les chiffres fractionnaires étant supprimés. |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | Convertit la chaîne spécifiée contenant la représentation sous forme de chaîne d'un nombre en la valeur [Decimal](./) équivalente. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | Convertit la chaîne spécifiée contenant la représentation sous forme de chaîne d'un nombre en la valeur [Decimal](./) équivalente en utilisant les informations de formatage et le style de nombre fournis. |
| static [Type](./type/)() | Renvoie une référence à l'objet [TypeInfo](../typeinfo/) représentant les informations de type de la classe [Decimal](./). |
| [~Decimal](./~decimal/)() | Destructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static [MaxValue](./maxvalue/) | Représente le plus grand nombre qui peut être représenté par la classe [Decimal](./). |
| static [MinusOne](./minusone/) | Représente le nombre -1. |
| static [MinValue](./minvalue/) | Représente le plus petit nombre qui peut être représenté par la classe [Decimal](./). |
| static [One](./one/) | Représente le nombre 1. |
| static [Zero](./zero/) | Représente le nombre 0. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [number_type](./number_type/) | Un alias pour Detail::decimal_number_type. |
## Remarques



```cpp
#include "system/console.h"
#include "system/decimal.h"

int main()
{
  using namespace System;

  Console::WriteLine(Decimal::MinValue);
  Console::WriteLine(Decimal::MaxValue);

  auto dividend = Decimal::One;
  auto divisor = 6;
  Console::WriteLine(dividend/divisor);

  return 0;
}
/*
This code example produces the following output:
-79228162514264337593543950335
79228162514264337593543950335
0,1666666666666666666666666667
*/
```

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
