---
title: "System::Diagnostics::Stopwatch classe"
linktitle: "Stopwatch"
second_title: "Aspose.Font per C++"
description: "Classe System::Diagnostics::Stopwatch. Consente la misurazione del tempo. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


Consente la misurazione del tempo. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class Stopwatch : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | Restituisce il tempo totale trascorso misurato dall'istanza corrente. |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | Restituisce il tempo totale trascorso misurato dall'istanza corrente, in millisecondi. |
| [get_ElapsedTicks](./get_elapsedticks/)() const | Restituisce il tempo totale trascorso misurato dall'istanza corrente, in tick del timer. |
| [get_IsRunning](./get_isrunning/)() const | Verifica se il cronometro è in esecuzione. |
| [Reset](./reset/)() | Interrompe la misurazione del tempo, imposta l'intervallo misurato a zero. |
| [Restart](./restart/)() | Imposta l'intervallo misurato a zero, quindi avvia la misurazione del tempo. |
| [Start](./start/)() | Avvia la misurazione del tempo. |
| static [StartNew](./startnew/)() | Crea un nuovo oggetto [Stopwatch](./) e avvia la misurazione. |
| [Stop](./stop/)() | Interrompe la misurazione del tempo. |
| [Stopwatch](./stopwatch/)() | Informazioni RTTI. |
| virtual [~Stopwatch](./~stopwatch/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
