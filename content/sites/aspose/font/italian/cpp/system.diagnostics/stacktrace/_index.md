---
title: "Classe System::Diagnostics::StackTrace"
linktitle: "StackTrace"
second_title: "Aspose.Font per C++"
description: "Classe System::Diagnostics::StackTrace. Collezione di frame dello stack. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


Collezione di frame dello stack. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class StackTrace : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | Restituisce il conteggio dei frame nello stack trace. |
| virtual [GetFrame](./getframe/)(uint32_t) | Restituisce il frame dello stack. |
| [operator=](./operator=/)(const StackTrace\&) const | Nessuna assegnazione. |
| [StackTrace](./stacktrace/)() | Crea uno stack trace che descrive lo stato corrente dello stack. |
| [StackTrace](./stacktrace/)(bool) | Crea uno stack trace che descrive lo stato corrente dello stack. |
| [StackTrace](./stacktrace/)(const StackTrace\&) | Nessuna copia. |
| virtual [~StackTrace](./~stacktrace/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
