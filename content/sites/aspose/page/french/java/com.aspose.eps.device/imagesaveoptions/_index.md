---
title: "ImageSaveOptions"
second_title: "Référence API Aspose.Page pour Java"
description: "Cette classe contient les options nécessaires à la gestion du processus de conversion."
type: docs
weight: 10
url: /fr/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

Cette classe contient les options nécessaires à la gestion du processus de conversion.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Initialiser une nouvelle instance de la classe ImageSaveOptions avec les valeurs par défaut pour les indicateurs suppressErrors (true) et debug (false). |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | Initialise une nouvelle instance de ImageSaveOptions avec le format d'image spécifié. |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | Initialise une nouvelle instance de ImageSaveOptions avec la taille de l'image spécifiée. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | Initialise une nouvelle instance de ImageSaveOptions avec la taille de l'image et le format d'image spécifiés. |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | Initialise une nouvelle instance de ImageSaveOptions avec le format d'image et l'indicateur suppressErrors spécifiés. |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | Initialise une nouvelle instance de ImageSaveOptions avec la taille de l'image et l'indicateur suppressErrors spécifiés. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | Initialise une nouvelle instance de ImageSaveOptions avec la taille de l'image, le format d'image et l'indicateur suppressErrors spécifiés. |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | Initialiser une nouvelle instance de la classe ImageSaveOptions avec la valeur par défaut pour l'indicateur debug (false). |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Renvoie les dossiers de polices supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Obtient l'indicateur montrant s'il est nécessaire d'enregistrer les polices non TrueType en TTF. |
| [getExceptions()](#getExceptions--) | Renvoie une liste d'erreurs non critiques. |
| [getImageFormat()](#getImageFormat--) | Obtient un format d'image pour l'image résultante. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Renvoie la valeur spécifiant le niveau de compression d'une image. |
| [getResolution()](#getResolution--) | Renvoie la résolution de l'image résultante. |
| [getSize()](#getSize--) | Obtient une taille de la page ou de l'image. |
| [getSmoothingMode()](#getSmoothingMode--) | Obtient le mode de lissage. |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | Indique si la bibliothèque tentera de joindre les fragments d'image. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Obtient l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion. |
| [isSupressErrors()](#isSupressErrors--) | Renvoie une valeur indiquant si les erreurs seront supprimées pendant la conversion. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Spécifie les dossiers de polices supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Spécifie s'il faut enregistrer les polices non TrueType en TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Spécifie l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Spécifie un format d'image pour l'image résultante. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Définit la valeur spécifiant le niveau de compression d'une image. |
| [setResolution(float resolution)](#setResolution-float-) | Spécifie la résolution de l'image résultante. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Spécifie une taille de la page ou de l'image. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Définit le mode d'anticrénelage. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Spécifie le drapeau qui indique si les erreurs seront supprimées pendant la conversion. |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | Spécifie si la bibliothèque doit essayer de joindre les fragments d'image. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Initialiser une nouvelle instance de la classe ImageSaveOptions avec les valeurs par défaut pour les indicateurs suppressErrors (true) et debug (false).

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


Initialise une nouvelle instance de ImageSaveOptions avec le format d'image spécifié.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Le format de l'image. |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


Initialise une nouvelle instance de ImageSaveOptions avec la taille de l'image spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Taille de l'image. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


Initialise une nouvelle instance de ImageSaveOptions avec la taille de l'image et le format d'image spécifiés.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Taille de l'image. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format de l'image. |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


Initialise une nouvelle instance de ImageSaveOptions avec le format d'image et l'indicateur suppressErrors spécifiés.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format de l'image. |
| supressErrors | boolean | Si vrai, la conversion se poursuivra malgré les erreurs non critiques. |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


Initialise une nouvelle instance de ImageSaveOptions avec la taille de l'image et l'indicateur suppressErrors spécifiés.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Taille de l'image. |
| supressErrors | boolean | Si vrai, la conversion se poursuivra malgré les erreurs non critiques. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


Initialise une nouvelle instance de ImageSaveOptions avec la taille de l'image, le format d'image et l'indicateur suppressErrors spécifiés.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Taille de l'image. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format de l'image. |
| supressErrors | boolean | Si vrai, la conversion se poursuivra malgré les erreurs non critiques. |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


Initialiser une nouvelle instance de la classe ImageSaveOptions avec la valeur par défaut pour l'indicateur debug (false).

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
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Obtient un format d'image pour l'image résultante.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Renvoie la valeur spécifiant le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est bas, plus la compression est élevée et donc la qualité de l'image est moindre. Une valeur de 0 donne l'image de la plus basse qualité, tandis qu'une valeur de 100 donne la meilleure.

**Returns:**
int - La valeur spécifiant le niveau de compression d'une image.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Renvoie la résolution de l'image résultante.

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


Obtient le mode de lissage.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


Indique si la bibliothèque tentera de joindre les fragments d'image. Il est utilisé lorsque l'image dans un fichier source PS/EPS est découpée en fragments. Dans ce cas, sans ce drapeau, de fines lacunes restent entre les fragments.

**Returns:**
boolean - la valeur du drapeau.
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

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Spécifie un format d'image pour l'image résultante.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un format d'image de sortie. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Définit la valeur spécifiant le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est bas, plus la compression est élevée et donc la qualité de l'image est moindre. Une valeur de 0 donne l'image de la plus basse qualité, tandis qu'une valeur de 100 donne la meilleure.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | La valeur spécifiant le niveau de compression d'une image. |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


Spécifie la résolution de l'image résultante.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| résolution | float | La résolution de l'image. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Spécifie une taille de la page ou de l'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Taille de la page ou de l'image. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Définit le mode d'anticrénelage.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | le smoothingMode à définir |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Spécifie le drapeau qui indique si les erreurs seront supprimées pendant la conversion.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | Valeur booléenne. |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


Spécifie si la bibliothèque doit essayer de joindre les fragments d'image. Il est utilisé lorsque l'image dans un fichier source PS/EPS est découpée en fragments. Dans ce cas, sans ce drapeau, de fines lacunes restent entre les fragments.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| tryJoinImageFragments | boolean | la valeur du drapeau. |

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

