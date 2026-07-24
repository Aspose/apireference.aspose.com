---
title: "Κλάση System::Uri"
linktitle: "Uri"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Uri. Ενοποιημένο αναγνωριστικό πόρων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα στη C++."
type: docs
weight: 6700
url: /el/cpp/system/uri/
---
## Uri class


Ενοποιημένο αναγνωριστικό πόρων. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../makeobject/). Ποτέ μην δημιουργείτε αντίγραφο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../smartptr/) και χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class Uri : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | Καθορίζει τον τύπο του συγκεκριμένου ονόματος κεντρικού υπολογιστή. |
| static [CheckSchemeName](./checkschemename/)(const String\&) | Καθορίζει εάν το συγκεκριμένο σχήμα είναι έγκυρο. |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | Συγκρίνει τα συγκεκριμένα αντικείμενα [Uri](./) χρησιμοποιώντας τους καθορισμένους κανόνες σύγκρισης. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Καθορίζει εάν τα URI που αντιπροσωπεύονται από το τρέχον και το καθορισμένο αντικείμενο είναι ίσα. |
| static [EscapeDataString](./escapedatastring/)(const String\&) | Μετατρέπει μια συμβολοσειρά στην κωδικοποιημένη (escaped) αναπαράστασή της. |
| static [EscapeUriString](./escapeuristring/)(const String\&) | Μετατρέπει μια συμβολοσειρά URI στην κωδικοποιημένη (escaped) αναπαράστασή της. |
| static [FromHex](./fromhex/)(char16_t) | Αποκτά τη δεκαδική τιμή ενός δεκαεξαδικού ψηφίου. |
| [get_AbsolutePath](./get_absolutepath/)() const | Επιστρέφει το απόλυτο μονοπάτι του URI. |
| [get_AbsoluteUri](./get_absoluteuri/)() const | Επιστρέφει το απόλυτο URI. |
| [get_Authority](./get_authority/)() const | Επιστρέφει το όνομα κεντρικού υπολογιστή και τον αριθμό θύρας για έναν διακομιστή. |
| [get_DnsSafeHost](./get_dnssafehost/)() const | Επιστρέφει ένα μη κωδικοποιημένο (unescaped) όνομα κεντρικού υπολογιστή. |
| [get_Fragment](./get_fragment/)() const | Επιστρέφει το κωδικοποιημένο (escaped) τμήμα URI. |
| [get_Host](./get_host/)() const | Επιστρέφει το όνομα κεντρικού υπολογιστή. |
| [get_HostNameType](./get_hostnametype/)() const | Επιστρέφει τον τύπο του ονόματος κεντρικού υπολογιστή. |
| [get_IdnHost](./get_idnhost/)() const | Επιστρέφει ένα Διεθνές Όνομα Τομέα του κεντρικού υπολογιστή. |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | Καθορίζει εάν το URI που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι απόλυτο. |
| [get_IsDefaultPort](./get_isdefaultport/)() const | Καθορίζει εάν το URI που αντιπροσωπεύεται από το τρέχον αντικείμενο έχει προεπιλεγμένη θύρα για το σχήμα του URI. |
| [get_IsFile](./get_isfile/)() const | Καθορίζει εάν το URI που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι αρχείο. |
| [get_IsLoopback](./get_isloopback/)() const | Καθορίζει εάν το URI που αντιπροσωπεύεται από το τρέχον αντικείμενο αναφέρεται σε τοπικό κεντρικό υπολογιστή. |
| [get_IsUnc](./get_isunc/)() const | Καθορίζει εάν το URI που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι διαδρομή UNC. |
| [get_LocalPath](./get_localpath/)() const | Επιστρέφει την αναπαράσταση του λειτουργικού συστήματος του ονόματος αρχείου που αναφέρεται από το URI που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_OriginalString](./get_originalstring/)() const | Επιστρέφει τη συμβολοσειρά URI που μεταβιβάστηκε στον κατασκευαστή όταν δημιουργήθηκε το τρέχον αντικείμενο. |
| [get_PathAndQuery](./get_pathandquery/)() const | Επιστρέφει το απόλυτο μονοπάτι και τα στοιχεία ερωτήματος του URI που αντιπροσωπεύεται από το τρέχον αντικείμενο, διαχωρισμένα με ερωτηματικό (?). |
| [get_Port](./get_port/)() const | Επιστρέφει τον αριθμό θύρας του URI που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Query](./get_query/)() const | Επιστρέφει τις πληροφορίες ερωτήματος που περιλαμβάνονται στο URI που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Scheme](./get_scheme/)() const | Επιστρέφει το σχήμα του URI που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_Segments](./get_segments/)() const | Επιστρέφει έναν πίνακα συμβολοσειρών που περιέχει τα τμήματα διαδρομής του URI που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [get_UserEscaped](./get_userescaped/)() const | Καθορίζει εάν η συμβολοσειρά URI που μεταβιβάστηκε στον κατασκευαστή του τρέχοντος αντικειμένου ήταν πλήρως κωδικοποιημένη. |
| [get_UserInfo](./get_userinfo/)() const | Επιστρέφει ένα όνομα χρήστη, κωδικό πρόσβασης και άλλες πληροφορίες χρήστη που σχετίζονται με το URI που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | Επιστρέφει τα καθορισμένα στοιχεία του URI που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας την καθορισμένη κωδικοποίηση. |
| [GetHashCode](./gethashcode/)() const override | Λαμβάνει τον κωδικό κατακερματισμού για το URI. |
| [GetLeftPart](./getleftpart/)(UriPartial) | Επιστρέφει το καθορισμένο τμήμα του URI που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [HexEscape](./hexescape/)(char16_t) | Επιστρέφει ένα δεκαεξαδικό ισοδύναμο του καθορισμένου χαρακτήρα. |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | Μετατρέπει την καθορισμένη δεκαεξαδική αναπαράσταση ενός χαρακτήρα σε χαρακτήρα. |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | Καθορίζει εάν το URI που αντιπροσωπεύεται από το τρέχον [Uri](./) αντικείμενο είναι βάση του URI που αντιπροσωπεύεται από το καθορισμένο [Uri](./) αντικείμενο. |
| static [IsHexDigit](./ishexdigit/)(char16_t) | Καθορίζει εάν ο καθορισμένος χαρακτήρας αντιπροσωπεύει ένα έγκυρο δεκαεξαδικό ψηφίο. |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | Καθορίζει εάν ένας χαρακτήρας στην καθορισμένη συμβολοσειρά στη συγκεκριμένη θέση είναι κωδικοποιημένος δεκαεξαδικά. |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | Δείχνει εάν η συμβολοσειρά που χρησιμοποιήθηκε για τη δημιουργία αυτού του [Uri](./) ήταν σωστά διαμορφωμένη και δεν απαιτείται περαιτέρω διαφυγή. |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | Καθορίζει εάν η καθορισμένη συμβολοσειρά είναι ένα σωστά διαμορφωμένο URI. |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | Καθορίζει τη διαφορά μεταξύ δύο περιπτώσεων του [Uri](./). |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | Καθορίζει τη διαφορά μεταξύ των URI που αντιπροσωπεύονται από το τρέχον και το καθορισμένο αντικείμενο [Uri](./). |
| [ToString](./tostring/)() const override | Επιστρέφει την αναπαράσταση συμβολοσειράς του URI που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | Δημιουργεί ένα αντικείμενο [Uri](./) που αντιπροσωπεύει το καθορισμένο URI; ένα όρισμα καθορίζει τον τύπο του URI. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | Δημιουργεί ένα [Uri](./) abject από το καθορισμένο αντικείμενο [Uri](./) που αντιπροσωπεύει το βασικό URI και την αναπαράσταση συμβολοσειράς του σχετικού URI. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | Δημιουργεί ένα [Uri](./) abject από τα καθορισμένα βασικά και σχετικά URI. |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | Αποδιαφύγει τη συγκεκριμένη διαφευγμένη συμβολοσειρά. |
| [Uri](./uri/)(const String\&) | Δημιουργεί ένα αντικείμενο [Uri](./) που αντιπροσωπεύει το καθορισμένο URI. |
| [Uri](./uri/)(const String\&, bool) | Δημιουργεί ένα αντικείμενο [Uri](./) που αντιπροσωπεύει το καθορισμένο URI; ένα όρισμα καθορίζει εάν το URI πρέπει να διαφύγει. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | Δημιουργεί ένα [Uri](./) abject από το καθορισμένο αντικείμενο [Uri](./) που αντιπροσωπεύει το βασικό URI και την αναπαράσταση συμβολοσειράς του σχετικού URI; ένα όρισμα καθορίζει εάν το URI πρέπει να διαφύγει. |
| [Uri](./uri/)(const String\&, UriKind) | Δημιουργεί ένα αντικείμενο [Uri](./) που αντιπροσωπεύει το καθορισμένο URI; ένα όρισμα καθορίζει τον τύπο του URI. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | Δημιουργεί ένα [Uri](./) abject από τα καθορισμένα βασικά και σχετικά URI. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | Δημιουργεί ένα [Uri](./) abject από τα καθορισμένα βασικά και σχετικά URI. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | Καθορίζει τους χαρακτήρες που διαχωρίζουν το σχήμα του πρωτοκόλλου επικοινωνίας από το τμήμα διεύθυνσης του [Uri](./). |
| static [UriSchemeFile](./urischemefile/) | Καθορίζει ότι το [Uri](./) είναι δείκτης σε αρχείο. |
| static [UriSchemeFtp](./urischemeftp/) | Καθορίζει ότι το [Uri](./) προσπελάζεται μέσω του Πρωτοκόλλου Μεταφοράς Αρχείων. |
| static [UriSchemeGopher](./urischemegopher/) | Καθορίζει ότι το [Uri](./) προσπελάζεται μέσω του πρωτοκόλλου Gopher. |
| static [UriSchemeHttp](./urischemehttp/) | Καθορίζει ότι το [Uri](./) προσπελάζεται μέσω του Πρωτοκόλλου Μεταφοράς Υπερκειμένου. |
| static [UriSchemeHttps](./urischemehttps/) | Καθορίζει ότι το [Uri](./) προσπελάζεται μέσω του Ασφαλούς Πρωτοκόλλου Μεταφοράς Υπερκειμένου. |
| static [UriSchemeMailto](./urischememailto/) | Καθορίζει ότι το [Uri](./) είναι διεύθυνση ηλεκτρονικού ταχυδρομείου και προσπελάζεται μέσω του Απλού Πρωτοκόλλου Μεταφοράς Ταχυδρομείου. |
| static [UriSchemeNetPipe](./urischemenetpipe/) | Καθορίζει ότι το [Uri](./) προσπελάζεται μέσω του σχήματος NetPipe που χρησιμοποιείται από το [Windows](../../system.windows/) Communication Foundation. |
| static [UriSchemeNetTcp](./urischemenettcp/) | Καθορίζει ότι το [Uri](./) προσπελάζεται μέσω του σχήματος NetTcp που χρησιμοποιείται από το [Windows](../../system.windows/) Communication Foundation. |
| static [UriSchemeNews](./urischemenews/) | Καθορίζει ότι το [Uri](./) είναι ομάδα ειδήσεων του Internet και προσπελάζεται μέσω του Πρωτοκόλλου Μεταφοράς Ειδήσεων Δικτύου. |
| static [UriSchemeNntp](./urischemenntp/) | Καθορίζει ότι το [Uri](./) είναι ομάδα ειδήσεων του Internet και προσπελάζεται μέσω του Πρωτοκόλλου Μεταφοράς Ειδήσεων Δικτύου. |
## Παρατηρήσεις



