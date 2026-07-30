---
title: "System::Diagnostics::TraceListener Klasse"
linktitle: "TraceListener"
second_title: "Aspose.Font für C++"
description: "System::Diagnostics::TraceListener Klasse. Schnittstelle, um auf Debug- und Trace-Informationen zu reagieren. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


Schnittstelle, um auf Debug- und Trace-Informationen zu reagieren. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TraceListener : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | Schreibt Fehlermeldung in den Debugger. |
| virtual [Fail](./fail/)(System::String, System::String) | Schreibt Fehlermeldung in den Debugger. |
| virtual [Write](./write/)(System::String) | RTTI-Informationen. |
| virtual [WriteLine](./writeline/)(System::String) | Schreibt Zeile in den Debugger. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
