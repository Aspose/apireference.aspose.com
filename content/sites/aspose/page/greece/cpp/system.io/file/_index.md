---
title: "System::IO::File κλάση"
linktitle: "File"
second_title: "Aspose.Page για C++"
description: "System::IO::File κλάση. Παρέχει μεθόδους για τη διαχείριση αρχείων. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπων. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με κανέναν τρόπο σε C++."
type: docs
weight: 1300
url: /el/cpp/system.io/file/
---
## File class


Παρέχει μεθόδους για τη διαχείριση αρχείων. Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπου. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με κανέναν τρόπο.

```cpp
class File
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Προσθέτει συμβολοσειρές από τη συγκεκριμένη συλλογή συμβολοσειρών στο καθορισμένο αρχείο χρησιμοποιώντας την καθορισμένη κωδικοποίηση, γράφοντας κάθε συμβολοσειρά σε νέα γραμμή. Εάν το καθορισμένο αρχείο δεν υπάρχει, δημιουργείται. Το αρχείο κλείνει μετά την εγγραφή όλων των συμβολοσειρών. |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | Προσθέτει τη συγκεκριμένη συμβολοσειρά στο καθορισμένο αρχείο χρησιμοποιώντας την καθορισμένη κωδικοποίηση. |
| static [AppendText](./appendtext/)(const String\&) | Δημιουργεί ένα αντικείμενο [StreamWriter](../streamwriter/) που προσθέτει κείμενο στο καθορισμένο αρχείο χρησιμοποιώντας κωδικοποίηση UTF-8. Εάν το καθορισμένο αρχείο δεν υπάρχει, δημιουργείται. |
| static [Copy](./copy/)(const String\&, const String\&, bool) | Αντιγράφει το καθορισμένο αρχείο στην καθορισμένη τοποθεσία. Εάν το αρχείο προορισμού υπάρχει ήδη, μια παράμετρος καθορίζει αν πρέπει να αντικατασταθεί. |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | Δημιουργεί ένα νέο αρχείο (ή αντικαθιστά το υπάρχον) και το ανοίγει για πρόσβαση ανάγνωσης και εγγραφής χρησιμοποιώντας το καθορισμένο μέγεθος buffer και τις επιλογές. |
| static [CreateText](./createtext/)(const String\&) | Δημιουργεί ένα νέο ή ανοίγει υπάρχον αρχείο για εγγραφή κειμένου κωδικοποιημένου σε UTF-8. |
| static [Decrypt](./decrypt/)(const String\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| static [Delete](./delete/)(const String\&) | Διαγράφει το καθορισμένο αρχείο ή κατάλογο. |
| static [Encrypt](./encrypt/)(const String\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| static [Exists](./exists/)(const String\&) | Καθορίζει εάν η καθορισμένη διαδρομή αναφέρεται σε υπάρχον αρχείο. |
| static [GetAttributes](./getattributes/)(const String\&) | Επιστρέφει τα χαρακτηριστικά της καθορισμένης οντότητας. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Επιστρέφει την ώρα δημιουργίας της καθορισμένης οντότητας ως τοπική ώρα. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Επιστρέφει την ώρα δημιουργίας της καθορισμένης οντότητας ως ώρα UTC. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Επιστρέφει την ώρα τελευταίας πρόσβασης της καθορισμένης οντότητας ως τοπική ώρα. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Επιστρέφει την ώρα τελευταίας πρόσβασης της καθορισμένης οντότητας ως ώρα UTC. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Επιστρέφει την ώρα τελευταίας εγγραφής της καθορισμένης οντότητας ως τοπική ώρα. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Επιστρέφει την ώρα τελευταίας εγγραφής της καθορισμένης οντότητας ως ώρα UTC. |
| static [Move](./move/)(const String\&, const String\&) | Μετακινεί το καθορισμένο αρχείο στη νέα θέση. |
| static [Open](./open/)(const String\&, FileMode) | Ανοίγει το καθορισμένο αρχείο στην καθορισμένη λειτουργία για ανάγνωση και εγγραφή χωρίς κοινή χρήση. |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | Ανοίγει το καθορισμένο αρχείο στην καθορισμένη λειτουργία, με τον καθορισμένο τύπο πρόσβασης και την επιλογή κοινής χρήσης. |
| static [OpenRead](./openread/)(const String\&) | Ανοίγει το καθορισμένο αρχείο μόνο για ανάγνωση, σε λειτουργία 'Open' με κοινή πρόσβαση για ανάγνωση. |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | Ανοίγει το καθορισμένο υπάρχον αρχείο για ανάγνωση κειμένου χρησιμοποιώντας κωδικοποίηση UTF-8 χωρίς κοινή χρήση. |
| static [OpenWrite](./openwrite/)(const String\&) | Ανοίγει το καθορισμένο αρχείο μόνο για εγγραφή, σε λειτουργία 'OpenOrCreate' χωρίς κοινή χρήση. |
| static [ReadAllBytes](./readallbytes/)(const String\&) | Διαβάζει το περιεχόμενο του καθορισμένου δυαδικού αρχείου σε έναν πίνακα byte. |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | Διαβάζει το περιεχόμενο του καθορισμένου αρχείου κειμένου γραμμή προς γραμμή σε έναν πίνακα συμβολοσειρών χρησιμοποιώντας την καθορισμένη κωδικοποίηση χαρακτήρων. |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | Διαβάζει το περιεχόμενο του καθορισμένου αρχείου κειμένου σε ένα μοναδικό αντικείμενο [String](../../system/string/) χρησιμοποιώντας την καθορισμένη κωδικοποίηση χαρακτήρων. |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | Διαβάζει το περιεχόμενο του καθορισμένου αρχείου κειμένου γραμμή προς γραμμή χρησιμοποιώντας την καθορισμένη κωδικοποίηση χαρακτήρων και επιστρέφει μια συλλογή επαναληπτικών συμβολοσειρών, όπου καθεμία αντιπροσωπεύει μια μοναδική γραμμή του περιεχομένου του αρχείου. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | Αντικαθιστά το περιεχόμενο ενός αρχείου με άλλο και δημιουργεί αντίγραφο ασφαλείας του αντικατεστημένου αρχείου. |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | Ορίζει τα καθορισμένα χαρακτηριστικά στο καθορισμένο αρχείο. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Ορίζει την ώρα τελευταίας εγγραφής της καθορισμένης οντότητας ως τοπική ώρα. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Ορίζει την ώρα τελευταίας εγγραφής της καθορισμένης οντότητας ως ώρα UTC. |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | Αντικαθιστά το καθορισμένο δυαδικό αρχείο και γράφει τα καθορισμένα bytes σε αυτό. |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Δημιουργεί ένα νέο αρχείο κειμένου ή αντικαθιστά το υπάρχον και γράφει όλες τις συμβολοσειρές από την καθορισμένη επαναληπτική συλλογή συμβολοσειρών σε αυτό, κάθε συμβολοσειρά σε νέα γραμμή, χρησιμοποιώντας την καθορισμένη κωδικοποίηση. |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | Δημιουργεί ένα νέο αρχείο κειμένου ή αντικαθιστά το υπάρχον και γράφει όλες τις συμβολοσειρές από τον καθορισμένο πίνακα συμβολοσειρών σε αυτό, κάθε συμβολοσειρά σε νέα γραμμή, χρησιμοποιώντας την καθορισμένη κωδικοποίηση. |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | Δημιουργεί ένα νέο αρχείο κειμένου ή αντικαθιστά το υπάρχον και γράφει το περιεχόμενο της καθορισμένης συμβολοσειράς σε αυτό χρησιμοποιώντας την καθορισμένη κωδικοποίηση. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | Προεπιλεγμένη τιμή του αριθμού των bytes που αποθηκεύονται στην ενδιάμεση μνήμη κατά την ανάγνωση και εγγραφή σε ένα αρχείο. |
## Δείτε επίσης

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
