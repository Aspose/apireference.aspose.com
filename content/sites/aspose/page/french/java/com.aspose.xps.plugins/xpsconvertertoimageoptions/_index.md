---
title: "XpsConverterToImageOptions"
second_title: "Référence API Aspose.Page pour Java"
description: "Représente les options du convertisseur XPS vers Image pour le plugin."
type: docs
weight: 12
url: /fr/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

Représente les options du convertisseur XPS vers Image pour le plugin [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions). |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) avec le format d'image. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) avec une taille de l'image résultante. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) avec le format d'image. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Ajoute une nouvelle source de données à la collection de données du plugin XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Ajoute une nouvelle source de données à la collection de données du plugin XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Renvoie la collection de données du plugin XpsConverterOptions. |
| [getImageFormat()](#getImageFormat--) | Obtient le format d'image. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Renvoie la valeur spécifiant le niveau de compression d'une image. |
| [getOperationName()](#getOperationName--) | Renvoie le nom de l'opération. |
| [getPageNumbers()](#getPageNumbers--) | Obtient le tableau des numéros de pages du document XPS à convertir. |
| [getResolution()](#getResolution--) | Obtient la résolution de l'image. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Obtient la collection des cibles ajoutées pour les résultats de l'opération d'enregistrement. |
| [getSize()](#getSize--) | Obtient la taille de l'image résultante. |
| [getSmoothingMode()](#getSmoothingMode--) | Obtient le mode d'anticrénelage pour le rendu de l'image. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Obtient le format d'image. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Définit la valeur spécifiant le niveau de compression d'une image. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Définit le tableau du nombre de pages du document XPS à convertir. |
| [setResolution(int resolution)](#setResolution-int-) | Définit la résolution de l'image. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Définit la taille de l'image résultante. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Définit le mode d'anticrénelage pour le rendu de l'image. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions).

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) avec le format d'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un format d'image résultante. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) avec une taille de l'image résultante.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Une taille de l'image résultante. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) avec le format d'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un format d'image résultante. |
| taille | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Ajoute une nouvelle source de données à la collection de données du plugin XpsConverter.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Source de données à ajouter. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Ajoute une nouvelle source de données à la collection de données du plugin XpsConverterOptions.

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


Renvoie la collection de données du plugin XpsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Obtient le tableau des numéros de pages du document XPS à convertir.

**Returns:**
int[] - Un tableau du nombre de pages du document XPS.
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
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

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Définit le tableau du nombre de pages du document XPS à convertir. Si non défini, toutes les pages seront converties.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| pageNumbers | int[] | Un tableau de nombres de pages dans le document XPS. |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Définit le mode d'anticrénelage pour le rendu de l'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Un mode d'anticrénelage. |

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

