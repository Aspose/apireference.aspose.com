---
title: "System::Threading::Tasks::Task klass"
linktitle: "Task"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::Task klass. Representerar en asynkron operation som kan avvaktas och kombineras med andra uppgifter i C++."
type: docs
weight: 300
url: /sv/cpp/system.threading.tasks/task/
---
## Task class


Representerar en asynkron operation som kan väntas på och komponeras med andra uppgifter.

```cpp
class Task : public System::IDisposable
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | Aktiverar uppgiften för körning på en schemaläggare. |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | Lägger till en fortsättningsåtgärd som ska utföras vid slutförandet. |
| [Complete](./complete/)() | Markerar uppgiften som slutförd och avslutar uppgiften. |
| [ConfigureAwait](./configureawait/)(bool) const | Konfigurerar hur väntan på denna uppgift ska bete sig avseende kontextfångst. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Skapar en fortsättning som körs när uppgiften slutförs. |
| [Dispose](./dispose/)() override | Frigör resurser som är associerade med uppgiften. |
| [Execute](./execute/)() | Utför uppgiftens funktion. |
| [get_AsyncState](./get_asyncstate/)() const | Hämtar det användardefinierade tillståndsobjektet som är associerat med uppgiften. |
| static [get_CompletedTask](./get_completedtask/)() | Hämtar en slutförd uppgift (singleton) |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | Hämtar ID för uppgiften. |
| [get_IsCanceled](./get_iscanceled/)() const | Hämtar om uppgiften slutfördes på grund av avbokning. |
| [get_IsCompleted](./get_iscompleted/)() const | Hämtar om uppgiften har slutförts. |
| [get_IsFaulted](./get_isfaulted/)() const | Hämtar om uppgiften slutfördes på grund av ett ohanterat undantag. |
| [get_Scheduler](./get_scheduler/)() const | Hämtar schemaläggaren som är associerad med denna uppgift. |
| [get_Status](./get_status/)() const | Hämtar den aktuella statusen för uppgiften. |
| [GetAwaiter](./getawaiter/)() const | Hämtar en väntare för denna uppgift för användning med Await. |
| [RunSynchronously](./runsynchronously/)() | Kör uppgiften synkront på den aktuella tråden. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | Kör uppgiften synkront med den angivna schemaläggaren. |
| [set_Function](./set_function/)(const FunctionT\&) | Ställer in den interna funktionen som ska köras. |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | Ställer in schemaläggaren som är associerad med denna uppgift. |
| [set_Status](./set_status/)(TaskStatus) | Ställer in uppgiftens status. |
| [Start](./start/)() | Startar uppgiftens körning med standard schemaläggaren. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | Startar uppgiftens körning med den angivna schemaläggaren. |
| [Task](./task/)(const Action<>\&) | Skapar en [Task](./) med en åtgärd att köra. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | Skapar en [Task](./) med en åtgärd och en avbokningstoken. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | Skapar en [Task](./) med en tillståndsbaserad åtgärd och ett tillståndsobjekt. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | Skapar en [Task](./) med tillståndsbaserad åtgärd, tillstånd och avbokningstoken. |
| [Task](./task/)() | Intern konstruktor för att skapa oinitialiserade uppgifter. |
| [Wait](./wait/)(const CancellationToken\&) const | Väntar på att uppgiften ska slutföras med stöd för avbokning. |
| [Wait](./wait/)() const | Väntar på att uppgiften ska slutföras. |
| [~Task](./~task/)() | Destruktor. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [FunctionT](./functiont/) | Intern implementation. Inte för användarkod. |
## Anmärkningar


Tillhandahåller en C++‑implementation som liknar [System.Threading.Tasks.Task](./) i .NET, med stöd för avbokning, fortsättningar och async/await‑mönster
## Se även

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
