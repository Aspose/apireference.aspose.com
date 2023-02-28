---
title: Class RecognitionResult
second_title: Referencia de API de Aspose.OCR para .NET
description: Aspose.OCR.RecognitionResult clase. Los resultados del reconocimiento de imágenes. Contiene elementos con información de reconocimiento y métodos para la exportación de resultados.
type: docs
weight: 220
url: /es/net/aspose.ocr/recognitionresult/
---
## RecognitionResult class

Los resultados del reconocimiento de imágenes. Contiene elementos con información de reconocimiento y métodos para la exportación de resultados.

```csharp
public class RecognitionResult
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Image](../../aspose.ocr/recognitionresult/image/) { get; set; } | Obtiene o establece la imagen para la creación de pdf. |
| [RecognitionAreasRectangles](../../aspose.ocr/recognitionresult/recognitionareasrectangles/) { get; } | Obtiene las coordenadas de los rectángulos. |
| [RecognitionAreasText](../../aspose.ocr/recognitionresult/recognitionareastext/) { get; } | Obtiene resultados de reconocimiento de lista de una lista de áreas (Rectángulos). |
| [RecognitionCharactersList](../../aspose.ocr/recognitionresult/recognitioncharacterslist/) { get; } | Un conjunto de caracteres encontrados por el algoritmo de reconocimiento y dispuestos en orden descendente de probabilidad. |
| [RecognitionLinesResult](../../aspose.ocr/recognitionresult/recognitionlinesresult/) { get; } | Obtiene una lista de resultados de reconocimiento con una lista de filas (Rectángulos). |
| [RecognitionText](../../aspose.ocr/recognitionresult/recognitiontext/) { get; } | Obtiene el resultado del reconocimiento en una cadena. |
| [Skew](../../aspose.ocr/recognitionresult/skew/) { get; } | Obtiene el ángulo de inclinación. |
| [Warnings](../../aspose.ocr/recognitionresult/warnings/) { get; } | Obtiene una lista de los mensajes de advertencia que describen fallas no críticas que aparecieron durante la generación. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [GetJson](../../aspose.ocr/recognitionresult/getjson/)(bool) | Cadena JSON de formulario con resultados de reconocimiento. |
| [GetSpellCheckCorrectedText](../../aspose.ocr/recognitionresult/getspellcheckcorrectedtext/)(SpellCheckLanguage, string) | Corrige texto (reemplaza palabras mal escritas). |
| [GetSpellCheckErrorList](../../aspose.ocr/recognitionresult/getspellcheckerrorlist/)(SpellCheckLanguage, string) | Encuentra las palabras mal escritas con ortografías sugeridas para un texto de entrada dado. |
| [GetXml](../../aspose.ocr/recognitionresult/getxml/)() | Cadena XML de formulario con resultados de reconocimiento. |
| [Save](../../aspose.ocr/recognitionresult/save/#save)(MemoryStream, SaveFormat, bool, SpellCheckLanguage, string) | Guarda el documento como texto sin formato, PDF o documento de Microsoft Word. |
| [Save](../../aspose.ocr/recognitionresult/save/#save_1)(string, SaveFormat, bool, SpellCheckLanguage, string) | Guarda el documento como texto sin formato, PDF o documento de Microsoft Word. |
| [operator +](../../aspose.ocr/recognitionresult/op_addition/) | Para completar el resultado completo a partir de fragmentos reconocidos (líneas). |

## Otros miembros

| Nombre | Descripción |
| --- | --- |
| class [LinesResult](recognitionresult.linesresult/) | Texto reconocido de fila con coordenadas de fila. |

### Ver también

* espacio de nombres [Aspose.OCR](../../aspose.ocr/)
* asamblea [Aspose.OCR](../../)


