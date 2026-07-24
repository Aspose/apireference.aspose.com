---
title: "PdfImageCompression"
second_title: "Référence API Aspose.Page pour Java"
description: "Spécifie le type de compression appliqué aux images dans le fichier PDF."
type: docs
weight: 22
url: /fr/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

Spécifie le type de compression appliqué aux images dans le fichier PDF.
## Champs

| Champ | Description |
| --- | --- |
| [Auto](#Auto) | Sélectionne automatiquement la compression la plus appropriée pour chaque image. |
| [Flate](#Flate) | Compression Flate. |
| [Jpeg](#Jpeg) | Compression JPEG. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | La sélection du prédicteur est limitée au prédicteur PNG Paeth pour accélérer le processus. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | La sélection du prédicteur est plus compliquée et devrait produire des tailles d'image plus petites mais prendre plus de temps. |
| [None](#None) | Enregistre les octets d'image bruts, ce qui entraîne des tailles de fichier PDF plus importantes. |
| [Rle](#Rle) | Compression Run Length. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Auto {#Auto}
```
public static final PdfImageCompression Auto
```


Sélectionne automatiquement la compression la plus appropriée pour chaque image.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Compression Flate.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


Compression JPEG. Ne prend pas en charge la transparence.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


La sélection du prédicteur est limitée au prédicteur PNG Paeth pour accélérer le processus. En pratique, cela fonctionne étonnamment bien. Mieux que LzwOptimizedPredictor.

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


La sélection du prédicteur est plus compliquée et devrait produire des tailles d'image plus petites mais prendre plus de temps.

### None {#None}
```
public static final PdfImageCompression None
```


Enregistre les octets d'image bruts, ce qui entraîne des tailles de fichier PDF plus importantes.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Compression Run Length.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static PdfImageCompression valueOf(String name)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| nom | java.lang.String |  |

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression)
### values() {#values--}
```
public static PdfImageCompression[] values()
```




**Returns:**
com.aspose.xps.rendering.PdfImageCompression[]
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

