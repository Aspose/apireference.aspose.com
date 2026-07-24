---
title: "System::Collections::Specialized::StringCollection klasse"
linktitle: "StringCollection"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Specialized::StringCollection klasse. Geïndexeerde lijst van strings. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 300
url: /nl/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


Geïndexeerde lijst van strings. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in de [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const System::String\&) | Voegt een waarde toe aan het einde van de lijst. |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | Voeg elementen toe aan de container. |
| [begin](./begin/)() | Retourneert een iterator naar het eerste element van de container. Als de container leeg is, is de geretourneerde iterator gelijk aan [end()](./end/). |
| [begin](./begin/)() const | Retourneert een iterator naar het eerste element van de const-gekwalificeerde container. Als de container leeg is, is de geretourneerde iterator gelijk aan [end()](./end/). |
| [cbegin](./cbegin/)() const | Retourneert een iterator naar het eerste const-gekwalificeerde element van de container. Als de container leeg is, is de geretourneerde iterator gelijk aan [cend()](./cend/). |
| [cend](./cend/)() const | Retourneert een iterator naar het element dat volgt op het laatste element van de container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [Clear](./clear/)() | Verwijdert alle elementen. |
| [Contains](./contains/)(const System::String\&) const | Controleert of een specifieke string aanwezig is in de container. |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | Kopieer elementen naar bestaande array-elementen. |
| [crbegin](./crbegin/)() const | Retourneert een reverse-iterator naar het eerste element van de omgekeerde container. Het correspondeert met het laatste element van de niet-omgekeerde container. Als de container leeg is, is de geretourneerde iterator gelijk aan [crend()](./crend/). |
| [crend](./crend/)() const | Retourneert een reverse-iterator naar het element dat volgt op het laatste element van de omgekeerde container. Het correspondeert met het element dat voorafgaat aan het eerste element van de niet-omgekeerde container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [data](./data/)() | Interne gegevensstructuur-toegangsfunctie. |
| [data](./data/)() const | Interne gegevensstructuur-toegangsfunctie. |
| [end](./end/)() | Retourneert een iterator naar het element dat volgt op het laatste element van de container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [end](./end/)() const | Retourneert een iterator naar het element dat volgt op het laatste element van de const-gekwalificeerde container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [get_Count](./get_count/)() const | Haalt het aantal elementen op in de collectie. |
| [GetEnumerator](./getenumerator/)() override | Haalt de enumerator op die door de huidige collectie iterereert. |
| [idx_get](./idx_get/)(int) const | Haalt de waarde op op de opgegeven positie. |
| [idx_set](./idx_set/)(int, const System::String\&) | Stelt de waarde in op de opgegeven positie. |
| [IndexOf](./indexof/)(const System::String\&) const | Zoekt naar een specifieke tekenreeks in de container. |
| [Insert](./insert/)(int, const System::String\&) | Voegt een specifieke waarde in de container in. |
| [operator[]](./operator[]/)(int) | Accessor-functie. |
| [rbegin](./rbegin/)() | Retourneert een reverse-iterator naar het eerste element van de omgekeerde container. Het correspondeert met het laatste element van de niet-omgekeerde container. Als de container leeg is, is de geretourneerde iterator gelijk aan [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Retourneert een reverse-iterator naar het eerste element van de omgekeerde container. Het correspondeert met het laatste element van de niet-omgekeerde container. Als de container leeg is, is de geretourneerde iterator gelijk aan [rend()](./rend/). |
| [Remove](./remove/)(const System::String\&) | Verwijdert de eerste voorkoming van de opgegeven tekenreeks. |
| [RemoveAt](./removeat/)(int) | Verwijdert het element op de opgegeven positie. |
| [rend](./rend/)() | Retourneert een reverse-iterator naar het element dat volgt op het laatste element van de omgekeerde container. Het correspondeert met het element dat voorafgaat aan het eerste element van de niet-omgekeerde container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [rend](./rend/)() const | Retourneert een reverse-iterator naar het element dat volgt op het laatste element van de omgekeerde container. Het correspondeert met het element dat voorafgaat aan het eerste element van de niet-omgekeerde container. Dit element fungeert als een placeholder; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [StringCollection](./stringcollection/)() | Construeert een lege tekenreekscollectie. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [const_iterator](./const_iterator/) | Const-iterator type. |
| [const_reverse_iterator](./const_reverse_iterator/) | Const reverse-iterator type. |
| [iterator](./iterator/) | Iterator type. |
| [reverse_iterator](./reverse_iterator/) | Reverse-iterator type. |
## Zie ook

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
