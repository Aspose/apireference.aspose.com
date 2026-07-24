---
title: "System::Collections::Generic::LinkedList klasse"
linktitle: "LinkedList"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::LinkedList klasse. LinkedList forward declaratie in C++."
type: docs
weight: 3100
url: /nl/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| Parameter | Beschrijving |
| --- | --- |
| T | Bevat waardetype. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const T\&) override | Voegt **element** toe aan het einde van de lijst. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Voegt **element** toe na **node** van de lijst. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Voegt **newNode** toe na **node** van de lijst. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Voegt **element** toe vóór **node** van de lijst. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Voegt **newNode** toe vóór **node** van de lijst. |
| [AddFirst](./addfirst/)(const T\&) | Voegt **element** toe aan het begin van de lijst. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Voegt **newNode** toe aan het begin van de lijst. |
| [AddLast](./addlast/)(const T\&) | Voegt **element** toe aan het einde van de lijst. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Voegt **newNode** toe aan het einde van de lijst. |
| [begin](./begin/)() | Haalt iterator op naar het eerste element van de collectie. |
| [begin](./begin/)() const | Haalt een iterator op naar het eerste element van de const-gekwalificeerde collectie. |
| [cbegin](./cbegin/)() const | Haalt een iterator op naar het eerste const-gekwalificeerde element van de collectie. |
| [cend](./cend/)() const | Haalt een iterator op voor een niet-bestaand const-gekwalificeerd element achter het einde van de collectie. |
| [Clear](./clear/)() override | Verwijdert alle elementen in de lijst. |
| [Contains](./contains/)(const T\&) const override | Controleert of **element** aanwezig is in de lijst. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Kopieert containergegevens naar bestaande array-elementen. |
| [crbegin](./crbegin/)() const | Haalt een reverse‑iterator op naar het laatste const‑gekwalificeerde element van de collectie (eerste in reverse). |
| [crend](./crend/)() const | Haalt een reverse‑iterator op voor een niet‑bestaand const‑gekwalificeerd element vóór het begin van de collectie. |
| [end](./end/)() | Haalt een iterator op voor een niet-bestaand element achter het einde van de collectie. |
| [end](./end/)() const | Haalt een iterator op voor een niet-bestaand element achter het einde van de const-gekwalificeerde collectie. |
| [Find](./find/)(const T\&) const | Zoekt een **element** in de lijst in voorwaartse richting. |
| [FindLast](./findlast/)(const T\&) const | Zoekt een **element** in de lijst in omgekeerde richting. |
| [get_Count](./get_count/)() const override | Haalt het aantal elementen in de lijst op. |
| [get_First](./get_first/)() const | Haalt pointer naar het eerste element in de lijst op. |
| [get_Last](./get_last/)() const | Haalt pointer naar het laatste element in de lijst op. |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op om door de huidige [LinkedList](./) te itereren. |
| [LinkedList](./linkedlist/)() | Maakt een lege [LinkedList](./) aan. |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Copy-constructor. |
| [rbegin](./rbegin/)() | Haalt een reverse iterator op naar het laatste element van de collectie (eerste in omgekeerde volgorde). |
| [rbegin](./rbegin/)() const | Haalt een reverse iterator op naar het laatste element van de const‑gekwalificeerde collectie (eerste in omgekeerde volgorde). |
| [Remove](./remove/)(const T\&) override | Verwijdert de eerste verschijning van het opgegeven **element** uit de lijst. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Verwijdert node uit de lijst. |
| [RemoveFirst](./removefirst/)() | Verwijdert het eerste knooppunt uit de lijst. |
| [RemoveLast](./removelast/)() | Verwijdert het laatste knooppunt uit de lijst. |
| [rend](./rend/)() | Haalt een reverse iterator op voor een niet‑bestaand element vóór het begin van de collectie. |
| [rend](./rend/)() const | Haalt een reverse iterator op voor een niet‑bestaand element vóór het begin van de const‑gekwalificeerde collectie. |
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
| [list_t](./list_t/) | Onderliggend datatype. |
| [reverse_iterator](./reverse_iterator/) | Reverse-iterator type. |
## Opmerkingen


Linked‑list container. Implementeert een wrapper rond std::list. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Maak een instantie van de LinkedList‑klasse.
  auto list = MakeObject<LinkedList<int>>();

  // Vul de linked list.
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // Print de items van de linked list.
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## Zie ook

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
