---
title: "System::Data::IDataRecord Klasse"
linktitle: "IDataRecord"
second_title: "Aspose.Font für C++"
description: "System::Data::IDataRecord Klasse. Schnittstelle zu einem Datensatz mit Spalten. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1300
url: /de/cpp/system.data/idatarecord/
---
## IDataRecord class


Schnittstelle zu einem Datensatz mit Spalten. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class IDataRecord : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | RTTI-Informationen. |
| virtual [GetName](./getname/)(const int32_t) | Liefert den Namen des Feldes an der angegebenen Position. |
| virtual [idx_get](./idx_get/)(const int32_t) | Liefert den Wert am angegebenen Index. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
