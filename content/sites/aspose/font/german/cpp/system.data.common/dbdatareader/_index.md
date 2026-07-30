---
title: "System::Data::Common::DbDataReader Klasse"
linktitle: "DbDataReader"
second_title: "Aspose.Font für C++"
description: "System::Data::Common::DbDataReader Klasse. API zum Empfangen von Daten aus der Datenbank. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


API zum Empfangen von Daten aus der Datenbank. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DbDataReader : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Close](./close/)() | Schließt den Datenabruf‑Kanal. |
| virtual [idx_get](./idx_get/)(String) | Liefert das benannte Element. |
| virtual [idx_get](./idx_get/)(int) | Liefert das Element nach Index. |
| virtual [Read](./read/)() | Liest den nächsten Datensatz aus der Datenbank. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | RTTI-Informationen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
