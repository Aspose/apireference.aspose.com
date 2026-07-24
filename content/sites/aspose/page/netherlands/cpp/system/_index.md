---
title: "System-namespace"
linktitle: "System"
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de System-namespace in C++."
type: docs
weight: 2100
url: /nl/cpp/system/
---



## Klassen

| Klasse | Beschrijving |
| --- | --- |
| [Activator](./activator/) | Bevat methoden om typen objecten te maken. |
| [Array](./array/) | Klasse die een array‑gegevensstructuur voorstelt. Objecten van deze klasse mogen alleen worden gealloceerd met behulp van [System::MakeArray()](./makearray/) en [System::MakeObject()](./makeobject/) functies. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik deze pointer om deze aan functies als argument door te geven. |
| [ArraySegment](./arraysegment/) | Stelt een segment van de één‑dimensionale array voor. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/) klasse om objecten van dit type te beheren. |
| [Attribute](./attribute/) | Een basisklasse voor aangepaste attributen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](./makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik deze pointer om deze aan functies als argument door te geven. |
| [BitConverter](./bitconverter/) | Bevat methoden die conversies uitvoeren van een reeks bytes naar een waardetype en omgekeerd. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken. |
| [Boolean](./boolean/) | Klasse die statische leden van het [System.Boolean](./boolean/) .[Net](../system.net/) type bevat. |
| [BoxedEnum](./boxedenum/) | Stelt een verpakte enumeratiewaarde voor. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](./makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik deze pointer om deze aan functies als argument door te geven. |
| [BoxedValue](./boxedvalue/) | Stelt een verpakte waarde voor. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](./makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik deze pointer om deze aan functies als argument door te geven. |
| [BoxedValueBase](./boxedvaluebase/) | Een basisklasse die een interface definieert en enkele fundamentele methoden implementeert van een afgeleide klasse die een verpakte waarde voorstelt. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](./makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik deze pointer om deze aan functies als argument door te geven. |
| [Buffer](./buffer/) | Bevat methoden die ruwe byte‑arrays manipuleren. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken. |
| [Byte](./byte/) | Bevat methoden om met de unsigned 8‑bit integer te werken. |
| [Char](./char/) | Biedt methoden voor manipulatie van tekens die worden weergegeven als UTF‑16 code‑eenheden. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken. |
| [Comparison](./comparison/) | Stelt een pointer naar de methode voor die twee objecten van hetzelfde type vergelijkt. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/) klasse om objecten van dit type te beheren. |
| [Console](./console/) | Biedt methoden om gegevens naar de standaard uitvoerstroom te schrijven. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken. |
| [ConsoleOutput](./consoleoutput/) | Stelt de standaard uitvoerstroom voor. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](./makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik deze pointer om deze aan functies als argument door te geven. |
| [DateTime](./datetime/) | Stelt een specifieke datum‑ en tijdwaarde op de tijdcontinuüm voor. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/) klasse om objecten van dit type te beheren. |
| [DateTimeOffset](./datetimeoffset/) | Bevat de datum en tijd van de dag ten opzichte van Coordinated Universal Time. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](./makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik deze pointer om deze aan functies als argument door te geven. |
| [DBNull](./dbnull/) | Stelt een niet‑bestaande waarde voor. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](./makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik deze pointer om deze aan functies als argument door te geven. |
| [Decimal](./decimal/) | Stelt een decimaal getal voor. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/) klasse om objecten van dit type te beheren. |
| [DefaultBoxedValue](./defaultboxedvalue/) | [BoxedValue](./boxedvalue/) klasse‑implementatie. Maakt het mogelijk om BoxingValue‑specialisaties te declareren zonder gemeenschappelijke code te dupliceren. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](./makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik deze pointer om deze aan functies als argument door te geven. |
| [Delegate< ReturnType(ArgumentTypes...)>](./delegate_returntype(argumenttypes...)_/) | Stelt een pointer naar een functie, methode of een functie‑object voor. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/) klasse om objecten van dit type te beheren. |
| [DynamicWeakPtr](./dynamicweakptr/) | Smart‑pointer‑klasse die de pointer‑modi van sjabloon‑argumenten van het opgeslagen object bijhoudt en deze na elke toewijzing bijwerkt. Dit type is een pointer om de verwijdering van andere objecten te beheren. Het moet op de stack worden gealloceerd en aan functies worden doorgegeven, hetzij per waarde, hetzij per const‑referentie. |
| [EnumValues](./enumvalues/) | Biedt meta‑informatie over enumeratie‑constanten van enum‑type **E**. |
| [EnumValuesBase](./enumvaluesbase/) | Een basisklasse voor een klasse die meta‑informatie van een enumeratietype vertegenwoordigt. |
| [EventArgs](./eventargs/) | De basisklasse voor klassen die een context vertegenwoordigen die wordt doorgegeven aan de gebeurtenisabonnees wanneer een gebeurtenis wordt geactiveerd. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](./makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik deze pointer om deze aan functies als argument door te geven. |
| [ExceptionWrapper](./exceptionwrapper/) | Sjabloon dat een wrapper van uitzonderingen vertegenwoordigt die afgeleid zijn van de [Exception](./exception/) klasse. |
| [FlagsAttribute](./flagsattribute/) | Geeft aan dat een enumeratie kan worden behandeld als een bitveld; dat wil zeggen, een set van. |
| [Func](./func/) | Functie-delegate. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/) klasse om objecten van dit type te beheren. |
| [GC](./gc/) | Stelt een geëmuleerde Garbage Collection voor die meer als een stub functioneert en in feite niets doet. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken. |
| [Guid](./guid/) | Stelt een Globally Unique Identifier voor. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/) klasse om objecten van dit type te beheren. |
| [IAsyncResult](./iasyncresult/) | Stelt de status van een asynchrone bewerking voor. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik die pointer om het als argument aan functies door te geven. |
| [ICloneable](./icloneable/) | Definieert een methode die objectklonen mogelijk maakt – het maken van een kopie van een object. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik die pointer om het als argument aan functies door te geven. |
| [IComparable](./icomparable/) | Definieert een methode die twee objecten vergelijkt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik die pointer om het als argument aan functies door te geven. |
| [IConvertible](./iconvertible/) | Definieert methoden die de waarde van het implementerende referentie‑ of waardetype omzetten naar een Common Language Runtime‑type met een equivalente waarde. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik die pointer om het als argument aan functies door te geven. |
| [ICustomFormatter](./icustomformatter/) | Definieert een methode die aangepaste opmaak uitvoert van de tekenreeksrepresentatie van een waarde die wordt weergegeven door het opgegeven object. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik die pointer om het als argument aan functies door te geven. |
| [IDisposable](./idisposable/) | Definieert een methode die bronnen vrijgeeft die eigendom zijn van het huidige object. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik die pointer om het als argument aan functies door te geven. |
| [IEquatable](./iequatable/) | Definieert een methode die de gelijkheid van twee objecten bepaalt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik die pointer om het als argument aan functies door te geven. |
| [IFormatProvider](./iformatprovider/) | Definieert een methode die opmaakinformatie levert. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik die pointer om het als argument aan functies door te geven. |
| [IFormattable](./iformattable/) | Definieert een methode die de waarde van het huidige object formatteert met behulp van de opgegeven opmaak‑string en opmaak‑provider. |
| [Int16](./int16/) | Bevat methoden om met de 16‑bit integer te werken. |
| [Int32](./int32/) | Bevat methoden om met de 32‑bit integer te werken. |
| [Int64](./int64/) | Bevat methoden om met de 64‑bit integer te werken. |
| [LockContext](./lockcontext/) | Guard‑object dat de C# lock()‑statement implementeert. |
| [MarshalByRefObject](./marshalbyrefobject/) | Biedt toegang tot objecten over toepassingsdomeingrenzen heen in remoting‑ingeschakelde toepassingen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/) pointer en gebruik die pointer om het als argument aan functies door te geven. |
| [MulticastDelegate< ReturnType(ArgumentTypes...)>](./multicastdelegate_returntype(argumenttypes...)_/) | Stelt een collectie van delegates voor. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/) klasse om objecten van dit type te beheren. |
| [Nullable](./nullable/) | Voorwaartse declaratie. |
| [NullableUtils](./nullableutils/) | Stelt de C# [System.Nullable](./nullable/) (zonder type‑argumenten) statische klasse voor. Het is niet mogelijk de oorspronkelijke naam te gebruiken vanwege het onvermogen om klassesjablonen in C++ te overladen. Ondersteunt een waardetype dat null kan worden toegewezen. Deze klasse kan niet worden geërfd. |
| [Object](./object/) | Basisklasse die het gebruik van methoden mogelijk maakt die beschikbaar zijn voor de [System.Object](./object/) klasse in C#. Alle niet‑triviale klassen die in de vertaalde omgeving worden gebruikt, moeten hiervan erven. |
| [ObjectExt](./objectext/) | Biedt statische methoden die C# [Object](./object/) methoden emuleren die worden aangeroepen voor niet‑Object C++‑types (strings, getallen, enz.). Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken. |
| [ObjectType](./objecttype/) | Biedt statische methoden die objecttype‑getters implementeren. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken. |
| [OperatingSystem](./operatingsystem/) | Stelt een specifiek besturingssysteem voor en biedt er informatie over. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [Random](./random/) | Stelt een pseudo‑willekeurige getalgenerator voor. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [ReadOnlySpan](./readonlyspan/) | Voorwaarts te gebruiken binnen de klasse [Span](./span/). |
| [ScopedCulture](./scopedculture/) | Stelt een cultuur voor die binnen de scope wordt gebruikt. |
| [SmartPtr](./smartptr/) | Pointer‑klasse om typen die op de heap worden toegewezen te omhullen. Gebruik deze om geheugen te beheren voor klassen die [Object](./object/) erven. Dit pointertype volgt intrusieve pointersemantiek. De referentieteller wordt opgeslagen ofwel in het [Object](./object/) zelf of in een tellerstructuur die nauw gekoppeld is aan de [Object](./object/)-instantie. In elk geval vormen alle [SmartPtr](./smartptr/)-instanties een enkele eigendomsgroep, ongeacht hoe ze zijn gemaakt, wat verschilt van het gedrag van de std::shared_ptr‑klasse. Het omzetten van een ruwe pointer naar een [SmartPtr](./smartptr/) is veilig, mits er andere [SmartPtr](./smartptr/)-instanties zijn die gedeelde referenties naar hetzelfde object houden. Een [SmartPtr](./smartptr/)-klasse‑instantie kan zich in één van twee toestanden bevinden: gedeelde pointer en zwakke pointer. Om een object levend te houden, moet het aantal gedeelde referenties positief zijn. Zowel zwakke als gedeelde pointers kunnen worden gebruikt om het aangewezen object te benaderen (om methoden aan te roepen, velden te lezen of te schrijven, enz.), maar zwakke pointers nemen niet deel aan de referentietelling van gedeelde pointers. Het [Object](./object/) wordt verwijderd wanneer de laatste 'gedeelde' [SmartPtr](./smartptr/)-pointer naar het object wordt vernietigd. Zorg er dus voor dat dit niet gebeurt wanneer er geen andere gedeelde [SmartPtr](./smartptr/)-pointers naar het object bestaan, bijvoorbeeld tijdens constructie of destructie van het object. Gebruik System::Object::ThisProtector‑bewakingsobjecten (in C++‑code) of de CppCTORSelfReference‑ of CppSelfReference‑attribuut (in C#‑code die wordt vertaald) om dit probleem op te lossen. Zorg er bovendien voor dat lusreferenties worden verbroken door de [System::WeakPtr](./weakptr/)-pointerklasse of de [System::SmartPtrMode::Weak](./smartptrmode/)-pointermodus (in C++‑code) of het CppWeakPtr‑attribuut (in C#‑code die wordt vertaald) te gebruiken. Als twee of meer objecten elkaar refereren met 'gedeelde' pointers, worden ze nooit verwijderd. Als het pointertype (zwak of gedeeld) tijdens runtime moet worden gewijzigd, gebruik dan de methode [System::SmartPtr<T>::set_Mode()](./smartptr/set_mode/) of de klasse [System::DynamicWeakPtr](./dynamicweakptr/). De [SmartPtr](./smartptr/)-klasse bevat geen virtuele methoden. Je mag ervan alleen erven als je een eigen geheugenbeheersstrategie ontwikkelt. Dit type is een pointer om de verwijdering van andere objecten te beheren. Het moet op de stack worden toegewezen en aan functies worden doorgegeven, hetzij per waarde, hetzij per const‑referentie. |
| [SmartPtrInfo](./smartptrinfo/) | Service‑klasse om de inhoud van [SmartPtr](./smartptr/) te testen en te wijzigen zonder het uiteindelijke type te kennen. Wordt gebruikt voor garbage collection en detectie van lusreferenties, enz. Zie het als een 'pointer naar pointer'. We kunnen de basistype van [SmartPtr](./smartptr/) niet gebruiken omdat die geen heeft; in plaats daarvan gebruiken we deze 'info'‑klasse. |
| [Span](./span/) | Stelt een aaneengesloten gebied van willekeurig geheugen voor, vergelijkbaar met std::span uit C++20. |
| [String](./string/) | [String](./string/)-klasse die door de hele bibliotheek wordt gebruikt. Het is een vervanging voor C# [System.String](./string/) bij het vertalen van code. Om optimalisatieredenen wordt het niet beschouwd als een [Object](./object/)-subklasse. Dit type moet op de stack worden toegewezen en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/)-klasse om objecten van dit type te beheren. |
| [StringComparer](./stringcomparer/) | Vergelijkt strings met verschillende vergelijkingsmodi. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [StringHashCompiletime](./stringhashcompiletime/) | Een hulpprogrammaklasse die een hashwaarde genereert uit een c-string. |
| [TimeSpan](./timespan/) | Stelt een tijdsinterval voor. Dit type moet op de stack worden toegewezen en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/)-klasse om objecten van dit type te beheren. |
| [TimeZone](./timezone/) | Stelt een tijdzone voor. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [TimeZoneInfo](./timezoneinfo/) | Stelt een informatie voor die een specifieke tijdzone beschrijft. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [Tuple](./tuple/) | Klasse die een tuple‑datastructuur voorstelt. Het maximale aantal items is 8. |
| [TupleFactory](./tuplefactory/) | Biedt statische methoden voor het maken van tuple‑objecten. |
| [TypeInfo](./typeinfo/) | Stelt een specifiek type voor en biedt er informatie over. |
| [Uri](./uri/) | Uniforme resource‑identifier. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [UriBuilder](./uribuilder/) | Biedt methoden om universele resource‑identifiers (URI's) te construeren en te wijzigen. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [UriParser](./uriparser/) | Wordt gebruikt om een nieuw URI‑schema te parseren. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](./makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](./smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [UriShim](./urishim/) | Service‑klasse. |
| [ValueTuple](./valuetuple/) | Klasse die een [ValueTuple](./valuetuple/) datastructuur voorstelt. |
| [ValueType](./valuetype/) | Basisklasse voor waardetypen met [Object](./object/)‑erfenis die om prestatie‑redenen is ingekort. Dit type moet op de stack worden toegewezen en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/)-klasse om objecten van dit type te beheren. |
| [Version](./version/) | Stelt een versienummer voor. Dit type moet op de stack worden toegewezen en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](./smartptr/)-klasse om objecten van dit type te beheren. |
| [Void](./void/) |  |
| [WeakPtr](./weakptr/) | Subklasse van [System::SmartPtr](./smartptr/) die zichzelf bij constructie in zwakke modus zet. Let op: deze klasse garandeert niet dat zijn instantie altijd in zwakke modus blijft, aangezien [set_Mode()](./smartptr/set_mode/) nog steeds toegankelijk is. Dit type is een pointer om de verwijdering van andere objecten te beheren. Het moet op de stack worden toegewezen en aan functies worden doorgegeven, hetzij per waarde, hetzij per const‑referentie. |
| [WeakReference](./weakreference/) | Stelt een zwakke referentie voor, die een object referereert terwijl dat object nog steeds kan worden verwijderd. |
| [WeakReference< T >](./weakreference_t_/) | Stelt een zwakke referentie voor, die een object referereert terwijl dat object nog steeds kan worden verwijderd. |
| [WeakReference<>](./weakreference__/) | Stelt een zwakke referentie voor, die een object referereert terwijl dat object nog steeds kan worden verwijderd. |
## Enums

