---
title: "System::Threading::WaitHandle Klasse"
linktitle: "WaitHandle"
second_title: "Aspose.Font für C++"
description: "System::Threading::WaitHandle Klasse. Basis­klasse für Warte‑Primitive. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1700
url: /de/cpp/system.threading/waithandle/
---
## WaitHandle class


Warte‑Primitive Basis­klasse. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class WaitHandle : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Close](./close/)() | Gibt jede mit dem Handle verbundene Ressource frei. |
| [get_Handle](./get_handle/)() | Ermittelt das Handle. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | RTTI-Informationen. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Wartet, bis alle Handles ausgelöst werden. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Wartet, bis alle Handles ausgelöst werden. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Wartet, bis einer der Handles ausgelöst wird. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Wartet, bis einer der Handles ausgelöst wird. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Wartet, bis einer der Handles ausgelöst wird. |
| virtual [WaitOne](./waitone/)() | Wartet unbegrenzt, bis das Handle ausgelöst wird. |
| virtual [WaitOne](./waitone/)(int) | Wartet, bis das Handle ausgelöst wird. |
| virtual [WaitOne](./waitone/)(TimeSpan) | Wartet, bis das Handle ausgelöst wird. |
| virtual [WaitOne](./waitone/)(int, bool) | Wartet, bis das Handle ausgelöst wird. |
| virtual [~WaitHandle](./~waithandle/)() | Destruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | Spezialwert, der von der Funktion zurückgegeben wird, andernfalls wird der Index des signalisierten Objekts im Array zurückgegeben, wenn das Zeitlimit überschritten wird und nichts signalisiert. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
