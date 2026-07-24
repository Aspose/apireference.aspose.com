---
title: "System::SmartPtr‑klasse"
linktitle: "SmartPtr"
second_title: "Aspose.Page voor C++"
description: "System::SmartPtr‑klasse. Pointer‑klasse om typen die op de heap worden gealloceerd te omhullen. Gebruik deze om geheugen te beheren voor klassen die Object erven. Dit pointertype volgt intrusieve pointersemantiek. De referentieteller wordt opgeslagen ofwel in Object zelf of in een tellerstructuur die nauw verbonden is met de Object‑instantie. In elk geval vormen alle SmartPtr‑instanties een enkele eigendoms‑groep, ongeacht hoe ze zijn gemaakt, wat verschilt van het gedrag van de std::shared_ptr‑klasse. Het converteren van een ruwe pointer naar SmartPtr is veilig, aangezien er andere SmartPtr‑instanties zijn die gedeelde referenties naar hetzelfde object behouden. Een SmartPtr‑klasse‑instantie kan zich in een van twee toestanden bevinden: gedeelde pointer en zwakke pointer. Om het object levend te houden, moet het aantal gedeelde referenties positief zijn. Zowel zwakke als gedeelde pointers kunnen worden gebruikt om het aangewezen object te benaderen (om methoden aan te roepen, velden te lezen of te schrijven, enz.), maar zwakke pointers nemen niet deel aan de referentietelling van gedeelde pointers. Object wordt verwijderd wanneer de laatste ''shared'' SmartPtr‑pointer naar het object wordt vernietigd. Zorg er dus voor dat dit niet gebeurt wanneer er geen andere gedeelde SmartPtr‑pointers naar het object bestaan, bijv. tijdens de constructie of destructie van het object. Gebruik System::Object::ThisProtector‑bewakingsobjecten (in C++‑code) of het CppCTORSelfReference‑ of CppSelfReference‑attribuut (in C#‑code die wordt vertaald) om dit probleem op te lossen. Zorg er bovendien voor dat lus‑referenties worden verbroken door de System::WeakPtr‑pointerklasse of de System::SmartPtrMode::Weak‑pointermodus (in C++‑code) of het CppWeakPtr‑attribuut (in C#‑code die wordt vertaald) te gebruiken. Als twee of meer objecten elkaar refereren met ''shared''‑pointers, zullen ze nooit worden verwijderd. Als het pointertype (zwak of gedeeld) tijdens runtime moet worden gewijzigd, gebruik dan de System::SmartPtr<T>::set_Mode()‑methode of de System::DynamicWeakPtr‑klasse. De SmartPtr‑klasse bevat geen virtuele methoden. U mag er alleen van overerven als u zelf een geheugenbeheersstrategie ontwikkelt. Dit type is een pointer om de verwijdering van een ander object te beheren. Het moet op de stack worden gealloceerd en aan functies worden doorgegeven, hetzij per waarde, hetzij per const‑referentie, in C++."
type: docs
weight: 5500
url: /nl/cpp/system/smartptr/
---
## SmartPtr class


