---
title: "System::Collections::Generic::BaseSet-klasse"
linktitle: "BaseSet"
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de System::Collections::Generic::BaseSet-klasse in C++."
type: docs
weight: 800
url: /nl/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++ specifiek. |
| [Add](./add/)(const T\&) override | Voegt een element toe aan de set. |
| [begin](./begin/)() const | Haalt een iterator op naar het eerste element van de const-gekwalificeerde collectie. |
| [cbegin](./cbegin/)() const | Haalt een iterator op naar het eerste const-gekwalificeerde element van de collectie. |
| [cend](./cend/)() const | Haalt een iterator op voor een niet-bestaand const-gekwalificeerd element achter het einde van de collectie. |
| [Clear](./clear/)() override | Verwijdert alle elementen in de set. |
| [Contains](./contains/)(const T\&) const override | Controleert of een element aanwezig is in de set. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Kopieert hash-inhoud naar bestaande array‑elementen. |
| [data](./data/)() | Toegang tot onderliggende datastructuur. |
| [data](./data/)() const | Toegang tot onderliggende datastructuur. |
| [end](./end/)() const | Haalt een iterator op voor een niet-bestaand element achter het einde van de const-gekwalificeerde collectie. |
| [get_Count](./get_count/)() const override | Haalt het aantal elementen in de set op. |
| [GetEnumerator](./getenumerator/)() override | Maakt enumerator aan. |
| [Remove](./remove/)(const T\&) override | Verwijdert een element uit de set. |
| [TryAdd](./tryadd/)(const T\&) | Voegt een element toe aan de set. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [BaseType](./basetype/) | Geïmplementeerde interface. |
| [const_iterator](./const_iterator/) | Const-iterator type. |
| [IEnumerablePtr](./ienumerableptr/) | Doorzoekbare interface‑pointer. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) pointer. |
| [iterator](./iterator/) | Iterator type. |
| [set_t](./set_t/) | Onderliggend datatype. |
| [ThisPtr](./thisptr/) | Pointertype. |
| [ThisType](./thistype/) | Zelftype. |
| [ValueType](./valuetype/) | Waarde‑type. |
## Zie ook

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
