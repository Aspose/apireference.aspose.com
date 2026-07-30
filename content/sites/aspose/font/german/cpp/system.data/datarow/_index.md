---
title: "System::Data::DataRow Klasse"
linktitle: "DataRow"
second_title: "Aspose.Font für C++"
description: "System::Data::DataRow Klasse. Zeile im Datensatz. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn an Funktionen in C++ als Argument zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.data/datarow/
---
## DataRow class


Zeile im Datensatz. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class DataRow : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Table](./get_table/)() | Ermittelt die Tabelle, zu der die Zeile gehört. |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | Ermittelt Zeilen, die über die angegebene Beziehung als Kind betrachtet werden. |
| [idx_get](./idx_get/)(const int32_t) | RTTI-Informationen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
