---
title: "System::Diagnostics::Process class"
linktitle: "Process"
second_title: "Aspose.Font per C++"
description: "System::Diagnostics::Process class. Incapsula le informazioni e la manipolazione del processo. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.diagnostics/process/
---
## Process class


Incapsula le informazioni e la manipolazione del processo. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Process : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | Restituisce se l'evento Exited deve essere sollevato quando il processo termina. |
| [get_ExitCode](./get_exitcode/)() const | Restituisce il codice di uscita del processo. |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | Restituisce la dimensione della memoria privata del processo. |
| [get_ProcessName](./get_processname/)() const | Restituisce il nome del processo. |
| [get_StandardError](./get_standarderror/)() const | Fornisce un lettore per leggere l'output di errore del processo. Non implementato. |
| [get_StandardOutput](./get_standardoutput/)() const | Fornisce un lettore per leggere l'output standard del processo. Non implementato. |
| [get_StartInfo](./get_startinfo/)() const | Ottiene le informazioni di avvio del processo. |
| [get_WorkingSet64](./get_workingset64/)() const | Ottiene la dimensione del working set della memoria del processo. |
| static [GetCurrentProcess](./getcurrentprocess/)() | Ottiene informazioni sul processo corrente. Solo [Windows](../../system.windows/). |
| [GetOutputText](./getoutputtext/)() const | Ottiene il testo di output del processo. |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | Imposta se l'evento Exited deve essere sollevato quando il processo termina. |
| [Start](./start/)() | Avvia il processo con parametri predefiniti. |
| static [Start](./start/)(const String\&, const String\&) | Avvia il processo con percorso e argomenti specificati. |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | Avvia il processo con percorso e argomenti specificati. |
| [WaitForExit](./waitforexit/)(int) | Attende che il processo termini. Non implementato. |
| [WaitForExit](./waitforexit/)() | Attende che il processo termini, non restituisce il controllo finché non è finito. |
| virtual [~Process](./~process/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
