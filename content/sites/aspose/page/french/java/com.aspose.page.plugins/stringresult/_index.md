---
title: "StringResult"
second_title: "Référence API Aspose.Page pour Java"
description: "Représente le résultat d'une opération sous forme de chaîne."
type: docs
weight: 19
url: /fr/java/com.aspose.page.plugins/stringresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StringResult implements IOperationResult
```

Représente le résultat d'une opération sous forme de chaîne.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [StringResult(String result)](#StringResult-java.lang.String-) | Initialise une nouvelle instance StringResult avec une chaîne. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Obtient les données brutes. |
| [getText()](#getText--) | Renvoie la représentation sous forme de chaîne du résultat. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Indique si le résultat est un tableau d'octets. |
| [isFile()](#isFile--) | Indique si le résultat est un chemin vers un fichier de sortie. |
| [isStream()](#isStream--) | Indique si le résultat est un chemin vers un fichier de sortie. |
| [isString()](#isString--) | Indique si le résultat est une chaîne. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Tente de convertir le résultat en fichier. |
| [toStream()](#toStream--) | Tente de convertir le résultat en objet de flux. |
| [toString()](#toString--) | Essaie de convertir le résultat en chaîne. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringResult(String result) {#StringResult-java.lang.String-}
```
public StringResult(String result)
```


Initialise une nouvelle instance StringResult avec une chaîne.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| résultat | java.lang.String | Chaîne représentant le résultat |

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
### getText() {#getText--}
```
public final String getText()
```


Renvoie la représentation sous forme de chaîne du résultat.

**Returns:**
java.lang.String
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


Indique si le résultat est un chemin vers un fichier de sortie.

**Returns:**
boolean -  true  si le résultat est un objet de flux ; sinon  false .
### isString() {#isString--}
```
public final boolean isString()
```


Indique si le résultat est une chaîne.

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


Essaie de convertir le résultat en chaîne.

**Returns:**
java.lang.String - Une chaîne représentant le contenu texte si le résultat est une chaîne ; sinon elle renvoie base.ToString().
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

