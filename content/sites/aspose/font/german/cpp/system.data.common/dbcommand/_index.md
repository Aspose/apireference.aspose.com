---
title: "System::Data::Common::DbCommand Klasse"
linktitle: "DbCommand"
second_title: "Aspose.Font für C++"
description: "System::Data::Common::DbCommand Klasse. Datenbankbefehl. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.data.common/dbcommand/
---
## DbCommand class


Datenbankbefehl. Objekte dieser Klasse sollten ausschließlich mit der [System::MakeObject()](../../system/makeobject/)-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DbCommand : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | Führt einen Nicht‑Abfrage‑Befehl aus. |
| virtual [ExecuteReader](./executereader/)() | Führt einen Abfrage‑Befehl aus. |
| virtual [get_CommandText](./get_commandtext/)() const | RTTI-Informationen. |
| virtual [get_Connection](./get_connection/)() const | Liefert die mit dem Befehl verbundene Datenbankverbindung. |
| virtual [set_CommandText](./set_commandtext/)(String) const | Setzt den DB‑Befehlstext. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | Liefert die mit dem Befehl verbundene Datenbankverbindung. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
