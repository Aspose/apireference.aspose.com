---
title: "System::Diagnostics::Process Klasse"
linktitle: "Process"
second_title: "Aspose.Page für C++"
description: "System::Diagnostics::Process Klasse. Kapselt Prozessinformationen und -manipulation. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.diagnostics/process/
---
## Process class


Kapselt Prozessinformationen und -manipulation. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Process : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | Ermittelt, ob das Ereignis Exited ausgelöst werden soll, wenn der Prozess beendet wird. |
| [get_ExitCode](./get_exitcode/)() const | Ermittelt den Exit-Code des Prozesses. |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | Ermittelt die Größe des privaten Speicherbereichs des Prozesses. |
| [get_ProcessName](./get_processname/)() const | Liefert den Prozessnamen. |
| [get_StandardError](./get_standarderror/)() const | Stellt einen Reader zum Lesen der Fehlausgabe des Prozesses bereit. Nicht implementiert. |
| [get_StandardOutput](./get_standardoutput/)() const | Stellt einen Reader zum Lesen der Standardausgabe des Prozesses bereit. Nicht implementiert. |
| [get_StartInfo](./get_startinfo/)() const | Liefert die Startinformationen des Prozesses. |
| [get_WorkingSet64](./get_workingset64/)() const | Liefert die Arbeitssatzgröße des Prozessspeichers. |
| static [GetCurrentProcess](./getcurrentprocess/)() | Liefert Informationen über den aktuellen Prozess. Nur [Windows](../../system.windows/). |
| [GetOutputText](./getoutputtext/)() const | Liefert den Ausgabetext des Prozesses. |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | Legt fest, ob das Ereignis Exited ausgelöst werden soll, wenn der Prozess beendet wird. |
| [Start](./start/)() | Startet den Prozess mit vordefinierten Parametern. |
| static [Start](./start/)(const String\&, const String\&) | Startet den Prozess mit angegebenem Pfad und Argumenten. |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | Startet den Prozess mit angegebenem Pfad und Argumenten. |
| [WaitForExit](./waitforexit/)(int) | Wartet, bis der Prozess beendet ist. Nicht implementiert. |
| [WaitForExit](./waitforexit/)() | Wartet, bis der Prozess beendet ist, und kehrt erst zurück, wenn er abgeschlossen ist. |
| virtual [~Process](./~process/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
