---
title: "TextDevice"
second_title: "Αναφορά API του Aspose.Page για Java"
description: 
type: docs
weight: 13
url: /el/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | Τρέχουσα έκδοση συσκευής. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | Σχεδιάζει μια διαδρομή. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Σχεδιάζει ένα τόξο. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Σχεδιάζει μια εικόνα με την καθορισμένη μετασχηματισμό και φόντο. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Σχεδιάζει ένα τμήμα γραμμής. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Σχεδιάζει ένα ωοειδές. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Σχεδιάζει ένα πολύγωνο. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Σχεδιάζει ένα πολύγωνο. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Σχεδιάζει μια πολυγραμμή. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Σχεδιάζει μια πολυγραμμή. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Σχεδιάζει ένα ορθογώνιο. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Σχεδιάζει ένα στρογγυλεμένο ορθογώνιο. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Γεμίζει ένα μονοπάτι. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Γεμίζει ένα τόξο. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Γεμίζει ένα οβάλ. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Γεμίζει ένα πολύγωνο. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Γεμίζει ένα πολύγωνο. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Γεμίζει ένα ορθογώνιο. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Σχεδιάζει ένα στρογγυλεμένο ορθογώνιο. |
| [getBackground()](#getBackground--) | Λαμβάνει το τρέχον φόντο της σελίδας. |
| [getCharTM()](#getCharTM--) | Λαμβάνει τη μετατροπή των τρεχόντων χαρακτήρων. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Λαμβάνει τον δημιουργό της τελικής εξόδου της συσκευής. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | Λαμβάνει τη τρέχουσα γραμματοσειρά. |
| [getOpacity()](#getOpacity--) | Λαμβάνει τη τρέχουσα αδιαφάνεια. |
| [getOpacityMask()](#getOpacityMask--) | Λαμβάνει τη τρέχουσα μάσκα αδιαφάνειας. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | Λαμβάνει το τρέχον χρώμα. |
| [getProperties()](#getProperties--) | Λαμβάνει τις ιδιότητες της συσκευής, συμπεριλαμβανομένων των μεταδεδομένων. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Λαμβάνει μια τιμή ιδιότητας τύπου συμβολοσειράς. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Λαμβάνει μια τιμή ιδιότητας χρώματος. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Λαμβάνει μια τιμή ιδιότητας τύπου double. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Λαμβάνει μια τιμή ιδιότητας τύπου ακέραιου. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Λαμβάνει μια τιμή ιδιότητας περιθωρίων. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Λαμβάνει μια τιμή ιδιότητας πίνακα. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Λαμβάνει μια τιμή ιδιότητας ορθογωνίου. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Λαμβάνει μια τιμή ιδιότητας μεγέθους. |
| [getSaveOptions()](#getSaveOptions--) | Επιστρέφει τις επιλογές αποθήκευσης. |
| [getSize()](#getSize--) | Λαμβάνει το μέγεθος της σελίδας. |
| [getStroke()](#getStroke--) | Λαμβάνει το τρέχον στίγμα. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | Λαμβάνει την τρέχουσα λειτουργία απόδοσης κειμένου. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Λαμβάνει το τρέχον πλάτος γραμμής κειμένου. |
| [getTransform()](#getTransform--) | Λαμβάνει τον τρέχοντα μετασχηματισμό. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Αρχικοποιεί το κλιπ της συσκευής. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Λαμβάνει μια τιμή ιδιότητας boolean. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | Περιστρέφει τον τρέχοντα πίνακα μετασχηματισμού. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Περιστρέφει τον τρέχοντα πίνακα μετασχηματισμού γύρω από ένα σημείο. |
| [scale(double x, double y)](#scale-double-double-) | Κλιμακώνει τον τρέχοντα πίνακα μετασχηματισμού. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Καθορίζει το τρέχον φόντο της σελίδας. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Καθορίζει τον μετασχηματισμό χαρακτήρων. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Καθορίζει το κλιπ της συσκευής. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Καθορίζει τον δημιουργό του τελικού εξόδου της συσκευής. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Καθορίζει μια γραμματοσειρά. |
| [setOpacity(float opacity)](#setOpacity-float-) | Καθορίζει τη διαφάνεια. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Καθορίζει μια μάσκα διαφάνειας. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Καθορίζει ένα χρώμα. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Καθορίζει τις ιδιότητες της συσκευής, συμπεριλαμβανομένων των μεταδεδομένων. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Καθορίζει επιλογές για τη διαχείριση της διαδικασίας απόδοσης. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Καθορίζει μια γραμμή. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Καθορίζει τη λειτουργία απόδοσης κειμένου. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Καθορίζει το πλάτος γραμμής κειμένου. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Καθορίζει τον τρέχοντα μετασχηματισμό. |
| [shear(double shx, double shy)](#shear-double-double-) | Κλίνει τον τρέχοντα πίνακα μετασχηματισμού. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Μετασχηματίζει τον τρέχοντα πίνακα μετασχηματισμού. |
| [translate(double x, double y)](#translate-double-double-) | Μετατοπίζει τον τρέχοντα πίνακα μετασχηματισμού. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Γράφει ένα σχόλιο. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Γράφει συμβολοσειρά με καθορισμένη γραμματοσειρά. |
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


Τρέχουσα έκδοση συσκευής.

### closePage() {#closePage--}
```
public void closePage()
```


Κάνει τις απαραίτητες προετοιμασίες της συσκευής μετά την απόδοση της σελίδας.

### create() {#create--}
```
public Device create()
```


Δημιουργεί ένα αντίγραφο αυτής της συσκευής.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


Αποδεσμεύει τη συσκευή.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Σχεδιάζει μια διαδρομή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | java.awt.Shape | Μια διαδρομή προς σχεδίαση. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Σχεδιάζει ένα τόξο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | float | Συντεταγμένη X του κέντρου της τόξου. |
| y | float | Συντεταγμένη Y του κέντρου της τόξου. |
| width | float | Πλάτος του περιγεγραμμένου ορθογωνίου. |
| height | float | Ύψος του περιγεγραμμένου ορθογωνίου. |
| startAngle | float | Αρχική γωνία της τόξου. |
| arcAngle | float | Γωνία της τόξου. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Σχεδιάζει μια εικόνα με την καθορισμένη μετασχηματισμό και φόντο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Μια εικόνα προς σχεδίαση. |
| transform | java.awt.geom.AffineTransform | Ένας μετασχηματισμός. |
| bkg | java.awt.Color | Ένα χρώμα φόντου. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Σχεδιάζει ένα τμήμα γραμμής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x1 | float | Συντεταγμένη X της αρχής του τμήματος. |
| y1 | float | Συντεταγμένη Y της αρχής του τμήματος. |
| x2 | float | Συντεταγμένη X του τέλους του τμήματος. |
| y2 | float | Συντεταγμένη Y του τέλους του τμήματος. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Σχεδιάζει ένα ωοειδές.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | float | Συντεταγμένη X του κέντρου του ωοειδούς. |
| y | float | Συντεταγμένη Y του κέντρου του ωοειδούς. |
| width | float | Πλάτος του περιγεγραμμένου ορθογωνίου. |
| height | float | Ύψος του περιγεγραμμένου ορθογωνίου. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Σχεδιάζει ένα πολύγωνο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| xPoints | float[] | Συντεταγμένες X των σημείων. |
| yPoints | float[] | Συντεταγμένη Y των σημείων. |
| nPoints | int | Ο αριθμός των σημείων. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Σχεδιάζει ένα πολύγωνο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| xPoints | int[] | Συντεταγμένες X των σημείων. |
| yPoints | int[] | Συντεταγμένη Y των σημείων. |
| nPoints | int | Ο αριθμός των σημείων. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Σχεδιάζει μια πολυγραμμή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| xPoints | float[] | Συντεταγμένες X των σημείων. |
| yPoints | float[] | Συντεταγμένη Y των σημείων. |
| nPoints | int | Ο αριθμός των σημείων. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Σχεδιάζει μια πολυγραμμή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| xPoints | int[] | Συντεταγμένες X των σημείων. |
| yPoints | int[] | Συντεταγμένη Y των σημείων. |
| nPoints | int | Ο αριθμός των σημείων. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Σχεδιάζει ένα ορθογώνιο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | float | Συντεταγμένη X του επάνω αριστερού γωνιακού σημείου του ορθογωνίου. |
| y | float | Συντεταγμένη Y του επάνω αριστερού γωνιακού σημείου του ορθογωνίου. |
| width | float | Πλάτος του ορθογωνίου. |
| height | float | Ύψος του ορθογωνίου. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Σχεδιάζει ένα στρογγυλεμένο ορθογώνιο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | float | Συντεταγμένη X του επάνω αριστερού γωνιακού σημείου του ορθογωνίου. |
| y | float | Συντεταγμένη Y του επάνω αριστερού γωνιακού σημείου του ορθογωνίου. |
| width | float | Πλάτος του ορθογωνίου. |
| height | float | Ύψος του ορθογωνίου. |
| arcWidth | float | Πλάτος του περιγεγραμμένου ορθογωνίου της τόξου που στρογγυλοποιεί μια γωνία του ορθογωνίου. |
| arcHeight | float | Ύψος του περιγεγραμμένου ορθογωνίου της τόξου που στρογγυλοποιεί μια γωνία του ορθογωνίου. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Σχεδιάζει μια συμβολοσειρά στο δοσμένο σημείο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Κάνει τις απαραίτητες προετοιμασίες της συσκευής μετά την απόδοση του εγγράφου.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Γεμίζει ένα μονοπάτι.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | java.awt.Shape | Διαδρομή που θα γεμίσει. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Γεμίζει ένα τόξο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | float | Συντεταγμένη X του κέντρου της τόξου. |
| y | float | Συντεταγμένη Y του κέντρου της τόξου. |
| width | float | Πλάτος του περιγεγραμμένου ορθογωνίου. |
| height | float | Ύψος του περιγεγραμμένου ορθογωνίου. |
| startAngle | float | Αρχική γωνία της τόξου. |
| arcAngle | float | Γωνία της τόξου. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Γεμίζει ένα οβάλ.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | float | Συντεταγμένη X του κέντρου του ωοειδούς. |
| y | float | Συντεταγμένη Y του κέντρου του ωοειδούς. |
| width | float | Πλάτος του περιγεγραμμένου ορθογωνίου. |
| height | float | Ύψος του περιγεγραμμένου ορθογωνίου. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Γεμίζει ένα πολύγωνο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| xPoints | float[] | Συντεταγμένες X των σημείων. |
| yPoints | float[] | Συντεταγμένη Y των σημείων. |
| nPoints | int | Ο αριθμός των σημείων. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Γεμίζει ένα πολύγωνο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| xPoints | int[] | Συντεταγμένες X των σημείων. |
| yPoints | int[] | Συντεταγμένη Y των σημείων. |
| nPoints | int | Ο αριθμός των σημείων. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Γεμίζει ένα ορθογώνιο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | float | Συντεταγμένη X του επάνω αριστερού γωνιακού σημείου του ορθογωνίου. |
| y | float | Συντεταγμένη Y του επάνω αριστερού γωνιακού σημείου του ορθογωνίου. |
| width | float | Πλάτος του ορθογωνίου. |
| height | float | Ύψος του ορθογωνίου. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Σχεδιάζει ένα στρογγυλεμένο ορθογώνιο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | float | Συντεταγμένη X του επάνω αριστερού γωνιακού σημείου του ορθογωνίου. |
| y | float | Συντεταγμένη Y του επάνω αριστερού γωνιακού σημείου του ορθογωνίου. |
| width | float | Πλάτος του ορθογωνίου. |
| height | float | Ύψος του ορθογωνίου. |
| arcWidth | float | Πλάτος του περιγεγραμμένου ορθογωνίου της τόξου που στρογγυλοποιεί μια γωνία του ορθογωνίου. |
| arcHeight | float | Ύψος του περιγεγραμμένου ορθογωνίου της τόξου που στρογγυλοποιεί μια γωνία του ορθογωνίου. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Λαμβάνει το τρέχον φόντο της σελίδας.

**Returns:**
java.awt.Color - Τρέχον φόντο της σελίδας
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Λαμβάνει τη μετατροπή των τρεχόντων χαρακτήρων.

**Returns:**
java.awt.geom.AffineTransform - Τρέχων μετασχηματισμός χαρακτήρων.
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


Λαμβάνει τον δημιουργό της τελικής εξόδου της συσκευής.

**Returns:**
java.lang.String - Μια τιμή δημιουργού.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Λαμβάνει τον τρέχον αριθμό σελίδας.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Λαμβάνει τη τρέχουσα γραμματοσειρά.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Λαμβάνει τη τρέχουσα αδιαφάνεια.

**Returns:**
float - Τρέχουσα αδιαφάνεια.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Λαμβάνει τη τρέχουσα μάσκα αδιαφάνειας.

**Returns:**
java.awt.Paint - Τρέχουσα μάσκα αδιαφάνειας.
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


Λαμβάνει το τρέχον χρώμα.

**Returns:**
java.awt.Paint - Τρέχον χρώμα.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Λαμβάνει τις ιδιότητες της συσκευής, συμπεριλαμβανομένων των μεταδεδομένων.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Λαμβάνει μια τιμή ιδιότητας τύπου συμβολοσειράς.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κλειδί | java.lang.String | Το όνομα της ιδιότητας. |

**Returns:**
java.lang.String - Τιμή ιδιότητας.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Λαμβάνει μια τιμή ιδιότητας χρώματος.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κλειδί | java.lang.String | Το όνομα της ιδιότητας. |

**Returns:**
java.awt.Color - Τιμή ιδιότητας.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Λαμβάνει μια τιμή ιδιότητας τύπου double.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κλειδί | java.lang.String | Το όνομα της ιδιότητας. |

**Returns:**
double - Τιμή ιδιότητας.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Λαμβάνει μια τιμή ιδιότητας τύπου ακέραιου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κλειδί | java.lang.String | Το όνομα της ιδιότητας. |

**Returns:**
int - Τιμή ιδιότητας.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Λαμβάνει μια τιμή ιδιότητας περιθωρίων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κλειδί | java.lang.String | Το όνομα της ιδιότητας. |

**Returns:**
java.awt.Insets - Τιμή ιδιότητας.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Λαμβάνει μια τιμή ιδιότητας πίνακα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κλειδί | java.lang.String | Το όνομα της ιδιότητας. |

**Returns:**
java.awt.geom.AffineTransform - Τιμή ιδιότητας.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Λαμβάνει μια τιμή ιδιότητας ορθογωνίου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κλειδί | java.lang.String | Το όνομα της ιδιότητας. |

**Returns:**
java.awt.Rectangle - Τιμή ιδιότητας.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Λαμβάνει μια τιμή ιδιότητας μεγέθους.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κλειδί | java.lang.String | Το όνομα της ιδιότητας. |

**Returns:**
java.awt.Dimension - Τιμή ιδιότητας.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Επιστρέφει τις επιλογές αποθήκευσης.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Λαμβάνει το μέγεθος της σελίδας.

**Returns:**
java.awt.Dimension - Μέγεθος σελίδας.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Λαμβάνει το τρέχον στίγμα.

**Returns:**
java.awt.Stroke - Τρέχουσα γραμμή.
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
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Λαμβάνει την τρέχουσα λειτουργία απόδοσης κειμένου.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Λαμβάνει το τρέχον πλάτος γραμμής κειμένου.

**Returns:**
float - Τρέχον πλάτος γραμμής κειμένου.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Λαμβάνει τον τρέχοντα μετασχηματισμό.

**Returns:**
java.awt.geom.AffineTransform - Τρέχων μετασχηματισμός.
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


Αρχικοποιεί το κλιπ της συσκευής.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Αρχικοποιεί τον αριθμό των σελίδων προς απόδοση.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Δείχνει εάν η συσκευή χρησιμοποιεί άμεση λειτουργία RGB, δηλαδή RGB.

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


Λαμβάνει μια τιμή ιδιότητας boolean.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κλειδί | java.lang.String | Το όνομα της ιδιότητας. |

**Returns:**
boolean - Τιμή ιδιότητας.
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


Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από την απόδοση της σελίδας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | float |  |
| height | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Κάνει την απαραίτητη προετοιμασία της συσκευής πριν από την απόδοση της σελίδας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τίτλος | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


Επαναφορά της συσκευής στην αρχική κατάσταση για ολόκληρο το έγγραφο. Χρησιμοποιείται για την επαναφορά της ροής εξόδου.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Επαναφορά της συσκευής στην αρχική κατάσταση για μια σελίδα.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Περιστρέψτε τον τρέχοντα πίνακα μετασχηματισμού. Καλεί τη writeTransform(Transform). Η περιστροφή με θετική γωνία θ περιστρέφει τα σημεία στον θετικό άξονα x προς τον θετικό άξονα y.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| theta | double | Γωνία σε ακτίνια κατά την οποία θα περιστραφεί. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Περιστρέφει τον τρέχοντα πίνακα μετασχηματισμού γύρω από ένα σημείο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| theta | double | Μια γωνία περιστροφής σε ακτίνια. |
| x | double | Συντεταγμένη X του σημείου. |
| y | double | Συντεταγμένη Y του σημείου. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Κλιμακώνει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί writeTransform(Transform).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | double | Κλίμακα στον άξονα X. |
| y | double | Κλίμακα στον άξονα Y. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Καθορίζει το τρέχον φόντο της σελίδας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| υπόβαθρο | java.awt.Color | Ένα υπόβαθρο της σελίδας. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Καθορίζει τον μετασχηματισμό χαρακτήρων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421haracters μετασχηματισμός. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Καθορίζει το κλιπ της συσκευής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| clipPath | java.awt.Shape | Μια διαδρομή αποκοπής. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Καθορίζει τον δημιουργό του τελικού εξόδου της συσκευής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δημιουργός | java.lang.String | Μια τιμή δημιουργού. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Καθορίζει μια γραμματοσειρά.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Μια γραμματοσειρά. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Καθορίζει τη διαφάνεια.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| διαφάνεια | float | Μια διαφάνεια. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Καθορίζει μια μάσκα διαφάνειας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| opacityMask | java.awt.Paint | Μια μάσκα διαφάνειας. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Καθορίζει ένα χρώμα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| paint | java.awt.Paint | Μια βαφή. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Καθορίζει τις ιδιότητες της συσκευής, συμπεριλαμβανομένων των μεταδεδομένων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Ιδιότητες συσκευής. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Καθορίζει επιλογές για τη διαχείριση της διαδικασίας απόδοσης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Επιλογές για τη διαχείριση της διαδικασίας απόδοσης. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Καθορίζει το μέγεθος της σελίδας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| μέγεθος | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Καθορίζει μια γραμμή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stroke | java.awt.Stroke | Μια γραμμή. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Καθορίζει τη λειτουργία απόδοσης κειμένου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Λειτουργία απόδοσης κειμένου. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Καθορίζει το πλάτος γραμμής κειμένου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| textStrokeWidth | float | Πλάτος γραμμής κειμένου. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Καθορίζει τον τρέχοντα μετασχηματισμό.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Ένας μετασχηματισμός.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Κόβει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί τη writeTransform(Transform).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| shx | double | Κόψιμο στον άξονα X. |
| shy | double | Κόψιμο στον άξονα Y. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Κάνει τις απαραίτητες προετοιμασίες της συσκευής πριν ξεκινήσει η απόδοση του εγγράφου.

### toString() {#toString--}
```
public String toString()
```


Επιστρέφει το όνομα του τύπου συσκευής.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Μετασχηματίζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί τη writeTransform(Transform).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Μετασχηματισμός προς εφαρμογή. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Μετατοπίζει τον τρέχοντα πίνακα μετασχηματισμού. Καλεί τη writeTransform(Transform).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | double | Μετατόπιση στον άξονα X. |
| y | double | Μετατόπιση στον άξονα Y. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Ενημερώνει τις παραμέτρους σελίδας από άλλη πολυσελιδική συσκευή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
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
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Γράφει ένα σχόλιο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| σχόλιο | java.lang.String | Ένα σχόλιο προς εγγραφή. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Γράφει συμβολοσειρά με καθορισμένη γραμματοσειρά.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Καθορισμένη γραμματοσειρά. |
| str | java.lang.String | Η συμβολοσειρά. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| προειδοποίηση | java.lang.String |  |

