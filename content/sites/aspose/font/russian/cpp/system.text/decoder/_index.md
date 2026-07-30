---
title: "Класс System::Text::Decoder"
linktitle: "Decoder"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::Decoder. Инкапсулирует декодирование последовательности байтов в последовательность символов. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 200
url: /ru/cpp/system.text/decoder/
---
## Decoder class


Инкапсулирует декодирование последовательности байтов в последовательность символов. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class Decoder : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Преобразует байты в символы. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Преобразует байты в символы. |
| [get_Fallback](./get_fallback/)() const | Возвращает откат обработки ошибок. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Возвращает буфер отката. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Возвращает количество символов, необходимое для декодирования буфера. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Возвращает количество символов, необходимое для декодирования буфера. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Возвращает количество символов, необходимое для декодирования буфера. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Получить символы, полученные в результате декодирования буфера. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Получить символы, полученные в результате декодирования буфера. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Получить символы, полученные в результате декодирования буфера. |
| virtual [Reset](./reset/)() | Очищает внутреннее состояние декодера. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | Устанавливает откат обработки ошибок. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
