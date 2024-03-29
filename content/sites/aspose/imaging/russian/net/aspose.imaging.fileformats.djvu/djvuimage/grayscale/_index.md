---
title: Grayscale
second_title: Справочник по Aspose.Imaging for .NET API
description: Преобразование изображения в его представление в градациях серого
type: docs
weight: 250
url: /ru/net/aspose.imaging.fileformats.djvu/djvuimage/grayscale/
---
## DjvuImage.Grayscale method

Преобразование изображения в его представление в градациях серого

```csharp
public override void Grayscale()
```

### Примеры

В следующем примере цветное изображение DJVU преобразуется в его представление в градациях серого. Изображения в градациях серого состоят исключительно из оттенков серого и несут только информацию об интенсивности.

```csharp
[C#]

string dir = "c:\\temp\\";

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dir + "sample.djvu"))
{
    Aspose.Imaging.FileFormats.Djvu.DjvuImage djvuImage = (Aspose.Imaging.FileFormats.Djvu.DjvuImage)image;

    djvuImage.Grayscale();
    djvuImage.Save(dir + "sample.Grayscale.png", new Aspose.Imaging.ImageOptions.PngOptions());
}
```

### Смотрите также

* class [DjvuImage](../../djvuimage)
* пространство имен [Aspose.Imaging.FileFormats.Djvu](../../djvuimage)
* сборка [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
