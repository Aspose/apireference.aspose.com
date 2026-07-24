---
title: "System::Collections::Generic::_ValueList Klasse"
linktitle: "_ValueList"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::_ValueList Klasse. Implementiert eine Liste von Werten eines Wörterbuchs. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstelle niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickele diese Klasse immer in einen System::SmartPtr‑Zeiger und verwende diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


Implementiert eine Liste von Werten eines Wörterbuchs. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstelle niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickele diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger und verwende diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

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
| virtual [idx_get](./idx_get/)(int) const | Ermittelt den Wert an der angegebenen Position. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [TValue](./tvalue/) | Werttyp. |

## Siehe auch

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
