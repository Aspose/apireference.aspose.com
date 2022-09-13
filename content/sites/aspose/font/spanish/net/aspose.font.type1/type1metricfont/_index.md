---
title: Type1MetricFont
second_title: Referencia de la API de Aspose.Font para .NET
description: Implementación de la fuente métrica Type1. Esta fuente type1 se crea usando solo métricas. Las funciones de recuperación de glifos y algunas otras que requieren fuente real no están permitidas las funciones no permitidas arrojan una excepciónType1NotSupportedException . Se utilizan otras propiedades Nombre de fuente Peso Métricas y Codificación del archivo de métricas.
type: docs
weight: 1080
url: /es/net/aspose.font.type1/type1metricfont/
---
## Type1MetricFont class

Implementación de la fuente métrica Type1. Esta fuente type1 se crea usando solo métricas. Las funciones de recuperación de glifos y algunas otras que requieren fuente real no están permitidas, las funciones no permitidas arrojan una excepciónType1NotSupportedException . Se utilizan otras propiedades (Nombre de fuente, Peso, Métricas y Codificación) del archivo de métricas.

```csharp
public class Type1MetricFont : Type1Font
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| override [Encoding](../../aspose.font.type1/type1metricfont/encoding) { get; } | La codificación se define en el archivo de métricas. StandardAdobeEncoding: la codificación se completa automáticamente |
| override [FontDefinition](../../aspose.font.type1/type1font/fontdefinition) { get; } | Obtiene definición de fuente. |
| override [FontFamily](../../aspose.font.type1/type1metricfont/fontfamily) { get; } | Obtiene la familia de fuentes. |
| override [FontName](../../aspose.font.type1/type1metricfont/fontname) { get; } | Obtiene el nombre de la fuente. |
| override [FontNames](../../aspose.font.type1/type1font/fontnames) { get; } | Obtiene los nombres de las fuentes. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Obtiene la función de guardar fuentes. |
| override [FontStyle](../../aspose.font.type1/type1metricfont/fontstyle) { get; } | Obtiene el estilo de fuente. Este es un valor calculado y representado en tipo generalizado. |
| override [FontType](../../aspose.font.type1/type1font/fonttype) { get; } | Obtiene el tipo de fuente. Devuelve el valor FontType.Type1. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Accesorio de glifo de fuente. Recupera glifos e identificadores de glifos. |
| override [GlyphIdType](../../aspose.font.type1/type1font/glyphidtype) { get; } | Especificación de tipo de id de glifo. |
| override [Metrics](../../aspose.font.type1/type1font/metrics) { get; } | Obtiene métricas de fuentes. |
| override [NumGlyphs](../../aspose.font.type1/type1metricfont/numglyphs) { get; } | Obtiene el número de glifos en la Fuente. |
| override [PostscriptNames](../../aspose.font.type1/type1font/postscriptnames) { get; } | Obtiene nombres de fuentes postscript. |
| override [Style](../../aspose.font.type1/type1metricfont/style) { get; } | Obtiene el estilo de fuente. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| override [Convert](../../aspose.font.type1/type1font/convert)(FontType) | Convierte la Fuente a otro formato. |
| override [GetAllGlyphIds](../../aspose.font.type1/type1metricfont/getallglyphids)() | Devuelve todos los ID de glifo, disponibles en la fuente. No compatible con[`Type1MetricFont`](../type1metricfont)tipo. |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid#getglyphbyid)(GlyphId) | Devuelve glifo por id. de glifo. No compatible con[`Type1MetricFont`](../type1metricfont)tipo. |
| override [GetGlyphById](../../aspose.font.type1/type1metricfont/getglyphbyid#getglyphbyid_1)(string) | Devuelve glifo por id. de glifo. No compatible con[`Type1MetricFont`](../type1metricfont)tipo. |
| [GetGlyphById](../../aspose.font.type1/type1font/getglyphbyid)(uint) | Devuelve el glifo por ID de glifo. |
| virtual [GetGlyphsForText](../../aspose.font/font/getglyphsfortext)(string) | Obtiene representación de glifos para texto. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Guarda la fuente en el formato original. |
| virtual [Save](../../aspose.font/font/save)(string) | Guarda la fuente en el formato original. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Guarda la fuente en el formato especificado. |

### Ejemplos

Nota: si el archivo de métricas define la codificación como "FontSpecific", el usuario debe proporcionar la codificación específica de la siguiente manera:  System::ArrayPtr&lt;System::String&gt; zapfDingbatsEncoding = System::MakeArray&lt;System::String&gt;({nullptr, nullptr, ..., u"space", u"a1", ...}); FontEnvironment::get_Current()-&gt;get_FontSpecificEncodings()-&gt;RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);

```csharp
string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
```

### Ver también

* class [Type1Font](../type1font)
* espacio de nombres [Aspose.Font.Type1](../../aspose.font.type1)
* asamblea [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
