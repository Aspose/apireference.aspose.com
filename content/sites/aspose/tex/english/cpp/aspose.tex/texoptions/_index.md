---
title: Aspose::TeX::TeXOptions class
linktitle: TeXOptions
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::TeXOptions class. TeX file processing options class in C++.'
type: docs
weight: 900
url: /cpp/aspose.tex/texoptions/
---
## TeXOptions class


[TeX](../) file processing options class.

```cpp
class TeXOptions : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| static [ConsoleAppOptions](./consoleappoptions/)(System::SharedPtr\<TeXConfig\>) | Returns options for use in a console application. |
| [get_DateTime](./get_datetime/)() const | Gets/sets a certain value for date/time primitives like \year, \month, \day and \time. |
| [get_Executables](./get_executables/)() const | A customizable collection of objects that emulate executables, which can be executed using the \write18 commands in Object [TeX](../). |
| [get_FullInputFileNames](./get_fullinputfilenames/)() const | Gets/sets the flag indicating whether full or short filenames are output to the transcript file and to the terminal when file input begins. |
| [get_IgnoreMissingPackages](./get_ignoremissingpackages/)() const | Gets/sets the flag that instructs the engine whether to halt on missing package read attempt or ignore it. |
| [get_InputWorkingDirectory](./get_inputworkingdirectory/)() const | Gets/sets input working directory. |
| [get_Interaction](./get_interaction/)() const | Gets/sets the interaction mode to run a [TeX](../) engine in. |
| [get_JobName](./get_jobname/)() const | Gets/set the name of the job. |
| [get_NoLigatures](./get_noligatures/)() const | Gets/sets the flag that cancels ligatures in all fonts. |
| [get_OutputWorkingDirectory](./get_outputworkingdirectory/)() const | Gets/sets output working directory. |
| [get_Repeat](./get_repeat/)() const | Gets/sets the flag that indicates whether it is necessary to run the [TeX](../) job twice in case, for example, there are references in input [TeX](../) file(s). In general, this behavior is useful when the engine collects some data along the typesetting process and stores it in an auxilliary file, all at the first run. And at the second run, the engine somehow uses that data. |
| [get_RequiredInputDirectory](./get_requiredinputdirectory/)() const | Gets/sets the directory for the required input, e.g., packages that are beyond [Aspose.TeX](../)'s LaTeX support. |
| [get_SaveOptions](./get_saveoptions/)() const | Gets/sets options used for rendering into destination format (XPS, PDF, image, etc.). Default value is the set of default options for rendering to XPS. |
| [get_ShellMode](./get_shellmode/)() const | Determines the availability of \write18. |
| [get_TerminalIn](./get_terminalin/)() const | Gets/sets the input terminal reader. |
| [get_TerminalOut](./get_terminalout/)() const | Gets/sets the output terminal writer. |
| [get_ToApsConverter](./get_toapsconverter/)() const |  |
| [set_DateTime](./set_datetime/)(System::DateTime) | Gets/sets a certain value for date/time primitives like \year, \month, \day and \time. |
| [set_FullInputFileNames](./set_fullinputfilenames/)(bool) | Gets/sets the flag indicating whether full or short filenames are output to the transcript file and to the terminal when file input begins. |
| [set_IgnoreMissingPackages](./set_ignoremissingpackages/)(bool) | Gets/sets the flag that instructs the engine whether to halt on missing package read attempt or ignore it. |
| [set_InputWorkingDirectory](./set_inputworkingdirectory/)(System::SharedPtr\<IO::IInputWorkingDirectory\>) | Gets/sets input working directory. |
| [set_Interaction](./set_interaction/)(Aspose::TeX::Interaction) | Gets/sets the interaction mode to run a [TeX](../) engine in. |
| [set_JobName](./set_jobname/)(System::String) | Gets/set the name of the job. |
| [set_NoLigatures](./set_noligatures/)(bool) | Gets/sets the flag that cancels ligatures in all fonts. |
| [set_OutputWorkingDirectory](./set_outputworkingdirectory/)(System::SharedPtr\<IO::IOutputWorkingDirectory\>) | Gets/sets output working directory. |
| [set_Repeat](./set_repeat/)(bool) | Gets/sets the flag that indicates whether it is necessary to run the [TeX](../) job twice in case, for example, there are references in input [TeX](../) file(s). In general, this behavior is useful when the engine collects some data along the typesetting process and stores it in an auxilliary file, all at the first run. And at the second run, the engine somehow uses that data. |
| [set_RequiredInputDirectory](./set_requiredinputdirectory/)(System::SharedPtr\<IO::IInputWorkingDirectory\>) | Gets/sets the directory for the required input, e.g., packages that are beyond [Aspose.TeX](../)'s LaTeX support. |
| [set_SaveOptions](./set_saveoptions/)(System::SharedPtr\<Aspose::TeX::Presentation::SaveOptions\>) | Gets/sets options used for rendering into destination format (XPS, PDF, image, etc.). Default value is the set of default options for rendering to XPS. |
| [set_ShellMode](./set_shellmode/)(Aspose::TeX::ShellMode) | Determines the availability of \write18. |
| [set_TerminalIn](./set_terminalin/)(System::SharedPtr\<IO::IInputTerminal\>) | Gets/sets the input terminal reader. |
| [set_TerminalOut](./set_terminalout/)(System::SharedPtr\<IO::IOutputTerminal\>) | Gets/sets the output terminal writer. |
| [set_ToApsConverter](./set_toapsconverter/)(System::SharedPtr\<Reading::Object::IToApsConverter\>) |  |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::TeX](../)
* Library [Aspose.TeX for C++](../../)
