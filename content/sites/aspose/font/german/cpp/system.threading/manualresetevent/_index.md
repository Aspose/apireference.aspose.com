---
title: "System::Threading::ManualResetEvent Klasse"
linktitle: "ManualResetEvent"
second_title: "Aspose.Font für C++"
description: "System::Threading::ManualResetEvent Klasse. Ereignis, das wartende Threads benachrichtigt und sich nicht automatisch zurücksetzt. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 700
url: /de/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | RTTI-Informationen. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Spezialwert, der von der Funktion zurückgegeben wird, andernfalls wird der Index des signalisierten Objekts im Array zurückgegeben, wenn das Zeitlimit überschritten wird und nichts signalisiert. |
## Siehe auch

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
