---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>-klasse"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Page voor C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>-klasse. Vertegenwoordigt een verzameling delegates. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr-klasse om objecten van dit type in C++ te beheren."
type: docs
weight: 4500
url: /nl/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


Vertegenwoordigt een verzameling delegates. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../smartptr/)-klasse om objecten van dit type te beheren.

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parameter | Beschrijving |
| --- | --- |
| ReturnType | Retourtype van de aanroepbare entiteiten waarnaar elke delegate in de verzameling wijst |
| ArgumentTypes | Argumentenlijst van de aanroepbare entiteiten waarnaar elke delegate in de verzameling wijst |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | NOG NIET GEÏMPLENTEERD. |
| [connect](./connect/)(Callback) | Voegt de opgegeven delegate toe aan de verzameling. |
| [connect](./connect/)(std::function\<R(Args...)>) | Voegt het opgegeven functie‑object toe aan de delegate‑verzameling. Het functie‑object wordt geconverteerd naar het [Callback](./callback/)-delegatetype voordat het aan de verzameling wordt toegevoegd. |
| [connect](./connect/)(MulticastDelegate\&) | Voegt het opgegeven MulticastDelegate‑object toe aan de delegate‑verzameling. |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | Voegt de opgegeven niet‑statische methode van het opgegeven object toe aan de delegate‑verzameling. |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Voegt de opgegeven niet‑statische methode van het opgegeven object toe aan de delegate‑verzameling. |
| [disconnect](./disconnect/)(Callback) | Verwijdert de opgegeven delegate uit de delegate‑verzameling. |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | Verwijdert de opgegeven niet‑statische methode van het opgegeven object uit de delegate‑collectie. |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Verwijdert de opgegeven niet‑statische methode van het opgegeven object uit de delegate‑collectie. |
| [disconnect](./disconnect/)(MulticastDelegate\&) | Verwijdert het opgegeven MulticastDelegate‑object uit de delegate‑collectie. |
| [disconnect_all_slots](./disconnect_all_slots/)() | Verwijdert alle delegates uit de delegate‑collectie. |
| [empty](./empty/)() const | Bepaalt of de delegate‑collectie leeg is. |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | NOG NIET GEÏMPLENTEERD. |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | Roep alle momenteel aanwezige delegates in de delegate‑collectie aan. Delegates worden aangeroepen in dezelfde volgorde als ze aan de collectie zijn toegevoegd. De methode blokkeert terwijl de delegates worden uitgevoerd. |
| [IsNull](./isnull/)() const | Bepaalt of de delegate‑collectie leeg is. |
| [MulticastDelegate](./multicastdelegate/)() | Construeert een lege collectie. |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | Gelijk aan de standaardconstructor. |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | Voert een ondiepe kopie uit van de delegate‑collectie. |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | Move‑constructor. |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | Construeert een instantie en plaatst de opgegeven delegate in de delegate‑collectie. |
| [MulticastDelegate](./multicastdelegate/)(T) | Construeert een instantie en plaatst de opgegeven waarde in de delegate‑collectie. |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | Construeert een instantie en plaatst de opgegeven waarde in de delegate‑collectie. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Bepaalt of de delegate‑collectie niet leeg is. |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | Bepaalt of twee instanties van MulticastDelegate - het huidige object en het opgegeven object - ongelijk zijn. |
| [operator()](./operator()/)(ArgumentTypes...) const | Roep alle momenteel aanwezige delegates in de delegate‑collectie aan. Delegates worden aangeroepen in dezelfde volgorde als ze aan de collectie zijn toegevoegd. De operator blokkeert terwijl de delegates worden uitgevoerd. |
| [operator+=](./operator+=/)(Callback) | Voegt de opgegeven delegate toe aan de verzameling. |
| [operator-=](./operator-=/)(Callback) | Verwijdert de opgegeven delegate uit de delegate‑verzameling. |
| [operator=](./operator=/)(const MulticastDelegate\&) | Wijst de collectie van delegates, vertegenwoordigd door het opgegeven object, toe aan het huidige object. Als gevolg hiervan wijzen beide objecten naar dezelfde collectie van delegates. |
| [operator=](./operator=/)(MulticastDelegate\&&) | Move‑toewijzingsoperator. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Bepaalt of de delegate‑collectie leeg is. |
| [operator==](./operator==/)(const MulticastDelegate\&) const | Bepaalt of twee instanties van MulticastDelegate - het huidige object en het opgegeven object - gelijk zijn. |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | Verwijdert ingesloten callbacks die leeg zijn (geen daadwerkelijke aanroep). |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | Retourneert een referentie naar het [TypeInfo](../typeinfo/)‑object dat de type‑informatie van de MulticastDelegate‑klasse vertegenwoordigt. |
| [~MulticastDelegate](./~multicastdelegate/)() | Destructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Callback](./callback/) | Het type van de delegates dat wordt vertegenwoordigd door de MulticastDelegate‑klasse. |

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
