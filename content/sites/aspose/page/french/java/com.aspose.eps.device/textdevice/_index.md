---
title: "TextDevice"
second_title: "Référence API Aspose.Page pour Java"
description: 
type: docs
weight: 13
url: /fr/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## Champs

| Champ | Description |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | Version actuelle du dispositif. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | Dessine un chemin. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Dessine un arc. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Dessine une image avec la transformation assignée et l'arrière-plan. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Dessine un segment de ligne. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Dessine un ovale. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Dessine un polygone. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Dessine un polygone. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Dessine une polyligne. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Dessine une polyligne. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Dessine un rectangle. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Dessine un rectangle arrondi. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Remplit un chemin. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Remplit un arc. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Remplit une ellipse. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Remplit un polygone. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Remplit un polygone. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Remplit un rectangle. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Dessine un rectangle arrondi. |
| [getBackground()](#getBackground--) | Obtient l'arrière-plan actuel de la page. |
| [getCharTM()](#getCharTM--) | Obtient la transformation actuelle des caractères. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Obtient le créateur de la sortie du dispositif résultant. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | Obtient la police actuelle. |
| [getOpacity()](#getOpacity--) | Obtient l'opacité actuelle. |
| [getOpacityMask()](#getOpacityMask--) | Obtient le masque d'opacité actuel. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | Obtient la peinture actuelle. |
| [getProperties()](#getProperties--) | Obtient les propriétés du dispositif, y compris les métadonnées. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Obtient une valeur d'une propriété de chaîne. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Obtient une valeur d'une propriété de couleur. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Obtient une valeur d'une propriété double. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Obtient une valeur d'une propriété entière. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Obtient une valeur d'une propriété de marges. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Obtient une valeur d'une propriété de matrice. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Obtient une valeur d'une propriété de rectangle. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Obtient une valeur d'une propriété de taille. |
| [getSaveOptions()](#getSaveOptions--) | Renvoie les options d'enregistrement. |
| [getSize()](#getSize--) | Obtient la taille de la page. |
| [getStroke()](#getStroke--) | Obtient le trait actuel. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | Obtient le mode de rendu du texte actuel. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Obtient la largeur du trait du texte actuel. |
| [getTransform()](#getTransform--) | Obtient la transformation actuelle. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Initialise le découpage du dispositif. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Obtient la valeur d'une propriété booléenne. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | Faire pivoter la matrice de transformation actuelle. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Faire pivoter la matrice de transformation actuelle autour d'un point. |
| [scale(double x, double y)](#scale-double-double-) | Met à l'échelle la matrice de transformation actuelle. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Spécifie l'arrière-plan actuel de la page. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Spécifie la transformation des caractères. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Spécifie le découpage du dispositif. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Spécifie le créateur de la sortie du dispositif résultant. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Spécifie une police. |
| [setOpacity(float opacity)](#setOpacity-float-) | Spécifie l'opacité. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Spécifie un masque d'opacité. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Spécifie une peinture. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Spécifie les propriétés du dispositif, y compris les métadonnées. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Spécifie les options de gestion du processus de rendu. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Spécifie un trait. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Spécifie le mode de rendu du texte. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Spécifie la largeur du trait du texte. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Spécifie la transformation actuelle. |
| [shear(double shx, double shy)](#shear-double-double-) | Cisa la matrice de transformation actuelle. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Transforme la matrice de transformation actuelle. |
| [translate(double x, double y)](#translate-double-double-) | Translater la matrice de transformation actuelle. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Écrit un commentaire. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Écrit une chaîne avec la police spécifiée. |
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


Version actuelle du dispositif.

### closePage() {#closePage--}
```
public void closePage()
```


Effectue les préparations nécessaires de l'appareil après le rendu de la page.

### create() {#create--}
```
public Device create()
```


Crée une copie de cet appareil.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


Libère l'appareil.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Dessine un chemin.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | Un chemin à dessiner. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Dessine un arc.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | float | Coordonnée X du centre de l'arc. |
| y | float | Coordonnée Y du centre de l'arc. |
| largeur | float | Une largeur du rectangle circonscrit. |
| hauteur | float | Une hauteur du rectangle circonscrit. |
| startAngle | float | Un angle de départ de l'arc. |
| arcAngle | float | Un angle de l'arc. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Dessine une image avec la transformation assignée et l'arrière-plan.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Une image à dessiner. |
| transform | java.awt.geom.AffineTransform | Une transformation. |
| bkg | java.awt.Color | Une couleur d'arrière-plan. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Dessine un segment de ligne.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x1 | float | Coordonnée X du début du segment. |
| y1 | float | Coordonnée Y du début du segment. |
| x2 | float | Coordonnée X de la fin du segment. |
| y2 | float | Coordonnée Y de la fin du segment. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Dessine un ovale.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | float | Coordonnée X du centre de l'ovale. |
| y | float | Coordonnée Y du centre de l'ovale. |
| largeur | float | Une largeur du rectangle circonscrit. |
| hauteur | float | Une hauteur du rectangle circonscrit. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Dessine un polygone.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| xPoints | float[] | Coordonnées X des points. |
| yPoints | float[] | Coordonnée Y des points. |
| nPoints | int | Le nombre de points. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Dessine un polygone.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| xPoints | int[] | Coordonnées X des points. |
| yPoints | int[] | Coordonnée Y des points. |
| nPoints | int | Le nombre de points. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Dessine une polyligne.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| xPoints | float[] | Coordonnées X des points. |
| yPoints | float[] | Coordonnée Y des points. |
| nPoints | int | Le nombre de points. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Dessine une polyligne.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| xPoints | int[] | Coordonnées X des points. |
| yPoints | int[] | Coordonnée Y des points. |
| nPoints | int | Le nombre de points. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Dessine un rectangle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | float | Coordonnée X du coin supérieur gauche du rectangle. |
| y | float | Coordonnée Y du coin supérieur gauche du rectangle. |
| largeur | float | La largeur du rectangle. |
| hauteur | float | La hauteur du rectangle. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Dessine un rectangle arrondi.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | float | Coordonnée X du coin supérieur gauche du rectangle. |
| y | float | Coordonnée Y du coin supérieur gauche du rectangle. |
| largeur | float | La largeur du rectangle. |
| hauteur | float | La hauteur du rectangle. |
| arcWidth | float | La largeur du rectangle circonscrit à l'arc qui arrondit un angle du rectangle. |
| arcHeight | float | La hauteur du rectangle circonscrit à l'arc qui arrondit un angle du rectangle. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Dessine une chaîne au point donné.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Effectue les préparations nécessaires de l'appareil après le rendu du document.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Remplit un chemin.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| path | java.awt.Shape | Un chemin à remplir. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Remplit un arc.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | float | Coordonnée X du centre de l'arc. |
| y | float | Coordonnée Y du centre de l'arc. |
| largeur | float | Une largeur du rectangle circonscrit. |
| hauteur | float | Une hauteur du rectangle circonscrit. |
| startAngle | float | Un angle de départ de l'arc. |
| arcAngle | float | Un angle de l'arc. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Remplit une ellipse.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | float | Coordonnée X du centre de l'ovale. |
| y | float | Coordonnée Y du centre de l'ovale. |
| largeur | float | Une largeur du rectangle circonscrit. |
| hauteur | float | Une hauteur du rectangle circonscrit. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Remplit un polygone.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| xPoints | float[] | Coordonnées X des points. |
| yPoints | float[] | Coordonnée Y des points. |
| nPoints | int | Le nombre de points. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Remplit un polygone.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| xPoints | int[] | Coordonnées X des points. |
| yPoints | int[] | Coordonnée Y des points. |
| nPoints | int | Le nombre de points. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Remplit un rectangle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | float | Coordonnée X du coin supérieur gauche du rectangle. |
| y | float | Coordonnée Y du coin supérieur gauche du rectangle. |
| largeur | float | La largeur du rectangle. |
| hauteur | float | La hauteur du rectangle. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Dessine un rectangle arrondi.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | float | Coordonnée X du coin supérieur gauche du rectangle. |
| y | float | Coordonnée Y du coin supérieur gauche du rectangle. |
| largeur | float | La largeur du rectangle. |
| hauteur | float | La hauteur du rectangle. |
| arcWidth | float | La largeur du rectangle circonscrit à l'arc qui arrondit un angle du rectangle. |
| arcHeight | float | La hauteur du rectangle circonscrit à l'arc qui arrondit un angle du rectangle. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Obtient l'arrière-plan actuel de la page.

**Returns:**
java.awt.Color - Arrière-plan actuel de la page
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Obtient la transformation actuelle des caractères.

**Returns:**
java.awt.geom.AffineTransform - Transformation actuelle des caractères.
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


Obtient le créateur de la sortie du dispositif résultant.

**Returns:**
java.lang.String - Une valeur de créateur.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Obtient le numéro de page actuel.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Obtient la police actuelle.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Obtient l'opacité actuelle.

**Returns:**
float - Opacité actuelle.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Obtient le masque d'opacité actuel.

**Returns:**
java.awt.Paint - Masque d'opacité actuel.
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


Obtient la peinture actuelle.

**Returns:**
java.awt.Paint - Peinture actuelle.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Obtient les propriétés du dispositif, y compris les métadonnées.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Obtient une valeur d'une propriété de chaîne.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.lang.String - La valeur de la propriété.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Obtient une valeur d'une propriété de couleur.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.awt.Color - La valeur de la propriété.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Obtient une valeur d'une propriété double.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
double - La valeur de la propriété.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Obtient une valeur d'une propriété entière.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
int - La valeur de la propriété.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Obtient une valeur d'une propriété de marges.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.awt.Insets - La valeur de la propriété.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Obtient une valeur d'une propriété de matrice.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.awt.geom.AffineTransform - La valeur de la propriété.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Obtient une valeur d'une propriété de rectangle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.awt.Rectangle - La valeur de la propriété.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Obtient une valeur d'une propriété de taille.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
java.awt.Dimension - La valeur de la propriété.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Renvoie les options d'enregistrement.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Obtient la taille de la page.

**Returns:**
java.awt.Dimension - Taille de la page.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Obtient le trait actuel.

**Returns:**
java.awt.Stroke - Trait actuel.
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
| Paramètre | Type | Description |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Obtient le mode de rendu du texte actuel.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Obtient la largeur du trait du texte actuel.

**Returns:**
float - Largeur actuelle du trait du texte.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Obtient la transformation actuelle.

**Returns:**
java.awt.geom.AffineTransform - Transformation actuelle.
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


Initialise le découpage du dispositif.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Initialise le nombre de pages à rendre.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Indique si l'appareil utilise le mode RGB direct, c'est-à-dire RGB.

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


Obtient la valeur d'une propriété booléenne.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clé | java.lang.String | Le nom de la propriété. |

**Returns:**
boolean - La valeur de la propriété.
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


Effectue la préparation nécessaire de l'appareil avant le rendu de la page.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| largeur | float |  |
| hauteur | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Effectue la préparation nécessaire de l'appareil avant le rendu de la page.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| titre | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


Réinitialise l'appareil à son état initial pour l'ensemble du document. Utilisé pour réinitialiser le flux de sortie.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Réinitialise l'appareil à son état initial pour une page.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Faire pivoter la matrice de transformation actuelle. Appelle writeTransform(Transform). Faire pivoter avec un angle positif theta fait tourner les points de l'axe x positif vers l'axe y positif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| theta | double | Angle en radians sur lequel pivoter. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Faire pivoter la matrice de transformation actuelle autour d'un point.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| theta | double | Un angle de rotation en radians. |
| x | double | Coordonnée X du point. |
| y | double | Coordonnée Y du point. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Met à l'échelle la matrice de transformation actuelle. Appelle writeTransform(Transform).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | double | Une échelle sur l'axe X. |
| y | double | Une échelle sur l'axe Y. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Spécifie l'arrière-plan actuel de la page.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arrière-plan | java.awt.Color | Un arrière-plan de la page. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Spécifie la transformation des caractères.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421haracters transformée des caractères. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Spécifie le découpage du dispositif.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| clipPath | java.awt.Shape | Un chemin de découpe. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Spécifie le créateur de la sortie du dispositif résultant.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| créateur | java.lang.String | Une valeur de créateur. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Spécifie une police.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Une police. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Spécifie l'opacité.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| opacité | float | Une opacité. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Spécifie un masque d'opacité.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| opacityMask | java.awt.Paint | Un masque d'opacité. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Spécifie une peinture.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| paint | java.awt.Paint | Une peinture. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Spécifie les propriétés du dispositif, y compris les métadonnées.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Propriétés de l'appareil. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Spécifie les options de gestion du processus de rendu.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Options pour gérer le processus de rendu. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Spécifie la taille de la page.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Spécifie un trait.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| stroke | java.awt.Stroke | Un trait. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Spécifie le mode de rendu du texte.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Mode de rendu du texte. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Spécifie la largeur du trait du texte.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| textStrokeWidth | float | Largeur du trait de texte. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Spécifie la transformation actuelle.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Une transformation.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Applique un cisaillement à la matrice de transformation actuelle. Appelle writeTransform(Transform).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| shx | double | Un cisaillement sur l'axe X. |
| shy | double | Un cisaillement sur l'axe Y. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Effectue les préparations nécessaires de l'appareil avant de commencer le rendu du document.

### toString() {#toString--}
```
public String toString()
```


Renvoie le nom du type d'appareil.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Transforme la matrice de transformation actuelle. Appelle writeTransform(Transform).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Transformation à appliquer. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Effectue une translation de la matrice de transformation actuelle. Appelle writeTransform(Transform).

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| x | double | Translation sur l'axe X. |
| y | double | Translation sur l'axe Y. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Met à jour les paramètres de page à partir d'un autre appareil multipage.

**Parameters:**
| Paramètre | Type | Description |
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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Écrit un commentaire.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| commentaire | java.lang.String | Un commentaire à écrire. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Écrit une chaîne avec la police spécifiée.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Police spécifiée. |
| str | java.lang.String | La chaîne. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| avertissement | java.lang.String |  |

