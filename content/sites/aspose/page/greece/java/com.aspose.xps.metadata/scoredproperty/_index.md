---
title: "ScoredProperty"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Η κλάση που υλοποιεί ένα κοινό PrintTicket ScoredProperty."
type: docs
weight: 146
url: /el/java/com.aspose.xps.metadata/scoredproperty/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem)
```
public class ScoredProperty extends CompositePrintTicketElement implements IOptionItem, IScoredPropertyItem
```

Η κλάση που υλοποιεί ένα κοινό PrintTicket  ScoredProperty . Η βασική κλάση για όλες τις ιδιότητες που ορίζονται από το σχήμα. Ένα στοιχείο  ScoredProperty  δηλώνει μια ιδιότητα που είναι ενσωματωμένη σε έναν ορισμό  Option . Τέτοιες ιδιότητες πρέπει να συγκρίνονται κατά την αξιολόγηση του πόσο στενά ταιριάζει μια ζητούμενη  Option  με μια υποστηριζόμενη από τη συσκευή  Option . https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [ScoredProperty(String name, ParameterRef parameterRef)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-) | Δημιουργεί μια νέα παρουσία. |
| [ScoredProperty(String name, Value value, IScoredPropertyItem[] items)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-) | Δημιουργεί μια νέα παρουσία. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Λαμβάνει το όνομα του στοιχείου. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ScoredProperty(String name, ParameterRef parameterRef) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-}
```
public ScoredProperty(String name, ParameterRef parameterRef)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| όνομα | java.lang.String | Ένα όνομα ιδιότητας. |
| parameterRef | [ParameterRef](../../com.aspose.xps.metadata/parameterref) | Μια  ParameterRef  παράδειγμα. |

### ScoredProperty(String name, Value value, IScoredPropertyItem[] items) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-}
```
public ScoredProperty(String name, Value value, IScoredPropertyItem[] items)
```


Δημιουργεί μια νέα παρουσία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| όνομα | java.lang.String | Ένα όνομα ιδιότητας. |
| value | [Value](../../com.aspose.xps.metadata/value) | Μια τιμή ιδιότητας. |
| items | [IScoredPropertyItem\[\]](../../com.aspose.xps.metadata/iscoredpropertyitem) | Ένας αυθαίρετος πίνακας  IScoredPropertyItem  παραδείγματος. Κάθε ένα πρέπει να είναι ένα  ScoredProperty , ένα  Property  ή ένα  Value  παράδειγμα. |

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
### getName() {#getName--}
```
public String getName()
```


Λαμβάνει το όνομα του στοιχείου.

**Returns:**
java.lang.String
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

