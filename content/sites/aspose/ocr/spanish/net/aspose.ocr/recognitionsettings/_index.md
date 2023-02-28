---
title: Class RecognitionSettings
second_title: Referencia de API de Aspose.OCR para .NET
description: Aspose.OCR.RecognitionSettings clase. Configuración para el reconocimiento de imágenes. Contiene elementos que permiten personalizar el proceso de reconocimiento.
type: docs
weight: 240
url: /es/net/aspose.ocr/recognitionsettings/
---
## RecognitionSettings class

Configuración para el reconocimiento de imágenes. Contiene elementos que permiten personalizar el proceso de reconocimiento.

```csharp
public class RecognitionSettings : BaseRecognitionSettings
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [RecognitionSettings](recognitionsettings/)(Language, List&lt;Rectangle&gt;, bool, bool, float, bool, int) | Inicializa una nueva instancia del`RecognitionSettings`clase con conjunto completo de propiedades. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/baserecognitionsettings/allowedcharacters/) { get; set; } | Conjunto de caracteres permitidos. Determina el tipo de caracteres permitidos para el resultado del reconocimiento. |
| [AutoContrast](../../aspose.ocr/baserecognitionsettings/autocontrast/) { get; set; } | Permite utilizar un algoritmo de corrección de contraste adicional para la imagen antes del reconocimiento. |
| [AutoDenoising](../../aspose.ocr/baserecognitionsettings/autodenoising/) { get; set; } | Permite el uso de una red neuronal adicional para mejorar la imagen: reduce el ruido. Útil para imágenes con artefactos de escaneo, distorsión, puntos, destellos, degradados, elementos extraños. |
| [AutoSkew](../../aspose.ocr/baserecognitionsettings/autoskew/) { set; } | Obtiene o establece un indicador que indica si se debe habilitar la corrección automática de la inclinación de la imagen. Habilitado (verdadero) de forma predeterminada. |
| [DetectAreasMode](../../aspose.ocr/baserecognitionsettings/detectareasmode/) { get; set; } | Permite seleccionar el modo óptimo para las áreas del tipo de documento: documento, foto, texto sin formato, columna, imagen. |
| [IgnoredCharacters](../../aspose.ocr/baserecognitionsettings/ignoredcharacters/) { get; set; } | Establece la lista negra para los símbolos de reconocimiento. |
| [Language](../../aspose.ocr/baserecognitionsettings/language/) { set; } | Obtiene o establece el idioma utilizado para OCR.  Determina el alfabeto utilizado durante el reconocimiento. Multi-idioma por defecto. |
| [LinesFiltration](../../aspose.ocr/baserecognitionsettings/linesfiltration/) { get; set; } | Permite reconocer texto en las tablas (regiones rodeadas de líneas). |
| [PreprocessingFilters](../../aspose.ocr/baserecognitionsettings/preprocessingfilters/) { get; set; } | Permite preparar la imagen para OCR ajustando los métodos de preprocesamiento. |
| [RecognitionAreas](../../aspose.ocr/recognitionsettings/recognitionareas/) { set; } | Obtiene o establece la lista de áreas de texto para procesar.  Permite especificar manualmente las áreas con texto para un reconocimiento más preciso. Si se configuran áreas personalizadasDetectAreas y!:AutoSkew se ignorarán las propiedades.  Deshabilita DetectAreas y AutoSkew. |
| [RecognizeSingleLine](../../aspose.ocr/recognitionsettings/recognizesingleline/) { set; } | Establece el reconocimiento de imágenes de una sola línea. Deshabilitado (falso) por defecto. Deshabilitar todos los pasos de procesamiento asociados con la división en líneas. Establezca este parámetro en verdadero si su imagen contiene solo una línea. Deshabilita la configuración de RecognitionAreas, por lo que se ignorarán todas las configuraciones de áreas. |
| [SkewAngle](../../aspose.ocr/baserecognitionsettings/skewangle/) { set; } | Obtiene o establece el ángulo en grados para la rotación de la imagen.  Establecer este valor deshabilitará el[`AutoSkew`](../baserecognitionsettings/autoskew/) propiedad, por lo que no se aplica la corrección de desviación automática. Cero por defecto. |
| [ThreadsCount](../../aspose.ocr/baserecognitionsettings/threadscount/) { set; } | Obtiene o establece el número de subprocesos para procesar. De forma predeterminada, 0 significa que la imagen se procesará con un número de subprocesos igual a su número de procesadores. ThreadsCount = 1 significa que la imagen se procesará en el subproceso principal. |
| [ThresholdValue](../../aspose.ocr/baserecognitionsettings/thresholdvalue/) { set; } | Obtiene o establece un valor de umbral personalizado para la binarización de imágenes. Rango de 1 a 255. |
| [UpscaleSmallFont](../../aspose.ocr/baserecognitionsettings/upscalesmallfont/) { get; set; } | Le permite usar algoritmos adicionales específicamente para el reconocimiento de fuentes pequeñas. Útil para imágenes con caracteres de tamaño pequeño. |

### Ver también

* class [BaseRecognitionSettings](../baserecognitionsettings/)
* espacio de nombres [Aspose.OCR](../../aspose.ocr/)
* asamblea [Aspose.OCR](../../)