| Enum | Beschrijving |
| --- | --- |
| [Base64FormattingOptions](./base64formattingoptions/) | Enumeratie die waarden bevat die verschillende formaten van base-64 gecodeerde gegevens vertegenwoordigen. |
| [DateTimeKind](./datetimekind/) | Enumeratiewaarden die de soorten datum en tijd vertegenwoordigen. |
| [DayOfWeek](./dayofweek/) | Enumeratie die een dag van de week vertegenwoordigt. |
| [EnvironmentVariableTarget](./environmentvariabletarget/) | Specificeert de locatie van de omgevingsvariabele. |
| [MidpointRounding](./midpointrounding/) | Specificeert het gedrag van afrondingsfuncties. |
| [PlatformID](./platformid/) | Stelt een besturingssysteemplatform voor. |
| [SmartPtrMode](./smartptrmode/) | [SmartPtr](./smartptr/) pointertype: zwak of gedeeld. Definieert of de pointer wordt meegeteld wanneer wordt beslist of het object al dan niet moet worden verwijderd. |
| [StringComparison](./stringcomparison/) | Definieert de stijl van tekenreeksvergelijking. |
| [StringSplitOptions](./stringsplitoptions/) | Bepaalt het gedrag van het splitsen van tekenreeksen. |
| [TypeCode](./typecode/) | Stelt het type van een object voor. |
| [UriComponents](./uricomponents/) | Stelt URI-componenten voor. |
| [UriFormat](./uriformat/) | Specificeert hoe de URI wordt ontsnapt. |
| [UriHostNameType](./urihostnametype/) | Stelt het type hostnaam voor. |
| [UriKind](./urikind/) | Stelt de soorten URI's voor. |
| [UriPartial](./uripartial/) | Stelt de delen van een URI voor voor de methode [Uri.GetLeftPart](./uri/getleftpart/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Action](./action/) | Delegatietype dat methoden verwijst die geen retourwaarde hebben. |
| [ArrayPtr](./arrayptr/) | Alias voor het type 'pointer naar array'. |
| [AsyncCallback](./asynccallback/) | Een delegatietype dat een methode vertegenwoordigt die wordt aangeroepen wanneer een asynchrone bewerking voltooid is. |
| [BadImageFormatException](./badimageformatexception/) | De uitzondering die wordt gegooid wanneer het bestandsimage van een dynamische linkbibliotheek (DLL) of een uitvoerbaar programma ongeldig is. Verpak nooit de [BadImageFormatException](./badimageformatexception/) klasse‑instanties in [System::SmartPtr](./smartptr/). |
| [ByteArrayPtr](./bytearrayptr/) | Een alias voor een smart‑pointerobject dat naar een array van ongetekende 8‑bit gehele getallen wijst. |
| [Converter](./converter/) | Stelt een pointer voor naar de aanroepbare entiteit die één argument van het type **TInput** accepteert en een waarde van het type **TOutput** retourneert. |
| [DecoderFallbackBufferPtr](./decoderfallbackbufferptr/) | Een alias voor een smart‑pointer die naar een instantie van de klasse [System::Text::DecoderFallbackBuffer](../system.text/decoderfallbackbuffer/) wijst. |
| [DecoderFallbackPtr](./decoderfallbackptr/) | Een alias voor een smart‑pointer die naar een instantie van de klasse [System::Text::DecoderFallback](../system.text/decoderfallback/) wijst. |
| [DecoderPtr](./decoderptr/) | Een alias voor een smart‑pointer die naar een instantie van de klasse [System::Text::Decoder](../system.text/decoder/) wijst. |
| [DecoderReplacementFallbackPtr](./decoderreplacementfallbackptr/) | Een alias voor een smart‑pointer die naar een instantie van de klasse [System::Text::DecoderReplacementFallback](../system.text/decoderreplacementfallback/) wijst. |
| [DirectoryInfoPtr](./directoryinfoptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::IO::DirectoryInfo](../system.io/directoryinfo/) wijst. |
| [EncoderFallbackBufferPtr](./encoderfallbackbufferptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::Text::EncoderFallbackBuffer](../system.text/encoderfallbackbuffer/) wijst. |
| [EncoderFallbackPtr](./encoderfallbackptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::Text::EncoderFallback](../system.text/encoderfallback/) wijst. |
| [EncoderPtr](./encoderptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::Text::Encoder](../system.text/encoder/) wijst. |
| [EncoderReplacementFallbackBufferPtr](./encoderreplacementfallbackbufferptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::Text::EncoderReplacementFallbackBuffer](../system.text/encoderreplacementfallbackbuffer/) wijst. |
| [EncoderReplacementFallbackPtr](./encoderreplacementfallbackptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::Text::EncoderReplacementFallback](../system.text/encoderreplacementfallback/) wijst. |
| [EncodingInfoPtr](./encodinginfoptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::Text::EncodingInfo](../system.text/encodinginfo/) wijst. |
| [EncodingPtr](./encodingptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::Text::Encoding](../system.text/encoding/) wijst. |
| [Event](./event/) | Stelt een gebeurtenis voor - een mechanisme waardoor abonnees op de hoogte worden gesteld van een gebeurtenis van belang via een delegate-aanroep. |
| [EventArgsPtr](./eventargsptr/) | Gedeelde pointer naar een instantie van de klasse [EventArgs](./eventargs/). |
| [EventHandler](./eventhandler/) | Stelt een methode voor die reageert op en een gebeurtenis verwerkt. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de klasse [System::SmartPtr](./smartptr/) om objecten van dit type te beheren. |
| [Exception](./exception/) | Alias die moet worden gebruikt in plaats van Details::Exception. |
| [ExceptionPtr](./exceptionptr/) | Type-alias die wordt gebruikt door exception-wrappers. |
| [FileInfoPtr](./fileinfoptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::IO::FileInfo](../system.io/fileinfo/) wijst. |
| [FileStreamPtr](./filestreamptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::IO::FileStream](../system.io/filestream/) wijst. |
| [FileSystemInfoPtr](./filesysteminfoptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::IO::FileSystemInfo](../system.io/filesysteminfo/) wijst. |
| [FunctionPtr](./functionptr/) | Een alias voor functietype met de standaard aanroepconventie. |
| [IAsyncResultPtr](./iasyncresultptr/) | Gedeelde pointer naar [IAsyncResult](./iasyncresult/). |
| [IFormatProviderPtr](./iformatproviderptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::IFormatProvider](./iformatprovider/) wijst. |
| [MakeConstRef_t](./makeconstref_t/) | Helpertype voor de modifier [MakeConstRef](./makeconstref/). |
| [MemoryStreamPtr](./memorystreamptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::IO::MemoryStream](../system.io/memorystream/) wijst. |
| [Predicate](./predicate/) | Stelt een pointer naar een predicaat voor - een aanroepbaar entiteit die één argument accepteert en een bool-waarde retourneert. |
| [RTaskPtr](./rtaskptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::Threading::Tasks::ResultTask](../system.threading.tasks/resulttask/) wijst. |
| [SharedPtr](./sharedptr/) | Alias voor slimme pointer die veel wordt gebruikt in de bibliotheek. |
| [StreamPtr](./streamptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::IO::Stream](../system.io/stream/) wijst. |
| [StreamReaderPtr](./streamreaderptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::IO::StreamReader](../system.io/streamreader/) wijst. |
| [StreamWriterPtr](./streamwriterptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::IO::StreamWriter](../system.io/streamwriter/) wijst. |
| [StringComparerPtr](./stringcomparerptr/) | Een alias voor een gedeelde pointer naar een instantie van de klasse [StringComparer](./stringcomparer/). |
| [TaskPtr](./taskptr/) | Een alias voor een slimme pointer die naar een instantie van de klasse [System::Threading::Tasks::Task](../system.threading.tasks/task/) wijst. |
| [TimeZoneInfoPtr](./timezoneinfoptr/) | Alias voor gedeelde pointer naar een instantie van de klasse [TimeZoneInfo](./timezoneinfo/). |
| [TimeZonePtr](./timezoneptr/) | Gedeelde pointer naar een instantie van de klasse [TimeZone](./timezone/). |
## Functions

