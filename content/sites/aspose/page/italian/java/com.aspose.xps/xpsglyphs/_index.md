---
title: "XpsGlyphs"
second_title: "Aspose.Page per Java API Reference"
description: "Classe che incapsula le funzionalità dell'elemento Glyphs."
type: docs
weight: 25
url: /it/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Classe che incapsula le funzionalità dell'elemento Glyphs. Questo elemento rappresenta una sequenza di testo formattato uniformemente da un unico carattere. Fornisce le informazioni necessarie per una resa accurata e supporta le funzionalità di ricerca e selezione nei visualizzatori.
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [deepClone()](#deepClone--) | Clona questi glifi. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Fornisce l'accesso ai figli dell'elemento per indice i. |
| [getBidiLevel()](#getBidiLevel--) | Restituisce il valore che specifica il livello di nidificazione bidirezionale dell'algoritmo Unicode. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Restituisce la geometria del percorso che limita la regione renderizzata dell'elemento. |
| [getFill()](#getFill--) | Restituisce il pennello utilizzato per riempire la forma dei glifi renderizzati. |
| [getFont()](#getFont--) | Restituisce la risorsa del carattere per il font TrueType utilizzato per comporre il testo degli elementi. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Restituisce la dimensione del carattere in unità della superficie di disegno, espressa come float nelle unità dello spazio di coordinate effettivo. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Restituisce l'oggetto di destinazione del collegamento ipertestuale. |
| [getOpacity()](#getOpacity--) | Restituisce il valore che definisce la trasparenza uniforme dell'elemento. |
| [getOpacityMask()](#getOpacityMask--) | Restituisce il pennello che specifica una maschera di valori alfa applicata all'elemento nello stesso modo dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento. |
| [getOriginX()](#getOriginX--) | Restituisce la coordinata x del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo. |
| [getOriginY()](#getOriginY--) | Restituisce la coordinata y del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo. |
| [getRenderTransform()](#getRenderTransform--) | Restituisce la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti). |
| [getStyleSimulations()](#getStyleSimulations--) | Restituisce il valore che specifica una simulazione di stile. |
| [getUnicodeString()](#getUnicodeString--) | Restituisce la stringa di testo renderizzata dall'elemento Glyphs. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Restituisce il valore che indica che un glifo è ruotato di lato, con l'origine definita come il centro superiore del glifo non ruotato. |
| [iterator()](#iterator--) | Implementazione dell'interfaccia Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Imposta il valore che specifica il livello di nidificazione bidirezionale dell'algoritmo Unicode. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Imposta la geometria del percorso che limita la regione renderizzata dell'elemento. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Imposta il pennello utilizzato per riempire la forma dei glifi renderizzati. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Imposta la dimensione del carattere in unità della superficie di disegno, espressa come float nelle unità dello spazio di coordinate effettivo. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Imposta l'oggetto di destinazione del collegamento ipertestuale. |
| [setOpacity(float value)](#setOpacity-float-) | Imposta il valore che definisce la trasparenza uniforme dell'elemento. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Imposta il pennello che specifica una maschera di valori alfa applicata all'elemento nella stessa modalità dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento. |
| [setOriginX(float value)](#setOriginX-float-) | Imposta la coordinata x del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo. |
| [setOriginY(float value)](#setOriginY-float-) | Imposta la coordinata y del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Imposta la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti). |
| [setSideways(boolean value)](#setSideways-boolean-) | Imposta il valore che indica che un glifo è ruotato di lato, con l'origine definita come il centro superiore del glifo non ruotato. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Imposta il valore che specifica una simulazione di stile. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Imposta la stringa di testo renderizzata dall'elemento Glyphs. |
| [size()](#size--) | Restituisce il numero di elementi figli. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Clona questi glifi.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Restituisce il valore che specifica il livello di nidificazione bidirezionale dell'algoritmo Unicode. I valori pari implicano un layout da sinistra a destra, i valori dispari implicano un layout da destra a sinistra. Il layout da destra a sinistra posiziona l'origine della sequenza sul lato destro del primo glifo, con larghezze di avanzamento positive (che rappresentano avanzamenti verso sinistra) che posizionano i glifi successivi a sinistra del glifo precedente.

**Returns:**
int - Il valore che specifica il livello di nidificazione bidirezionale dell'algoritmo Unicode.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Restituisce il pennello utilizzato per riempire la forma dei glifi renderizzati.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


Restituisce la risorsa del carattere per il font TrueType utilizzato per comporre il testo degli elementi.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Restituisce la dimensione del carattere in unità della superficie di disegno, espressa come float nelle unità dello spazio di coordinate effettivo.

**Returns:**
float - La dimensione del carattere.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Restituisce la coordinata x del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo.

**Returns:**
float - La coordinata x del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Restituisce la coordinata y del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo.

**Returns:**
float - La coordinata y del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Restituisce la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Restituisce il valore che specifica una simulazione di stile.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Restituisce la stringa di testo resa dall'elemento Glyphs. Il testo è specificato come punti di codice Unicode.

**Returns:**
java.lang.String - La stringa di testo resa dall'elemento Glyphs.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


Restituisce il valore che indica che un glifo è ruotato di lato, con l'origine definita come il centro superiore del glifo non ruotato.

**Returns:**
boolean - Il valore che indica che un glifo è ruotato di lato.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Imposta il valore che specifica il livello di nidificazione bidirezionale dell'algoritmo Unicode. I valori pari implicano un layout da sinistra a destra, i valori dispari implicano un layout da destra a sinistra. Il layout da destra a sinistra posiziona l'origine della sequenza sul lato destro del primo glifo, con larghezze di avanzamento positive (che rappresentano avanzamenti verso sinistra) che posizionano i glifi successivi a sinistra del glifo precedente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Il valore che specifica il livello di nidificazione bidirezionale dell'algoritmo Unicode. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Imposta la geometria del percorso che limita la regione renderizzata dell'elemento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | La geometria del percorso che limita la regione renderizzata dell'elemento. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Imposta il pennello utilizzato per riempire la forma dei glifi renderizzati.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Il pennello usato per riempire la forma dei glifi renderizzati. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Imposta la dimensione del carattere in unità della superficie di disegno, espressa come float nelle unità dello spazio di coordinate effettivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | La dimensione del carattere. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Imposta la coordinata x del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | La coordinata x del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Imposta la coordinata y del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | La coordinata y del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Imposta la matrice di trasformazione affine che stabilisce un nuovo sistema di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | La matrice di trasformazione affine. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Imposta il valore che indica che un glifo è ruotato di lato, con l'origine definita come il centro superiore del glifo non ruotato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | boolean | Il valore che indica che un glifo è ruotato di lato. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Imposta il valore che specifica una simulazione di stile.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | Il valore che specifica una simulazione di stile. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Imposta la stringa di testo resa dall'elemento Glyphs. Il testo è specificato come punti di codice Unicode.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.lang.String | La stringa di testo resa dall'elemento Glyphs. |

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

