---
title: "Aspose::Font::MultiLanguageString class"
linktitle: "MultiLanguageString"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::MultiLanguageString class. Представляет многоязычную строку в C++."
type: docs
weight: 2800
url: /ru/cpp/aspose.font/multilanguagestring/
---
## MultiLanguageString class


Представляет многоязычную строку.

```cpp
class MultiLanguageString : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [AddLanguageString](./addlanguagestring/)(System::String, int32_t) | Добавляет строку определённого языка. |
| [ContainsString](./containsstring/)(System::String) | Возвращает true, если строка присутствует во всех строках языков. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Возвращает true, если объекты считаются равными. |
| [get_IsEmpty](./get_isempty/)() | True, если у [MultiLanguageString](./) нет строк языков. |
| [GetAllLanguageIds](./getalllanguageids/)() | Получает идентификаторы языков для всех строк или пустой массив, если строки отсутствуют. |
| [GetAllStrings](./getallstrings/)() | Возвращает все строки всех языков. |
| [GetEnglishString](./getenglishstring/)() | Возвращает английскую строку, если найдена. В противном случае возвращает первую неанглийскую строку. |
| [GetHashCode](./gethashcode/)() const override | Реализация GetHashCode. |
| [GetStringForLanguageId](./getstringforlanguageid/)(int32_t) | Возвращает строку, связанную с переданным идентификатором языка, если найдена. В противном случае пустая строка. |
| [MultiLanguageString](./multilanguagestring/)() | Создаёт пустую многоязычную строку. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