Pointer‑klasse om typen die op de heap worden gealloceerd te omhullen. Gebruik deze om geheugen te beheren voor klassen die [Object](../object/) erven. Dit pointertype volgt intrusieve pointersemantiek. De referentieteller wordt opgeslagen ofwel in [Object](../object/) zelf of in een tellerstructuur die nauw verbonden is met de [Object](../object/)‑instantie. In elk geval vormen alle [SmartPtr](./)‑instanties een enkele eigendoms‑groep, ongeacht hoe ze zijn gemaakt, wat verschilt van het gedrag van de std::shared_ptr‑klasse. Het converteren van een ruwe pointer naar [SmartPtr](./) is veilig, aangezien er andere [SmartPtr](./)‑instanties zijn die gedeelde referenties naar hetzelfde object behouden. Een [SmartPtr](./)‑klasse‑instantie kan zich in een van twee toestanden bevinden: gedeelde pointer en zwakke pointer. Om het object levend te houden, moet het aantal gedeelde referenties positief zijn. Zowel zwakke als gedeelde pointers kunnen worden gebruikt om het aangewezen object te benaderen (om methoden aan te roepen, velden te lezen of te schrijven, enz.), maar zwakke pointers nemen niet deel aan de referentietelling van gedeelde pointers. [Object](../object/) wordt verwijderd wanneer de laatste 'shared' [SmartPtr](./)‑pointer naar het object wordt vernietigd. Zorg er dus voor dat dit niet gebeurt wanneer er geen andere gedeelde [SmartPtr](./)‑pointers naar het object bestaan, bijv. tijdens de constructie of destructie van het object. Gebruik System::Object::ThisProtector‑bewakingsobjecten (in C++‑code) of het CppCTORSelfReference‑ of CppSelfReference‑attribuut (in C#‑code die wordt vertaald) om dit probleem op te lossen. Zorg er bovendien voor dat lus‑referenties worden verbroken door de [System::WeakPtr](../weakptr/)‑pointerklasse of de [System::SmartPtrMode::Weak](../smartptrmode/)‑pointermodus (in C++‑code) of het CppWeakPtr‑attribuut (in C#‑code die wordt vertaald) te gebruiken. Als twee of meer objecten elkaar refereren met 'shared'‑pointers, zullen ze nooit worden verwijderd. Als het pointertype (zwak of gedeeld) tijdens runtime moet worden gewijzigd, gebruik dan de [System::SmartPtr<T>::set_Mode()](./set_mode/)‑methode of de [System::DynamicWeakPtr](../dynamicweakptr/)‑klasse. De [SmartPtr](./)‑klasse bevat geen virtuele methoden. U mag er alleen van overerven als u zelf een geheugenbeheersstrategie ontwikkelt. Dit type is een pointer om de verwijdering van een ander object te beheren. Het moet op de stack worden gealloceerd en aan functies worden doorgegeven, hetzij per waarde, hetzij per const‑referentie.

```cpp
template<class T>class SmartPtr
```


| Parameter | Beschrijving |
| --- | --- |
| T | Type van het aangewezen object. Moet ofwel [System::Object](../object/) zijn of een subklasse daarvan. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [begin](./begin/)() | Accessor voor de [begin()](./begin/)‑methode van een onderliggende collectie. Compileert alleen als [SmartPtr_](./smartptr_/) een gespecialiseerd type is met een [begin()](./begin/)‑methode. |
| [begin](./begin/)() const | Accessor voor de [begin()](./begin/)‑methode van een onderliggende collectie. Compileert alleen als [SmartPtr_](./smartptr_/) een gespecialiseerd type is met een [begin()](./begin/)‑methode. |
| [Cast](./cast/)() const | Casts pointer naar zijn eigen type. |
| [Cast](./cast/)() const | Casts pointer naar basistype met static_cast. |
| [Cast](./cast/)() const | Casts pointer naar afgeleid type dynamic_cast. |
| [Cast](./cast/)() const | Casts pointer naar afgeleid type dynamic_cast. |
| [cbegin](./cbegin/)() const | Accessor voor [cbegin()](./cbegin/) methode van een onderliggende collectie. Compileert alleen als [SmartPtr_](./smartptr_/) een specialisatietype is met [cbegin()](./cbegin/) methode. |
| [cend](./cend/)() const | Accessor voor [cend()](./cend/) methode van een onderliggende collectie. Compileert alleen als [SmartPtr_](./smartptr_/) een specialisatietype is met [cend()](./cend/) methode. |
| [const_pointer_cast](./const_pointer_cast/)() const | Casts pointer naar ander type met const_cast op het aangewezen object. |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | Casts pointer naar ander type met dynamic_cast op het aangewezen object. |
| [end](./end/)() | Accessor voor [end()](./end/) methode van een onderliggende collectie. Compileert alleen als [SmartPtr_](./smartptr_/) een specialisatietype is met [end()](./end/) methode. |
| [end](./end/)() const | Accessor voor [end()](./end/) methode van een onderliggende collectie. Compileert alleen als [SmartPtr_](./smartptr_/) een specialisatietype is met [end()](./end/) methode. |
| [get](./get/)() const | Haalt aangewezen object op. |
| [get_Mode](./get_mode/)() const | Haalt pointermodus op. |
| [get_shared](./get_shared/)() const | Haalt aangewezen object op, maar stelt dat de pointer in gedeelde modus is. |
| [get_shared_count](./get_shared_count/)() const | Haalt het aantal gedeelde pointers op dat bestaat naar het gerefereerde object, inclusief de huidige. Stelt dat de huidige pointer in gedeelde modus is. |
| [GetHashCode](./gethashcode/)() const | Roept [GetHashCode()](./gethashcode/) aan op het aangewezen object. |
| [GetObjectNotNull](./getobjectnotnull/)() const | Haalt momenteel gerefereerd object op (indien aanwezig) of gooit een uitzondering. |
| [GetObjectOrNull](./getobjectornull/)() const | Haalt aangewezen object op (indien aanwezig) of nullptr. Hetzelfde als [get()](./get/). |
| [GetObjectOwner](./getobjectowner/)() const | Haalt gerefereerd object op. |
| [GetPointer](./getpointer/)() const | Haalt aangewezen object op (indien aanwezig) of nullptr. Hetzelfde als [get()](./get/). |
| [Is](./is/)(const System::TypeInfo\&) const | Controleert of het aangewezen object van een specifiek type of een afgeleid type is. Volgt de C# 'is' semantiek. |
| [IsAliasingPtr](./isaliasingptr/)() const | Controleert of de pointer naar een ander object wijst dan het eigendom (gecreëerd door een aliasing constructor). |
| [IsShared](./isshared/)() const | Controleert of de pointer in gedeelde modus is. |
| [IsWeak](./isweak/)() const | Controleert of de pointer in zwakke modus is. |
| explicit [operator bool](./operatorbool/)() const | Controleert of de pointer niet null is. |
| [operator!](./operator!/)() const | Controleert of de pointer null is. |
| [operator*](./operator_/)() const | Haalt referentie naar het aangewezen object op. Stelt dat de pointer niet null is. |
| [operator->](./operator-_/)() const | Staat toe leden van het gerefereerde object te benaderen. |
| [operator<](./operator_/)(Y *) const | Biedt minder-vergelijkingssemantiek voor de [SmartPtr](./) klasse. |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | Biedt minder-vergelijkingssemantiek voor de [SmartPtr](./) klasse. |
| [operator=](./operator=/)(SmartPtr_\&&) | Voert een move-toewijzing uit op een [SmartPtr](./) object. x wordt onbruikbaar. |
| [operator=](./operator=/)(const SmartPtr_\&) | Voert een copy-toewijzing uit op een [SmartPtr](./) object. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Kopieert-toewijst [SmartPtr](./) object. Voert vereiste typeconversies uit. |
| [operator=](./operator=/)(Pointee_ *) | Wijs een ruwe pointer toe aan [SmartPtr](./) object. |
| [operator=](./operator=/)(std::nullptr_t) | Stelt pointerwaarde in op nullptr. |
| [operator==](./operator==/)(std::nullptr_t) const | Controleert of pointer naar nullptr wijst. |
| [operator[]](./operator[]/)(IdxType) const | Accessor voor array‑elementen. Compileert alleen als [SmartPtr_](./smartptr_/) een specialisatie is van [System::Array](../array/). |
| [RemoveAliasing](./removealiasing/)() const | Verwijdert aliasing (gecreëerd door een aliasing‑constructor) van de pointer, en zorgt ervoor dat deze (indien gedeeld) beheert of (indien zwak) volgt hetzelfde object waarnaar hij wijst. |
| [reset](./reset/)(Pointee_ *) | Stelt het aangewezen object in. |
| [reset](./reset/)() | Laat de pointer naar nullptr wijzen. |
| [set_Mode](./set_mode/)(SmartPtrMode) | Stelt pointermodus in. Kan referentietellingen van het aangewezen object wijzigen. |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | Roept de SetTemplateWeakPtr()-methode aan op het aangewezen object (indien aanwezig). |
| [SmartPtr](./smartptr/)(SmartPtrMode) | Maakt een [SmartPtr](./) object aan in de vereiste modus. |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | Maakt een null‑pointer [SmartPtr](./) object aan in de vereiste modus. |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | Maakt een [SmartPtr](./) aan die naar het opgegeven object wijst, of converteert een ruwe pointer naar een [SmartPtr](./). |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | Kopieert een [SmartPtr](./) object. Beide pointers wijzen daarna naar hetzelfde object. |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | Kopieert een [SmartPtr](./) object. Beide pointers wijzen daarna naar hetzelfde object. Voert typeconversie uit indien toegestaan. |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | Verplaatst een [SmartPtr](./) object. Effectief worden twee pointers verwisseld, als ze beide dezelfde modus hebben. x kan na de oproep onbruikbaar zijn. |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | Converteert het type van de gerefereerde array door een nieuwe array van een ander type te maken. Handig als er in C# een array‑typecast bestaat die niet wordt ondersteund in C++. |
| explicit [SmartPtr](./smartptr/)(const Y\&) | Initialiseert een lege array. Wordt gebruikt om sommige C#‑codeconstructies te vertalen. |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | Construeert een [SmartPtr](./) die eigendomsinformatie deelt met de initiële waarde van ptr, maar een niet‑gerelateerde en onbeheerde pointer p bevat. |
| [static_pointer_cast](./static_pointer_cast/)() const | Cast pointer naar een ander type met static_cast op het aangewezen object. |
| [ToObjectPtr](./toobjectptr/)() const | Converteert elk pointertype naar een pointer naar [Object](../object/). Vereist niet dat het type [Pointee_](./pointee_/) compleet is. |
| static [Type](./type/)() | Snelkoppeling om het [System::TypeInfo](../typeinfo/) object voor het type [Pointee_](./pointee_/) te verkrijgen. |
| [~SmartPtr](./~smartptr/)() | Vernietigt het [SmartPtr](./) object. Indien nodig verlaagt het de referentieteller van het aangewezen object en verwijdert het object. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ArrayType](./arraytype/) | Hetzelfde als [Pointee_](./pointee_/), als het een specialisatie is van [System::Array](../array/), en anders void. |
| [Pointee_](./pointee_/) | Gewezen type. |
| [SmartPtr_](./smartptr_/) | Gespecialiseerd smart‑pointer type. |
| [ValueType](./valuetype/) | Opslagtype van aangewezen array. Alleen zinvol als T een specialisatie is van [System::Array](../array/). |

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
