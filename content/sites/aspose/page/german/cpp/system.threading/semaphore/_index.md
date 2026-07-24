---
title: "System::Threading::Semaphore Klasse"
linktitle: "Semaphore"
second_title: "Aspose.Page für C++"
description: "System::Threading::Semaphore Klasse. Semaphore-Implementierung. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
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
| virtual [Reset](./reset/)() | Setzt das Semaphore in den nicht-signalierten Zustand. Nicht unterstützt. |
| [Semaphore](./semaphore/)(int, int) | RTTI-Informationen. |
| [Semaphore](./semaphore/)(int, int, const String\&) | Erstellt ein benanntes Semaphore. |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | Erstellt ein benanntes Semaphore. |
| virtual [Set](./set/)() | Setzt das Semaphore in den signalisierten Zustand. Nicht unterstützt. |
| [WaitOne](./waitone/)() override | Sperrt das Semaphore. Führt bei Bedarf unbegrenztes Warten aus. |
| [WaitOne](./waitone/)(int) override | Sperrt das Semaphore. Führt bei Bedarf Warten aus. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Spezieller Wert, der von der Funktion zurückgegeben wird, andernfalls wird der Index des signalisierten Objekts im Array zurückgegeben, wenn das Timeout überschritten wird und nichts signalisiert. |
## Siehe auch

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
