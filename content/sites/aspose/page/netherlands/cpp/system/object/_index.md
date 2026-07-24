---
title: "System::Object klasse"
linktitle: "Object"
second_title: "Aspose.Page voor C++"
description: "System::Object klasse. Basisklasse die het gebruik van methoden mogelijk maakt die beschikbaar zijn voor de System.Object klasse in C#. Alle niet-triviale klassen die in de vertaalde omgeving worden gebruikt, moeten hiervan erven in C++."
type: docs
weight: 4800
url: /nl/cpp/system/object/
---
## Object class


Basisklasse die het gebruik van methoden mogelijk maakt die beschikbaar zijn voor de [System.Object](./) klasse in C#. Alle niet-triviale klassen die in de vertaalde omgeving worden gebruikt, moeten hiervan erven.

```cpp
class Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | Vergelijkt objecten met behulp van C# [Object.Equals](./equals/) semantiek. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Vergelijkt referentietype-objecten in C#-stijl. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Vergelijkt waardetype-objecten in C#-stijl. |
| static [Equals](./equals/)(float const\&, float const\&) | Emuleert C#-stijl zwevendekommagetallen vergelijking waarbij twee NaN's als gelijk worden beschouwd, hoewel volgens IEC 60559:1989 NaN niet gelijk is aan enige waarde, inclusief NaN. |
| static [Equals](./equals/)(double const\&, double const\&) | Emuleert C#-stijl zwevendekommagetallen vergelijking waarbij twee NaN's als gelijk worden beschouwd, hoewel volgens IEC 60559:1989 NaN niet gelijk is aan enige waarde, inclusief NaN. |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | Alleen voor intern gebruik. |
| [GetCounter](./getcounter/)() | Haalt de referentieteller-gegevensstructuur op die bij het object hoort. |
| virtual [GetHashCode](./gethashcode/)() const | Analoge van C# [Object.GetHashCode()](./gethashcode/) methode. Maakt het hashen van aangepaste objecten mogelijk. |
| virtual [GetType](./gettype/)() const | Haalt het werkelijke type van het object op. Analoge van C# [System.Object.GetType()](./gettype/) oproep. |
| virtual [Is](./is/)(const TypeInfo\&) const | Controleer of het object een instantie van het type vertegenwoordigt dat wordt beschreven door targetType. Analoge van C# 'is' operator. |
| [Lock](./lock/)() | Implementeert het lock()-statement van C# voor vergrendeling. Roep direct aan of gebruik het [LockContext](../lockcontext/) bewakingsobject. |
| virtual [MemberwiseClone](./memberwiseclone/)() const | Analoge van C# [Object.MemberwiseClone()](./memberwiseclone/) methode. Maakt het klonen van aangepaste types mogelijk. |
| [Object](./object/)() | Maakt een object aan. Initialiseert alle interne datastructuren. |
| [Object](./object/)(Object const\&) | Copy‑constructor. Kopieert eigenlijk niets, initialiseert alleen een nieuw object en maakt het mogelijk om subklassen te kopiëren. |
| [operator=](./operator=/)(Object const\&) | Toewijzingsoperator. Kopieert eigenlijk niets, initialiseert alleen een nieuw object en maakt het mogelijk om subklassen te kopiëren. |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | Vergelijkt objecten op referentie. |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | Vergelijkt objecten op referentie. |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | Vergelijkt een value‑type object met nullptr op referentie. |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | Specialisatie van [Object::ReferenceEquals](./referenceequals/) voor het geval van een string en nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | Specialisatie van [Object::ReferenceEquals](./referenceequals/) voor het geval van strings. |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | Verlaagt de gedeelde referentieteller met de opgegeven waarde. |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | Stel het n'th sjabloonargument in op een zwakke pointer (in plaats van gedeeld). Hiermee kun je pointers in containers overschakelen naar zwakke modus. |
| [SharedCount](./sharedcount/)() const | Haalt de huidige waarde van de gedeelde referentieteller op. |
| [SharedRefAdded](./sharedrefadded/)() | Verhoogt de gedeelde referentieteller. Mag niet direct worden aangeroepen; gebruik in plaats daarvan slimme pointers of ThisProtector. |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | Verlaagt en retourneert de gedeelde referentieteller. Mag niet direct worden aangeroepen; gebruik in plaats daarvan slimme pointers of ThisProtector. |
| virtual [ToString](./tostring/)() const | Analoge van C# [Object.ToString()](./tostring/) methode. Maakt het converteren van aangepaste objecten naar een string mogelijk. |
| static [Type](./type/)() | Implementeert de C# typeof([System.Object](./)) constructie. |
| [Unlock](./unlock/)() | Implementeert het lock()-statement van C# voor ontgrendeling. Roep direct aan of gebruik het [LockContext](../lockcontext/) bewakingsobject. |
| [WeakRefAdded](./weakrefadded/)() | Verhoogt de zwakke referentieteller. Mag niet direct worden aangeroepen; gebruik in plaats daarvan slimme pointers of ThisProtector. |
| [WeakRefRemoved](./weakrefremoved/)() | Verlaagt de zwakke referentieteller. Mag niet direct worden aangeroepen; gebruik in plaats daarvan slimme pointers of ThisProtector. |
| virtual [~Object](./~object/)() | Vernietigt het object. Vrijt alle interne datastructuren. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ptr](./ptr/) | Alias voor het slimme pointertype. |
## Opmerkingen


Naast de methoden die beschikbaar zijn in de C# [System.Object](./) klasse, biedt het ook ondersteuning voor enkele concepten die specifiek zijn voor de vertaalde code‑omgeving. Dit omvat referentietelling die wordt gebruikt door slimme pointerklassen ([System::SmartPtr](../smartptr/), [System::WeakPtr](../weakptr/), [System::DynamicWeakPtr](../dynamicweakptr/)) en andere diensten gerelateerd aan geheugenbeheer, debugging, enz.

Elk [Object](./) heeft twee referentietellers: een gedeelde referentieteller en een zwakke referentieteller. De zwakke referentieteller wordt altijd opgeslagen in een losgekoppelde datastructuur in plaats van in het [Object](./) zelf, waardoor zwakke pointers langer dan het verwijzende object kunnen bestaan. De slimme referentieteller wordt opgeslagen ofwel in het object zelf of in dezelfde losgekoppelde structuur, afhankelijk van de status van de macro ENABLE_EXTERNAL_REFCOUNT. Standaard is deze ingeschakeld in debug‑builds en uitgeschakeld in release‑builds. Als de slimme pointer‑teller in het object zelf wordt opgeslagen, wordt de losgekoppelde datastructuur alleen aangemaakt als er zwakke pointers naar het object bestaan. Anders wordt deze naast het object zelf aangemaakt.

Alle slimme pointers gebruiken deze twee referentietellers en dragen bij aan dezelfde, enige eigendomsgroep.

Als een [Object](./) subklasse op de stack wordt aangemaakt, mogen er geen smart pointers naar worden gemaakt, anders ontstaat er een stack-deletieprobleem.

Dit type kan worden toegewezen, zowel op de stack als waarde-type, als op de heap met behulp van de functie [System::MakeObject()](../makeobject/). Zodra het object is toegewezen, meng deze twee gebruikssituaties nooit: het hebben van [SmartPtr](../smartptr/) pointers naar stack-toegewezen objecten is strikt verboden.
## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
