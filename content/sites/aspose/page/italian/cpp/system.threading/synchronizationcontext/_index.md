---
title: "System::Threading::SynchronizationContext classe"
linktitle: "SynchronizationContext"
second_title: "Aspose.Page per C++"
description: "System::Threading::SynchronizationContext classe. Fornisce la funzionalità di base per propagare un contesto di sincronizzazione attraverso varie operazioni di sincronizzazione in C++."
type: docs
weight: 1100
url: /it/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


Fornisce la funzionalità di base per propagare un contesto di sincronizzazione attraverso varie operazioni di sincronizzazione.

```cpp
class SynchronizationContext : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [get_Current](./get_current/)() | Ottiene il contesto di sincronizzazione per il thread corrente. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | Imposta il contesto di sincronizzazione per il thread corrente. |
| [SynchronizationContext](./synchronizationcontext/)() | Informazioni RTTI. |
## Osservazioni


Questa classe consente la propagazione del contesto di sincronizzazione tra i thread ed è usata per instradare callback o invocazioni al thread o contesto di sincronizzazione appropriato.
Implementazione fittizia.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
