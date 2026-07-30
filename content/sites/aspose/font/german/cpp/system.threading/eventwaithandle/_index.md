---
title: "System::Threading::EventWaitHandle Klasse"
linktitle: "EventWaitHandle"
second_title: "Aspose.Font für C++"
description: "System::Threading::EventWaitHandle Klasse. Ereignis, das an einen wartenden Thread gesendet werden kann. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | RTTI-Informationen. |
| virtual [Reset](./reset/)() | Setzt das Ereignis in den nicht-signalisierenden Zustand. |
| virtual [Set](./set/)() | Setzt das Ereignis in den signalisierenden Zustand. |
| [~EventWaitHandle](./~eventwaithandle/)() | Destruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Spezialwert, der von der Funktion zurückgegeben wird, andernfalls wird der Index des signalisierten Objekts im Array zurückgegeben, wenn das Zeitlimit überschritten wird und nichts signalisiert. |
## Siehe auch

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
