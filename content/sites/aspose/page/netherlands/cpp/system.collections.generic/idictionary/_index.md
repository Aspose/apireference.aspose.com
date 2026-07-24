---
title: "System::Collections::Generic::IDictionary class"
linktitle: "IDictionary"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::IDictionary klasse. Interface voor container-achtige woordenboeken. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2100
url: /nl/cpp/system.collections.generic/idictionary/
---
## IDictionary class


Interface voor container-achtige woordenboeken. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| Parameter | Beschrijving |
| --- | --- |
| TKey | Sleuteltype. |
| TValue | Waarde‑type. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | Voegt een sleutel‑waarde‑paar toe aan de container. |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | Controleert of de container de sleutel bevat. |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | Kopieert de inhoud van het woordenboek naar bestaande array‑elementen. |
| virtual [get_Count](./get_count/)() const | Maakt de lidfunctie get_Count zichtbaar. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Controleert of de grootte van de collectie vast is. |
| [get_IsSynchronized](./get_issynchronized/)() const | Controleert of de container thread‑veilig is. |
| virtual [get_Keys](./get_keys/)() const | Benadert de sleutelcollectie. |
| virtual [get_Values](./get_values/)() const | Benadert de waardecollectie. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | Retourneert de waarde indien gevonden; of **Value()** anders. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | Retourneert de waarde indien gevonden; of **defaultValue** anders. |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | Retourneert de waarde indien gevonden; of **null** anders, wat alleen zinvol is voor referentietypen. |
| virtual [idx_get](./idx_get/)(const TKey\&) const | Getter‑functie. |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | Setter‑functie. |
| virtual [Remove](./remove/)(const TKey\&) | Verwijdert sleutel uit de container. |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | Zoekt naar de waarde en haalt deze op indien gevonden. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) | RTTI-informatie. |
| [KeyValuePairType](./keyvaluepairtype/) | Type sleutel‑waarde‑paar. |

## Zie ook

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
