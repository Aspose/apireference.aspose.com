---
title: "System::Collections::ObjectModel::Collection klasse"
linktitle: "Collectie"
second_title: "Aspose.Page voor C++"
description: "System::Collections::ObjectModel::Collection klasse. Basistype voor generieke collectie. Objecten van deze klasse mogen alleen worden toegewezen met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.collections.objectmodel/collection/
---
## Collection class


Basistype voor generieke collectie. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../../system/makeobject/) . Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const T\&) override | Voegt waarde toe aan de container. |
| [Clear](./clear/)() override | Verwijdert alle elementen. |
| [Collection](./collection/)() | Maakt lege collectie. |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | Controleert of een item aanwezig is in de collectie. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Kopieert collectie‑elementen naar bestaande array‑elementen. |
| [crbegin](./crbegin/)() const | Haalt een reverse‑iterator op naar het laatste const‑gekwalificeerde element van de collectie (eerste in reverse). |
| [crend](./crend/)() const | Haalt een reverse‑iterator op voor een niet‑bestaand const‑gekwalificeerd element vóór het begin van de collectie. |
| [get_Count](./get_count/)() const override | Haalt aantal elementen op. |
| [get_Items](./get_items/)() | Interne gegevensstructuur-toegangsfunctie. |
| [get_Items](./get_items/)() const | Interne gegevensstructuur-toegangsfunctie. |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op om door de collectie te itereren. |
| [idx_get](./idx_get/)(int) const override | Haalt de waarde op op de opgegeven index. |
| [idx_set](./idx_set/)(int, T) override | Stelt waarde in op opgegeven index. |
| [IndexOf](./indexof/)(const T\&) const override | Zoekt naar element in de collectie. |
| [Insert](./insert/)(int, const T\&) override | Voegt item in op opgegeven positie. |
| [operator[]](./operator[]/)(int) | Haalt de waarde op op de opgegeven index. |
| [operator[]](./operator[]/)(int) const | Haalt de waarde op op de opgegeven index. |
| [rbegin](./rbegin/)() | Haalt een reverse iterator op naar het laatste element van de collectie (eerste in omgekeerde volgorde). |
| [rbegin](./rbegin/)() const | Haalt een reverse iterator op naar het laatste element van de const‑gekwalificeerde collectie (eerste in omgekeerde volgorde). |
| [Remove](./remove/)(const T\&) override | Verwijdert specifiek item. |
| [RemoveAt](./removeat/)(int) override | Verwijdert een item op een specifieke positie. |
| [rend](./rend/)() | Haalt een reverse iterator op voor een niet‑bestaand element vóór het begin van de collectie. |
| [rend](./rend/)() const | Haalt een reverse iterator op voor een niet‑bestaand element vóór het begin van de const‑gekwalificeerde collectie. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Maakt opgeslagen pointers zwak (indien van toepassing). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## Zie ook

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
