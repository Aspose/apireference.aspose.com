---
title: "System::Xml::Schema::ValidationEventArgs Klasse"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::ValidationEventArgs Klasse. Gibt detaillierte Informationen zurück, die sich auf den ValidationEventHandler in C++ beziehen."
type: docs
weight: 200
url: /de/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


Gibt detaillierte Informationen zurück, die sich auf den [ValidationEventHandler](../validationeventhandler/) beziehen.

```cpp
class ValidationEventArgs : public System::EventArgs
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Exception](./get_exception/)() | Gibt die mit dem Validierungsereignis verbundene [XmlSchemaException](../xmlschemaexception/) zurück. |
| [get_Message](./get_message/)() | Gibt die Textbeschreibung zurück, die dem Validierungsereignis entspricht. |
| [get_Severity](./get_severity/)() | Gibt die Schwere des Validierungsereignisses zurück. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Ein statisches Mitglied, das einen "leeren" [EventArgs](../../system/eventargs/) Shared Pointer (Nullzeiger) darstellt. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
