---
title: "ExternalFontCache"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Χρησιμοποιήστε αυτήν την κλάση για να αποκτήσετε ενσωμάτωση γραμματοσειράς σε μορφή που γίνεται αποδεκτή από το Device."
type: docs
weight: 13
url: /el/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Χρησιμοποιήστε αυτήν την κλάση για να αποκτήσετε ενσωμάτωση γραμματοσειράς σε μορφή που γίνεται αποδεκτή από το Device.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | Προεπιλεγμένο μέγεθος γραμματοσειράς. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | Προεπιλεγμένο στυλ γραμματοσειράς. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, προεπιλεγμένο μέγεθος (1) και προεπιλεγμένο στυλ (PLAIN). |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, προεπιλεγμένο μέγεθος (1) και στυλ. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, μέγεθος και στυλ. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, μέγεθος, στυλ και κεφαλαία γραμματοσειράς. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, μέγεθος, στυλ και εναλλακτικό όνομα οικογένειας γραμματοσειράς. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, μέγεθος, στυλ, κεφαλαία γραμματοσειράς και εναλλακτικό όνομα οικογένειας γραμματοσειράς. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | Ανακτά το TTFont με το όνομα οικογένειας γραμματοσειράς, στυλ και εναλλακτικό όνομα οικογένειας γραμματοσειράς. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Καθορίζει πρόσθετους φακέλους γραμματοσειρών. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ExternalFontCache() {#ExternalFontCache--}
```
public ExternalFontCache()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final float DEFAULT_SIZE
```


Προεπιλεγμένο μέγεθος γραμματοσειράς.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


Προεπιλεγμένο στυλ γραμματοσειράς.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, προεπιλεγμένο μέγεθος (1) και προεπιλεγμένο στυλ (PLAIN).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| familyName | java.lang.String | Όνομα οικογένειας γραμματοσειράς. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, προεπιλεγμένο μέγεθος (1) και στυλ.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| familyName | java.lang.String | Όνομα οικογένειας γραμματοσειράς. |
| στυλ | int | Στυλ γραμματοσειράς. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
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
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, μέγεθος και στυλ.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| familyName | java.lang.String | Όνομα οικογένειας γραμματοσειράς. |
| sizePoints | float | Μέγεθος γραμματοσειράς σε σημεία (ένα σημείο είναι 1/72 ίντσας). |
| στυλ | int | Στυλ γραμματοσειράς. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, μέγεθος, στυλ και κεφαλαία γραμματοσειράς.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| familyName | java.lang.String | Όνομα οικογένειας γραμματοσειράς. |
| sizePoints | float | Μέγεθος γραμματοσειράς σε σημεία (ένα σημείο είναι 1/72 ίντσας). |
| στυλ | int | Στυλ γραμματοσειράς. |
| fontCapitals | int | Κεφαλαία γράμματα γραμματοσειράς. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, μέγεθος, στυλ και εναλλακτικό όνομα οικογένειας γραμματοσειράς.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| familyName | java.lang.String | Όνομα οικογένειας γραμματοσειράς. |
| sizePoints | float | Μέγεθος γραμματοσειράς σε σημεία (ένα σημείο είναι 1/72 ίντσας). |
| στυλ | int | Στυλ γραμματοσειράς. |
| altFamilyName | java.lang.String | Εναλλακτικό όνομα οικογένειας γραμματοσειράς. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


Ανακτά το DrFont με το όνομα οικογένειας γραμματοσειράς, μέγεθος, στυλ, κεφαλαία γραμματοσειράς και εναλλακτικό όνομα οικογένειας γραμματοσειράς.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| familyName | java.lang.String | Όνομα οικογένειας γραμματοσειράς. |
| sizePoints | float | Μέγεθος γραμματοσειράς σε σημεία (ένα σημείο είναι 1/72 ίντσας). |
| στυλ | int | Στυλ γραμματοσειράς. |
| altFamilyName | java.lang.String | Εναλλακτικό όνομα οικογένειας γραμματοσειράς. |
| fontCapitals | int | Κεφαλαία γράμματα γραμματοσειράς. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


Ανακτά το TTFont με το όνομα οικογένειας γραμματοσειράς, στυλ και εναλλακτικό όνομα οικογένειας γραμματοσειράς.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| familyName | java.lang.String | Όνομα οικογένειας γραμματοσειράς. |
| στυλ | int | Στυλ γραμματοσειράς. |
| altFamilyName | java.lang.String | Εναλλακτικό όνομα οικογένειας γραμματοσειράς. |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont.
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
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] additionalFontFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public static void setAdditionalFontsFolders(String[] additionalFontFolders)
```


Καθορίζει πρόσθετους φακέλους γραμματοσειρών. Οι φάκελοι γραμματοσειρών που χρησιμοποιούνται από το λειτουργικό σύστημα χρησιμοποιούνται από την ExternalFont Cache εξ ορισμού. Δεν υπάρχει ανάγκη να τους ορίσετε,

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | Ένας πίνακας πρόσθετων φακέλων γραμματοσειρών. |

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

