---
title: "TextRenderingHint"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Καθορίζει την ποιότητα απόδοσης κειμένου."
type: docs
weight: 25
url: /el/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Καθορίζει την ποιότητα απόδοσης κειμένου.
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [AntiAlias](#AntiAlias) | Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το αντι-αποκορυφή bitmap γλύφου χωρίς υποδείξεις. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το αντι-αποκορυφή bitmap γλύφου με υποδείξεις. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το bitmap γλύφου ClearType με υποδείξεις. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το bitmap γλύφου. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το bitmap γλύφου. |
| [SystemDefault](#SystemDefault) | Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το bitmap γλύφου, με την προεπιλεγμένη υπόδειξη απόδοσης του συστήματος. |
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
### AntiAlias {#AntiAlias}
```
public static final TextRenderingHint AntiAlias
```


Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το αντι-αποκορυφή bitmap γλύφου χωρίς υποδείξεις. Καλύτερη ποιότητα λόγω αντι-αποκορυφής. Οι διαφορές στο πλάτος των στελεχών μπορεί να είναι εμφανείς επειδή οι υποδείξεις είναι απενεργοποιημένες.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το αντι-αποκορυφή bitmap γλύφου με υποδείξεις. Πολύ καλύτερη ποιότητα λόγω αντι-αποκορυφής, αλλά με υψηλότερο κόστος απόδοσης.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το bitmap γλύφου ClearType με υποδείξεις. Η ρύθμιση υψηλότερης ποιότητας. Χρησιμοποιείται για την αξιοποίηση των χαρακτηριστικών γραμματοσειράς ClearType.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το bitmap γλύφου. Οι υποδείξεις δεν χρησιμοποιούνται.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το bitmap γλύφου. Οι υποδείξεις χρησιμοποιούνται για τη βελτίωση της εμφάνισης των χαρακτήρων στα στελέχη και τις καμπύλες.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Κάθε χαρακτήρας σχεδιάζεται χρησιμοποιώντας το bitmap γλύφου, με την προεπιλεγμένη υπόδειξη απόδοσης του συστήματος. Το κείμενο θα σχεδιαστεί χρησιμοποιώντας τις ρυθμίσεις εξομάλυνσης γραμματοσειράς που έχει επιλέξει ο χρήστης για το σύστημα.

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
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| όνομα | java.lang.String |  |

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint)
### values() {#values--}
```
public static TextRenderingHint[] values()
```




**Returns:**
com.aspose.xps.rendering.TextRenderingHint[]
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

