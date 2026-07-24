---
title: "System::Diagnostics::ProcessStartInfo class"
linktitle: "ProcessStartInfo"
second_title: "Aspose.Page voor C++"
description: "System::Diagnostics::ProcessStartInfo class. Beschrijft de startparameters van het proces. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


Beschrijft de startparameters van het proces. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ProcessStartInfo : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | Haalt procesargumenten op. |
| [get_CreateNoWindow](./get_createnowindow/)() const | Haalt de NoWindow‑eigenschap op. |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | Haalt de omgevingsvariabelen van het proces op. |
| [get_FileName](./get_filename/)() const | Haalt bestandsnaam van het proces op. |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | Haalt eigenschap RedirectStandardError op. |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | Haalt eigenschap RedirectStandardInput op. |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | Haalt eigenschap RedirectStandardOutput op. |
| [get_UseShellExecute](./get_useshellexecute/)() const | Haalt eigenschap UseShellExecute op. |
| [get_WindowStyle](./get_windowstyle/)() const | Haalt vensterstijl op. |
| [get_WorkingDirectory](./get_workingdirectory/)() const | Haalt werkmap van het proces op. |
| [ProcessStartInfo](./processstartinfo/)() | Maakt een leeg startinfo-object aan. |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | Maakt een startinfo-object aan. |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | Maakt een startinfo-object aan. |
| [set_Arguments](./set_arguments/)(const String\&) | Stelt procesargumenten in. |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | Stelt eigenschap NoWindow in. |
| [set_FileName](./set_filename/)(const String\&) | Stelt bestandsnaam van het proces in. |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | Stelt eigenschap RedirectStandardError in. |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | Stelt eigenschap RedirectStandardInput in. |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | Stelt eigenschap RedirectStandardOutput in. |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | Stelt eigenschap UseShellExecute in. |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | Stelt vensterstijl in. |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | Stelt werkmap van het proces in. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
