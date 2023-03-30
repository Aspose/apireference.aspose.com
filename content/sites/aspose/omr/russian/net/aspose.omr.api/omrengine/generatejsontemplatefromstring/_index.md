---
title: OmrEngine.GenerateJSONTemplateFromString
second_title: Справочник по Aspose.OMR для .NET API
description: OmrEngine метод. Создает шаблон .omr и изображение шаблона на основе разметки JSON
type: docs
weight: 30
url: /ru/net/aspose.omr.api/omrengine/generatejsontemplatefromstring/
---
## OmrEngine.GenerateJSONTemplateFromString method

Создает шаблон (.omr) и изображение шаблона на основе разметки JSON

```csharp
public GenerationResult GenerateJSONTemplateFromString(string jsonString, 
    GlobalPageSettings settings = null, ImageCollection userImages = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| jsonString | String | JSON-разметка |
| settings | GlobalPageSettings | глобальные настройки, используемые при генерации всех шаблонов |
| userImages | ImageCollection | Коллекция изображений, которые можно использовать для создания шаблона. Разрешить использовать образы из MemoryStream вместо файловой системы |

### Возвращаемое значение

Результат генерации

### Смотрите также

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* пространство имен [Aspose.OMR.Api](../../omrengine/)
* сборка [Aspose.OMR](../../../)


