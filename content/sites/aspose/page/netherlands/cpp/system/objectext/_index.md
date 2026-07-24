---
title: "System::ObjectExt klasse"
linktitle: "ObjectExt"
second_title: "Aspose.Page voor C++"
description: "System::ObjectExt klasse. Biedt statische methoden die C# Object-methoden nabootsen die worden aangeroepen voor niet-Object C++-typen (strings, getallen, enz.). Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken in C++."
type: docs
weight: 4900
url: /nl/cpp/system/objectext/
---
## ObjectExt class


Biedt statische methoden die C# [Object](../object/)-methoden nabootsen die worden aangeroepen voor niet-Object C++-typen (strings, getallen, enz.). Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken.

```cpp
class ObjectExt : public System::ObjectType
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | Converteert fundamentele array‑waarden (wat C# impliciet doet, maar C++ blijkbaar niet). |
| static [Box](./box/)(const T\&) | Verpakt waardetypen voor conversie naar [Object](../object/). Implementatie voor enum‑typen. |
| static [Box](./box/)(const T\&) | Verpakt waardetypen voor conversie naar [Object](../object/). Implementatie voor niet‑enum‑typen. |
| static [Box](./box/)(const T\&) | Verpakt [Nullable](../nullable/)-typen voor conversie naar [Object](../object/). |
| static [Box](./box/)(const String\&) | Verpakt string‑waarden. |
| static [BoxEnum](./boxenum/)(T) | Verpakt enum‑typen zodat ze worden doorgegeven als [Object](../object/). |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | Implementatie van '??'-operatorvertaling voor niet‑nullable typen. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | Implementatie van '??'-operatorvertaling voor nullable typen. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | Implementatie van '??'-operatorvertaling voor niet‑nullable typen. Overload voor het geval dat RT2 converteerbaar is naar RT1. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | Vervanging voor C# [Object.Equals](../object/equals/)-aanroepen die werken voor elk type in C++. Overload voor smart‑pointer‑typen. |
| static [Equals](./equals/)(T, const T2\&) | Vervanging voor C# [Object.Equals](../object/equals/) oproepen die werken voor elk type in C++. Overbelasting voor structuurtypen. |
| static [Equals](./equals/)(const T\&, const T2\&) | Vervanging voor C# [Object.Equals](../object/equals/) oproepen die werken voor elk type in C++. Overbelasting voor scalair typen. |
| static [Equals](./equals/)(const char_t(&), String) | Vervanging voor C# [Object.Equals](../object/equals/) oproepen die werken voor elk type in C++. Overbelasting voor tekenreeksletterlijke met tekenreeksvergelijking. |
| static [Equals](./equals/)(const float\&, const float\&) | Emuleert C#-stijl zwevendekommagetallen vergelijking waarbij twee NaN's als gelijk worden beschouwd, hoewel volgens IEC 60559:1989 NaN niet gelijk is aan enige waarde, inclusief NaN. |
| static [Equals](./equals/)(const double\&, const double\&) | Emuleert C#-stijl zwevendekommagetallen vergelijking waarbij twee NaN's als gelijk worden beschouwd, hoewel volgens IEC 60559:1989 NaN niet gelijk is aan enige waarde, inclusief NaN. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | Implementeert [GetHashCode()](./gethashcode/) oproepen; werkt zowel op [Object](../object/) subklassen als op niet-gerelateerde typen. |
| static [Is](./is/)(const T\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor verpakbare (waarde)typen, wat precies betekent dat ze dat zijn. |
| static [Is](./is/)(const U\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor pointertypen geoptimaliseerd voor 'final' klassen. |
| static [Is](./is/)(const U\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor pointertypen. |
| static [Is](./is/)(const Object\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor waardetypen. |
| static [Is](./is/)(const Object\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor niet-converteerbare typen. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor pointertypen. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor exceptie-wrappertypen. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor nullable typen. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor verpakbare typen met de == operator gedefinieerd. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor verpakbare typen zonder gedefinieerde ==. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor waardetypen verpakt naar interfaces. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor enumtypen. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor enumtypen versus zwakke pointers. |
| static [Is](./is/)(const Nullable\<U\>\&) | Implementeert vertaling van de 'is' operator. Specialisatie voor [Nullable](../nullable/) type. |
| static [Is](./is/)(const char16_t *) | Implementeert vertaling van de 'is' operator. Specialisatie voor tekenreeksletterlijke. |
| static [Is](./is/)(int32_t) | Implementeert vertaling van de 'is' operator. Specialisatie voor gehele getal literal. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | Controleert of het object een verpakte waarde is. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Converteert [Object](../object/) naar een onbekend type, en behandelt zowel smart pointer-typen als verpakte waardesituaties. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Converteert [Object](../object/) naar een onbekend type, en behandelt zowel smart pointer-typen als verpakte waardesituaties. |
| static [ToString](./tostring/)(const char_t *) | Vervanging voor de C# ToString-methode om te werken op elk C++ type. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | Vervanging voor de C# ToString-methode om te werken op elk C++ type. |
| static [ToString](./tostring/)(const T\&) | Vervanging voor de C# ToString-methode om te werken op elk C++ type. |
| static [ToString](./tostring/)(const T\&) | Vervanging voor de C# ToString-methode om te werken op elk C++ type. |
| static [ToString](./tostring/)(T\&) | Vervanging voor de C# ToString-methode om te werken op elk C++ type. |
| static [ToString](./tostring/)(T\&) | Vervanging voor de C# ToString-methode om te werken op elk C++ type. |
| static [ToString](./tostring/)(T\&&) | Vervanging voor de C# ToString-methode om te werken op elk C++ type. |
| static [ToString](./tostring/)(T\&) | Vervanging voor de C# ToString-methode om te werken op elk C++ type. |
| static [ToString](./tostring/)(const T\&) | Vervanging voor de C# ToString-methode om te werken op elk C++ type. |
| static [ToString](./tostring/)(T\&&) | Vervanging voor de C# ToString-methode om te werken op elk C++ type. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Deboxt waardetypen na conversie naar [Object](../object/). Implementatie voor enumtypen. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Deboxt waardetypen na conversie naar [Object](../object/). Implementatie voor niet-enum- en niet-nullable typen. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Deboxt waardetypen na conversie naar [Object](../object/). Implementatie voor niet-enum- en niet-nullable typen. |
| static [Unbox](./unbox/)(E) | Ontdoet enum-typen naar integer. |
| static [Unbox](./unbox/)(E) | Converteert enum-typen. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Ontdoet string-waarden. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | Ontdoet string van een verpakte waarde. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | Ontdoet object naar nullable type. |
| static [UnknownIsNull](./unknownisnull/)(T) | Controleert of een object van onbekend type nullptr is. Overload voor niet-schaalbare typen. |
| static [UnknownIsNull](./unknownisnull/)(T) | Controleert of een object van onbekend type nullptr is. Overload voor schaalbare typen. |
| static [UnknownToObject](./unknowntoobject/)(T) | Converteert onbekend type naar [Object](../object/), waarbij zowel smart pointer-typen als waardetypen worden afgehandeld. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | Converteert onbekend type naar [Object](../object/), waarbij zowel smart pointer-typen als waardetypen worden afgehandeld. |
## Zie ook

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
