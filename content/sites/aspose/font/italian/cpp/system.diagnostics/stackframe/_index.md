---
title: "System::Diagnostics::StackFrame classe"
linktitle: "StackFrame"
second_title: "Aspose.Font per C++"
description: "System::Diagnostics::StackFrame classe. Ottiene informazioni su un singolo frame dello stack. Solo MSVS. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.diagnostics/stackframe/
---
## StackFrame class


Ottiene informazioni su un singolo frame dello stack. Solo MSVS. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class StackFrame : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | Ottiene il numero colnum. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | Ottiene il numero di riga. |
| virtual [GetFileName](./getfilename/)() | Ottiene il nome del file. |
| [GetMethod](./getmethod/)() | Ottiene informazioni sul metodo. |
| [operator=](./operator=/)(const StackFrame\&) const | Nessuna modifica. |
| [StackFrame](./stackframe/)(int) | Crea un frame dello stack con l'offset corrente dello stack. |
| [StackFrame](./stackframe/)(const StackFrame\&) | Nessuna copia. |
| virtual [~StackFrame](./~stackframe/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
