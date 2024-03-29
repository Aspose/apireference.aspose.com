---
title: IsCompactPalette
second_title: Справочник по Aspose.Imaging for .NET API
description: Получает или задает значение указывающее используется ли компактная палитра.
type: docs
weight: 60
url: /ru/net/aspose.imaging/colorpalette/iscompactpalette/
---
## ColorPalette.IsCompactPalette property

Получает или задает значение, указывающее, используется ли компактная палитра.

```csharp
public bool IsCompactPalette { get; }
```

### Стоимость имущества

`истинный` если используется компактная палитра; в противном случае,`ЛОЖЬ`.

### Примечания

Компактная палитра означает, что изображение будет содержать только указанные элементы палитры, если это возможно, или, другими словами, изображение будет более компактным и занимать меньше места; в противном случае будет 2^BitsPerPixel элементов, и изображение будет резервировать больше места для всех возможных элементов палитры. Установка этого значения в true и изменение элементов палитры может привести к снижению производительности, поскольку может произойти перемещение данных, поэтому используйте его осторожно.

### Смотрите также

* class [ColorPalette](../../colorpalette)
* пространство имен [Aspose.Imaging](../../colorpalette)
* сборка [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
