---
title: "System::Collections::Generic::_ValueList Klasse"
linktitle: "_ValueList"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::_ValueList Klasse. Implementiert eine Liste der Werte eines Wörterbuchs. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mittels operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


Implementiert eine Liste der Werte eines Wörterbuchs. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mittels operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| Parameter | Beschreibung |
| --- | --- |
| Dict | [Dictionary](../dictionary/) Typ. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | Initialisiert die Sammlung, die auf das angegebene Wörterbuch verweist. |
| virtual [idx_get](./idx_get/)(int) const | Erhält den Wert an der angegebenen Position. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [TValue](./tvalue/) | Werttyp. |

## Siehe auch

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
