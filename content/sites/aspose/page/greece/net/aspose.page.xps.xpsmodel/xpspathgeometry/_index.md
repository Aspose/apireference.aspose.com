---
title: Class XpsPathGeometry
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry τάξη. Χαρακτηριστικά στοιχείου ιδιότητας PathGeometry που ενσωματώνει κλάση. Αυτό το στοιχείο περιέχει ένα σύνολο σχημάτων διαδρομής που καθορίζονται είτε με το χαρακτηριστικό Figures είτε με ένα θυγατρικό στοιχείο PathFigure.
type: docs
weight: 3270
url: /el/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

Χαρακτηριστικά στοιχείου ιδιότητας PathGeometry που ενσωματώνει κλάση. Αυτό το στοιχείο περιέχει ένα σύνολο σχημάτων διαδρομής που καθορίζονται είτε με το χαρακτηριστικό Figures είτε με ένα θυγατρικό στοιχείο PathFigure.

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | Επιστρέφει/ορίζει την τιμή προσδιορίζοντας πώς συνδυάζονται οι τεμνόμενες περιοχές των geometric για να σχηματίσουν μια περιοχή. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | Επιστρέφει λίστα με ψηφία θυγατρικών μονοπατιών. |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | Επιστρέφει/καθορίζει τον συγγενικό πίνακα μετασχηματισμού δημιουργώντας τον τοπικό πίνακα μετασχηματισμού που εφαρμόζεται σε όλα τα θυγατρικά και απογονικά στοιχεία της γεωμετρίας της διαδρομής προτού χρησιμοποιηθεί για πλήρωση, αποκοπή ή χάιδεμα. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | Προσθέτει ένα τμήμα διαδρομής στη λίστα θυγατρικών τμημάτων της τελευταίας εικόνας pah. |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | Κλωνοποιεί αυτήν τη γεωμετρία διαδρομής. |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | Εισάγει ένα τμήμα διαδρομής στη λίστα των θυγατρικών τμημάτων του το τελευταίο σχήμα διαδρομής στο*index* θέση. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | Αφαιρεί ένα τμήμα διαδρομής από τη λίστα θυγατρικών τμημάτων του τελευταίου σχήματος διαδρομής. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | Αφαιρεί ένα τμήμα διαδρομής από τη λίστα θυγατρικών τμημάτων του του τελευταίου σχήματος διαδρομής στο*index* θέση. |

### Δείτε επίσης

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* χώρος ονομάτων [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* συνέλευση [Aspose.Page](../../)


