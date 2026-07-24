---
title: "XpsTilingBrush"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula le funzionalità comuni degli elementi pennelli a tassello VisualBrush e ImageBrush."
type: docs
weight: 51
url: /it/java/com.aspose.xps/xpstilingbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsTilingBrush extends XpsTransformableBrush
```

Classe che incapsula le funzionalità comuni degli elementi pennelli di riempimento (VisualBrush e ImageBrush).
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Restituisce il valore che definisce la trasparenza uniforme del riempimento del pennello. |
| [getTileMode()](#getTileMode--) | Restituisce il valore che specifica come viene eseguita la piastrellatura nella geometria riempita. |
| [getTransform()](#getTransform--) | Restituisce la trasformazione matrice applicata allo spazio coordinate del pennello. |
| [getViewbox()](#getViewbox--) | Restituisce la regione del contenuto sorgente del pennello che deve essere mappata sulla viewport. |
| [getViewport()](#getViewport--) | Restituisce la posizione e le dimensioni della prima piastrella del pennello. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Imposta il valore che definisce la trasparenza uniforme del riempimento del pennello. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Imposta il valore che specifica come viene eseguita la piastrellatura nella geometria riempita. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Imposta la trasformazione matrice applicata allo spazio coordinate del pennello. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Imposta la regione del contenuto sorgente del pennello che deve essere mappata sulla viewport. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Imposta la posizione e le dimensioni della prima piastrella del pennello. |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Restituisce il valore che definisce la trasparenza uniforme del riempimento del pennello.

**Returns:**
float - Valore che definisce la trasparenza uniforme del riempimento del pennello.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Restituisce il valore che specifica come viene eseguita la piastrellatura nella geometria riempita.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Restituisce la trasformazione matrice applicata allo spazio coordinate del pennello. La proprietà Transform viene concatenata con la trasformazione di rendering efficace corrente per ottenere una trasformazione di rendering efficace locale al pennello. La viewport del pennello viene trasformata utilizzando la trasformazione di rendering efficace locale.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Restituisce la regione del contenuto sorgente del pennello che deve essere mappata sulla viewport.

**Returns:**
java.awt.geom.Rectangle2D - La regione del contenuto sorgente del pennello che deve essere mappata sulla viewport.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Restituisce la posizione e le dimensioni della prima piastrella del pennello. Le piastrelle successive sono posizionate rispetto a questa piastrella, come specificato dalla modalità di piastrellatura.

**Returns:**
java.awt.geom.Rectangle2D - La posizione e le dimensioni della prima piastrella del pennello.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Imposta il valore che definisce la trasparenza uniforme del riempimento del pennello.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | Valore che definisce la trasparenza uniforme del riempimento del pennello. |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Imposta il valore che specifica come viene eseguita la piastrellatura nella geometria riempita.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Valore che specifica come viene eseguita la piastrellatura nella geometria riempita. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Imposta la trasformazione matrice applicata allo spazio coordinate del pennello. La proprietà Transform viene concatenata con la trasformazione di rendering efficace corrente per ottenere una trasformazione di rendering efficace locale al pennello. La viewport del pennello viene trasformata utilizzando la trasformazione di rendering efficace locale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La trasformazione matrice applicata allo spazio coordinate del pennello. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Imposta la regione del contenuto sorgente del pennello che deve essere mappata sulla viewport.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.awt.geom.Rectangle2D | La regione del contenuto sorgente del pennello che deve essere mappata sulla viewport. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Imposta la posizione e le dimensioni della prima piastrella del pennello. Le piastrelle successive sono posizionate rispetto a questa piastrella, come specificato dalla modalità di piastrellatura.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.awt.geom.Rectangle2D | La posizione e le dimensioni della prima tessera del pennello. |

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

