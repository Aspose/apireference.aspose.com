---
title: "PsSaveOptions"
second_title: "Référence API Aspose.Page pour Java"
description: "Cette classe contient les options nécessaires à la gestion du processus de conversion."
type: docs
weight: 12
url: /fr/java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

Cette classe contient les options nécessaires à la gestion du processus de conversion.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | Initialiser une nouvelle instance de la classe PdfSaveOptions avec les valeurs par défaut pour les indicateurs suppressErrors (true) et debug (false). |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | Initialiser une nouvelle instance de la classe PdfSaveOptions avec la valeur par défaut pour l'indicateur debug (false). |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Renvoie les dossiers de polices supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Obtient l'indicateur montrant s'il est nécessaire d'enregistrer les polices non TrueType en TTF. |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | Renvoie une liste d'erreurs non critiques. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Renvoie la valeur spécifiant le niveau de compression d'une image. |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | Obtient une taille de la page ou de l'image. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Obtient l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion. |
| [isEmbedFonts()](#isEmbedFonts--) | Indique si les polices utilisées doivent être incorporées dans le document PS |
| [isSupressErrors()](#isSupressErrors--) | Renvoie une valeur indiquant si les erreurs seront supprimées pendant la conversion. |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Spécifie les dossiers de polices supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Spécifie s'il faut enregistrer les polices non TrueType en TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Spécifie l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion. |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | Spécifie si les polices utilisées doivent être incorporées dans le document PS |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | Spécifiez le type de police dans lequel incorporer les polices dans le document PS |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Définit la valeur spécifiant le niveau de compression d'une image. |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | Spécifiez le format d'enregistrement du fichier résultant |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Spécifie une taille de la page ou de l'image. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Spécifie le drapeau qui indique si les erreurs seront supprimées pendant la conversion. |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


Initialiser une nouvelle instance de la classe PdfSaveOptions avec les valeurs par défaut pour les indicateurs suppressErrors (true) et debug (false).

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


Initialiser une nouvelle instance de la classe PdfSaveOptions avec la valeur par défaut pour l'indicateur debug (false).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | Si vrai, la conversion se poursuivra malgré les erreurs non critiques. |

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Renvoie les dossiers de polices supplémentaires où le convertisseur doit rechercher les polices pour le document d'entrée. Le dossier par défaut est le dossier de polices standard où le système d'exploitation trouve les polices pour les besoins internes.

**Returns:**
java.lang.String[] - Un tableau de dossiers de polices.
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - la couleur d'arrière-plan
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Obtient l'indicateur montrant s'il est nécessaire d'enregistrer les polices non TrueType en TTF.

**Returns:**
boolean - La valeur du drapeau.
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - un type de police dans lequel incorporer les polices dans le document PS
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Renvoie une liste d'erreurs non critiques.

**Returns:**
java.util.List<java.lang.Exception> - Liste des exceptions
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Renvoie la valeur spécifiant le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est bas, plus la compression est élevée et donc la qualité de l'image est moindre. Une valeur de 0 donne l'image de la plus basse qualité, tandis qu'une valeur de 100 donne la meilleure.

**Returns:**
int - La valeur spécifiant le niveau de compression d'une image.
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - les marges de la page
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - la taille de la page
### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
### getSize() {#getSize--}
```
public Dimension getSize()
```


Obtient une taille de la page ou de l'image.

**Returns:**
java.awt.Dimension - Une taille de la page ou de l'image.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


Obtient l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion.

**Returns:**
boolean - valeur de débogage.
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


Indique si les polices utilisées doivent être incorporées dans le document PS

**Returns:**
boolean - valeur du drapeau embedFonts
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Renvoie une valeur indiquant si les erreurs seront supprimées pendant la conversion.

**Returns:**
booléen - valeur booléenne
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - Indique si l'arrière-plan est transparent
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Spécifie les dossiers de polices supplémentaires où le convertisseur doit rechercher les polices pour le document d'entrée. Le dossier par défaut est le dossier de polices standard où le système d'exploitation trouve les polices pour les besoins internes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Un tableau de dossiers de polices. |

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| backgroundColor | java.awt.Color | Spécifie la couleur d'arrière-plan |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Spécifie s'il faut enregistrer les polices non-TrueType au format TTF. Cela réduit considérablement le volume du document résultant lors de la conversion PS en PDF et augmente la vitesse de conversion des fichiers PS contenant une grande quantité de texte en polices non-TrueType vers n'importe quel format de sortie. Cependant, il y a un léger décalage vertical du texte lors de la conversion d'un fichier PostSctipt en image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | boolean | La valeur du drapeau. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Spécifie l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| debug | boolean | Valeur booléenne. |

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


Spécifie si les polices utilisées doivent être incorporées dans le document PS

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| embedFonts | boolean | drapeau embedFonts |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


Spécifiez le type de police dans lequel incorporer les polices dans le document PS

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| embedFontsAs | java.lang.String | Type de police |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Définit la valeur spécifiant le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est bas, plus la compression est élevée et donc la qualité de l'image est moindre. Une valeur de 0 donne l'image de la plus basse qualité, tandis qu'une valeur de 100 donne la meilleure.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | La valeur spécifiant le niveau de compression d'une image. |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| marges | java.awt.Insets | Spécifie les marges de la page |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| pageSize | java.awt.Dimension | Spécifie la taille de la page |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


Spécifiez le format d'enregistrement du fichier résultant

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | Format du fichier résultant |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Spécifie une taille de la page ou de l'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Taille de la page ou de l'image. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Spécifie le drapeau qui indique si les erreurs seront supprimées pendant la conversion.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | Valeur booléenne. |

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| transparent | boolean | Spécifie si l'arrière-plan est transparent |

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

