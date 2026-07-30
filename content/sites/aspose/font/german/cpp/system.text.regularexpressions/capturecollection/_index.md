---
title: "System::Text::RegularExpressions::CaptureCollection Klasse"
linktitle: "CaptureCollection"
second_title: "Aspose.Font für C++"
description: "System::Text::RegularExpressions::CaptureCollection Klasse. Liste der von einer einzelnen Erfassungsgruppe durchgeführten Erfassungen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.text.regularexpressions/capturecollection/
---
## CaptureCollection class


Liste der von einer einzelnen Erfassungsgruppe durchgeführten Erfassungen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class CaptureCollection : public System::Collections::Generic::List<CapturePtr>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const CapturePtr\&) override | Deaktiviert das Ändern der Sammlung. |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Dienstmethode zum Hinzufügen einer Erfassung zur Sammlung. |
| [Clear](./clear/)() override | Deaktiviert das Bereinigen der Sammlung. |
| [get_Count](./get_count/)() const override | Gibt die Anzahl der Erfassungen zurück. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Markiert die Sammlung als schreibgeschützt. |
| [get_IsSynchronized](./get_issynchronized/)() const | Markiert die Sammlung als nicht synchronisiert. |
| [idx_get](./idx_get/)(int) const override | [Capture](../capture/) Zugriff. |
| [operator[]](./operator[]/)(int) | [Capture](../capture/) Zugriff. |
| [operator[]](./operator[]/)(int) const | [Capture](../capture/) Zugriff. |
| [Remove](./remove/)(const CapturePtr\&) override | Deaktiviert das Ändern der Sammlung. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Base](./base/) | [Base](./base/) Typ. |
## Siehe auch

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
