---
title: "BeforePageSavingEventHandler"
second_title: "Référence API Aspose.Page pour Java"
description: "La classe de base pour les gestionnaires d'événements avant l'enregistrement de la page."
type: docs
weight: 10
url: /fr/java/com.aspose.xps.features.eventbasedmodifications/beforepagesavingeventhandler/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.xps.features.EventBasedModifications.IBeforeSavingEventHandler
```
public abstract class BeforePageSavingEventHandler implements EventBasedModifications.IBeforeSavingEventHandler<EventBasedModifications.PageAPI>
```

La classe de base pour les gestionnaires d'événements avant l'enregistrement de la page.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [BeforePageSavingEventHandler()](#BeforePageSavingEventHandler--) | Crée une nouvelle instance. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [handle(EventBasedModifications.BeforeSavingEventArgs<EventBasedModifications.PageAPI> args)](#handle-com.aspose.xps.features.EventBasedModifications.BeforeSavingEventArgs-com.aspose.xps.features.EventBasedModifications.PageAPI--) | Gère l'événement. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BeforePageSavingEventHandler() {#BeforePageSavingEventHandler--}
```
public BeforePageSavingEventHandler()
```


Crée une nouvelle instance.

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
### handle(EventBasedModifications.BeforeSavingEventArgs<EventBasedModifications.PageAPI> args) {#handle-com.aspose.xps.features.EventBasedModifications.BeforeSavingEventArgs-com.aspose.xps.features.EventBasedModifications.PageAPI--}
```
public abstract void handle(EventBasedModifications.BeforeSavingEventArgs<EventBasedModifications.PageAPI> args)
```


Gère l'événement.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| args | com.aspose.xps.features.EventBasedModifications.BeforeSavingEventArgs<com.aspose.xps.features.EventBasedModifications.PageAPI> | Arguments de l'événement. |

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

