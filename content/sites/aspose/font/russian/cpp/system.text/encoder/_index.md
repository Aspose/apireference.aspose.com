---
title: "Класс System::Text::Encoder"
linktitle: "Encoder"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::Encoder. Инкапсулирует последовательность символов в последовательность байтов. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 900
url: /ru/cpp/system.text/encoder/
---
## Encoder class


Инкапсулирует последовательность символов в последовательность байтов. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class Encoder : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Преобразует символы в байты. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Преобразует символы в байты. |
| [get_Fallback](./get_fallback/)() const | Возвращает откат обработки ошибок. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Возвращает буфер отката. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Возвращает количество байтов, необходимое для кодирования буфера. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Возвращает количество байтов, необходимое для кодирования буфера. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Получить байты, полученные в результате кодирования буфера. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Получить байты, полученные в результате кодирования буфера. |
| virtual [Reset](./reset/)() | Очищает внутреннее состояние кодировщика. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | Устанавливает откат обработки ошибок. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
