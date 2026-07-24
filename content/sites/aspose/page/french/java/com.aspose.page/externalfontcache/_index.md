---
title: "ExternalFontCache"
second_title: "Référence API Aspose.Page pour Java"
description: "Utilisez cette classe pour obtenir l'encapsulation de police sous une forme acceptée par Device."
type: docs
weight: 13
url: /fr/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Utilisez cette classe pour obtenir l'encapsulation de police sous une forme acceptée par Device.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Champs

| Champ | Description |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | Taille de police par défaut. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | Style de police par défaut. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | Récupère DrFont par nom de famille de police, taille par défaut (1) et style par défaut (PLAIN). |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | Récupère DrFont par nom de famille de police, taille par défaut (1) et style. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | Récupère DrFont par nom de famille de police, taille et style. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | Récupère DrFont par nom de famille de police, taille, style et majuscules de police. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | Récupère DrFont par nom de famille de police, taille, style et nom de famille de police alternatif. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | Récupère DrFont par nom de famille de police, taille, style, majuscules de police et nom de famille de police alternatif. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | Récupère TTFont par nom de famille de police, style et nom de famille de police alternatif. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Spécifie des dossiers de polices supplémentaires. |
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


Taille de police par défaut.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


Style de police par défaut.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


Récupère DrFont par nom de famille de police, taille par défaut (1) et style par défaut (PLAIN).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Nom de famille de police. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


Récupère DrFont par nom de famille de police, taille par défaut (1) et style.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Nom de famille de police. |
| style | int | Style de police. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


Récupère DrFont par nom de famille de police, taille et style.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Nom de famille de police. |
| sizePoints | float | Taille de police en points (un point vaut 1/72 de pouce). |
| style | int | Style de police. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


Récupère DrFont par nom de famille de police, taille, style et majuscules de police.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Nom de famille de police. |
| sizePoints | float | Taille de police en points (un point vaut 1/72 de pouce). |
| style | int | Style de police. |
| fontCapitals | int | Majuscules de police. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


Récupère DrFont par nom de famille de police, taille, style et nom de famille de police alternatif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Nom de famille de police. |
| sizePoints | float | Taille de police en points (un point vaut 1/72 de pouce). |
| style | int | Style de police. |
| altFamilyName | java.lang.String | Nom de famille de police alternatif. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


Récupère DrFont par nom de famille de police, taille, style, majuscules de police et nom de famille de police alternatif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Nom de famille de police. |
| sizePoints | float | Taille de police en points (un point vaut 1/72 de pouce). |
| style | int | Style de police. |
| altFamilyName | java.lang.String | Nom de famille de police alternatif. |
| fontCapitals | int | Majuscules de police. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


Récupère TTFont par nom de famille de police, style et nom de famille de police alternatif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Nom de famille de police. |
| style | int | Style de police. |
| altFamilyName | java.lang.String | Nom de famille de police alternatif. |

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


Spécifie les dossiers de polices supplémentaires. Les dossiers de polices utilisés par le système d'exploitation sont utilisés par le cache de polices externes par défaut. Il n'est pas nécessaire de les définir,

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | Un tableau de dossiers de polices supplémentaires. |

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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

