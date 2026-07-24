---
title: "XpsContentElement"
second_title: "Aspose.Page per Java API Reference"
description: "Incapsula le funzionalità degli elementi di contenuto XPS Canvas Path e Glyphs."
type: docs
weight: 18
url: /it/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

Incapsula le funzionalità degli elementi di contenuto XPS: Canvas, Path e Glyphs.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fornisce l'accesso ai figli dell'elemento per indice i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Restituisce la geometria del percorso che limita la regione renderizzata dell'elemento. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Restituisce l'oggetto di destinazione del collegamento ipertestuale. |
| [getOpacity()](#getOpacity--) | Restituisce il valore che definisce la trasparenza uniforme dell'elemento. |
| [getOpacityMask()](#getOpacityMask--) | Restituisce il pennello che specifica una maschera di valori alfa applicata all'elemento nello stesso modo dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento. |
| [getRenderTransform()](#getRenderTransform--) | Restituisce la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementazione dell'interfaccia Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Imposta la geometria del percorso che limita la regione renderizzata dell'elemento. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Imposta l'oggetto di destinazione del collegamento ipertestuale. |
| [setOpacity(float value)](#setOpacity-float-) | Imposta il valore che definisce la trasparenza uniforme dell'elemento. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Imposta il pennello che specifica una maschera di valori alfa applicata all'elemento nella stessa modalità dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Imposta la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti). |
| [size()](#size--) | Restituisce il numero di elementi figli. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

