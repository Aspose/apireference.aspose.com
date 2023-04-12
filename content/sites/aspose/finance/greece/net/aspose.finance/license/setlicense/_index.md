---
title: License.SetLicense
second_title: Aspose.Finance for .NET API Reference
description: License μέθοδος. Παρέχει άδεια χρήσης του στοιχείου.
type: docs
weight: 20
url: /el/net/aspose.finance/license/setlicense/
---
## SetLicense(string) {#setlicense_1}

Παρέχει άδεια χρήσης του στοιχείου.

```csharp
public void SetLicense(string licenseName)
```

### Παρατηρήσεις

Προσπαθεί να βρει την άδεια στις ακόλουθες τοποθεσίες:

1. Ρητή διαδρομή.

2. Ο φάκελος που περιέχει τη διάταξη του στοιχείου Aspose.

3. Ο φάκελος που περιέχει τη συγκρότηση κλήσης του πελάτη.

4. Ο φάκελος που περιέχει τη διάταξη καταχώρησης (εκκίνησης).

5. Ένας ενσωματωμένος πόρος στη διάταξη κλήσης του πελάτη.

**Σημείωση:**Στο .NET Compact Framework, προσπαθεί να βρει την άδεια χρήσης μόνο σε αυτές τις τοποθεσίες:

1. Ρητή διαδρομή.

2. Ένας ενσωματωμένος πόρος στη διάταξη κλήσης του πελάτη.

2. Ο τρέχων κατάλογος εργασίας της εφαρμογής java.

3. Ο φάκελος που περιέχει το αρχείο JAR στοιχείου Aspose.

4. Ο φάκελος που περιέχει το αρχείο JAR που καλεί τον πελάτη.

### Παραδείγματα

Σε αυτό το παράδειγμα, θα γίνει μια προσπάθεια να βρεθεί ένα αρχείο άδειας με το όνομα MyLicense.lic στο φάκελο που περιέχει  το στοιχείο, στο φάκελο που περιέχει τη συγκρότηση κλήσης, στο φάκελο της διάταξης καταχώρησης και, στη συνέχεια, στους ενσωματωμένους πόρους της συγκρότησης κλήσης.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As License = New License
license.SetLicense("MyLicense.lic")
```

το αρχείο jar του στοιχείου:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

Μπορεί να είναι πλήρες ή σύντομο όνομα αρχείου ή όνομα ενός ενσωματωμένου πόρου. Χρησιμοποιήστε μια κενή συμβολοσειρά για να μεταβείτε στη λειτουργία αξιολόγησης.

### Δείτε επίσης

* class [License](../)
* χώρος ονομάτων [Aspose.Finance](../../license/)
* συνέλευση [Aspose.Finance](../../../)

---

## SetLicense(Stream) {#setlicense}

Παρέχει άδεια χρήσης του στοιχείου.

```csharp
public void SetLicense(Stream stream)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| stream | Stream | Μια ροή που περιέχει την άδεια. |

### Παρατηρήσεις

Χρησιμοποιήστε αυτήν τη μέθοδο για να φορτώσετε μια άδεια από μια ροή.

### Παραδείγματα

```csharp
[C#]

License license = new License();
license.SetLicense(myStream);


[Visual Basic]

Dim license as License = new License
license.SetLicense(myStream)

License license = new License();
license.setLicense(myStream);
```

### Δείτε επίσης

* class [License](../)
* χώρος ονομάτων [Aspose.Finance](../../license/)
* συνέλευση [Aspose.Finance](../../../)


