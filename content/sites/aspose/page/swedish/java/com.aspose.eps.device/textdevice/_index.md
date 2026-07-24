---
title: "TextDevice"
second_title: "Aspose.Page för Java API-referens"
description: 
type: docs
weight: 13
url: /sv/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## Fält

| Fält | Beskrivning |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | Aktuell enhetsversion. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | Ritar en bana. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Ritar en båge. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Ritar en bild med tilldelad transformation och bakgrund. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Ritar ett linjesegment. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Ritar en oval. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Ritar en polygon. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Ritar en polygon. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Ritar en polylinje. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Ritar en polylinje. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Ritar en rektangel. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Ritar en rundad rektangel. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Fyller en bana. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Fyller en båge. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Fyller en oval. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Fyller en polygon. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Fyller en polygon. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Fyller en rektangel. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Ritar en rundad rektangel. |
| [getBackground()](#getBackground--) | Hämtar aktuell bakgrund för sidan. |
| [getCharTM()](#getCharTM--) | Hämtar aktuell teckenomvandling. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Hämtar skaparen av resulterande enhetsutdata. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | Hämtar aktuellt teckensnitt. |
| [getOpacity()](#getOpacity--) | Hämtar aktuell opacitet. |
| [getOpacityMask()](#getOpacityMask--) | Hämtar aktuell opacitetsmask. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | Hämtar aktuell färg. |
| [getProperties()](#getProperties--) | Hämtar enhetsegenskaper inklusive metadata. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Hämtar ett värde för strängegenskap. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Hämtar ett värde för färgegenskap. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Hämtar ett värde för dubbel egenskap. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Hämtar ett värde för heltalsegenskap. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Hämtar ett värde för marginalegenskap. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Hämtar ett värde för matrisegenskap. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Hämtar ett värde för rektangelegenskap. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Hämtar ett värde för storleks egenskap. |
| [getSaveOptions()](#getSaveOptions--) | Returnerar sparalternativ. |
| [getSize()](#getSize--) | Hämtar en storlek på sidan. |
| [getStroke()](#getStroke--) | Hämtar aktuell linje. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | Hämtar aktuellt textrenderingsläge. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Hämtar aktuell textlinjebredd. |
| [getTransform()](#getTransform--) | Hämtar aktuell transformation. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Initierar beskärning av enheten. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Hämtar ett värde för boolesk egenskap. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | Rotera den aktuella transformationsmatrisen. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Rotera den aktuella transformationsmatrisen kring en punkt. |
| [scale(double x, double y)](#scale-double-double-) | Skalar den aktuella transformationsmatrisen. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Anger aktuell bakgrund för sidan. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Anger teckentransformering. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Anger beskärning av enheten. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Anger skapare av resulterande enhetsutdata. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Anger ett teckensnitt. |
| [setOpacity(float opacity)](#setOpacity-float-) | Anger opacitet. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Anger en opacitetsmask. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Anger en färg. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Anger enhetsegenskaper inklusive metadata. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Anger alternativ för att hantera renderingsprocessen. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Anger en linje. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Anger textrenderingsläge. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Anger bredd på textlinjen. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Anger aktuell transformering. |
| [shear(double shx, double shy)](#shear-double-double-) | Skjuvar den aktuella transformationsmatrisen. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Transformerar den aktuella transformationsmatrisen. |
| [translate(double x, double y)](#translate-double-double-) | Förflyttar den aktuella transformationsmatrisen. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Skriver en kommentar. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Skriver ut sträng med angivet teckensnitt. |
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


Aktuell enhetsversion.

### closePage() {#closePage--}
```
public void closePage()
```


Gör nödvändig förberedelse av enheten efter att sidan har renderats.

### create() {#create--}
```
public Device create()
```


Skapar en kopia av denna enhet.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


Frigör enheten.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Ritar en bana.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sökväg | java.awt.Shape | En bana som ska ritas. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Ritar en båge.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | float | X-koordinat för cirkelbågens centrum. |
| y | float | Y-koordinat för cirkelbågens centrum. |
| width | float | En bredd på den omskrivna rektangeln. |
| height | float | En höjd på den omskrivna rektangeln. |
| startAngle | float | En startvinkel för bågen. |
| arcAngle | float | En vinkel för bågen. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Ritar en bild med tilldelad transformation och bakgrund.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | En bild som ska ritas. |
| transform | java.awt.geom.AffineTransform | En transformering. |
| bkg | java.awt.Color | En bakgrundsfärg. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Ritar ett linjesegment.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x1 | float | X-koordinat för segmentets början. |
| y1 | float | Y-koordinat för segmentets början. |
| x2 | float | X-koordinat för segmentets slut. |
| y2 | float | Y-koordinat för segmentets slut. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Ritar en oval.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | float | X-koordinat för centrum av ovalen. |
| y | float | Y-koordinat för centrum av ovalen. |
| width | float | En bredd på den omskrivna rektangeln. |
| height | float | En höjd på den omskrivna rektangeln. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Ritar en polygon.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| xPoints | float[] | X-koordinater för punkter. |
| yPoints | float[] | Y-koordinat för punkter. |
| nPoints | int | Antalet punkter. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Ritar en polygon.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| xPoints | int[] | X-koordinater för punkter. |
| yPoints | int[] | Y-koordinat för punkter. |
| nPoints | int | Antalet punkter. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Ritar en polylinje.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| xPoints | float[] | X-koordinater för punkter. |
| yPoints | float[] | Y-koordinat för punkter. |
| nPoints | int | Antalet punkter. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Ritar en polylinje.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| xPoints | int[] | X-koordinater för punkter. |
| yPoints | int[] | Y-koordinat för punkter. |
| nPoints | int | Antalet punkter. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Ritar en rektangel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | float | X-koordinat för rektangelns övre vänstra hörn. |
| y | float | Y-koordinat för rektangelns övre vänstra hörn. |
| width | float | En bredd på rektangeln. |
| height | float | En höjd på rektangeln. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Ritar en rundad rektangel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | float | X-koordinat för rektangelns övre vänstra hörn. |
| y | float | Y-koordinat för rektangelns övre vänstra hörn. |
| width | float | En bredd på rektangeln. |
| height | float | En höjd på rektangeln. |
| arcWidth | float | En bredd på den omskrivna rektangeln för bågen som rundar en vinkel i rektangeln. |
| arcHeight | float | En höjd på den omskrivna rektangeln för bågen som rundar en vinkel i rektangeln. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Ritar en sträng vid given punkt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Gör nödvändig förberedelse av enheten efter att dokumentet har renderats.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Fyller en bana.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sökväg | java.awt.Shape | En bana att fylla. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Fyller en båge.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | float | X-koordinat för cirkelbågens centrum. |
| y | float | Y-koordinat för cirkelbågens centrum. |
| width | float | En bredd på den omskrivna rektangeln. |
| height | float | En höjd på den omskrivna rektangeln. |
| startAngle | float | En startvinkel för bågen. |
| arcAngle | float | En vinkel för bågen. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Fyller en oval.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | float | X-koordinat för centrum av ovalen. |
| y | float | Y-koordinat för centrum av ovalen. |
| width | float | En bredd på den omskrivna rektangeln. |
| height | float | En höjd på den omskrivna rektangeln. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Fyller en polygon.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| xPoints | float[] | X-koordinater för punkter. |
| yPoints | float[] | Y-koordinat för punkter. |
| nPoints | int | Antalet punkter. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Fyller en polygon.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| xPoints | int[] | X-koordinater för punkter. |
| yPoints | int[] | Y-koordinat för punkter. |
| nPoints | int | Antalet punkter. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Fyller en rektangel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | float | X-koordinat för rektangelns övre vänstra hörn. |
| y | float | Y-koordinat för rektangelns övre vänstra hörn. |
| width | float | En bredd på rektangeln. |
| height | float | En höjd på rektangeln. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Ritar en rundad rektangel.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | float | X-koordinat för rektangelns övre vänstra hörn. |
| y | float | Y-koordinat för rektangelns övre vänstra hörn. |
| width | float | En bredd på rektangeln. |
| height | float | En höjd på rektangeln. |
| arcWidth | float | En bredd på den omskrivna rektangeln för bågen som rundar en vinkel i rektangeln. |
| arcHeight | float | En höjd på den omskrivna rektangeln för bågen som rundar en vinkel i rektangeln. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Hämtar aktuell bakgrund för sidan.

**Returns:**
java.awt.Color - Aktuell bakgrund för sidan
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Hämtar aktuell teckenomvandling.

**Returns:**
java.awt.geom.AffineTransform - Aktuell teckentransform.
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


Hämtar skaparen av resulterande enhetsutdata.

**Returns:**
java.lang.String - Ett skaparevärde.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Hämtar aktuellt sidnummer.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Hämtar aktuellt teckensnitt.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Hämtar aktuell opacitet.

**Returns:**
float - Aktuell opacitet.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Hämtar aktuell opacitetsmask.

**Returns:**
java.awt.Paint - Aktuell opacitetsmask.
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


Hämtar aktuell färg.

**Returns:**
java.awt.Paint - Aktuell färg.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Hämtar enhetsegenskaper inklusive metadata.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Hämtar ett värde för strängegenskap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nyckel | java.lang.String | Namnet på egenskapen. |

**Returns:**
java.lang.String - Egenskapsvärdet.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Hämtar ett värde för färgegenskap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nyckel | java.lang.String | Namnet på egenskapen. |

**Returns:**
java.awt.Color - Egenskapsvärdet.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Hämtar ett värde för dubbel egenskap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nyckel | java.lang.String | Namnet på egenskapen. |

**Returns:**
double - Egenskapsvärdet.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Hämtar ett värde för heltalsegenskap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nyckel | java.lang.String | Namnet på egenskapen. |

**Returns:**
int - Egenskapsvärdet.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Hämtar ett värde för marginalegenskap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nyckel | java.lang.String | Namnet på egenskapen. |

**Returns:**
java.awt.Insets - Egenskapsvärdet.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Hämtar ett värde för matrisegenskap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nyckel | java.lang.String | Namnet på egenskapen. |

**Returns:**
java.awt.geom.AffineTransform - Egenskapsvärdet.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Hämtar ett värde för rektangelegenskap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nyckel | java.lang.String | Namnet på egenskapen. |

**Returns:**
java.awt.Rectangle - Egenskapsvärdet.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Hämtar ett värde för storleks egenskap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nyckel | java.lang.String | Namnet på egenskapen. |

**Returns:**
java.awt.Dimension - Egenskapsvärdet.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Returnerar sparalternativ.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Hämtar en storlek på sidan.

**Returns:**
java.awt.Dimension - Sidans storlek.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Hämtar aktuell linje.

**Returns:**
java.awt.Stroke - Aktuell linje.
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Hämtar aktuellt textrenderingsläge.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Hämtar aktuell textlinjebredd.

**Returns:**
float - Aktuell textlinjebredd.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Hämtar aktuell transformation.

**Returns:**
java.awt.geom.AffineTransform - Aktuell transform.
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


Initierar beskärning av enheten.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Initierar antalet sidor att rendera.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Indikerar om enheten använder direkt RGB-läge, det vill säga RGB.

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


Hämtar ett värde för boolesk egenskap.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| nyckel | java.lang.String | Namnet på egenskapen. |

**Returns:**
boolean - Egenskapsvärdet.
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


Gör nödvändig förberedelse av enheten innan sidrendering.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | float |  |
| height | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Gör nödvändig förberedelse av enheten innan sidrendering.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| titel | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


Återställ enheten till ursprungligt tillstånd för hela dokumentet. Används för att återställa utskriftsström.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Återställ enheten till ursprungligt tillstånd för en sida.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Rotera den aktuella transformationsmatrisen. Anropar writeTransform(Transform). Att rotera med en positiv vinkel theta roterar punkter på den positiva x-axeln mot den positiva y-axeln.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| theta | double | Vinkel i radianer att rotera över. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Rotera den aktuella transformationsmatrisen kring en punkt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| theta | double | En rotationsvinkel i radianer. |
| x | double | X-koordinat för punkt. |
| y | double | Y-koordinat för punkt. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Skalar den aktuella transformationsmatrisen. Anropar writeTransform(Transform).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | double | En skala i X-axeln. |
| y | double | En skala i Y-axeln. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Anger aktuell bakgrund för sidan.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| background | java.awt.Color | En bakgrund för sidan. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Anger teckentransformering.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421tecken transform. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Anger beskärning av enheten.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| clipPath | java.awt.Shape | En klippningsbana. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Anger skapare av resulterande enhetsutdata.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| creator | java.lang.String | Ett skaparevärde. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Anger ett teckensnitt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Ett teckensnitt. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Anger opacitet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| opacitet | float | En opacitet. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Anger en opacitetsmask.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| opacityMask | java.awt.Paint | En opacitetsmask. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Anger en färg.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| färg | java.awt.Paint | En färg. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Anger enhetsegenskaper inklusive metadata.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Enhetsegenskaper. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Anger alternativ för att hantera renderingsprocessen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Alternativ för att hantera renderingsprocessen. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Anger sidans storlek.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| size | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Anger en linje.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| stroke | java.awt.Stroke | Ett streck. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Anger textrenderingsläge.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Textrenderingsläge. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Anger bredd på textlinjen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| textStrokeWidth | float | Textstreckbredd. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Anger aktuell transformering.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | En transformation.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Skevar den aktuella transformationsmatrisen. Anropar writeTransform(Transform).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| shx | double | En skjuvning i X‑axeln. |
| shy | double | En skjuvning i Y‑axeln. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Gör nödvändig förberedelse av enheten innan dokumentets rendering startas.

### toString() {#toString--}
```
public String toString()
```


Returnerar namnet på enhetstypen.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Transformerar den aktuella transformationsmatrisen. Anropar writeTransform(Transform).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Transform att tillämpa. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Översätter den aktuella transformationsmatrisen. Anropar writeTransform(Transform).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | double | Översättning i X-axeln. |
| y | double | Översättning i Y-axeln. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Uppdaterar sidparametrar från en annan flersidig enhet.

**Parameters:**
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Skriver en kommentar.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| comment | java.lang.String | En kommentar att skriva. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Skriver ut sträng med angivet teckensnitt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Angivet teckensnitt. |
| str | java.lang.String | Strängen. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| varning | java.lang.String |  |

