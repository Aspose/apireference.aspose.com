---
title: "Classe System::Threading::Semaphore"
linktitle: "Semaforo"
second_title: "Aspose.Font per C++"
description: "Classe System::Threading::Semaphore. Implementazione del semaforo. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Release](./release/)() | Rilascia il lock sul semaforo. |
| [Release](./release/)(int) | Rilascia più lock sul semaforo. |
| virtual [Reset](./reset/)() | Imposta il semaforo nello stato non segnalato. Non supportato. |
| [Semaphore](./semaphore/)(int, int) | Informazioni RTTI. |
| [Semaphore](./semaphore/)(int, int, const String\&) | Crea un semaforo con nome. |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | Crea un semaforo con nome. |
| virtual [Set](./set/)() | Imposta il semaforo nello stato segnalato. Non supportato. |
| [WaitOne](./waitone/)() override | Blocca il semaforo. Esegue attesa illimitata se necessario. |
| [WaitOne](./waitone/)(int) override | Blocca il semaforo. Esegue attesa se necessario. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | Valore speciale da restituire dalla funzione, altrimenti restituisce l'indice dell'oggetto segnalato nell'array, se il timeout scade e nulla segnala. |
## Vedi anche

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
