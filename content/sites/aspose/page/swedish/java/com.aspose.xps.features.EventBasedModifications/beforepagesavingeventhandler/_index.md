---
title: "BeforePageSavingEventHandler"
second_title: "Aspose.Page för Java API-referens"
description: "Bas-klassen för händelsehanterare som körs innan sidan sparas."
type: docs
weight: 10
url: /sv/java/com.aspose.xps.features.eventbasedmodifications/beforepagesavingeventhandler/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.xps.features.EventBasedModifications.IBeforeSavingEventHandler
```
public abstract class BeforePageSavingEventHandler implements EventBasedModifications.IBeforeSavingEventHandler<EventBasedModifications.PageAPI>
```

Bas-klassen för händelsehanterare som körs innan sidan sparas.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [BeforePageSavingEventHandler()](#BeforePageSavingEventHandler--) | Skapar en ny instans. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [handle(EventBasedModifications.BeforeSavingEventArgs<EventBasedModifications.PageAPI> args)](#handle-com.aspose.xps.features.EventBasedModifications.BeforeSavingEventArgs-com.aspose.xps.features.EventBasedModifications.PageAPI--) | Hantera händelsen. |
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


Skapar en ny instans.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Hantera händelsen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| args | com.aspose.xps.features.EventBasedModifications.BeforeSavingEventArgs<com.aspose.xps.features.EventBasedModifications.PageAPI> | Händelseargument. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

