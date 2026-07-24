---
title: "BeforeSavingEventArgs"
second_title: "Référence API Aspose.Page pour Java"
description: "Définit la classe de base pour les arguments de divers événements avant l'enregistrement."
type: docs
weight: 11
url: /fr/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Définit la classe de base pour les arguments de divers événements avant l'enregistrement.
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | Renvoie le numéro de page absolu actuel de tous les documents du package XPS. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | Renvoie le numéro de document actuel du package XPS. |
| [getElementAPI()](#getElementAPI--) | Renvoie l'API de modification de l'élément qui est sur le point d'être enregistré. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Renvoie le numéro de sortie actuel. |
| [getRelativePageNumber()](#getRelativePageNumber--) | Renvoie le numéro de page actuel relatif au document en cours du package XPS. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


Renvoie le numéro de page absolu actuel de tous les documents du package XPS.

**Returns:**
int - Le numéro de page absolu actuel de tous les documents du package XPS.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


Renvoie le numéro de document actuel du package XPS.

**Returns:**
int - Le numéro de document actuel du package XPS.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Renvoie l'API de modification de l'élément qui est sur le point d'être enregistré.

**Returns:**
T - L'API de modification de l'élément qui est sur le point d'être enregistré.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Renvoie le numéro de sortie actuel. Il diffère de **AbsolutePageNumber** si l'option d'enregistrement **PageNumbers** est spécifiée.

**Returns:**
int - Le numéro de sortie actuel.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


Renvoie le numéro de page actuel relatif au document en cours du package XPS.

**Returns:**
int - Le numéro de page actuel relatif au document en cours du package XPS.
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

