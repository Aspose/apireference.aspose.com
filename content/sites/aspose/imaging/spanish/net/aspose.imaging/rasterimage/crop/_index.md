---
title: Crop
second_title: Aspose.Imaging para la referencia de la API de .NET
description: Recorta el rectángulo especificado.
type: docs
weight: 250
url: /es/net/aspose.imaging/rasterimage/crop/
---
## Crop(Rectangle) {#crop}

Recorta el rectángulo especificado.

```csharp
public virtual void Crop(Rectangle rectangle)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| rectangle | Rectangle | el rectángulo |

### Ejemplos

El siguiente ejemplo recorta una imagen ráster. El área de recorte se especifica a través de Aspose.Imaging.Rectangle.

```csharp
[C#]

string dir = @"c:\temp\";

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dir + "sample.png"))
{
    Aspose.Imaging.RasterImage rasterImage = (Aspose.Imaging.RasterImage)image;

    // Recortar la imagen. El área de recorte es el área central rectangular de la imagen.
    Aspose.Imaging.Rectangle area = new Aspose.Imaging.Rectangle(rasterImage.Width / 4, rasterImage.Height / 4, rasterImage.Width / 2, rasterImage.Height / 2);
    rasterImage.Crop(area);

    // Guardar la imagen recortada en PNG
    rasterImage.Save(dir + "sample.Crop.png");
}
```

### Ver también

* struct [Rectangle](../../rectangle)
* class [RasterImage](../../rasterimage)
* espacio de nombres [Aspose.Imaging](../../rasterimage)
* asamblea [Aspose.Imaging](../../../)

---

## Crop(int, int, int, int) {#crop_1}

Recortar imagen con turnos.

```csharp
public virtual void Crop(int leftShift, int rightShift, int topShift, int bottomShift)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| leftShift | Int32 | El desplazamiento a la izquierda. |
| rightShift | Int32 | El cambio correcto. |
| topShift | Int32 | El turno superior. |
| bottomShift | Int32 | El cambio de fondo. |

### Ejemplos

El siguiente ejemplo recorta una imagen ráster. El área de recorte se especifica a través de los márgenes izquierdo, superior, derecho e inferior.

```csharp
[C#]

string dir = @"c:\temp\";

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dir + "sample.png"))
{
    Aspose.Imaging.RasterImage rasterImage = (Aspose.Imaging.RasterImage)image;

    // Recortar de nuevo. Establezca un margen del 10% del tamaño de la imagen.
    int horizontalMargin = rasterImage.Width / 10;
    int verticalMargin = rasterImage.Height / 10;
    rasterImage.Crop(horizontalMargin, horizontalMargin, verticalMargin, verticalMargin);

    // Guarda la imagen recortada en PNG.
    rasterImage.Save(dir + "sample.Crop.png");
}
```

### Ver también

* class [RasterImage](../../rasterimage)
* espacio de nombres [Aspose.Imaging](../../rasterimage)
* asamblea [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
