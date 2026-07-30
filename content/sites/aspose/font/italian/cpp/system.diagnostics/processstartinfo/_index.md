---
title: "classe System::Diagnostics::ProcessStartInfo"
linktitle: "ProcessStartInfo"
second_title: "Aspose.Font per C++"
description: "classe System::Diagnostics::ProcessStartInfo. Descrive i parametri di avvio del processo. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò può causare errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 400
url: /it/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


Descrive i parametri di avvio del processo. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò può causare errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class ProcessStartInfo : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | Ottiene gli argomenti del processo. |
| [get_CreateNoWindow](./get_createnowindow/)() const | Ottiene la proprietà NoWindow. |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | Ottiene le variabili d'ambiente del processo. |
| [get_FileName](./get_filename/)() const | Ottiene il nome file del processo. |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | Ottiene la proprietà RedirectStandardError. |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | Ottiene la proprietà RedirectStandardInput. |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | Ottiene la proprietà RedirectStandardOutput. |
| [get_UseShellExecute](./get_useshellexecute/)() const | Ottiene la proprietà UseShellExecute. |
| [get_WindowStyle](./get_windowstyle/)() const | Ottiene lo stile della finestra. |
| [get_WorkingDirectory](./get_workingdirectory/)() const | Ottiene la directory di lavoro del processo. |
| [ProcessStartInfo](./processstartinfo/)() | Crea un oggetto start info vuoto. |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | Crea un oggetto start info. |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | Crea un oggetto start info. |
| [set_Arguments](./set_arguments/)(const String\&) | Imposta gli argomenti del processo. |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | Imposta la proprietà NoWindow. |
| [set_FileName](./set_filename/)(const String\&) | Imposta il nome file del processo. |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | Imposta la proprietà RedirectStandardError. |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | Imposta la proprietà RedirectStandardInput. |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | Imposta la proprietà RedirectStandardOutput. |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | Imposta la proprietà UseShellExecute. |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | Imposta lo stile della finestra. |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | Imposta la directory di lavoro del processo. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
