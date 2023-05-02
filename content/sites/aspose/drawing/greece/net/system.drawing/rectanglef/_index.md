---
title: Struct RectangleF
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.RectangleF struct. Αποθηκεύει ένα σύνολο τεσσάρων αριθμών κινητής υποδιαστολής που αντιπροσωπεύουν τη θέση και το μέγεθος ενός ορθογωνίου. Για πιο προηγμένες συναρτήσεις περιοχής χρησιμοποιήστε ένα αντικείμενο Περιοχής.
type: docs
weight: 1050
url: /el/net/system.drawing/rectanglef/
---
## RectangleF structure

Αποθηκεύει ένα σύνολο τεσσάρων αριθμών κινητής υποδιαστολής που αντιπροσωπεύουν τη θέση και το μέγεθος ενός ορθογωνίου. Για πιο προηγμένες συναρτήσεις περιοχής, χρησιμοποιήστε ένα αντικείμενο Περιοχής.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [RectangleF](rectanglef/#constructor_1)(PointF, SizeF) | Αρχικοποιεί μια νέα παρουσία της δομής RectangleF με την καθορισμένη θέση και μέγεθος. |
| [RectangleF](rectanglef/#constructor)(float, float, float, float) | Αρχικοποιεί μια νέα παρουσία της δομής RectangleF με την καθορισμένη θέση και μέγεθος. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom/) { get; } | Παίρνει τη συντεταγμένη y που είναι το άθροισμα του Y και του Ύψους αυτής της δομής RectangleF. |
| [Height](../../system.drawing/rectanglef/height/) { get; set; } | Λαμβάνει ή ορίζει το ύψος αυτής της δομής RectangleF. |
| [IsEmpty](../../system.drawing/rectanglef/isempty/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν τοWidth ήHeight ιδιοκτησία αυτούRectangleF έχει τιμή μηδέν. |
| [Left](../../system.drawing/rectanglef/left/) { get; } | Λαμβάνει τη συντεταγμένη x του αριστερού άκρου αυτής της δομής RectangleF. |
| [Location](../../system.drawing/rectanglef/location/) { get; set; } | Λαμβάνει ή ορίζει τις συντεταγμένες της επάνω αριστερής γωνίας αυτούRectangleF δομή. |
| [Right](../../system.drawing/rectanglef/right/) { get; } | Παίρνει τη συντεταγμένη x που είναι το άθροισμα του X και του πλάτους αυτής της δομής RectangleF. |
| [Size](../../system.drawing/rectanglef/size/) { get; set; } | Λαμβάνει ή ορίζει το μέγεθος αυτούRectangleF . |
| [Top](../../system.drawing/rectanglef/top/) { get; } | Λαμβάνει τη συντεταγμένη y του επάνω άκρου αυτής της δομής RectangleF. |
| [Width](../../system.drawing/rectanglef/width/) { get; set; } | Λαμβάνει ή ορίζει το πλάτος αυτής της δομής RectangleF. |
| [X](../../system.drawing/rectanglef/x/) { get; set; } | Λαμβάνει ή ορίζει τη συντεταγμένη x της επάνω αριστερής γωνίας αυτής της δομής RectangleF. |
| [Y](../../system.drawing/rectanglef/y/) { get; set; } | Λαμβάνει ή ορίζει τη συντεταγμένη x της επάνω αριστερής γωνίας αυτής της δομής RectangleF. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb/)(float, float, float, float) | Δημιουργεί μια δομή RectangleF με επάνω αριστερή γωνία και κάτω δεξιά γωνία στις καθορισμένες θέσεις. |
| static [Inflate](../../system.drawing/rectanglef/inflate/)(RectangleF, float, float) | Δημιουργεί και επιστρέφει ένα διογκωμένο αντίγραφο του καθορισμένουRectangleF δομή. Το αντίγραφο διογκώνεται κατά το καθορισμένο ποσό. Το αρχικό ορθογώνιο παραμένει αμετάβλητο. |
| static [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF, RectangleF) | Επιστρέφει αRectangleF δομή που αντιπροσωπεύει την τομή δύο ορθογωνίων. Αν δεν υπάρχει τομή, και κενόRectangleF επιστρέφεται. |
| static [Union](../../system.drawing/rectanglef/union/)(RectangleF, RectangleF) | Δημιουργεί το μικρότερο δυνατό τρίτο ορθογώνιο που μπορεί να περιέχει και τα δύο ορθογώνια που σχηματίζουν ένωση. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_1)(PointF) | Καθορίζει εάν το καθορισμένο σημείο περιέχεται σε αυτόRectangleF δομή. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_2)(RectangleF) | Καθορίζει εάν η ορθογώνια περιοχή που αντιπροσωπεύεται από*rect* εμπεριέχεται εξ ολοκλήρου σε αυτόRectangleF δομή. |
| [Contains](../../system.drawing/rectanglef/contains/#contains)(float, float) | Καθορίζει εάν το καθορισμένο σημείο περιέχεται σε αυτόRectangleF δομή. |
| override [Equals](../../system.drawing/rectanglef/equals/#equals_1)(object) | Καθορίζει εάν το καθορισμένοObject , ισούται με αυτήν την περίπτωση. |
| [Equals](../../system.drawing/rectanglef/equals/#equals)(RectangleF) | Ελέγχει εάν άλλο`RectangleF` η δομή έχει την ίδια θέση και μέγεθος αυτού`RectangleF` δομή. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode/)() | Επιστρέφει έναν κωδικό κατακερματισμού για αυτήν την εμφάνιση. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate_1)(SizeF) | Φουσκώνει αυτόRectangleF κατά το καθορισμένο ποσό. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate)(float, float) | Φουσκώνει αυτόRectangleF δομή κατά το καθορισμένο ποσό. |
| [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF) | Αντικαθιστά αυτόRectangleF δομή με την τομή του εαυτού του και του καθορισμένου RectangleF δομή. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith/)(RectangleF) | Καθορίζει αν αυτό το ορθογώνιο τέμνεται με*rect* . |
| [Offset](../../system.drawing/rectanglef/offset/#offset_1)(PointF) | Προσαρμόζει τη θέση αυτού του ορθογωνίου κατά το καθορισμένο ποσό. |
| [Offset](../../system.drawing/rectanglef/offset/#offset)(float, float) | Προσαρμόζει τη θέση αυτού του ορθογωνίου κατά το καθορισμένο ποσό. |
| override [ToString](../../system.drawing/rectanglef/tostring/)() | Μετατρέπει τα χαρακτηριστικά αυτού[`Rectangle`](../rectangle/) σε μια συμβολοσειρά αναγνώσιμη από τον άνθρωπο. |
| [operator ==](../../system.drawing/rectanglef/op_equality/) | Ελέγχει εάν δύοRectangleF οι δομές έχουν ίση θέση και μέγεθος. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit/) | Μετατρέπει την καθορισμένη δομή Rectangle σε δομή RectangleF. |
| [operator !=](../../system.drawing/rectanglef/op_inequality/) | Ελέγχει εάν δύοRectangleF οι δομές διαφέρουν ως προς τη θέση ή το μέγεθος. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty/) | Αντιπροσωπεύει ένα στιγμιότυπο τουRectangleFτάξη με τα μέλη της μη αρχικοποιημένα. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


