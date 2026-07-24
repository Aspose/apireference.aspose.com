---
title: "PageAPI"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Το API τροποποίησης στοιχείου Page."
type: docs
weight: 12
url: /el/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

Το API τροποποίησης στοιχείου **Page**.
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Προσθέτει ένα στοιχείο περιεχομένου (Canvas, Path ή Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Εισάγει ένα στοιχείο (Canvas, Path ή Glyphs) στη σελίδα στη θέση του δείκτη. |
| [<T>remove(T element)](#-T-remove-T-) | Αφαιρεί ένα στοιχείο από τη σελίδα. |
| [addCanvas()](#addCanvas--) | Προσθέτει ένα νέο καμβά στη σελίδα. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Προσθέτει νέα glyphs στη σελίδα. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Προσθέτει νέα glyphs στη σελίδα. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Προσθέτει μια καταχώρηση περιγράμματος στο έγγραφο. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Προσθέτει ένα νέο path στη σελίδα. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Δημιουργεί ένα νέο τμηματικό έλλειπτικό τόξο με περίγραμμα. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Δημιουργεί ένα νέο τμηματικό έλλειπτικό τόξο. |
| [createCanvas()](#createCanvas--) | Δημιουργεί ένα νέο καμβά. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο βασισμένο στο ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Δημιουργεί ένα νέο χρώμα. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο βασισμένο στο ICC. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Δημιουργεί νέα glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Δημιουργεί νέα glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Δημιουργεί ένα νέο σημείο διαβάθμισης. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Δημιουργεί ένα νέο σημείο διαβάθμισης. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Δημιουργεί ένα νέο πινέλο εικόνας. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Δημιουργεί ένα νέο πινέλο εικόνας. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Δημιουργεί ένα νέο γραμμικό πινέλο διαβάθμισης. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Δημιουργεί ένα νέο γραμμικό πινέλο διαβάθμισης. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Δημιουργεί έναν νέο πίνακα αφινικού μετασχηματισμού. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Δημιουργεί ένα νέο path. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Δημιουργεί μια νέα ανοιχτή μορφή path. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Δημιουργεί μια νέα μορφή path. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Δημιουργεί μια νέα ανοιχτή μορφή path. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Δημιουργεί μια νέα μορφή path. |
| [createPathGeometry()](#createPathGeometry--) | Δημιουργεί μια νέα γεωμετρία path. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Δημιουργεί μια νέα γεωμετρία διαδρομής που καθορίζεται με σύντομη μορφή. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Δημιουργεί μια νέα γεωμετρία διαδρομής με καθορισμένη λίστα σχημάτων διαδρομής. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Δημιουργεί ένα νέο σύνολο σχεδιασμένων κυβικών καμπυλών B?zier. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Δημιουργεί ένα νέο σύνολο κυβικών καμπυλών B?zier. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Δημιουργεί ένα νέο σχεδιασμένο πολυγωνικό σχέδιο που περιέχει έναν αυθαίρετο αριθμό μεμονωμένων κορυφών. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Δημιουργεί ένα νέο πολυγωνικό σχέδιο που περιέχει έναν αυθαίρετο αριθμό μεμονωμένων κορυφών. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Δημιουργεί ένα νέο σύνολο σχεδιασμένων τετραγωνικών καμπυλών B?zier από το προηγούμενο σημείο στο σχήμα διαδρομής μέσω ενός συνόλου κορυφών, χρησιμοποιώντας καθορισμένα σημεία ελέγχου. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Δημιουργεί ένα νέο σύνολο τετραγωνικών καμπυλών B?zier από το προηγούμενο σημείο στο σχήμα διαδρομής μέσω ενός συνόλου κορυφών, χρησιμοποιώντας καθορισμένα σημεία ελέγχου. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Δημιουργεί ένα νέο πινέλο ακτινικού διαβάθμισης. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Δημιουργεί ένα νέο πινέλο ακτινικού διαβάθμισης. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Δημιουργεί ένα νέο πινέλο στερεού χρώματος. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Δημιουργεί ένα νέο πινέλο στερεού χρώματος. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Δημιουργεί ένα νέο οπτικό πινέλο. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Επιστρέφει το ύψος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου. |
| [getPageCount()](#getPageCount--) | Επιστρέφει τον αριθμό των σελίδων στο ενεργό έγγραφο. |
| [getTotalPageCount()](#getTotalPageCount--) | Επιστρέφει τον συνολικό αριθμό σελίδων σε όλα τα έγγραφα μέσα στο έγγραφο XPS. |
| [getUtils()](#getUtils--) | Αποκτά το αντικείμενο που παρέχει βοηθητικά εργαλεία πέρα από το επίσημο API χειρισμού XPS. |
| [getWidth()](#getWidth--) | Επιστρέφει το πλάτος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Εισάγει ένα νέο καμβά στη σελίδα στη θέση  index  . |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Εισάγει νέα γλύφους στη σελίδα στη θέση  index  . |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Εισάγει νέα γλύφους στη σελίδα στη θέση  index  . |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Εισάγει μια νέα διαδρομή στη σελίδα στη θέση  index  . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Αφαιρεί ένα στοιχείο στη θέση  index  από τη σελίδα. |
| [setHeight(float value)](#setHeight-float-) | Ορίζει το ύψος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου. |
| [setWidth(float value)](#setWidth-float-) | Ορίζει το πλάτος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Προσθέτει ένα στοιχείο περιεχομένου (Canvas, Path ή Glyphs)

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| στοιχείο | T | Το στοιχείο προς προσθήκη. |

**Returns:**
T - Προστέθηκε στοιχείο.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Εισάγει ένα στοιχείο (Canvas, Path ή Glyphs) στη σελίδα στη θέση του δείκτη.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένα στοιχείο. |
| στοιχείο | T | Το στοιχείο για εισαγωγή. |

**Returns:**
T - Εισαχθέν στοιχείο.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Αφαιρεί ένα στοιχείο από τη σελίδα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| στοιχείο | T | Το στοιχείο για αφαίρεση. |

**Returns:**
T - Αφαιρεθέν στοιχείο.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Προσθέτει ένα νέο καμβά στη σελίδα.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Προσθέτει νέα glyphs στη σελίδα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Πόρος γραμματοσειράς. |
| fontRenderingEmSize | float | Μέγεθος γραμματοσειράς. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | java.lang.String | Συμβολοσειρά για εκτύπωση. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Προσθέτει νέα glyphs στη σελίδα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fontFamily | java.lang.String | Οικογένεια γραμματοσειράς. |
| fontRenderingEmSize | float | Μέγεθος γραμματοσειράς. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Στυλ γραμματοσειράς. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | java.lang.String | Συμβολοσειρά για εκτύπωση. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Προσθέτει μια καταχώρηση περιγράμματος στο έγγραφο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| περιγραφή | java.lang.String | Η περιγραφή της εγγραφής. |
| outlineLevel | int | Το επίπεδο περιγράμματος. |
| targetPageNumber | int | Ο αριθμός στόχου σελίδας. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Προσθέτει ένα νέο path στη σελίδα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Η γεωμετρία της διαδρομής. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Δημιουργεί ένα νέο τμηματικό έλλειπτικό τόξο με περίγραμμα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| σημείο | java.awt.geom.Point2D | Το σημείο τέλους της ελλειπτικής τόξου. |
| μέγεθος | java.awt.geom.Dimension2D | Η ακτίνα x και y της ελλειπτικής τόξου ως ζεύγος x,y. |
| rotationAngle | float | Δείχνει πώς η έλλειψη περιστρέφεται σε σχέση με το τρέχον σύστημα συντεταγμένων. |
| isLargeArc | boolean | Καθορίζει εάν το τόξο σχεδιάζεται με σάρωση 180 μοιρών ή μεγαλύτερη. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Η κατεύθυνση με την οποία σχεδιάζεται το τόξο. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Δημιουργεί ένα νέο τμηματικό έλλειπτικό τόξο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| σημείο | java.awt.geom.Point2D | Το σημείο τέλους της ελλειπτικής τόξου. |
| μέγεθος | java.awt.geom.Dimension2D | Η ακτίνα x και y της ελλειπτικής τόξου ως ζεύγος x,y. |
| rotationAngle | float | Δείχνει πώς η έλλειψη περιστρέφεται σε σχέση με το τρέχον σύστημα συντεταγμένων. |
| isLargeArc | boolean | Καθορίζει εάν το τόξο σχεδιάζεται με σάρωση 180 μοιρών ή μεγαλύτερη. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Η κατεύθυνση με την οποία σχεδιάζεται το τόξο. |
| isStroked | boolean | Καθορίζει εάν το στίγμα για αυτό το τμήμα της διαδρομής σχεδιάζεται. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Δημιουργεί ένα νέο καμβά.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο βασισμένο στο ICC.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | Ο πόρος προφίλ ICC. |
| components | float[] | Συστατικά χρώματος. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο scRGB.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| r | float | Το κόκκινο συστατικό χρώματος. |
| g | float | Το πράσινο συστατικό χρώματος. |
| b | float | Το μπλε συστατικό χρώματος. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο scRGB.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| a | float | Το άλφα συστατικό χρώματος. |
| r | float | Το κόκκινο συστατικό χρώματος. |
| g | float | Το πράσινο συστατικό χρώματος. |
| b | float | Το μπλε συστατικό χρώματος. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο sRGB.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| r | int | Το κόκκινο συστατικό χρώματος. |
| g | int | Το πράσινο συστατικό χρώματος. |
| b | int | Το μπλε συστατικό χρώματος. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο sRGB.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| a | int | Το άλφα συστατικό χρώματος. |
| r | int | Το κόκκινο συστατικό χρώματος. |
| g | int | Το πράσινο συστατικό χρώματος. |
| b | int | Το μπλε συστατικό χρώματος. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Δημιουργεί ένα νέο χρώμα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| color | java.awt.Color | Μια εγγενής παρουσία χρώματος για χρώμα RGB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Δημιουργεί ένα νέο χρώμα σε χρωματικό χώρο βασισμένο στο ICC.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | java.lang.String | Η διαδρομή προς το προφίλ ICC. |
| components | float[] | Συστατικά χρώματος. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Δημιουργεί νέα glyphs.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Πόρος γραμματοσειράς. |
| fontRenderingEmSize | float | Μέγεθος γραμματοσειράς. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | java.lang.String | Συμβολοσειρά για εκτύπωση. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Δημιουργεί νέα glyphs.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fontFamily | java.lang.String | Οικογένεια γραμματοσειράς. |
| fontRenderingEmSize | float | Μέγεθος γραμματοσειράς. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Στυλ γραμματοσειράς. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | java.lang.String | Συμβολοσειρά για εκτύπωση. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Δημιουργεί ένα νέο σημείο διαβάθμισης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Το χρώμα διακοπής διαβάθμισης. |
| μετατόπιση | float | Η μετατόπιση της διαβάθμισης. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Δημιουργεί ένα νέο σημείο διαβάθμισης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| color | java.awt.Color | Το χρώμα διακοπής διαβάθμισης. |
| μετατόπιση | float | Η μετατόπιση της διαβάθμισης. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Δημιουργεί ένα νέο πινέλο εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Ένας πόρος εικόνας. |
| πλαίσιο προβολής | java.awt.geom.Rectangle2D | Η θέση και οι διαστάσεις του περιεχομένου προέλευσης του πινέλου. |
| περιοχή προβολής | java.awt.geom.Rectangle2D | Η περιοχή στον χώρο συντεταγμένων που περιέχει το κύριο πλακίδιο πινέλου, η οποία (ενδεχομένως επαναλαμβανόμενα) εφαρμόζεται για να γεμίσει την περιοχή στην οποία εφαρμόζεται το πινέλο. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Δημιουργεί ένα νέο πινέλο εικόνας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imagePath | java.lang.String | Η διαδρομή προς την εικόνα που θα χρησιμοποιηθεί ως πλακίδιο πινέλου. |
| πλαίσιο προβολής | java.awt.geom.Rectangle2D | Η θέση και οι διαστάσεις του περιεχομένου προέλευσης του πινέλου. |
| περιοχή προβολής | java.awt.geom.Rectangle2D | Η περιοχή στον χώρο συντεταγμένων που περιέχει το κύριο πλακίδιο πινέλου, η οποία (ενδεχομένως επαναλαμβανόμενα) εφαρμόζεται για να γεμίσει την περιοχή στην οποία εφαρμόζεται το πινέλο. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Δημιουργεί ένα νέο γραμμικό πινέλο διαβάθμισης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Το αρχικό σημείο της γραμμικής διαβάθμισης. |
| endPoint | java.awt.geom.Point2D | Το τελικό σημείο της γραμμικής διαβάθμισης. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Δημιουργεί ένα νέο γραμμικό πινέλο διαβάθμισης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Η λίστα των σημείων διαβάθμισης. |
| startPoint | java.awt.geom.Point2D | Το αρχικό σημείο της γραμμικής διαβάθμισης. |
| endPoint | java.awt.geom.Point2D | Το τελικό σημείο της γραμμικής διαβάθμισης. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Δημιουργεί έναν νέο πίνακα αφινικού μετασχηματισμού.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| m11 | float | Στοιχείο 11. |
| m12 | float | Στοιχείο 12. |
| m21 | float | Στοιχείο 21. |
| m22 | float | Στοιχείο 22. |
| m31 | float | Στοιχείο 31. |
| m32 | float | Στοιχείο 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Δημιουργεί ένα νέο path.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Η γεωμετρία της διαδρομής. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Δημιουργεί μια νέα ανοιχτή μορφή path.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Το αρχικό σημείο για το πρώτο τμήμα του σχήματος διαδρομής. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Δημιουργεί μια νέα μορφή path.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Το αρχικό σημείο για το πρώτο τμήμα του σχήματος διαδρομής. |
| isClosed | boolean | Καθορίζει αν η διαδρομή είναι κλειστή. Εάν οριστεί σε true, το stroke σχεδιάζεται "closed", δηλαδή το τελευταίο σημείο στο τελευταίο τμήμα του path figure συνδέεται με το σημείο που καθορίζεται στην ιδιότητα StartPoint, διαφορετικά το stroke σχεδιάζεται "open", και το τελευταίο σημείο δεν συνδέεται με το αρχικό σημείο. Ισχύει μόνο εάν το path figure χρησιμοποιείται σε στοιχείο Path που καθορίζει ένα stroke. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Δημιουργεί μια νέα ανοιχτή μορφή path.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Το αρχικό σημείο για το πρώτο τμήμα του σχήματος διαδρομής. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Λίστα τμημάτων διαδρομής. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Δημιουργεί μια νέα μορφή path.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Το αρχικό σημείο για το πρώτο τμήμα του σχήματος διαδρομής. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Λίστα τμημάτων διαδρομής. |
| isClosed | boolean | Καθορίζει αν η διαδρομή είναι κλειστή. Εάν οριστεί σε true, το stroke σχεδιάζεται "closed", δηλαδή το τελευταίο σημείο στο τελευταίο τμήμα του path figure συνδέεται με το σημείο που καθορίζεται στην ιδιότητα StartPoint, διαφορετικά το stroke σχεδιάζεται "open", και το τελευταίο σημείο δεν συνδέεται με το αρχικό σημείο. Ισχύει μόνο εάν το path figure χρησιμοποιείται σε στοιχείο Path που καθορίζει ένα stroke. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Δημιουργεί μια νέα γεωμετρία path.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Δημιουργεί μια νέα γεωμετρία διαδρομής που καθορίζεται με σύντομη μορφή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Συνοπτική μορφή γεωμετρίας διαδρομής. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Δημιουργεί μια νέα γεωμετρία διαδρομής με καθορισμένη λίστα σχημάτων διαδρομής.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Λίστα σχημάτων διαδρομής. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Δημιουργεί ένα νέο σύνολο σχεδιασμένων κυβικών καμπυλών B?zier.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Σημεία ελέγχου για πολλαπλά B?bezier τμήματα. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Δημιουργεί ένα νέο σύνολο κυβικών καμπυλών B?zier.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Σημεία ελέγχου για πολλαπλά B?bezier τμήματα. |
| isStroked | boolean | Καθορίζει εάν το στίγμα για αυτό το τμήμα της διαδρομής σχεδιάζεται. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Δημιουργεί ένα νέο σχεδιασμένο πολυγωνικό σχέδιο που περιέχει έναν αυθαίρετο αριθμό μεμονωμένων κορυφών.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Ένα σύνολο συντεταγμένων για τα πολλαπλά τμήματα που ορίζουν το τμήμα πολυγραμμής. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Δημιουργεί ένα νέο πολυγωνικό σχέδιο που περιέχει έναν αυθαίρετο αριθμό μεμονωμένων κορυφών.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Ένα σύνολο συντεταγμένων για τα πολλαπλά τμήματα που ορίζουν το τμήμα πολυγραμμής. |
| isStroked | boolean | Καθορίζει εάν το στίγμα για αυτό το τμήμα της διαδρομής σχεδιάζεται. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Δημιουργεί ένα νέο σύνολο σχεδιασμένων τετραγωνικών καμπυλών B?zier από το προηγούμενο σημείο στο σχήμα διαδρομής μέσω ενός συνόλου κορυφών, χρησιμοποιώντας καθορισμένα σημεία ελέγχου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Σημεία ελέγχου για πολλαπλά τετραγωνικά B?bezier τμήματα. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Δημιουργεί ένα νέο σύνολο τετραγωνικών καμπυλών B?zier από το προηγούμενο σημείο στο σχήμα διαδρομής μέσω ενός συνόλου κορυφών, χρησιμοποιώντας καθορισμένα σημεία ελέγχου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Σημεία ελέγχου για πολλαπλά τετραγωνικά B?bezier τμήματα. |
| isStroked | boolean | Καθορίζει εάν το στίγμα για αυτό το τμήμα της διαδρομής σχεδιάζεται. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Δημιουργεί ένα νέο πινέλο ακτινικού διαβάθμισης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Το κεντρικό σημείο της ακτινικής διαβάθμισης (δηλαδή, το κέντρο της έλλειψης). |
| gradientOrigin | java.awt.geom.Point2D | Το αρχικό σημείο της ακτινικής διαβάθμισης. |
| radiusX | float | Η ακτίνα στη διάσταση x της έλλειψης που ορίζει τη διαβάθμιση ακτινικής κλίμακας. |
| radiusY | float | Η ακτίνα στη διάσταση y της έλλειψης που ορίζει τη διαβάθμιση ακτινικής κλίμακας. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Δημιουργεί ένα νέο πινέλο ακτινικού διαβάθμισης.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Η λίστα των σημείων διαβάθμισης. |
| center | java.awt.geom.Point2D | Το κεντρικό σημείο της ακτινικής διαβάθμισης (δηλαδή, το κέντρο της έλλειψης). |
| gradientOrigin | java.awt.geom.Point2D | Το αρχικό σημείο της ακτινικής διαβάθμισης. |
| radiusX | float | Η ακτίνα στη διάσταση x της έλλειψης που ορίζει τη διαβάθμιση ακτινικής κλίμακας. |
| radiusY | float | Η ακτίνα στη διάσταση y της έλλειψης που ορίζει τη διαβάθμιση ακτινικής κλίμακας. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Δημιουργεί ένα νέο πινέλο στερεού χρώματος.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Το χρώμα για γεμισμένα στοιχεία. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Δημιουργεί ένα νέο πινέλο στερεού χρώματος.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| color | java.awt.Color | Το χρώμα για γεμισμένα στοιχεία. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Δημιουργεί ένα νέο οπτικό πινέλο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Το στοιχείο XPS (Canvas, Path ή Glyphs) για την ιδιότητα Visual του visual brush. |
| πλαίσιο προβολής | java.awt.geom.Rectangle2D | Η θέση και οι διαστάσεις του περιεχομένου προέλευσης του πινέλου. |
| περιοχή προβολής | java.awt.geom.Rectangle2D | Η περιοχή στον χώρο συντεταγμένων που περιέχει το κύριο πλακίδιο πινέλου, η οποία (ενδεχομένως επαναλαμβανόμενα) εφαρμόζεται για να γεμίσει την περιοχή στην οποία εφαρμόζεται το πινέλο. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public float getHeight()
```


Επιστρέφει το ύψος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου.

**Returns:**
float - Το ύψος της σελίδας.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Επιστρέφει τον αριθμό των σελίδων στο ενεργό έγγραφο.

**Returns:**
int - Ο αριθμός των σελίδων στο ενεργό έγγραφο.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Επιστρέφει τον συνολικό αριθμό σελίδων σε όλα τα έγγραφα μέσα στο έγγραφο XPS.

**Returns:**
int - Ο συνολικός αριθμός των σελίδων σε όλα τα έγγραφα μέσα στο έγγραφο XPS.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Αποκτά το αντικείμενο που παρέχει βοηθητικά εργαλεία πέρα από το επίσημο API χειρισμού XPS.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Επιστρέφει το πλάτος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου.

**Returns:**
float - Το πλάτος της σελίδας.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Εισάγει ένα νέο καμβά στη σελίδα στη θέση  index  .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένας νέος καμβάς. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Εισάγει νέα γλύφους στη σελίδα στη θέση  index  .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθούν νέα γλύφια. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Πόρος γραμματοσειράς. |
| fontSize | float | Μέγεθος γραμματοσειράς. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | java.lang.String | Συμβολοσειρά για εκτύπωση. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Εισάγει νέα γλύφους στη σελίδα στη θέση  index  .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθούν νέα γλύφια. |
| fontFamily | java.lang.String | Οικογένεια γραμματοσειράς. |
| fontSize | float | Μέγεθος γραμματοσειράς. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Στυλ γραμματοσειράς. |
| originX | float | Συντεταγμένη X προέλευσης γλύφων. |
| originY | float | Συντεταγμένη Y προέλευσης γλύφων. |
| unicodeString | java.lang.String | Συμβολοσειρά για εκτύπωση. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Εισάγει μια νέα διαδρομή στη σελίδα στη θέση  index  .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένα νέο μονοπάτι. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Η γεωμετρία της διαδρομής. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


Αφαιρεί ένα στοιχείο στη θέση  index  από τη σελίδα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να αφαιρεθεί το στοιχείο. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Ορίζει το ύψος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Το ύψος της σελίδας. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Ορίζει το πλάτος της σελίδας, εκφρασμένο ως πραγματικός αριθμός σε μονάδες του αποτελεσματικού συντεταγμένου χώρου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| τιμή | float | Το πλάτος της σελίδας. |

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

