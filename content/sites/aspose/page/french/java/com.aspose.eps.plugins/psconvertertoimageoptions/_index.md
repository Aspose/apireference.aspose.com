---
title: "PsConverterToImageOptions"
second_title: "Référence API Aspose.Page pour Java"
description: "Représente les options du convertisseur PS/EPS vers Image pour le plugin."
type: docs
weight: 12
url: /fr/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

Représente les options du convertisseur PS/EPS vers Image pour le plugin [PsConverter](../../com.aspose.eps.plugins/psconverter).
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | Initialise une nouvelle instance de l'objet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions). |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | Initialise une nouvelle instance de l'objet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) avec le format d'image. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | Initialise une nouvelle instance de l'objet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) avec une taille de l'image résultante. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Initialise une nouvelle instance de l'objet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) avec le format d'image. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Ajoute une nouvelle source de données à la collection de données du plugin PsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Ajoute une nouvelle source de données à la collection de données du plugin PsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Renvoie les dossiers de polices supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Renvoie la collection de données du plugin PsConverterOptions. |
| [getExceptions()](#getExceptions--) | Renvoie une liste d'erreurs non critiques. |
| [getImageFormat()](#getImageFormat--) | Obtient le format d'image. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Renvoie la valeur spécifiant le niveau de compression d'une image. |
| [getOperationName()](#getOperationName--) | Renvoie le nom de l'opération. |
| [getResolution()](#getResolution--) | Obtient la résolution de l'image. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Obtient la collection des cibles ajoutées pour les résultats de l'opération d'enregistrement. |
| [getSize()](#getSize--) | Obtient la taille de l'image résultante. |
| [getSmoothingMode()](#getSmoothingMode--) | Obtient le mode d'anticrénelage pour le rendu de l'image. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Obtient l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion. |
| [isSupressErrors()](#isSupressErrors--) | Renvoie une valeur indiquant si les erreurs seront supprimées pendant la conversion. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Spécifie les dossiers de polices supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Spécifie l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Obtient le format d'image. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Définit la valeur spécifiant le niveau de compression d'une image. |
| [setResolution(int resolution)](#setResolution-int-) | Définit la résolution de l'image. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Définit la taille de l'image résultante. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Définit le mode d'anticrénelage pour le rendu de l'image. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Spécifie le drapeau qui indique si les erreurs seront supprimées pendant la conversion. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


Initialise une nouvelle instance de l'objet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions).

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


Initialise une nouvelle instance de l'objet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) avec le format d'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un format d'image résultante. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


Initialise une nouvelle instance de l'objet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) avec une taille de l'image résultante.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Une taille de l'image résultante. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Initialise une nouvelle instance de l'objet [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) avec le format d'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un format d'image résultante. |
| taille | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Ajoute une nouvelle source de données à la collection de données du plugin PsConverter.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Source de données à ajouter. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Ajoute une nouvelle source de données à la collection de données du plugin PsConverterOptions.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Source de données (fichier ou flux) pour les résultats de l'opération d'enregistrement. |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Renvoie la collection de données du plugin PsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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


Obtient le format d'image.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Renvoie la valeur spécifiant le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est bas, plus la compression est élevée et donc la qualité de l'image est moindre. Une valeur de 0 donne l'image de la plus basse qualité, tandis qu'une valeur de 100 donne la meilleure.

**Returns:**
int - La valeur spécifiant le niveau de compression d'une image.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Renvoie le nom de l'opération.

**Returns:**
java.lang.String
### getResolution() {#getResolution--}
```
public int getResolution()
```


Obtient la résolution de l'image.

**Returns:**
int - Une résolution d'image.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Obtient la collection des cibles ajoutées pour les résultats de l'opération d'enregistrement.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Obtient la taille de l'image résultante.

**Returns:**
java.awt.Dimension - Une taille d'image.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Obtient le mode d'anticrénelage pour le rendu de l'image.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - A smoothing mode.
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


Obtient le format d'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un format d'image résultante. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Définit la valeur spécifiant le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est bas, plus la compression est élevée et donc la qualité de l'image est moindre. Une valeur de 0 donne l'image de la plus basse qualité, tandis qu'une valeur de 100 donne la meilleure.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | La valeur spécifiant le niveau de compression d'une image. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Définit la résolution de l'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| résolution | int | Une résolution de l'image résultante. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Définit la taille de l'image résultante.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Une taille de l'image résultante. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Définit le mode d'anticrénelage pour le rendu de l'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | Un mode d'anticrénelage. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Spécifie le drapeau qui indique si les erreurs seront supprimées pendant la conversion.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | Valeur booléenne. |

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

