---
title: "System::Collections::Generic::List klasse"
linktitle: "Lijst"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::List klasse. Voorwaartse declaratie van List in C++."
type: docs
weight: 3300
url: /nl/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++ specifiek. |
| [Add](./add/)(const T\&) override | Voegt een element toe aan het einde van de lijst. |
| [AddInitializer](./addinitializer/)(int, const T *) | Voegt elementen toe aan de lijst; wordt gebruikt bij het vertalen van initializers. |
| [AddRange](./addrange/)(IEnumerablePtr) | Voegt alle elementen uit de collectie (of zichzelf) toe aan het einde van de huidige lijst. |
| [AsReadOnly](./asreadonly/)() | Haalt een alleen-lezen referentie naar deze collectie op. |
| [begin](./begin/)() | Haalt iterator op naar het eerste element van de collectie. |
| [begin](./begin/)() const | Haalt een iterator op naar het eerste element van de const-gekwalificeerde collectie. |
| [BinarySearch](./binarysearch/)(const T\&) const | Zoekt naar een item in een gesorteerde lijst. |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Zoekt naar een item in een gesorteerde lijst. |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Zoekt naar een item in een gesorteerde lijst. |
| [cbegin](./cbegin/)() const | Haalt een iterator op naar het eerste const-gekwalificeerde element van de collectie. |
| [cend](./cend/)() const | Haalt een iterator op voor een niet-bestaand const-gekwalificeerd element achter het einde van de collectie. |
| [Clear](./clear/)() override | Verwijdert alle elementen. |
| [Contains](./contains/)(const T\&) const override | Controleert of het item aanwezig is in de lijst. |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | Maakt een lijst van elementen die naar een ander type zijn geconverteerd. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Kopieert lijst‑elementen naar bestaande array‑elementen. |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | Kopieert alle elementen naar bestaande array‑elementen. |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | Kopieert elementen beginnend bij de opgegeven index naar bestaande array‑elementen. |
| [crbegin](./crbegin/)() const | Haalt een reverse‑iterator op naar het laatste const‑gekwalificeerde element van de collectie (eerste in reverse). |
| [crend](./crend/)() const | Haalt een reverse‑iterator op voor een niet‑bestaand const‑gekwalificeerd element vóór het begin van de collectie. |
| [data](./data/)() | Toegangsfunctie voor onderliggende datastructuur. |
| [data](./data/)() const | Toegangsfunctie voor onderliggende datastructuur. |
| [end](./end/)() | Haalt een iterator op voor een niet-bestaand element achter het einde van de collectie. |
| [end](./end/)() const | Haalt een iterator op voor een niet-bestaand element achter het einde van de const-gekwalificeerde collectie. |
| [Exists](./exists/)(System::Predicate\<T\>) | Controleert of een element dat voldoet aan een specifieke predicaat bestaat in de lijst. |
| [Find](./find/)(System::Predicate\<T\>) | Zoekt naar een element dat voldoet aan een specifieke predicaat. |
| [FindAll](./findall/)(System::Predicate\<T\>) | Zoekt naar elementen die voldoen aan een specifieke predicaat. |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | Zoekt naar een element dat voldoet aan een specifieke predicaat. |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | Zoekt naar een element dat voldoet aan een specifieke predicaat. |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | Zoekt naar een element dat voldoet aan een specifieke predicaat. |
| [FindLast](./findlast/)(System::Predicate\<T\>) | Zoekt naar het laatste element dat voldoet aan een specifieke predicaat. |
| [ForEach](./foreach/)(System::Action\<T\>) | Past actie toe op alle elementen in de lijst. |
| [get_Capacity](./get_capacity/)() const | Haalt de huidige capaciteit van de lijst op. |
| [get_Count](./get_count/)() const override | Haalt het aantal elementen in de huidige lijst op. |
| [GetEnumerator](./getenumerator/)() override | Haalt een enumerator op om door de lijst-elementen te itereren. |
| [GetRange](./getrange/)(int, int) | Maakt een deel van de lijst. |
| [idx_get](./idx_get/)(int) const override | Haalt het element op op een specifieke positie. |
| [idx_set](./idx_set/)(int, T) override | Stelt element in op een specifieke positie. |
| [IndexOf](./indexof/)(const T\&) const override | Haalt de eerste index van een specifiek item op. |
| [IndexOf](./indexof/)(const T\&, int) const | Zoekt naar een specifiek item in de lijst. |
| [Insert](./insert/)(int, const T\&) override | Voegt een item in op een opgegeven positie. |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | Voegt een gegevensbereik in op een specifieke positie. |
| [LastIndexOf](./lastindexof/)(const T\&) const | Zoekt naar het opgegeven object en retourneert de nulgebaseerde index van de laatste voorkomen binnen de volledige lijst. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | Zoekt naar het opgegeven object en retourneert de nulgebaseerde index van de laatste voorkomen binnen het bereik van elementen in de [List](./) dat zich uitstrekt van het eerste element tot de opgegeven index. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | Zoekt naar het opgegeven object en retourneert de nulgebaseerde index van de laatste voorkomen binnen het bereik van elementen in de [List](./) dat het opgegeven aantal elementen bevat en eindigt op de opgegeven index. |
| [List](./list/)() | Maakt een lege lijst. |
| [List](./list/)(int) | Maakt een lijst met een vooraf gedefinieerde capaciteit. |
| [List](./list/)(IEnumerablePtr) | Copy-constructor. |
| [operator[]](./operator[]/)(int) | Accessor-functie. |
| [operator[]](./operator[]/)(int) const | Accessor-functie. |
| [rbegin](./rbegin/)() | Haalt een reverse iterator op naar het laatste element van de collectie (eerste in omgekeerde volgorde). |
| [rbegin](./rbegin/)() const | Haalt een reverse iterator op naar het laatste element van de const‑gekwalificeerde collectie (eerste in omgekeerde volgorde). |
| [Remove](./remove/)(const T\&) override | Verwijdert de eerste instantie van een specifiek item uit de lijst. |
| [RemoveAll](./removeall/)(Predicate\<T\>) | Verwijdert alle elementen die voldoen aan een specifieke voorwaarde. |
| [RemoveAt](./removeat/)(int) override | Verwijdert item op de opgegeven positie. |
| [RemoveRange](./removerange/)(int, int) | Verwijdert een deel van de lijst. |
| [rend](./rend/)() | Haalt een reverse iterator op voor een niet‑bestaand element vóór het begin van de collectie. |
| [rend](./rend/)() const | Haalt een reverse iterator op voor een niet‑bestaand element vóór het begin van de const‑gekwalificeerde collectie. |
| [Reverse](./reverse/)() | Keert de volgorde van de elementen van de volledige lijst om. |
| [Reverse](./reverse/)(int, int) | Keert de volgorde van de elementen van het lijstdeel om. |
| [set_Capacity](./set_capacity/)(int) | Stelt de capaciteit van de lijst in. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Sorteert de elementen in de lijst. |
| [Sort](./sort/)() | Sorteert de elementen in de lijst met behulp van de standaard comparator. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | Sorteert de elementen in het lijstdeel. |
| [Sort](./sort/)(Comparison\<T\>, bool) | Sorteert de elementen in de lijst. |
| [ToArray](./toarray/)() const | Converteert lijst naar array. |
| [TrimExcess](./trimexcess/)() | Past de capaciteit van de lijst aan zodat deze past bij de grootte. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | Bepaalt of elk element in de collectie voldoet aan de voorwaarden die zijn gedefinieerd door het opgegeven predicaat. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) | Interface type. |
| [const_iterator](./const_iterator/) | Const-iterator type. |
| [const_reverse_iterator](./const_reverse_iterator/) | Const reverse-iterator type. |
| [IEnumerablePtr](./ienumerableptr/) | Container die elementen van hetzelfde type bevat die wij vasthouden. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) type. |
| [iterator](./iterator/) | Iterator type. |
| [reverse_iterator](./reverse_iterator/) | Reverse-iterator type. |
| [ValueType](./valuetype/) | Dit type. |
| [vector_t](./vector_t/) | RTTI-informatie. |
## Opmerkingen


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Maak de eerste lijst.
  auto list1 = MakeObject<List<int>>();

  // Vul de eerste lijst.
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // Sorteer de eerste lijst.
  // De items van de eerste lijst zullen zijn: {-5, 1, 3, 8}
  list1->Sort();

  // Verwijder het item op index 2.
  // De items van de eerste lijst zullen zijn: {-5, 1, 8}
  list1->RemoveAt(2);

  // Voeg het item in op index 1.
  // De items van de eerste lijst zullen zijn: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // Maak de tweede lijst.
  auto list2 = MakeObject<List<int>>();

  // Vul de tweede lijst.
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // Voeg elementen van de tweede lijst toe aan de eerste.
  list1->AddRange(list2);

  // Print de items van de eerste lijst.
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## Zie ook

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
