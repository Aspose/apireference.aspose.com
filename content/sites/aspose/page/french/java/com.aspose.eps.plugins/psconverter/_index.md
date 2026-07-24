---
title: "PsConverter"
second_title: "Référence API Aspose.Page pour Java"
description: "Représente le plugin PsConverter."
type: docs
weight: 10
url: /fr/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

Représente le plugin PsConverter.

L'exemple montre comment convertir un fichier PS/EPS en document PDF.

// crée PsConverter PsConverter converter = new PsConverter(); // crée l'objet PsConverterToPdfOptions pour définir le type de données de sortie comme fichier PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // ajoute le chemin du fichier d'entrée opt.addDataSource(new FileDataSource(inputPath)); // définit le chemin du fichier de sortie opt.addSaveDataSource(new FileDataSource(outputPath)); // lance le processus de conversion ResultContainer results = converter.process(opt);

L'exemple montre comment convertir un fichier PS/EPS en image avec une sortie fichier.

// crée PsConverter PsConverter converter = new PsConverter(); // crée PsConverterToImageOptions avec le format d'image cible JPEG. Le format d'image par défaut pour l'image résultante est PNG. // Nous pouvons également définir une taille de l'image résultante, une résolution, un mode d'anticrénelage et le niveau de qualité JPEG pour le format d'image JPEG résultant. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // ajoute le chemin du fichier d'entrée opt.addDataSource(new FileDataSource(inputPath)); // si le fichier PS d'entrée est multipage, les résultats seront un ensemble de fichiers image avec le nom : ["outputPath" sans extension][numéro de page commençant à 0].[extension de "outputPath"] opt.addSaveDataSource(new FileDataSource(outputPath)); // lance le processus de conversion converter.process(opt);

L'exemple montre comment convertir un fichier PS/EPS en image avec une sortie sous forme de tableaux d'octets.

Dans la source de données de sortie sous forme de tableaux d'octets (byte [][]), chaque tableau d'octets contient l'image d'une page. Ainsi, pour les documents d'une seule page, le résultat contiendra un tableau [1][], et pour les documents multipages, le résultat contiendra un tableau [nombre de pages du document PS d'entrée][]. // crée PsConverter PsConverter converter = new PsConverter(); // crée PsConverterToImageOptions avec le format d'image cible JPEG. Le format d'image par défaut pour l'image résultante est PNG. // Nous pouvons également définir une taille de l'image résultante, une résolution, un mode d'anticrénelage et le niveau de qualité JPEG pour le format d'image JPEG résultant. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // ajoute le chemin du fichier d'entrée opt.addDataSource(new FileDataSource(inputPath)); // si le fichier PS d'entrée est multipage, les résultats seront un ensemble de fichiers image avec le nom : ["outputPath" sans extension][numéro de page commençant à 0].[extension de "outputPath"] opt.addSaveDataSource(new ByteArrayDataSource()); // lance le processus de conversion converter.process(opt); // obtient les tableaux d'octets résultants byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## Méthodes

| Méthode | Description |
| --- | --- |
| [dispose()](#dispose--) | Implémentation de IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Démarre le traitement du PsConverter avec les paramètres spécifiés. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverter() {#PsConverter--}
```
public PsConverter()
```


### dispose() {#dispose--}
```
public final void dispose()
```


Implémentation de IDisposable.

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




### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public final ResultContainer process(IPluginOptions options)
```


Démarre le traitement du PsConverter avec les paramètres spécifiés.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Un objet d'options contenant les instructions pour le PsConverter. |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the operation.
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

