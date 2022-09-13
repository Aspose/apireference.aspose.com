---
title: TtfFont
second_title: Referencia de la API de Aspose.Font para .NET
description: Representa fuente TrueType TTF.
type: docs
weight: 630
url: /es/net/aspose.font.ttf/ttffont/
---
## TtfFont class

Representa fuente TrueType (TTF).

```csharp
public class TtfFont : Font
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont) { get; } | Obtiene la fuente CFF si está presente. |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding) { get; } | Obtiene la codificación de fuentes. |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition) { get; } | Obtiene definición de fuente. |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily) { get; set; } | Obtiene o establece la familia de fuentes. |
| override [FontName](../../aspose.font.ttf/ttffont/fontname) { get; set; } | Obtiene o establece el nombre de la cara de la fuente. |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames) { get; } | Obtiene los nombres de las fuentes. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Obtiene la función de guardar fuentes. |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle) { get; } | Obtiene el estilo de fuente. Este es un valor calculado y representado en tipo generalizado. |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype) { get; } | Obtiene Tipo de fuente. Devuelve Tipo de fuente.Valor TTF. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Accesorio de glifo de fuente. Recupera glifos e identificadores de glifos. |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype) { get; } | Obtiene la especificación del tipo de ID de glifo. |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic) { get; } | Devuelve verdadero en caso de que la fuente sea simbólica. |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics) { get; } | Obtiene métricas de fuentes. |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs) { get; } | Obtiene el número de glifos en la Fuente. |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames) { get; } | Obtiene nombres de fuentes Postscript. |
| override [Style](../../aspose.font.ttf/ttffont/style) { get; set; } | Obtiene o establece el estilo de fuente. Este es un valor de cadena sin formato proporcionado por el archivo de fuente. |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables) { get; } | Obtiene tablas TTF. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert)(FontType) | Convierte la Fuente a otro formato. |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids)() | Devuelve una matriz de todos los identificadores de glifo, disponibles en la fuente. El identificador de glifo es un número único para un glifo, que depende del tipo de fuente. El identificador de glifo de fuente TTF puede ser una instancia de ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) clase o ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. El direccionamiento de glifos de nombre (cadena) es compatible con las fuentes TTF a través de la asignación de tablas de publicación. En el caso de la fuente CFF interna, las estructuras CFF se utilizan para direccionar los glifos por nombre. |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid)(GlyphId) | Devuelve el glifo por id. de glifo. El id. de glifo es un número único para un glifo, que depende del tipo de fuente. TTF El id. de glifo de fuente puede ser una instancia de ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) clase o ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. El direccionamiento de glifos de nombre (cadena) es compatible con las fuentes TTF a través de la asignación de tablas de publicación. En el caso de la fuente CFF interna, las estructuras CFF se utilizan para direccionar los glifos por nombre. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_1)(string) | Devuelve el glifo por nombre de glifo. El direccionamiento de glifo de nombre (cadena) es compatible con fuentes TTF a través de la asignación de tabla Post. En el caso de la fuente CFF interna, las estructuras CFF se utilizan para direccionar los glifos por nombre. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_2)(uint) | Devuelve el glifo por ID de glifo. |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | Obtiene un glifo por identificador de glifo pasado y completa la lista pasada de identificadores de glifo con componentes de este glifo. El ID de glifo es un número único para un glifo, que depende del tipo de fuente. El ID de glifo de fuente TTF puede ser una instancia de ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) clase o ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. El direccionamiento de glifos de nombre (cadena) es compatible con las fuentes TTF a través de la asignación de tablas de publicación. En el caso de la fuente CFF interna, las estructuras CFF se utilizan para direccionar los glifos por nombre. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_1)(string, GlyphIdList) | Obtiene un glifo por nombre de glifo pasado y completa la lista pasada de identificadores de glifo con componentes de este glifo. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_2)(uint, GlyphIdList) | Obtiene un glifo por índice de glifo aprobado y completa la lista aprobada de identificadores de glifo con componentes de este glifo. |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext)(string) | Obtener representación de glifos para texto. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Guarda la fuente en el formato original. |
| virtual [Save](../../aspose.font/font/save)(string) | Guarda la fuente en el formato original. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Guarda la fuente en el formato especificado. |

### Ver también

* class [Font](../../aspose.font/font)
* espacio de nombres [Aspose.Font.Ttf](../../aspose.font.ttf)
* asamblea [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
