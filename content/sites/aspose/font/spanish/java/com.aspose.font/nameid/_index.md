---
title: "NameId"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la enumeración NameId."
type: docs
weight: 67
url: /es/java/com.aspose.font/nameid/
---
**Inheritance:**
java.lang.Object
```
public final class NameId
```

Representa la enumeración NameId.
## Campos

| Campo | Descripción |
| --- | --- |
| [CompatibleFull](#CompatibleFull) | 18 Compatible Full (solo Macintosh); En Macintosh, el nombre del menú se construye usando el recurso de Fuente. |
| [CopyrightNotice](#CopyrightNotice) | 0 Aviso de derechos de autor. |
| [DarkBackground](#DarkBackground) | Este ID, si se usa en el CPAL table\\u2019s Palette Labels Array, especifica que la paleta de colores correspondiente en la tabla CPAL es apropiada para usar con la fuente al mostrarla en un fondo oscuro como negro. |
| [Description](#Description) | 10 Descripción; descripción del tipo de letra. |
| [DesignerName](#DesignerName) | 9 Diseñador; nombre del diseñador del tipo de letra. |
| [FontFamily](#FontFamily) | 1 Familia de fuente. |
| [FontSubfamily](#FontSubfamily) | 2 Subfamilia de fuente. |
| [FullName](#FullName) | 4 Nombre completo de la fuente. |
| [LicenseDescription](#LicenseDescription) | 13 Descripción de la licencia; descripción de cómo se puede usar legalmente la fuente, o diferentes escenarios de ejemplo para el uso con licencia. |
| [LicenseInfoUrl](#LicenseInfoUrl) | 14 URL de información de la licencia, donde se puede encontrar información adicional de la licencia. |
| [LightBackground](#LightBackground) | Esta ID, si se usa en la matriz de etiquetas de paleta de la tabla CPAL\\u2019s, especifica que la paleta de colores correspondiente en la tabla CPAL es apropiada para usar con la fuente al mostrarla en un fondo claro como blanco |
| [ManufacturerName](#ManufacturerName) | 8 Nombre del fabricante. |
| [PostScriptCID](#PostScriptCID) | Su presencia en una fuente significa que el nameID 6 contiene un nombre de fuente PostScript que está destinado a usarse con la invocación \\u201ccomposefont\\u201d para invocar la fuente en un intérprete PostScript |
| [PostScriptName](#PostScriptName) | 6 Nombre PostScript de la fuente. |
| [PreferredFamily](#PreferredFamily) | 15 Reservado 16 Familia preferida (solo Windows); En Windows, el nombre de la familia se muestra en el menú de fuentes; el nombre de subfamilia se presenta como el nombre de estilo. |
| [PreferredSubfamily](#PreferredSubfamily) | 17 Subfamilia preferida (solo Windows); En Windows, el nombre de la familia se muestra en el menú de fuentes; el nombre de subfamilia se presenta como el nombre de estilo. |
| [SampleText](#SampleText) | 19 Texto de muestra. |
| [TrademarkNotice](#TrademarkNotice) | 7 Aviso de marca registrada. |
| [UniqueFontId](#UniqueFontId) | 3 Especificación Apple: Identificación única de subfamilia. 3 Especificación MS: Identificador único de fuente. |
| [UrlDesigner](#UrlDesigner) | 12 URL del diseñador de la fuente (con protocolo, p.ej., http://, ftp://) |
| [UrlVendor](#UrlVendor) | 11 URL del proveedor de la fuente (con protocolo, p.ej., http://, ftp://). |
| [VariationsPostScriptNamePrefix](#VariationsPostScriptNamePrefix) | Si está presente en una fuente variable, puede usarse como prefijo de familia en el algoritmo de generación de nombres PostScript para fuentes de variación. |
| [Version](#Version) | 5 Versión de la tabla de nombres. |
| [WwsFamilyName](#WwsFamilyName) | Utilizado para proporcionar un nombre de familia conforme a WWS en caso de que las entradas para los IDs 16 y 17 no se ajusten al modelo WWS. |
| [WwsSubfamilyName](#WwsSubfamilyName) | Usado junto con el ID 21, este ID proporciona un nombre de subfamilia conforme a WWS (reflejando solo atributos de peso, anchura y pendiente) en caso de que las entradas para los IDs 16 y 17 no se ajusten al modelo WWS. |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromId(int id)](#fromId-int-) | Crea un ID de nombre a partir de un valor entero. |
| [getClass()](#getClass--) |  |
| [getId()](#getId--) | Obtenga el valor entero. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompatibleFull {#CompatibleFull}
```
public static final NameId CompatibleFull
```


18 Compatible Full (solo Macintosh); En Macintosh, el nombre del menú se construye usando el recurso de fuente. Normalmente coincide con el Nombre completo. Si deseas que el nombre de la fuente aparezca diferente al Nombre completo, puedes insertar el Nombre completo compatible en el ID 18. Este nombre no lo usa el propio Mac OS, pero puede ser usado por desarrolladores de aplicaciones (p.ej., Adobe).

### CopyrightNotice {#CopyrightNotice}
```
public static final NameId CopyrightNotice
```


0 Aviso de derechos de autor.

### DarkBackground {#DarkBackground}
```
public static final NameId DarkBackground
```


Este ID, si se usa en el CPAL table\\u2019s Palette Labels Array, especifica que la paleta de colores correspondiente en la tabla CPAL es apropiada para usar con la fuente al mostrarla en un fondo oscuro como negro.

### Description {#Description}
```
public static final NameId Description
```


10 Descripción; descripción del tipo de letra. Puede contener información de revisión, recomendaciones de uso, historia, características, etc.

### DesignerName {#DesignerName}
```
public static final NameId DesignerName
```


9 Diseñador; nombre del diseñador del tipo de letra.

### FontFamily {#FontFamily}
```
public static final NameId FontFamily
```


1 Familia de fuente. Esta cadena es el nombre de la familia de la fuente que el usuario ve en plataformas Macintosh.

### FontSubfamily {#FontSubfamily}
```
public static final NameId FontSubfamily
```


2 Subfamilia de fuente. Esta cadena es la familia de fuentes que el usuario ve en plataformas Macintosh.

### FullName {#FullName}
```
public static final NameId FullName
```


4 Nombre completo de la fuente.

### LicenseDescription {#LicenseDescription}
```
public static final NameId LicenseDescription
```


13 Descripción de la licencia; descripción de cómo se puede usar legalmente la fuente, o diferentes escenarios de ejemplo para el uso con licencia. Este campo debe redactarse en lenguaje claro, no en jerga legal.

### LicenseInfoUrl {#LicenseInfoUrl}
```
public static final NameId LicenseInfoUrl
```


14 URL de información de la licencia, donde se puede encontrar información adicional de la licencia.

### LightBackground {#LightBackground}
```
public static final NameId LightBackground
```


Esta ID, si se usa en la matriz de etiquetas de paleta de la tabla CPAL\\u2019s, especifica que la paleta de colores correspondiente en la tabla CPAL es apropiada para usar con la fuente al mostrarla en un fondo claro como blanco

### ManufacturerName {#ManufacturerName}
```
public static final NameId ManufacturerName
```


8 Nombre del fabricante.

### PostScriptCID {#PostScriptCID}
```
public static final NameId PostScriptCID
```


Su presencia en una fuente significa que el nameID 6 contiene un nombre de fuente PostScript que está destinado a usarse con la invocación \\u201ccomposefont\\u201d para invocar la fuente en un intérprete PostScript

### PostScriptName {#PostScriptName}
```
public static final NameId PostScriptName
```


6 Nombre PostScript de la fuente. Nota: Una fuente puede tener solo un nombre PostScript y ese nombre debe ser ASCII.

### PreferredFamily {#PreferredFamily}
```
public static final NameId PreferredFamily
```


15 Reservado 16 Familia preferida (solo Windows); En Windows, el nombre de la familia se muestra en el menú de fuentes; el nombre de la subfamilia se presenta como el nombre de estilo. Por razones históricas, las familias de fuentes han contenido un máximo de cuatro estilos, pero los diseñadores de fuentes pueden agrupar más de cuatro fuentes en una sola familia. Los ID de familia preferida y subfamilia preferida permiten a los diseñadores de fuentes incluir los agrupamientos de familia/subfamilia preferidos. Estos ID solo están presentes si son diferentes de los ID 1 y 2.

### PreferredSubfamily {#PreferredSubfamily}
```
public static final NameId PreferredSubfamily
```


17 Subfamilia preferida (solo Windows); En Windows, el nombre de la familia se muestra en el menú de fuentes; el nombre de la subfamilia se presenta como el nombre de estilo. Por razones históricas, las familias de fuentes han contenido un máximo de cuatro estilos, pero los diseñadores de fuentes pueden agrupar más de cuatro fuentes en una sola familia. Los ID de familia preferida y subfamilia preferida permiten a los diseñadores de fuentes incluir los agrupamientos de familia/subfamilia preferidos. Estos ID solo están presentes si son diferentes de los ID 1 y 2.

### SampleText {#SampleText}
```
public static final NameId SampleText
```


19 Texto de muestra. Esto puede ser el nombre de la fuente, o cualquier otro texto que el diseñador considere el mejor ejemplo para mostrar cómo se ve la fuente.

### TrademarkNotice {#TrademarkNotice}
```
public static final NameId TrademarkNotice
```


7 Aviso de marca registrada.

### UniqueFontId {#UniqueFontId}
```
public static final NameId UniqueFontId
```


3 Especificación Apple: Identificación única de subfamilia. 3 Especificación MS: Identificador único de fuente.

### UrlDesigner {#UrlDesigner}
```
public static final NameId UrlDesigner
```


12 URL del diseñador de la fuente (con protocolo, p.ej., http://, ftp://)

### UrlVendor {#UrlVendor}
```
public static final NameId UrlVendor
```


11 URL del proveedor de la fuente (con protocolo, p. ej., http://, ftp://). Si se incrusta un número de serie único en la URL, puede usarse para registrar la fuente.

### VariationsPostScriptNamePrefix {#VariationsPostScriptNamePrefix}
```
public static final NameId VariationsPostScriptNamePrefix
```


Si está presente en una fuente variable, puede usarse como prefijo de familia en el algoritmo de generación de nombres PostScript para fuentes de variación.

### Version {#Version}
```
public static final NameId Version
```


5 Versión de la tabla de nombres.

### WwsFamilyName {#WwsFamilyName}
```
public static final NameId WwsFamilyName
```


Utilizado para proporcionar un nombre de familia conforme a WWS en caso de que las entradas para los IDs 16 y 17 no se ajusten al modelo WWS.

### WwsSubfamilyName {#WwsSubfamilyName}
```
public static final NameId WwsSubfamilyName
```


Usado junto con el ID 21, este ID proporciona un nombre de subfamilia conforme a WWS (reflejando solo atributos de peso, anchura y pendiente) en caso de que las entradas para los IDs 16 y 17 no se ajusten al modelo WWS.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fromId(int id) {#fromId-int-}
```
public static NameId fromId(int id)
```


Crea un ID de nombre a partir de un valor entero.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| id | int | Un valor entero. |

**Returns:**
[NameId](../../com.aspose.font/nameid) - The name id.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getId() {#getId--}
```
public int getId()
```


Obtenga el valor entero.

**Returns:**
int - El valor entero.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

