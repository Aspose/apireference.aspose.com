---
title: "System::Security::Cryptography::Oid class"
linktitle: "Oid"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::Oid Klasse. Kryptografischer Objektbezeichner. Objekte dieser Klasse sollten nur mit der System::MakeObject() Funktion zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Umwickeln Sie diese Klasse immer mit einem System::SmartPtr Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2500
url: /de/cpp/system.security.cryptography/oid/
---
## Oid class


Kryptografischer Objektbezeichner. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/) Funktion zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Umwickeln Sie diese Klasse immer mit einem [System::SmartPtr](../../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Oid : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | Erstellen Sie ein OID-Objekt aus dem angegebenen benutzerfreundlichen OID-Namen. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | Erstellen Sie ein OID-Objekt aus dem angegebenen OID-Wert. |
| [get_FriendlyName](./get_friendlyname/)() const | Liefert den benutzerfreundlichen Namen des Objekts. |
| [get_Value](./get_value/)() const | Liefert die Objektbezeichnerzeichenkette. |
| [Oid](./oid/)() | RTTI-Informationen. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | Kopierkonstruktor. |
| [Oid](./oid/)(const String\&) | Konstruktor. |
| [Oid](./oid/)(const String\&, const String\&) | Konstruktor. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Setzt den benutzerfreundlichen Namen des Objekts. |
| [set_Value](./set_value/)(const String\&) | Setzt die Objektbezeichnerzeichenkette. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
