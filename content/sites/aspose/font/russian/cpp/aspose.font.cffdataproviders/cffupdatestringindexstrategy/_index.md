---
title: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum"
linktitle: "CffUpdateStringIndexStrategy"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum. Указывает, как добавлять строки в хранилище CFF String INDEX. Когда мы пытаемся добавить строку в CFF String INDEX, может возникнуть ситуация, когда эта строка уже присутствует в String INDEX. Используя параметр SearchForDuplicates, мы можем принудительно выполнить поиск по String INDEX, чтобы определить, присутствует ли эта строка уже или нет. Этот подход экономит место в структуре String INDEX, но требует больше времени для добавления строки в C++."
type: docs
weight: 1000
url: /ru/cpp/aspose.font.cffdataproviders/cffupdatestringindexstrategy/
---
## CffUpdateStringIndexStrategy enum


Указывает, как добавлять строки в хранилище CFF String INDEX. Когда мы пытаемся добавить строку в CFF String INDEX, может возникнуть ситуация, когда эта строка уже присутствует в String INDEX. Используя параметр [SearchForDuplicates](./), мы можем принудительно выполнить поиск по String INDEX, чтобы определить, присутствует ли эта строка уже или нет. Этот подход экономит место в структуре String INDEX, но требует больше времени для добавления строки.

```cpp
enum class CffUpdateStringIndexStrategy
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| SearchForDuplicates | 0 | Указывает, что поиск строки для добавления должен выполняться в структуре String INDEX, чтобы избежать дублирования. |
| AddStringAsIs | 1 | Указывает, что при добавлении строки не следует выполнять проверку на дубликаты. Этот подход работает быстрее, но может привести к неэффективному использованию памяти для String INDEX. |

## См. также

* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
