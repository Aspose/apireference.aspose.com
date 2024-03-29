---
title: ImagePixelFormat Enum
linktitle: ImagePixelFormat
articleTitle: ImagePixelFormat
second_title: Aspose.Words para .NET
description: Aspose.Words.Saving.ImagePixelFormat enumeración. Especifica el formato de píxeles para las imágenes generadas de las páginas del documento en C#.
type: docs
weight: 5220
url: /es/net/aspose.words.saving/imagepixelformat/
---
## ImagePixelFormat enumeration

Especifica el formato de píxeles para las imágenes generadas de las páginas del documento.

```csharp
public enum ImagePixelFormat
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Format16BppRgb555 | `0` | 16 bits por píxel, RGB. |
| Format16BppRgb565 | `1` | 16 bits por píxel, RGB. |
| Format16BppArgb1555 | `2` | 16 bits por píxel, ARGB. |
| Format24BppRgb | `3` | 24 bits por píxel, RGB. |
| Format32BppRgb | `4` | 32 bits por píxel, RGB. |
| Format32BppArgb | `5` | 32 bits por píxel, ARGB. |
| Format32BppPArgb | `6` | 32 bits por píxel, ARGB, alfa premultiplicado. |
| Format48BppRgb | `7` | 48 bits por píxel, RGB. |
| Format64BppArgb | `8` | 64 bits por píxel, ARGB. |
| Format64BppPArgb | `9` | 64 bits por píxel, ARGB, alfa premultiplicado. |
| Format1bppIndexed | `10` | 1 bit por píxel, indexado. |

## Ejemplos

Muestra cómo seleccionar una velocidad de bits por píxel con la que representar un documento en una imagen.

```csharp
Document doc = new Document();
            DocumentBuilder builder = new DocumentBuilder(doc);

            builder.ParagraphFormat.Style = doc.Styles["Heading 1"];
            builder.Writeln("Hello world!");
            builder.InsertImage(ImageDir + "Logo.jpg");

            Assert.That(20000, Is.LessThan(new FileInfo(ImageDir + "Logo.jpg").Length));

            // Cuando guardamos el documento como una imagen, podemos pasar un objeto SaveOptions a
            // selecciona un formato de píxel para la imagen que generará la operación de guardado.
            // Varias velocidades de bits por píxel afectarán la calidad y el tamaño del archivo de la imagen generada.
            ImageSaveOptions imageSaveOptions = new ImageSaveOptions(SaveFormat.Png);
            imageSaveOptions.PixelFormat = imagePixelFormat;

            // Podemos clonar instancias de ImageSaveOptions.
            Assert.AreNotEqual(imageSaveOptions, imageSaveOptions.Clone());

            doc.Save(ArtifactsDir + "ImageSaveOptions.PixelFormat.png", imageSaveOptions);

#if NET48 || JAVA
            switch (imagePixelFormat)
            {
                case ImagePixelFormat.Format1bppIndexed:
                    Assert.That(10000, Is.AtLeast(new FileInfo(ArtifactsDir + "ImageSaveOptions.PixelFormat.png").Length));
                    break;
                case ImagePixelFormat.Format16BppRgb555:
                    Assert.That(80000, Is.LessThan(new FileInfo(ArtifactsDir + "ImageSaveOptions.PixelFormat.png").Length));
                    break;
                case ImagePixelFormat.Format24BppRgb:
                    Assert.That(125000, Is.LessThan(new FileInfo(ArtifactsDir + "ImageSaveOptions.PixelFormat.png").Length));
                    break;
                case ImagePixelFormat.Format32BppRgb:
                    Assert.That(150000, Is.LessThan(new FileInfo(ArtifactsDir + "ImageSaveOptions.PixelFormat.png").Length));
                    break;
                case ImagePixelFormat.Format48BppRgb:
                    Assert.That(200000, Is.LessThan(new FileInfo(ArtifactsDir + "ImageSaveOptions.PixelFormat.png").Length));
                    break;
            }
#elif NET5_0_OR_GREATER
            switch (imagePixelFormat)
            {
                case ImagePixelFormat.Format1bppIndexed:
                    Assert.That(10000, Is.AtLeast(new FileInfo(ArtifactsDir + "ImageSaveOptions.PixelFormat.png").Length));
                    break;
                case ImagePixelFormat.Format24BppRgb:
                    Assert.That(70000, Is.LessThan(new FileInfo(ArtifactsDir + "ImageSaveOptions.PixelFormat.png").Length));
                    break;
                case ImagePixelFormat.Format16BppRgb555:
                case ImagePixelFormat.Format32BppRgb:
                case ImagePixelFormat.Format48BppRgb:
                    Assert.That(125000, Is.LessThan(new FileInfo(ArtifactsDir + "ImageSaveOptions.PixelFormat.png").Length));
                    break;
            }
#endif
```

### Ver también

* espacio de nombres [Aspose.Words.Saving](../../aspose.words.saving/)
* asamblea [Aspose.Words](../../)
