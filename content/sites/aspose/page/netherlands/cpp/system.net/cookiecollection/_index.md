---
title: "System::Net::CookieCollection klasse"
linktitle: "CookieCollection"
second_title: "Aspose.Page voor C++"
description: "System::Net::CookieCollection klasse. Vertegenwoordigt een lijst van gesorteerde cookies. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.net/cookiecollection/
---
## CookieCollection class


Vertegenwoordigt een lijst van gesorteerde cookies. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| Enum | Beschrijving |
| --- | --- |
| [Stamp](./stamp/) | RTTI-informatie. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | Voegt een cookie toe aan de collectie. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Voegt cookies toe van de opgegeven collectie aan de huidige. |
| [Clear](./clear/)() override | Verwijdert alle cookies uit de collectie. |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | Controleert of de collectie de opgegeven cookie bevat. |
| [CookieCollection](./cookiecollection/)() | Construeert een nieuw exemplaar. |
| [get_Count](./get_count/)() const override | Haalt het aantal elementen op in de collectie. |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | Retourneert een waarde die aangeeft of de collectie een cookie bevat met een versie die niet gelijk is aan [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/). |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op. |
| [idx_get](./idx_get/)(int32_t) | Retourneert een cookie uit de cookiecollectie op de opgegeven index. |
| [idx_get](./idx_get/)(String) | Retourneert een cookie uit de cookiecollectie op basis van de opgegeven naam. |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | Retourneert een index van de opgegeven cookie. |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | Voegt de opgegeven cookie toe aan de collectie. |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | Verwijdert de opgegeven cookie uit de collectie. |
| [RemoveAt](./removeat/)(int32_t) | Verwijdert een cookie op de opgegeven index. |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | Werkt de tijdstempel bij volgens het opgegeven scenario en retourneert een nieuwe waarde. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Zie ook

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
