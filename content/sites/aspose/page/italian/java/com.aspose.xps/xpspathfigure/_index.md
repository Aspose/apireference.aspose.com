---
title: "XpsPathFigure"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula le funzionalità dell'elemento PathFigure."
type: docs
weight: 41
url: /it/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

Classe che incapsula le funzionalità dell'elemento PathFigure. Questo elemento è composto da un insieme di una o più linee o segmenti curvi.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(T obj)](#add-T-) | Aggiunge un nuovo oggetto all'array. |
| [deepClone()](#deepClone--) | Clona questa figura di percorso. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fornisce l'accesso all'elemento dell'array tramite l'indice i. |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | Restituisce l'elenco dei segmenti di percorso figli. |
| [getStartPoint()](#getStartPoint--) | Restituisce il punto di partenza per il primo segmento della figura di percorso. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Inserisce un nuovo oggetto nell'array nella posizione specificata. |
| [isClosed()](#isClosed--) | Restituisce il valore che indica se la figura di percorso è chiusa. |
| [isFilled()](#isFilled--) | Restituisce il valore che indica se la figura di percorso è utilizzata nel calcolo dell'area della geometria di percorso contenente. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Rimuove un oggetto dall'array. |
| [removeAt(int index)](#removeAt-int-) | Rimuove un oggetto dall'array nella posizione specificata. |
| [setClosed(boolean value)](#setClosed-boolean-) | Imposta il valore che indica se la figura di percorso è chiusa. |
| [setFilled(boolean value)](#setFilled-boolean-) | Imposta il valore che indica se la figura di percorso è utilizzata nel calcolo dell'area della geometria di percorso contenente. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Imposta il punto di partenza per il primo segmento della figura di percorso. |
| [size()](#size--) | Restituisce il numero di elementi. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Aggiunge un nuovo oggetto all'array.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T | L'oggetto da aggiungere. |

**Returns:**
T - Oggetto aggiunto.
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Clona questa figura di percorso.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int i) {#get-int-}
```
public T get(int i)
```


Fornisce l'accesso all'elemento dell'array tramite l'indice i.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | int | Indice dell'elemento. |

**Returns:**
T - L'elemento nella posizione i.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


Restituisce l'elenco dei segmenti di percorso figli.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - L'elenco dei segmenti di percorso figli.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Restituisce il punto di partenza per il primo segmento della figura di percorso.

**Returns:**
java.awt.geom.Point2D - Il punto di partenza per il primo segmento della figura di percorso.
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


Inserisce un nuovo oggetto nell'array nella posizione specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | La posizione in cui inserire un oggetto. |
| obj | T | L'oggetto da inserire. |

**Returns:**
T - Oggetto inserito.
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Restituisce il valore che indica se la figura di percorso è chiusa.

**Returns:**
boolean - Il valore che indica se la figura del percorso è chiusa.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Restituisce il valore che indica se la figura di percorso è utilizzata nel calcolo dell'area della geometria di percorso contenente.

**Returns:**
boolean - Il valore che indica se la figura del percorso è usata nel calcolo dell'area della geometria del percorso contenente.
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


Rimuove un oggetto dall'array.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | T | L'oggetto da rimuovere. |

**Returns:**
T - Oggetto rimosso.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Rimuove un oggetto dall'array nella posizione specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | La posizione in cui rimuovere un oggetto. |

**Returns:**
T - Oggetto rimosso.
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Imposta il valore che indica se la figura di percorso è chiusa.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | boolean | Il valore che indica se la figura del percorso è chiusa. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Imposta il valore che indica se la figura di percorso è utilizzata nel calcolo dell'area della geometria di percorso contenente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | boolean | Il valore che indica se la figura del percorso è usata nel calcolo dell'area della geometria del percorso contenente. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Imposta il punto di partenza per il primo segmento della figura di percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.awt.geom.Point2D | Il punto di partenza per il primo segmento della figura del percorso. |

### size() {#size--}
```
public int size()
```


Restituisce il numero di elementi.

**Returns:**
int - Il numero di elementi.
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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

