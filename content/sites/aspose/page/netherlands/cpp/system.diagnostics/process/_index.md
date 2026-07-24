---
title: "System::Diagnostics::Process klasse"
linktitle: "Process"
second_title: "Aspose.Page voor C++"
description: "System::Diagnostics::Process klasse. Omvat procesinformatie en -manipulatie. Objecten van deze klasse mogen alleen worden toegewezen met de functie System::MakeObject() function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 300
url: /nl/cpp/system.diagnostics/process/
---
## Process class


Omvat procesinformatie en -manipulatie. Objecten van deze klasse mogen alleen worden toegewezen met de functie [System::MakeObject()](../../system/makeobject/) function. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Process : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | Geeft terug of het evenement Exited moet worden opgehaald wanneer het proces wordt beëindigd. |
| [get_ExitCode](./get_exitcode/)() const | Geeft proces exitcode terug. |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | Geeft de grootte van de private geheugenset van het proces terug. |
| [get_ProcessName](./get_processname/)() const | Geeft de procesnaam terug. |
| [get_StandardError](./get_standarderror/)() const | Biedt een lezer om te lezen van de foutuitvoer van het proces. Niet geïmplementeerd. |
| [get_StandardOutput](./get_standardoutput/)() const | Biedt een lezer om te lezen van de standaarduitvoer van het proces. Niet geïmplementeerd. |
| [get_StartInfo](./get_startinfo/)() const | Geeft de startinformatie van het proces terug. |
| [get_WorkingSet64](./get_workingset64/)() const | Geeft de grootte van de werkset van het procesgeheugen terug. |
| static [GetCurrentProcess](./getcurrentprocess/)() | Geeft informatie over het huidige proces. Alleen [Windows](../../system.windows/). |
| [GetOutputText](./getoutputtext/)() const | Geeft de uitvoertekst van het proces terug. |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | Stelt in of het evenement Exited moet worden opgehaald wanneer het proces wordt beëindigd. |
| [Start](./start/)() | Start proces met vooraf gedefinieerde parameters. |
| static [Start](./start/)(const String\&, const String\&) | Start proces met opgegeven pad en argumenten. |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | Start proces met opgegeven pad en argumenten. |
| [WaitForExit](./waitforexit/)(int) | Wacht tot het proces afsluit. Niet geïmplementeerd. |
| [WaitForExit](./waitforexit/)() | Wacht tot het proces afsluit, keert pas terug wanneer het voltooid is. |
| virtual [~Process](./~process/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
