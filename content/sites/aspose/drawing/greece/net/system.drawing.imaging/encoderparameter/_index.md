---
title: Class EncoderParameter
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Imaging.EncoderParameter τάξη. Χρησιμοποιείται για τη μετάδοση μιας τιμής ή ενός πίνακα τιμών σε έναν κωδικοποιητή εικόνας.
type: docs
weight: 700
url: /el/net/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class

Χρησιμοποιείται για τη μετάδοση μιας τιμής ή ενός πίνακα τιμών σε έναν κωδικοποιητή εικόνας.

```csharp
public sealed class EncoderParameter : IDisposable
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [EncoderParameter](encoderparameter/#constructor)(Encoder, byte) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter` τάξη με τα καθορισμέναEncoder αντικείμενο και έναν ανυπόγραφο ακέραιο 8-bit. Ορίζει τοValueType ιδιοκτησία προςValueTypeByte και ορίζει τοNumberOfValues ιδιοκτησία σε 1. |
| [EncoderParameter](encoderparameter/#constructor_2)(Encoder, byte[]) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και ένας πίνακας ανυπόγραφων ακεραίων 8-bit. Ορίζει τοValueType ιδιοκτησία σεValueTypeByte , και ορίζει τοNumberOfValues ιδιότητα στον αριθμό των στοιχείων του πίνακα. |
| [EncoderParameter](encoderparameter/#constructor_11)(Encoder, long) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και έναν ακέραιο 64-bit. Ορίζει τοValueType ιδιοκτησία προςValueTypeLong (32 bit) και ορίζει το NumberOfValues ιδιοκτησία σε 1. |
| [EncoderParameter](encoderparameter/#constructor_13)(Encoder, long[]) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και έναν πίνακα ακεραίων 64-bit. Ορίζει τοValueType ιδιοκτησία προςValueTypeLong (32-bit) και ορίζει τοNumberOfValues ιδιότητα στον αριθμό των στοιχείων του πίνακα. |
| [EncoderParameter](encoderparameter/#constructor_4)(Encoder, short) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και ένας ακέραιος 16-bit. Ορίζει τοValueType ιδιοκτησία προςValueTypeShort και ορίζει τοNumberOfValues ιδιοκτησία σε 1. |
| [EncoderParameter](encoderparameter/#constructor_5)(Encoder, short[]) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και έναν πίνακα ακεραίων 16-bit. Ορίζει τοValueType ιδιοκτησία προςValueTypeShort και ορίζει το NumberOfValues ιδιότητα στον αριθμό των στοιχείων του πίνακα. |
| [EncoderParameter](encoderparameter/#constructor_15)(Encoder, string) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και μια συμβολοσειρά χαρακτήρων. Η συμβολοσειρά μετατρέπεται σε μια συμβολοσειρά ASCII με μηδενικό τερματισμό πριν από αποθηκευτεί στοEncoderParameter αντικείμενο. Ορίζει τοValueType ιδιοκτησία προςValueTypeAscii , και θέτει τοNumberOfValues ιδιότητα στο μήκος της συμβολοσειράς ASCII συμπεριλαμβανομένου του τερματιστή NULL. |
| [EncoderParameter](encoderparameter/#constructor_1)(Encoder, byte, bool) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και μία τιμή 8-bit. Ορίζει τοValueType ιδιοκτησία προςValueTypeUndefined ήValueTypeByte , και ορίζει τοNumberOfValues ιδιοκτησία σε 1. |
| [EncoderParameter](encoderparameter/#constructor_3)(Encoder, byte[], bool) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και μια σειρά από byte. Ορίζει τοValueType ιδιοκτησία προςValueTypeUndefined ή ValueTypeByte και ορίζει τοNumberOfValues Η ιδιότητα στον αριθμό των στοιχείων του πίνακα. |
| [EncoderParameter](encoderparameter/#constructor_6)(Encoder, int, int) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoderαντικείμενο και ένα ζεύγος ακεραίων 32-bit. Το ζεύγος ακεραίων αντιπροσωπεύει ένα κλάσμα, ο πρώτος ακέραιος είναι ο αριθμητής και ο δεύτερος ακέραιος είναι ο παρονομαστής. Ορίζει τοValueType ιδιοκτησία σεValueTypeRational , και ορίζει τοNumberOfValues ιδιοκτησία σε 1. |
| [EncoderParameter](encoderparameter/#constructor_9)(Encoder, int[], int[]) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και δύο πίνακες ακεραίων 32-bit. Οι δύο πίνακες αντιπροσωπεύουν έναν πίνακα κλασμάτων. Ορίζει τοValueType ιδιοκτησία σεValueTypeRational , και ορίζει τοNumberOfValuesιδιότητα στον αριθμό των στοιχείων στο*numerator* πίνακας, ο οποίος πρέπει να είναι ίδιος με τον αριθμό των στοιχείων στο*denominator* πίνακας. |
| [EncoderParameter](encoderparameter/#constructor_12)(Encoder, long, long) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και ένα ζεύγος ακεραίων 64-bit. Το ζεύγος ακεραίων αντιπροσωπεύει ένα εύρος ακεραίων, ο πρώτος ακέραιος είναι ο μικρότερος αριθμός στην περιοχή και ο δεύτερος ακέραιος είναι ο μεγαλύτερος αριθμός στην περιοχή. Ορίζει τοValueType ιδιοκτησία σεValueTypeLongRange , και ορίζει τοNumberOfValues ιδιοκτησία σε 1. |
| [EncoderParameter](encoderparameter/#constructor_14)(Encoder, long[], long[]) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και δύο πίνακες ακεραίων 64-bit. Οι δύο πίνακες αντιπροσωπεύουν ένα εύρος ακέραιων αριθμών πίνακα. Ορίζει τοValueType ιδιοκτησία σεValueTypeLongRange , και ορίζει τοNumberOfValuesιδιότητα στον αριθμό των στοιχείων στο*rangebegin* πίνακας, ο οποίος πρέπει να είναι ίδιος με τον αριθμό των στοιχείων στο*rangeend* πίνακας. |
| [EncoderParameter](encoderparameter/#constructor_7)(Encoder, int, int, int) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και τρεις ακέραιους που καθορίζουν τον αριθμό των τιμών, τον τύπο δεδομένων των τιμών, και έναν δείκτη στις τιμές που είναι αποθηκευμένες στοEncoderParameter αντικείμενο. |
| [EncoderParameter](encoderparameter/#constructor_8)(Encoder, int, int, int, int) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και τέσσερις ακέραιους αριθμούς 32 bit. Οι τέσσερις ακέραιοι αντιπροσωπεύουν ένα εύρος κλασμάτων. Οι δύο πρώτοι ακέραιοι αντιπροσωπεύουν το μικρότερο κλάσμα της περιοχής και οι υπόλοιποι δύο ακέραιοι αντιπροσωπεύουν το μεγαλύτερο κλάσμα στην περιοχή. Ορίζει τοValueType ιδιοκτησία to ValueTypeRationalRange , και θέτει τοNumberOfValues ιδιοκτησία σε 1. |
| [EncoderParameter](encoderparameter/#constructor_10)(Encoder, int[], int[], int[], int[]) | Αρχικοποιεί μια νέα παρουσία του`EncoderParameter`κλάση με το specified Encoder αντικείμενο και τέσσερις πίνακες ακεραίων 32-bit. Οι τέσσερις πίνακες αντιπροσωπεύουν ένα ορθολογικό εύρος πίνακα. Ένα ορθολογικό εύρος είναι το σύνολο όλων των κλασμάτων από μια ελάχιστη κλασματική τιμή έως μια μέγιστη κλασματική τιμή. Ορίζει τοValueType ιδιοκτησία σεValueTypeRationalRange , και ορίζει τοNumberOfValues ιδιότητα στον αριθμό των στοιχείων σε το*numerator1* πίνακας, ο οποίος πρέπει να είναι ίδιος με τον αριθμό των στοιχείων στους άλλους τρεις πίνακες. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [Encoder](../../system.drawing.imaging/encoderparameter/encoder/) { get; set; } | Λαμβάνει ή ορίζει τοEncoder αντικείμενο που σχετίζεται με αυτόEncoderParameter αντικείμενο. ΤοEncoder Το αντικείμενο ενσωματώνει το καθολικά μοναδικό αναγνωριστικό (GUID) που καθορίζει την κατηγορία (για παράδειγμαQuality ,ColorDepth , ήCompression ) της παραμέτρου που είναι αποθηκευμένη σε αυτόEncoderParameter αντικείμενο. |
| [NumberOfValues](../../system.drawing.imaging/encoderparameter/numberofvalues/) { get; } | Λαμβάνει τον αριθμό των στοιχείων στον πίνακα τιμών που είναι αποθηκευμένοι σε αυτόEncoderParameter αντικείμενο. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Dispose](../../system.drawing.imaging/encoderparameter/dispose/)() | Απελευθερώνει όλους τους πόρους που χρησιμοποιούνται από αυτόEncoderParameter αντικείμενο. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing.Imaging](../../system.drawing.imaging/)
* συνέλευση [Aspose.Drawing](../../)


