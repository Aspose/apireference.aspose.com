---
title: "System::Diagnostics::Process class"
linktitle: "Process"
second_title: "Aspose.Page для C++"
description: "System::Diagnostics::Process class. Инкапсулирует информацию о процессе и его управление. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 300
url: /ru/cpp/system.diagnostics/process/
---
## Process class


Инкапсулирует информацию о процессе и его управление. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class Process : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | Получает, следует ли генерировать событие Exited, когда процесс завершается. |
| [get_ExitCode](./get_exitcode/)() const | Получает код завершения процесса. |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | Получает размер приватного набора памяти процесса. |
| [get_ProcessName](./get_processname/)() const | Получает имя процесса. |
| [get_StandardError](./get_standarderror/)() const | Предоставляет читатель для чтения вывода ошибок процесса. Не реализовано. |
| [get_StandardOutput](./get_standardoutput/)() const | Предоставляет читатель для чтения стандартного вывода процесса. Не реализовано. |
| [get_StartInfo](./get_startinfo/)() const | Получает информацию о запуске процесса. |
| [get_WorkingSet64](./get_workingset64/)() const | Получает размер рабочей памяти процесса. |
| static [GetCurrentProcess](./getcurrentprocess/)() | Получает информацию о текущем процессе. Только [Windows](../../system.windows/) только. |
| [GetOutputText](./getoutputtext/)() const | Получает текст вывода процесса. |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | Устанавливает, должно ли событие Exited быть вызвано при завершении процесса. |
| [Start](./start/)() | Запускает процесс с предопределёнными параметрами. |
| static [Start](./start/)(const String\&, const String\&) | Запускает процесс с указанным путём и аргументами. |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | Запускает процесс с указанным путём и аргументами. |
| [WaitForExit](./waitforexit/)(int) | Ожидает завершения процесса. Не реализовано. |
| [WaitForExit](./waitforexit/)() | Ожидает завершения процесса, не возвращается, пока он не завершится. |
| virtual [~Process](./~process/)() | Деструктор. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
