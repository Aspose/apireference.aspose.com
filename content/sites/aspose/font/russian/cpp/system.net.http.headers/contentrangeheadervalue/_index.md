---
title: "System::Net::Http::Headers::ContentRangeHeaderValue класс"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Font для C++"
description: "System::Net::Http::Headers::ContentRangeHeaderValue класс. Представляет значение заголовка ''Content-Range''. Объекты этого класса должны быть выделены только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 400
url: /ru/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


Представляет значение заголовка 'Content-Range'. Объекты этого класса должны быть выделены только с помощью функции [System::MakeObject()](../../system/makeobject/) . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## Методы

| Метод | Описание |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | Создаёт новый экземпляр. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | Создаёт новый экземпляр. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | Создаёт новый экземпляр. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Сравнивает объекты, используя семантику C# [Object.Equals](../../system/object/equals/). |
| [get_From](./get_from/)() | Получает позицию, с которой должно начаться отправление данных. |
| [get_HasLength](./get_haslength/)() const | Получает значение, указывающее, указана ли длина для текущего заголовка. |
| [get_HasRange](./get_hasrange/)() const | Получает значение, указывающее, задан ли диапазон для текущего заголовка. |
| [get_Length](./get_length/)() | Получает длину тела сущности. |
| [get_To](./get_to/)() | Получает позицию, на которой должна прекратиться передача данных. |
| [get_Unit](./get_unit/)() | Информация RTTI. |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Преобразует переданную строку, начиная с указанной позиции, в экземпляр класса [ContentRangeHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Аналог метода C# [Object.GetHashCode()](../../system/object/gethashcode/). Позволяет хешировать пользовательские объекты. |
| static [Parse](./parse/)(String) | Преобразует переданную строку в экземпляр класса [ContentRangeHeaderValue](./). |
| [set_Unit](./set_unit/)(String) | Устанавливает единицы измерения, используемые в диапазоне. |
| [ToString](./tostring/)() const override | Аналог метода C# [Object.ToString()](../../system/object/tostring/). Позволяет преобразовывать пользовательские объекты в строку. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | Пытается преобразовать переданную строку в экземпляр класса [ContentRangeHeaderValue](./). |
## См. также

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
