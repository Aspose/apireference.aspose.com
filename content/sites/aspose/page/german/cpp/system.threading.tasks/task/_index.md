---
title: "System::Threading::Tasks::Task Klasse"
linktitle: "Task"
second_title: "Aspose.Page für C++"
description: "System::Threading::Tasks::Task Klasse. Stellt eine asynchrone Operation dar, die abgewartet werden kann und mit anderen Tasks in C++ kombiniert werden kann."
type: docs
weight: 300
url: /de/cpp/system.threading.tasks/task/
---
## Task class


Stellt eine asynchrone Operation dar, die abgewartet und mit anderen Aufgaben kombiniert werden kann.

```cpp
class Task : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | Aktiviert den Task zur Ausführung auf einem Scheduler. |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | Fügt eine Fortsetzungsaktion hinzu, die nach Abschluss ausgeführt wird. |
| [Complete](./complete/)() | Markiert den Task als abgeschlossen und beendet den Task. |
| [ConfigureAwait](./configureawait/)(bool) const | Konfiguriert, wie Await‑Aufrufe auf diesem Task sich hinsichtlich der Kontextübernahme verhalten sollen. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Task abgeschlossen ist. |
| [Dispose](./dispose/)() override | Gibt Ressourcen frei, die mit dem Task verbunden sind. |
| [Execute](./execute/)() | Führt die Funktion des Tasks aus. |
| [get_AsyncState](./get_asyncstate/)() const | Liefert das benutzerdefinierte Zustandsobjekt, das mit dem Task verknüpft ist. |
| static [get_CompletedTask](./get_completedtask/)() | Liefert einen abgeschlossenen Task (Singleton) |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | Liefert die ID für den Task. |
| [get_IsCanceled](./get_iscanceled/)() const | Liefert, ob der Task aufgrund einer Stornierung abgeschlossen wurde. |
| [get_IsCompleted](./get_iscompleted/)() const | Liefert, ob der Task abgeschlossen ist. |
| [get_IsFaulted](./get_isfaulted/)() const | Liefert, ob der Task aufgrund einer nicht behandelten Ausnahme abgeschlossen wurde. |
| [get_Scheduler](./get_scheduler/)() const | Liefert den Scheduler, der mit diesem Task verknüpft ist. |
| [get_Status](./get_status/)() const | Liefert den aktuellen Status des Tasks. |
| [GetAwaiter](./getawaiter/)() const | Liefert einen Awaiter für diesen Task zur Verwendung mit Await. |
| [RunSynchronously](./runsynchronously/)() | Führt den Task synchron im aktuellen Thread aus. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | Führt den Task synchron unter Verwendung des angegebenen Schedulers aus. |
| [set_Function](./set_function/)(const FunctionT\&) | Legt die interne Funktion fest, die ausgeführt werden soll. |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | Legt den Scheduler fest, der mit dieser Aufgabe verknüpft ist. |
| [set_Status](./set_status/)(TaskStatus) | Legt den Aufgabenstatus fest. |
| [Start](./start/)() | Startet die Aufgabenausführung mit dem Standard‑Scheduler. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | Startet die Aufgabenausführung mit dem angegebenen Scheduler. |
| [Task](./task/)(const Action<>\&) | Erstellt ein [Task](./) mit einer auszuführenden Aktion. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | Erstellt ein [Task](./) mit einer Aktion und einem Abbruch‑Token. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | Erstellt ein [Task](./) mit einer zustandsbehafteten Aktion und einem Zustandsobjekt. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | Erstellt ein [Task](./) mit einer zustandsbehafteten Aktion, einem Zustand und einem Abbruch‑Token. |
| [Task](./task/)() | Interner Konstruktor zum Erstellen nicht initialisierter Aufgaben. |
| [Wait](./wait/)(const CancellationToken\&) const | Wartet darauf, dass die Aufgabe mit Unterstützung für Abbruch abgeschlossen wird. |
| [Wait](./wait/)() const | Wartet darauf, dass die Aufgabe abgeschlossen wird. |
| [~Task](./~task/)() | Destruktor. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [FunctionT](./functiont/) | Interne Implementierung. Nicht für Benutzercode. |
## Hinweise


Bietet eine C++‑Implementierung, die der [System.Threading.Tasks.Task](./) in .NET ähnelt und Abbruch, Fortsetzungen sowie async/await‑Muster unterstützt.
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
