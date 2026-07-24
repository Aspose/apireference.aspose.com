---
title: "HyperlinkCollector"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Η κλάση παρέχει τη συλλογή υπερσυνδεδεμένων στοιχείων XPS από την τρέχουσα σελίδα ενός εγγράφου XPS."
type: docs
weight: 10
url: /el/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

Η κλάση παρέχει τη συλλογή υπερσυνδεδεμένων στοιχείων XPS από την τρέχουσα σελίδα ενός εγγράφου XPS.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Συλλέγει στοιχεία XPS με υπερσυνδέσμους ενός συγκεκριμένου τύπου. |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Συλλέγει στοιχεία XPS με υπερσυνδέσμους όλων των τύπων. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>collectHyperlinks(XpsDocument document, Class<T> cls) {#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--}
```
public static Collection<XpsHyperlinkElement> <T>collectHyperlinks(XpsDocument document, Class<T> cls)
```


Συλλέγει στοιχεία XPS με υπερσυνδέσμους ενός συγκεκριμένου τύπου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Το έγγραφο XPS. |
| cls | java.lang.Class<T> | Το αντικείμενο κλάσης που αντιστοιχεί στον τύπο προορισμού του υπερσυνδέσμου για φιλτράρισμα. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - Η συλλογή που περιέχει στοιχεία XPS με υπερσύνδεσμο.
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Συλλέγει στοιχεία XPS με υπερσυνδέσμους όλων των τύπων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | Το έγγραφο XPS. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - Η συλλογή που περιέχει στοιχεία XPS με υπερσύνδεσμο.
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

