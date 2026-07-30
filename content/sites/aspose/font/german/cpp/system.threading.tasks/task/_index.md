---
title: "System::Threading::Tasks::Task-Klasse"
linktitle: "Task"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::Task-Klasse. Stellt eine asynchrone Operation dar, die in C++ abgewartet und mit anderen Aufgaben kombiniert werden kann."
type: docs
weight: 600
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
| [Activate](./activate/)(const SharedPtr\<TaskScheduler\>\&) | Aktiviert die Aufgabe zur Ausführung auf einem Scheduler. |
| [AddCompletionAction](./addcompletionaction/)(const Action<>\&) | Fügt eine Fortsetzungsaktion hinzu, die nach Abschluss ausgeführt wird. |
| [Cancel](./cancel/)() | Markiert die Aufgabe als abgebrochen und beendet die Aufgabe. |
| [Complete](./complete/)() | Markiert die Aufgabe als abgeschlossen und beendet die Aufgabe. |
| [ConfigureAwait](./configureawait/)(bool) const | Konfiguriert, wie Await-Operationen für diese Aufgabe in Bezug auf die Kontextaufnahme verhalten sollen. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Task abgeschlossen ist. |
| [ContinueWith](./continuewith/)(const Func\<TaskPtr, TResult\>\&) | Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Task abgeschlossen ist. |
| [Dispose](./dispose/)() override | Gibt Ressourcen frei, die mit der Aufgabe verbunden sind. |
| [Execute](./execute/)() | Führt die Funktion der Aufgabe aus. |
| [get_AsyncState](./get_asyncstate/)() const | Liefert das benutzerdefinierte Zustandsobjekt, das mit der Aufgabe verknüpft ist. |
| static [get_CompletedTask](./get_completedtask/)() | Liefert eine abgeschlossene Aufgabe (Singleton). |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Exception](./get_exception/)() const | Liefert die ID für die Aufgabe. |
| [get_Id](./get_id/)() const |  |
| [get_IsCanceled](./get_iscanceled/)() const | Liefert, ob die Aufgabe aufgrund einer Abbruchanforderung abgeschlossen wurde. |
| [get_IsCompleted](./get_iscompleted/)() const | Liefert, ob die Aufgabe abgeschlossen ist. |
| [get_IsFaulted](./get_isfaulted/)() const | Liefert, ob die Aufgabe aufgrund einer nicht behandelten Ausnahme abgeschlossen wurde. |
| [get_Scheduler](./get_scheduler/)() const | Liefert den Scheduler, der mit dieser Aufgabe verknüpft ist. |
| [get_Status](./get_status/)() const | Liefert den aktuellen Status der Aufgabe. |
| [GetAwaiter](./getawaiter/)() const | Liefert einen Awaiter für diese Aufgabe zur Verwendung mit Await. |
| [RunSynchronously](./runsynchronously/)() | Führt die Aufgabe synchron im aktuellen Thread aus. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | Führt die Aufgabe synchron mit dem angegebenen Scheduler aus. |
| [set_Function](./set_function/)(const FunctionT\&) | Setzt die interne Funktion, die ausgeführt werden soll. |
| [set_Scheduler](./set_scheduler/)(const SharedPtr\<TaskScheduler\>\&) | Setzt den Scheduler, der mit dieser Aufgabe verknüpft ist. |
| [set_Status](./set_status/)(TaskStatus) | Setzt den Aufgabenstatus. |
| [Start](./start/)() | Startet die Aufgabenausführung mit dem Standardscheduler. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | Startet die Aufgabenausführung mit dem angegebenen Scheduler. |
| [Task](./task/)(const Action<>\&) | Konstruiert ein [Task](./) mit einer auszuführenden Aktion. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | Konstruiert ein [Task](./) mit einer Aktion und einem Abbruch-Token. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | Konstruiert ein [Task](./) mit einer zustandsbehafteten Aktion und Zustandsobjekt. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | Konstruiert ein [Task](./) mit einer zustandsbehafteten Aktion, Zustand und Abbruch-Token. |
| [Task](./task/)() | Interner Konstruktor zum Erstellen nicht initialisierter Aufgaben. |
| [Wait](./wait/)(const CancellationToken\&) | Wartet, bis die Aufgabe mit Unterstützung für Abbruch abgeschlossen ist. |
| [Wait](./wait/)() | Wartet, bis die Aufgabe abgeschlossen ist. |
| [~Task](./~task/)() | Destruktor. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [FunctionT](./functiont/) | Interne Implementierung. Nicht für Benutzercode. |
## Hinweise


Stellt eine C++-Implementierung bereit, die der [System.Threading.Tasks.Task](./) in .NET ähnelt und Abbruch, Fortsetzungen sowie async/await‑Muster unterstützt.
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