| Functie | Beschrijving |
| --- | --- |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Build | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CheckedCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| const_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ConstCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Default | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Default | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Discard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| dynamic_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumGetName | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumGetName | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Gelijk | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Gelijk< double, double > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Gelijk< float, float > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Expliciete cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Forceer statische cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Voor elk lid GVNaam | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Groter of gelijk | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Haal op | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Haal op | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Haal op | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Haal op | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| verkrijg_pointer | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| VerkrijgHashCode | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| VerkrijgHashCode | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| VerkrijgHashCode | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| VerkrijgHashCode | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| VerkrijgHashCode | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Groter | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| InitialiseerObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Is | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Is | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Is | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| is_geparametriseerde_test | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| is_vp_test | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsEnumMetaInfoGedefinieerd | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsEnumMetaInfoGedefinieerd | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsOneindig | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsNaN | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsNegatieveOneindigheid | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsPositieveOneindigheid | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ItereerOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ItereerOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ItereerOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ItereerOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ItereerOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ItereerOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ItereerOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Kleiner of gelijk | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Kleiner | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MaakArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MaakArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MaakArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeScopeGuard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerable | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerator | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MemberwiseClone | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::DateTime > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::String > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator* | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator/ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| SafeInvoke | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Set | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| static_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| TieTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| With | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| With | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
