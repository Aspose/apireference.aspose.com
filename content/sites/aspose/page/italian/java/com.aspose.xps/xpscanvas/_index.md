---
title: "XpsCanvas"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula le funzionalità dell'elemento Canvas."
type: docs
weight: 16
url: /it/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Classe che incapsula le funzionalità dell'elemento Canvas. Questo elemento raggruppa gli elementi insieme. Ad esempio, gli elementi Glyphs e Path possono essere raggruppati in un canvas per essere identificati come un'unità (come destinazione di un collegamento ipertestuale) o per applicare un valore di proprietà composto a ciascun elemento figlio e antenato.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Aggiunge un elemento all'elenco dei figli di questo canvas. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Inserisce un elemento nell'elenco dei figli di questo canvas nella posizione indice. |
| [addCanvas()](#addCanvas--) | Aggiunge un nuovo canvas all'elenco dei figli di questo canvas. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Aggiunge nuovi glyphs all'elenco dei figli di questo canvas. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Aggiunge un nuovo path all'elenco dei figli di questo canvas. |
| [deepClone()](#deepClone--) | Clona questo canvas. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fornisce l'accesso ai figli dell'elemento per indice i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Restituisce la geometria del percorso che limita la regione renderizzata dell'elemento. |
| [getEdgeMode()](#getEdgeMode--) | Restituisce il valore che controlla come vengono renderizzati i bordi dei path all'interno del canvas. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Restituisce l'oggetto di destinazione del collegamento ipertestuale. |
| [getOpacity()](#getOpacity--) | Restituisce il valore che definisce la trasparenza uniforme dell'elemento. |
| [getOpacityMask()](#getOpacityMask--) | Restituisce il pennello che specifica una maschera di valori alfa applicata all'elemento nello stesso modo dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento. |
| [getRenderTransform()](#getRenderTransform--) | Restituisce la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti). |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Inserisce un nuovo canvas nell'elenco dei figli di questo canvas nella posizione indice. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Inserisce nuovi glyphs nell'elenco dei figli di questo canvas nella posizione indice. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Inserisce un nuovo path nell'elenco dei figli di questo canvas nella posizione indice. |
| [iterator()](#iterator--) | Implementazione dell'interfaccia Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Imposta la geometria del percorso che limita la regione renderizzata dell'elemento. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Imposta il valore che controlla come vengono renderizzati i bordi dei path all'interno del canvas. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Imposta l'oggetto di destinazione del collegamento ipertestuale. |
| [setOpacity(float value)](#setOpacity-float-) | Imposta il valore che definisce la trasparenza uniforme dell'elemento. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Imposta il pennello che specifica una maschera di valori alfa applicata all'elemento nella stessa modalità dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Imposta la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti). |
| [size()](#size--) | Restituisce il numero di elementi figli. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Aggiunge un elemento all'elenco dei figli di questo canvas.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| elemento | T | L'elemento da aggiungere. |

**Returns:**
T - Elemento aggiunto.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Inserisce un elemento nell'elenco dei figli di questo canvas nella posizione indice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui un elemento dovrebbe essere inserito. |
| elemento | T | L'elemento da inserire. |

**Returns:**
T - Elemento inserito.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Aggiunge un nuovo canvas all'elenco dei figli di questo canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Aggiunge nuovi glyphs all'elenco dei figli di questo canvas.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontFamily | java.lang.String | Famiglia del font. |
| fontSize | float | Dimensione del font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Stile del carattere. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata T di origine dei glyphs. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Aggiunge un nuovo path all'elenco dei figli di questo canvas.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Clona questo canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Restituisce il valore che controlla come vengono renderizzati i bordi dei path all'interno del canvas.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Inserisce un nuovo canvas nell'elenco dei figli di questo canvas nella posizione indice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbe essere inserito un nuovo canvas. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Inserisce nuovi glyphs nell'elenco dei figli di questo canvas nella posizione indice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbero essere inseriti nuovi glyphs. |
| fontFamily | java.lang.String | Famiglia del font. |
| fontSize | float | Dimensione del font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Stile del carattere. |
| originX | float | Coordinata X di origine dei glifi. |
| originY | float | Coordinata T di origine dei glyphs. |
| unicodeString | java.lang.String | Stringa da stampare. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Inserisce un nuovo path nell'elenco dei figli di questo canvas nella posizione indice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Posizione in cui dovrebbe essere inserito un nuovo path. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Imposta il valore che controlla come vengono renderizzati i bordi dei path all'interno del canvas.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | La modalità di rendering dei bordi. |

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

