---
title: RecognitionSettings.RecognitionSettings
second_title: Referencia de API de Aspose.OCR para .NET
description: RecognitionSettings constructor. Inicializa una nueva instancia delRecognitionSettingsclase con conjunto completo de propiedades.
type: docs
weight: 10
url: /es/net/aspose.ocr/recognitionsettings/recognitionsettings/
---
## RecognitionSettings constructor

Inicializa una nueva instancia del[`RecognitionSettings`](../)clase con conjunto completo de propiedades.

```csharp
public RecognitionSettings(Language language = Language.None, 
    List<Rectangle> recognitionAreas = null, bool detectAreas = true, bool autoSkew = true, 
    float skewAngle = 0, bool recognizeSingleLine = false, int threshold = 0)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| language | Language | Idioma utilizado para OCR. |
| recognitionAreas | List`1 | Configure manualmente las áreas para el reconocimiento. Nulo de forma predeterminada: significa que se procesa la imagen completa. |
| detectAreas | Boolean | Habilite la detección automática de áreas de texto. |
| autoSkew | Boolean | Habilite la corrección automática de la inclinación de la imagen. |
| skewAngle | Single | Ajuste el ángulo para la rotación de la imagen. |
| recognizeSingleLine | Boolean | Para imágenes de una sola línea |
| threshold | Int32 | Umbral de binarización de imágenes personalizadas |

### Ver también

* enum [Language](../../language/)
* class [RecognitionSettings](../)
* espacio de nombres [Aspose.OCR](../../recognitionsettings/)
* asamblea [Aspose.OCR](../../../)


