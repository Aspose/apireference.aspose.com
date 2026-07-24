---
title: "BeforePageSavingEventHandler"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Η βασική κλάση για τους χειριστές συμβάντων before-page-saving."
type: docs
weight: 10
url: /el/java/com.aspose.xps.features.eventbasedmodifications/beforepagesavingeventhandler/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.xps.features.EventBasedModifications.IBeforeSavingEventHandler
```
public abstract class BeforePageSavingEventHandler implements EventBasedModifications.IBeforeSavingEventHandler<EventBasedModifications.PageAPI>
```

Η βασική κλάση για τους χειριστές συμβάντων before-page-saving.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [BeforePageSavingEventHandler()](#BeforePageSavingEventHandler--) | Δημιουργεί μια νέα παρουσία. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [handle(EventBasedModifications.BeforeSavingEventArgs<EventBasedModifications.PageAPI> args)](#handle-com.aspose.xps.features.EventBasedModifications.BeforeSavingEventArgs-com.aspose.xps.features.EventBasedModifications.PageAPI--) | Διαχειρίζεται το συμβάν. |
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


Δημιουργεί μια νέα παρουσία.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
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


Διαχειρίζεται το συμβάν.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| args | com.aspose.xps.features.EventBasedModifications.BeforeSavingEventArgs<com.aspose.xps.features.EventBasedModifications.PageAPI> | Παράμετροι συμβάντος. |

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
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

