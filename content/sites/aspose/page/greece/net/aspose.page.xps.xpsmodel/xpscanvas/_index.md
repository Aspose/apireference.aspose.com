---
title: Class XpsCanvas
second_title: Aspose.Page για Αναφορά API .NET
description: Aspose.Page.XPS.XpsModel.XpsCanvas τάξη. Χαρακτηριστικά στοιχείου καμβά που ενσωματώνει κλάση. Αυτό το στοιχείο ομαδοποιεί στοιχεία. Για παράδειγμα τα γλυφά και τα στοιχεία διαδρομής μπορούν να ομαδοποιηθούν σε έναν καμβά προκειμένου να προσδιοριστούν ως ενότητα ως προορισμός υπερσύνδεσης ή για να εφαρμοστεί μια τιμή σύνθεσης ιδιότητας σε κάθε στοιχείο θυγατρικού και προγονικού στοιχείου.
type: docs
weight: 2980
url: /el/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

Χαρακτηριστικά στοιχείου καμβά που ενσωματώνει κλάση. Αυτό το στοιχείο ομαδοποιεί στοιχεία. Για παράδειγμα, τα γλυφά και τα στοιχεία διαδρομής μπορούν να ομαδοποιηθούν σε έναν καμβά προκειμένου να προσδιοριστούν ως ενότητα (ως προορισμός υπερσύνδεσης) ή για να εφαρμοστεί μια τιμή σύνθεσης ιδιότητας σε κάθε στοιχείο θυγατρικού και προγονικού στοιχείου.

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Επιστρέφει/ορίζει την παρουσία της γεωμετρίας διαδρομής περιορίζοντας την περιοχή απόδοσης του στοιχείου. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Επιστρέφει αριθμό θυγατρικών στοιχείων. |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | Επιστρέφει/ορίζει την τιμή που ελέγχει τον τρόπο απόδοσης των άκρων των διαδρομών στον καμβά. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Επιστρέφει/ορίζει το αντικείμενο προορισμού υπερσύνδεσης. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Παρέχει πρόσβαση στα παιδιά του στοιχείου κατά ευρετήριο*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Επιστρέφει/ορίζει την τιμή που ορίζει την ομοιόμορφη διαφάνεια του στοιχείου. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Επιστρέφει/ορίζει το πινέλο καθορίζοντας μια μάσκα με τιμές άλφα που εφαρμόζεται στο στοιχείο με τον ίδιο τρόπο όπως το χαρακτηριστικό Opacity, αλλά επιτρέποντας διαφορετικές τιμές άλφα για διαφορετικές περιοχές του στοιχείου. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Επιστρέφει/ορίζει τον συγγενικό πίνακα μετασχηματισμού δημιουργώντας ένα νέο πλαίσιο συντεταγμένων για όλα τα χαρακτηριστικά του στοιχείου και για όλα τα θυγατρικά στοιχεία (εάν υπάρχουν). |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | Προσθέτει ένα στοιχείο στη θυγατρική λίστα αυτού του καμβά. |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | Προσθέτει έναν νέο καμβά στη θυγατρική λίστα αυτού του καμβά. |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | Προσθέτει νέα γλυφά στη λίστα παιδιών αυτού του καμβά. |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | Προσθέτει μια νέα διαδρομή στη θυγατρική λίστα αυτού του καμβά. |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | Κλωνοποιεί αυτόν τον καμβά. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Υλοποίηση τουIEnumerable διεπαφή. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | Εισάγει ένα στοιχείο στη θυγατρική λίστα αυτού του καμβά στο*index* θέση. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | Εισάγει έναν νέο καμβά στη θυγατρική λίστα αυτού του καμβά στο*index* θέση. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | Εισάγει νέους γλυφούς στη θυγατρική λίστα αυτού του καμβά στο*index* θέση. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | Εισάγει μια νέα διαδρομή στη θυγατρική λίστα αυτού του καμβά στο*index* θέση. |

### Δείτε επίσης

* class [XpsContentElement](../xpscontentelement/)
* χώρος ονομάτων [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* συνέλευση [Aspose.Page](../../)


