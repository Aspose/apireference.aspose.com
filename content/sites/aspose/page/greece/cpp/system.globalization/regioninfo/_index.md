---
title: "System::Globalization::RegionInfo κλάση"
linktitle: "RegionInfo"
second_title: "Aspose.Page για C++"
description: "System::Globalization::RegionInfo κλάση. Παρέχει πληροφορίες για την περιοχή. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2100
url: /el/cpp/system.globalization/regioninfo/
---
## RegionInfo class


Παρέχει πληροφορίες για την περιοχή. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class RegionInfo : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | Λαμβάνει το αγγλικό όνομα του νομίσματος. |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | Λαμβάνει το τοπικό όνομα του νομίσματος. |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | Λαμβάνει το σύμβολο του νομίσματος. |
| static [get_CurrentRegion](./get_currentregion/)() | Λαμβάνει την περιοχή που έχει οριστεί στο σύστημα. |
| virtual [get_DisplayName](./get_displayname/)() const | Λαμβάνει το πλήρες όνομα της περιοχής. |
| virtual [get_EnglishName](./get_englishname/)() const | Λαμβάνει το αγγλικό όνομα της περιοχής. |
| virtual [get_GeoId](./get_geoid/)() const | Λαμβάνει μοναδικό αναγνωριστικό για μια περιοχή. |
| virtual [get_IsMetric](./get_ismetric/)() const | Ελέγχει εάν η περιοχή χρησιμοποιεί το μετρικό σύστημα. |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | Λαμβάνει το σύμβολο νομίσματος ISO. |
| virtual [get_Name](./get_name/)() const | Λαμβάνει το όνομα της περιοχής. |
| virtual [get_NativeName](./get_nativename/)() const | Λαμβάνει το τοπικό όνομα της περιοχής. |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | Λαμβάνει τον 3-γράμματο κωδικό ISO της περιοχής. |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | Λαμβάνει τον 3-γράμματο κωδικό περιοχής [Windows](../../system.windows/). |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | Λαμβάνει τον 2-γράμματο κωδικό ISO της περιοχής. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | Πληροφορίες RTTI. |
| [RegionInfo](./regioninfo/)(int) | Κατασκευαστής. |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
