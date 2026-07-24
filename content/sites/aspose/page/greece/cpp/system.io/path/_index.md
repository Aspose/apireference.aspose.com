---
title: "Κλάση System::IO::Path"
linktitle: "Διαδρομή"
second_title: "Aspose.Page για C++"
description: "Κλάση System::IO::Path. Παρέχει μεθόδους για τη διαχείριση διαδρομών. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπων. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα αυτής με κανένα τρόπο σε C++."
type: docs
weight: 1900
url: /el/cpp/system.io/path/
---
## Path class


Παρέχει μεθόδους για τη διαχείριση διαδρομών. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπων. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα αυτού με κανένα τρόπο.

```cpp
class Path
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | Αλλάζει την επέκταση στη καθορισμένη διαδρομή αρχείου. |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | Καθορίζει αν η καθορισμένη διαδρομή είναι έγκυρη ελέγχοντας αν περιέχει μη έγκυρους χαρακτήρες. Εξαίρεση ρίχνεται εάν η διαδρομή περιέχει μη έγκυρους χαρακτήρες. |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | Συνδυάζει τα καθορισμένα τμήματα διαδρομής σε μία ενιαία διαδρομή, εισάγοντας χαρακτήρες διαχωριστικού φακέλου μεταξύ των τμημάτων εάν χρειάζεται. |
| static [Combine](./combine/)(const String\&, const String\&) | Συνδυάζει δύο καθορισμένα τμήματα διαδρομής σε μία ενιαία διαδρομή, εισάγοντας χαρακτήρα διαχωριστικού φακέλου μεταξύ των τμημάτων εάν χρειάζεται. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | Συνδυάζει τρία καθορισμένα τμήματα διαδρομής σε μία ενιαία διαδρομή, εισάγοντας χαρακτήρες διαχωριστικού φακέλου μεταξύ των τμημάτων εάν χρειάζεται. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | Συνδυάζει τέσσερα καθορισμένα τμήματα διαδρομής σε μία ενιαία διαδρομή, εισάγοντας χαρακτήρες διαχωριστικού φακέλου μεταξύ των τμημάτων εάν χρειάζεται. |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | Επιστρέφει το όνομα του φακέλου που αναφέρεται από τη καθορισμένη διαδρομή. |
| static [GetExtension](./getextension/)(const String\&) | Επιστρέφει την επέκταση του αρχείου που αναφέρεται από τη καθορισμένη διαδρομή. |
| static [GetFileName](./getfilename/)(const String\&) | Επιστρέφει το όνομα του αρχείου που αναφέρεται από τη καθορισμένη διαδρομή. |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | Επιστρέφει το όνομα χωρίς επέκταση του αρχείου που αναφέρεται από τη καθορισμένη διαδρομή. |
| static [GetFullPath](./getfullpath/)(const String\&) | Μετατρέπει τη καθορισμένη διαδρομή σε απόλυτη διαδρομή. |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | Επιστρέφει έναν πίνακα που περιέχει χαρακτήρες που δεν επιτρέπονται στα ονόματα αρχείων. |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | Επιστρέφει έναν πίνακα που περιέχει χαρακτήρες που δεν επιτρέπονται σε ονόματα διαδρομών. |
| static [GetPathRoot](./getpathroot/)(const String\&) | Επιστρέφει τον ριζικό κατάλογο της καθορισμένης διαδρομής. |
| static [GetRandomFileName](./getrandomfilename/)() | Επιστρέφει ένα τυχαία δημιουργημένο όνομα αρχείου. |
| static [GetTempFileName_](./gettempfilename_/)() | Δημιουργεί ένα νέο αρχείο με μοναδικό όνομα και επιστρέφει μια πλήρη διαδρομή προς αυτό. |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | Δημιουργεί ένα νέο αρχείο με μοναδικό όνομα και επιστρέφει μια πλήρη διαδρομή προς αυτό. Είναι συνώνυμο της μεθόδου [GetTempFileName_()](./gettempfilename_/). |
| static [GetTempPath](./gettemppath/)() | Επιστρέφει τη διαδρομή του προσωρινού καταλόγου του τρέχοντος χρήστη. |
| static [HasExtension](./hasextension/)(const String\&) | Καθορίζει εάν η καθορισμένη διαδρομή αναφέρεται σε αρχείο με επέκταση. |
| static [IsPathRooted](./ispathrooted/)(const String\&) | Καθορίζει εάν η καθορισμένη διαδρομή περιέχει ρίζα. |
| static [NormalizePath](./normalizepath/)(const String\&) | Κανονικοποιεί τη καθορισμένη διαδρομή. |
| static [ToBoost](./toboost/)(const String\&) | Επιστρέφει μια παρουσία της κλάσης boost::filesystem::path που αντιπροσωπεύει τη καθορισμένη διαδρομή. |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | Επιστρέφει μια αναπαράσταση σε συμβολοσειρά του καθορισμένου αντικειμένου διαδρομής του Boost. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | Ένας εναλλακτικός χαρακτήρας που χρησιμοποιείται για το διαχωρισμό επιπέδων καταλόγου σε μια διαδρομή. |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | Ένας χαρακτήρας που χρησιμοποιείται για το διαχωρισμό επιπέδων καταλόγου σε μια διαδρομή. |
| static [PathSeparator](./pathseparator/) | Ένας χαρακτήρας διαχωρισμού που χρησιμοποιείται για το διαχωρισμό συμβολοσειρών διαδρομών σε μεταβλητές περιβάλλοντος. |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | Ένας χαρακτήρας διαχωρισμού τόμου. |
## Παρατηρήσεις



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // Δημιουργήστε ένα τυχαίο όνομα αρχείου.
  auto filename = Path::GetRandomFileName();

  // Εκτυπώστε πληροφορίες σχετικά με το όνομα αρχείου.
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## Δείτε επίσης

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
