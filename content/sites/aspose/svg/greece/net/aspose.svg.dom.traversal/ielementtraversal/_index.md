---
title: Interface IElementTraversal
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Dom.Traversal.IElementTraversal διεπαφή. Η διεπαφή ElementTraversal είναι ένα σύνολο χαρακτηριστικών μόνο για ανάγνωση που επιτρέπουν στον συγγραφέα να πλοηγείται εύκολα μεταξύ των στοιχείων ενός εγγράφου. Κατά τη συμμόρφωση με υλοποιήσεις του Element Traversal όλα τα αντικείμενα που υλοποιούν το Element πρέπει επίσης να υλοποιούν τη διεπαφή ElementTraversal.
type: docs
weight: 1230
url: /el/net/aspose.svg.dom.traversal/ielementtraversal/
---
## IElementTraversal interface

Η διεπαφή ElementTraversal είναι ένα σύνολο χαρακτηριστικών μόνο για ανάγνωση που επιτρέπουν στον συγγραφέα να πλοηγείται εύκολα μεταξύ των στοιχείων ενός εγγράφου. Κατά τη συμμόρφωση με υλοποιήσεις του Element Traversal, όλα τα αντικείμενα που υλοποιούν το Element πρέπει επίσης να υλοποιούν τη διεπαφή ElementTraversal.

```csharp
public interface IElementTraversal
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [ChildElementCount](../../aspose.svg.dom.traversal/ielementtraversal/childelementcount/) { get; } | Επιστρέφει τον τρέχοντα αριθμό κόμβων στοιχείων που είναι παιδιά αυτού του στοιχείου. 0 εάν αυτό το στοιχείο δεν έχει θυγατρικούς κόμβους που είναι τύπου node 1. |
| [FirstElementChild](../../aspose.svg.dom.traversal/ielementtraversal/firstelementchild/) { get; } | Επιστρέφει τον πρώτο κόμβο θυγατρικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει θυγατρικά στοιχεία. |
| [LastElementChild](../../aspose.svg.dom.traversal/ielementtraversal/lastelementchild/) { get; } | Επιστρέφει τον τελευταίο κόμβο θυγατρικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει θυγατρικά στοιχεία. |
| [NextElementSibling](../../aspose.svg.dom.traversal/ielementtraversal/nextelementsibling/) { get; } | Επιστρέφει τον επόμενο κόμβο αδελφικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει κανένα στοιχείο αδελφούς κόμβους που έρχονται μετά από αυτό στο δέντρο εγγράφων. |
| [PreviousElementSibling](../../aspose.svg.dom.traversal/ielementtraversal/previouselementsibling/) { get; } | Επιστρέφει τον προηγούμενο κόμβο αδελφικού στοιχείου αυτού του στοιχείου. null εάν αυτό το στοιχείο δεν έχει κόμβους αδερφού στοιχείου που βρίσκονται πριν από αυτό στο δέντρο εγγράφων. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Svg.Dom.Traversal](../../aspose.svg.dom.traversal/)
* συνέλευση [Aspose.SVG](../../)


