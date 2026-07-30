---
title: "Aspose::Font::AssemblyConstants класс"
linktitle: "AssemblyConstants"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::AssemblyConstants класс. Определяет константы, участвующие в проверке лицензии компонента. Раньше они определялись напрямую как атрибуты сборки, но я перенёс их в отдельный класс, потому что в .NET Compact Framework я не могу получить доступ к атрибутам сборки. Теперь код лицензирования, компилируемый для .NET Compact Framework, использует эти константы вместо атрибутов сборки в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font/assemblyconstants/
---
## AssemblyConstants class


Определяет константы, участвующие в проверке лицензии компонента. Раньше они определялись напрямую как атрибуты сборки, но я перенёс их в отдельный класс, потому что в .NET Compact Framework я не могу получить доступ к атрибутам сборки. Теперь код лицензирования, когда компилируется для .NET Compact Framework, использует эти константы вместо атрибутов сборки.

```cpp
class AssemblyConstants
```

## Методы

| Метод | Описание |
| --- | --- |
| [AssemblyConstants](./assemblyconstants/)() |  |
## Поля

| Поле | Описание |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Product](./product/) | Это используется кодом лицензирования **Aspose**, чтобы проверить, что лицензия предназначена для правильного продукта. |
| static [ReleaseDate](./releasedate/) | Это используется кодом лицензирования **Aspose**, чтобы проверить истечение срока подписки. Вам нужно установить это на дату публикации релиза или исправления. |
| static [Title](./title/) |  |
| static [Version](./version/) | Версия сборки. |
## См. также

* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
