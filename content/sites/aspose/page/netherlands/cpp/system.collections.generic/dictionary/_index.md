---
title: "System::Collections::Generic::Dictionary klasse"
linktitle: "Dictionary"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::Dictionary klasse. Voorwaartse declaratie van de Dictionary-klasse in C++."
type: docs
weight: 1100
url: /nl/cpp/system.collections.generic/dictionary/
---
## Dictionary class


Voorwaartse declaratie van de [Dictionary](./) klasse.

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| Parameter | Beschrijving |
| --- | --- |
| TKey | Sleuteltype. |
| TValue | Waarde‑type. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Dictionary](./dictionary/)() | Maakt een leeg woordenboek. |
| [Dictionary](./dictionary/)(const map_t\&) | Kopieert gegevens van de map. |
| [Dictionary](./dictionary/)(int) | Overload die overeenkomt met het maken van een vooraf toegewezen woordenboek; doet eigenlijk geen toewijzing. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Copy-constructor. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Copy-constructor. |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Maakt een leeg woordenboek. |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Maakt een leeg woordenboek. |
| [GetEnumerator](./getenumerator/)() override | Maakt een enumerator‑object aan. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Pointer naar de enumerable interface. |
| [IEnumeratorPtr](./ienumeratorptr/) | Pointer naar enumerator. |
| [KeyCollection](./keycollection/) | RTTI-informatie. |
| [KVPair](./kvpair/) | Sleutel‑waarde‑paartype. |
| [map_t](./map_t/) | Onderliggend datatype. |
| [Ptr](./ptr/) | Pointertype. |
| [ValueCollection](./valuecollection/) | Collectie van waarden om te extraheren. |
## Opmerkingen


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Maak de Dictionary-klasse instantie aan.
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // Vul het woordenboek.
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // Print de items van het woordenboek.
  for (const auto &pair: dictionary)
  {
    std::cout << pair.get_Key() << " - " << pair.get_Value() << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
0 - Foo
1 - Bar
2 - Baz
*/
```

## Zie ook

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
