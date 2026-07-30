---
title: "Класс Aspose::Font::CffDataProviders::NameIndexDataProvider"
linktitle: "NameIndexDataProvider"
second_title: "Aspose.Font для C++"
description: "Класс Aspose::Font::CffDataProviders::NameIndexDataProvider. Объявляет функциональность для доступа к структуре CFF Name INDEX в C++."
type: docs
weight: 500
url: /ru/cpp/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class


Объявляет функциональность для доступа к структуре CFF Name INDEX.

```cpp
class NameIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [AddName](./addname/)(System::String) | Добавляет имя шрифта в структуру Name INDEX. Используйте этот метод с осторожностью, поскольку каждое имя шрифта в структуре CFF Name INDEX должно иметь соответствующую структуру DICT в индексе Top DICT согласно спецификации CFF. |
| virtual [get_Count](./get_count/)() | Количество объектов в структуре CFF INDEX. |
| virtual [GetName](./getname/)(int32_t) | Получает имя шрифта по указанному индексу. |
| virtual [GetRawBytes](./getrawbytes/)() | Получает все байты структуры CFF INDEX. |
| virtual [idx_get](./idx_get/)(int32_t) | Получает/устанавливает имя шрифта по указанному индексу. |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | Получает/устанавливает имя шрифта по указанному индексу. |
| virtual [RemoveName](./removename/)(int32_t) | Удаляет имя по указанному индексу. Используйте этот метод с осторожностью, поскольку каждое имя шрифта в структуре CFF Name INDEX должно иметь соответствующую структуру DICT в индексе Top DICT согласно спецификации CFF. |
| virtual [SetName](./setname/)(System::String, int32_t) | Устанавливает имя шрифта по указанному индексу. |
## См. также

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
