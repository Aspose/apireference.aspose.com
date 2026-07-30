---
title: "System::Windows::Forms::IButtonControl класс"
linktitle: "IButtonControl"
second_title: "Aspose.Font для C++"
description: "System::Windows::Forms::IButtonControl класс. Пустой класс, позволяющий скомпилировать переводимый код, использующий интерфейс IButtonControl. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 300
url: /ru/cpp/system.windows.forms/ibuttoncontrol/
---
## IButtonControl class


Пустой класс, позволяющий скомпилировать переводимый код, использующий интерфейс [IButtonControl](./). Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class IButtonControl : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [get_DialogResult](./get_dialogresult/)() | Информация RTTI. |
| virtual [NotifyDefault](./notifydefault/)(bool) | Делает элемент управления стандартным или нестандартным. |
| virtual [PerformClick](./performclick/)() | Выполняет щелчок по кнопке. |
| virtual [set_DialogResult](./set_dialogresult/)(DialogResult) | Устанавливает результат диалога, связанный с кнопкой. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Windows::Forms](../)
* Library [Aspose.Font for C++](../../)
