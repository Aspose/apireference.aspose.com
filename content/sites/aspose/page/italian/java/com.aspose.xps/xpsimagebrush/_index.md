---
title: "XpsImageBrush"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula le funzionalità dell'elemento proprietà ImageBrush."
type: docs
weight: 33
url: /it/java/com.aspose.xps/xpsimagebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsImageBrush extends XpsTilingBrush
```

Classe che incapsula le funzionalità dell'elemento proprietà ImageBrush. Questo elemento è usato per riempire una regione con un'immagine.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [deepClone()](#deepClone--) | Clona questo pennello immagine. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getImage()](#getImage--) | Restituisce la risorsa immagine usata per il pennello. |
| [getImageSource()](#getImageSource--) | Restituisce l'URI di una risorsa immagine. |
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
### deepClone() {#deepClone--}
```
public XpsImageBrush deepClone()
```


Clona questo pennello immagine.

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - Clone of this image brush.
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
### getImage() {#getImage--}
```
public XpsImage getImage()
```


Restituisce la risorsa immagine usata per il pennello.

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - Image resource used to for the brush.
### getImageSource() {#getImageSource--}
```
public String getImageSource()
```


Restituisce l'URI di una risorsa immagine.

**Returns:**
java.lang.String - L'URI di una risorsa immagine.
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

