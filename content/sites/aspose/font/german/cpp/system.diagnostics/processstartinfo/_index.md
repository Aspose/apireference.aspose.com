---
title: "Klasse System::Diagnostics::ProcessStartInfo"
linktitle: "ProcessStartInfo"
second_title: "Aspose.Font für C++"
description: "System::Diagnostics::ProcessStartInfo Klasse. Beschreibt die Startparameter des Prozesses. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


Beschreibt die Startparameter des Prozesses. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ProcessStartInfo : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | Liest Prozessargumente. |
| [get_CreateNoWindow](./get_createnowindow/)() const | Liest die NoWindow-Eigenschaft. |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | Liest Prozess-Umgebungsvariablen. |
| [get_FileName](./get_filename/)() const | Liest den Prozessdateinamen. |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | Liest die RedirectStandardError-Eigenschaft. |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | Liest die RedirectStandardInput-Eigenschaft. |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | Liest die RedirectStandardOutput-Eigenschaft. |
| [get_UseShellExecute](./get_useshellexecute/)() const | Liest die UseShellExecute-Eigenschaft. |
| [get_WindowStyle](./get_windowstyle/)() const | Liest den Fensterstil. |
| [get_WorkingDirectory](./get_workingdirectory/)() const | Liest das Arbeitsverzeichnis des Prozesses. |
| [ProcessStartInfo](./processstartinfo/)() | Erstellt ein leeres Startinfo-Objekt. |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | Erstellt ein Startinfo-Objekt. |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | Erstellt ein Startinfo-Objekt. |
| [set_Arguments](./set_arguments/)(const String\&) | Setzt Prozessargumente. |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | Setzt die NoWindow-Eigenschaft. |
| [set_FileName](./set_filename/)(const String\&) | Setzt den Prozessdateinamen. |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | Setzt die RedirectStandardError-Eigenschaft. |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | Setzt die RedirectStandardInput-Eigenschaft. |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | Setzt die RedirectStandardOutput-Eigenschaft. |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | Setzt die UseShellExecute-Eigenschaft. |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | Setzt den Fensterstil. |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | Setzt das Arbeitsverzeichnis des Prozesses. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
