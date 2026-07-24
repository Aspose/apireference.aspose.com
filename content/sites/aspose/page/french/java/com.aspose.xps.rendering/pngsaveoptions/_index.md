---
title: "PngSaveOptions"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe pour les options d'enregistrement XPS-as-PNG."
type: docs
weight: 15
url: /fr/java/com.aspose.xps.rendering/pngsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions), [com.aspose.xps.rendering.ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions)
```
public class PngSaveOptions extends ImageSaveOptions
```

Classe pour les options d'enregistrement XPS-as-PNG.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [PngSaveOptions()](#PngSaveOptions--) | Crée une nouvelle instance d'options. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Renvoie les dossiers de polices supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. |
| [getBatchSize()](#getBatchSize--) | Renvoie la taille d'une portion de pages à transmettre d'un nœud à l'autre. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Renvoie la collection de gestionnaires d'événements qui effectuent des modifications d'une page XPS juste avant son enregistrement. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Obtient l'indicateur montrant s'il est nécessaire d'enregistrer les polices non TrueType en TTF. |
| [getExceptions()](#getExceptions--) | Renvoie une liste d'erreurs non critiques. |
| [getImageSize()](#getImageSize--) | Obtient la taille des images de sortie en pixels. |
| [getInterpolationMode()](#getInterpolationMode--) | Obtient le mode d'interpolation. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Renvoie la valeur spécifiant le niveau de compression d'une image. |
| [getPageNumbers()](#getPageNumbers--) | Obtient le tableau des numéros de pages à rendre. |
| [getResolution()](#getResolution--) | Obtient la résolution de l'image. |
| [getSize()](#getSize--) | Obtient une taille de la page ou de l'image. |
| [getSmoothingMode()](#getSmoothingMode--) | Obtient le mode d'anticrénelage. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Obtient l'indice de rendu du texte. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Obtient l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion. |
| [isSupressErrors()](#isSupressErrors--) | Renvoie une valeur indiquant si les erreurs seront supprimées pendant la conversion. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Spécifie les dossiers de polices supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. |
| [setBatchSize(int value)](#setBatchSize-int-) | Définit la taille d'une portion de pages à transmettre d'un nœud à l'autre. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Spécifie s'il faut enregistrer les polices non TrueType en TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Spécifie l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Définit la taille des images de sortie en pixels. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Définit le mode d'interpolation. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Définit la valeur spécifiant le niveau de compression d'une image. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Définit le tableau des numéros de pages à rendre. |
| [setResolution(float value)](#setResolution-float-) | Définit la résolution de l'image. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Spécifie une taille de la page ou de l'image. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Définit le mode d'anticrénelage. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Spécifie le drapeau qui indique si les erreurs seront supprimées pendant la conversion. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Définit l'indice de rendu du texte. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PngSaveOptions() {#PngSaveOptions--}
```
public PngSaveOptions()
```


Crée une nouvelle instance d'options.

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Renvoie la taille d'une portion de pages à transmettre d'un nœud à l'autre.

**Returns:**
int - La taille d'une portion de pages à transmettre d'un nœud à l'autre.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Renvoie la collection de gestionnaires d'événements qui effectuent des modifications d'une page XPS juste avant son enregistrement.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Renvoie une liste d'erreurs non critiques.

**Returns:**
java.util.List<java.lang.Exception> - Liste des exceptions
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Obtient la taille des images de sortie en pixels.

**Returns:**
java.awt.Dimension - La taille des images de sortie en pixels.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Obtient le mode d'interpolation.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Renvoie la valeur spécifiant le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est bas, plus la compression est élevée et donc la qualité de l'image est moindre. Une valeur de 0 donne l'image de la plus basse qualité, tandis qu'une valeur de 100 donne la meilleure.

**Returns:**
int - La valeur spécifiant le niveau de compression d'une image.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Obtient le tableau des numéros de pages à rendre.

**Returns:**
int[] - Numéros de pages.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Obtient la résolution de l'image.

**Returns:**
float - La résolution de l'image.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Obtient une taille de la page ou de l'image.

**Returns:**
java.awt.Dimension - Une taille de la page ou de l'image.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Obtient le mode d'anticrénelage.

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Obtient l'indice de rendu du texte.

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Renvoie une valeur indiquant si les erreurs seront supprimées pendant la conversion.

**Returns:**
booléen - valeur booléenne
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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Définit la taille d'une portion de pages à transmettre d'un nœud à l'autre.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | La taille d'une portion de pages à transmettre d'un nœud à l'autre. |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Définit la taille des images de sortie en pixels.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | java.awt.Dimension | La taille des images de sortie en pixels. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Définit le mode d'interpolation.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | Le mode d'interpolation. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Définit la valeur spécifiant le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est bas, plus la compression est élevée et donc la qualité de l'image est moindre. Une valeur de 0 donne l'image de la plus basse qualité, tandis qu'une valeur de 100 donne la meilleure.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | La valeur spécifiant le niveau de compression d'une image. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Définit le tableau des numéros de pages à rendre.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int[] | Nombre de pages. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Définit la résolution de l'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | float | La résolution de l'image. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Spécifie une taille de la page ou de l'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Taille de la page ou de l'image. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Définit le mode d'anticrénelage.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Le mode de lissage. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Spécifie le drapeau qui indique si les erreurs seront supprimées pendant la conversion.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | Valeur booléenne. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Définit l'indice de rendu du texte.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | L'indice de rendu du texte. |

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

