---
title: GetThumbnail
second_title: Справочник по API Aspose.Slides для .NET
description: Возвращает миниатюру формы. ShapeThumbnailBounds.Тип границ эскиза фигуры Shape используется по умолчанию.
type: docs
weight: 300
url: /ru/net/aspose.slides/ishape/getthumbnail/
---
## GetThumbnail() {#getthumbnail}

Возвращает миниатюру формы. ShapeThumbnailBounds.Тип границ эскиза фигуры Shape используется по умолчанию.

```csharp
public Bitmap GetThumbnail()
```

### Возвращаемое значение

Миниатюра формы.

### Смотрите также

* interface [IShape](../../ishape)
* пространство имен [Aspose.Slides](../../ishape)
* сборка [Aspose.Slides](../../../)

---

## GetThumbnail(ShapeThumbnailBounds, float, float) {#getthumbnail_1}

Возвращает миниатюру формы.

```csharp
public Bitmap GetThumbnail(ShapeThumbnailBounds bounds, float scaleX, float scaleY)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| bounds | ShapeThumbnailBounds | Тип границ эскиза формы. |
| scaleX | Single | Масштаб X |
| scaleY | Single | Масштаб Y |

### Возвращаемое значение

Миниатюра формы или null в случае, если используется ShapeThumbnailBounds.Appearance и фигура не имеет видимых элементов.

### Смотрите также

* enum [ShapeThumbnailBounds](../../shapethumbnailbounds)
* interface [IShape](../../ishape)
* пространство имен [Aspose.Slides](../../ishape)
* сборка [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
