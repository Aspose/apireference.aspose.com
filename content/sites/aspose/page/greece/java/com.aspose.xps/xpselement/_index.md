---
title: "XpsElement"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει κοινά χαρακτηριστικά στοιχείων XPS."
type: docs
weight: 20
url: /el/java/com.aspose.xps/xpselement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class XpsElement extends XpsObject implements Iterable<XpsContentElement>
```

Κλάση που ενσωματώνει κοινά χαρακτηριστικά στοιχείων XPS.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Παρέχει πρόσβαση στα παιδιά του στοιχείου με βάση το δείκτη i. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Υλοποίηση της διεπαφής Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [size()](#size--) | Επιστρέφει τον αριθμό των θυγατρικών στοιχείων. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Παρέχει πρόσβαση στα παιδιά του στοιχείου με βάση το δείκτη i.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| i | int | Δείκτης του θυγατρικού στοιχείου. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
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
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Υλοποίηση της διεπαφής Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Επιστρέφει τον απαριθμητή για τη λίστα.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### size() {#size--}
```
public int size()
```


Επιστρέφει τον αριθμό των θυγατρικών στοιχείων.

**Returns:**
int - Ο αριθμός των θυγατρικών στοιχείων.
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

