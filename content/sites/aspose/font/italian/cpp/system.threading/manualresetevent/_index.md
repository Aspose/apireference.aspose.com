---
title: "System::Threading::ManualResetEvent classe"
linktitle: "ManualResetEvent"
second_title: "Aspose.Font per C++"
description: "System::Threading::ManualResetEvent classe. Evento per notificare il thread in attesa che non si resetta automaticamente. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | Informazioni RTTI. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Valore speciale da restituire dalla funzione, altrimenti restituisce l'indice dell'oggetto segnalato nell'array, se il timeout scade e nulla segnala. |
## Vedi anche

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
