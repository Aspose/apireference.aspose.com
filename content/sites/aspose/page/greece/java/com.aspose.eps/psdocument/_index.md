---
title: "PsDocument"
second_title: "Αναφορά API του Aspose.Page για Java"
description: "Αυτή η κλάση περιλαμβάνει έγγραφα PS/EPS."
type: docs
weight: 16
url: /el/java/com.aspose.eps/psdocument/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Document](../../com.aspose.page/document)
```
public final class PsDocument extends Document
```

Αυτή η κλάση περιλαμβάνει έγγραφα PS/EPS.
## Κατασκευαστές

| Κατασκευαστής | Περιγραφή |
| --- | --- |
| [PsDocument()](#PsDocument--) | Αρχικοποιεί κενό  PsDocument  με αρχικοποιημένη σελίδα. |
| [PsDocument(String outPsFilePath, PsSaveOptions options)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Αρχικοποιεί κενό  PsDocument  με αρχικοποιημένη σελίδα. |
| [PsDocument(OutputStream psStream, PsSaveOptions options)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Αρχικοποιεί κενό  PsDocument  με αρχικοποιημένη σελίδα. |
| [PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-) | Αρχικοποιεί κενό  PsDocument . |
| [PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-) | Αρχικοποιεί κενό  PsDocument . |
| [PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)](#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-) | Αρχικοποιεί κενό  PsDocument  όταν ο αριθμός των σελίδων του εγγράφου Postscript είναι γνωστός εκ των προτέρων. |
| [PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)](#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-) | Αρχικοποιεί κενό  PsDocument  όταν ο αριθμός των σελίδων του εγγράφου Postscript είναι γνωστός εκ των προτέρων. |
| [PsDocument(String psFilePath)](#PsDocument-java.lang.String-) | Αρχικοποιεί  PsDocument  με ένα αρχείο εισόδου PS/EPS. |
| [PsDocument(InputStream psStream)](#PsDocument-java.io.InputStream-) | Αρχικοποιεί  PsDocument  με ροή αρχείου PS/EPS. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [clip(Shape s)](#clip-java.awt.Shape-) | Προσθέτει κλιπ στην τρέχουσα κατάσταση γραφικών. |
| [clipAndNewPath(Shape s)](#clipAndNewPath-java.awt.Shape-) | Προσθέτει κλιπ στην τρέχουσα κατάσταση γραφικών και στη συνέχεια γράφει τον τελεστή "newpath". |
| [clipRectangle(Rectangle2D.Float rect)](#clipRectangle-java.awt.geom.Rectangle2D.Float-) | Προσθέτει ορθογώνιο κλιπ στην τρέχουσα κατάσταση γραφικών. |
| [clipText(String text, Font font, float x, float y)](#clipText-java.lang.String-java.awt.Font-float-float-) | Προσθέτει κλιπ από το περίγραμμα του δεδομένου κειμένου σε δεδομένη γραμματοσειρά. |
| [closePage()](#closePage--) | Ολοκληρώνει την τρέχουσα σελίδα. |
| [convertType1FontToTTF(String type1FontFilePath, String outputDir)](#convertType1FontToTTF-java.lang.String-java.lang.String-) | Μετατρέπει τη γραμματοσειρά Type 1 σε TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)](#convertType3FontToTTF-java.lang.String-java.io.OutputStream-) | Μετατρέπει τη γραμματοσειρά Type 3 σε TrueType. |
| [convertType3FontToTTF(String type3FontFilePath, String outputDir)](#convertType3FontToTTF-java.lang.String-java.lang.String-) | Μετατρέπει τη γραμματοσειρά Type 3 σε TrueType. |
| [cropEps(OutputStream epsStream, float[] cropBox)](#cropEps-java.io.OutputStream-float---) | Κόβει το δεδομένο  PsDocument  ως αρχείο EPS. |
| [draw(Shape shape)](#draw-java.awt.Shape-) | Σχεδιάζει μια αυθαίρετη διαδρομή. |
| [drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)](#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-) | Σχεδιάζει εικόνα με μάσκα. |
| [drawImage(BufferedImage image)](#drawImage-java.awt.image.BufferedImage-) | Σχεδιάζει μια εικόνα. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Σχεδιάζει μετασχηματισμένη εικόνα με φόντο. |
| [drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)](#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-) | Σχεδιάζει μετασχηματισμένη διαφανή εικόνα με φόντο. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [extractEpsBoundingBox()](#extractEpsBoundingBox--) | Διαβάζει το αρχείο EPS και εξάγει το πλαίσιο περιγράμματος της εικόνας EPS από το σχόλιο %%BoundingBox ή τα όρια του προεπιλεγμένου μεγέθους σελίδας (0, 0, 595, 842) εάν δεν υπάρχει. |
| [extractEpsSize()](#extractEpsSize--) | Διαβάζει το αρχείο EPS και εξάγει το μέγεθος της εικόνας EPS από το σχόλιο %%BoundingBox ή το προεπιλεγμένο μέγεθος σελίδας (595, 842) εάν δεν υπάρχει. |
| [extractText(SaveOptions options, int startPage, int endPage)](#extractText-com.aspose.page.SaveOptions-int-int-) | Εξάγει κείμενο από αρχείο PS. |
| [fill(Shape shape)](#fill-java.awt.Shape-) | Γεμίστε ένα αυθαίρετο μονοπάτι. |
| [fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων και σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων και σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων και σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)](#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων και σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [fillText(String text, DrFont drFont, float x, float y)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων. |
| [fillText(String text, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων. |
| [fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)](#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων. |
| [fillText(String text, float[] advances, Font font, float x, float y)](#fillText-java.lang.String-float---java.awt.Font-float-float-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων. |
| [fillText(String text, float[] advances, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων. |
| [fillText(String text, Font font, float x, float y)](#fillText-java.lang.String-java.awt.Font-float-float-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων. |
| [fillText(String text, Font font, float x, float y, Paint fill)](#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων. |
| [getClass()](#getClass--) |  |
| [getInputStream()](#getInputStream--) |  |
| [getNumberOfPages()](#getNumberOfPages--) | Λαμβάνει τον αριθμό των σελίδων στο τελικό έγγραφο PDF. |
| [getPaint()](#getPaint--) | Λαμβάνει το χρώμα στην τρέχουσα κατάσταση γραφικών. |
| [getStroke()](#getStroke--) | Λαμβάνει το περίγραμμα στην τρέχουσα κατάσταση γραφικών. |
| [getXmpMetadata()](#getXmpMetadata--) | Διαβάζει αρχείο PS/EPS και εξάγει τα XmpMetdata αν υπάρχουν ήδη ή προσθέτει νέα αν δεν υπάρχουν. |
| [hashCode()](#hashCode--) |  |
| [isLicensed()](#isLicensed--) | Δείχνει αν η άδεια προϊόντος Aspose.Page για Java είναι προσπελάσιμη και έγκυρη. |
| [merge(String[] filesForMerge, Device device, SaveOptions options)](#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-) | Συγχωνεύει αρχεία PS/EPS σε μια συσκευή. |
| [mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-) | Συγχωνεύει αρχεία PS/EPS σε μια συσκευή. |
| [mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)](#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-) | Συγχωνεύει αρχεία PS/EPS σε μια συσκευή. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) | Δημιουργεί νέα σελίδα και την καθιστά τρέχουσα. |
| [openPage(String pageName)](#openPage-java.lang.String-) | Δημιουργεί νέα σελίδα με το μέγεθος του εγγράφου και την καθιστά τρέχουσα. |
| [outlineText(String text, DrFont drFont, float x, float y)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [outlineText(String text, float[] advances, Font font, float x, float y)](#outlineText-java.lang.String-float---java.awt.Font-float-float-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [outlineText(String text, Font font, float x, float y)](#outlineText-java.lang.String-java.awt.Font-float-float-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)](#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-) | Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων. |
| [resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)](#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-) | Αλλάζει το μέγεθος του δοσμένου PsDocument ως αρχείο EPS. |
| [rotate(float angleRadians)](#rotate-float-) | Προσθέτει περιστροφή αριστερόστροφα γύρω από το αρχικό σημείο στην τρέχουσα κατάσταση γραφικών (περιστροφή τρέχουσας μήτρας). |
| [rotate(int angleDegrees)](#rotate-int-) | Προσθέτει περιστροφή αριστερόστροφα γύρω από το αρχικό σημείο στην τρέχουσα κατάσταση γραφικών (περιστροφή τρέχουσας μήτρας). |
| [save()](#save--) | Αποθηκεύει το δοσμένο PsDocument ως αρχείο PS ή EPS. |
| [save(Device device, SaveOptions options)](#save-com.aspose.page.Device-com.aspose.page.SaveOptions-) | Αποθηκεύει το αρχείο PS/EPS σε μια συσκευή. |
| [save(OutputStream epsStream)](#save-java.io.OutputStream-) | Αποθηκεύει το δοσμένο PsDocument στη ροή. |
| [save(String outEpsFilePath)](#save-java.lang.String-) | Αποθηκεύει το δοσμένο PsDocument ως αρχείο EPS. |
| [saveAsImage(ImageSaveOptions options)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-) | Αποθηκεύει το αρχείο PS/EPS σε αρχείο εικόνας. |
| [saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)](#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-) | Αποθηκεύει το αρχείο PS/EPS σε αρχείο εικόνας στον καθορισμένο φάκελο με το καθορισμένο όνομα αρχείου. |
| [saveAsImagesBytes(ImageSaveOptions options)](#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-) | Αποθηκεύει το αρχείο PS/EPS σε πίνακες byte εικόνων. |
| [saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)](#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-) | Αποθηκεύει το αρχείο PS/EPS σε ροή εξόδου PDF. |
| [saveAsPdf(String outPdfFilePath, PdfSaveOptions options)](#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-) | Αποθηκεύει το αρχείο PS/EPS σε αρχείο PDF. |
| [saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Αποθηκεύει το αντικείμενο BufferedImage σε αρχείο EPS. |
| [saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Αποθηκεύει το αντικείμενο BufferedImage σε αρχείο EPS. |
| [saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)](#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-) | Αποθηκεύει εικόνα PNG/JPEG/BMP/GIF από τη ροή εισόδου σε ροή εξόδου EPS. |
| [saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)](#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-) | Αποθηκεύει εικόνα PNG/JPEG/BMP/GIF από αρχείο σε αρχείο EPS. |
| [scale(float xScale, float yScale)](#scale-float-float-) | Προσθέτει κλίμακα στην τρέχουσα κατάσταση γραφικών (κλίμακα τρέχουσας μήτρας). |
| [setInputStream(InputStream is)](#setInputStream-java.io.InputStream-) | Καθορίζει μια ροή εισόδου. |
| [setPageDevice(Map<String,Object> pageParams)](#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--) | Ορίζει παραμέτρους συσκευής σελίδας (δείτε τον τελεστή "setpagedevice" στην προδιαγραφή PostScript). |
| [setPageSize(float width, float height)](#setPageSize-float-float-) | Ορίζει το μέγεθος της σελίδας. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Ορίζει το χρώμα στην τρέχουσα κατάσταση γραφικών. |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Ορίζει το στίγμα στην τρέχουσα κατάσταση γραφικών. |
| [setTransform(AffineTransform matrix)](#setTransform-java.awt.geom.AffineTransform-) | Ορίστε τον τρέχοντα μετασχηματισμό σε αυτόν. |
| [shear(float shx, float shy)](#shear-float-float-) | Προσθέτει παραμόρφωση shear στην τρέχουσα κατάσταση γραφικών (shear τρέχουσας μήτρας). |
| [toString()](#toString--) |  |
| [transform(AffineTransform matrix)](#transform-java.awt.geom.AffineTransform-) | Προσθέτει μετασχηματισμό στην τρέχουσα κατάσταση γραφικών (συνενώνει αυτή τη μήτρα με την τρέχουσα). |
| [translate(float x, float y)](#translate-float-float-) | Προσθέτει μετάθεση στην τρέχουσα κατάσταση γραφικών (μετατοπίζει την τρέχουσα μήτρα). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeGraphicsRestore()](#writeGraphicsRestore--) | Γράφει την αποκατάσταση της τρέχουσας κατάστασης γραφικών (δείτε την προδιαγραφή PostScript για τον τελεστή "grestore"). |
| [writeGraphicsSave()](#writeGraphicsSave--) | Γράφει την αποθήκευση της τρέχουσας κατάστασης γραφικών (δείτε την προδιαγραφή PostScript για τον τελεστή "gsave"). |
### PsDocument() {#PsDocument--}
```
public PsDocument()
```


Αρχικοποιεί κενό  PsDocument  με αρχικοποιημένη σελίδα. Αυτός ο κατασκευαστής χρησιμοποιείται μόνο για πρόσθετες λειτουργίες που δεν σχετίζονται με αρχεία PostScript, για παράδειγμα, μετατροπή γραμματοσειρών.

### PsDocument(String outPsFilePath, PsSaveOptions options) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options)
```


Αρχικοποιεί κενό  PsDocument  με αρχικοποιημένη σελίδα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Η διαδρομή εξόδου αρχείου PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση του αρχείου PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options)
```


Αρχικοποιεί κενό  PsDocument  με αρχικοποιημένη σελίδα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| psStream | java.io.OutputStream | Ροή όπου θα αποθηκευτεί το αρχείο PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση του αρχείου PostScript. |

### PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, boolean multipaged)
```


Αρχικοποιεί κενό  PsDocument .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Η διαδρομή εξόδου αρχείου PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση του αρχείου PostScript. |
| multipaged | boolean | Εάν είναι false, η σελίδα δεν θα αρχικοποιηθεί. Σε αυτήν την περίπτωση η αρχικοποίηση της σελίδας πρέπει να γίνει μέσω της ρητής κλήσης "openPage(width, height)". |

### PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-boolean-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, boolean multipaged)
```


Αρχικοποιεί κενό  PsDocument .

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| psStream | java.io.OutputStream | Ροή όπου θα αποθηκευτεί το αρχείο PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση του αρχείου PostScript. |
| multipaged | boolean | Εάν είναι false, η σελίδα δεν θα αρχικοποιηθεί. Σε αυτήν την περίπτωση η αρχικοποίηση της σελίδας πρέπει να γίνει μέσω της ρητής κλήσης "openPage(width, height)". |

### PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages) {#PsDocument-java.lang.String-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(String outPsFilePath, PsSaveOptions options, int numberOfPages)
```


Αρχικοποιεί κενό  PsDocument  όταν ο αριθμός των σελίδων του εγγράφου Postscript είναι γνωστός εκ των προτέρων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outPsFilePath | java.lang.String | Η διαδρομή εξόδου αρχείου PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση του αρχείου PostScript. |
| numberOfPages | int | Ο αριθμός των σελίδων στο έγγραφο PostScript. |

### PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages) {#PsDocument-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-int-}
```
public PsDocument(OutputStream psStream, PsSaveOptions options, int numberOfPages)
```


Αρχικοποιεί κενό  PsDocument  όταν ο αριθμός των σελίδων του εγγράφου Postscript είναι γνωστός εκ των προτέρων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| psStream | java.io.OutputStream | Ροή όπου θα αποθηκευτεί το αρχείο PS/EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Ένα σύνολο παραμέτρων που ελέγχουν την αποθήκευση του αρχείου PostScript. |
| numberOfPages | int | Ο αριθμός των σελίδων στο έγγραφο PostScript. |

### PsDocument(String psFilePath) {#PsDocument-java.lang.String-}
```
public PsDocument(String psFilePath)
```


Αρχικοποιεί  PsDocument  με ένα αρχείο εισόδου PS/EPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| psFilePath | java.lang.String | Διαδρομή αρχείου PS/EPS. |

### PsDocument(InputStream psStream) {#PsDocument-java.io.InputStream-}
```
public PsDocument(InputStream psStream)
```


Αρχικοποιεί  PsDocument  με ροή αρχείου PS/EPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| psStream | java.io.InputStream | Ροή αρχείου PS/EPS. |

### clip(Shape s) {#clip-java.awt.Shape-}
```
public void clip(Shape s)
```


Προσθέτει κλιπ στην τρέχουσα κατάσταση γραφικών.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| s | java.awt.Shape | Η διαδρομή αποκοπής. |

### clipAndNewPath(Shape s) {#clipAndNewPath-java.awt.Shape-}
```
public void clipAndNewPath(Shape s)
```


Προσθέτει αποκοπή στην τρέχουσα κατάσταση γραφικών και στη συνέχεια γράφει τον τελεστή "newpath". Είναι απαραίτητο για να αποφευχθεί η σύγκρουση αυτής της διαδρομής αποκοπής με ορισμένες επόμενες διαδρομές, όπως γλύφοι που περιγράφονται με τον τελεστή "charpath".

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| s | java.awt.Shape | Η διαδρομή αποκοπής. |

### clipRectangle(Rectangle2D.Float rect) {#clipRectangle-java.awt.geom.Rectangle2D.Float-}
```
public void clipRectangle(Rectangle2D.Float rect)
```


Προσθέτει ορθογώνιο κλιπ στην τρέχουσα κατάσταση γραφικών.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| ορθογώνιο | java.awt.geom.Rectangle2D.Float | Το ορθογώνιο αποκοπής. |

### clipText(String text, Font font, float x, float y) {#clipText-java.lang.String-java.awt.Font-float-float-}
```
public void clipText(String text, Font font, float x, float y)
```


Προσθέτει κλιπ από το περίγραμμα του δεδομένου κειμένου σε δεδομένη γραμματοσειρά.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο. |
| γραμματοσειρά | java.awt.Font | Η γραμματοσειρά. |
| x | float | Μία συντεταγμένη X της θέσης του κειμένου. |
| y | float |  |

### closePage() {#closePage--}
```
public void closePage()
```


Ολοκληρώνει την τρέχουσα σελίδα.

### convertType1FontToTTF(String type1FontFilePath, String outputDir) {#convertType1FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType1FontToTTF(String type1FontFilePath, String outputDir)
```


Μετατρέπει τη γραμματοσειρά Type 1 σε TrueType. Το όνομα του μετατρεπόμενου αρχείου γραμματοσειράς TTF θα είναι το ίδιο με τη γραμματοσειρά Type 1 εισόδου με επέκταση ".ttf". Το αρχείο TTF θα αποθηκευτεί στον καθορισμένο φάκελο εξόδου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| type1FontFilePath | java.lang.String | Η διαδρομή αρχείου γραμματοσειράς Type 1.. |
| outputDir | java.lang.String | Φάκελος εξόδου όπου θα αποθηκευτεί η προκύπτουσα γραμματοσειρά TrueType. |

### convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream) {#convertType3FontToTTF-java.lang.String-java.io.OutputStream-}
```
public void convertType3FontToTTF(String type3FontFilePath, OutputStream outputStream)
```


Μετατρέπει τη γραμματοσειρά Type 3 σε TrueType. Το αρχείο TTF θα αποθηκευτεί στην παρεχόμενη ροή εξόδου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Η διαδρομή αρχείου γραμματοσειράς Type 3. |
| outputStream | java.io.OutputStream | Ροή εξόδου όπου θα αποθηκευτεί η προκύπτουσα γραμματοσειρά TrueType. |

### convertType3FontToTTF(String type3FontFilePath, String outputDir) {#convertType3FontToTTF-java.lang.String-java.lang.String-}
```
public void convertType3FontToTTF(String type3FontFilePath, String outputDir)
```


Μετατρέπει τη γραμματοσειρά Type 3 σε TrueType. Το όνομα του μετατρεπόμενου αρχείου γραμματοσειράς TTF θα είναι το ίδιο με τη γραμματοσειρά Type 3 εισόδου με επέκταση ".ttf". Το αρχείο TTF θα αποθηκευτεί στον καθορισμένο φάκελο εξόδου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| type3FontFilePath | java.lang.String | Η διαδρομή αρχείου γραμματοσειράς Type 3.. |
| outputDir | java.lang.String | Φάκελος εξόδου όπου θα αποθηκευτεί η προκύπτουσα γραμματοσειρά TrueType. |

### cropEps(OutputStream epsStream, float[] cropBox) {#cropEps-java.io.OutputStream-float---}
```
public void cropEps(OutputStream epsStream, float[] cropBox)
```


Κόβει το δοσμένο PsDocument ως αρχείο EPS. Αποθηκεύει το αρχικό αρχείο EPS με ενημερωμένο υπάρχον %%BoundingBox ή δημιουργείται νέο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| cropBox | float[] | Το πλαίσιο περικοπής (x0, y0, x, y). |

### draw(Shape shape) {#draw-java.awt.Shape-}
```
public void draw(Shape shape)
```


Σχεδιάζει μια αυθαίρετη διαδρομή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| shape | java.awt.Shape | Η διαδρομή για γέμισμα. |

### drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform) {#drawExplicitImageMask-java.awt.image.BufferedImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-}
```
public void drawExplicitImageMask(BufferedImage image24bpp, BufferedImage alphaMask1bpp, AffineTransform transform)
```


Σχεδιάζει εικόνα με μάσκα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| image24bpp | java.awt.image.BufferedImage | Η εικόνα για σχεδίαση. Πρέπει να είναι σε μορφή εικόνας 24bpp RGB |
| alphaMask1bpp | java.awt.image.BufferedImage | Η μάσκα εικόνας. Πρέπει να είναι σε μορφή εικόνας 1bpp. |
| transform | java.awt.geom.AffineTransform | Η μήτρα για μετασχηματισμό της εικόνας. |

### drawImage(BufferedImage image) {#drawImage-java.awt.image.BufferedImage-}
```
public void drawImage(BufferedImage image)
```


Σχεδιάζει μια εικόνα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Η εικόνα για σχεδίαση. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Σχεδιάζει μετασχηματισμένη εικόνα με φόντο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Η εικόνα για σχεδίαση. |
| transform | java.awt.geom.AffineTransform | Η μήτρα για μετασχηματισμό της εικόνας. |
| bkg | java.awt.Color | Το φόντο για την εικόνα. |

### drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold) {#drawTransparentImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-int-}
```
public void drawTransparentImage(BufferedImage image, AffineTransform transform, int transparencyThreshold)
```


Σχεδιάστε τη μετασχηματισμένη διαφανή εικόνα με φόντο. Εάν η εικόνα δεν έχει κανάλι Alpha, θα σχεδιαστεί ως αδιαφανής εικόνα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Η εικόνα για σχεδίαση. |
| transform | java.awt.geom.AffineTransform | Η μήτρα για μετασχηματισμό της εικόνας. |
| transparencyThreshold | int | Ένα όριο που ορίζει από ποια τιμή διαφάνειας το pixel θα θεωρείται πλήρως διαφανές. Όλες οι τιμές κάτω από αυτό το όριο θα θεωρούνται πλήρως αδιαφανείς. |

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
### extractEpsBoundingBox() {#extractEpsBoundingBox--}
```
public int[] extractEpsBoundingBox()
```


Διαβάζει το αρχείο EPS και εξάγει το πλαίσιο περιγράμματος της εικόνας EPS από το σχόλιο %%BoundingBox ή τα όρια του προεπιλεγμένου μεγέθους σελίδας (0, 0, 595, 842) εάν δεν υπάρχει.

**Returns:**
int[] - Το πλαίσιο περιγράμματος της εικόνας EPS.
### extractEpsSize() {#extractEpsSize--}
```
public Dimension extractEpsSize()
```


Διαβάζει το αρχείο EPS και εξάγει το μέγεθος της εικόνας EPS από το σχόλιο %%BoundingBox ή το προεπιλεγμένο μέγεθος σελίδας (595, 842) εάν δεν υπάρχει.

**Returns:**
java.awt.Dimension - Το μέγεθος της εικόνας EPS.
### extractText(SaveOptions options, int startPage, int endPage) {#extractText-com.aspose.page.SaveOptions-int-int-}
```
public String extractText(SaveOptions options, int startPage, int endPage)
```


Εξάγει κείμενο από αρχείο PS. Λειτουργεί μόνο για κείμενο που είναι γραμμένο με γραμματοσειρές TrueType (Type 42) ή σύνθετες γραμματοσειρές (Type 0) που αποτελούνται από γραμματοσειρές TrueType.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Οι επιλογές αποθήκευσης. |
| startPage | int | Η σελίδα από την οποία, συμπεριλαμβανομένης, ξεκινά η εξαγωγή κειμένου. |
| endPage | int | Η σελίδα από την οποία θα εξαχθεί κείμενο συμπεριληπτικά. |

**Returns:**
java.lang.String - Το κείμενο που περιέχεται στις επιλεγμένες σελίδες του αρχείου PS.
### fill(Shape shape) {#fill-java.awt.Shape-}
```
public void fill(Shape shape)
```


Γεμίστε ένα αυθαίρετο μονοπάτι.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| shape | java.awt.Shape | Η διαδρομή για γέμισμα. |

### fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων και σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fillPaint | java.awt.Paint | Το γέμισμα που χρησιμοποιείται για τη βαφή του εσωτερικού των γλυφών. |
| strokePaint | java.awt.Paint | Το  java.awt.Paint  που χρησιμοποιείται για τη βαφή των περιγραμμάτων των γλυφών. Μπορεί να είναι οποιαδήποτε υποκλάση της κλάσης  java.awt.Paint  στο JDK. |
| stroke | java.awt.Stroke | Το στυλ γραμμής που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

### fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, DrFont drFont, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων και σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| advances | float[] | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fillPaint | java.awt.Paint | Το γέμισμα που χρησιμοποιείται για τη βαφή του εσωτερικού των γλυφών. |
| strokePaint | java.awt.Paint | Το  java.awt.Paint  που χρησιμοποιείται για τη βαφή των περιγραμμάτων των γλυφών. Μπορεί να είναι οποιαδήποτε υποκλάση της κλάσης  java.awt.Paint  στο JDK. |
| stroke | java.awt.Stroke | Το στυλ γραμμής που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

### fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, float[] advances, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων και σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. advances Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| advances | float[] |  |
| γραμματοσειρά | java.awt.Font | Γραμματοσειρά συστήματος που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fillPaint | java.awt.Paint | Το γέμισμα που χρησιμοποιείται για τη βαφή του εσωτερικού των γλυφών. |
| strokePaint | java.awt.Paint | Το  java.awt.Paint  που χρησιμοποιείται για τη βαφή των περιγραμμάτων των γλυφών. Μπορεί να είναι οποιαδήποτε υποκλάση της κλάσης  java.awt.Paint  στο JDK. |
| stroke | java.awt.Stroke | Το στυλ γραμμής που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

### fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke) {#fillAndStrokeText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Paint-java.awt.Stroke-}
```
public void fillAndStrokeText(String text, Font font, float x, float y, Paint fillPaint, Paint strokePaint, Stroke stroke)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων και σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| γραμματοσειρά | java.awt.Font | Γραμματοσειρά συστήματος που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fillPaint | java.awt.Paint | Το γέμισμα που χρησιμοποιείται για τη βαφή του εσωτερικού των γλυφών. |
| strokePaint | java.awt.Paint | Το  java.awt.Paint  που χρησιμοποιείται για τη βαφή των περιγραμμάτων των γλυφών. Μπορεί να είναι οποιαδήποτε υποκλάση της κλάσης  java.awt.Paint  στο JDK. |
| stroke | java.awt.Stroke | Το στυλ γραμμής που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

### fillText(String text, DrFont drFont, float x, float y) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, DrFont drFont, float x, float y)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |

### fillText(String text, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, DrFont drFont, float x, float y, Paint fill)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fill | java.awt.Paint | Το γέμισμα που χρησιμοποιείται για τη βαφή των γλυφών. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| advances | float[] | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |

### fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill) {#fillText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, DrFont drFont, float x, float y, Paint fill)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| advances | float[] | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fill | java.awt.Paint | Το γέμισμα που χρησιμοποιείται για τη βαφή των γλυφών. |

### fillText(String text, float[] advances, Font font, float x, float y) {#fillText-java.lang.String-float---java.awt.Font-float-float-}
```
public void fillText(String text, float[] advances, Font font, float x, float y)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| advances | float[] | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| γραμματοσειρά | java.awt.Font | Γραμματοσειρά συστήματος που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |

### fillText(String text, float[] advances, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, float[] advances, Font font, float x, float y, Paint fill)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| advances | float[] | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| γραμματοσειρά | java.awt.Font | Η γραμματοσειρά που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fill | java.awt.Paint | Το γέμισμα που χρησιμοποιείται για τη βαφή των γλυφών. |

### fillText(String text, Font font, float x, float y) {#fillText-java.lang.String-java.awt.Font-float-float-}
```
public void fillText(String text, Font font, float x, float y)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| γραμματοσειρά | java.awt.Font | Γραμματοσειρά συστήματος που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |

### fillText(String text, Font font, float x, float y, Paint fill) {#fillText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-}
```
public void fillText(String text, Font font, float x, float y, Paint fill)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά γεμίζοντας το εσωτερικό των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| γραμματοσειρά | java.awt.Font | Η γραμματοσειρά που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| fill | java.awt.Paint | Το γέμισμα που χρησιμοποιείται για τη βαφή των γλυφών. |

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getInputStream() {#getInputStream--}
```
public InputStream getInputStream()
```




**Returns:**
java.io.InputStream
### getNumberOfPages() {#getNumberOfPages--}
```
public int getNumberOfPages()
```


Λαμβάνει τον αριθμό των σελίδων στο τελικό έγγραφο PDF.

**Returns:**
int - ο αριθμός των σελίδων.
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Λαμβάνει το χρώμα στην τρέχουσα κατάσταση γραφικών.

**Returns:**
java.awt.Paint - Τρέχον χρώμα.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Λαμβάνει το περίγραμμα στην τρέχουσα κατάσταση γραφικών.

**Returns:**
java.awt.Stroke - Τρέχουσα γραμμή.
### getXmpMetadata() {#getXmpMetadata--}
```
public XmpMetadata getXmpMetadata()
```


Διαβάζει αρχείο PS/EPS και εξάγει τα XmpMetdata αν υπάρχουν ήδη ή προσθέτει νέα αν δεν υπάρχουν.

**Returns:**
[XmpMetadata](../../com.aspose.eps.xmp/xmpmetadata) - existing or new instance of XMP metadata.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLicensed() {#isLicensed--}
```
public boolean isLicensed()
```


Δείχνει αν η άδεια προϊόντος Aspose.Page για Java είναι προσπελάσιμη και έγκυρη.

**Returns:**
boolean - τιμή boolean
### merge(String[] filesForMerge, Device device, SaveOptions options) {#merge-java.lang.String---com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void merge(String[] filesForMerge, Device device, SaveOptions options)
```


Συγχωνεύει αρχεία PS/EPS σε μια συσκευή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| filesForMerge | java.lang.String[] | Αρχεία PS/EPS για συγχώνευση με αυτό το αρχείο σε μια συσκευή εξόδου. |
| device | [Device](../../com.aspose.page/device) | Μια συσκευή εξόδου. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Περιέχει σημαίες που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

### mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.io.OutputStream-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(OutputStream pdfStream, String[] filesForMerge, SaveOptions options)
```


Συγχωνεύει αρχεία PS/EPS σε μια συσκευή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Ροή εξόδου PDF. |
| filesForMerge | java.lang.String[] | Αρχεία PS/EPS για συγχώνευση με αυτό το αρχείο σε μια συσκευή εξόδου. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Περιέχει σημαίες που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

### mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options) {#mergeToPdf-java.lang.String-java.lang.String---com.aspose.page.SaveOptions-}
```
public void mergeToPdf(String outPdfFilePath, String[] filesForMerge, SaveOptions options)
```


Συγχωνεύει αρχεία PS/EPS σε μια συσκευή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Διαδρομή αρχείου εξόδου PDF. |
| filesForMerge | java.lang.String[] | Αρχεία PS/EPS για συγχώνευση με αυτό το αρχείο σε μια συσκευή εξόδου. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Περιέχει σημαίες που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

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
public void openPage(float width, float height)
```


Δημιουργεί νέα σελίδα και την καθιστά τρέχουσα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | float | Το πλάτος της νέας σελίδας. |
| height | float | Το ύψος της νέας σελίδας. |

### openPage(String pageName) {#openPage-java.lang.String-}
```
public void openPage(String pageName)
```


Δημιουργεί νέα σελίδα με το μέγεθος του εγγράφου και την καθιστά τρέχουσα.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pageName | java.lang.String | Το όνομα της νέας σελίδας. Εάν είναι null, το όνομα της σελίδας θα είναι ένας αριθμός σειράς της σελίδας. |

### outlineText(String text, DrFont drFont, float x, float y) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, DrFont drFont, float x, float y)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |

### outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| outlinePaint | java.awt.Paint | Το  java.awt.Paint  που χρησιμοποιείται για τη βαφή των περιγραμμάτων των γλυφών. Μπορεί να είναι οποιαδήποτε υποκλάση της κλάσης  java.awt.Paint  στο JDK. |
| stroke | java.awt.Stroke | Το στυλ γραμμής που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| advances | float[] | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |

### outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---com.aspose.foundation.drawing.DrFont-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, DrFont drFont, float x, float y, Paint outlinePaint, Stroke stroke)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| advances | float[] | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| drFont | com.aspose.foundation.drawing.DrFont | DrFont που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. Μπορεί να χρησιμοποιηθεί με προσαρμοσμένη γραμματοσειρά που βρίσκεται σε προσαρμοσμένο φάκελο. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| outlinePaint | java.awt.Paint | Το  java.awt.Paint  που χρησιμοποιείται για τη βαφή των περιγραμμάτων των γλυφών. Μπορεί να είναι οποιαδήποτε υποκλάση της κλάσης  java.awt.Paint  στο JDK. |
| stroke | java.awt.Stroke | Το στυλ γραμμής που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

### outlineText(String text, float[] advances, Font font, float x, float y) {#outlineText-java.lang.String-float---java.awt.Font-float-float-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| advances | float[] | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| γραμματοσειρά | java.awt.Font | Γραμματοσειρά συστήματος που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |

### outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-float---java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, float[] advances, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| advances | float[] | Ένας πίνακας πλάτους γλυφών. Το μήκος του πρέπει να συμφωνεί με τον αριθμό των γλυφών στη συμβολοσειρά. |
| γραμματοσειρά | java.awt.Font | Η γραμματοσειρά που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| outlinePaint | java.awt.Paint | Το  java.awt.Paint  που χρησιμοποιείται για τη βαφή των περιγραμμάτων των γλυφών. Μπορεί να είναι οποιαδήποτε υποκλάση της κλάσης  java.awt.Paint  στο JDK. |
| stroke | java.awt.Stroke | Το στυλ γραμμής που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

### outlineText(String text, Font font, float x, float y) {#outlineText-java.lang.String-java.awt.Font-float-float-}
```
public void outlineText(String text, Font font, float x, float y)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| γραμματοσειρά | java.awt.Font | Γραμματοσειρά συστήματος που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |

### outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke) {#outlineText-java.lang.String-java.awt.Font-float-float-java.awt.Paint-java.awt.Stroke-}
```
public void outlineText(String text, Font font, float x, float y, Paint outlinePaint, Stroke stroke)
```


Προσθέτει μια αλφαριθμητική συμβολοσειρά σχεδιάζοντας τα περιγράμματα των γλύφων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| κείμενο | java.lang.String | Το κείμενο προς προσθήκη. |
| γραμματοσειρά | java.awt.Font | Η γραμματοσειρά που θα χρησιμοποιηθεί για τη σχεδίαση κειμένου. |
| x | float | Συντεταγμένη X για την αρχή του κειμένου. |
| y | float | Συντεταγμένη Y για την αρχή του κειμένου. |
| outlinePaint | java.awt.Paint | Το  java.awt.Paint  που χρησιμοποιείται για τη βαφή των περιγραμμάτων των γλυφών. Μπορεί να είναι οποιαδήποτε υποκλάση της κλάσης  java.awt.Paint  στο JDK. |
| stroke | java.awt.Stroke | Το στυλ γραμμής που χρησιμοποιείται για τη σχεδίαση των περιγραμμάτων των γλυφών. |

### resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units) {#resizeEps-java.io.OutputStream-com.aspose.page.DimensionF-com.aspose.page.Units-}
```
public void resizeEps(OutputStream epsStream, DimensionF newSizeInUnits, Units units)
```


Αλλάζει το μέγεθος του δεδομένου PsDocument ως αρχείο EPS. Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την εξαγωγή του μεγέθους EPS. Αποθηκεύει το αρχικό αρχείο EPS με ενημερωμένο υπάρχον %%BoundingBox ή θα δημιουργηθεί νέο. Ο πίνακας μετασχηματισμού της σελίδας επίσης θα οριστεί.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| epsStream | java.io.OutputStream |  |
| newSizeInUnits | [DimensionF](../../com.aspose.page/dimensionf) | Νέο μέγεθος εικόνας EPS στις καθορισμένες μονάδες. |
| units | [Units](../../com.aspose.page/units) | Οι μονάδες του νέου μεγέθους. Μπορούν να είναι σημεία, ίντσες, χιλιοστά, εκατοστά και ποσοστά του αρχικού μεγέθους. |

### rotate(float angleRadians) {#rotate-float-}
```
public void rotate(float angleRadians)
```


Προσθέτει περιστροφή αριστερόστροφα γύρω από το αρχικό σημείο στην τρέχουσα κατάσταση γραφικών (περιστροφή τρέχουσας μήτρας).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| angleRadians | float | Η γωνία περιστροφής σε ακτίνια. |

### rotate(int angleDegrees) {#rotate-int-}
```
public void rotate(int angleDegrees)
```


Προσθέτει περιστροφή αριστερόστροφα γύρω από το αρχικό σημείο στην τρέχουσα κατάσταση γραφικών (περιστροφή τρέχουσας μήτρας).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| angleDegrees | int | Η γωνία περιστροφής σε μοίρες. |

### save() {#save--}
```
public void save()
```


Αποθηκεύει το δεδομένο PsDocument ως αρχείο PS ή EPS. Αυτή η μέθοδος χρησιμοποιείται μόνο όταν το PsDocument δημιουργήθηκε από την αρχή.

### save(Device device, SaveOptions options) {#save-com.aspose.page.Device-com.aspose.page.SaveOptions-}
```
public void save(Device device, SaveOptions options)
```


Αποθηκεύει το αρχείο PS/EPS σε μια συσκευή.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| device | [Device](../../com.aspose.page/device) | Μια συσκευή εξόδου. |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Περιέχει σημαίες που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

### save(OutputStream epsStream) {#save-java.io.OutputStream-}
```
public void save(OutputStream epsStream)
```


Αποθηκεύει το δεδομένο PsDocument στο ρεύμα. Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την ενημέρωση των μεταδεδομένων XMP. Αποθηκεύει το αρχικό αρχείο EPS με ενημερωμένα υπάρχοντα μεταδεδομένα ή νέο που δημιουργείται κατά την κλήση της μεθόδου getMetadata. Στην τελευταία περίπτωση προστίθεται όλος ο απαραίτητος κώδικας PostScript και τα σχόλια EPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| epsStream | java.io.OutputStream | Ροή αρχείου EPS εξόδου. |

### save(String outEpsFilePath) {#save-java.lang.String-}
```
public void save(String outEpsFilePath)
```


Αποθηκεύει το δεδομένο PsDocument ως αρχείο EPS. Αυτή η μέθοδος χρησιμοποιείται μόνο μετά την ενημέρωση των μεταδεδομένων XMP. Αποθηκεύει το αρχικό αρχείο EPS με ενημερωμένα υπάρχοντα μεταδεδομένα ή νέο που δημιουργείται κατά την κλήση της μεθόδου getMetadata. Στην τελευταία περίπτωση προστίθεται όλος ο απαραίτητος κώδικας PostScript και τα σχόλια EPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outEpsFilePath | java.lang.String | Μια διαδρομή εξόδου αρχείου EPS.. |

### saveAsImage(ImageSaveOptions options) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-}
```
public void saveAsImage(ImageSaveOptions options)
```


Αποθηκεύει το αρχείο PS/EPS σε αρχείο εικόνας. Ο φάκελος εξόδου και το όνομα αρχείου θα είναι τα ίδια με αυτά του εισερχόμενου αρχείου PS. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο "options". Εάν το έγγραφο αρχικοποιήθηκε με ροή που δεν προέρχεται από FileInputStream, το αρχείο εικόνας θα αποθηκευτεί στον τρέχοντα φάκελο με προεπιλεγμένο πρότυπο ονόματος αρχείου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Περιέχει τις απαραίτητες παραμέτρους για την αποθήκευση της εικόνας και σημαίες που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

### saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate) {#saveAsImage-com.aspose.eps.device.ImageSaveOptions-java.lang.String-java.lang.String-}
```
public void saveAsImage(ImageSaveOptions options, String outDir, String fileNameTemplate)
```


Αποθηκεύει το αρχείο PS/EPS σε αρχείο εικόνας στον καθορισμένο φάκελο με το καθορισμένο όνομα αρχείου. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο "options".

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Περιέχει τις απαραίτητες παραμέτρους για την αποθήκευση της εικόνας και σημαίες που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |
| outDir | java.lang.String | Ο φάκελος εξόδου όπου θα αποθηκευτεί το αρχείο εικόνας. |
| fileNameTemplate | java.lang.String | Το πρότυπο ονόματος αρχείου για την εικόνα (χωρίς επέκταση). Εάν το εισερχόμενο αρχείο PS/EPS είναι μονόσέλιδο, θα είναι ακριβώς το όνομα αρχείου, αλλιώς "\_[n]", όπου "n" - ο αριθμός της σελίδας ξεκινώντας από 0, θα προσαρτηθεί επίθεμα σε αυτό. Η επέκταση αρχείου θα αντιστοιχεί στη μορφή εικόνας στην παράμετρο "option". |

### saveAsImagesBytes(ImageSaveOptions options) {#saveAsImagesBytes-com.aspose.eps.device.ImageSaveOptions-}
```
public byte[][] saveAsImagesBytes(ImageSaveOptions options)
```


Αποθηκεύει το αρχείο PS/EPS σε πίνακες byte εικόνων.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| options | [ImageSaveOptions](../../com.aspose.eps.device/imagesaveoptions) | Περιέχει τις απαραίτητες παραμέτρους για την αποθήκευση της εικόνας και σημαίες που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

**Returns:**
byte[][] - Bytes εικόνων. Ένας πίνακας byte για κάθε σελίδα.
### saveAsPdf(OutputStream pdfStream, PdfSaveOptions options) {#saveAsPdf-java.io.OutputStream-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(OutputStream pdfStream, PdfSaveOptions options)
```


Αποθηκεύει το αρχείο PS/EPS σε ροή εξόδου PDF.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pdfStream | java.io.OutputStream | Ροή εξόδου PDF. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Περιέχει σημαίες που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

### saveAsPdf(String outPdfFilePath, PdfSaveOptions options) {#saveAsPdf-java.lang.String-com.aspose.eps.device.PdfSaveOptions-}
```
public void saveAsPdf(String outPdfFilePath, PdfSaveOptions options)
```


Αποθηκεύει το αρχείο PS/EPS σε αρχείο PDF.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| outPdfFilePath | java.lang.String | Διαδρομή αρχείου εξόδου PDF. |
| options | [PdfSaveOptions](../../com.aspose.eps.device/pdfsaveoptions) | Περιέχει σημαίες που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

### saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, OutputStream epsStream, PsSaveOptions options)
```


Αποθηκεύει το αντικείμενο BufferedImage σε αρχείο EPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Η εικόνα. |
| epsStream | java.io.OutputStream | Ροή εξόδου EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Περιέχει παραμέτρους που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

### saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.awt.image.BufferedImage-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(BufferedImage image, String epsFilePath, PsSaveOptions options)
```


Αποθηκεύει το αντικείμενο BufferedImage σε αρχείο EPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Η εικόνα. |
| epsFilePath | java.lang.String | Διαδρομή αρχείου EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Περιέχει παραμέτρους που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

### saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options) {#saveImageAsEps-java.io.InputStream-java.io.OutputStream-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(InputStream imageStream, OutputStream epsStream, PsSaveOptions options)
```


Αποθηκεύει εικόνα PNG/JPEG/BMP/GIF από τη ροή εισόδου σε ροή εξόδου EPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageStream | java.io.InputStream | Ροή εισόδου εικόνας. |
| epsStream | java.io.OutputStream | Ροή εξόδου EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Περιέχει παραμέτρους που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

### saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options) {#saveImageAsEps-java.lang.String-java.lang.String-com.aspose.eps.device.PsSaveOptions-}
```
public static void saveImageAsEps(String imageFilePath, String epsFilePath, PsSaveOptions options)
```


Αποθηκεύει εικόνα PNG/JPEG/BMP/GIF από αρχείο σε αρχείο EPS.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| imageFilePath | java.lang.String | Διαδρομή αρχείου εικόνας. |
| epsFilePath | java.lang.String | Διαδρομή αρχείου EPS. |
| options | [PsSaveOptions](../../com.aspose.eps.device/pssaveoptions) | Περιέχει παραμέτρους που καθορίζουν την έξοδο των σφαλμάτων που προκύπτουν κατά τη μετατροπή. |

### scale(float xScale, float yScale) {#scale-float-float-}
```
public void scale(float xScale, float yScale)
```


Προσθέτει κλίμακα στην τρέχουσα κατάσταση γραφικών (κλίμακα τρέχουσας μήτρας).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| xScale | float | Η κλίμακα στον άξονα X. |
| yScale | float | Η κλίμακα στον άξονα Y. |

### setInputStream(InputStream is) {#setInputStream-java.io.InputStream-}
```
public void setInputStream(InputStream is)
```


Καθορίζει μια ροή εισόδου.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| is | java.io.InputStream | Ροή εισόδου αρχείου PS/EPS. |

### setPageDevice(Map<String,Object> pageParams) {#setPageDevice-java.util.Map-java.lang.String-java.lang.Object--}
```
public void setPageDevice(Map<String,Object> pageParams)
```


Ορίζει τις παραμέτρους της συσκευής σελίδας (δείτε τον τελεστή "setpagedevice" στην προδιαγραφή PostScript). Μεταξύ αυτών μπορεί να είναι το μέγεθος της σελίδας και το χρώμα κ.λπ.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| pageParams | java.util.Map<java.lang.String,java.lang.Object> | Παράμετροι της σελίδας. Σε αυτό το λεξικό μπορεί να υπάρχει το μέγεθος της σελίδας και το χρώμα κ.λπ. |

### setPageSize(float width, float height) {#setPageSize-float-float-}
```
public void setPageSize(float width, float height)
```


Ορίζει το μέγεθος της σελίδας. Για να δημιουργήσετε σελίδες με διαφορετικά μεγέθη σε ένα έγγραφο, χρησιμοποιήστε τη μέθοδο  setPageDevice  αμέσως μετά από αυτή τη μέθοδο.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| width | float | Το πλάτος της σελίδας στο παραγόμενο αρχείο PostScript. |
| height | float | Το ύψος της σελίδας στο παραγόμενο αρχείο PostScript. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Ορίζει το χρώμα στην τρέχουσα κατάσταση γραφικών.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| paint | java.awt.Paint | Το χρώμα. Μπορεί να είναι οποιαδήποτε υποκλάση της κλάσης  Paint  που υπάρχει στο JDK. |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Ορίζει το στίγμα στην τρέχουσα κατάσταση γραφικών.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stroke | java.awt.Stroke | Το στίγμα. |

### setTransform(AffineTransform matrix) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform matrix)
```


Ορίστε τον τρέχοντα μετασχηματισμό σε αυτόν.

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | Ο μετασχηματισμός. |

### shear(float shx, float shy) {#shear-float-float-}
```
public void shear(float shx, float shy)
```


Προσθέτει παραμόρφωση shear στην τρέχουσα κατάσταση γραφικών (shear τρέχουσας μήτρας).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| shx | float | Η διαστρέβλωση στον άξονα X. |
| shy | float | Η διαστρέβλωση στον άξονα Y. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(AffineTransform matrix) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform matrix)
```


Προσθέτει μετασχηματισμό στην τρέχουσα κατάσταση γραφικών (συνενώνει αυτή τη μήτρα με την τρέχουσα).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| matrix | java.awt.geom.AffineTransform | Ο μετασχηματισμός. |

### translate(float x, float y) {#translate-float-float-}
```
public void translate(float x, float y)
```


Προσθέτει μετάθεση στην τρέχουσα κατάσταση γραφικών (μετατοπίζει την τρέχουσα μήτρα).

**Parameters:**
| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| x | float | Η μετάφραση στην κατεύθυνση X. |
| y | float | Η μετάφραση στην κατεύθυνση Y. |

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

### writeGraphicsRestore() {#writeGraphicsRestore--}
```
public void writeGraphicsRestore()
```


Γράφει την αποκατάσταση της τρέχουσας κατάστασης γραφικών (δείτε την προδιαγραφή PostScript για τον τελεστή "grestore").

### writeGraphicsSave() {#writeGraphicsSave--}
```
public void writeGraphicsSave()
```


Γράφει την αποθήκευση της τρέχουσας κατάστασης γραφικών (δείτε την προδιαγραφή PostScript για τον τελεστή "gsave").

