---
title: "System::Diagnostics::TraceListener class"
linktitle: "TraceListener"
second_title: "Aspose.Font per C++"
description: "System::Diagnostics::TraceListener class. Interfaccia per reagire a informazioni di debug e trace. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 800
url: /it/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


Interfaccia per reagire a informazioni di debug e trace. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class TraceListener : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | Scrive un messaggio di errore nel debugger. |
| virtual [Fail](./fail/)(System::String, System::String) | Scrive un messaggio di errore nel debugger. |
| virtual [Write](./write/)(System::String) | Informazioni RTTI. |
| virtual [WriteLine](./writeline/)(System::String) | Scrive una riga nel debugger. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
