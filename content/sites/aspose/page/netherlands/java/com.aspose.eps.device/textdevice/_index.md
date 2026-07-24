---
title: "TextDevice"
second_title: "Aspose.Page voor Java API-referentie"
description: 
type: docs
weight: 13
url: /nl/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## Velden

| Veld | Beschrijving |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | Huidige apparaatversie. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | Tekent een pad. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Tekent een boog. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Tekent een afbeelding met toegewezen transformatie en achtergrond. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Tekent een lijnsegment. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Tekent een ovaal. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Tekent een veelhoek. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Tekent een veelhoek. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Tekent een polylijn. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Tekent een polylijn. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Tekent een rechthoek. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Tekent een afgeronde rechthoek. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Vult een pad. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Vult een boog. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Vult een ovaal. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Vult een veelhoek. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Vult een veelhoek. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Vult een rechthoek. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Tekent een afgeronde rechthoek. |
| [getBackground()](#getBackground--) | Haalt de huidige achtergrond van de pagina op. |
| [getCharTM()](#getCharTM--) | Haalt de huidige teken‑transformatie op. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Haalt de maker van de resulterende apparaatoutput op. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | Haalt het huidige lettertype op. |
| [getOpacity()](#getOpacity--) | Haalt de huidige doorzichtigheid op. |
| [getOpacityMask()](#getOpacityMask--) | Haalt het huidige doorzichtigheidsmasker op. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | Haalt de huidige verf op. |
| [getProperties()](#getProperties--) | Haalt apparaateigenschappen op, inclusief metadata. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Haalt een waarde van een tekenreeks‑eigenschap op. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Haalt een waarde van een kleureigenschap op. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Haalt een waarde van een double‑eigenschap op. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Haalt een waarde van een integer‑eigenschap op. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Haalt een waarde van een marges‑eigenschap op. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Haalt een waarde van een matrixeigenschap op. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Haalt een waarde van een rechthoekeigenschap op. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Haalt een waarde van een grootte‑eigenschap op. |
| [getSaveOptions()](#getSaveOptions--) | Retourneert opslaanopties. |
| [getSize()](#getSize--) | Haalt de grootte van de pagina op. |
| [getStroke()](#getStroke--) | Haalt de huidige lijnstijl op. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | Haalt de huidige tekstweergavemodus op. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Haalt de huidige tekststreekbreedte op. |
| [getTransform()](#getTransform--) | Haalt de huidige transformatie op. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Initialiseert de clip van het apparaat. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Haalt een waarde van een booleaanse eigenschap op. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | Roteer de huidige transformatie-matrix. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Roteer de huidige transformatie-matrix rond een punt. |
| [scale(double x, double y)](#scale-double-double-) | Schaalt de huidige transformatie-matrix. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Specificeert de huidige achtergrond van de pagina. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Specificeert de transformatie van tekens. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Specificeert de clip van het apparaat. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Specificeert de maker van de resulterende apparaatuitvoer. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Specificeert een lettertype. |
| [setOpacity(float opacity)](#setOpacity-float-) | Specificeert de dekking. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Specificeert een dekkingsmasker. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Specificeert een verf. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Specificeert apparaat-eigenschappen inclusief metadata. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Specificeert opties voor het beheren van het renderproces. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Specificeert een lijn. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Specificeert de tekstweergavemodus. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Specificeert de tekststreekbreedte. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Specificeert de huidige transformatie. |
| [shear(double shx, double shy)](#shear-double-double-) | Schuift de huidige transformatie-matrix. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Transformeert de huidige transformatie-matrix. |
| [translate(double x, double y)](#translate-double-double-) | Vertaalt de huidige transformatie-matrix. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Schrijft een opmerking. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Schrijft een tekenreeks met het opgegeven lettertype. |
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


Huidige apparaatversie.

### closePage() {#closePage--}
```
public void closePage()
```


Voert de noodzakelijke voorbereiding van het apparaat uit nadat de pagina is gerenderd.

### create() {#create--}
```
public Device create()
```


Maakt een kopie van dit apparaat.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


Verwijdert het apparaat.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Tekent een pad.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | java.awt.Shape | Een pad om te tekenen. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Tekent een boog.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | float | X-coördinaat van het midden van de boog. |
| y | float | Y-coördinaat van het midden van de boog. |
| breedte | float | Een breedte van de omschreven rechthoek. |
| hoogte | float | Een hoogte van de omschreven rechthoek. |
| startAngle | float | Een starthoek van de boog. |
| arcAngle | float | Een hoek van de boog. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Tekent een afbeelding met toegewezen transformatie en achtergrond.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Een afbeelding om te tekenen. |
| transform | java.awt.geom.AffineTransform | Een transformatie. |
| bkg | java.awt.Color | Een achtergrondkleur. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Tekent een lijnsegment.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x1 | float | X-coördinaat van het begin van het segment. |
| y1 | float | Y-coördinaat van het begin van het segment. |
| x2 | float | X-coördinaat van het einde van het segment. |
| y2 | float | Y-coördinaat van het einde van het segment. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Tekent een ovaal.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | float | X-coördinaat van het midden van de ovaal. |
| y | float | Y-coördinaat van het midden van de ovaal. |
| breedte | float | Een breedte van de omschreven rechthoek. |
| hoogte | float | Een hoogte van de omschreven rechthoek. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Tekent een veelhoek.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xPoints | float[] | X-coördinaten van punten. |
| yPoints | float[] | Y-coördinaat van punten. |
| nPoints | int | Het aantal punten. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Tekent een veelhoek.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xPoints | int[] | X-coördinaten van punten. |
| yPoints | int[] | Y-coördinaat van punten. |
| nPoints | int | Het aantal punten. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Tekent een polylijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xPoints | float[] | X-coördinaten van punten. |
| yPoints | float[] | Y-coördinaat van punten. |
| nPoints | int | Het aantal punten. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Tekent een polylijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xPoints | int[] | X-coördinaten van punten. |
| yPoints | int[] | Y-coördinaat van punten. |
| nPoints | int | Het aantal punten. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Tekent een rechthoek.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | float | X-coördinaat van de linkerbovenhoek van de rechthoek. |
| y | float | Y-coördinaat van de linkerbovenhoek van de rechthoek. |
| breedte | float | Een breedte van de rechthoek. |
| hoogte | float | Een hoogte van de rechthoek. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Tekent een afgeronde rechthoek.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | float | X-coördinaat van de linkerbovenhoek van de rechthoek. |
| y | float | Y-coördinaat van de linkerbovenhoek van de rechthoek. |
| breedte | float | Een breedte van de rechthoek. |
| hoogte | float | Een hoogte van de rechthoek. |
| arcWidth | float | Een breedte van de omschreven rechthoek van de boog die een hoek van de rechthoek afrondt. |
| arcHeight | float | Een hoogte van de omschreven rechthoek van de boog die een hoek van de rechthoek afrondt. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Tekent een tekenreeks op een gegeven punt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Voert de noodzakelijke voorbereiding van het apparaat uit nadat het document is gerenderd.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Vult een pad.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| path | java.awt.Shape | Een pad om in te vullen. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Vult een boog.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | float | X-coördinaat van het midden van de boog. |
| y | float | Y-coördinaat van het midden van de boog. |
| breedte | float | Een breedte van de omschreven rechthoek. |
| hoogte | float | Een hoogte van de omschreven rechthoek. |
| startAngle | float | Een starthoek van de boog. |
| arcAngle | float | Een hoek van de boog. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Vult een ovaal.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | float | X-coördinaat van het midden van de ovaal. |
| y | float | Y-coördinaat van het midden van de ovaal. |
| breedte | float | Een breedte van de omschreven rechthoek. |
| hoogte | float | Een hoogte van de omschreven rechthoek. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Vult een veelhoek.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xPoints | float[] | X-coördinaten van punten. |
| yPoints | float[] | Y-coördinaat van punten. |
| nPoints | int | Het aantal punten. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Vult een veelhoek.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xPoints | int[] | X-coördinaten van punten. |
| yPoints | int[] | Y-coördinaat van punten. |
| nPoints | int | Het aantal punten. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Vult een rechthoek.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | float | X-coördinaat van de linkerbovenhoek van de rechthoek. |
| y | float | Y-coördinaat van de linkerbovenhoek van de rechthoek. |
| breedte | float | Een breedte van de rechthoek. |
| hoogte | float | Een hoogte van de rechthoek. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Tekent een afgeronde rechthoek.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | float | X-coördinaat van de linkerbovenhoek van de rechthoek. |
| y | float | Y-coördinaat van de linkerbovenhoek van de rechthoek. |
| breedte | float | Een breedte van de rechthoek. |
| hoogte | float | Een hoogte van de rechthoek. |
| arcWidth | float | Een breedte van de omschreven rechthoek van de boog die een hoek van de rechthoek afrondt. |
| arcHeight | float | Een hoogte van de omschreven rechthoek van de boog die een hoek van de rechthoek afrondt. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Haalt de huidige achtergrond van de pagina op.

**Returns:**
java.awt.Color - Huidige achtergrond van de pagina
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Haalt de huidige teken‑transformatie op.

**Returns:**
java.awt.geom.AffineTransform - Huidige transformatie van tekens.
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


Haalt de maker van de resulterende apparaatoutput op.

**Returns:**
java.lang.String - Een makerwaarde.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Haalt het huidige paginanummer op.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Haalt het huidige lettertype op.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Haalt de huidige doorzichtigheid op.

**Returns:**
float - Huidige doorzichtigheid.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Haalt het huidige doorzichtigheidsmasker op.

**Returns:**
java.awt.Paint - Huidig doorzichtigheidsmasker.
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


Haalt de huidige verf op.

**Returns:**
java.awt.Paint - Huidige verf.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Haalt apparaateigenschappen op, inclusief metadata.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Haalt een waarde van een tekenreeks‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.lang.String - De eigenschapswaarde.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Haalt een waarde van een kleureigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.awt.Color - De eigenschapswaarde.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Haalt een waarde van een double‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
double - De eigenschapswaarde.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Haalt een waarde van een integer‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
int - De eigenschapswaarde.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Haalt een waarde van een marges‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.awt.Insets - De eigenschapswaarde.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Haalt een waarde van een matrixeigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.awt.geom.AffineTransform - De eigenschapswaarde.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Haalt een waarde van een rechthoekeigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.awt.Rectangle - De eigenschapswaarde.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Haalt een waarde van een grootte‑eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
java.awt.Dimension - De eigenschapswaarde.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Retourneert opslaanopties.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Haalt de grootte van de pagina op.

**Returns:**
java.awt.Dimension - Grootte van de pagina.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Haalt de huidige lijnstijl op.

**Returns:**
java.awt.Stroke - Huidige stroke.
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Haalt de huidige tekstweergavemodus op.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Haalt de huidige tekststreekbreedte op.

**Returns:**
float - Huidige tekstlijnbreedte.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Haalt de huidige transformatie op.

**Returns:**
java.awt.geom.AffineTransform - Huidige transformatie.
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


Initialiseert de clip van het apparaat.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Initialiseert het aantal pagina's om te renderen.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Geeft aan of het apparaat de directe RGB-modus gebruikt, dat is RGB.

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


Haalt een waarde van een booleaanse eigenschap op.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | java.lang.String | De naam van de eigenschap. |

**Returns:**
boolean - De eigenschapswaarde.
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


Voert de noodzakelijke voorbereiding van het apparaat uit vóór het renderen van de pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| breedte | float |  |
| hoogte | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Voert de noodzakelijke voorbereiding van het apparaat uit vóór het renderen van de pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| titel | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


Reset het apparaat naar de initiële staat voor het hele document. Wordt gebruikt voor het resetten van de outputstroom.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Reset het apparaat naar de initiële staat voor een pagina.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Roteer de huidige transformatie-matrix. Roept writeTransform(Transform) aan. Roteren met een positieve hoek theta roteert punten op de positieve x-as naar de positieve y-as.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| theta | double | Hoek in radialen waarover geroteerd moet worden. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Roteer de huidige transformatie-matrix rond een punt.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| theta | double | Een rotatiehoek in radialen. |
| x | double | X-coördinaat van punt. |
| y | double | Y-coördinaat van punt. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Schaalt de huidige transformatie-matrix. Roept writeTransform(Transform) aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | double | Een schaal in de X-as. |
| y | double | Een schaal in de Y-as. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Specificeert de huidige achtergrond van de pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| achtergrond | java.awt.Color | Een achtergrond van de pagina. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Specificeert de transformatie van tekens.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421haracters transformatie. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Specificeert de clip van het apparaat.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| clipPath | java.awt.Shape | Een knippad. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Specificeert de maker van de resulterende apparaatuitvoer.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| maker | java.lang.String | Een makerwaarde. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Specificeert een lettertype.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Een lettertype. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Specificeert de dekking.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| opaciteit | float | Een opaciteit. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Specificeert een dekkingsmasker.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| opacityMask | java.awt.Paint | Een opaciteitsmasker. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Specificeert een verf.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| paint | java.awt.Paint | Een verf. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Specificeert apparaat-eigenschappen inclusief metadata.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Apparaateigenschappen. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Specificeert opties voor het beheren van het renderproces.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Opties voor het beheren van het renderproces. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specificeert de grootte van de pagina.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| grootte | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Specificeert een lijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stroke | java.awt.Stroke | Een lijn. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Specificeert de tekstweergavemodus.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Tekstweergavemodus. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Specificeert de tekststreekbreedte.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| textStrokeWidth | float | Tekstlijnbreedte. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Specificeert de huidige transformatie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Een transformatie.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Schuift de huidige transformatie matrix. Roept writeTransform(Transform) aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| shx | double | Een shear in X-as. |
| shy | double | Een shear in Y-as. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Voert de noodzakelijke voorbereiding van het apparaat uit voordat het renderen van het document start.

### toString() {#toString--}
```
public String toString()
```


Retourneert de naam van het apparaattype.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Transformeert de huidige transformatie matrix. Roept writeTransform(Transform) aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Toepassende transformatie. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Vertaalt de huidige transformatie matrix. Roept writeTransform(Transform) aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | double | Vertaling in X-as. |
| y | double | Vertaling in Y-as. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Werk pagina-parameters bij vanuit een ander multi-paged apparaat.

**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Schrijft een opmerking.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| commentaar | java.lang.String | Een commentaar dat moet worden geschreven. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Schrijft een tekenreeks met het opgegeven lettertype.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Gespecificeerd lettertype. |
| str | java.lang.String | De tekenreeks. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarschuwing | java.lang.String |  |

