---
title: "XpsPage"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει τις δυνατότητες του στοιχείου FixedPage."
type: docs
weight: 38
url: /el/java/com.aspose.xps/xpspage/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement)
```
public final class XpsPage extends XpsElement
```

Κλάση που περιλαμβάνει τις δυνατότητες του στοιχείου FixedPage. Αυτό το στοιχείο περιέχει το περιεχόμενο μιας σελίδας και είναι το ριζικό στοιχείο ενός τμήματος FixedPage.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [deepClone()](#deepClone--) | Κλωνοποιεί αυτή τη σελίδα. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Παρέχει πρόσβαση στα παιδιά του στοιχείου με βάση το δείκτη i. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Επιστρέφει το ύψος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου. |
| [getWidth()](#getWidth--) | Επιστρέφει το πλάτος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου. |
| [getXmlLang()](#getXmlLang--) | Επιστρέφει την τιμή που καθορίζει τη προεπιλεγμένη γλώσσα που χρησιμοποιείται για το τρέχον στοιχείο και για τυχόν παιδικά ή απογόνους στοιχεία. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Υλοποίηση της διεπαφής Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHeight(float value)](#setHeight-float-) | Ορίζει το ύψος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου. |
| [setWidth(float value)](#setWidth-float-) | Ορίζει το πλάτος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου. |
| [setXmlLang(String value)](#setXmlLang-java.lang.String-) | Ορίζει την τιμή που καθορίζει τη προεπιλεγμένη γλώσσα που χρησιμοποιείται για το τρέχον στοιχείο και για τυχόν παιδικά ή απογόνους στοιχεία. |
| [size()](#size--) | Επιστρέφει τον αριθμό των θυγατρικών στοιχείων. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPage deepClone()
```


Κλωνοποιεί αυτή τη σελίδα.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Clone of this page.
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
### getHeight() {#getHeight--}
```
public float getHeight()
```


Επιστρέφει το ύψος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου.

**Returns:**
float - Το ύψος της σελίδας.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Επιστρέφει το πλάτος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου.

**Returns:**
float - Το πλάτος της σελίδας.
### getXmlLang() {#getXmlLang--}
```
public String getXmlLang()
```


Επιστρέφει την τιμή που καθορίζει τη προεπιλεγμένη γλώσσα που χρησιμοποιείται για το τρέχον στοιχείο και για τυχόν παιδικά ή απογόνους στοιχεία.

**Returns:**
java.lang.String - Η τιμή που καθορίζει τη προεπιλεγμένη γλώσσα.
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




### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Ορίζει το ύψος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Το ύψος της σελίδας. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Ορίζει το πλάτος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Το πλάτος της σελίδας. |

### setXmlLang(String value) {#setXmlLang-java.lang.String-}
```
public void setXmlLang(String value)
```


Ορίζει την τιμή που καθορίζει τη προεπιλεγμένη γλώσσα που χρησιμοποιείται για το τρέχον στοιχείο και για τυχόν παιδικά ή απογόνους στοιχεία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | java.lang.String | Η τιμή που καθορίζει τη προεπιλεγμένη γλώσσα. |

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

