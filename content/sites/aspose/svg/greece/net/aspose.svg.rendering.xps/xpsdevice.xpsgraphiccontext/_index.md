---
title: Class XpsDevice.XpsGraphicContext
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Rendering.Xps.XpsDeviceXpsGraphicContext τάξη. Διατηρεί τις τρέχουσες παραμέτρους ελέγχου γραφικών για το XpsDevice. Αυτές οι παράμετροι ορίζουν το παγκόσμιο πλαίσιο εντός του οποίου εκτελούν οι τελεστές γραφικών.
type: docs
weight: 3060
url: /el/net/aspose.svg.rendering.xps/xpsdevice.xpsgraphiccontext/
---
## XpsDevice.XpsGraphicContext class

Διατηρεί τις τρέχουσες παραμέτρους ελέγχου γραφικών για το XpsDevice. Αυτές οι παράμετροι ορίζουν το παγκόσμιο πλαίσιο εντός του οποίου εκτελούν οι τελεστές γραφικών.

```csharp
public class XpsGraphicContext : GraphicContext
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [XpsGraphicContext](xpsgraphiccontext/)() | Ο προεπιλεγμένος κατασκευαστής. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Ορίζει ή παίρνει διάστιχο χαρακτήρων. |
| virtual [FillBrush](../../aspose.svg.rendering/graphiccontext/fillbrush/) { get; set; } | Ορίζει ή παίρνει το αντικείμενο πινέλου που χρησιμοποιείται για να γεμίσει το εσωτερικό των μονοπατιών. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Ορίζει ή λαμβάνει το αντικείμενο γραμματοσειράς αληθινού τύπου που χρησιμοποιείται για την απόδοση κειμένου. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Ορίζει ή λαμβάνει μέγεθος γραμματοσειράς κειμένου. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Ορίζει ή λαμβάνει στυλ γραμματοσειράς κειμένου. |
| virtual [LineCap](../../aspose.svg.rendering/graphiccontext/linecap/) { get; set; } | Ορίζει ή λαμβάνει τον κώδικα που καθορίζει το σχήμα των τελικών σημείων για κάθε ανοιχτή διαδρομή που έχει διαγραμμιστεί. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Ορίζει ή λαμβάνει τη μετατόπιση φάσης του τρέχοντος μοτίβου παύλας γραμμής. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Ορίζει ή λαμβάνει την περιγραφή του μοτίβου της παύλας που θα χρησιμοποιηθεί όταν τα μονοπάτια χαράσσονται. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Τα σύνολα παίρνει το στυλ των διακεκομμένων γραμμών μιας διαδρομής με πινελιά. |
| virtual [LineJoin](../../aspose.svg.rendering/graphiccontext/linejoin/) { get; set; } | Ορίζει ή λαμβάνει τον κωδικό που καθορίζει το σχήμα των αρμών μεταξύ συνδεδεμένων τμημάτων μιας διαδρομής με διαδρομή. |
| virtual [LineWidth](../../aspose.svg.rendering/graphiccontext/linewidth/) { get; set; } | Ορίζει ή λαμβάνει το πάχος των μονοπατιών που πρέπει να περάσουν. |
| virtual [MiterLimit](../../aspose.svg.rendering/graphiccontext/miterlimit/) { get; set; } | Ορίζει ή λαμβάνει το μέγιστο μήκος των ενώσεων με λοξόγραμμη γραμμή για διαγραμμένες διαδρομές. Αυτή η παράμετρος περιορίζει το μήκος των "ακίδων" που παράγονται όταν τα τμήματα γραμμής ενώνονται υπό έντονες γωνίες. |
| virtual [StrokeBrush](../../aspose.svg.rendering/graphiccontext/strokebrush/) { get; set; } | Ορίζει ή λαμβάνει το αντικείμενο πινέλου που χρησιμοποιείται για διαγραμμισμένες διαδρομές. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Παίρνει ένα[`TextInfo`](../../aspose.svg.rendering/textinfo/) αντικείμενο που περιέχει πληροφορίες σχετικά με το κείμενο που αποδίδεται. |
| virtual [TransformationMatrix](../../aspose.svg.rendering/graphiccontext/transformationmatrix/) { get; set; } | Ορίζει ή παίρνει τον πίνακα μετασχηματισμού. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.xps/xpsgraphiccontext/clone/)() | Δημιουργεί μια νέα παρουσία μιας κλάσης XpsGraphicContext με τις ίδιες τιμές ιδιοτήτων με μια υπάρχουσα παρουσία. |
| virtual [Transform](../../aspose.svg.rendering/graphiccontext/transform/)(Matrix) | Τροποποιήστε τον τρέχοντα πίνακα μετασχηματισμού πολλαπλασιάζοντας τον καθορισμένο πίνακα. |

### Δείτε επίσης

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [XpsDevice](../xpsdevice/)
* χώρος ονομάτων [Aspose.Svg.Rendering.Xps](../../aspose.svg.rendering.xps/)
* συνέλευση [Aspose.SVG](../../)


