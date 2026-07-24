---
title: "XpsArray"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει κοινά χαρακτηριστικά αντικειμένων πίνακα μοντέλου XPS."
type: docs
weight: 14
url: /el/java/com.aspose.xps/xpsarray/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public abstract class XpsArray<T> extends XpsObject
```

Κλάση που ενσωματώνει κοινά χαρακτηριστικά αντικειμένων πίνακα μοντέλου XPS.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [add(T obj)](#add-T-) | Προσθέτει ένα νέο αντικείμενο στον πίνακα. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Παρέχει πρόσβαση στο στοιχείο του πίνακα με βάση το δείκτη i. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Εισάγει ένα νέο αντικείμενο στον πίνακα στη συγκεκριμένη θέση. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Αφαιρεί ένα αντικείμενο από τον πίνακα. |
| [removeAt(int index)](#removeAt-int-) | Αφαιρεί ένα αντικείμενο από τον πίνακα στη συγκεκριμένη θέση. |
| [size()](#size--) | Επιστρέφει τον αριθμό των στοιχείων. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Προσθέτει ένα νέο αντικείμενο στον πίνακα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| obj | T | Το αντικείμενο προς προσθήκη. |

**Returns:**
T - Προστέθηκε αντικείμενο.
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
public T get(int i)
```


Παρέχει πρόσβαση στο στοιχείο του πίνακα με βάση το δείκτη i.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| i | int | Δείκτης του στοιχείου. |

**Returns:**
T - Το στοιχείο στη θέση i.
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
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


Εισάγει ένα νέο αντικείμενο στον πίνακα στη συγκεκριμένη θέση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Η θέση για την εισαγωγή ενός αντικειμένου. |
| obj | T | Το αντικείμενο προς εισαγωγή. |

**Returns:**
T - Εισαχθέν αντικείμενο.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


Αφαιρεί ένα αντικείμενο από τον πίνακα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| obj | T | Το αντικείμενο προς αφαίρεση. |

**Returns:**
T - Το αφαιρεθέν αντικείμενο.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Αφαιρεί ένα αντικείμενο από τον πίνακα στη συγκεκριμένη θέση.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Η θέση στην οποία θα αφαιρεθεί ένα αντικείμενο. |

**Returns:**
T - Το αφαιρεθέν αντικείμενο.
### size() {#size--}
```
public int size()
```


Επιστρέφει τον αριθμό των στοιχείων.

**Returns:**
int - Ο αριθμός των στοιχείων.
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

