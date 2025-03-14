---
title: AsposeOcr.GetRectangles
second_title: Referencia de API de Aspose.OCR para .NET
description: AsposeOcr método. Detecta áreas de texto en la imagen.  No se aplica la corrección automática de la inclinación de la imagen. Admite GIF PNG JPEG BMP TIFF JFIF.
type: docs
weight: 70
url: /es/net/aspose.ocr/asposeocr/getrectangles/
---
## GetRectangles(string, AreasType, bool) {#getrectangles_1}

Detecta áreas de texto en la imagen.  No se aplica la corrección automática de la inclinación de la imagen. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(string fullPath, AreasType areasType = AreasType.PARAGRAPHS, 
    bool detectAreas = true)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| fullPath | String | Camino a la imagen. |
| areasType | AreasType | Determina qué rectángulos devolver: línea o párrafo. |
| detectAreas | Boolean | Habilite la detección automática de áreas de texto. |

### Valor_devuelto

Lista de áreas o líneas de texto detectadas.

### Ver también

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)

---

## GetRectangles(MemoryStream, AreasType, bool) {#getrectangles}

Detecta áreas de texto en la imagen.  No se aplica la corrección automática de la inclinación de la imagen. Admite GIF, PNG, JPEG, BMP, TIFF, JFIF.

```csharp
public List<Rectangle> GetRectangles(MemoryStream image, 
    AreasType areasType = AreasType.PARAGRAPHS, bool detectAreas = true)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| image | MemoryStream | Flujo de memoria que contiene la imagen. |
| areasType | AreasType | Determina qué rectángulos devolver: línea o párrafo. |
| detectAreas | Boolean | Habilite la detección automática de áreas de texto. |

### Valor_devuelto

Lista de áreas o líneas de texto detectadas.

### Ver también

* enum [AreasType](../../areastype/)
* class [AsposeOcr](../)
* espacio de nombres [Aspose.OCR](../../asposeocr/)
* asamblea [Aspose.OCR](../../../)


