---
title: "TextDevice"
second_title: "Aspose.Page for Java API-Referenz"
description: 
type: docs
weight: 13
url: /de/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | Aktuelle Geräteversion. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | Zeichnet einen Pfad. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Zeichnet einen Bogen. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Zeichnet ein Bild mit zugewiesener Transformation und Hintergrund. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Zeichnet ein Liniensegment. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Zeichnet ein Oval. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Zeichnet ein Polygon. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Zeichnet ein Polygon. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Zeichnet eine Polylinie. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Zeichnet eine Polylinie. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Zeichnet ein Rechteck. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Zeichnet ein abgerundetes Rechteck. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Füllt einen Pfad. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Füllt einen Bogen. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Füllt ein Oval. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Füllt ein Polygon. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Füllt ein Polygon. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Füllt ein Rechteck. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Zeichnet ein abgerundetes Rechteck. |
| [getBackground()](#getBackground--) | Ermittelt den aktuellen Hintergrund der Seite. |
| [getCharTM()](#getCharTM--) | Ermittelt die aktuelle Zeichen-Transformation. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Ermittelt den Ersteller der resultierenden Geräteausgabe. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | Ermittelt die aktuelle Schriftart. |
| [getOpacity()](#getOpacity--) | Ermittelt die aktuelle Deckkraft. |
| [getOpacityMask()](#getOpacityMask--) | Ermittelt die aktuelle Deckkraftmaske. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | Ermittelt die aktuelle Farbe. |
| [getProperties()](#getProperties--) | Ermittelt Geräte-Eigenschaften einschließlich Metadaten. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Ermittelt den Wert einer Zeichenketten-Eigenschaft. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Ermittelt den Wert einer Farb-Eigenschaft. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Ermittelt den Wert einer Double-Eigenschaft. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Ermittelt den Wert einer Ganzzahl-Eigenschaft. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Ermittelt den Wert einer Rand-Eigenschaft. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Ermittelt den Wert einer Matrix-Eigenschaft. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Ermittelt den Wert einer Rechteck-Eigenschaft. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Ermittelt den Wert einer Größen-Eigenschaft. |
| [getSaveOptions()](#getSaveOptions--) | Gibt Speicheroptionen zurück. |
| [getSize()](#getSize--) | Ermittelt die Größe der Seite. |
| [getStroke()](#getStroke--) | Ermittelt den aktuellen Strich. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | Ermittelt den aktuellen Textdarstellungsmodus. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Ermittelt die aktuelle Textstrichbreite. |
| [getTransform()](#getTransform--) | Ermittelt die aktuelle Transformation. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Initialisiert den Clip des Geräts. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Ermittelt den Wert einer booleschen Eigenschaft. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | Dreht die aktuelle Transformationsmatrix. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Dreht die aktuelle Transformationsmatrix um einen Punkt. |
| [scale(double x, double y)](#scale-double-double-) | Skaliert die aktuelle Transformationsmatrix. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Gibt den aktuellen Hintergrund der Seite an. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Gibt die Zeichen-Transformation an. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Gibt den Clip des Geräts an. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Gibt den Ersteller der resultierenden Geräteausgabe an. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Gibt eine Schriftart an. |
| [setOpacity(float opacity)](#setOpacity-float-) | Gibt die Deckkraft an. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Gibt eine Deckkraftmaske an. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Gibt eine Farbe an. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Gibt Geräteeigenschaften einschließlich Metadaten an. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Gibt Optionen zur Verwaltung des Renderprozesses an. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Gibt einen Strich an. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Gibt den Textdarstellungsmodus an. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Gibt die Textstrichbreite an. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Gibt die aktuelle Transformation an. |
| [shear(double shx, double shy)](#shear-double-double-) | Schert die aktuelle Transformationsmatrix. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Transformiert die aktuelle Transformationsmatrix. |
| [translate(double x, double y)](#translate-double-double-) | Verschiebt die aktuelle Transformationsmatrix. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Schreibt einen Kommentar. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Gibt eine Zeichenkette mit der angegebenen Schriftart aus. |
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


Aktuelle Geräteversion.

### closePage() {#closePage--}
```
public void closePage()
```


Führt die notwendige Vorbereitung des Geräts durch, nachdem die Seite gerendert wurde.

### create() {#create--}
```
public Device create()
```


Erstellt eine Kopie dieses Geräts.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


Gibt das Gerät frei.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Zeichnet einen Pfad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | java.awt.Shape | Ein Pfad, der gezeichnet werden soll. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Zeichnet einen Bogen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | X‑Koordinate des Zentrums des Bogens. |
| y | float | Y‑Koordinate des Zentrums des Bogens. |
| Breite | float | Eine Breite des umschriebenen Rechtecks. |
| Höhe | float | Eine Höhe des umschriebenen Rechtecks. |
| startAngle | float | Ein Startwinkel des Bogens. |
| arcAngle | float | Ein Winkel des Bogens. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Zeichnet ein Bild mit zugewiesener Transformation und Hintergrund.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Ein Bild, das gezeichnet werden soll. |
| transform | java.awt.geom.AffineTransform | Eine Transformation. |
| bkg | java.awt.Color | Eine Hintergrundfarbe. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Zeichnet ein Liniensegment.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x1 | float | X‑Koordinate des Beginns des Segments. |
| y1 | float | Y‑Koordinate des Beginns des Segments. |
| x2 | float | X‑Koordinate des Endes des Segments. |
| y2 | float | Y‑Koordinate des Endes des Segments. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Zeichnet ein Oval.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | X‑Koordinate des Zentrums des Ovals. |
| y | float | Y-Koordinate des Zentrums des Ovals. |
| Breite | float | Eine Breite des umschriebenen Rechtecks. |
| Höhe | float | Eine Höhe des umschriebenen Rechtecks. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Zeichnet ein Polygon.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xPoints | float[] | X-Koordinaten der Punkte. |
| yPoints | float[] | Y-Koordinate der Punkte. |
| nPoints | int | Die Anzahl der Punkte. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Zeichnet ein Polygon.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xPoints | int[] | X-Koordinaten der Punkte. |
| yPoints | int[] | Y-Koordinate der Punkte. |
| nPoints | int | Die Anzahl der Punkte. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Zeichnet eine Polylinie.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xPoints | float[] | X-Koordinaten der Punkte. |
| yPoints | float[] | Y-Koordinate der Punkte. |
| nPoints | int | Die Anzahl der Punkte. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Zeichnet eine Polylinie.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xPoints | int[] | X-Koordinaten der Punkte. |
| yPoints | int[] | Y-Koordinate der Punkte. |
| nPoints | int | Die Anzahl der Punkte. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Zeichnet ein Rechteck.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | X-Koordinate der oberen linken Ecke des Rechtecks. |
| y | float | Y-Koordinate der oberen linken Ecke des Rechtecks. |
| Breite | float | Die Breite des Rechtecks. |
| Höhe | float | Die Höhe des Rechtecks. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Zeichnet ein abgerundetes Rechteck.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | X-Koordinate der oberen linken Ecke des Rechtecks. |
| y | float | Y-Koordinate der oberen linken Ecke des Rechtecks. |
| Breite | float | Die Breite des Rechtecks. |
| Höhe | float | Die Höhe des Rechtecks. |
| arcWidth | float | Die Breite des umschriebenen Rechtecks des Bogens, der einen Winkel des Rechtecks abrundet. |
| arcHeight | float | Die Höhe des umschriebenen Rechtecks des Bogens, der einen Winkel des Rechtecks abrundet. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Zeichnet eine Zeichenkette an einem angegebenen Punkt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Führt die notwendige Vorbereitung des Geräts durch, nachdem das Dokument gerendert wurde.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Füllt einen Pfad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | java.awt.Shape | Ein Pfad, der gefüllt werden soll. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Füllt einen Bogen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | X‑Koordinate des Zentrums des Bogens. |
| y | float | Y‑Koordinate des Zentrums des Bogens. |
| Breite | float | Eine Breite des umschriebenen Rechtecks. |
| Höhe | float | Eine Höhe des umschriebenen Rechtecks. |
| startAngle | float | Ein Startwinkel des Bogens. |
| arcAngle | float | Ein Winkel des Bogens. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Füllt ein Oval.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | X‑Koordinate des Zentrums des Ovals. |
| y | float | Y-Koordinate des Zentrums des Ovals. |
| Breite | float | Eine Breite des umschriebenen Rechtecks. |
| Höhe | float | Eine Höhe des umschriebenen Rechtecks. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Füllt ein Polygon.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xPoints | float[] | X-Koordinaten der Punkte. |
| yPoints | float[] | Y-Koordinate der Punkte. |
| nPoints | int | Die Anzahl der Punkte. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Füllt ein Polygon.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xPoints | int[] | X-Koordinaten der Punkte. |
| yPoints | int[] | Y-Koordinate der Punkte. |
| nPoints | int | Die Anzahl der Punkte. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Füllt ein Rechteck.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | X-Koordinate der oberen linken Ecke des Rechtecks. |
| y | float | Y-Koordinate der oberen linken Ecke des Rechtecks. |
| Breite | float | Die Breite des Rechtecks. |
| Höhe | float | Die Höhe des Rechtecks. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Zeichnet ein abgerundetes Rechteck.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | float | X-Koordinate der oberen linken Ecke des Rechtecks. |
| y | float | Y-Koordinate der oberen linken Ecke des Rechtecks. |
| Breite | float | Die Breite des Rechtecks. |
| Höhe | float | Die Höhe des Rechtecks. |
| arcWidth | float | Die Breite des umschriebenen Rechtecks des Bogens, der einen Winkel des Rechtecks abrundet. |
| arcHeight | float | Die Höhe des umschriebenen Rechtecks des Bogens, der einen Winkel des Rechtecks abrundet. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Ermittelt den aktuellen Hintergrund der Seite.

**Returns:**
java.awt.Color – Aktueller Hintergrund der Seite
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Ermittelt die aktuelle Zeichen-Transformation.

**Returns:**
java.awt.geom.AffineTransform – Aktuelle Transformation der Zeichen.
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


Ermittelt den Ersteller der resultierenden Geräteausgabe.

**Returns:**
java.lang.String – Ein Erzeugerwert.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Ermittelt die aktuelle Seitenzahl.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Ermittelt die aktuelle Schriftart.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Ermittelt die aktuelle Deckkraft.

**Returns:**
float – Aktuelle Deckkraft.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Ermittelt die aktuelle Deckkraftmaske.

**Returns:**
java.awt.Paint – Aktuelle Deckkraftmaske.
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


Ermittelt die aktuelle Farbe.

**Returns:**
java.awt.Paint - Aktuelle Farbe.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Ermittelt Geräte-Eigenschaften einschließlich Metadaten.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Ermittelt den Wert einer Zeichenketten-Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.lang.String - Der Eigenschaftswert.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Ermittelt den Wert einer Farb-Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.awt.Color - Der Eigenschaftswert.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Ermittelt den Wert einer Double-Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
double - Der Eigenschaftswert.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Ermittelt den Wert einer Ganzzahl-Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
int - Der Eigenschaftswert.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Ermittelt den Wert einer Rand-Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.awt.Insets - Der Eigenschaftswert.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Ermittelt den Wert einer Matrix-Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.awt.geom.AffineTransform - Der Eigenschaftswert.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Ermittelt den Wert einer Rechteck-Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.awt.Rectangle - Der Eigenschaftswert.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Ermittelt den Wert einer Größen-Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
java.awt.Dimension - Der Eigenschaftswert.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Gibt Speicheroptionen zurück.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Ermittelt die Größe der Seite.

**Returns:**
java.awt.Dimension - Größe der Seite.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Ermittelt den aktuellen Strich.

**Returns:**
java.awt.Stroke - Aktueller Strich.
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Ermittelt den aktuellen Textdarstellungsmodus.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Ermittelt die aktuelle Textstrichbreite.

**Returns:**
float - Aktuelle Textstrichbreite.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Ermittelt die aktuelle Transformation.

**Returns:**
java.awt.geom.AffineTransform - Aktuelle Transformation.
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


Initialisiert den Clip des Geräts.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Initialisiert die Anzahl der zu rendernden Seiten.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Gibt an, ob das Gerät den direkten RGB-Modus verwendet, also RGB.

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


Ermittelt den Wert einer booleschen Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| key | java.lang.String | Der Name der Eigenschaft. |

**Returns:**
boolean - Der Eigenschaftswert.
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


Führt die notwendige Vorbereitung des Geräts vor dem Rendern der Seite durch.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Breite | float |  |
| Höhe | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Führt die notwendige Vorbereitung des Geräts vor dem Rendern der Seite durch.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Titel | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


Setzt das Gerät für das gesamte Dokument in den Ausgangszustand zurück. Wird zum Zurücksetzen des Ausgabestreams verwendet.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Hauptdokument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Setzt das Gerät für eine Seite in den Ausgangszustand zurück.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Dreht die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf. Eine Drehung mit einem positiven Winkel theta dreht Punkte auf der positiven x-Achse in Richtung der positiven y-Achse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Theta | double | Winkel in Radianten, um den gedreht werden soll. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Dreht die aktuelle Transformationsmatrix um einen Punkt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Theta | double | Ein Rotationswinkel in Radianten. |
| x | double | X-Koordinate des Punktes. |
| y | double | Y-Koordinate des Punktes. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Skaliert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Eine Skalierung in X-Achse. |
| y | double | Eine Skalierung in Y-Achse. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Gibt den aktuellen Hintergrund der Seite an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Hintergrund | java.awt.Color | Ein Hintergrund der Seite. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Gibt die Zeichen-Transformation an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421haracters Transformation. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Gibt den Clip des Geräts an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| clipPath | java.awt.Shape | Ein Beschneidungspfad. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Gibt den Ersteller der resultierenden Geräteausgabe an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Ersteller | java.lang.String | Ein Erstellerwert. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Gibt eine Schriftart an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Eine Schriftart. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Gibt die Deckkraft an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Deckkraft | float | Eine Deckkraft. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Gibt eine Deckkraftmaske an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| opacityMask | java.awt.Paint | Eine Deckkraftmaske. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Gibt eine Farbe an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| paint | java.awt.Paint | Eine Farbe. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Gibt Geräteeigenschaften einschließlich Metadaten an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Geräteeigenschaften. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Gibt Optionen zur Verwaltung des Renderprozesses an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Optionen zur Verwaltung des Rendering-Prozesses. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Gibt die Größe der Seite an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Größe | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Gibt einen Strich an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| stroke | java.awt.Stroke | Ein Strich. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Gibt den Textdarstellungsmodus an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Text-Rendering-Modus. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Gibt die Textstrichbreite an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| textStrokeWidth | float | Textstrichbreite. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Gibt die aktuelle Transformation an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Eine Transformation.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Schert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| shx | double | Eine Scherung entlang der X-Achse. |
| shy | double | Eine Scherung entlang der Y-Achse. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Führt die notwendige Vorbereitung des Geräts durch, bevor die Dokumentdarstellung gestartet wird.

### toString() {#toString--}
```
public String toString()
```


Gibt den Namen des Gerätetyps zurück.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Transformiert die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Anzuwendende Transformation. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Verschiebt die aktuelle Transformationsmatrix. Ruft writeTransform(Transform) auf.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Verschiebung entlang der X-Achse. |
| y | double | Verschiebung entlang der Y-Achse. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Aktualisiert Seitenparameter von einem anderen mehrseitigen Gerät.

**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Schreibt einen Kommentar.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Kommentar | java.lang.String | Ein zu schreibender Kommentar. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Gibt eine Zeichenkette mit der angegebenen Schriftart aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Angegebene Schriftart. |
| str | java.lang.String | Die Zeichenkette. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Warnung | java.lang.String |  |