```cpp
#include "system/smart_ptr.h"
#include "system/uri.h"
#include <iostream>

int main()
{
  const auto uri = System::MakeObject<System::Uri>(u"https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/");

std::cout <<
  "AbsolutePath: " << uri->get_AbsolutePath() << std::endl <<
  "AbsoluteUri: " << uri->get_AbsoluteUri() << std::endl <<
  "Authority: " << uri->get_Authority() << std::endl <<
  "DnsSafeHost: " << uri->get_DnsSafeHost() << std::endl <<
  "Fragment: " << uri->get_Fragment() << std::endl <<
  "Host: " << uri->get_Host() << std::endl <<
  "IdnHost: " << uri->get_IdnHost() << std::endl <<
  "LocalPath: " << uri->get_LocalPath() << std::endl <<
  "OriginalString: " << uri->get_OriginalString() << std::endl <<
  "PathAndQuery: " << uri->get_PathAndQuery() << std::endl <<
  "Port: " << uri->get_Port() << std::endl <<
  "Query: " << uri->get_Query() << std::endl <<
  "Scheme: " << uri->get_Scheme() << std::endl;

  return 0;
}
/*
This code example produces the following output:
AbsolutePath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
AbsoluteUri: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Authority: docs.codeporting.com
DnsSafeHost: docs.codeporting.com
Fragment:
Host: docs.codeporting.com
IdnHost: docs.codeporting.com
LocalPath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
OriginalString: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
PathAndQuery: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Port: 443
Query:
Scheme: https
*/
```

## Δείτε επίσης

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
