---
title: OmrEngine.GenerateTemplate
second_title: Справочник по Aspose.OMR для .NET API
description: OmrEngine метод. Создает шаблон .omr и образ шаблона на основе MemoryStream
type: docs
weight: 40
url: /ru/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

Создает шаблон (.omr) и образ шаблона на основе MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток, содержащий строки разметки |
| settings | GlobalPageSettings | Глобальные настройки, применимые ко всем элементам страницы |
| userImages | ImageCollection | Коллекция изображений, которые можно использовать для создания шаблона. Разрешить использовать образы из MemoryStream вместо файловой системы |
| encoding | Encoding | кодировка строк разметки, по умолчанию используется UTF-8 |

### Возвращаемое значение

Результат генерации

### Смотрите также

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* пространство имен [Aspose.OMR.Api](../../omrengine/)
* сборка [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

Создает шаблон (.omr) и образ шаблона на основе MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| stream | MemoryStream | Поток, содержащий строки разметки |
| userImages | ImageCollection | Коллекция изображений, которые можно использовать для создания шаблона. Разрешить использовать образы из MemoryStream вместо файловой системы |
| encoding | Encoding | кодировка строк разметки, по умолчанию используется UTF-8 |

### Возвращаемое значение

Результат генерации

### Смотрите также

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* пространство имен [Aspose.OMR.Api](../../omrengine/)
* сборка [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Создает шаблон (.omr) и изображение шаблона на основе массива строк разметки

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| markupLines | String[] | Массив строк разметки |
| settings | GlobalPageSettings | Глобальные настройки, применимые ко всем элементам страницы |
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

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Создает шаблон (.omr) и изображение шаблона на основе массива строк разметки

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| markupLines | String[] | Массив строк разметки |
| userImages | ImageCollection | Коллекция изображений, которые можно использовать для создания шаблона. Разрешить использовать образы из MemoryStream вместо файловой системы |

### Возвращаемое значение

Результат генерации

### Смотрите также

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* пространство имен [Aspose.OMR.Api](../../omrengine/)
* сборка [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

Создает шаблон (.omr) и изображение шаблона на основе текстовой разметки

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| markupPath | String | Путь к файлу текстовой разметки |
| settings | GlobalPageSettings | Глобальные настройки, применимые ко всем элементам страницы |
| encoding | Encoding | кодировка файла разметки, по умолчанию используется UTF-8 |

### Возвращаемое значение

Результат генерации

### Смотрите также

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* пространство имен [Aspose.OMR.Api](../../omrengine/)
* сборка [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

Создает шаблон (.omr) и изображение шаблона на основе текстовой разметки

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| markupPath | String | Путь к файлу текстовой разметки |
| encoding | Encoding | кодировка файла разметки, по умолчанию используется UTF-8 |

### Возвращаемое значение

Результат генерации

### Смотрите также

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* пространство имен [Aspose.OMR.Api](../../omrengine/)
* сборка [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

Создает шаблон (.omr) и изображение шаблона на основе текстовой разметки

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| markupPath | String | Путь к файлу текстовой разметки |
| imagesPaths | String[] | Полные пути к изображениям, используемым при генерации |
| encoding | Encoding | кодировка файла разметки, по умолчанию используется UTF-8 |

### Возвращаемое значение

Результат генерации

### Смотрите также

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* пространство имен [Aspose.OMR.Api](../../omrengine/)
* сборка [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Создает шаблон (.omr) и изображение шаблона на основе Template object

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| config | TemplateConfig | Объект шаблона, представляющий все элементы |
| settings | GlobalPageSettings | глобальные настройки, используемые при генерации всех шаблонов |
| userImages | ImageCollection | Коллекция изображений, которые можно использовать для создания шаблона. Разрешить использовать образы из MemoryStream вместо файловой системы |

### Возвращаемое значение

Результат генерации

### Смотрите также

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* пространство имен [Aspose.OMR.Api](../../omrengine/)
* сборка [Aspose.OMR](../../../)


