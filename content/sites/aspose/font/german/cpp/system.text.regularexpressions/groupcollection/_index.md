---
title: "System::Text::RegularExpressions::GroupCollection Klasse"
linktitle: "GroupCollection"
second_title: "Aspose.Font für C++"
description: "System::Text::RegularExpressions::GroupCollection Klasse. Liste von Capture‑Gruppen in einer einzelnen Übereinstimmung. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Liste der Erfassungsgruppen in einem einzelnen Treffer. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Deaktiviert das Hinzufügen von Elementen zur Sammlung. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Fügt eine Gruppe zur Sammlung hinzu. |
| [Clear](./clear/)() override | Deaktiviert das Entfernen von Elementen aus der Sammlung. |
| [get_Item](./get_item/)(int) const | [Group](../group/) Zugriffsmethode. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) Zugriffsmethode. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Konstruktor. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) Zugriffsmethode. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) Zugriffsmethode. |
| [IsReadOnly](./isreadonly/)() const | Markiert die Sammlung als schreibgeschützt. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) Zugriffsmethode. |
| [operator[]](./operator[]/)(int) | [Group](../group/) Zugriffsmethode. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) Zugriffsmethode. |
| [Remove](./remove/)(const GroupPtr\&) override | Deaktiviert das Entfernen von Elementen aus der Sammlung. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Base](./base/) | [Base](./base/) Klasse. |
## Siehe auch

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
