---
title: "System::Collections::BitArray::Enumerator klass"
linktitle: "Enumerator"
second_title: "Aspose.Page för C++"
description: "System::Collections::BitArray::Enumerator klass. Enumerator-typ för itereringsändamål i C++."
type: docs
weight: 2900
url: /sv/cpp/system.collections/bitarray/enumerator/
---
## Enumerator class


[Enumerator](./) type for iteration purposes.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<bool>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<BitArray\>\&) | Skapar enumerator. |
| [get_Current](./get_current/)() const override | Hämtar adresserad bit i boolesk form. |
| [MoveNext](./movenext/)() override | Flyttar till nästa bit. |
| [Reset](./reset/)() override | Återställer enumerator till positionen före det första elementet. |
## Se även

* Class [Object](../../../system/object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [BitArray](../)
* Namespace [System::Collections](../../)
* Library [Aspose.Page for C++](../../../)
