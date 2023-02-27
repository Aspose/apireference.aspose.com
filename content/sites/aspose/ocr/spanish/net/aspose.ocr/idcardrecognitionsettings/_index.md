---
title: Class IDCardRecognitionSettings
second_title: Referencia de API de Aspose.OCR para .NET
description: Aspose.OCR.IDCardRecognitionSettings clase. Configuración para el reconocimiento de DNI. Contiene elementos que permiten personalizar el proceso de reconocimiento.
type: docs
weight: 90
url: /es/net/aspose.ocr/idcardrecognitionsettings/
---
## IDCardRecognitionSettings class

Configuración para el reconocimiento de DNI. Contiene elementos que permiten personalizar el proceso de reconocimiento.

```csharp
public class IDCardRecognitionSettings : ReceiptRecognitionSettings
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [IDCardRecognitionSettings](idcardrecognitionsettings/)(Language) | Inicializa una nueva instancia del`IDCardRecognitionSettings`clase con conjunto completo de propiedades. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [AllowedCharacters](../../aspose.ocr/receiptrecognitionsettings/allowedcharacters/) { get; set; } | Conjunto de caracteres permitidos. Determina el tipo de caracteres permitidos para el resultado del reconocimiento. |
| [AutoSkew](../../aspose.ocr/receiptrecognitionsettings/autoskew/) { set; } | Obtiene o establece un indicador que indica si se debe habilitar la corrección automática de la inclinación de la imagen. Habilitado (verdadero) de forma predeterminada. |
| [IgnoredCharacters](../../aspose.ocr/receiptrecognitionsettings/ignoredcharacters/) { get; set; } | Establece la lista negra para los símbolos de reconocimiento. |
| [Language](../../aspose.ocr/receiptrecognitionsettings/language/) { set; } | Obtiene o establece el idioma utilizado para OCR.  Determina el alfabeto utilizado durante el reconocimiento. Multi-idioma por defecto. |
| [PreprocessingFilters](../../aspose.ocr/receiptrecognitionsettings/preprocessingfilters/) { get; set; } | Permite preparar la imagen para OCR ajustando los métodos de preprocesamiento. |
| [ThreadsCount](../../aspose.ocr/receiptrecognitionsettings/threadscount/) { set; } | Obtiene o establece el número de subprocesos para procesar. De forma predeterminada, 0 significa que la imagen se procesará con un número de subprocesos igual a su número de procesadores. ThreadsCount = 1 significa que la imagen se procesará en el subproceso principal. |

### Ver también

* class [ReceiptRecognitionSettings](../receiptrecognitionsettings/)
* espacio de nombres [Aspose.OCR](../../aspose.ocr/)
* asamblea [Aspose.OCR](../../)


