---
title: "System::SmartPtr-klass"
linktitle: "SmartPtr"
second_title: "Aspose.Page för C++"
description: "System::SmartPtr-klass. Pekarklass för att omsluta typer som allokeras på heapen. Använd den för att hantera minne för klasser som ärver Object. Denna pekartyp följer intrusiva pekarsemantik. Referensräknaren lagras antingen i Object självt eller i en räknarstruktur som är tätt knuten till Object‑instansen. I alla fall bildar alla SmartPtr‑instanser en enda ägandegrupp oavsett hur de skapades, vilket skiljer sig från hur std::shared_ptr‑klassen beter sig. Att konvertera en rå pekare till SmartPtr är säkert så länge det finns andra SmartPtr‑instanser som håller delade referenser till samma objekt. En SmartPtr‑klassinstans kan vara i ett av två tillstånd: delad pekare och svag pekare. För att hålla objektet vid liv bör antalet delade referenser till det vara positivt. Både svaga och delade pekare kan användas för att komma åt det pekade objektet (för att anropa metoder, läsa eller skriva fält osv.), men svaga pekare deltar inte i referensräkningen för delade pekare. Object tas bort när den sista ''shared'' SmartPtr‑pekaren till den förstörs. Så se till att detta inte händer när inga andra delade SmartPtr‑pekare till objektet finns, t.ex. under objektkonstruktion eller -destruktion. Använd System::Object::ThisProtector‑vaktobjekt (i C++‑kod) eller CppCTORSelfReference‑ eller CppSelfReference‑attribut (i C#‑kod som översätts) för att åtgärda problemet. På liknande sätt, se till att bryta loopreferenser genom att använda System::WeakPtr‑pekarklass eller System::SmartPtrMode::Weak‑pekarläge (i C++‑kod) eller CppWeakPtr‑attribut (i C#‑kod som översätts). Om två eller fler objekt refererar till varandra med ''shared''‑pekare kommer de aldrig att tas bort. Om pekartypen (svag eller delad) ska bytas under körning, använd System::SmartPtr<T>::set_Mode()‑metoden eller System::DynamicWeakPtr‑klassen. SmartPtr‑klassen innehåller inga virtuella metoder. Du bör bara ärva den om du skapar en egen minneshanteringsstrategi. Denna typ är en pekare för att hantera raderingen av andra objekt. Den bör allokeras på stacken och skickas till funktioner antingen som värde eller som konstant referens i C++."
type: docs
weight: 5500
url: /sv/cpp/system/smartptr/
---
## SmartPtr class


