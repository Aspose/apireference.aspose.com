---
title: Class PdfDevice
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Rendering.Pdf.PdfDevice τάξη. Αντιπροσωπεύει απόδοση σε έγγραφο pdf.
type: docs
weight: 2950
url: /el/net/aspose.svg.rendering.pdf/pdfdevice/
---
## PdfDevice class

Αντιπροσωπεύει απόδοση σε έγγραφο pdf.

```csharp
public class PdfDevice : Device<PdfGraphicContext, PdfRenderingOptions>
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(ICreateStreamProvider) | Αρχικοποιεί μια νέα παρουσία του`PdfDevice` τάξη. |
| [PdfDevice](pdfdevice/#constructor_4)(Stream) | Αρχικοποιεί μια νέα παρουσία του`PdfDevice` τάξη. |
| [PdfDevice](pdfdevice/#constructor_5)(string) | Αρχικοποιεί μια νέα παρουσία του`PdfDevice` τάξη. |
| [PdfDevice](pdfdevice/#constructor_1)(PdfRenderingOptions, ICreateStreamProvider) | Αρχικοποιεί μια νέα παρουσία του`PdfDevice` τάξη με απόδοση επιλογών και πάροχο ροής. |
| [PdfDevice](pdfdevice/#constructor_2)(PdfRenderingOptions, Stream) | Αρχικοποιεί μια νέα παρουσία του`PdfDevice` τάξη με απόδοση επιλογών και ροή εξόδου. |
| [PdfDevice](pdfdevice/#constructor_3)(PdfRenderingOptions, string) | Αρχικοποιεί μια νέα παρουσία του`PdfDevice` κλάση με απόδοση επιλογών και όνομα αρχείου εξόδου. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device-2/graphiccontext/) { get; } |  |
| [Options](../../aspose.svg.rendering/device-2/options/) { get; } |  |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.pdf/pdfdevice/addrect/)(RectangleF) | Προσθέτει ένα ορθογώνιο στην τρέχουσα διαδρομή ως πλήρη υποδιαδρομή. |
| override [BeginDocument](../../aspose.svg.rendering.pdf/pdfdevice/begindocument/)(Document) | Ξεκινά η απόδοση του εγγράφου. |
| override [BeginElement](../../aspose.svg.rendering.pdf/pdfdevice/beginelement/)(Element, RectangleF) | Ξεκινά την απόδοση του στοιχείου. |
| override [BeginPage](../../aspose.svg.rendering.pdf/pdfdevice/beginpage/)(SizeF) | Ξεκινά η απόδοση της νέας σελίδας. |
| override [Clip](../../aspose.svg.rendering.pdf/pdfdevice/clip/)(FillMode) | Τροποποιεί την τρέχουσα διαδρομή αποκοπής τέμνοντάς την με την τρέχουσα διαδρομή, χρησιμοποιώντας τον κανόνα FillMode για να καθορίσει την περιοχή που θα γεμίσει. Αυτή η μέθοδος τερματίζει την τρέχουσα διαδρομή. |
| override [ClosePath](../../aspose.svg.rendering.pdf/pdfdevice/closepath/)() | Κλείνει την τρέχουσα υποδιαδρομή προσθέτοντας ένα ευθύγραμμο τμήμα από το τρέχον σημείο στο σημείο εκκίνησης της υποδιαδρομής. Εάν η τρέχουσα υποδιαδρομή είναι ήδη κλειστή, το "ClosePath" δεν κάνει τίποτα. Αυτός ο τελεστής τερματίζει την τρέχουσα υποδιαδρομή. Η προσθήκη ενός άλλου τμήματος στην τρέχουσα διαδρομή ξεκινά μια νέα υποδιαδρομή, ακόμα κι αν το νέο τμήμα ξεκινά στο τελικό σημείο στο οποίο φτάνει η μέθοδος "ClosePath". |
| override [CubicBezierTo](../../aspose.svg.rendering.pdf/pdfdevice/cubicbezierto/)(PointF, PointF, PointF) | Προσθέτει μια κυβική καμπύλη Bézier στην τρέχουσα διαδρομή. Η καμπύλη εκτείνεται από το τρέχον σημείο στο σημείο pt2, χρησιμοποιώντας τα pt1 και pt2 ως σημεία ελέγχου του Bézier. Το νέο τρέχον σημείο είναι pt3. |
| [Dispose](../../aspose.svg.rendering/device-2/dispose/)() |  |
| override [DrawImage](../../aspose.svg.rendering.pdf/pdfdevice/drawimage/)(byte[], ImageType, RectangleF) | Σχεδιάζει την καθορισμένη εικόνα. |
| override [EndDocument](../../aspose.svg.rendering.pdf/pdfdevice/enddocument/)() | Τερματίζει την απόδοση του εγγράφου. |
| override [EndElement](../../aspose.svg.rendering.pdf/pdfdevice/endelement/)(Element) | Τερματίζει την απόδοση του στοιχείου. |
| override [EndPage](../../aspose.svg.rendering.pdf/pdfdevice/endpage/)() | Τερματίζει την απόδοση της τρέχουσας σελίδας. |
| override [Fill](../../aspose.svg.rendering.pdf/pdfdevice/fill/)(FillMode) | Γεμίζει ολόκληρη την περιοχή που περικλείεται από την τρέχουσα διαδρομή. Εάν η διαδρομή αποτελείται από πολλές αποσυνδεδεμένες υποδιαδρομές, γεμίζει το εσωτερικό όλων των υπομονοπατιών, το εξεταζόμενο μαζί. Αυτή η μέθοδος τερματίζει την τρέχουσα διαδρομή. |
| override [FillText](../../aspose.svg.rendering.pdf/pdfdevice/filltext/)(string, PointF) | Γεμίζει την καθορισμένη συμβολοσειρά κειμένου στην καθορισμένη θέση. |
| override [Flush](../../aspose.svg.rendering.pdf/pdfdevice/flush/)() | Ξεπλύνει όλα τα δεδομένα για έξοδο ροής. |
| override [LineTo](../../aspose.svg.rendering.pdf/pdfdevice/lineto/)(PointF) | Προσθέτει ένα ευθύγραμμο τμήμα από το τρέχον σημείο στο σημείο (pt). Το νέο τρέχον σημείο είναι pt. |
| override [MoveTo](../../aspose.svg.rendering.pdf/pdfdevice/moveto/)(PointF) | Ξεκινά μια νέα υποδιαδρομή μετακινώντας το τρέχον σημείο στις συντεταγμένες της παραμέτρου pt, παραλείποντας οποιοδήποτε τμήμα γραμμής σύνδεσης. Εάν η προηγούμενη μέθοδος κατασκευής διαδρομής στην τρέχουσα διαδρομή ήταν επίσης "MoveTo", η νέα "MoveTo" την αντικαθιστά. κανένα ίχνος της προηγούμενης λειτουργίας "MoveTo" δεν παραμένει στη διαδρομή. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/restoregraphiccontext/)() | Επαναφέρει ολόκληρο το περιβάλλον γραφικών στην προηγούμενη τιμή του βγάζοντάς το από τη στοίβα. |
| override [SaveGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/savegraphiccontext/)() | Σπρώχνει ένα αντίγραφο ολόκληρου του περιβάλλοντος γραφικών στη στοίβα. |
| override [Stroke](../../aspose.svg.rendering.pdf/pdfdevice/stroke/)() | Διαγράφει μια γραμμή κατά μήκος της τρέχουσας διαδρομής. Η διαγραμμισμένη γραμμή ακολουθεί κάθε ευθύ ή καμπύλο τμήμα της διαδρομής, με κέντρο το τμήμα με πλευρές παράλληλες προς αυτό. Κάθε ένα από τα υπομονοπάτια της διαδρομής αντιμετωπίζεται ξεχωριστά. Αυτή η μέθοδος τερματίζει την τρέχουσα διαδρομή. |
| override [StrokeAndFill](../../aspose.svg.rendering.pdf/pdfdevice/strokeandfill/)(FillMode) | Περιγράφει και γεμίζει την τρέχουσα διαδρομή. Αυτή η μέθοδος τερματίζει την τρέχουσα διαδρομή. |
| override [StrokeText](../../aspose.svg.rendering.pdf/pdfdevice/stroketext/)(string, PointF) | Χαρακτηρίζει την καθορισμένη συμβολοσειρά κειμένου στην καθορισμένη θέση. |

## Άλλα Μέλη

| Ονομα | Περιγραφή |
| --- | --- |
| class [PdfGraphicContext](pdfdevice.pdfgraphiccontext/) | Διατηρεί τις τρέχουσες παραμέτρους ελέγχου γραφικών για το PdfDevice. Αυτές οι παράμετροι ορίζουν το παγκόσμιο πλαίσιο εντός του οποίου εκτελούν οι τελεστές γραφικών. |

### Δείτε επίσης

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2/)
* class [PdfGraphicContext](../pdfdevice.pdfgraphiccontext/)
* class [PdfRenderingOptions](../pdfrenderingoptions/)
* χώρος ονομάτων [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* συνέλευση [Aspose.SVG](../../)


