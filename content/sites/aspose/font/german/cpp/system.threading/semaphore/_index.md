---
title: "System::Threading::Semaphore-Klasse"
linktitle: "Semaphor"
second_title: "Aspose.Font für C++"
description: "System::Threading::Semaphore-Klasse. Semaphore‑Implementierung. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Release](./release/)() | Gibt die Sperre des Semaphors frei. |
| [Release](./release/)(int) | Gibt mehrere Sperren des Semaphors frei. |
| virtual [Reset](./reset/)() | Setzt den Semaphor in den nicht‑signalierten Zustand. Nicht unterstützt. |
| [Semaphore](./semaphore/)(int, int) | RTTI-Informationen. |
| [Semaphore](./semaphore/)(int, int, const String\&) | Erstellt einen benannten Semaphor. |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | Erstellt einen benannten Semaphor. |
| virtual [Set](./set/)() | Setzt den Semaphor in den signalisierten Zustand. Nicht unterstützt. |
| [WaitOne](./waitone/)() override | Sperrt den Semaphor. Führt bei Bedarf unbegrenztes Warten aus. |
| [WaitOne](./waitone/)(int) override | Sperrt den Semaphor. Führt bei Bedarf Warten aus. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Spezialwert, der von der Funktion zurückgegeben wird, andernfalls wird der Index des signalisierten Objekts im Array zurückgegeben, wenn das Zeitlimit überschritten wird und nichts signalisiert. |
## Siehe auch

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
