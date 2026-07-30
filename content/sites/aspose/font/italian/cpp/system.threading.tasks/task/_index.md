---
title: "Classe System::Threading::Tasks::Task"
linktitle: "Task"
second_title: "Aspose.Font per C++"
description: "Classe System::Threading::Tasks::Task. Rappresenta un'operazione asincrona che può essere attesa e composta con altre attività in C++."
type: docs
weight: 600
url: /it/cpp/system.threading.tasks/task/
---
## Task class


Rappresenta un'operazione asincrona che può essere attesa e composta con altri task.

```cpp
class Task : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Activate](./activate/)(const SharedPtr\<TaskScheduler\>\&) | Attiva l'attività per l'esecuzione su uno scheduler. |
| [AddCompletionAction](./addcompletionaction/)(const Action<>\&) | Aggiunge un'azione di continuazione da eseguire al completamento. |
| [Cancel](./cancel/)() | Segna l'attività come annullata e termina l'attività. |
| [Complete](./complete/)() | Segna il task come completato e termina il task. |
| [ConfigureAwait](./configureawait/)(bool) const | Configura come gli await su questo task devono comportarsi riguardo alla cattura del contesto. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Crea una continuazione che viene eseguita quando il task completa. |
| [ContinueWith](./continuewith/)(const Func\<TaskPtr, TResult\>\&) | Crea una continuazione che viene eseguita quando il task completa. |
| [Dispose](./dispose/)() override | Rilascia le risorse associate al task. |
| [Execute](./execute/)() | Esegue la funzione del task. |
| [get_AsyncState](./get_asyncstate/)() const | Ottiene l'oggetto di stato definito dall'utente associato al task. |
| static [get_CompletedTask](./get_completedtask/)() | Ottiene un task completato (singleton) |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Exception](./get_exception/)() const | Ottiene l'ID del task. |
| [get_Id](./get_id/)() const |  |
| [get_IsCanceled](./get_iscanceled/)() const | Ottiene se il task è stato completato a causa della cancellazione. |
| [get_IsCompleted](./get_iscompleted/)() const | Ottiene se il task è stato completato. |
| [get_IsFaulted](./get_isfaulted/)() const | Ottiene se il task è stato completato a causa di un'eccezione non gestita. |
| [get_Scheduler](./get_scheduler/)() const | Ottiene lo scheduler associato a questo task. |
| [get_Status](./get_status/)() const | Ottiene lo stato corrente del task. |
| [GetAwaiter](./getawaiter/)() const | Ottiene un awaiter per questo task da usare con Await. |
| [RunSynchronously](./runsynchronously/)() | Esegue il task in modo sincrono sul thread corrente. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | Esegue il task in modo sincrono usando lo scheduler specificato. |
| [set_Function](./set_function/)(const FunctionT\&) | Imposta la funzione interna da eseguire. |
| [set_Scheduler](./set_scheduler/)(const SharedPtr\<TaskScheduler\>\&) | Imposta lo scheduler associato a questo task. |
| [set_Status](./set_status/)(TaskStatus) | Imposta lo stato del task. |
| [Start](./start/)() | Avvia l'esecuzione del task usando lo scheduler predefinito. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | Avvia l'esecuzione del task usando lo scheduler specificato. |
| [Task](./task/)(const Action<>\&) | Costruisce un [Task](./) con un'azione da eseguire. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | Costruisce un [Task](./) con un'azione e un token di cancellazione. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | Costruisce un [Task](./) con un'azione con stato e un oggetto di stato. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | Costruisce un [Task](./) con un'azione con stato, oggetto di stato e token di cancellazione. |
| [Task](./task/)() | Costruttore interno per creare task non inizializzati. |
| [Wait](./wait/)(const CancellationToken\&) | Attende che l'attività sia completata con supporto per la cancellazione. |
| [Wait](./wait/)() | Attende che l'attività sia completata. |
| [~Task](./~task/)() | Distruttore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [FunctionT](./functiont/) | Implementazione interna. Non per il codice utente. |
## Osservazioni


Fornisce un'implementazione C++ simile a [System.Threading.Tasks.Task](./) in .NET, supportando la cancellazione, le continuazioni e i pattern async/await
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
