---
title: "Aspose::Page::AssemblyConstants класс"
linktitle: "AssemblyConstants"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::AssemblyConstants класс. Определяет константы, участвующие в проверке лицензии для компонента. Раньше они определялись напрямую как атрибуты сборки, но я переместил их в отдельный класс, потому что в .NET Compact Framework я не могу получить доступ к атрибутам сборки. Теперь код лицензирования, когда компилируется для .NET Compact Framework, использует эти константы вместо атрибутов сборки в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.page/assemblyconstants/
---
## AssemblyConstants class


Определяет константы, участвующие в проверке лицензии компонента. Раньше они определялись напрямую как атрибуты сборки, но я перенёс их в отдельный класс, потому что в .NET Compact Framework нельзя получить доступ к атрибутам сборки. Теперь код лицензирования, компилируемый для .NET Compact Framework, использует эти константы вместо атрибутов сборки.

```cpp
class AssemblyConstants : public System::Object
```

## Поля

| Поле | Описание |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Producer](./producer/) | Производитель выходных документов. |
| static [PRODUCT](./product/) |  |
| static [Product](./product/) | Это используется кодом лицензирования **Aspose** для проверки того, что лицензия предназначена для правильного продукта. |
| static [Product2](./product2/) | Это используется кодом лицензирования **Aspose** для проверки того, что лицензия предназначена для правильного продукта. Временно лицензия **Aspose.EPS** будет действительна и для [Aspose.Page](../). |
| static [Product3](./product3/) | Это используется кодом лицензирования **Aspose** для проверки того, что лицензия предназначена для правильного продукта. Временно лицензия Aspose.XPS будет действительна и для [Aspose.Page](../). |
| static [ReleaseDate](./releasedate/) | Это используется кодом лицензирования **Aspose** для проверки истечения срока подписки. Вам необходимо установить эту дату в дату публикации релиза или исправления. |
| static [Title](./title/) |  |
| static [VERSION](./version/) |  |
| static [Version](./version/) | Версия сборки. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
