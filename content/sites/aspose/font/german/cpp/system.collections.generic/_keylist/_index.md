---
title: "System::Collections::Generic::_KeyList Klasse"
linktitle: "_KeyList"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::_KeyList Klasse. Implementiert eine Liste der Schlüssel eines Wörterbuchs. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.collections.generic/_keylist/
---
## _KeyList class


Implementiert eine Liste der Schlüssel eines Wörterbuchs. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| Parameter | Beschreibung |
| --- | --- |
| Dict | [Dictionary](../dictionary/) Typ. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | Initialisiert die Sammlung, die auf das angegebene Wörterbuch verweist. |
| [Contains](./contains/)(const TKey\&) const override | Überprüft, ob der angegebene Schlüssel in der Sammlung vorhanden ist. |
| [idx_get](./idx_get/)(int) const override | Liefert den Schlüssel an der angegebenen Position. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [TKey](./tkey/) | Schlüsseltyp. |

## Siehe auch

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
