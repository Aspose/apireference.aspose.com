---
title: "classe System::Threading::EventWaitHandle"
linktitle: "EventWaitHandle"
second_title: "Aspose.Font per C++"
description: "classe System::Threading::EventWaitHandle. Evento che può essere inviato a un thread in attesa. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | Informazioni RTTI. |
| virtual [Reset](./reset/)() | Imposta l'evento nello stato non segnalante. |
| virtual [Set](./set/)() | Imposta l'evento nello stato segnalante. |
| [~EventWaitHandle](./~eventwaithandle/)() | Distruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Valore speciale da restituire dalla funzione, altrimenti restituisce l'indice dell'oggetto segnalato nell'array, se il timeout scade e nulla segnala. |
## Vedi anche

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
