---
title: "System::Text::DecoderFallback класс"
linktitle: "DecoderFallback"
second_title: "Aspose.Font для C++"
description: "System::Text::DecoderFallback класс. Предоставляет API отката для обработки ошибок декодирования. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 500
url: /ru/cpp/system.text/decoderfallback/
---
## DecoderFallback class


Предоставляет API отката для обработки ошибок декодирования. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class DecoderFallback : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | Получает буфер, связанный с резервным алгоритмом. |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | Получает реализацию резервного механизма исключения по умолчанию. |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | Получает максимальное количество символов, которые может вернуть резервный механизм. |
| static [get_ReplacementFallback](./get_replacementfallback/)() | Получает реализацию резервного механизма замены по умолчанию. |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | Получает реализацию стандартного безопасного резервного механизма по умолчанию. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
