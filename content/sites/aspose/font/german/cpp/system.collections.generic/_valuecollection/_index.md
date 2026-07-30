---
title: "System::Collections::Generic::_ValueCollection Klasse"
linktitle: "_ValueCollection"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::_ValueCollection Klasse. Sammlung der Werte eines Dictionary. Referenziert die Sammlung, kopiert nichts. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


Sammlung der Werte von [Dictionary](../dictionary/). Referenziert die Sammlung, kopiert nichts. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | Initialisiert die Sammlung, die auf das angegebene Wörterbuch verweist. |
| [Contains](./contains/)(const TValue\&) const override | Überprüft, ob das Element im Container vorhanden ist. |
| [GetEnumerator](./getenumerator/)() override | Liefert einen Enumerator, der durch die Werte iteriert. |
| [idx_get](./idx_get/)(int) const override | Implementiert die Methode [IList](../ilist/). Nicht unterstützt. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [TValue](./tvalue/) | Werttyp. |

## Siehe auch

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
