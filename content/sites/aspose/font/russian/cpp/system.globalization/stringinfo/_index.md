---
title: "System::Globalization::StringInfo class"
linktitle: "StringInfo"
second_title: "Aspose.Font для C++"
description: "System::Globalization::StringInfo class. Разделитель для перебора частей строки. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 2400
url: /ru/cpp/system.globalization/stringinfo/
---
## StringInfo class


Разделитель для перебора частей строки. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class StringInfo : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | Получает количество текстовых элементов в объекте [StringInfo](./). |
| [get_String](./get_string/)() const | Получает значение объекта [StringInfo](./). |
| [GetHashCode](./gethashcode/)() const override | Аналог метода C# [Object.GetHashCode()](../../system/object/gethashcode/). Позволяет хешировать пользовательские объекты. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | Получает первый элемент в указанной строке. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | Получает элемент по указанному индексу в указанной строке. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | Создаёт перечислитель для перебора символов строки. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | Создаёт перечислитель для перебора символов строки, начиная с указанного индекса. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | Получает индексы базовых символов, высоких суррогатов и управляющих символов. |
| [set_String](./set_string/)(const String\&) | Устанавливает значение объекта [StringInfo](./). |
| [StringInfo](./stringinfo/)() | Информация RTTI. |
| [StringInfo](./stringinfo/)(const String\&) | Конструктор. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | Получает подстроку текстовых элементов от указанного текстового элемента до последнего текстового элемента. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | Получает подстроку текстовых элементов от указанного текстового элемента до указанного количества текстовых элементов. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
