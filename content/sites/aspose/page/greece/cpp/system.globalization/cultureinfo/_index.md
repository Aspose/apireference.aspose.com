---
title: "Κλάση System::Globalization::CultureInfo"
linktitle: "CultureInfo"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Globalization::CultureInfo. Συλλογή τιμών και αλγορίθμων ειδικών για πολιτισμό. Οι λειτουργίες setter είναι ενεργοποιημένες μόνο σε αντικείμενα που δεν είναι μόνο για ανάγνωση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 500
url: /el/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


Συλλογή τιμών και αλγορίθμων ειδικών για πολιτισμό. Οι λειτουργίες setter είναι ενεργοποιημένες μόνο σε αντικείμενα που δεν είναι μόνο για ανάγνωση. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | Ανανεώνει τις αποθηκευμένες στην cache πληροφορίες πολιτισμού. |
| [Clone](./clone/)() override | Κλωνοποιεί τις πληροφορίες πολιτισμού. |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | Δημιουργεί πολιτισμό με βάση το όνομα. |
| explicit [CultureInfo](./cultureinfo/)(int) | Πληροφορίες RTTI. |
| [CultureInfo](./cultureinfo/)(int, bool) | Κατασκευαστής. |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | Κατασκευαστής. |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | Κατασκευαστής. |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | Πάντα ρίχνει ArgumentNullException. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα. |
| virtual [get_Calendar](./get_calendar/)() const | Αποκτά το ημερολόγιο που χρησιμοποιείται από τον πολιτισμό. |
| virtual [get_CompareInfo](./get_compareinfo/)() const | Αποκτά το συγκριτή συμβολοσειρών που τηρεί τους κανόνες του πολιτισμού. |
| [get_CultureTypes](./get_culturetypes/)() const | Αποκτά τη bitwise ένωση των τύπων πολιτισμού που περιγράφουν τον τρέχοντα πολιτισμό. |
| static [get_CurrentCulture](./get_currentculture/)() | Αποκτά τον πολιτισμό που έχει οριστεί για το τρέχον νήμα. |
| static [get_CurrentUICulture](./get_currentuiculture/)() | Αποκτά τον UI πολιτισμό του τρέχοντος νήματος. |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | Αποκτά πληροφορίες μορφοποίησης ημερομηνίας. |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | Αποκτά τον προεπιλεγμένο πολιτισμό στο τρέχον domain της εφαρμογής. |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | Αποκτά τον προεπιλεγμένο UI πολιτισμό στο τρέχον domain της εφαρμογής. |
| virtual [get_DisplayName](./get_displayname/)() const | Αποκτά το εμφανιζόμενο όνομα του πολιτισμού. |
| virtual [get_EnglishName](./get_englishname/)() const | Αποκτά το αγγλικό όνομα του πολιτισμού. |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | Αποκτά το όνομα RFC 4646 για μια γλώσσα. |
| static [get_InstalledUICulture](./get_installeduiculture/)() | Αποκτά τον πολιτισμό που είναι εγκατεστημένος με το λειτουργικό σύστημα. |
| static [get_InvariantCulture](./get_invariantculture/)() | Αποκτά τον αμετάβλητο πολιτισμό. |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | Ελέγχει εάν ο πολιτισμός είναι ουδέτερος. |
| [get_IsReadOnly](./get_isreadonly/)() const | Ελέγχει αν το αντικείμενο πολιτισμού είναι μόνο για ανάγνωση. |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | Λαμβάνει το ενεργό αναγνωριστικό τοπικής ρύθμισης εισόδου. |
| virtual [get_LCID](./get_lcid/)() const | Λαμβάνει το αναγνωριστικό του πολιτισμού. |
| virtual [get_Name](./get_name/)() const | Λαμβάνει το όνομα του πολιτισμού. |
| virtual [get_NativeName](./get_nativename/)() const | Λαμβάνει το εγγενές όνομα του πολιτισμού. |
| virtual [get_NumberFormat](./get_numberformat/)() const | Λαμβάνει πληροφορίες μορφοποίησης αριθμών. |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | Λίστα ημερολογίων που μπορούν να χρησιμοποιηθούν με τον πολιτισμό. |
| virtual [get_Parent](./get_parent/)() const | Λαμβάνει τον γονικό πολιτισμό. |
| virtual [get_TextInfo](./get_textinfo/)() const | Λαμβάνει τις παραμέτρους κειμένου που χρησιμοποιεί ο πολιτισμός. |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | Λαμβάνει τον τριψήφιο κωδικό γλώσσας ISO 639-2. |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | Λαμβάνει τον τριψήφιο κωδικό γλώσσας όπως ορίζεται στο API του [Windows](../../system.windows/). |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | Λαμβάνει το διψήφιο όνομα γλώσσας ISO που σχετίζεται με τον πολιτισμό. |
| [get_UseUserOverride](./get_useuseroverride/)() const | Λαμβάνει μια σημαία που υποδεικνύει αν το [CultureInfo](./) χρησιμοποιεί ρυθμίσεις πολιτισμού που επέλεξε ο χρήστης. |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | Λαμβάνει εναλλακτικό πολιτισμό κατάλληλο για εφαρμογές κονσόλας. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | Λαμβάνει τον πολιτισμό με το όνομά του. Το ίδιο με το CreateSpecificCulture. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | Λαμβάνει τον πολιτισμό με το όνομά του. |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | Λαμβάνει τον πολιτισμό με το αναγνωριστικό του. |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | Καταργημένο. Λαμβάνει ένα μόνο για ανάγνωση αντικείμενο [CultureInfo](./) με την καθορισμένη ετικέτα γλώσσας RFC 4646. |
| static [GetCultures](./getcultures/)(CultureTypes) | Λαμβάνει πολιτισμούς που ανήκουν στους καθορισμένους τύπους. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Λαμβάνει το αντικείμενο μορφής για συγκεκριμένο τύπο. |
| [GetHashCode](./gethashcode/)() const override | Επιστρέφει τον κωδικό κατακερματισμού του αντικειμένου. |
| [IsInherited](./isinherited/)() const | Λαμβάνει τη σημαία κληρονομικότητας. ΓΙΑ ΕΣΩΤΕΡΙΚΗ ΧΡΗΣΗ. |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | Συγκρίνει τις παραμέτρους του πολιτισμού. |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | Λαμβάνει μια έκδοση μόνο για ανάγνωση του πολιτισμού. |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | Ορίζει τον πολιτισμό για το τρέχον νήμα. |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | Ορίζει τον UI πολιτισμό του τρέχοντος νήματος. |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | Ορίζει πληροφορίες μορφής ημερομηνίας. |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | Ορίζει την προεπιλεγμένη πολιτιστική ρύθμιση στον τρέχοντα τομέα εφαρμογής. |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | Ορίζει την προεπιλεγμένη πολιτιστική ρύθμιση UI στον τρέχοντα τομέα εφαρμογής. |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | Λαμβάνει πληροφορίες μορφοποίησης αριθμών. |
| [ToString](./tostring/)() const override | Μετατρέπει την πολιτιστική ρύθμιση σε συμβολοσειρά. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
