---
title: "ExternalFontCache"
second_title: "Aspose.Page per Java API Reference"
description: "Utilizza questa classe per ottenere l'incapsulamento del font in una forma accettata da Device."
type: docs
weight: 13
url: /it/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Utilizza questa classe per ottenere l'incapsulamento del font in una forma accettata da Device.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Campi

| Campo | Descrizione |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | Dimensione predefinita del carattere. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | Stile predefinito del carattere. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | Recupera DrFont per nome famiglia di caratteri, dimensione predefinita (1) e stile predefinito (PLAIN). |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | Recupera DrFont per nome famiglia di caratteri, dimensione predefinita (1) e stile. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | Recupera DrFont per nome famiglia di caratteri, dimensione e stile. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | Recupera DrFont per nome famiglia di caratteri, dimensione, stile e maiuscole del carattere. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | Recupera DrFont per nome famiglia di caratteri, dimensione, stile e nome famiglia di caratteri alternativo. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | Recupera DrFont per nome famiglia di caratteri, dimensione, stile, maiuscole del carattere e nome famiglia di caratteri alternativo. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | Recupera TTFont per nome famiglia di caratteri, stile e nome famiglia di caratteri alternativo. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifica cartelle di caratteri aggiuntive. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ExternalFontCache() {#ExternalFontCache--}
```
public ExternalFontCache()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final float DEFAULT_SIZE
```


Dimensione predefinita del carattere.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


Stile predefinito del carattere.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


Recupera DrFont per nome famiglia di caratteri, dimensione predefinita (1) e stile predefinito (PLAIN).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| familyName | java.lang.String | Nome famiglia di caratteri. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


Recupera DrFont per nome famiglia di caratteri, dimensione predefinita (1) e stile.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| familyName | java.lang.String | Nome famiglia di caratteri. |
| stile | int | Stile del carattere. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
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
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


Recupera DrFont per nome famiglia di caratteri, dimensione e stile.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| familyName | java.lang.String | Nome famiglia di caratteri. |
| sizePoints | float | Dimensione del carattere in punti (un punto è 1/72 di pollice). |
| stile | int | Stile del carattere. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


Recupera DrFont per nome famiglia di caratteri, dimensione, stile e maiuscole del carattere.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| familyName | java.lang.String | Nome famiglia di caratteri. |
| sizePoints | float | Dimensione del carattere in punti (un punto è 1/72 di pollice). |
| stile | int | Stile del carattere. |
| fontCapitals | int | Maiuscole del carattere. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


Recupera DrFont per nome famiglia di caratteri, dimensione, stile e nome famiglia di caratteri alternativo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| familyName | java.lang.String | Nome famiglia di caratteri. |
| sizePoints | float | Dimensione del carattere in punti (un punto è 1/72 di pollice). |
| stile | int | Stile del carattere. |
| altFamilyName | java.lang.String | Nome alternativo della famiglia di caratteri. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


Recupera DrFont per nome famiglia di caratteri, dimensione, stile, maiuscole del carattere e nome famiglia di caratteri alternativo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| familyName | java.lang.String | Nome famiglia di caratteri. |
| sizePoints | float | Dimensione del carattere in punti (un punto è 1/72 di pollice). |
| stile | int | Stile del carattere. |
| altFamilyName | java.lang.String | Nome alternativo della famiglia di caratteri. |
| fontCapitals | int | Maiuscole del carattere. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


Recupera TTFont per nome famiglia di caratteri, stile e nome famiglia di caratteri alternativo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| familyName | java.lang.String | Nome famiglia di caratteri. |
| stile | int | Stile del carattere. |
| altFamilyName | java.lang.String | Nome alternativo della famiglia di caratteri. |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
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




### setAdditionalFontsFolders(String[] additionalFontFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public static void setAdditionalFontsFolders(String[] additionalFontFolders)
```


Specifica cartelle di font aggiuntive. Le cartelle di font utilizzate dal sistema operativo sono usate dalla cache di font esterni per impostazione predefinita. Non è necessario definirle,

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | Un array di cartelle di font aggiuntive. |

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

