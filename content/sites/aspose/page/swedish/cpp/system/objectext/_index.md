---
title: "System::ObjectExt-klass"
linktitle: "ObjectExt"
second_title: "Aspose.Page för C++"
description: "System::ObjectExt-klass. Tillhandahåller statiska metoder som efterliknar C# Object-metoder som anropas för icke-Object C++-typer (strängar, tal osv.). Detta är en statisk typ utan instansfunktioner. Du bör aldrig skapa instanser av den på något sätt i C++."
type: docs
weight: 4900
url: /sv/cpp/system/objectext/
---
## ObjectExt class


Tillhandahåller statiska metoder som efterliknar C# [Object](../object/)-metoder som anropas för icke-Object C++-typer (strängar, tal osv.). Detta är en statisk typ utan instansfunktioner. Du bör aldrig skapa instanser av den på något sätt.

```cpp
class ObjectExt : public System::ObjectType
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | Konverterar grundläggande arrayvärden (vilket C# gör implicit men C++ uppenbarligen inte gör). |
| static [Box](./box/)(const T\&) | Packar värdetyper för konvertering till [Object](../object/). Implementation för enum-typer. |
| static [Box](./box/)(const T\&) | Packar värdetyper för konvertering till [Object](../object/). Implementation för icke-enum-typer. |
| static [Box](./box/)(const T\&) | Packar [Nullable](../nullable/)-typer för konvertering till [Object](../object/). |
| static [Box](./box/)(const String\&) | Packar strängvärden. |
| static [BoxEnum](./boxenum/)(T) | Packar enum-typer för att spridas som [Object](../object/). |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | Implementation av översättning av '??'-operatorn för icke-nullbara typer. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | Implementation av översättning av '??'-operatorn för nullable-typer. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | Implementation av översättning av '??'-operatorn för icke-nullbara typer. Överlagring för fallet då RT2 kan konverteras till RT1. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | Ersättning för C# [Object.Equals](../object/equals/)-anrop som fungerar för alla typer i C++. Överlagring för smartpekartyper. |
| static [Equals](./equals/)(T, const T2\&) | Ersättning för C# [Object.Equals](../object/equals/)-anrop som fungerar för alla typer i C++. Överlagring för strukturella typer. |
| static [Equals](./equals/)(const T\&, const T2\&) | Ersättning för C# [Object.Equals](../object/equals/)-anrop som fungerar för alla typer i C++. Överlagring för skalära typer. |
| static [Equals](./equals/)(const char_t(&), String) | Ersättning för C# [Object.Equals](../object/equals/)-anrop som fungerar för alla typer i C++. Överlagring för strängliteral med strängjämförelse. |
| static [Equals](./equals/)(const float\&, const float\&) | Emulerar C#-stil flyttalsjämförelse där två NaN-värden betraktas som lika även om NaN enligt IEC 60559:1989 inte är lika med något värde, inklusive NaN. |
| static [Equals](./equals/)(const double\&, const double\&) | Emulerar C#-stil flyttalsjämförelse där två NaN-värden betraktas som lika även om NaN enligt IEC 60559:1989 inte är lika med något värde, inklusive NaN. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | Implementerar [GetHashCode()](./gethashcode/)-anrop; fungerar på både [Object](../object/)-underklasser och orelaterade typer. |
| static [Is](./is/)(const T\&) | Implementerar 'is'-operatorns översättning. Specialisering för boxbara (värde)typer som exakt är vad de är. |
| static [Is](./is/)(const U\&) | Implementerar 'is'-operatorns översättning. Specialisering för pekartyper optimerade för 'final'-klasser. |
| static [Is](./is/)(const U\&) | Implementerar 'is'-operatorns översättning. Specialisering för pekartyper. |
| static [Is](./is/)(const Object\&) | Implementerar 'is'-operatorns översättning. Specialisering för värdetyper. |
| static [Is](./is/)(const Object\&) | Implementerar 'is'-operatorns översättning. Specialisering för icke‑konverterbara typer. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Implementerar 'is'-operatorns översättning. Specialisering för pekartyper. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | Implementerar 'is'-operatorns översättning. Specialisering för undantags‑omslagstyper. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementerar 'is'-operatorns översättning. Specialisering för nullable‑typer. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementerar 'is'-operatorns översättning. Specialisering för boxbara typer med definierad ==‑operator. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementerar 'is'-operatorns översättning. Specialisering för boxbara typer utan definierad ==. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | Implementerar 'is'-operatorns översättning. Specialisering för värdetyper som är boxade till gränssnitt. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Implementerar 'is'-operatorns översättning. Specialisering för enum‑typer. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | Implementerar 'is'-operatorns översättning. Specialisering för enum‑typer vs svaga pekare. |
| static [Is](./is/)(const Nullable\<U\>\&) | Implementerar 'is'-operatorns översättning. Specialisering för [Nullable](../nullable/) typ. |
| static [Is](./is/)(const char16_t *) | Implementerar 'is'-operatorns översättning. Specialisering för sträng‑literal. |
| static [Is](./is/)(int32_t) | Implementerar 'is'-operatorns översättning. Specialisering för heltals‑literal. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | Kontrollerar om objektet är ett boxat värde. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Konverterar [Object](../object/) till okänd typ, hanterar både smart pekare‑typ och bpxed‑värdesituationer. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Konverterar [Object](../object/) till okänd typ, hanterar både smart pekare‑typ och boxad‑värdesituationer. |
| static [ToString](./tostring/)(const char_t *) | Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer. |
| static [ToString](./tostring/)(const T\&) | Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer. |
| static [ToString](./tostring/)(const T\&) | Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer. |
| static [ToString](./tostring/)(T\&) | Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer. |
| static [ToString](./tostring/)(T\&) | Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer. |
| static [ToString](./tostring/)(T\&&) | Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer. |
| static [ToString](./tostring/)(T\&) | Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer. |
| static [ToString](./tostring/)(const T\&) | Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer. |
| static [ToString](./tostring/)(T\&&) | Ersättning för C# ToString‑metoden för att fungera på alla C++‑typer. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Avboxar värdetyper efter konvertering till [Object](../object/). Implementation för enum‑typer. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Avboxar värdetyper efter konvertering till [Object](../object/). Implementation för icke‑enum‑ och icke‑nullable‑typer. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Avboxar värdetyper efter konvertering till [Object](../object/). Implementation för icke‑enum‑ och icke‑nullable‑typer. |
| static [Unbox](./unbox/)(E) | Avboxar enum‑typer till heltal. |
| static [Unbox](./unbox/)(E) | Konverterar enum‑typer. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Avboxar strängvärden. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | Avboxar sträng från boxat värde. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | Avboxar objekt till nullable‑typ. |
| static [UnknownIsNull](./unknownisnull/)(T) | Kontrollerar om okänd typ‑objekt är nullptr. Överlagring för icke‑skalära typer. |
| static [UnknownIsNull](./unknownisnull/)(T) | Kontrollerar om okänd typ‑objekt är nullptr. Överlagring för skalära typer. |
| static [UnknownToObject](./unknowntoobject/)(T) | Konverterar okänd typ till [Object](../object/), hanterar både smart pekare‑typ och värde‑typ situationer. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | Konverterar okänd typ till [Object](../object/), hanterar både smart pekare‑typ och värde‑typ situationer. |
## Se även

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
