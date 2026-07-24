---
title: "XpsDocument"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Κλάση που ενσωματώνει την κύρια οντότητα του εγγράφου XPS που παρέχει μεθόδους χειρισμού για οποιοδήποτε στοιχείο XPS."
type: docs
weight: 19
url: /el/java/com.aspose.xps/xpsdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)

**All Implemented Interfaces:**
java.io.Closeable
```
public final class XpsDocument extends Document implements Closeable
```

Κλάση που ενσωματώνει την κύρια οντότητα του εγγράφου XPS που παρέχει μεθόδους χειρισμού για οποιοδήποτε στοιχείο XPS.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [XpsDocument()](#XpsDocument--) | Δημιουργεί κενό έγγραφο XPS με προεπιλεγμένο μέγεθος σελίδας. |
| [XpsDocument(String path)](#XpsDocument-java.lang.String-) | Ανοίγει ένα υπάρχον έγγραφο XPS που βρίσκεται στη διαδρομή. |
| [XpsDocument(InputStream stream, LoadOptions options)](#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-) | Φορτώνει ένα υπάρχον έγγραφο αποθηκευμένο στη stream ως έγγραφο XPS. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Προσθέτει ένα στοιχείο περιεχομένου (Canvas, Path ή Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Εισάγει ένα στοιχείο (Canvas, Path ή Glyphs) στη ενεργή σελίδα στη θέση index. |
| [<T>remove(T element)](#-T-remove-T-) | Αφαιρεί ένα στοιχείο από τη ενεργή σελίδα. |
| [addCanvas()](#addCanvas--) | Προσθέτει νέο canvas στη ενεργή σελίδα. |
| [addDocument()](#addDocument--) | Προσθέτει κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας και επιλέγει το προστιθέμενο έγγραφο ως ενεργό. |
| [addDocument(boolean activate)](#addDocument-boolean-) | Προσθέτει κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας. |
| [addDocument(float width, float height)](#addDocument-float-float-) | Προσθέτει κενό έγγραφο με τις διαστάσεις του πρώτου σελίδας πλάτος και ύψος και επιλέγει το προστιθέμενο έγγραφο ως ενεργό. |
| [addDocument(float width, float height, boolean activate)](#addDocument-float-float-boolean-) | Προσθέτει ένα κενό έγγραφο με τις διαστάσεις της πρώτης σελίδας  width  και  height . |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Προσθέτει νέα γλύφους στη ενεργή σελίδα. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Προσθέτει νέα γλύφους στη ενεργή σελίδα. |
| [addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)](#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-) | Προσθέτει μια καταχώρηση περιγράμματος στο έγγραφο. |
| [addPage()](#addPage--) | Προσθέτει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας. |
| [addPage(boolean activate)](#addPage-boolean-) | Προσθέτει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας. |
| [addPage(XpsPage page)](#addPage-com.aspose.xps.XpsPage-) | Προσθέτει μια σελίδα στο έγγραφο και επιλέγει τη προστιθέμενη σελίδα ως ενεργή. |
| [addPage(XpsPage page, boolean activate)](#addPage-com.aspose.xps.XpsPage-boolean-) | Προσθέτει μια σελίδα στο έγγραφο. |
| [addPage(float width, float height)](#addPage-float-float-) | Προσθέτει μια κενή σελίδα στο έγγραφο με καθορισμένο  width  και  height . |
| [addPage(float width, float height, boolean activate)](#addPage-float-float-boolean-) | Προσθέτει μια κενή σελίδα στο έγγραφο με καθορισμένο  width  και  height . |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Προσθέτει μια νέα διαδρομή στη ενεργή σελίδα. |
| [close()](#close--) | Αποδεσμεύει το αντικείμενο. |
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
| [createFont(InputStream stream)](#createFont-java.io.InputStream-) | Δημιουργεί έναν νέο πόρο γραμματοσειράς TrueType από stream. |
| [createFont(String fontFamily, XpsFontStyle fontStyle)](#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-) | Δημιουργεί έναν νέο πόρο γραμματοσειράς TrueType. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Δημιουργεί νέα glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Δημιουργεί νέα glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Δημιουργεί ένα νέο σημείο διαβάθμισης. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Δημιουργεί ένα νέο σημείο διαβάθμισης. |
| [createIccProfile(InputStream stream)](#createIccProfile-java.io.InputStream-) | Δημιουργεί έναν νέο πόρο προφίλ ICC από  stream . |
| [createIccProfile(String iccProfilePath)](#createIccProfile-java.lang.String-) | Δημιουργεί έναν νέο πόρο προφίλ ICC από αρχείο προφίλ ICC που βρίσκεται στο  iccProfilePath . |
| [createImage(InputStream stream)](#createImage-java.io.InputStream-) | Δημιουργεί έναν νέο πόρο εικόνας από  stream . |
| [createImage(String imagePath)](#createImage-java.lang.String-) | Δημιουργεί έναν νέο πόρο εικόνας από αρχείο εικόνας που βρίσκεται στο  imagePath . |
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
| [getActiveDocument()](#getActiveDocument--) | Επιστρέφει τον αριθμό του ενεργού εγγράφου. |
| [getActivePage()](#getActivePage--) | Επιστρέφει τον αριθμό της ενεργής σελίδας εντός του ενεργού εγγράφου. |
| [getClass()](#getClass--) |  |
| [getDocumentCount()](#getDocumentCount--) | Επιστρέφει τον αριθμό των εγγράφων μέσα στο πακέτο XPS. |
| [getDocumentPrintTicket(int documentIndex)](#getDocumentPrintTicket-int-) | Αποκτά το εισιτήριο εκτύπωσης του εγγράφου που έχει δείκτη  documentIndex . |
| [getJobPrintTicket()](#getJobPrintTicket--) | Επιστρέφει το εισιτήριο εργασίας εκτύπωσης του εγγράφου. |
| [getPage()](#getPage--) | Επιστρέφει το αντικείμενο  XpsPage  για τη ενεργή σελίδα. |
| [getPageCount()](#getPageCount--) | Επιστρέφει τον αριθμό των σελίδων στο ενεργό έγγραφο. |
| [getPagePrintTicket(int documentIndex, int pageIndex)](#getPagePrintTicket-int-int-) | Αποκτά το εισιτήριο εκτύπωσης της σελίδας που έχει δείκτη  pageIndex  στο έγγραφο που έχει δείκτη  documentIndex . |
| [getTotalPageCount()](#getTotalPageCount--) | Επιστρέφει τον συνολικό αριθμό σελίδων σε όλα τα έγγραφα μέσα στο έγγραφο XPS. |
| [getUtils()](#getUtils--) | Αποκτά το αντικείμενο που παρέχει βοηθητικά εργαλεία πέρα από το επίσημο API χειρισμού XPS. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Εισάγει έναν νέο καμβά στη ενεργή σελίδα στη θέση  index . |
| [insertDocument(int index)](#insertDocument-int-) | Εισάγει ένα κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας στη θέση  index και επιλέγει το εισαχθέν έγγραφο ως ενεργό. |
| [insertDocument(int index, boolean activate)](#insertDocument-int-boolean-) | Εισάγει ένα κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας στη θέση  index . |
| [insertDocument(int index, float width, float height)](#insertDocument-int-float-float-) | Εισάγει ένα κενό έγγραφο με τις διαστάσεις της πρώτης σελίδας  width  και  height  στη θέση  index και επιλέγει το εισαχθέν έγγραφο ως ενεργό. |
| [insertDocument(int index, float width, float height, boolean activate)](#insertDocument-int-float-float-boolean-) | Εισάγει ένα κενό έγγραφο με τις διαστάσεις της πρώτης σελίδας  width  και  height  στη θέση  index  position. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Εισάγει νέα γλύφους στη ενεργή σελίδα στη θέση  index  position. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Εισάγει νέα γλύφους στη ενεργή σελίδα στη θέση  index  position. |
| [insertPage(int index)](#insertPage-int-) | Εισάγει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας στη θέση  index  position και επιλέγει τη δοσμένη σελίδα ως ενεργή. |
| [insertPage(int index, boolean activate)](#insertPage-int-boolean-) | Εισάγει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας στη θέση  index  position. |
| [insertPage(int index, XpsPage page)](#insertPage-int-com.aspose.xps.XpsPage-) | Εισάγει μια σελίδα στο έγγραφο στη θέση  index  position και επιλέγει τη δοσμένη σελίδα ως ενεργή. |
| [insertPage(int index, XpsPage page, boolean activate)](#insertPage-int-com.aspose.xps.XpsPage-boolean-) | Εισάγει μια σελίδα στο έγγραφο στη θέση  index  position. |
| [insertPage(int index, float width, float height)](#insertPage-int-float-float-) | Εισάγει μια κενή σελίδα στο έγγραφο με καθορισμένο  width  και  height  στη θέση  index  position και επιλέγει τη δοσμένη σελίδα ως ενεργή. |
| [insertPage(int index, float width, float height, boolean activate)](#insertPage-int-float-float-boolean-) | Εισάγει μια κενή σελίδα στο έγγραφο με καθορισμένο  width  και  height  στη θέση  index  position. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Εισάγει ένα νέο μονοπάτι στη ενεργή σελίδα στη θέση  index  position. |
| [isLicensed()](#isLicensed--) | Δείχνει αν η άδεια προϊόντος Aspose.Page για Java είναι προσπελάσιμη και έγκυρη. |
| [merge(String[] filesForMerge, OutputStream outStream)](#merge-java.lang.String---java.io.OutputStream-) | Συγχώνευση πολλαπλών αρχείων XPS σε ένα έγγραφο XPS. |
| [merge(String[] filesForMerge, String outXpsFilePath)](#merge-java.lang.String---java.lang.String-) | Συγχώνευση πολλαπλών αρχείων XPS σε ένα έγγραφο XPS. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-) | Συγχώνευση εγγράφων XPS σε PDF χρησιμοποιώντας το αντικείμενο  Device  . |
| [mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)](#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Συγχώνευση εγγράφων XPS σε PDF χρησιμοποιώντας το αντικείμενο  Device  . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Αφαιρεί ένα στοιχείο στη θέση  index  position από τη ενεργή σελίδα. |
| [removeDocumentAt(int index)](#removeDocumentAt-int-) | Αφαιρεί ένα έγγραφο στη θέση  index  position. |
| [removePage(XpsPage page)](#removePage-com.aspose.xps.XpsPage-) | Αφαιρεί μια σελίδα από το έγγραφο. |
| [removePageAt(int index)](#removePageAt-int-) | Αφαιρεί μια σελίδα από το έγγραφο στη θέση  index  position. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Αποθηκεύει το έγγραφο χρησιμοποιώντας το αντικείμενο  Device  . |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | Αποθηκεύει το έγγραφο XPS σε ροή. |
| [save(String path)](#save-java.lang.String-) | Αποθηκεύει το έγγραφο XPS στο αρχείο XPS που βρίσκεται στη  path . |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-) | Αποθηκεύει το έγγραφο σε αρχείο εικόνας. Ο φάκελος εξόδου και το όνομα αρχείου θα είναι τα ίδια με το αρχείο XPS εισόδου. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-) | Αποθηκεύει το έγγραφο σε αρχείο εικόνας στον καθορισμένο φάκελο με το καθορισμένο όνομα αρχείου. |
| [saveAsImageBytes(ImageSaveOptions options)](#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-) | Αποθηκεύει το έγγραφο σε μορφή bitmap εικόνας ως πίνακες byte. |
| [saveAsPdf(OutputStream stream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-) | Αποθηκεύει το έγγραφο σε μορφή PDF. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-) | Αποθηκεύει το έγγραφο σε μορφή PDF. |
| [saveAsPs(OutputStream stream, PsSaveOptions options)](#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Αποθηκεύει το έγγραφο σε μορφή PS. |
| [saveAsPs(String outPsFilePath, PsSaveOptions options)](#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Αποθηκεύει το έγγραφο σε μορφή PostSscript. |
| [selectActiveDocument(int documentNumber)](#selectActiveDocument-int-) | Επιλέγει ένα ενεργό έγγραφο για επεξεργασία. |
| [selectActivePage(int pageNumber)](#selectActivePage-int-) | Επιλέγει μια ενεργή σελίδα εγγράφου για επεξεργασία. |
| [setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)](#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-) | Συνδέει το  printTicket  με το έγγραφο που έχει δείκτη  documentIndex . |
| [setJobPrintTicket(JobPrintTicket value)](#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-) | Ορίζει το εισιτήριο εκτύπωσης εργασίας του εγγράφου. |
| [setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)](#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-) | Συνδέει το  printTicket  με τη σελίδα που έχει δείκτη  pageIndex  στο έγγραφο που έχει δείκτη  documentIndex . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsDocument() {#XpsDocument--}
```
public XpsDocument()
```


Δημιουργεί κενό έγγραφο XPS με προεπιλεγμένο μέγεθος σελίδας.

### XpsDocument(String path) {#XpsDocument-java.lang.String-}
```
public XpsDocument(String path)
```


Ανοίγει ένα υπάρχον έγγραφο XPS που βρίσκεται στη διαδρομή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | java.lang.String | Τοποθεσία του εγγράφου. |

### XpsDocument(InputStream stream, LoadOptions options) {#XpsDocument-java.io.InputStream-com.aspose.xps.LoadOptions-}
```
public XpsDocument(InputStream stream, LoadOptions options)
```


Φορτώνει ένα υπάρχον έγγραφο αποθηκευμένο στη stream ως έγγραφο XPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ροή | java.io.InputStream | Ροή εγγράφου. |
| options | [LoadOptions](../../com.aspose.xps/loadoptions) | Επιλογές φόρτωσης εγγράφου. |

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


Εισάγει ένα στοιχείο (Canvas, Path ή Glyphs) στη ενεργή σελίδα στη θέση index.

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


Αφαιρεί ένα στοιχείο από τη ενεργή σελίδα.

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


Προσθέτει νέο canvas στη ενεργή σελίδα.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addDocument() {#addDocument--}
```
public void addDocument()
```


Προσθέτει κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας και επιλέγει το προστιθέμενο έγγραφο ως ενεργό.

### addDocument(boolean activate) {#addDocument-boolean-}
```
public void addDocument(boolean activate)
```


Προσθέτει κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ενεργοποίηση | boolean | Σημαία που υποδεικνύει αν θα επιλεγεί το προστεθέν έγγραφο ως ενεργό. |

### addDocument(float width, float height) {#addDocument-float-float-}
```
public void addDocument(float width, float height)
```


Προσθέτει κενό έγγραφο με τις διαστάσεις του πρώτου σελίδας πλάτος και ύψος και επιλέγει το προστιθέμενο έγγραφο ως ενεργό.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | float | Πλάτος της πρώτης σελίδας. |
| height | float | Ύψος της πρώτης σελίδας. |

### addDocument(float width, float height, boolean activate) {#addDocument-float-float-boolean-}
```
public void addDocument(float width, float height, boolean activate)
```


Προσθέτει ένα κενό έγγραφο με τις διαστάσεις της πρώτης σελίδας  width  και  height .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | float | Πλάτος της πρώτης σελίδας. |
| height | float | Ύψος της πρώτης σελίδας. |
| ενεργοποίηση | boolean | Σημαία που υποδεικνύει αν θα επιλεγεί το προστεθέν έγγραφο ως ενεργό. |

### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Προσθέτει νέα γλύφους στη ενεργή σελίδα.

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


Προσθέτει νέα γλύφους στη ενεργή σελίδα.

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
### addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target) {#addOutlineEntry-java.lang.String-int-com.aspose.xps.XpsHyperlinkTarget-}
```
public void addOutlineEntry(String description, int outlineLevel, XpsHyperlinkTarget target)
```


Προσθέτει μια καταχώρηση περιγράμματος στο έγγραφο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| περιγραφή | java.lang.String | Η περιγραφή της εγγραφής. |
| outlineLevel | int | Το επίπεδο περιγράμματος. |
| target | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Ο προορισμός εισόδου. |

### addPage() {#addPage--}
```
public XpsPage addPage()
```


Προσθέτει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(boolean activate) {#addPage-boolean-}
```
public XpsPage addPage(boolean activate)
```


Προσθέτει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ενεργοποίηση | boolean | Σημαία που υποδεικνύει αν θα επιλεγεί η προστεθείσα σελίδα ως ενεργή. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page) {#addPage-com.aspose.xps.XpsPage-}
```
public XpsPage addPage(XpsPage page)
```


Προσθέτει μια σελίδα στο έγγραφο και επιλέγει τη προστιθέμενη σελίδα ως ενεργή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Σελίδα που θα προστεθεί. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(XpsPage page, boolean activate) {#addPage-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage addPage(XpsPage page, boolean activate)
```


Προσθέτει μια σελίδα στο έγγραφο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Σελίδα που θα προστεθεί. |
| ενεργοποίηση | boolean | Σημαία που υποδεικνύει αν θα επιλεγεί η προστεθείσα σελίδα ως ενεργή. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height) {#addPage-float-float-}
```
public XpsPage addPage(float width, float height)
```


Προσθέτει μια κενή σελίδα στο έγγραφο με καθορισμένο  width  και  height .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | float | Πλάτος μιας νέας σελίδας. |
| height | float | Ύψος μιας νέας σελίδας. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPage(float width, float height, boolean activate) {#addPage-float-float-boolean-}
```
public XpsPage addPage(float width, float height, boolean activate)
```


Προσθέτει μια κενή σελίδα στο έγγραφο με καθορισμένο  width  και  height .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | float | Πλάτος μιας νέας σελίδας. |
| height | float | Ύψος μιας νέας σελίδας. |
| ενεργοποίηση | boolean | Σημαία που υποδεικνύει αν θα επιλεγεί η προστεθείσα σελίδα ως ενεργή. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Added page.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Προσθέτει μια νέα διαδρομή στη ενεργή σελίδα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Η γεωμετρία της διαδρομής. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### close() {#close--}
```
public void close()
```


Αποδεσμεύει το αντικείμενο.

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
### createFont(InputStream stream) {#createFont-java.io.InputStream-}
```
public XpsFont createFont(InputStream stream)
```


Δημιουργεί έναν νέο πόρο γραμματοσειράς TrueType από stream.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ροή | java.io.InputStream | Η ροή που περιέχει το προφίλ ICC για χρήση ως πόρος. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
### createFont(String fontFamily, XpsFontStyle fontStyle) {#createFont-java.lang.String-com.aspose.xps.XpsFontStyle-}
```
public XpsFont createFont(String fontFamily, XpsFontStyle fontStyle)
```


Δημιουργεί έναν νέο πόρο γραμματοσειράς TrueType.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fontFamily | java.lang.String | Η οικογένεια γραμματοσειράς. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Το στυλ γραμματοσειράς. Δείτε τις σταθερές της κλάσης  **XpsFont** (οι οποίες είναι bit flags) για τις τιμές που είναι διαθέσιμες για συνδυασμό. |

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - New TrueType font resource.
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
### createIccProfile(InputStream stream) {#createIccProfile-java.io.InputStream-}
```
public XpsIccProfile createIccProfile(InputStream stream)
```


Δημιουργεί έναν νέο πόρο προφίλ ICC από  stream .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ροή | java.io.InputStream | Η ροή που περιέχει το προφίλ ICC για χρήση ως πόρος. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createIccProfile(String iccProfilePath) {#createIccProfile-java.lang.String-}
```
public XpsIccProfile createIccProfile(String iccProfilePath)
```


Δημιουργεί έναν νέο πόρο προφίλ ICC από αρχείο προφίλ ICC που βρίσκεται στο  iccProfilePath .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| iccProfilePath | java.lang.String | Η διαδρομή προς το προφίλ ICC για χρήση ως πόρος. |

**Returns:**
[XpsIccProfile](../../com.aspose.xps/xpsiccprofile) - New ICC profile resource.
### createImage(InputStream stream) {#createImage-java.io.InputStream-}
```
public XpsImage createImage(InputStream stream)
```


Δημιουργεί έναν νέο πόρο εικόνας από  stream .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ροή | java.io.InputStream | Η ροή που περιέχει την εικόνα για χρήση ως πόρος. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
### createImage(String imagePath) {#createImage-java.lang.String-}
```
public XpsImage createImage(String imagePath)
```


Δημιουργεί έναν νέο πόρο εικόνας από αρχείο εικόνας που βρίσκεται στο  imagePath .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imagePath | java.lang.String | Η διαδρομή προς την εικόνα για χρήση ως πόρο. |

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - New image resource.
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
### getActiveDocument() {#getActiveDocument--}
```
public int getActiveDocument()
```


Επιστρέφει τον αριθμό του ενεργού εγγράφου.

**Returns:**
int - Η τιμή int.
### getActivePage() {#getActivePage--}
```
public int getActivePage()
```


Επιστρέφει τον αριθμό της ενεργής σελίδας εντός του ενεργού εγγράφου.

**Returns:**
int - Η τιμή int.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentCount() {#getDocumentCount--}
```
public int getDocumentCount()
```


Επιστρέφει τον αριθμό των εγγράφων μέσα στο πακέτο XPS.

**Returns:**
int - Ο αριθμός των εγγράφων μέσα στο πακέτο XPS.
### getDocumentPrintTicket(int documentIndex) {#getDocumentPrintTicket-int-}
```
public DocumentPrintTicket getDocumentPrintTicket(int documentIndex)
```


Αποκτά το εισιτήριο εκτύπωσης του εγγράφου που έχει δείκτη  documentIndex .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| documentIndex | int | Δείκτης του εγγράφου του οποίου το εισιτήριο εκτύπωσης πρέπει να επιστραφεί. |

**Returns:**
[DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) - Document's print ticket.
### getJobPrintTicket() {#getJobPrintTicket--}
```
public JobPrintTicket getJobPrintTicket()
```


Επιστρέφει το εισιτήριο εργασίας εκτύπωσης του εγγράφου.

**Returns:**
[JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) - The document's job print ticket.
### getPage() {#getPage--}
```
public XpsPage getPage()
```


Επιστρέφει το αντικείμενο  XpsPage  για τη ενεργή σελίδα.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - The  XpsPage  instance for active page.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Επιστρέφει τον αριθμό των σελίδων στο ενεργό έγγραφο.

**Returns:**
int - Ο αριθμός των σελίδων στο ενεργό έγγραφο.
### getPagePrintTicket(int documentIndex, int pageIndex) {#getPagePrintTicket-int-int-}
```
public PagePrintTicket getPagePrintTicket(int documentIndex, int pageIndex)
```


Αποκτά το εισιτήριο εκτύπωσης της σελίδας που έχει δείκτη  pageIndex  στο έγγραφο που έχει δείκτη  documentIndex .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| documentIndex | int | Δείκτης του εγγράφου. |
| pageIndex | int | Δείκτης της σελίδας του οποίου το εισιτήριο εκτύπωσης πρέπει να επιστραφεί. |

**Returns:**
[PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) - Page's print ticket.
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
[DocumentUtils](../../com.aspose.xps/documentutils) - The utilities object.
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


Εισάγει έναν νέο καμβά στη ενεργή σελίδα στη θέση  index .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένας νέος καμβάς. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertDocument(int index) {#insertDocument-int-}
```
public void insertDocument(int index)
```


Εισάγει ένα κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας στη θέση  index και επιλέγει το εισαχθέν έγγραφο ως ενεργό.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένα έγγραφο. |

### insertDocument(int index, boolean activate) {#insertDocument-int-boolean-}
```
public void insertDocument(int index, boolean activate)
```


Εισάγει ένα κενό έγγραφο με προεπιλεγμένο μέγεθος σελίδας στη θέση  index .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένα έγγραφο. |
| ενεργοποίηση | boolean | Σημαία που υποδεικνύει εάν το εισαχθέν έγγραφο πρέπει να επιλεγεί ως ενεργό. |

### insertDocument(int index, float width, float height) {#insertDocument-int-float-float-}
```
public void insertDocument(int index, float width, float height)
```


Εισάγει ένα κενό έγγραφο με τις διαστάσεις της πρώτης σελίδας  width  και  height  στη θέση  index και επιλέγει το εισαχθέν έγγραφο ως ενεργό.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένα έγγραφο. |
| width | float | Πλάτος της πρώτης σελίδας. |
| height | float | Ύψος της πρώτης σελίδας. |

### insertDocument(int index, float width, float height, boolean activate) {#insertDocument-int-float-float-boolean-}
```
public void insertDocument(int index, float width, float height, boolean activate)
```


Εισάγει ένα κενό έγγραφο με τις διαστάσεις της πρώτης σελίδας  width  και  height  στη θέση  index  position.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένα έγγραφο. |
| width | float | Πλάτος της πρώτης σελίδας. |
| height | float | Ύψος της πρώτης σελίδας. |
| ενεργοποίηση | boolean | Σημαία που υποδεικνύει εάν το εισαχθέν έγγραφο πρέπει να επιλεγεί ως ενεργό. |

### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Εισάγει νέα γλύφους στη ενεργή σελίδα στη θέση  index  position.

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


Εισάγει νέα γλύφους στη ενεργή σελίδα στη θέση  index  position.

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
### insertPage(int index) {#insertPage-int-}
```
public XpsPage insertPage(int index)
```


Εισάγει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας στη θέση  index  position και επιλέγει τη δοσμένη σελίδα ως ενεργή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί μια σελίδα. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, boolean activate) {#insertPage-int-boolean-}
```
public XpsPage insertPage(int index, boolean activate)
```


Εισάγει μια κενή σελίδα στο έγγραφο με προεπιλεγμένο μέγεθος σελίδας στη θέση  index  position.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί μια σελίδα. |
| ενεργοποίηση | boolean | Σημαία που υποδεικνύει εάν η εισαχθείσα σελίδα πρέπει να επιλεγεί ως ενεργή. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page) {#insertPage-int-com.aspose.xps.XpsPage-}
```
public XpsPage insertPage(int index, XpsPage page)
```


Εισάγει μια σελίδα στο έγγραφο στη θέση  index  position και επιλέγει τη δοσμένη σελίδα ως ενεργή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να προστεθεί μια σελίδα. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Σελίδα προς εισαγωγή. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, XpsPage page, boolean activate) {#insertPage-int-com.aspose.xps.XpsPage-boolean-}
```
public XpsPage insertPage(int index, XpsPage page, boolean activate)
```


Εισάγει μια σελίδα στο έγγραφο στη θέση  index  position.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να προστεθεί μια σελίδα. |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Σελίδα προς εισαγωγή. |
| ενεργοποίηση | boolean | Σημαία που υποδεικνύει εάν η εισαχθείσα σελίδα πρέπει να επιλεγεί ως ενεργή. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height) {#insertPage-int-float-float-}
```
public XpsPage insertPage(int index, float width, float height)
```


Εισάγει μια κενή σελίδα στο έγγραφο με καθορισμένο  width  και  height  στη θέση  index  position και επιλέγει τη δοσμένη σελίδα ως ενεργή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί μια σελίδα. |
| width | float | Πλάτος μιας νέας σελίδας. |
| height | float | Ύψος μιας νέας σελίδας. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPage(int index, float width, float height, boolean activate) {#insertPage-int-float-float-boolean-}
```
public XpsPage insertPage(int index, float width, float height, boolean activate)
```


Εισάγει μια κενή σελίδα στο έγγραφο με καθορισμένο  width  και  height  στη θέση  index  position.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί μια σελίδα. |
| width | float | Πλάτος μιας νέας σελίδας. |
| height | float | Ύψος μιας νέας σελίδας. |
| ενεργοποίηση | boolean | Σημαία που υποδεικνύει εάν η εισαχθείσα σελίδα πρέπει να επιλεγεί ως ενεργή. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Inserted page.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Εισάγει ένα νέο μονοπάτι στη ενεργή σελίδα στη θέση  index  position.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να εισαχθεί ένα νέο μονοπάτι. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Η γεωμετρία της διαδρομής. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Δείχνει αν η άδεια προϊόντος Aspose.Page για Java είναι προσπελάσιμη και έγκυρη.

**Returns:**
boolean - τιμή boolean
### merge(String[] filesForMerge, OutputStream outStream) {#merge-java.lang.String---java.io.OutputStream-}
```
public void merge(String[] filesForMerge, OutputStream outStream)
```


Συγχώνευση πολλαπλών αρχείων XPS σε ένα έγγραφο XPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Αρχεία XPS για συγχώνευση με αυτό το έγγραφο. |
| outStream | java.io.OutputStream | Η ροή εξόδου όπου αποθηκεύονται τα συγχωνευμένα έγγραφα XPS. |

### merge(String[] filesForMerge, String outXpsFilePath) {#merge-java.lang.String---java.lang.String-}
```
public void merge(String[] filesForMerge, String outXpsFilePath)
```


Συγχώνευση πολλαπλών αρχείων XPS σε ένα έγγραφο XPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Αρχεία XPS για συγχώνευση με αυτό το έγγραφο. |
| outXpsFilePath | java.lang.String | Η διαδρομή του εξαγώμενου αρχείου XPS. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, PdfSaveOptions options)
```


Συγχώνευση εγγράφων XPS σε PDF χρησιμοποιώντας το αντικείμενο  Device  .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Η διαδρομή του εξαγώμενου αρχείου PDF. |
| filesForMerge | java.lang.String[] | Αρχεία XPS για συγχώνευση με αυτό το έγγραφο σε μια συσκευή εξόδου. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Επιλογές αποθήκευσης εγγράφου. |

### mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options) {#mergeToPdf-java.lang.String---java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void mergeToPdf(String[] filesForMerge, OutputStream pdfStream, PdfSaveOptions options)
```


Συγχώνευση εγγράφων XPS σε PDF χρησιμοποιώντας το αντικείμενο  Device  .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Αρχεία XPS για συγχώνευση με αυτό το έγγραφο σε μια συσκευή εξόδου. |
| pdfStream | java.io.OutputStream | Η ροή εξόδου για την εγγραφή του παραγόμενου PDF. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Επιλογές αποθήκευσης εγγράφου. |

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


Αφαιρεί ένα στοιχείο στη θέση  index  position από τη ενεργή σελίδα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να αφαιρεθεί το στοιχείο. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### removeDocumentAt(int index) {#removeDocumentAt-int-}
```
public void removeDocumentAt(int index)
```


Αφαιρεί ένα έγγραφο στη θέση  index  position.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να αφαιρεθεί ένα έγγραφο. |

### removePage(XpsPage page) {#removePage-com.aspose.xps.XpsPage-}
```
public XpsPage removePage(XpsPage page)
```


Αφαιρεί μια σελίδα από το έγγραφο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| page | [XpsPage](../../com.aspose.xps/xpspage) | Σελίδα προς αφαίρεση. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### removePageAt(int index) {#removePageAt-int-}
```
public XpsPage removePageAt(int index)
```


Αφαιρεί μια σελίδα από το έγγραφο στη θέση  index  position.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| δείκτης | int | Θέση στην οποία πρέπει να αφαιρεθεί μια σελίδα. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Removed page.
### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Αποθηκεύει το έγγραφο χρησιμοποιώντας το αντικείμενο  Device  .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Η  Device  παρουσία. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Επιλογές αποθήκευσης εγγράφου. |

### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


Αποθηκεύει το έγγραφο XPS σε ροή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ροή | java.io.OutputStream | Ροή εγγράφου XPS για αποθήκευση. |

### save(String path) {#save-java.lang.String-}
```
public void save(String path)
```


Αποθηκεύει το έγγραφο XPS στο αρχείο XPS που βρίσκεται στη  path .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| path | java.lang.String | Τοποθεσία του εγγράφου. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Αποθηκεύει το έγγραφο σε αρχείο εικόνας. Ο φάκελος εξόδου και το όνομα αρχείου θα είναι τα ίδια με το αρχείο XPS εισόδου. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο \"options\". Εάν το έγγραφο αρχικοποιήθηκε με ροή που δεν είναι FileInputStream, το αρχείο εικόνας θα αποθηκευτεί στον τρέχοντα φάκελο με προεπιλεγμένο πρότυπο ονόματος αρχείου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Επιλογές για αποθήκευση του εγγράφου σε μορφή bitmap εικόνας. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.xps.rendering.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Αποθηκεύει το έγγραφο σε αρχείο εικόνας στον καθορισμένο φάκελο με το καθορισμένο όνομα αρχείου. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο \"options\".

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Επιλογές για αποθήκευση του εγγράφου σε μορφή bitmap εικόνας. |
| outDir | java.lang.String | Ο φάκελος εξόδου όπου θα αποθηκευτεί το αρχείο εικόνας. |
| fileNameTemplate | java.lang.String | Το πρότυπο ονόματος αρχείου για την εικόνα (χωρίς επέκταση). Εάν το αρχείο XPS εισόδου είναι μονοσέλιδο, θα είναι ακριβώς το όνομα αρχείου, διαφορετικά \"\\_[n]\", όπου \"n\" - αριθμός σελίδας που ξεκινά από 1, θα προσαρτηθεί το επίθημα. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο \"option\". |

### saveAsImageBytes(ImageSaveOptions options) {#saveAsImageBytes-com.aspose.xps.rendering.ImageSaveOptions-}
```
public byte[][][] saveAsImageBytes(ImageSaveOptions options)
```


Αποθηκεύει το έγγραφο σε μορφή bitmap εικόνας ως πίνακες byte.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions) | Επιλογές για αποθήκευση του εγγράφου σε μορφή bitmap εικόνας. |

**Returns:**
byte[][][] - Οι τελικές byte ακολουθίες εικόνων. Η πρώτη διάσταση είναι για εσωτερικά έγγραφα και η δεύτερη για σελίδες εντός εσωτερικών εγγράφων.
### saveAsPdf(OutputStream stream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream stream, PdfSaveOptions options)
```


Αποθηκεύει το έγγραφο σε μορφή PDF.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ροή | java.io.OutputStream | Η ροή για την εγγραφή του αρχείου PDF εξόδου. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Επιλογές για αποθήκευση του εγγράφου σε μορφή PDF. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.xps.rendering.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Αποθηκεύει το έγγραφο σε μορφή PDF.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Η διαδρομή του εξαγώμενου αρχείου PDF. |
| options | [PdfSaveOptions](../../com.aspose.xps.rendering/pdfsaveoptions) | Επιλογές για αποθήκευση του εγγράφου σε μορφή PDF. |

### saveAsPs(OutputStream stream, PsSaveOptions options) {#saveAsPs-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(OutputStream stream, PsSaveOptions options)
```


Αποθηκεύει το έγγραφο σε μορφή PS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ροή | java.io.OutputStream | Η ροή για την εγγραφή του αρχείου PS εξόδου. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Επιλογές για αποθήκευση του εγγράφου σε μορφή PS. |

### saveAsPs(String outPsFilePath, PsSaveOptions options) {#saveAsPs-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public void saveAsPs(String outPsFilePath, PsSaveOptions options)
```


Αποθηκεύει το έγγραφο σε μορφή PostSscript.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Η διαδρομή του αρχείου PostScript εξόδου. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Επιλογές για αποθήκευση του εγγράφου σε μορφή PDF. |

### selectActiveDocument(int documentNumber) {#selectActiveDocument-int-}
```
public void selectActiveDocument(int documentNumber)
```


Επιλέγει ένα ενεργό έγγραφο για επεξεργασία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| documentNumber | int | Ένας αριθμός εγγράφου. |

### selectActivePage(int pageNumber) {#selectActivePage-int-}
```
public XpsPage selectActivePage(int pageNumber)
```


Επιλέγει μια ενεργή σελίδα εγγράφου για επεξεργασία.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pageNumber | int | Ένας αριθμός σελίδας. |

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) -  XpsPage  instance for active page.
### setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket) {#setDocumentPrintTicket-int-com.aspose.xps.metadata.DocumentPrintTicket-}
```
public void setDocumentPrintTicket(int documentIndex, DocumentPrintTicket printTicket)
```


Συνδέει το  printTicket  με το έγγραφο που έχει δείκτη  documentIndex .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| documentIndex | int | Δείκτης του εγγράφου για σύνδεση του εισιτηρίου εκτύπωσης. |
| printTicket | [DocumentPrintTicket](../../com.aspose.xps.metadata/documentprintticket) | Το εισιτήριο εκτύπωσης για σύνδεση. |

### setJobPrintTicket(JobPrintTicket value) {#setJobPrintTicket-com.aspose.xps.metadata.JobPrintTicket-}
```
public void setJobPrintTicket(JobPrintTicket value)
```


Ορίζει το εισιτήριο εκτύπωσης εργασίας του εγγράφου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| value | [JobPrintTicket](../../com.aspose.xps.metadata/jobprintticket) | Το εισιτήριο εκτύπωσης εργασίας του εγγράφου. |

### setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket) {#setPagePrintTicket-int-int-com.aspose.xps.metadata.PagePrintTicket-}
```
public void setPagePrintTicket(int documentIndex, int pageIndex, PagePrintTicket printTicket)
```


Συνδέει το  printTicket  με τη σελίδα που έχει δείκτη  pageIndex  στο έγγραφο που έχει δείκτη  documentIndex .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| documentIndex | int | Δείκτης του εγγράφου. |
| pageIndex | int | Δείκτης της σελίδας για σύνδεση του εισιτηρίου εκτύπωσης. |
| printTicket | [PagePrintTicket](../../com.aspose.xps.metadata/pageprintticket) | Το εισιτήριο εκτύπωσης για σύνδεση. |

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

