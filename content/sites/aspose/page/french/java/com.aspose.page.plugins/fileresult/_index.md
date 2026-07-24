---
title: "FileResult"
second_title: "Référence API Aspose.Page pour Java"
description: "Représente le résultat d'une opération sous forme de chemin de fichier sous forme de chaîne."
type: docs
weight: 14
url: /fr/java/com.aspose.page.plugins/fileresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class FileResult implements IOperationResult
```

Représente le résultat d'une opération sous forme de chemin de fichier sous forme de chaîne.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [FileResult(String path)](#FileResult-java.lang.String-) | Initialise une nouvelle instance avec le chemin spécifié vers un fichier de sortie. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Obtient les données brutes. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Indique si le résultat est un tableau d'octets. |
| [isFile()](#isFile--) | Indique si le résultat est un chemin vers un fichier de sortie. |
| [isStream()](#isStream--) | Indique si le résultat est un flux de sortie. |
| [isString()](#isString--) | Indique si le résultat est une chaîne de texte. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Tente de convertir le résultat en fichier. |
| [toStream()](#toStream--) | Tente de convertir le résultat en objet de flux. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileResult(String path) {#FileResult-java.lang.String-}
```
public FileResult(String path)
```


Initialise une nouvelle instance avec le chemin spécifié vers un fichier de sortie.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| path | java.lang.String | Chemin vers un fichier. |

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
### getData() {#getData--}
```
public final Object getData()
```


Obtient les données brutes.

**Returns:**
java.lang.Object - Un objet représentant les données de sortie.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Indique si le résultat est un tableau d'octets.

**Returns:**
boolean -  true  si le résultat est un tableau d'octets ; sinon  false .
### isFile() {#isFile--}
```
public final boolean isFile()
```


Indique si le résultat est un chemin vers un fichier de sortie.

**Returns:**
boolean -  true  si le résultat est un fichier ; sinon  false .
### isStream() {#isStream--}
```
public final boolean isStream()
```


Indique si le résultat est un flux de sortie.

**Returns:**
boolean -  true  si le résultat est un objet de flux ; sinon  false .
### isString() {#isString--}
```
public final boolean isString()
```


Indique si le résultat est une chaîne de texte.

**Returns:**
boolean -  true  si le résultat est une chaîne ; sinon  false .
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


Tente de convertir le résultat en fichier.

**Returns:**
java.lang.String - Une chaîne représentant le chemin vers le fichier de sortie si le résultat est un fichier ; sinon  null .
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Tente de convertir le résultat en objet de flux.

**Returns:**
java.io.OutputStream - Un objet de flux représentant les données de sortie si le résultat est un flux ; sinon  null .
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

