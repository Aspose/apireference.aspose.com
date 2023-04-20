---
title: Class OutputStream
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.IO.OutputStream τάξη. Μια υποκατάστατη ροή τυλίγει την πραγματική ροή εξόδου και ελέγχει την πρόσβαση σε αυτήν. OutputStream περιέχει δεδομένα URI που περιγράφουν τη θέση της ροής εξόδου.
type: docs
weight: 1980
url: /el/net/aspose.svg.io/outputstream/
---
## OutputStream class

Μια υποκατάστατη ροή τυλίγει την πραγματική ροή εξόδου και ελέγχει την πρόσβαση σε αυτήν. `OutputStream` περιέχει δεδομένα URI που περιγράφουν τη θέση της ροής εξόδου.

```csharp
public class OutputStream : Stream
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [OutputStream](outputstream/)(Stream, string) | Αρχικοποιεί μια νέα παρουσία του`OutputStream` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| override [CanRead](../../aspose.svg.io/outputstream/canread/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν η τυλιγμένη ροή εξόδου υποστηρίζει ανάγνωση. |
| override [CanSeek](../../aspose.svg.io/outputstream/canseek/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν η περιτυλιγμένη ροή εξόδου υποστηρίζει αναζήτηση. |
| override [CanWrite](../../aspose.svg.io/outputstream/canwrite/) { get; } | Λαμβάνει μια τιμή που υποδεικνύει εάν η τυλιγμένη ροή εξόδου υποστηρίζει εγγραφή. |
| override [Length](../../aspose.svg.io/outputstream/length/) { get; } | Λαμβάνει το μήκος σε byte της περιτυλιγμένης ροής εξόδου. |
| override [Position](../../aspose.svg.io/outputstream/position/) { get; set; } | Λαμβάνει ή ορίζει τη θέση εντός της περιτυλιγμένης ροής εξόδου. |
| [Uri](../../aspose.svg.io/outputstream/uri/) { get; } | Λαμβάνει το URI της τοποθεσίας ροής. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| override [Close](../../aspose.svg.io/outputstream/close/)() | Κλείνει την περιτυλιγμένη ροή εξόδου και την τρέχουσα ροή. |
| override [Flush](../../aspose.svg.io/outputstream/flush/)() | Διαγράφει όλα τα buffer για την περιτυλιγμένη ροή εξόδου και προκαλεί την εγγραφή τυχόν αποθηκευμένων δεδομένων στην υποκείμενη συσκευή. |
| override [Read](../../aspose.svg.io/outputstream/read/)(byte[], int, int) | Διαβάζει μια ακολουθία byte από την περιτυλιγμένη ροή εξόδου και προωθεί τη θέση εντός της ροής κατά τον αριθμό των byte που διαβάζονται. |
| override [Seek](../../aspose.svg.io/outputstream/seek/)(long, SeekOrigin) | Ορίζει τη θέση εντός της περιτυλιγμένης ροής εξόδου. |
| override [SetLength](../../aspose.svg.io/outputstream/setlength/)(long) | Ορίζει το μήκος της περιτυλιγμένης ροής εξόδου. |
| override [Write](../../aspose.svg.io/outputstream/write/)(byte[], int, int) | Γράφει μια ακολουθία byte στο τυλιγμένο ρεύμα output και προωθεί την τρέχουσα θέση σε αυτήν τη ροή κατά τον αριθμό των byte που γράφτηκαν. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Svg.IO](../../aspose.svg.io/)
* συνέλευση [Aspose.SVG](../../)


