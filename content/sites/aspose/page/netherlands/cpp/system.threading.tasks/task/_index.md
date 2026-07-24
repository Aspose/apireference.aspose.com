---
title: "System::Threading::Tasks::Task klasse"
linktitle: "Task"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::Task klasse. Vertegenwoordigt een asynchrone bewerking die kan worden afgewacht en gecombineerd met andere taken in C++."
type: docs
weight: 300
url: /nl/cpp/system.threading.tasks/task/
---
## Task class


Stelt een asynchrone bewerking voor die kan worden afgewacht en gecombineerd met andere taken.

```cpp
class Task : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | Activeert de taak voor uitvoering op een planner. |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | Voegt een voortzettingsactie toe die wordt uitgevoerd bij voltooiing. |
| [Complete](./complete/)() | Markeert de taak als voltooid en beëindigt de taak. |
| [ConfigureAwait](./configureawait/)(bool) const | Configureert hoe afwachtingen op deze taak zich moeten gedragen met betrekking tot contextvastlegging. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Creëert een voortzetting die wordt uitgevoerd wanneer de taak voltooid is. |
| [Dispose](./dispose/)() override | Geeft bronnen vrij die aan de taak zijn gekoppeld. |
| [Execute](./execute/)() | Voert de functie van de taak uit. |
| [get_AsyncState](./get_asyncstate/)() const | Haalt het door de gebruiker gedefinieerde statusobject op dat aan de taak is gekoppeld. |
| static [get_CompletedTask](./get_completedtask/)() | Haalt een voltooide taak op (singleton) |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | Haalt de ID voor de taak op. |
| [get_IsCanceled](./get_iscanceled/)() const | Haalt op of de taak is voltooid vanwege annulering. |
| [get_IsCompleted](./get_iscompleted/)() const | Haalt op of de taak is voltooid. |
| [get_IsFaulted](./get_isfaulted/)() const | Haalt op of de taak is voltooid vanwege een niet-afgehandelde uitzondering. |
| [get_Scheduler](./get_scheduler/)() const | Haalt de planner op die aan deze taak is gekoppeld. |
| [get_Status](./get_status/)() const | Haalt de huidige status van de taak op. |
| [GetAwaiter](./getawaiter/)() const | Haalt een awaiter op voor deze taak voor gebruik met Await. |
| [RunSynchronously](./runsynchronously/)() | Voert de taak synchroon uit op de huidige thread. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | Voert de taak synchroon uit met behulp van de opgegeven planner. |
| [set_Function](./set_function/)(const FunctionT\&) | Stelt de interne functie in om uit te voeren. |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | Stelt de planner in die aan deze taak is gekoppeld. |
| [set_Status](./set_status/)(TaskStatus) | Stelt de taakstatus in. |
| [Start](./start/)() | Start de uitvoering van de taak met de standaardplanner. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | Start de uitvoering van de taak met de opgegeven planner. |
| [Task](./task/)(const Action<>\&) | Construeert een [Task](./) met een actie om uit te voeren. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | Construeert een [Task](./) met een actie en een annulerings-token. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | Construeert een [Task](./) met een stateful actie en een statusobject. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | Construeert een [Task](./) met een stateful actie, status en een annulerings-token. |
| [Task](./task/)() | Interne constructor voor het maken van niet-geïnitieerde taken. |
| [Wait](./wait/)(const CancellationToken\&) const | Wacht tot de taak voltooid is met annuleringsondersteuning. |
| [Wait](./wait/)() const | Wacht tot de taak voltooid is. |
| [~Task](./~task/)() | Destructor. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [FunctionT](./functiont/) | Interne implementatie. Niet voor gebruikerscode. |
## Opmerkingen


Biedt een C++-implementatie die vergelijkbaar is met [System.Threading.Tasks.Task](./) in .NET, met ondersteuning voor annulering, voortzettingen en async/await‑patronen.
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
