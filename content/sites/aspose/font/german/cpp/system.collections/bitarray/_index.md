---
title: "System::Collections::BitArray Klasse"
linktitle: "BitArray"
second_title: "Aspose.Font für C++"
description: "System::Collections::BitArray Klasse. Array von Bits, das über den Index adressiert werden kann. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.collections/bitarray/
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

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const bool\&) override | Fügt dem Container am Ende einen Wert hinzu. |
| [And](./and/)(const BitArrayPtr\&) | Berechnet das bitweise 'und' zwischen zwei BitSets. |
| [BitArray](./bitarray/)(const bitset\&) | Kopierkonstruktor. |
| [BitArray](./bitarray/)(const BitArray\&) | Kopierkonstruktor. |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | Kopierkonstruktor. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | Kopierkonstruktor. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | Kopierkonstruktor. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | Kopierkonstruktor. |
| [BitArray](./bitarray/)(int, bool) | Füllkonstruktor. |
| [Clear](./clear/)() override | Löscht alle Elemente. |
| [Contains](./contains/)(const bool\&) const override | Prüft, ob ein bestimmter Wert im Container vorhanden ist. Nicht implementiert. |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | Kopiert Daten in vorhandene Array-Elemente. |
| [data](./data/)() | Zugriff auf die zugrunde liegende Datenstruktur. |
| [data](./data/)() const | Zugriff auf die zugrunde liegende Datenstruktur. |
| [Get](./get/)(int) const | Liest das [BitArray](./)-Element. |
| [get_Count](./get_count/)() const override | Liest die Containergröße. |
| [get_Length](./get_length/)() const | Liest die Containergröße. |
| [GetEnumerator](./getenumerator/)() override | Erstellt ein Enumerator-Objekt. |
| [idx_get](./idx_get/)(int) const | Getter-Funktion. |
| [idx_set](./idx_set/)(int, bool) | Setter-Funktion. |
| [Not](./not/)() | Negiert BitSet. |
| [operator!=](./operator!=/)(const BitArray\&) const | Bitweiser Vergleichsoperator. |
| [operator==](./operator==/)(const BitArray\&) const | Bitweiser Vergleichsoperator. |
| [operator[]](./operator[]/)(int) | Accessor‑Funktion. |
| [Or](./or/)(const BitArrayPtr\&) | Berechnet das bitweise 'oder' zwischen zwei BitSets. |
| [Remove](./remove/)(const bool\&) override | Gibt das erste Vorkommen des angegebenen Wertes zurück. Nicht implementiert. |
| [Set](./set/)(int, bool) | Setzt das [BitArray](./)-Element. |
| [SetAll](./setall/)(bool) | Setzt alle Elemente auf einen bestimmten Wert. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Formale Implementierung des schwachen Template-Argument-Mechanismus; nicht anwendbar auf diese Klasse. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
| [Xor](./xor/)(const BitArrayPtr\&) | Berechnet das bitweise 'xor' zwischen zwei BitSets. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [bitset](./bitset/) | RTTI-Informationen. |
## Hinweise



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
  // Konstruiert eine neue Instanz der BitArray class.
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // Werte ausgeben.
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## Siehe auch

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
