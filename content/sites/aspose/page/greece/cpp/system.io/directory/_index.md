---
title: "System::IO::Directory κλάση"
linktitle: "Directory"
second_title: "Aspose.Page για C++"
description: "System::IO::Directory κλάση. Περιέχει μεθόδους για τη διαχείριση καταλόγων. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες δημιουργίας αντικειμένων. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα αυτής της κλάσης με οποιονδήποτε τρόπο σε C++."
type: docs
weight: 1100
url: /el/cpp/system.io/directory/
---
## Directory class


Περιέχει μεθόδους για τη διαχείριση καταλόγων. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπου. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με κανέναν τρόπο.

```cpp
class Directory
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | Δημιουργεί όλους τους καταλόγους στη καθορισμένη διαδρομή εάν δεν υπάρχουν. |
| static [Delete](./delete/)(const String\&, bool) | Αφαιρεί το καθορισμένο αρχείο ή κατάλογο. Δεν ρίχνει εξαίρεση. |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | Αναζητά τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο. |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | Αναζητά τα αρχεία που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο. |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | Αναζητά τα αρχεία και τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο. |
| static [Exists](./exists/)(const String\&) | Καθορίζει εάν η καθορισμένη διαδρομή αναφέρεται σε υπάρχον κατάλογο. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Επιστρέφει την ώρα δημιουργίας της καθορισμένης οντότητας ως τοπική ώρα. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Επιστρέφει την ώρα δημιουργίας της καθορισμένης οντότητας ως ώρα UTC. |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | Επιστρέφει το πλήρες όνομα (συμπεριλαμβανομένης της διαδρομής) του τρέχοντος καταλόγου. |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | Αναζητά τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο. |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | Επιστρέφει τον ριζικό κατάλογο της καθορισμένης διαδρομής. |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | Αναζητά τα αρχεία που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο. |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | Αναζητά τα αρχεία και τους καταλόγους που ικανοποιούν τα καθορισμένα κριτήρια αναζήτησης είτε στον καθορισμένο κατάλογο είτε σε όλο το δέντρο καταλόγων που ρίζεται στον καθορισμένο κατάλογο. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Επιστρέφει την ώρα τελευταίας πρόσβασης της καθορισμένης οντότητας ως τοπική ώρα. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Επιστρέφει την ώρα τελευταίας πρόσβασης της καθορισμένης οντότητας ως ώρα UTC. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Επιστρέφει την ώρα τελευταίας εγγραφής της καθορισμένης οντότητας ως τοπική ώρα. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Επιστρέφει την ώρα τελευταίας εγγραφής της καθορισμένης οντότητας ως ώρα UTC. |
| static [GetLogicalDrives](./getlogicaldrives/)() | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| static [GetParent](./getparent/)(const String\&) | Επιστρέφει έναν κοινό δείκτη σε αντικείμενο [DirectoryInfo](../directoryinfo/) που αντιπροσωπεύει τον γονικό φάκελο της καθορισμένης οντότητας. |
| static [Move](./move/)(const String\&, const String\&) | Μετακινεί την καθορισμένη οντότητα στη νέα θέση. Εάν η οντότητα προς μετακίνηση είναι φάκελος, μετακινείται μαζί με όλο το περιεχόμενό του. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | Ορίζει την ώρα δημιουργίας της καθορισμένης οντότητας ως τοπική ώρα. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | Ορίζει την ώρα δημιουργίας της καθορισμένης οντότητας ως ώρα UTC. |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | Ορίζει τον τρέχοντα φάκελο. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | Ορίζει την ώρα τελευταίας πρόσβασης της καθορισμένης οντότητας ως τοπική ώρα. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | Ορίζει την ώρα τελευταίας πρόσβασης της καθορισμένης οντότητας ως ώρα UTC. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Ορίζει την ώρα τελευταίας εγγραφής της καθορισμένης οντότητας ως τοπική ώρα. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Ορίζει την ώρα τελευταίας εγγραφής της καθορισμένης οντότητας ως ώρα UTC. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | Ένα ψευδώνυμο για έναν κοινό δείκτη σε αντικείμενο IEnumerable που επαναλαμβάνει ένα σύνολο αντικειμένων [String](../../system/string/). |
## Παρατηρήσεις



```cpp
#include "system/io/directory.h"
#include "system/io/path.h"
#include "system/string.h"
#include <iostream>

void PrintMessage(const System::String &path)
{
  std::cout << "Directory '" << path << (System::IO::Directory::Exists(path) ? "' exists." : "' doesn't exist.") << std::endl;
}

int main()
{
  // Δημιουργήστε συμβολοσειρές που περιέχουν διαδρομές προς φακέλους.
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // Ελέγξτε αν υπάρχουν φάκελοι.
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // Εκτυπώστε τις πληροφορίες του προσωρινού φακέλου.
  std::cout <<
    "Creation Time: " << System::IO::Directory::GetCreationTime(tempPath) << std::endl <<
    "Last Access Time: " << System::IO::Directory::GetLastAccessTime(tempPath) << std::endl <<
    "Last Write Time: " << System::IO::Directory::GetLastWriteTime(tempPath) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Directory 'C:\' exists.
Directory 'C:\Some directory' doesn't exist.
Directory 'C:\Users\lanor\AppData\Local\Temp\' exists.
Creation Time: 27.08.2021 14:21:42
Last Access Time: 07.10.2021 12:16:41
Last Write Time: 07.10.2021 12:16:41
*/
```

## Δείτε επίσης

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
