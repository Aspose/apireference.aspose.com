---
title: "Enumeración TtfNameTableNameId"
second_title: "Aspose.Font para JavaScript vía C++"
description: "Aspose.Font.TtfNameTableNameId enumeración. Especifica NameId"
type: docs
weight: 120
url: /es/javascript-cpp/enumerations/ttfnametablenameid/
---
## TtfNameTableNameId enumeration

Especifica NameId.

```csharp
 enum TtfNameTableNameId
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
|  | CopyrightNotice | `0` | Aviso de derechos de autor. |
|  | FontFamily | `1` | Familia de fuente. Esta cadena es el nombre de la familia de fuentes que el usuario ve en plataformas Macintosh. |
|  | FontSubfamily | `2` | Subfamilia de fuente. Esta cadena es la familia de fuentes que el usuario ve en plataformas Macintosh. |
|  | UniqueFontId | `3` | Identificación única de subfamilia (especificación de Apple). 3 Identificador único de fuente (especificación de MS). |
|  | FullName | `4` | Nombre completo de la fuente. |
|  | Version | `5` | Versión de la tabla de nombres. |
|  | PostScriptName | `6` | Nombre PostScript de la fuente. Nota: Una fuente puede tener solo un nombre PostScript y ese nombre debe ser ASCII. |
|  | TrademarkNotice | `7` | Aviso de marca registrada. |
|  | ManufacturerName | `8` | Nombre del fabricante. |
|  | DesignerName | `9` | Diseñador; nombre del diseñador del tipo de letra. |
|  | Description | `10` | Descripción; descripción del tipo de letra. Puede contener información de revisión, recomendaciones de uso, historia, características, etc. |
|  | UrlVendor | `11` | URL del proveedor de la fuente (con protocolo, p. ej., http://, ftp://). Si un número de serie único está incrustado en la URL, puede usarse para registrar la fuente. |
|  | UrlDesigner | `12` | URL del diseñador de la fuente (con protocolo, p. ej., http://, ftp://) |
|  | LicenseDescription | `13` | Descripción de la licencia; descripción de cómo puede usarse legalmente la fuente, o diferentes escenarios de ejemplo para uso con licencia. Este campo debe escribirse en lenguaje sencillo, no en jerga legal. |
|  | LicenseInfoUrl | `14` | URL de información de la licencia, donde se puede encontrar información adicional de licencias. |
|  | PreferredFamily | `16` | `15` Reservado `16` Familia preferida (solo Windows); En Windows, el nombre de la familia se muestra en el menú de fuentes; el nombre de la subfamilia se presenta como el nombre del estilo. Por razones históricas, las familias de fuentes han contenido un máximo de cuatro estilos, pero los diseñadores de fuentes pueden agrupar más de cuatro fuentes en una sola familia. Los IDs de Familia preferida y Subfamilia preferida permiten a los diseñadores de fuentes incluir los agrupamientos de familia/subfamilia preferidos. Estos IDs solo están presentes si son diferentes de los IDs 1 y 2. |
|  | PreferredSubfamily | `17` | Subfamilia preferida (solo Windows); En Windows, el nombre de la familia se muestra en el menú de fuentes; el nombre de la subfamilia se presenta como el nombre del estilo. Por razones históricas, las familias de fuentes han contenido un máximo de cuatro estilos, pero los diseñadores de fuentes pueden agrupar más de cuatro fuentes en una sola familia. Los IDs de Familia preferida y Subfamilia preferida permiten a los diseñadores de fuentes incluir los agrupamientos de familia/subfamilia preferidos. Estos IDs solo están presentes si son diferentes de los IDs 1 y 2. |
|  | CompatibleFull | `18` | Completo compatible (solo Macintosh); En Macintosh, el nombre del menú se construye usando el recurso de fuente. Esto suele coincidir con el Nombre completo. Si deseas que el nombre de la fuente aparezca diferente al Nombre completo, puedes insertar el Nombre completo compatible en el ID 18. Este nombre no lo usa el propio Mac OS, pero puede ser usado por desarrolladores de aplicaciones (p. ej., Adobe). |
|  | SampleText | `19` | Texto de muestra. Esto puede ser el nombre de la fuente, o cualquier otro texto que el diseñador considere el mejor ejemplo para mostrar cómo se ve la fuente. |
|  | PostScriptCID | `20` | Su presencia en una fuente significa que el nameID 6 contiene un nombre de fuente PostScript que está destinado a usarse con la invocación "composefont" para invocar la fuente en un intérprete PostScript. |
|  | WwsFamilyName | `21` | Se utiliza para proporcionar un nombre de familia conforme a WWS en caso de que las entradas de los IDs 16 y 17 no se ajusten al modelo WWS. |
|  | WwsSubfamilyName | `22` | Usado junto con el ID 21, este ID proporciona un nombre de subfamilia conforme a WWS (reflejando solo los atributos de peso, anchura y pendiente) en caso de que las entradas de los IDs 16 y 17 no se ajusten al modelo WWS. |
|  | LightBackground | `23` | Este ID, si se usa en la matriz de etiquetas de paleta de la tabla CPAL, especifica que la paleta de colores correspondiente en la tabla CPAL es adecuada para usar con la fuente al mostrarla sobre un fondo claro como blanco. |
|  | DarkBackground | `24` | Este ID, si se usa en la matriz de etiquetas de paleta de la tabla CPAL, especifica que la paleta de colores correspondiente en la tabla CPAL es adecuada para usar con la fuente al mostrarla sobre un fondo oscuro como negro. |
|  | VariationsPostScriptNamePrefix | `25` | Si está presente en una fuente variable, puede usarse como prefijo de familia en el algoritmo de generación de nombres PostScript para fuentes de variación. |

