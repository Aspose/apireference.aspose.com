---
title: "System::Threading::WaitHandle classe"
linktitle: "WaitHandle"
second_title: "Aspose.Font per C++"
description: "System::Threading::WaitHandle classe. Classe base primitiva di attesa. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1700
url: /it/cpp/system.threading/waithandle/
---
## WaitHandle class


Classe base primitiva di attesa. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class WaitHandle : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Close](./close/)() | Rilascia qualsiasi risorsa associata all'handle. |
| [get_Handle](./get_handle/)() | Restituisce l'handle. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Informazioni RTTI. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Attende che tutti gli handle vengano attivati. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Attende che tutti gli handle vengano attivati. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | Attende che uno qualsiasi degli handle venga attivato. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | Attende che uno qualsiasi degli handle venga attivato. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | Attende che uno qualsiasi degli handle venga attivato. |
| virtual [WaitOne](./waitone/)() | Attende che l'handle venga attivato per un periodo illimitato. |
| virtual [WaitOne](./waitone/)(int) | Attende che l'handle venga attivato. |
| virtual [WaitOne](./waitone/)(TimeSpan) | Attende che l'handle venga attivato. |
| virtual [WaitOne](./waitone/)(int, bool) | Attende che l'handle venga attivato. |
| virtual [~WaitHandle](./~waithandle/)() | Distruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | Valore speciale da restituire dalla funzione, altrimenti restituisce l'indice dell'oggetto segnalato nell'array, se il timeout scade e nulla segnala. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
