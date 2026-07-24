---
title: "System::Collections::Generic::_KeyCollection Klasse"
linktitle: "_KeyCollection"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::_KeyCollection Klasse. Sammlung der Schlüssel des Dictionary. Verweist auf die Sammlung, kopiert nichts. Objekte dieser Klasse sollten nur über die System::MakeObject()‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


Sammlung der Schlüssel des [Dictionary](../dictionary/). Verweist auf die Sammlung, kopiert nichts. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | Initialisiert die Sammlung, die auf das angegebene Wörterbuch verweist. |
| [Contains](./contains/)(const TKey\&) const override | Prüft, ob das Element im Container vorhanden ist. |
| [GetEnumerator](./getenumerator/)() override | Liefert den Enumerator, der über die Schlüssel iteriert. |
| [idx_get](./idx_get/)(int) const override | Implementiert die [IList](../ilist/)‑Methode. Nicht unterstützt. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Gibt die Implementierung des const begin-Iterators für den aktuellen Container zurück. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Gibt die Implementierung des begin-Iterators für den aktuellen Container zurück. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Gibt die Implementierung des const end-Iterators für den aktuellen Container zurück. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Gibt die Implementierung des end-Iterators für den aktuellen Container zurück. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [TKey](./tkey/) | Schlüsseltyp. |

## Siehe auch

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
