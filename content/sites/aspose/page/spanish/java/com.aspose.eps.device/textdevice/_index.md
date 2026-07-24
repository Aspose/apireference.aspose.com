---
title: "TextDevice"
second_title: "Referencia de API de Aspose.Page para Java"
description: 
type: docs
weight: 13
url: /es/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## Constructores

| Constructor | Descripción |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## Campos

| Campo | Descripción |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | Versión actual del dispositivo. |
## Métodos

| Método | Descripción |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | Dibuja una ruta. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Dibuja un arco. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Dibuja una imagen con la transformación asignada y el fondo. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Dibuja un segmento de línea. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Dibuja un óvalo. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Dibuja un polígono. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Dibuja un polígono. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Dibuja una polilínea. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Dibuja una polilínea. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Dibuja un rectángulo. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Dibuja un rectángulo redondeado. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Rellena una ruta. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Rellena un arco. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Rellena un óvalo. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Rellena un polígono. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Rellena un polígono. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Rellena un rectángulo. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Dibuja un rectángulo redondeado. |
| [getBackground()](#getBackground--) | Obtiene el fondo actual de la página. |
| [getCharTM()](#getCharTM--) | Obtiene la transformación actual de los caracteres. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Obtiene el creador de la salida del dispositivo resultante. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | Obtiene la fuente actual. |
| [getOpacity()](#getOpacity--) | Obtiene la opacidad actual. |
| [getOpacityMask()](#getOpacityMask--) | Obtiene la máscara de opacidad actual. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | Obtiene la pintura actual. |
| [getProperties()](#getProperties--) | Obtiene las propiedades del dispositivo, incluyendo metadatos. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Obtiene un valor de la propiedad de cadena. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Obtiene un valor de la propiedad de color. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Obtiene un valor de la propiedad de tipo double. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Obtiene un valor de la propiedad entera. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Obtiene un valor de la propiedad de márgenes. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Obtiene un valor de la propiedad de matriz. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Obtiene un valor de la propiedad de rectángulo. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Obtiene un valor de la propiedad de tamaño. |
| [getSaveOptions()](#getSaveOptions--) | Devuelve las opciones de guardado. |
| [getSize()](#getSize--) | Obtiene el tamaño de la página. |
| [getStroke()](#getStroke--) | Obtiene el trazo actual. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | Obtiene el modo de renderizado de texto actual. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Obtiene el ancho del trazo de texto actual. |
| [getTransform()](#getTransform--) | Obtiene la transformación actual. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Inicializa el recorte del dispositivo. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Obtiene un valor de la propiedad booleana. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | Rotar la matriz de transformación actual. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Rotar la matriz de transformación actual alrededor de un punto. |
| [scale(double x, double y)](#scale-double-double-) | Escala la matriz de transformación actual. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Especifica el fondo actual de la página. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Especifica la transformación de los caracteres. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Especifica el recorte del dispositivo. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Especifica el creador de la salida del dispositivo resultante. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Especifica una fuente. |
| [setOpacity(float opacity)](#setOpacity-float-) | Especifica la opacidad. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Especifica una máscara de opacidad. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Especifica una pintura. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Especifica las propiedades del dispositivo, incluyendo metadatos. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Especifica opciones para gestionar el proceso de renderizado. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Especifica un trazo. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Especifica el modo de renderizado de texto. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Especifica el ancho del trazo de texto. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Especifica la transformación actual. |
| [shear(double shx, double shy)](#shear-double-double-) | Sesga la matriz de transformación actual. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Transforma la matriz de transformación actual. |
| [translate(double x, double y)](#translate-double-double-) | Traslada la matriz de transformación actual. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Escribe un comentario. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Escribe una cadena con la fuente especificada. |
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


Versión actual del dispositivo.

### closePage() {#closePage--}
```
public void closePage()
```


Realiza la preparación necesaria del dispositivo después de que la página haya sido renderizada.

### create() {#create--}
```
public Device create()
```


Crea una copia de este dispositivo.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


Elimina el dispositivo.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Dibuja una ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ruta | java.awt.Shape | Una ruta a dibujar. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Dibuja un arco.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | float | Coordenada X del centro del arco. |
| y | float | Coordenada Y del centro del arco. |
| ancho | float | Un ancho del rectángulo circunscrito. |
| altura | float | Una altura del rectángulo circunscrito. |
| startAngle | float | Un ángulo inicial del arco. |
| arcAngle | float | Un ángulo del arco. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Dibuja una imagen con la transformación asignada y el fondo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imagen | java.awt.image.BufferedImage | Una imagen a dibujar. |
| transform | java.awt.geom.AffineTransform | Una transformación. |
| bkg | java.awt.Color | Un color de fondo. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Dibuja un segmento de línea.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x1 | float | Coordenada X del comienzo del segmento. |
| y1 | float | Coordenada Y del comienzo del segmento. |
| x2 | float | Coordenada X del final del segmento. |
| y2 | float | Coordenada Y del final del segmento. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Dibuja un óvalo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | float | Coordenada X del centro del óvalo. |
| y | float | Coordenada Y del centro del óvalo. |
| ancho | float | Un ancho del rectángulo circunscrito. |
| altura | float | Una altura del rectángulo circunscrito. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Dibuja un polígono.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| xPoints | float[] | Coordenadas X de los puntos. |
| yPoints | float[] | Coordenada Y de los puntos. |
| nPoints | int | El número de puntos. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Dibuja un polígono.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| xPoints | int[] | Coordenadas X de los puntos. |
| yPoints | int[] | Coordenada Y de los puntos. |
| nPoints | int | El número de puntos. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Dibuja una polilínea.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| xPoints | float[] | Coordenadas X de los puntos. |
| yPoints | float[] | Coordenada Y de los puntos. |
| nPoints | int | El número de puntos. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Dibuja una polilínea.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| xPoints | int[] | Coordenadas X de los puntos. |
| yPoints | int[] | Coordenada Y de los puntos. |
| nPoints | int | El número de puntos. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Dibuja un rectángulo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | float | Coordenada X de la esquina superior izquierda del rectángulo. |
| y | float | Coordenada Y de la esquina superior izquierda del rectángulo. |
| ancho | float | Un ancho del rectángulo. |
| altura | float | Una altura del rectángulo. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Dibuja un rectángulo redondeado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | float | Coordenada X de la esquina superior izquierda del rectángulo. |
| y | float | Coordenada Y de la esquina superior izquierda del rectángulo. |
| ancho | float | Un ancho del rectángulo. |
| altura | float | Una altura del rectángulo. |
| arcWidth | float | Un ancho del rectángulo circunscrito del arco que redondea un ángulo del rectángulo. |
| arcHeight | float | Una altura del rectángulo circunscrito del arco que redondea un ángulo del rectángulo. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Dibuja una cadena en el punto dado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Realiza la preparación necesaria del dispositivo después de que el documento ha sido renderizado.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Rellena una ruta.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ruta | java.awt.Shape | Una ruta a rellenar. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Rellena un arco.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | float | Coordenada X del centro del arco. |
| y | float | Coordenada Y del centro del arco. |
| ancho | float | Un ancho del rectángulo circunscrito. |
| altura | float | Una altura del rectángulo circunscrito. |
| startAngle | float | Un ángulo inicial del arco. |
| arcAngle | float | Un ángulo del arco. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Rellena un óvalo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | float | Coordenada X del centro del óvalo. |
| y | float | Coordenada Y del centro del óvalo. |
| ancho | float | Un ancho del rectángulo circunscrito. |
| altura | float | Una altura del rectángulo circunscrito. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Rellena un polígono.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| xPoints | float[] | Coordenadas X de los puntos. |
| yPoints | float[] | Coordenada Y de los puntos. |
| nPoints | int | El número de puntos. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Rellena un polígono.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| xPoints | int[] | Coordenadas X de los puntos. |
| yPoints | int[] | Coordenada Y de los puntos. |
| nPoints | int | El número de puntos. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Rellena un rectángulo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | float | Coordenada X de la esquina superior izquierda del rectángulo. |
| y | float | Coordenada Y de la esquina superior izquierda del rectángulo. |
| ancho | float | Un ancho del rectángulo. |
| altura | float | Una altura del rectángulo. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Dibuja un rectángulo redondeado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | float | Coordenada X de la esquina superior izquierda del rectángulo. |
| y | float | Coordenada Y de la esquina superior izquierda del rectángulo. |
| ancho | float | Un ancho del rectángulo. |
| altura | float | Una altura del rectángulo. |
| arcWidth | float | Un ancho del rectángulo circunscrito del arco que redondea un ángulo del rectángulo. |
| arcHeight | float | Una altura del rectángulo circunscrito del arco que redondea un ángulo del rectángulo. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Obtiene el fondo actual de la página.

**Returns:**
java.awt.Color - Fondo actual de la página
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Obtiene la transformación actual de los caracteres.

**Returns:**
java.awt.geom.AffineTransform - Transformación actual de los caracteres.
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


Obtiene el creador de la salida del dispositivo resultante.

**Returns:**
java.lang.String - Un valor creador.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Obtiene el número de página actual.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Obtiene la fuente actual.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Obtiene la opacidad actual.

**Returns:**
float - Opacidad actual.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Obtiene la máscara de opacidad actual.

**Returns:**
java.awt.Paint - Máscara de opacidad actual.
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


Obtiene la pintura actual.

**Returns:**
java.awt.Paint - Pintura actual.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Obtiene las propiedades del dispositivo, incluyendo metadatos.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Obtiene un valor de la propiedad de cadena.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.lang.String - El valor de la propiedad.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Obtiene un valor de la propiedad de color.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.awt.Color - El valor de la propiedad.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Obtiene un valor de la propiedad de tipo double.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
double - El valor de la propiedad.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Obtiene un valor de la propiedad entera.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
int - El valor de la propiedad.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Obtiene un valor de la propiedad de márgenes.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.awt.Insets - El valor de la propiedad.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Obtiene un valor de la propiedad de matriz.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.awt.geom.AffineTransform - El valor de la propiedad.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Obtiene un valor de la propiedad de rectángulo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.awt.Rectangle - El valor de la propiedad.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Obtiene un valor de la propiedad de tamaño.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
java.awt.Dimension - El valor de la propiedad.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Devuelve las opciones de guardado.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Obtiene el tamaño de la página.

**Returns:**
java.awt.Dimension - Tamaño de la página.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Obtiene el trazo actual.

**Returns:**
java.awt.Stroke - Trazo actual.
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Obtiene el modo de renderizado de texto actual.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Obtiene el ancho del trazo de texto actual.

**Returns:**
float - Ancho actual del trazo de texto.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Obtiene la transformación actual.

**Returns:**
java.awt.geom.AffineTransform - Transformación actual.
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


Inicializa el recorte del dispositivo.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Inicializa el número de páginas a renderizar.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Indica si el dispositivo usa modo RGB directo, es decir RGB.

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


Obtiene un valor de la propiedad booleana.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clave | java.lang.String | El nombre de la propiedad. |

**Returns:**
boolean - El valor de la propiedad.
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


Realiza la preparación necesaria del dispositivo antes del renderizado de la página.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| ancho | float |  |
| altura | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Realiza la preparación necesaria del dispositivo antes del renderizado de la página.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| título | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


Restablece el dispositivo al estado inicial para todo el documento. Se usa para restablecer el flujo de salida.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| documentoPrincipal | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Restablece el dispositivo al estado inicial para una página.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Rota la matriz de transformación actual. Llama a writeTransform(Transform). Rotar con un ángulo theta positivo rota los puntos del eje x positivo hacia el eje y positivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| theta | double | Ángulo en radianes sobre el cual rotar. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Rotar la matriz de transformación actual alrededor de un punto.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| theta | double | Un ángulo de rotación en radianes. |
| x | double | Coordenada X del punto. |
| y | double | Coordenada Y del punto. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Escala la matriz de transformación actual. Llama a writeTransform(Transform).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | double | Una escala en el eje X. |
| y | double | Una escala en el eje Y. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Especifica el fondo actual de la página.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fondo | java.awt.Color | Un fondo de la página. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Especifica la transformación de los caracteres.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421haracters transformación. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Especifica el recorte del dispositivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| clipPath | java.awt.Shape | Una ruta de recorte. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Especifica el creador de la salida del dispositivo resultante.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| creator | java.lang.String | Un valor de creador. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Especifica una fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Una fuente. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Especifica la opacidad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| opacity | float | Una opacidad. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Especifica una máscara de opacidad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| opacityMask | java.awt.Paint | Una máscara de opacidad. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Especifica una pintura.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| paint | java.awt.Paint | Una pintura. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Especifica las propiedades del dispositivo, incluyendo metadatos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Propiedades del dispositivo. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Especifica opciones para gestionar el proceso de renderizado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Opciones para gestionar el proceso de renderizado. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Especifica el tamaño de la página.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Especifica un trazo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| stroke | java.awt.Stroke | Un trazo. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Especifica el modo de renderizado de texto.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Modo de renderizado de texto. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Especifica el ancho del trazo de texto.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| textStrokeWidth | float | Ancho del trazo de texto. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Especifica la transformación actual.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Una transformación.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Corta la matriz de transformación actual. Llama a writeTransform(Transform).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| shx | double | Una cizalla en el eje X. |
| shy | double | Una cizalla en el eje Y. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Realiza la preparación necesaria del dispositivo antes de iniciar el renderizado del documento.

### toString() {#toString--}
```
public String toString()
```


Devuelve el nombre del tipo de dispositivo.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Transforma la matriz de transformación actual. Llama a writeTransform(Transform).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Transformación a aplicar. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Traslada la matriz de transformación actual. Llama a writeTransform(Transform).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | double | Traslación en el eje X. |
| y | double | Traslación en el eje Y. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Actualiza los parámetros de página desde otro dispositivo multipágina.

**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Escribe un comentario.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| comentario | java.lang.String | Un comentario a escribir. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Escribe una cadena con la fuente especificada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Fuente especificada. |
| str | java.lang.String | La cadena. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| advertencia | java.lang.String |  |

