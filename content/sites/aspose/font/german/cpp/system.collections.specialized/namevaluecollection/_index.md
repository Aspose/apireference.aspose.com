---
title: "System::Collections::Specialized::NameValueCollection class"
linktitle: "NameValueCollection"
second_title: "Aspose.Font für C++"
description: "System::Collections::Specialized::NameValueCollection class. Sammlung von zugehörigen String-Schlüsseln und String-Werten, die entweder über den Schlüssel oder über den Index in C++ zugänglich sind."
type: docs
weight: 200
url: /de/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


Sammlung von zugehörigen [String](../../system/string/) Schlüsseln und [String](../../system/string/) Werten, die entweder über den Schlüssel oder über den Index zugänglich sind.

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const String\&) override | Überschreibe [ICollection](../../system.collections/icollection/) Methode - nicht implementiert. |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | Kopiert die Einträge der angegebenen [NameValueCollection](./) in die aktuelle. |
| virtual [Add](./add/)(const String\&, const String\&) | Fügt einen Eintrag mit dem angegebenen Namen und Wert hinzu. |
| [Clear](./clear/)() override | Löscht alle Elemente. |
| [Contains](./contains/)(const String\&) const override | Prüft, ob das Element in der Sammlung vorhanden ist. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | Kopiert Sammlungs-Elemente in bestehende Array-Elemente. |
| virtual [Get](./get/)(const String\&) | Gibt die mit dem angegebenen Schlüssel verknüpften Werte zurück. |
| virtual [get_AllKeys](./get_allkeys/)() | Liefert alle Schlüssel. |
| [get_Count](./get_count/)() const override | Liefert die Anzahl der Schlüssel/Wert-Paare. |
| virtual [get_Keys](./get_keys/)() | Liefert alle Schlüssel. |
| [GetEnumerator](./getenumerator/)() override | Liefert einen Enumerator, um durch die Sammlung zu iterieren. |
| virtual [GetValues](./getvalues/)(const String\&) | Gibt die mit dem angegebenen Schlüssel verknüpften Werte zurück. |
| [HasKeys](./haskeys/)() | Liefert einen Wert, der angibt, ob die [NameValueCollection](./) Schlüssel enthält, die nicht null sind. |
| [idx_get](./idx_get/)(const String\&) | Liefert den Wert am angegebenen Index. |
| [idx_set](./idx_set/)(const String\&, const String\&) | Setzt den Wert eines Eintrags. |
| [NameValueCollection](./namevaluecollection/)() | Initialisiert eine neue Instanz der Klasse [NameValueCollection](./), die leer ist. |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | Kopiert die Einträge der angegebenen [NameValueCollection](./) in eine neue [NameValueCollection](./). |
| [Remove](./remove/)(const String\&) override | Entfernt ein bestimmtes Element. |
| virtual [Set](./set/)(const String\&, const String\&) | Setzt den Wert eines Eintrags. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Siehe auch

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)
