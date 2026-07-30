---
title: "System::Windows::Forms::Control::ControlCollection class"
linktitle: "ControlCollection"
second_title: "Aspose.Font für C++"
description: "System::Windows::Forms::Control::ControlCollection class. Sammlung von Steuerelementen. Nicht in C++ implementiert."
type: docs
weight: 200
url: /de/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


Sammlung von Steuerelementen. Nicht implementiert.

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | Fügt ein Steuerelement zur Sammlung hinzu. |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | Fügt mehrere Steuerelemente zur Sammlung hinzu. |
| [Clear](./clear/)() override | Löscht alle Steuerelemente aus der Sammlung. |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | Prüft, ob ein bestimmtes Steuerelement in der Sammlung vorhanden ist. |
| virtual [ContainsKey](./containskey/)(System::String) const | Überprüft, ob ein Steuerelement mit einem bestimmten Namen in der Sammlung vorhanden ist. |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | Konstruktor. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | Kopiert den Inhalt der Sammlung in vorhandene Array-Elemente. |
| [Find](./find/)(const System::String\&, bool) const | Sucht das benannte Steuerelement in der Sammlung. Optional werden die Sammlungen der enthaltenen Steuerelemente rekursiv geprüft. |
| [get_Count](./get_count/)() const override | Ermittelt die Anzahl der Steuerelemente in der Sammlung. |
| [get_Owner](./get_owner/)() const | Ermittelt das übergeordnete Steuerelement der Sammlung. |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | Sucht ein bestimmtes Steuerelement. |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | Sucht ein bestimmtes Steuerelement. |
| [GetEnumerator](./getenumerator/)() override | Liefert einen Enumerator, um durch die Sammlung zu iterieren. |
| [idx_get](./idx_get/)(int) const override | Zugriff per Index. |
| virtual [idx_get](./idx_get/)(System::String) const | Zugriff per Name. |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | Zugriff per Index. |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | Zugriff per Name. |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | Sucht ein Steuerelement in der Sammlung. |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | Sucht ein benanntes Steuerelement in der Sammlung. |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | Fügt ein Steuerelement in die Sammlung ein. |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | Entfernt ein Steuerelement aus der Sammlung. |
| [RemoveAt](./removeat/)(int) override | Entfernt ein Steuerelement aus der Sammlung. |
| virtual [RemoveByKey](./removebykey/)(System::String) | Entfernt ein Steuerelement aus der Sammlung. |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | Verschiebt ein Steuerelement an eine neue Position. |
## Siehe auch

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Font for C++](../../../)
