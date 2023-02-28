---
title: AsposeOcr.GetRectangles
second_title: Справочник по Aspose.OCR для .NET API
description: AsposeOcr метод. Обнаруживает текстовые области на изображении.  Автоматическая коррекция перекоса изображения не применяется. Поддерживает GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 70
url: /ru/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

Обнаруживает текстовые области на изображении.  Автоматическая коррекция перекоса изображения не применяется. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| fullPath | String | Путь к изображению. |
| areasType | AreasType | Определяет, какие прямоугольники возвращать — строки или абзацы. |
| detectAreas | Boolean | Включить автоматическое обнаружение текстовых областей. |

### Возвращаемое значение

Список обнаруженных текстовых областей или строк.

### Смотрите также

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

Обнаруживает текстовые области на изображении.  Автоматическая коррекция перекоса изображения не применяется. Поддерживает GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| image | MemoryStream | Поток памяти, содержащий изображение. |
| areasType | AreasType | Определяет, какие прямоугольники возвращать — строки или абзацы. |
| detectAreas | Boolean | Включить автоматическое обнаружение текстовых областей. |

### Возвращаемое значение

Список обнаруженных текстовых областей или строк.

### Смотрите также

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* пространство имен [Aspose.OCR](../../asposeocr/)
* сборка [Aspose.OCR](../../../)


