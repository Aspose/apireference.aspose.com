---
title: "XpsConverterToPdfOptions"
second_title: "Référence API Aspose.Page pour Java"
description: "Représente les options du convertisseur XPS vers PDF pour le plugin."
type: docs
weight: 13
url: /fr/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

Représente les options du convertisseur XPS vers PDF pour le plugin [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | Initialise une nouvelle instance de l'objet [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions). |
## Méthodes

| Méthode | Description |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Ajoute une nouvelle source de données à la collection de données du plugin XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Ajoute une nouvelle source de données à la collection de données du plugin XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Renvoie la collection de données du plugin XpsConverterOptions. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Renvoie la valeur spécifiant le niveau de compression d'une image. |
| [getOperationName()](#getOperationName--) | Renvoie le nom de l'opération. |
| [getPageNumbers()](#getPageNumbers--) | Obtient le tableau des numéros de pages du document XPS à convertir. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Obtient la collection des cibles ajoutées pour les résultats de l'opération d'enregistrement. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Définit la valeur spécifiant le niveau de compression d'une image. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Définit le tableau du nombre de pages du document XPS à convertir. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


Initialise une nouvelle instance de l'objet [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions).

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
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Obtient la collection des cibles ajoutées pour les résultats de l'opération d'enregistrement.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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

