---
title: "System::Diagnostics::TraceListener klasse"
linktitle: "TraceListener"
second_title: "Aspose.Page voor C++"
description: "System::Diagnostics::TraceListener klasse. Interface om te reageren op debug- en trace-informatie. Objecten van deze klasse mogen alleen worden toegewezen met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 800
url: /nl/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


Interface om te reageren op debug- en trace-informatie. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../../system/makeobject/) function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class TraceListener : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | Schrijft foutbericht naar debugger. |
| virtual [Fail](./fail/)(System::String, System::String) | Schrijft foutbericht naar debugger. |
| virtual [Write](./write/)(System::String) | RTTI-informatie. |
| virtual [WriteLine](./writeline/)(System::String) | Schrijft regel naar debugger. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
