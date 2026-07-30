---
title: "TtfOs2Table"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la tabla OS/2 del archivo de fuente TTF."
type: docs
weight: 106
url: /es/java/com.aspose.font/ttfos2table/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfOs2Table extends TtfTableBase
```

Representa la tabla "OS/2" del archivo de fuente TTF.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAchVendId()](#getAchVendId--) | Obtiene el valor de AchVendId. |
| [getClass()](#getClass--) |  |
| [getFSSelection()](#getFSSelection--) | Contiene información sobre la naturaleza de los patrones de fuente. |
| [getFSType()](#getFSType--) | Obtiene el valor de FSType. |
| [getLicenseFlags()](#getLicenseFlags--) | Obtiene una bandera incrustada (fsType) en la representación del objeto. |
| [getOffset()](#getOffset--) | Obtiene el desplazamiento desde el inicio de sfnt. |
| [getPanose()](#getPanose--) | Esta serie de 10 bytes de números se utiliza para describir las características visuales de una tipografía dada. |
| [getSCapHeight()](#getSCapHeight--) | Obtiene el valor de SCapHeight. |
| [getSFamilyClass()](#getSFamilyClass--) | Este parámetro es una clasificación del diseño de la familia tipográfica. |
| [getSTypoAscender()](#getSTypoAscender--) | Obtiene el valor de STypoAscender. |
| [getSTypoDescender()](#getSTypoDescender--) | Obtiene el valor de STypoDescender. |
| [getSTypoLineGap()](#getSTypoLineGap--) | Obtiene el valor de STypoLineGap. |
| [getSXHeight()](#getSXHeight--) | Obtiene el valor de SXHeight. |
| [getSupportedTableVersions()](#getSupportedTableVersions--) | Obtiene las versiones compatibles de la tabla OS/2. |
| [getTag()](#getTag--) | Obtiene la etiqueta de la tabla. |
| [getTtfTables()](#getTtfTables--) | Referencia al repositorio de tabla TTF. |
| [getULCodePageRange()](#getULCodePageRange--) | Obtiene el valor de ULCodePageRange. |
| [getULUnicodeRange()](#getULUnicodeRange--) | Obtiene el valor de ULUnicodeRange. |
| [getUSBreakChar()](#getUSBreakChar--) | Obtiene el valor de USBreakChar. |
| [getUSDefaultChar()](#getUSDefaultChar--) | Obtiene el valor de USDefaultChar. |
| [getUSFirstCharIndex()](#getUSFirstCharIndex--) | Obtiene el valor de USFirstCharIndex. |
| [getUSLastCharIndex()](#getUSLastCharIndex--) | Obtiene el valor de USLastCharIndex. |
| [getUSLowerOpticalPointSize()](#getUSLowerOpticalPointSize--) | Obtiene el valor de USLowerOpticalPointSize. |
| [getUSMaxContext()](#getUSMaxContext--) | Obtiene el valor de USMaxContext. |
| [getUSUpperOpticalPointSize()](#getUSUpperOpticalPointSize--) | Obtiene el valor de USUpperOpticalPointSize. |
| [getUSWeightClass()](#getUSWeightClass--) | Indica el peso visual (grado de oscuridad o grosor de los trazos) de los caracteres en la Fuente. |
| [getUSWidthClass()](#getUSWidthClass--) | Indica un cambio relativo respecto a la proporción de aspecto normal (relación ancho/alto) según lo especificado por el diseñador de fuentes para los glifos en una Fuente. |
| [getUSWinAscent()](#getUSWinAscent--) | Obtiene el valor de USWinAscent. |
| [getUSWinDescent()](#getUSWinDescent--) | Obtiene el valor de USWinDescent. |
| [getVersion()](#getVersion--) | Obtiene el valor Version. |
| [getXAvgCharWidth()](#getXAvgCharWidth--) | Obtiene el parámetro Average Character Width. |
| [getYStrikeoutPosition()](#getYStrikeoutPosition--) | Obtiene el valor YStrikeoutPosition. |
| [getYStrikeoutSize()](#getYStrikeoutSize--) | Obtiene el valor YStrikeoutSize. |
| [getYSubscriptXOffset()](#getYSubscriptXOffset--) | Obtiene el valor YSubscriptXOffset. |
| [getYSubscriptXSize()](#getYSubscriptXSize--) | Obtiene el valor YSubscriptXSize. |
| [getYSubscriptYOffset()](#getYSubscriptYOffset--) | Obtiene el valor YSubscriptYOffset. |
| [getYSubscriptYSize()](#getYSubscriptYSize--) | Obtiene el valor YSubscriptYSize. |
| [getYSuperscriptXOffset()](#getYSuperscriptXOffset--) | Obtiene el valor YSuperscriptXOffset. |
| [getYSuperscriptXSize()](#getYSuperscriptXSize--) | Obtiene el valor YSuperscriptXSize. |
| [getYSuperscriptYOffset()](#getYSuperscriptYOffset--) | Obtiene el valor YSuperscriptYOffset. |
| [getYSuperscriptYSize()](#getYSuperscriptYSize--) | Obtiene el valor YSuperscriptYSize. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAchVendId() {#getAchVendId--}
```
public byte[] getAchVendId()
```


Obtiene el valor de AchVendId.

**Returns:**
byte[] - AchVendId valor.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFSSelection() {#getFSSelection--}
```
public int getFSSelection()
```


Contiene información sobre la naturaleza de los patrones de fuente.

> ```
> 0	bit 1	ITALIC	Font contains Italic characters, otherwise they are upright.
>  1	 	    UNDERSCORE	Characters are underscored.
>  2	 	    NEGATIVE	Characters have their foreground and background reversed.
>  3	 	    OUTLINED	Outline (hollow) characters, otherwise they are solid.
>  4	 	    STRIKEOUT	Characters are overstruck.
>  5	bit 0	BOLD	Characters are emboldened.
>  6	 	    REGULAR	Characters are in the standard weight/style for the font.
> ```

**Returns:**
int - La información.
### getFSType() {#getFSType--}
```
public int getFSType()
```


Obtiene el valor de FSType.

--------------------

Indica los derechos de licencia de incrustación de fuentes para la Fuente.

**Returns:**
int - valor FSType.
### getLicenseFlags() {#getLicenseFlags--}
```
public LicenseFlags getLicenseFlags()
```


Obtiene una bandera incrustada (fsType) en la representación del objeto.

**Returns:**
[LicenseFlags](../../com.aspose.font/licenseflags) - Embedded flags.
### getOffset() {#getOffset--}
```
public long getOffset()
```


Obtiene el desplazamiento desde el inicio de sfnt.

**Returns:**
long - Desplazamiento desde el inicio de sfnt.
### getPanose() {#getPanose--}
```
public byte[] getPanose()
```


Esta serie de 10 bytes de números se utiliza para describir las características visuales de un tipo de letra dado. Estas características se utilizan luego para asociar la fuente con otras fuentes de apariencia similar que tienen nombres diferentes.

**Returns:**
byte[] - Las características visuales de un tipo de letra dado.
### getSCapHeight() {#getSCapHeight--}
```
public short getSCapHeight()
```


Obtiene el valor de SCapHeight.

**Returns:**
short - SCapHeight valor.
### getSFamilyClass() {#getSFamilyClass--}
```
public short getSFamilyClass()
```


Este parámetro es una clasificación del diseño de la familia tipográfica. La clase de fuente y la subclase de fuente son valores registrados asignados por IBM a cada familia tipográfica. Este parámetro está destinado a usarse para seleccionar una fuente alternativa cuando la fuente solicitada no está disponible.

**Returns:**
short - Clasificación del diseño de la familia tipográfica.
### getSTypoAscender() {#getSTypoAscender--}
```
public short getSTypoAscender()
```


Obtiene el valor de STypoAscender.

**Returns:**
short - STypoAscender valor.
### getSTypoDescender() {#getSTypoDescender--}
```
public short getSTypoDescender()
```


Obtiene el valor de STypoDescender.

**Returns:**
short - STypoDescender valor.
### getSTypoLineGap() {#getSTypoLineGap--}
```
public short getSTypoLineGap()
```


Obtiene el valor de STypoLineGap.

**Returns:**
short - STypoLineGap valor.
### getSXHeight() {#getSXHeight--}
```
public short getSXHeight()
```


Obtiene el valor de SXHeight.

**Returns:**
short - SXHeight valor.
### getSupportedTableVersions() {#getSupportedTableVersions--}
```
public int[] getSupportedTableVersions()
```


Obtiene las versiones compatibles de la tabla OS/2.

**Returns:**
int[] - Versiones compatibles de la tabla OS/2.
### getTag() {#getTag--}
```
public static String getTag()
```


Obtiene la etiqueta de la tabla.

**Returns:**
java.lang.String - Etiqueta de tabla.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Referencia al repositorio de tabla TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getULCodePageRange() {#getULCodePageRange--}
```
public long[] getULCodePageRange()
```


Obtiene el valor de ULCodePageRange.

**Returns:**
long[] - Valor de ULCodePageRange.
### getULUnicodeRange() {#getULUnicodeRange--}
```
public long[] getULUnicodeRange()
```


Obtiene el valor de ULUnicodeRange.

**Returns:**
long[] - Valor de ULUnicodeRange.
### getUSBreakChar() {#getUSBreakChar--}
```
public int getUSBreakChar()
```


Obtiene el valor de USBreakChar.

**Returns:**
int - Valor de USBreakChar.
### getUSDefaultChar() {#getUSDefaultChar--}
```
public int getUSDefaultChar()
```


Obtiene el valor de USDefaultChar.

**Returns:**
int - Valor de USDefaultChar.
### getUSFirstCharIndex() {#getUSFirstCharIndex--}
```
public int getUSFirstCharIndex()
```


Obtiene el valor de USFirstCharIndex.

**Returns:**
int - Valor de USFirstCharIndex.
### getUSLastCharIndex() {#getUSLastCharIndex--}
```
public int getUSLastCharIndex()
```


Obtiene el valor de USLastCharIndex.

**Returns:**
int - Valor de USLastCharIndex.
### getUSLowerOpticalPointSize() {#getUSLowerOpticalPointSize--}
```
public int getUSLowerOpticalPointSize()
```


Obtiene el valor de USLowerOpticalPointSize.

**Returns:**
int - El valor de USLowerOpticalPointSize.
### getUSMaxContext() {#getUSMaxContext--}
```
public int getUSMaxContext()
```


Obtiene el valor de USMaxContext.

**Returns:**
int - Valor de UsMaxContext.
### getUSUpperOpticalPointSize() {#getUSUpperOpticalPointSize--}
```
public int getUSUpperOpticalPointSize()
```


Obtiene el valor de USUpperOpticalPointSize.

**Returns:**
int - El valor de USUpperOpticalPointSize.
### getUSWeightClass() {#getUSWeightClass--}
```
public int getUSWeightClass()
```


Indica el peso visual (grado de oscuridad o grosor de los trazos) de los caracteres en la Fuente.

**Returns:**
int - El peso visual (grado de negrura o grosor de los trazos) de los caracteres en la Font.
### getUSWidthClass() {#getUSWidthClass--}
```
public int getUSWidthClass()
```


Indica un cambio relativo respecto a la proporción de aspecto normal (relación ancho/alto) según lo especificado por el diseñador de fuentes para los glifos en una Fuente.

**Returns:**
int - Un cambio relativo respecto a la proporción de aspecto normal (relación ancho/alto) según lo especificado por un diseñador de fuentes para los glifos en una Font.
### getUSWinAscent() {#getUSWinAscent--}
```
public int getUSWinAscent()
```


Obtiene el valor de USWinAscent.

**Returns:**
int - Valor de USWinAscent.
### getUSWinDescent() {#getUSWinDescent--}
```
public int getUSWinDescent()
```


Obtiene el valor de USWinDescent.

**Returns:**
int - Valor de USWinDescent.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Obtiene el valor Version.

**Returns:**
int - Valor de Version.
### getXAvgCharWidth() {#getXAvgCharWidth--}
```
public short getXAvgCharWidth()
```


Obtiene el parámetro Average Character Width.

**Returns:**
short - El parámetro Average Character Width.
### getYStrikeoutPosition() {#getYStrikeoutPosition--}
```
public short getYStrikeoutPosition()
```


Obtiene el valor YStrikeoutPosition.

**Returns:**
short - Valor de YStrikeoutPosition.
### getYStrikeoutSize() {#getYStrikeoutSize--}
```
public short getYStrikeoutSize()
```


Obtiene el valor YStrikeoutSize.

**Returns:**
short - Valor de YStrikeoutSize.
### getYSubscriptXOffset() {#getYSubscriptXOffset--}
```
public short getYSubscriptXOffset()
```


Obtiene el valor YSubscriptXOffset.

**Returns:**
short - Valor de YSubscriptXOffset.
### getYSubscriptXSize() {#getYSubscriptXSize--}
```
public short getYSubscriptXSize()
```


Obtiene el valor YSubscriptXSize.

**Returns:**
short - Valor de YSubscriptXSize.
### getYSubscriptYOffset() {#getYSubscriptYOffset--}
```
public short getYSubscriptYOffset()
```


Obtiene el valor YSubscriptYOffset.

**Returns:**
short - Valor de YSubscriptYOffset.
### getYSubscriptYSize() {#getYSubscriptYSize--}
```
public short getYSubscriptYSize()
```


Obtiene el valor YSubscriptYSize.

**Returns:**
short - Valor de YSubscriptYSize.
### getYSuperscriptXOffset() {#getYSuperscriptXOffset--}
```
public short getYSuperscriptXOffset()
```


Obtiene el valor YSuperscriptXOffset.

**Returns:**
short - Valor de YSuperscriptXOffset.
### getYSuperscriptXSize() {#getYSuperscriptXSize--}
```
public short getYSuperscriptXSize()
```


Obtiene el valor YSuperscriptXSize.

**Returns:**
short - Valor de YSuperscriptXSize.
### getYSuperscriptYOffset() {#getYSuperscriptYOffset--}
```
public short getYSuperscriptYOffset()
```


Obtiene el valor YSuperscriptYOffset.

**Returns:**
short - Valor de YSuperscriptYOffset.
### getYSuperscriptYSize() {#getYSuperscriptYSize--}
```
public short getYSuperscriptYSize()
```


Obtiene el valor YSuperscriptYSize.

**Returns:**
corto - valor YSuperscriptYSize.
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

