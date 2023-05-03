---
title: Struct Rectangle
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Rectangle struct. Αποθηκεύει ένα σύνολο τεσσάρων ακεραίων που αντιπροσωπεύουν τη θέση και το μέγεθος ενός ορθογωνίου.
type: docs
weight: 1040
url: /el/net/system.drawing/rectangle/
---
## Rectangle structure

Αποθηκεύει ένα σύνολο τεσσάρων ακεραίων που αντιπροσωπεύουν τη θέση και το μέγεθος ενός ορθογωνίου.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [Rectangle](rectangle/#constructor_1)(Point, Size) | Αρχικοποιεί μια νέα παρουσία του`Rectangle` κατασκευή με την καθορισμένη θέση και μέγεθος. |
| [Rectangle](rectangle/#constructor)(int, int, int, int) | Αρχικοποιεί μια νέα παρουσία της δομής Rectangle με την καθορισμένη θέση και μέγεθος. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom/) { get; } | Λαμβάνει τη συντεταγμένη y που είναι το άθροισμα των τιμών των ιδιοτήτων Y και Height αυτής της δομής ορθογωνίου. |
| [Height](../../system.drawing/rectangle/height/) { get; set; } | Λαμβάνει ή ορίζει το ύψος αυτής της δομής Ορθογώνιο. |
| [IsEmpty](../../system.drawing/rectangle/isempty/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν όλες οι αριθμητικές ιδιότητες αυτού`Rectangle` έχουν τιμές μηδέν. |
| [Left](../../system.drawing/rectangle/left/) { get; } | Λαμβάνει τη συντεταγμένη x του αριστερού άκρου αυτής της δομής ορθογωνίου. |
| [Location](../../system.drawing/rectangle/location/) { get; set; } | Λαμβάνει ή ορίζει τις συντεταγμένες της επάνω αριστερής γωνίας αυτούRectangle δομή. |
| [Right](../../system.drawing/rectangle/right/) { get; } | Παίρνει τη συντεταγμένη x που είναι το άθροισμα των τιμών των ιδιοτήτων X και Width αυτής της δομής Ορθογώνιου. |
| [Size](../../system.drawing/rectangle/size/) { get; set; } | Λαμβάνει ή ορίζει το μέγεθος αυτούRectangle . |
| [Top](../../system.drawing/rectangle/top/) { get; } | Λαμβάνει τη συντεταγμένη y του επάνω άκρου αυτής της δομής ορθογωνίου. |
| [Width](../../system.drawing/rectangle/width/) { get; set; } | Λαμβάνει ή ορίζει το πλάτος αυτής της δομής Ορθογώνιο. |
| [X](../../system.drawing/rectangle/x/) { get; set; } | Λαμβάνει ή ορίζει τη συντεταγμένη x της επάνω αριστερής γωνίας αυτής της δομής ορθογωνίου. |
| [Y](../../system.drawing/rectangle/y/) { get; set; } | Λαμβάνει ή ορίζει τη συντεταγμένη y της επάνω αριστερής γωνίας αυτής της δομής ορθογωνίου. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling/)(RectangleF) | Μετατρέπει το καθορισμένοRectangleF δομή σε αRectangle δομή με στρογγυλοποίηση τουRectangleF τιμές στις επόμενες υψηλότερες ακέραιες τιμές. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb/)(int, int, int, int) | Δημιουργεί έναRectangle δομή με τις καθορισμένες θέσεις άκρων. |
| static [Inflate](../../system.drawing/rectangle/inflate/)(Rectangle, int, int) | Δημιουργεί ένα`Rectangle` που διογκώνεται κατά το καθορισμένο ποσό. |
| static [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle, Rectangle) | Επιστρέφει ένα τρίτοRectangle δομή που αντιπροσωπεύει την τομή δύο άλλωνRectangle δομές. Εάν δεν υπάρχει διασταύρωση, άδειοRectangle επιστρέφεται. |
| static [Round](../../system.drawing/rectangle/round/)(RectangleF) | Μετατρέπει το καθορισμένοRectangleF σε αRectangle με στρογγυλοποίηση τοRectangleF τιμές στις πλησιέστερες ακέραιες τιμές. |
| static [Truncate](../../system.drawing/rectangle/truncate/)(RectangleF) | Μετατρέπει το καθορισμένοRectangleF σε αRectangle περικόπτοντας τοRectangleF τιμές. |
| static [Union](../../system.drawing/rectangle/union/)(Rectangle, Rectangle) | Παίρνει έναRectangle δομή που περιέχει την ένωση δύοRectangle δομές. |
| [Contains](../../system.drawing/rectangle/contains/#contains_1)(Point) | Καθορίζει εάν το καθορισμένο σημείο περιέχεται σε αυτόRectangle δομή. |
| [Contains](../../system.drawing/rectangle/contains/#contains_2)(Rectangle) | Καθορίζει εάν η ορθογώνια περιοχή που αντιπροσωπεύεται από*rect* περιέχεται εξ ολοκλήρου στην ορθογώνια περιοχή που αντιπροσωπεύεται από αυτό`Rectangle` . |
| [Contains](../../system.drawing/rectangle/contains/#contains)(int, int) | Καθορίζει εάν το καθορισμένο σημείο περιέχεται σε αυτόRectangle δομή. |
| override [Equals](../../system.drawing/rectangle/equals/#equals_1)(object) | Ελέγχει εάν το obj είναι αRectangleδομή με την ίδια θέση και μέγεθος αυτούRectangle δομή. |
| [Equals](../../system.drawing/rectangle/equals/#equals)(Rectangle) | Ελέγχει εάν άλλο`Rectangle` η δομή έχει την ίδια θέση και μέγεθος αυτού`Rectangle` δομή. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode/)() | Επιστρέφει τον κωδικό κατακερματισμού για αυτόRectangle δομή. Για πληροφορίες σχετικά με τη χρήση των κωδικών κατακερματισμού, ανατρέξτε στο GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate_1)(Size) | Μεγεθύνει αυτόRectangle κατά το καθορισμένο ποσό. |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate)(int, int) | Μεγεθύνει αυτόRectangle κατά το καθορισμένο ποσό. |
| [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle) | Αντικαθιστά αυτόRectangle με τη διασταύρωση του εαυτού του και του καθορισμένουRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith/)(Rectangle) | Καθορίζει αν αυτό το ορθογώνιο τέμνεται με*rect* . |
| [Offset](../../system.drawing/rectangle/offset/#offset_1)(Point) | Προσαρμόζει τη θέση αυτού του ορθογωνίου κατά το καθορισμένο ποσό. |
| [Offset](../../system.drawing/rectangle/offset/#offset)(int, int) | Προσαρμόζει τη θέση αυτού του ορθογωνίου κατά το καθορισμένο ποσό. |
| override [ToString](../../system.drawing/rectangle/tostring/)() | Μετατρέπει τα χαρακτηριστικά αυτού`Rectangle` σε μια συμβολοσειρά αναγνώσιμη από τον άνθρωπο. |
| [operator ==](../../system.drawing/rectangle/op_equality/) | Ελέγχει εάν δύοRectangle οι δομές έχουν ίση θέση και μέγεθος. |
| [operator !=](../../system.drawing/rectangle/op_inequality/) | Ελέγχει εάν δύοRectangle οι δομές διαφέρουν ως προς τη θέση ή το μέγεθος. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty/) | Αντιπροσωπεύει αRectangle δομή με τις ιδιότητές της μη αρχικοποιημένες. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


