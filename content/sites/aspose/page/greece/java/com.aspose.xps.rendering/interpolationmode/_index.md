---
title: "InterpolationMode"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Καθορίζει τον αλγόριθμο που χρησιμοποιείται όταν οι εικόνες κλιμακώνονται ή περιστρέφονται."
type: docs
weight: 20
url: /el/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

Καθορίζει τον αλγόριθμο που χρησιμοποιείται όταν οι εικόνες κλιμακώνονται ή περιστρέφονται.
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [Bicubic](#Bicubic) | Καθορίζει διπλοκυβική παρεμβολή. |
| [Bilinear](#Bilinear) | Καθορίζει δισδιάστατη γραμμική παρεμβολή. |
| [Default](#Default) | Καθορίζει προεπιλεγμένη λειτουργία. |
| [High](#High) | Καθορίζει παρεμβολή υψηλής ποιότητας. |
| [HighQualityBicubic](#HighQualityBicubic) | Καθορίζει υψηλής ποιότητας, διπλοκυβική παρεμβολή. |
| [HighQualityBilinear](#HighQualityBilinear) | Καθορίζει υψηλής ποιότητας, δισδιάστατη γραμμική παρεμβολή. |
| [Low](#Low) | Καθορίζει παρεμβολή χαμηλής ποιότητας. |
| [NearestNeighbor](#NearestNeighbor) | Καθορίζει παρεμβολή κοντινότερου γείτονα. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
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
### Bicubic {#Bicubic}
```
public static final InterpolationMode Bicubic
```


Καθορίζει διπλοκυβική παρεμβολή. Δεν γίνεται prefiltering. Αυτή η λειτουργία δεν είναι κατάλληλη για σμίκρυνση εικόνας κάτω από 25 % του αρχικού μεγέθους.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


Καθορίζει δισδιάστατη γραμμική παρεμβολή. Δεν γίνεται prefiltering. Αυτή η λειτουργία δεν είναι κατάλληλη για σμίκρυνση εικόνας κάτω από 50 % του αρχικού μεγέθους.

### Default {#Default}
```
public static final InterpolationMode Default
```


Καθορίζει προεπιλεγμένη λειτουργία.

### High {#High}
```
public static final InterpolationMode High
```


Καθορίζει παρεμβολή υψηλής ποιότητας.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


Καθορίζει υψηλής ποιότητας, διπλοκυβική παρεμβολή. Εκτελείται prefiltering για να εξασφαλιστεί σμίκρυνση υψηλής ποιότητας. Αυτή η λειτουργία παράγει τις εικόνες υψηλότερης ποιότητας μετά τη μετασχηματισμό.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


Καθορίζει υψηλής ποιότητας, δισδιάστατη γραμμική παρεμβολή. Εκτελείται prefiltering για να εξασφαλιστεί σμίκρυνση υψηλής ποιότητας.

### Low {#Low}
```
public static final InterpolationMode Low
```


Καθορίζει παρεμβολή χαμηλής ποιότητας.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


Καθορίζει παρεμβολή κοντινότερου γείτονα.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
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
| Παράμετρος | Τύπος | Περιγραφή |
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
public static InterpolationMode valueOf(String name)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| όνομα | java.lang.String |  |

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode)
### values() {#values--}
```
public static InterpolationMode[] values()
```




**Returns:**
com.aspose.xps.rendering.InterpolationMode[]
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

