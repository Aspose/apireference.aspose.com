---
title: "XpsPathGeometry"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula le funzionalità dell'elemento proprietà PathGeometry."
type: docs
weight: 42
url: /it/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

Classe che incapsula le funzionalità dell'elemento proprietà PathGeometry. Questo elemento contiene un insieme di figure di percorso specificate sia con l'attributo Figures sia con un elemento figlio PathFigure.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(T obj)](#add-T-) | Aggiunge un nuovo oggetto all'array. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Aggiunge un segmento di percorso all'elenco dei segmenti figlio dell'ultima figura di percorso. |
| [deepClone()](#deepClone--) | Copia questa geometria di percorso. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fornisce l'accesso all'elemento dell'array tramite l'indice i. |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Restituisce il valore che specifica come le aree di intersezione delle forme geometriche vengono combinate per formare una regione. |
| [getPathFigures()](#getPathFigures--) | Restituisce l'elenco delle figure di percorso figlio. |
| [getTransform()](#getTransform--) | Restituisce la matrice di trasformazione affine che stabilisce la trasformazione matriciale locale applicata a tutti gli elementi figlio e discendenti della geometria di percorso prima di essere utilizzata per il riempimento, il ritaglio o il tracciamento. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Inserisce un nuovo oggetto nell'array nella posizione specificata. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Inserisce un segmento di percorso nell'elenco dei segmenti figlio dell'ultima figura di percorso nella posizione indice. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Rimuove un oggetto dall'array. |
| [removeAt(int index)](#removeAt-int-) | Rimuove un oggetto dall'array nella posizione specificata. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Rimuove un segmento di percorso dall'elenco dei segmenti figlio dell'ultima figura di percorso. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Rimuove un segmento di percorso dall'elenco dei segmenti figlio dell'ultima figura di percorso nella posizione indice. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Imposta il valore che specifica come le aree di intersezione delle forme geometriche vengono combinate per formare una regione. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Imposta la matrice di trasformazione affine che stabilisce la trasformazione matriciale locale applicata a tutti gli elementi figlio e discendenti della geometria di percorso prima di essere utilizzata per il riempimento, il ritaglio o il tracciamento. |
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
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Aggiunge un segmento di percorso all'elenco dei segmenti figlio dell'ultima figura di percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Il segmento di percorso da aggiungere. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Copia questa geometria di percorso.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


Restituisce il valore che specifica come le aree di intersezione delle forme geometriche vengono combinate per formare una regione.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Restituisce l'elenco delle figure di percorso figlio.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - L'elenco delle figure di percorso figlio.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Restituisce la matrice di trasformazione affine che stabilisce la trasformazione matriciale locale applicata a tutti gli elementi figlio e discendenti della geometria di percorso prima di essere utilizzata per il riempimento, il ritaglio o il tracciamento.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
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
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Inserisce un segmento di percorso nell'elenco dei segmenti figlio dell'ultima figura di percorso nella posizione indice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui un segmento dovrebbe essere inserito. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Un segmento di percorso da inserire. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
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
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Rimuove un segmento di percorso dall'elenco dei segmenti figlio dell'ultima figura di percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Il segmento di percorso da rimuovere. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Rimuove un segmento di percorso dall'elenco dei segmenti figlio dell'ultima figura di percorso nella posizione indice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui un segmento di percorso dovrebbe essere rimosso. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Imposta il valore che specifica come le aree di intersezione delle forme geometriche vengono combinate per formare una regione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | Il valore che specifica come le aree di intersezione delle forme geometriche vengono combinate per formare una regione. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Imposta la matrice di trasformazione affine che stabilisce la trasformazione matriciale locale applicata a tutti gli elementi figlio e discendenti della geometria di percorso prima di essere utilizzata per il riempimento, il ritaglio o il tracciamento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matrice di trasformazione affine. |

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

