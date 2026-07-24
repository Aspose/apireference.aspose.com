---
title: "System::Collections::Specialized::NameValueCollection Klasse"
linktitle: "NameValueCollection"
second_title: "Aspose.Page für C++"
description: "System::Collections::Specialized::NameValueCollection Klasse. Sammlung zugehöriger String‑Schlüssel und String‑Werte, die entweder über den Schlüssel oder über den Index in C++ zugänglich sind."
type: docs
weight: 200
url: /de/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


Sammlung zugehöriger [String](../../system/string/) Schlüssel und [String](../../system/string/) Werte, die entweder über den Schlüssel oder über den Index zugänglich sind.

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const String\&) override | Überschreibe [ICollection](../../system.collections/icollection/) Methode – nicht implementiert. |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | Kopiert die Einträge der angegebenen [NameValueCollection](./) in die aktuelle. |
| virtual [Add](./add/)(const String\&, const String\&) | Fügt einen Eintrag mit dem angegebenen Namen und Wert hinzu. |
| [Clear](./clear/)() override | Löscht alle Elemente. |
| [Contains](./contains/)(const String\&) const override | Prüft, ob das Element in der Sammlung vorhanden ist. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | Kopiert Sammlungs‑Elemente in vorhandene Array‑Elemente. |
| virtual [Get](./get/)(const String\&) | Liefert die mit dem angegebenen Schlüssel verknüpften Werte. |
| virtual [get_AllKeys](./get_allkeys/)() | Gibt alle Schlüssel zurück. |
| [get_Count](./get_count/)() const override | Gibt die Anzahl der Schlüssel/Wert-Paare zurück. |
| virtual [get_Keys](./get_keys/)() | Gibt alle Schlüssel zurück. |
| [GetEnumerator](./getenumerator/)() override | Gibt einen Enumerator zurück, um durch die Sammlung zu iterieren. |
| virtual [GetValues](./getvalues/)(const String\&) | Liefert die mit dem angegebenen Schlüssel verknüpften Werte. |
| [HasKeys](./haskeys/)() | Gibt einen Wert zurück, der angibt, ob die [NameValueCollection](./) Schlüssel enthält, die nicht null sind. |
| [idx_get](./idx_get/)(const String\&) | Gibt den Wert am angegebenen Index zurück. |
| [idx_set](./idx_set/)(const String\&, const String\&) | Setzt den Wert eines Eintrags. |
| [NameValueCollection](./namevaluecollection/)() | Initialisiert eine neue Instanz der leeren [NameValueCollection](./)-Klasse. |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | Kopiert die Einträge der angegebenen [NameValueCollection](./) in eine neue [NameValueCollection](./). |
| [Remove](./remove/)(const String\&) override | Entfernt ein bestimmtes Element. |
| virtual [Set](./set/)(const String\&, const String\&) | Setzt den Wert eines Eintrags. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Gibt die Implementierung des const begin-Iterators für den aktuellen Container zurück. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Gibt die Implementierung des begin-Iterators für den aktuellen Container zurück. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Gibt die Implementierung des const end-Iterators für den aktuellen Container zurück. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Gibt die Implementierung des end-Iterators für den aktuellen Container zurück. |
## Siehe auch

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
