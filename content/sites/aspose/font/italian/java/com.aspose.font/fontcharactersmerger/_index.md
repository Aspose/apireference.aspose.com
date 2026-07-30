---
title: "FontCharactersMerger"
second_title: "Riferimento API Aspose.Font per Java"
description: "Dichiara la funzionalità per unire font di diversi tipi."
type: docs
weight: 35
url: /it/java/com.aspose.font/fontcharactersmerger/
---
**Inheritance:**
java.lang.Object
```
public abstract class FontCharactersMerger
```

Dichiara la funzionalità per unire font di tipi diversi. È necessaria una coppia di font per l'operazione di fusione. Un font di questa coppia è considerato primario. Ciò significa che molte caratteristiche, relative al font finale unito, come metriche, struttura di codifica e altre, saranno prese da questo font primario. L'altro font della coppia (secondario) fornisce solo i glifi per il font finale unito.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPrimaryFont()](#getPrimaryFont--) | Ottiene il font primario. |
| [getSecondaryFont()](#getSecondaryFont--) | Ottiene il font secondario. |
| [hashCode()](#hashCode--) |  |
| [mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)](#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-) | Unisce i font in base agli elenchi di glifi forniti. |
| [mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)](#mergeFonts-int---int---java.lang.String-) | Unisce i font in base agli elenchi di codici carattere forniti. |
| [mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)](#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-) | Questa versione del metodo è progettata per i casi in cui si desidera impostare esplicitamente i codici carattere per i glifi nel font risultante. |
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getPrimaryFont() {#getPrimaryFont--}
```
public abstract Font getPrimaryFont()
```


Ottiene il font primario.

**Returns:**
[Font](../../com.aspose.font/font) - The primary font.
### getSecondaryFont() {#getSecondaryFont--}
```
public abstract Font getSecondaryFont()
```


Ottiene il font secondario.

**Returns:**
[Font](../../com.aspose.font/font) - The secondary font.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName) {#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-}
```
public abstract Font mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)
```


Unisce i font in base agli elenchi di glifi forniti. Cerca un codice carattere per ogni glifo fornito e aggiunge il codice carattere trovato con il glifo corrispondente nel nuovo font risultante.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| primaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | Elenco dei glifi da prendere dal font primario. |
| secondaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | Elenco dei glifi da prendere dal font secondario. |
| newFontName | java.lang.String | Nome desiderato per il font risultante. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font
### mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName) {#mergeFonts-int---int---java.lang.String-}
```
public abstract Font mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)
```


Unisce i font in base agli elenchi di codici carattere forniti. Per creare il font risultante desiderato, basta fornire i codici dei simboli dai font originali che si desidera includere nel font risultante. I glifi relativi ai codici forniti saranno trovati automaticamente. Ad esempio, se si desidera includere i glifi relativi alle lettere A e B dal primo font e i glifi relativi alle lettere C e D dal secondo font, basta chiamare questo metodo così: `mergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, \"NewFont\")`

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| primaryFontCharCodes | int[] | Codici da prendere dal font primario. |
| secondaryFontCharCodes | int[] | Codici da prendere dal font secondario. |
| newFontName | java.lang.String | Nome desiderato per il font risultante. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
### mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName) {#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-}
```
public abstract Font mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)
```


Questa versione del metodo è progettata per i casi in cui si desidera impostare esplicitamente i codici carattere per i glifi nel font risultante. Non è obbligatorio che il codice per il glifo fornito sia incluso nel font originale. Lo scopo del codice fornito è che venga associato all'identificatore del glifo corrispondente nel font risultante. Pertanto, la regola per elaborare ogni coppia passata tramite il parametro dizionario [code, glyph identifier] è che solo l'identificatore del glifo verrà prelevato dal font originale e poi sarà collegato al codice corrispondente nel font risultante. Questo può essere utile quando alcuni codici del primo font confliggono con gli stessi codici del secondo font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| primaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Dizionario con coppie [symbol code, glyph identifier] dal font primario. |
| secondaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Dizionario con coppie [symbol code, glyph identifier] dal font secondario. |
| newFontName | java.lang.String | Nome desiderato per il font risultante. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

