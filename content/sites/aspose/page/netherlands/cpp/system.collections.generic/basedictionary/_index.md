---
title: "System::Collections::Generic::BaseDictionary klasse"
linktitle: "BaseDictionary"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::BaseDictionary klasse. Implementeert gemeenschappelijke code voor verschillende dictionary-achtige datastructuren (bijv. Dictionary, SortedDictionary). Mag niet direct worden gebruikt, behalve voor overerving bij het definiëren van containers. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 500
url: /nl/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


Implementeert gemeenschappelijke code voor verschillende dictionary-achtige datastructuren (bijv. [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/)). Mag niet direct worden gebruikt, behalve voor overerving bij het definiëren van containers. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| Parameter | Beschrijving |
| --- | --- |
| Kaart | Onderliggende kaarttype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | C++ specifiek. |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | Voegt een sleutel‑waarde‑paar toe aan het woordenboek. |
| [BaseDictionary](./basedictionary/)() | Maakt een lege datastructuur. |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | Doorstuurconstructor om argumenten door te geven aan de onderliggende kaartconstructor. |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | Kopieerconstructor. |
| [BaseDictionary](./basedictionary/)(BaseType *) | Kopieerconstructor. |
| [begin](./begin/)() const | Retourneert een iterator naar de **KVPair-wrapper** voor het sleutel‑waarde‑element van de container. Geïmplementeerd in C#‑stijl – de iterator moet het **KVPair-object** met de get_Key() en get_Value() interface retourneren. Als de container leeg is, is de geretourneerde iterator gelijk aan [end()](../ienumerable/end/). |
| [cbegin](./cbegin/)() const | Retourneert een iterator naar het eerste element van de container. Geïmplementeerd in STL‑stijl. Als de container leeg is, is de geretourneerde iterator gelijk aan [end()](../ienumerable/end/). |
| [cend](./cend/)() const | Retourneert een iterator naar het element dat volgt op het laatste element van de container. Geïmplementeerd in STL‑stijl. Dit element fungeert als een tijdelijke aanduiding; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [Clear](./clear/)() override | Verwijdert alle elementen. |
| [ContainsKey](./containskey/)(const key_t\&) const override | Controleert of de sleutel aanwezig is in het woordenboek. |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | Controleert of de waarde aanwezig is in het woordenboek. Gebruikt operator == om waarden te vergelijken. |
| [data](./data/)() | Onderliggende gegevensopslag‑toegang. |
| [data](./data/)() const | Onderliggende gegevensopslag‑toegang. |
| [end](./end/)() const | Retourneert een iterator naar de **KVPair-wrapper** voor het sleutel‑waarde‑element dat volgt op het laatste element van de container. Geïmplementeerd in C#‑stijl – de iterator moet het **KVPair-object** met de get_Key() en get_Value() interface retourneren. Dit element fungeert als een tijdelijke aanduiding; proberen er toegang toe te krijgen resulteert in ongedefinieerd gedrag. |
| [get_Count](./get_count/)() const override | Haalt het aantal elementen op. |
| virtual [GetEnumerator](./getenumerator/)() | Maakt een enumerator‑instantie, moet worden geïmplementeerd door een subklasse. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | Retourneert de waarde indien gevonden; of **Value()** anders. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | Retourneert de waarde indien gevonden; of **defaultValue** anders. |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | Retourneert de waarde indien gevonden; of **null** anders. Heeft alleen zin voor referentietypen. |
| [idx_get](./idx_get/)(const key_t\&) const override | Get-functie met sleutel. |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | Set-functie met sleutel. Wijzigt of maakt een element aan. |
| virtual [operator[]](./operator[]/)(const key_t\&) | Accessor-functie. |
| [Remove](./remove/)(const key_t\&) override | Verwijdert een specifieke sleutel uit het woordenboek. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | Zoekt naar een waarde met sleutel en haalt deze op indien gevonden. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) | Geïmplementeerde interface. |
| [const_iterator](./const_iterator/) | Const-iterator type. |
| [iterator](./iterator/) | Iterator type. |
| [KeyCollection](./keycollection/) | Zorg ervoor dat we de juiste allocator gebruiken met het onderliggende opslagtype. |
| [KVPair](./kvpair/) | Sleutel‑waarde‑paartype. |
| [map_t](./map_t/) | Intern kaarttype. |
| [ValueCollection](./valuecollection/) | Collectie van waarden. |

## Zie ook

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
