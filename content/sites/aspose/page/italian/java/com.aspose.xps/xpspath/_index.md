---
title: "XpsPath"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula le funzionalità dell'elemento Path."
type: docs
weight: 40
url: /it/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Classe che incapsula le funzionalità dell'elemento Path. Questo elemento è l'unico mezzo per aggiungere grafica vettoriale e immagini a una pagina fissa. Definisce una singola grafica vettoriale da renderizzare su una pagina.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [deepClone()](#deepClone--) | Clona questo path. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fornisce l'accesso ai figli dell'elemento per indice i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Restituisce la geometria del percorso che limita la regione renderizzata dell'elemento. |
| [getData()](#getData--) | Restituisce la geometria del path. |
| [getFill()](#getFill--) | Restituisce il pennello usato per dipingere la geometria specificata dalla proprietà Data del path. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Restituisce l'oggetto di destinazione del collegamento ipertestuale. |
| [getOpacity()](#getOpacity--) | Restituisce il valore che definisce la trasparenza uniforme dell'elemento. |
| [getOpacityMask()](#getOpacityMask--) | Restituisce il pennello che specifica una maschera di valori alfa applicata all'elemento nello stesso modo dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento. |
| [getRenderTransform()](#getRenderTransform--) | Restituisce la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti). |
| [getStroke()](#getStroke--) | Restituisce il pennello usato per disegnare il tratto. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Restituisce l'array che specifica la lunghezza dei dash e dei gap del contorno dello stroke. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Restituisce il valore che specifica come vengono disegnate le estremità di ogni dash. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Restituisce il punto di partenza per ripetere il pattern dell'array di dash. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Restituisce il valore che definisce la forma della fine dell'ultimo dash in uno stroke. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Restituisce il valore che definisce la forma dell'inizio del primo dash in uno stroke. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Restituisce il rapporto tra la lunghezza massima del miter e metà dello spessore dello stroke. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Restituisce il valore che definisce la forma dell'inizio del primo dash in uno stroke. |
| [getStrokeThickness()](#getStrokeThickness--) | Restituisce lo spessore di uno stroke, in unità dello spazio di coordinate efficace (include la trasformazione di rendering del path). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementazione dell'interfaccia Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Imposta la geometria del percorso che limita la regione renderizzata dell'elemento. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Imposta la geometria del path. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Imposta il pennello usato per dipingere la geometria specificata dalla proprietà Data del path. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Imposta l'oggetto di destinazione del collegamento ipertestuale. |
| [setOpacity(float value)](#setOpacity-float-) | Imposta il valore che definisce la trasparenza uniforme dell'elemento. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Imposta il pennello che specifica una maschera di valori alfa applicata all'elemento nella stessa modalità dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Imposta la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti). |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Imposta il pennello usato per disegnare lo stroke. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Imposta l'array che specifica la lunghezza dei dash e dei gap del contorno dello stroke. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Imposta il valore che specifica come vengono disegnate le estremità di ogni dash. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Imposta il punto di partenza per ripetere il pattern dell'array di dash. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Imposta il valore che definisce la forma della fine dell'ultimo dash in uno stroke. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Imposta il valore che definisce la forma dell'inizio del primo dash in uno stroke. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Imposta il rapporto tra la lunghezza massima del miter e metà dello spessore dello stroke. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Imposta il valore che definisce la forma dell'inizio del primo dash in uno stroke. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Imposta lo spessore di uno stroke, in unità dello spazio di coordinate efficace (include la trasformazione di rendering del path). |
| [size()](#size--) | Restituisce il numero di elementi figli. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Clona questo path.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
public XpsContentElement get(int i)
```


Fornisce l'accesso ai figli dell'elemento per indice i.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| i | int | Indice dell'elemento figlio. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


Restituisce la geometria del percorso che limita la regione renderizzata dell'elemento.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Restituisce la geometria del path.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Restituisce il pennello usato per dipingere la geometria specificata dalla proprietà Data del path.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Restituisce l'oggetto di destinazione del collegamento ipertestuale.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Restituisce il valore che definisce la trasparenza uniforme dell'elemento.

**Returns:**
float - Il valore che definisce la trasparenza uniforme dell'elemento.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Restituisce il pennello che specifica una maschera di valori alfa applicata all'elemento nello stesso modo dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Restituisce la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Restituisce il pennello usato per disegnare il tratto.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Restituisce l'array che specifica la lunghezza dei dash e dei gap del contorno dello stroke.

**Returns:**
float[] - L'array che specifica la lunghezza dei dash e dei gap del contorno dello stroke.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Restituisce il valore che specifica come vengono disegnate le estremità di ogni dash.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Restituisce il punto di partenza per ripetere il pattern dell'array di dash. Se questo valore è omesso, l'array di dash si allinea con l'origine dello stroke.

**Returns:**
float - Il punto di inizio per ripetere il modello dell'array di trattini.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Restituisce il valore che definisce la forma della fine dell'ultimo dash in uno stroke.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Restituisce il valore che definisce la forma dell'inizio del primo dash in uno stroke.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Restituisce il rapporto tra la lunghezza massima del giunto a spigolo e metà dello spessore del tratto. Questo valore è significativo solo se l'attributo  StrokeLineJoin  specifica  Miter .

**Returns:**
float - Il rapporto tra la lunghezza massima del giunto a spigolo e metà dello spessore del tratto.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Restituisce il valore che definisce la forma dell'inizio del primo dash in uno stroke.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Restituisce lo spessore di un tratto, in unità dello spazio di coordinate efficace (include la trasformazione di rendering del percorso). Il tratto è disegnato sopra il contorno della geometria specificata dalla proprietà Data dell'elemento Path\\u2019s. Metà dello StrokeThickness si estende al di fuori della geometria specificata dalla proprietà Data e l'altra metà si estende all'interno della geometria.

**Returns:**
float - Lo spessore di un tratto.
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


Implementazione dell'interfaccia Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Restituisce l'enumeratore per l'elenco.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Imposta la geometria del percorso che limita la regione renderizzata dell'elemento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso che limita la regione renderizzata dell'elemento. |

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Imposta la geometria del path.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Imposta il pennello usato per dipingere la geometria specificata dalla proprietà Data del path.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Il pennello usato per dipingere la geometria specificata |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Imposta l'oggetto di destinazione del collegamento ipertestuale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Oggetto di destinazione del collegamento ipertestuale. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Imposta il valore che definisce la trasparenza uniforme dell'elemento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | Il valore che definisce la trasparenza uniforme dell'elemento. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Imposta il pennello che specifica una maschera di valori alfa applicata all'elemento nella stessa modalità dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Il pennello che specifica una maschera. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Imposta la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matrice di trasformazione affine. |

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Imposta il pennello usato per disegnare lo stroke.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Il pennello usato per disegnare il tratto. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Imposta l'array che specifica la lunghezza dei dash e dei gap del contorno dello stroke.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float[] | L'array che specifica la lunghezza dei trattini e degli spazi del tratto di contorno. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Imposta il valore che specifica come vengono disegnate le estremità di ogni dash.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | Il valore che specifica come vengono disegnate le estremità di ogni trattino. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Imposta il punto di inizio per ripetere il modello dell'array di trattini. Se questo valore è omesso, l'array di trattini si allinea con l'origine del tratto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | Il punto di inizio per ripetere il modello dell'array di trattini. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Imposta il valore che definisce la forma della fine dell'ultimo dash in uno stroke.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Il valore che definisce la forma della fine dell'ultimo trattino in un tratto. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Imposta il valore che definisce la forma dell'inizio del primo dash in uno stroke.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | Il valore che definisce la forma dell'inizio del primo trattino in un tratto. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Imposta il rapporto tra la lunghezza massima del giunto a spigolo e metà dello spessore del tratto. Questo valore è significativo solo se l'attributo  StrokeLineJoin  specifica  Miter .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | Il rapporto tra la lunghezza massima del giunto a spigolo e metà dello spessore del tratto. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Imposta il valore che definisce la forma dell'inizio del primo dash in uno stroke.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Il valore che definisce la forma dell'inizio del primo trattino in un tratto. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Imposta lo spessore di un tratto, in unità dello spazio di coordinate efficace (include la trasformazione di rendering del percorso). Il tratto è disegnato sopra il contorno della geometria specificata dalla proprietà Data dell'elemento Path\\u2019s. Metà dello StrokeThickness si estende al di fuori della geometria specificata dalla proprietà Data e l'altra metà si estende all'interno della geometria.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | Lo spessore di un tratto. |

### size() {#size--}
```
public int size()
```


Restituisce il numero di elementi figli.

**Returns:**
int - Il numero di elementi figli.
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

