---
title: "System::Collections::BitArray::Enumerator class"
linktitle: "Enumerator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::BitArray::Enumerator class. Enumeratortype voor iteratiedoeleinden in C++."
type: docs
weight: 2900
url: /nl/cpp/system.collections/bitarray/enumerator/
---
## Enumerator class


[Enumerator](./) type for iteration purposes.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<bool>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<BitArray\>\&) | Maakt enumerator aan. |
| [get_Current](./get_current/)() const override | Haalt het aangewezen bit op in booleaanse vorm. |
| [MoveNext](./movenext/)() override | Gaat naar het volgende bit. |
| [Reset](./reset/)() override | Reset de enumerator naar de positie vóór het eerste element. |
## Zie ook

* Class [Object](../../../system/object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [BitArray](../)
* Namespace [System::Collections](../../)
* Library [Aspose.Page for C++](../../../)
