---
title: Enum ImageLockMode
second_title: Aspose.Drawing for .NET API Reference
description: System.Drawing.Imaging.ImageLockMode αρίθμηση. Καθορίζει σημαίες που μεταβιβάζονται στην παράμετρο flags τουLockBits μέθοδος. ΗLockBits Η μέθοδος κλειδώνει ένα τμήμα μιας εικόνας έτσι ώστε να μπορείτε να διαβάσετε ή να γράψετε τα δεδομένα pixel.
type: docs
weight: 780
url: /el/net/system.drawing.imaging/imagelockmode/
---
## ImageLockMode enumeration

Καθορίζει σημαίες που μεταβιβάζονται στην παράμετρο flags του[`LockBits`](../../system.drawing/bitmap/lockbits/) μέθοδος. Η[`LockBits`](../../system.drawing/bitmap/lockbits/) Η μέθοδος κλειδώνει ένα τμήμα μιας εικόνας έτσι ώστε να μπορείτε να διαβάσετε ή να γράψετε τα δεδομένα pixel.

```csharp
public enum ImageLockMode
```

### Αξίες

| Ονομα | αξία | Περιγραφή |
| --- | --- | --- |
| ReadOnly | `1` | Καθορίζει ότι ένα τμήμα της εικόνας είναι κλειδωμένο για ανάγνωση. |
| WriteOnly | `2` | Καθορίζει ότι ένα τμήμα της εικόνας είναι κλειδωμένο για εγγραφή. |
| ReadWrite | `3` | Καθορίζει ότι ένα τμήμα της εικόνας είναι κλειδωμένο για ανάγνωση ή γραφή. |
| UserInputBuffer | `4` | Καθορίζει ότι η προσωρινή μνήμη που χρησιμοποιείται για την ανάγνωση ή την εγγραφή δεδομένων pixel εκχωρείται από το χρήστη. Εάν έχει οριστεί αυτή η σημαία, η*flags* παράμετρος του[`LockBits`](../../system.drawing/bitmap/lockbits/) Η μέθοδος χρησιμεύει ως παράμετρος εισόδου (και πιθανώς ως παράμετρος εξόδου). Εάν αυτή η σημαία διαγραφεί, τότε η*flags* παράμετρος χρησιμεύει μόνο ως παράμετρος εξόδου. |

### Δείτε επίσης

* χώρος ονομάτων [System.Drawing.Imaging](../../system.drawing.imaging/)
* συνέλευση [Aspose.Drawing](../../)


