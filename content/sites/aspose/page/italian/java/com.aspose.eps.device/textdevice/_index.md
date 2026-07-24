---
title: "TextDevice"
second_title: "Aspose.Page per Java API Reference"
description: 
type: docs
weight: 13
url: /it/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## Campi

| Campo | Descrizione |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | Versione corrente del dispositivo. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | Disegna un percorso. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Disegna un arco. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Disegna un'immagine con trasformazione assegnata e sfondo. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Disegna un segmento di linea. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Disegna un'ovale. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Disegna un poligono. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Disegna un poligono. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Disegna una polilinea. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Disegna una polilinea. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Disegna un rettangolo. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Disegna un rettangolo arrotondato. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Riempie un percorso. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Riempie un arco. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Riempie un'ovale. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Riempie un poligono. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Riempie un poligono. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Riempie un rettangolo. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Disegna un rettangolo arrotondato. |
| [getBackground()](#getBackground--) | Ottiene lo sfondo corrente della pagina. |
| [getCharTM()](#getCharTM--) | Ottiene la trasformazione corrente dei caratteri. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Ottiene il creatore dell'output del dispositivo risultante. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | Ottiene il carattere corrente. |
| [getOpacity()](#getOpacity--) | Ottiene l'opacità corrente. |
| [getOpacityMask()](#getOpacityMask--) | Ottiene la maschera di opacità corrente. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | Ottiene la pittura corrente. |
| [getProperties()](#getProperties--) | Ottiene le proprietà del dispositivo, inclusi i metadati. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Ottiene il valore di una proprietà stringa. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Ottiene il valore di una proprietà colore. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Ottiene il valore di una proprietà double. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Ottiene il valore di una proprietà intera. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Ottiene il valore di una proprietà margini. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Ottiene il valore di una proprietà matrice. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Ottiene il valore di una proprietà rettangolo. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Ottiene il valore di una proprietà dimensione. |
| [getSaveOptions()](#getSaveOptions--) | Restituisce le opzioni di salvataggio. |
| [getSize()](#getSize--) | Ottiene la dimensione della pagina. |
| [getStroke()](#getStroke--) | Ottiene il tratto corrente. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | Ottiene la modalità di rendering del testo corrente. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Ottiene la larghezza del tratto del testo corrente. |
| [getTransform()](#getTransform--) | Ottiene la trasformazione corrente. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Inizializza il ritaglio del dispositivo. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Ottiene il valore di una proprietà booleana. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | Ruota la matrice di trasformazione corrente. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Ruota la matrice di trasformazione corrente attorno a un punto. |
| [scale(double x, double y)](#scale-double-double-) | Scala la matrice di trasformazione corrente. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Specifica lo sfondo corrente della pagina. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Specifica la trasformazione dei caratteri. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Specifica il ritaglio del dispositivo. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Specifica il creatore dell'output del dispositivo risultante. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Specifica un carattere. |
| [setOpacity(float opacity)](#setOpacity-float-) | Specifica l'opacità. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Specifica una maschera di opacità. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Specifica una vernice. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Specifica le proprietà del dispositivo, inclusi i metadati. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Specifica le opzioni per gestire il processo di rendering. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Specifica un tratto. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Specifica la modalità di rendering del testo. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Specifica la larghezza del tratto del testo. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Specifica la trasformazione corrente. |
| [shear(double shx, double shy)](#shear-double-double-) | Inclina la matrice di trasformazione corrente. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Trasforma la matrice di trasformazione corrente. |
| [translate(double x, double y)](#translate-double-double-) | Trasla la matrice di trasformazione corrente. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Scrive un commento. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Scrive una stringa con il font specificato. |
| [writeWarning(String warning)](#writeWarning-java.lang.String-) |  |
### TextDevice() {#TextDevice--}
```
public TextDevice()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final Dimension DEFAULT_SIZE
```


### EMIT_ERRORS {#EMIT-ERRORS}
```
public static final String EMIT_ERRORS
```


### EMIT_WARNINGS {#EMIT-WARNINGS}
```
public static final String EMIT_WARNINGS
```


### VERSION {#VERSION}
```
public static String VERSION
```


Versione corrente del dispositivo.

### closePage() {#closePage--}
```
public void closePage()
```


Esegue la preparazione necessaria del dispositivo dopo che la pagina è stata renderizzata.

### create() {#create--}
```
public Device create()
```


Crea una copia di questo dispositivo.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


Rilascia il dispositivo.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Disegna un percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | java.awt.Shape | Un percorso da disegnare. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Disegna un arco.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | float | Coordinata X del centro dell'arco. |
| y | float | Coordinata Y del centro dell'arco. |
| larghezza | float | Una larghezza del rettangolo circoscritto. |
| altezza | float | Un'altezza del rettangolo circoscritto. |
| startAngle | float | Un angolo di partenza dell'arco. |
| arcAngle | float | Un angolo dell'arco. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Disegna un'immagine con trasformazione assegnata e sfondo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Un'immagine da disegnare. |
| transform | java.awt.geom.AffineTransform | Una trasformazione. |
| bkg | java.awt.Color | Un colore di sfondo. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Disegna un segmento di linea.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x1 | float | Coordinata X dell'inizio del segmento. |
| y1 | float | Coordinata Y dell'inizio del segmento. |
| x2 | float | Coordinata X della fine del segmento. |
| y2 | float | Coordinata Y della fine del segmento. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Disegna un'ovale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | float | Coordinata X del centro dell'ovale. |
| y | float | Coordinata Y del centro dell'ovale. |
| larghezza | float | Una larghezza del rettangolo circoscritto. |
| altezza | float | Un'altezza del rettangolo circoscritto. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Disegna un poligono.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xPoints | float[] | Coordinate X dei punti. |
| yPoints | float[] | Coordinata Y dei punti. |
| nPoints | int | Il numero di punti. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Disegna un poligono.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xPoints | int[] | Coordinate X dei punti. |
| yPoints | int[] | Coordinata Y dei punti. |
| nPoints | int | Il numero di punti. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Disegna una polilinea.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xPoints | float[] | Coordinate X dei punti. |
| yPoints | float[] | Coordinata Y dei punti. |
| nPoints | int | Il numero di punti. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Disegna una polilinea.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xPoints | int[] | Coordinate X dei punti. |
| yPoints | int[] | Coordinata Y dei punti. |
| nPoints | int | Il numero di punti. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Disegna un rettangolo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | float | Coordinata X dell'angolo in alto a sinistra del rettangolo. |
| y | float | Coordinata Y dell'angolo in alto a sinistra del rettangolo. |
| larghezza | float | Larghezza del rettangolo. |
| altezza | float | Altezza del rettangolo. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Disegna un rettangolo arrotondato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | float | Coordinata X dell'angolo in alto a sinistra del rettangolo. |
| y | float | Coordinata Y dell'angolo in alto a sinistra del rettangolo. |
| larghezza | float | Larghezza del rettangolo. |
| altezza | float | Altezza del rettangolo. |
| arcWidth | float | Larghezza del rettangolo circoscritto dell'arco che arrotonda un angolo del rettangolo. |
| arcHeight | float | Altezza del rettangolo circoscritto dell'arco che arrotonda un angolo del rettangolo. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Disegna una stringa nel punto specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Esegue le necessarie preparazioni del dispositivo dopo che il documento è stato renderizzato.

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
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Riempie un percorso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| path | java.awt.Shape | Un percorso da riempire. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Riempie un arco.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | float | Coordinata X del centro dell'arco. |
| y | float | Coordinata Y del centro dell'arco. |
| larghezza | float | Una larghezza del rettangolo circoscritto. |
| altezza | float | Un'altezza del rettangolo circoscritto. |
| startAngle | float | Un angolo di partenza dell'arco. |
| arcAngle | float | Un angolo dell'arco. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Riempie un'ovale.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | float | Coordinata X del centro dell'ovale. |
| y | float | Coordinata Y del centro dell'ovale. |
| larghezza | float | Una larghezza del rettangolo circoscritto. |
| altezza | float | Un'altezza del rettangolo circoscritto. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Riempie un poligono.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xPoints | float[] | Coordinate X dei punti. |
| yPoints | float[] | Coordinata Y dei punti. |
| nPoints | int | Il numero di punti. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Riempie un poligono.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| xPoints | int[] | Coordinate X dei punti. |
| yPoints | int[] | Coordinata Y dei punti. |
| nPoints | int | Il numero di punti. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Riempie un rettangolo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | float | Coordinata X dell'angolo in alto a sinistra del rettangolo. |
| y | float | Coordinata Y dell'angolo in alto a sinistra del rettangolo. |
| larghezza | float | Larghezza del rettangolo. |
| altezza | float | Altezza del rettangolo. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Disegna un rettangolo arrotondato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | float | Coordinata X dell'angolo in alto a sinistra del rettangolo. |
| y | float | Coordinata Y dell'angolo in alto a sinistra del rettangolo. |
| larghezza | float | Larghezza del rettangolo. |
| altezza | float | Altezza del rettangolo. |
| arcWidth | float | Larghezza del rettangolo circoscritto dell'arco che arrotonda un angolo del rettangolo. |
| arcHeight | float | Altezza del rettangolo circoscritto dell'arco che arrotonda un angolo del rettangolo. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Ottiene lo sfondo corrente della pagina.

**Returns:**
java.awt.Color - Sfondo corrente della pagina
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Ottiene la trasformazione corrente dei caratteri.

**Returns:**
java.awt.geom.AffineTransform - Trasformazione corrente dei caratteri.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreator() {#getCreator--}
```
public String getCreator()
```


Ottiene il creatore dell'output del dispositivo risultante.

**Returns:**
java.lang.String - Un valore creatore.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Restituisce il numero di pagina corrente.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Ottiene il carattere corrente.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Ottiene l'opacità corrente.

**Returns:**
float - Opacità corrente.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Ottiene la maschera di opacità corrente.

**Returns:**
java.awt.Paint - Maschera di opacità corrente.
### getPages() {#getPages--}
```
public List<String> getPages()
```




**Returns:**
java.util.List<java.lang.String>
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Ottiene la pittura corrente.

**Returns:**
java.awt.Paint - Pittura corrente.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Ottiene le proprietà del dispositivo, inclusi i metadati.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Ottiene il valore di una proprietà stringa.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.lang.String - Il valore della proprietà.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Ottiene il valore di una proprietà colore.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.awt.Color - Il valore della proprietà.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Ottiene il valore di una proprietà double.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
double - Il valore della proprietà.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Ottiene il valore di una proprietà intera.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
int - Il valore della proprietà.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Ottiene il valore di una proprietà margini.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.awt.Insets - Il valore della proprietà.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Ottiene il valore di una proprietà matrice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.awt.geom.AffineTransform - Il valore della proprietà.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Ottiene il valore di una proprietà rettangolo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.awt.Rectangle - Il valore della proprietà.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Ottiene il valore di una proprietà dimensione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
java.awt.Dimension - Il valore della proprietà.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Restituisce le opzioni di salvataggio.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Ottiene la dimensione della pagina.

**Returns:**
java.awt.Dimension - Dimensione della pagina.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Ottiene il tratto corrente.

**Returns:**
java.awt.Stroke - Tratto corrente.
### getText() {#getText--}
```
public String getText()
```




**Returns:**
java.lang.String
### getText(int startPage, int endPage) {#getText-int-int-}
```
public String getText(int startPage, int endPage)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Ottiene la modalità di rendering del testo corrente.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Ottiene la larghezza del tratto del testo corrente.

**Returns:**
float - Larghezza corrente del tratto del testo.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Ottiene la trasformazione corrente.

**Returns:**
java.awt.geom.AffineTransform - Trasformazione corrente.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### initClip() {#initClip--}
```
public void initClip()
```


Inizializza il ritaglio del dispositivo.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Inizializza il numero di pagine da renderizzare.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Indica se il dispositivo utilizza la modalità RGB diretta, cioè RGB.

**Returns:**
boolean
### isMainDocument() {#isMainDocument--}
```
public boolean isMainDocument()
```




**Returns:**
boolean
### isProperty(String key) {#isProperty-java.lang.String-}
```
public boolean isProperty(String key)
```


Ottiene il valore di una proprietà booleana.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| key | java.lang.String | Il nome della proprietà. |

**Returns:**
boolean - Il valore della proprietà.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### openPage(float width, float height) {#openPage-float-float-}
```
public boolean openPage(float width, float height)
```


Esegue le preparazioni necessarie del dispositivo prima del rendering della pagina.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| larghezza | float |  |
| altezza | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Esegue le preparazioni necessarie del dispositivo prima del rendering della pagina.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| titolo | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


Reimposta il dispositivo allo stato iniziale per l'intero documento. Usato per reimpostare il flusso di output.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Reimposta il dispositivo allo stato iniziale per una pagina.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Ruota la matrice di trasformazione corrente. Chiama writeTransform(Transform). Ruotare con un angolo theta positivo ruota i punti sull'asse x positivo verso l'asse y positivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| theta | double | Angolo in radianti su cui ruotare. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Ruota la matrice di trasformazione corrente attorno a un punto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| theta | double | Un angolo di rotazione in radianti. |
| x | double | Coordinata X del punto. |
| y | double | Coordinata Y del punto. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Scala la matrice di trasformazione corrente. Chiama writeTransform(Transform).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | double | Una scala sull'asse X. |
| y | double | Una scala sull'asse Y. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Specifica lo sfondo corrente della pagina.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sfondo | java.awt.Color | Uno sfondo della pagina. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Specifica la trasformazione dei caratteri.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421trasformazione dei caratteri. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Specifica il ritaglio del dispositivo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| clipPath | java.awt.Shape | Un percorso di ritaglio. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Specifica il creatore dell'output del dispositivo risultante.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| creatore | java.lang.String | Un valore del creatore. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Specifica un carattere.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Un font. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Specifica l'opacità.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| opacità | float | Un'opacità. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Specifica una maschera di opacità.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| opacityMask | java.awt.Paint | Una maschera di opacità. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Specifica una vernice.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| paint | java.awt.Paint | Una vernice. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Specifica le proprietà del dispositivo, inclusi i metadati.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Proprietà del dispositivo. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Specifica le opzioni per gestire il processo di rendering.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Opzioni per gestire il processo di rendering. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specifica la dimensione della pagina.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dimensione | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Specifica un tratto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stroke | java.awt.Stroke | Un tratto. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Specifica la modalità di rendering del testo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Modalità di rendering del testo. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Specifica la larghezza del tratto del testo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| textStrokeWidth | float | Larghezza del tratto del testo. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Specifica la trasformazione corrente.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Una trasformazione.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Applica una shear alla matrice di trasformazione corrente. Chiama writeTransform(Transform).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| shx | double | Una shear sull'asse X. |
| shy | double | Una shear sull'asse Y. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Esegue le preparazioni necessarie del dispositivo prima di avviare il rendering del documento.

### toString() {#toString--}
```
public String toString()
```


Restituisce il nome del tipo di dispositivo.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Trasforma la matrice di trasformazione corrente. Chiama writeTransform(Transform).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Trasformazione da applicare. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Trasla la matrice di trasformazione corrente. Chiama writeTransform(Transform).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | double | Traslazione sull'asse X. |
| y | double | Traslazione sull'asse Y. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Aggiorna i parametri della pagina da un altro dispositivo multi-pagina.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) |  |

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

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Scrive un commento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| commento | java.lang.String | Un commento da scrivere. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Scrive una stringa con il font specificato.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Font specificato. |
| str | java.lang.String | La stringa. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| avviso | java.lang.String |  |