Pekarklass för att omsluta typer som allokeras på heapen. Använd den för att hantera minne för klasser som ärver [Object](../object/). Denna pekartyp följer intrusiv pekarsemantik. Referensräknaren lagras antingen i [Object](../object/) självt eller i en räknarstruktur som är tätt knuten till [Object](../object/)-instansen. I alla fall bildar alla [SmartPtr](./)-instanser en enda ägandegrupp oavsett hur de skapades, vilket skiljer sig från hur std::shared_ptr‑klassen beter sig. Att konvertera en rå pekare till [SmartPtr](./) är säkert så länge det finns andra [SmartPtr](./)-instanser som håller delade referenser till samma objekt. En [SmartPtr](./)-klassinstans kan vara i ett av två tillstånd: delad pekare och svag pekare. För att hålla objektet vid liv bör antalet delade referenser till det vara positivt. Både svaga och delade pekare kan användas för att komma åt det pekade objektet (för att anropa metoder, läsa eller skriva fält osv.), men svaga pekare deltar inte i referensräkningen för delade pekare. [Object](../object/) tas bort när den sista 'shared' [SmartPtr](./)-pekaren till den förstörs. Så se till att detta inte händer när inga andra delade [SmartPtr](./)-pekare till objektet finns, t.ex. under objektkonstruktion eller -destruktion. Använd System::Object::ThisProtector‑vaktobjekt (i C++‑kod) eller CppCTORSelfReference‑ eller CppSelfReference‑attribut (i C#‑kod som översätts) för att åtgärda problemet. På liknande sätt, se till att bryta loopreferenser genom att använda [System::WeakPtr](../weakptr/)-pekarklass eller [System::SmartPtrMode::Weak](../smartptrmode/)-pekarläge (i C++‑kod) eller CppWeakPtr‑attribut (i C#‑kod som översätts). Om två eller fler objekt refererar till varandra med 'shared'‑pekare kommer de aldrig att tas bort. Om pekartypen (svag eller delad) ska bytas under körning, använd [System::SmartPtr<T>::set_Mode()](./set_mode/)-metoden eller [System::DynamicWeakPtr](../dynamicweakptr/)-klassen. [SmartPtr](./)-klassen innehåller inga virtuella metoder. Du bör bara ärva den om du skapar en egen minneshanteringsstrategi. Denna typ är en pekare för att hantera raderingen av andra objekts. Den bör allokeras på stacken och skickas till funktioner antingen som värde eller som konstant referens.

```cpp
template<class T>class SmartPtr
```


| Parameter | Beskrivning |
| --- | --- |
| T | Typen på det pekade objektet. Måste vara antingen [System::Object](../object/) eller en underklass till den. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [begin](./begin/)() | Åtkomstmetod för [begin()](./begin/)-metoden i en underliggande samling. Kompilerar endast om [SmartPtr_](./smartptr_/) är en specialiseringstyp med [begin()](./begin/)-metod. |
| [begin](./begin/)() const | Åtkomstmetod för [begin()](./begin/)-metoden i en underliggande samling. Kompilerar endast om [SmartPtr_](./smartptr_/) är en specialiseringstyp med [begin()](./begin/)-metod. |
| [Cast](./cast/)() const | Kastar pekaren till sin egen typ. |
| [Cast](./cast/)() const | Kastar pekaren till basklassen med static_cast. |
| [Cast](./cast/)() const | Kastar pekaren till en avledd typ med dynamic_cast. |
| [Cast](./cast/)() const | Kastar pekaren till en avledd typ med dynamic_cast. |
| [cbegin](./cbegin/)() const | Åtkomstmetod för [cbegin()](./cbegin/)-metoden i en underliggande samling. Kompilerar endast om [SmartPtr_](./smartptr_/) är en specialiseringstyp med [cbegin()](./cbegin/)-metod. |
| [cend](./cend/)() const | Åtkomstmetod för [cend()](./cend/)-metoden i en underliggande samling. Kompilerar endast om [SmartPtr_](./smartptr_/) är en specialiseringstyp med [cend()](./cend/)-metod. |
| [const_pointer_cast](./const_pointer_cast/)() const | Kastar pekaren till en annan typ med const_cast på det pekade objektet. |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | Kastar pekaren till en annan typ med dynamic_cast på det pekade objektet. |
| [end](./end/)() | Åtkomstmetod för [end()](./end/)-metoden i en underliggande samling. Kompilerar endast om [SmartPtr_](./smartptr_/) är en specialiseringstyp med [end()](./end/)-metod. |
| [end](./end/)() const | Åtkomstmetod för [end()](./end/)-metoden i en underliggande samling. Kompilerar endast om [SmartPtr_](./smartptr_/) är en specialiseringstyp med [end()](./end/)-metod. |
| [get](./get/)() const | Hämtar det pekade objektet. |
| [get_Mode](./get_mode/)() const | Hämtar pekarläget. |
| [get_shared](./get_shared/)() const | Hämtar det pekade objektet, men påstår att pekaren är i delat läge. |
| [get_shared_count](./get_shared_count/)() const | Hämtar antalet delade pekare som finns till det refererade objektet, inklusive den aktuella. Påstår att den aktuella pekaren är i delat läge. |
| [GetHashCode](./gethashcode/)() const | Anropar [GetHashCode()](./gethashcode/) på det pekade objektet. |
| [GetObjectNotNull](./getobjectnotnull/)() const | Hämtar det för närvarande refererade objektet (om något) eller kastar ett undantag. |
| [GetObjectOrNull](./getobjectornull/)() const | Hämtar det pekade objektet (om något) eller nullptr. Samma som [get()](./get/). |
| [GetObjectOwner](./getobjectowner/)() const | Hämtar det refererade objektet. |
| [GetPointer](./getpointer/)() const | Hämtar det pekade objektet (om något) eller nullptr. Samma som [get()](./get/). |
| [Is](./is/)(const System::TypeInfo\&) const | Kontrollerar om det pekade objektet är av en specifik typ eller dess underordnade typ. Följer C#-semantiken för 'is'. |
| [IsAliasingPtr](./isaliasingptr/)() const | Kontrollerar om pekaren pekar på ett annat objekt än det ägda (skapat av en alias‑konstruktor). |
| [IsShared](./isshared/)() const | Kontrollerar om pekaren är i delat läge. |
| [IsWeak](./isweak/)() const | Kontrollerar om pekaren är i svagt läge. |
| explicit [operator bool](./operatorbool/)() const | Kontrollerar om pekaren inte är null. |
| [operator!](./operator!/)() const | Kontrollerar om pekaren är null. |
| [operator*](./operator_/)() const | Hämtar en referens till det pekade objektet. Påstår att pekaren inte är null. |
| [operator->](./operator-_/)() const | Tillåter åtkomst till medlemmar i det refererade objektet. |
| [operator<](./operator_/)(Y *) const | Tillhandahåller mindre‑jämförelse‑semantik för klassen [SmartPtr](./). |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | Tillhandahåller mindre‑jämförelse‑semantik för klassen [SmartPtr](./). |
| [operator=](./operator=/)(SmartPtr_\&&) | Flytttilldelar [SmartPtr](./)-objektet. x blir oanvändbart. |
| [operator=](./operator=/)(const SmartPtr_\&) | Kopierar och tilldelar [SmartPtr](./)-objektet. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Kopierar och tilldelar [SmartPtr](./)-objektet. Utför nödvändiga typkonverteringar. |
| [operator=](./operator=/)(Pointee_ *) | Tilldelar en rå pekare till [SmartPtr](./)-objektet. |
| [operator=](./operator=/)(std::nullptr_t) | Sätter pekarvärdet till nullptr. |
| [operator==](./operator==/)(std::nullptr_t) const | Kontrollerar om pekaren pekar på nullptr. |
| [operator[]](./operator[]/)(IdxType) const | Åtkomstmetod för array‑element. Kompileras endast om [SmartPtr_](./smartptr_/) är en specialisering av [System::Array](../array/). |
| [RemoveAliasing](./removealiasing/)() const | Tar bort aliasing (skapad av en alias‑konstruktor) från pekaren, säkerställer att den hanterar (om delad) eller spårar (om svag) samma objekt som den pekar på. |
| [reset](./reset/)(Pointee_ *) | Sätter det pekade objektet. |
| [reset](./reset/)() | Gör så att pekaren pekar på nullptr. |
| [set_Mode](./set_mode/)(SmartPtrMode) | Ställer in pekarläget. Kan ändra referensräkningen för det refererade objektet. |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | Anropar SetTemplateWeakPtr()-metoden på det pekade objektet (om något). |
| [SmartPtr](./smartptr/)(SmartPtrMode) | Skapar ett [SmartPtr](./)-objekt i önskat läge. |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | Skapar ett null‑pekare‑[SmartPtr](./)-objekt i önskat läge. |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | Skapar ett [SmartPtr](./) som pekar på angivet objekt, eller konverterar en rå pekare till [SmartPtr](./). |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | Kopierar och konstruerar ett [SmartPtr](./)-objekt. Båda pekarna pekar på samma objekt efteråt. |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | Kopierar och konstruerar ett [SmartPtr](./)-objekt. Båda pekarna pekar på samma objekt efteråt. Utför typkonvertering om det är tillåtet. |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | Flyttar och konstruerar ett [SmartPtr](./)-objekt. I praktiken byter två pekare plats, om de har samma läge. x kan bli oanvändbar efter anropet. |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | Konverterar typen på den refererade arrayen genom att skapa en ny array av annan typ. Användbart om det i C# finns en array‑typcast som inte stöds i C++. |
| explicit [SmartPtr](./smartptr/)(const Y\&) | Initierar en tom array. Används för att översätta vissa C#‑kodkonstruktioner. |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | Konstruerar ett [SmartPtr](./) som delar ägandinformation med det ursprungliga värdet av ptr, men som innehåller en orelaterad och ohanterad pekare p. |
| [static_pointer_cast](./static_pointer_cast/)() const | Kastar pekaren till en annan typ med static_cast på det pekade objektet. |
| [ToObjectPtr](./toobjectptr/)() const | Konverterar vilken pekartyp som helst till en pekare till [Object](../object/). Kräver inte att typen [Pointee_](./pointee_/) är komplett. |
| static [Type](./type/)() | Genväg för att hämta ett [System::TypeInfo](../typeinfo/)-objekt för typen [Pointee_](./pointee_/). |
| [~SmartPtr](./~smartptr/)() | Förstör ett [SmartPtr](./)-objekt. Om nödvändigt minskar det det pekade objektets referensräknare och raderar objektet. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [ArrayType](./arraytype/) | Samma som [Pointee_](./pointee_/), om det är en specialisering av [System::Array](../array/), annars void. |
| [Pointee_](./pointee_/) | Pekad typ. |
| [SmartPtr_](./smartptr_/) | Specialiserad smart pekartyp. |
| [ValueType](./valuetype/) | Lagringstyp för pekad array. Endast meningsfull om T är en specialisering av [System::Array](../array/). |

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
