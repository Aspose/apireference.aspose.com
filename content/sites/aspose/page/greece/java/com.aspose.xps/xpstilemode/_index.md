---
title: "XpsTileMode"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Έγκυρες τιμές της ιδιότητας TileMode των πινέλων επικάλυψης."
type: docs
weight: 66
url: /el/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Έγκυρες τιμές της ιδιότητας TileMode των πινέλων επικάλυψης.
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [FlipX](#FlipX) | Η διάταξη των πλακιδίων είναι παρόμοια με τη λειτουργία Tile, αλλά εναλλασσόμενες στήλες πλακιδίων αντιστρέφονται οριζόντια. |
| [FlipXY](#FlipXY) | Η διάταξη των πλακιδίων είναι παρόμοια με τη λειτουργία Tile, αλλά εναλλασσόμενες στήλες πλακιδίων αντιστρέφονται οριζόντια και εναλλασσόμενες σειρές πλακιδίων αντιστρέφονται κάθετα. |
| [FlipY](#FlipY) | Η διάταξη των πλακιδίων είναι παρόμοια με τη λειτουργία Tile, αλλά εναλλασσόμενες σειρές πλακιδίων αντιστρέφονται κάθετα. |
| [None](#None) | Σε αυτή τη λειτουργία, σχεδιάζεται μόνο το μοναδικό βασικό πλακίδιο. |
| [Tile](#Tile) | Σε αυτή τη λειτουργία, το βασικό πλακίδιο σχεδιάζεται και η υπόλοιπη περιοχή γεμίζει επαναλαμβάνοντας το βασικό πλακίδιο έτσι ώστε η δεξιά άκρη κάθε πλακιδίου να αγγίζει την αριστερή άκρη του επόμενου, και το κάτω άκρο κάθε πλακιδίου να αγγίζει το πάνω άκρο του επόμενου. |
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
### FlipX {#FlipX}
```
public static final XpsTileMode FlipX
```


Η διάταξη των πλακιδίων είναι παρόμοια με τη λειτουργία Tile, αλλά εναλλασσόμενες στήλες πλακιδίων αντιστρέφονται οριζόντια. Το βασικό πλακίδιο τοποθετείται όπως ορίζεται από το παράθυρο προβολής. Τα πλακίδια στις στήλες αριστερά και δεξιά από αυτό το πλακίδιο αντιστρέφονται οριζόντια.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


Η διάταξη των πλακιδίων είναι παρόμοια με τη λειτουργία Tile, αλλά εναλλασσόμενες στήλες πλακιδίων αντιστρέφονται οριζόντια και εναλλασσόμενες σειρές πλακιδίων αντιστρέφονται κάθετα. Το βασικό πλακίδιο τοποθετείται όπως ορίζεται από το παράθυρο προβολής.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


Η διάταξη των πλακιδίων είναι παρόμοια με τη λειτουργία Tile, αλλά εναλλασσόμενες σειρές πλακιδίων αντιστρέφονται κάθετα. Το βασικό πλακίδιο τοποθετείται όπως ορίζεται από το παράθυρο προβολής. Οι σειρές πάνω και κάτω αντιστρέφονται κάθετα.

### None {#None}
```
public static final XpsTileMode None
```


Σε αυτή τη λειτουργία, σχεδιάζεται μόνο το μοναδικό βασικό πλακίδιο. Η υπόλοιπη περιοχή παραμένει διαφανής.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


Σε αυτή τη λειτουργία, το βασικό πλακίδιο σχεδιάζεται και η υπόλοιπη περιοχή γεμίζει επαναλαμβάνοντας το βασικό πλακίδιο έτσι ώστε η δεξιά άκρη κάθε πλακιδίου να αγγίζει την αριστερή άκρη του επόμενου, και το κάτω άκρο κάθε πλακιδίου να αγγίζει το πάνω άκρο του επόμενου.

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
public static XpsTileMode valueOf(String name)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| όνομα | java.lang.String |  |

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode)
### values() {#values--}
```
public static XpsTileMode[] values()
```




**Returns:**
com.aspose.xps.XpsTileMode[]
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

