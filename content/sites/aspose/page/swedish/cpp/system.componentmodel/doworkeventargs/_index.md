---
title: "System::ComponentModel::DoWorkEventArgs-klass"
linktitle: "DoWorkEventArgs"
second_title: "Aspose.Page för C++"
description: "System::ComponentModel::DoWorkEventArgs-klass. DoWork‑händelseargument. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 600
url: /sv/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


DoWork‑händelseargument. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | RTTI-information. |
| [get_Argument](./get_argument/)() | Hämtar Argument‑egenskapen; ej implementerad. |
| [get_Result](./get_result/)() | Hämtar Result‑egenskapen; ej implementerad. |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | Sätter Result‑egenskapen; ej implementerad. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | En statisk medlem som representerar en "tom" [EventArgs](../../system/eventargs/) delad pekare (null‑pekare). |
## Se även

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
