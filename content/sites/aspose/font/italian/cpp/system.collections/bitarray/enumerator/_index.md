---
title: "System::Collections::BitArray::Enumerator classe"
linktitle: "Enumerator"
second_title: "Aspose.Font per C++"
description: "System::Collections::BitArray::Enumerator classe. Tipo enumeratore per scopi di iterazione in C++."
type: docs
weight: 2900
url: /it/cpp/system.collections/bitarray/enumerator/
---
## Enumerator class


[Enumerator](./) type for iteration purposes.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<bool>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<BitArray\>\&) | Crea enumeratore. |
| [get_Current](./get_current/)() const override | Ottiene il bit indicizzato in forma booleana. |
| [MoveNext](./movenext/)() override | Passa al bit successivo. |
| [Reset](./reset/)() override | Reimposta l'enumeratore alla posizione precedente al primo elemento. |
## Vedi anche

* Class [Object](../../../system/object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [BitArray](../)
* Namespace [System::Collections](../../)
* Library [Aspose.Font for C++](../../../)
