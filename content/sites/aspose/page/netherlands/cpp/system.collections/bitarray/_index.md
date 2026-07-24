---
title: "System::Collections::BitArray klasse"
linktitle: "BitArray"
second_title: "Aspose.Page voor C++"
description: "System::Collections::BitArray klasse. Array van bits die via een index benaderd kan worden. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om het als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.collections/bitarray/
---
## BitArray class


[Array](../../system/array/) of bits which can be addressed by index. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class BitArray : public virtual System::Object,
                 public System::Collections::Generic::ICollection<bool>
```

## Nested classes

* Class [Enumerator](./enumerator/)
* Class [Reference](./reference/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const bool\&) override | Voegt een waarde toe aan het einde van de container. |
| [And](./and/)(const BitArrayPtr\&) | Berekent bitwise 'and' tussen twee BitSets. |
| [BitArray](./bitarray/)(const bitset\&) | Copy-constructor. |
| [BitArray](./bitarray/)(const BitArray\&) | Copy-constructor. |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | Copy-constructor. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | Copy-constructor. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | Copy-constructor. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | Copy-constructor. |
| [BitArray](./bitarray/)(int, bool) | Vulconstructor. |
| [Clear](./clear/)() override | Verwijdert alle elementen. |
| [Contains](./contains/)(const bool\&) const override | Controleert of een specifieke waarde aanwezig is in de container. Niet geïmplementeerd. |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | Kopieert gegevens naar bestaande array‑elementen. |
| [data](./data/)() | Toegang tot onderliggende datastructuur. |
| [data](./data/)() const | Toegang tot onderliggende datastructuur. |
| [Get](./get/)(int) const | Haalt [BitArray](./) element op. |
| [get_Count](./get_count/)() const override | Haalt de grootte van de container op. |
| [get_Length](./get_length/)() const | Haalt de grootte van de container op. |
| [GetEnumerator](./getenumerator/)() override | Maakt een enumerator‑object aan. |
| [idx_get](./idx_get/)(int) const | Getter‑functie. |
| [idx_set](./idx_set/)(int, bool) | Setter‑functie. |
| [Not](./not/)() | Negateert BitSet. |
| [operator!=](./operator!=/)(const BitArray\&) const | Bitwise vergelijkingsoperator. |
| [operator==](./operator==/)(const BitArray\&) const | Bitwise vergelijkingsoperator. |
| [operator[]](./operator[]/)(int) | Accessor-functie. |
| [Or](./or/)(const BitArrayPtr\&) | Berekent bitwise 'or' tussen twee BitSets. |
| [Remove](./remove/)(const bool\&) override | Retourneert de eerste voorkomen van de opgegeven waarde. Niet geïmplementeerd. |
| [Set](./set/)(int, bool) | Stelt [BitArray](./) element in. |
| [SetAll](./setall/)(bool) | Stelt alle elementen in op een specifieke waarde. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Formele implementatie van het zwakke sjabloon‑argumentenmechanisme; niet toepasbaar op deze klasse. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
| [Xor](./xor/)(const BitArrayPtr\&) | Berekent bitwise 'xor' tussen twee BitSets. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [bitset](./bitset/) | RTTI-informatie. |
## Opmerkingen



```cpp
#include <system/collections/bitarray.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void Print(const System::SmartPtr<System::Collections::Generic::IEnumerable<bool>> &bitArray)
{
  for (const auto item: bitArray)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Construeert een nieuw exemplaar van de BitArray‑klasse.
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // Print waarden.
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## Zie ook

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
