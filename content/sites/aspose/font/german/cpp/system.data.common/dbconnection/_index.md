---
title: "System::Data::Common::DbConnection Klasse"
linktitle: "DbConnection"
second_title: "Aspose.Font für C++"
description: "System::Data::Common::DbConnection Klasse. Datenbankverbindung. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.data.common/dbconnection/
---
## DbConnection class


Datenbankverbindung. Objekte dieser Klasse sollten ausschließlich mit der [System::MakeObject()](../../system/makeobject/)-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DbConnection : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | RTTI-Informationen. |
| virtual [Open](./open/)() | Öffnet die Verbindung zur Datenbank. |
| virtual [set_ConnectionString](./set_connectionstring/)(String) const | Setzt Verbindungsinformationen (z. B. Server und Port). |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
