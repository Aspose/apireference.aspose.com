---
title: "System::Xml::Resolvers::XmlPreloadedResolver κλάση"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page για C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver κλάση. Αντιπροσωπεύει μια κλάση που χρησιμοποιείται για την προπλήρωση της κρυφής μνήμης με DTDs ή ροές XML σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml.resolvers/xmlpreloadedresolver/
---
## XmlPreloadedResolver class


Αντιπροσωπεύει μια κλάση που χρησιμοποιείται για την προπλήρωση της κρυφής μνήμης με DTD ή ροές XML.

```cpp
class XmlPreloadedResolver : public System::Xml::XmlResolver
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) | Προσθέτει έναν πίνακα byte στο αποθηκευτικό χώρο του [XmlPreloadedResolver](./) και το αντιστοιχίζει σε ένα URI. Εάν ο αποθηκευτικός χώρος περιέχει ήδη μια αντιστοίχηση για το ίδιο URI, η υπάρχουσα αντιστοίχηση αντικαθίσταται. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Προσθέτει έναν πίνακα byte στο αποθηκευτικό χώρο του [XmlPreloadedResolver](./) και το αντιστοιχίζει σε ένα URI. Εάν ο αποθηκευτικός χώρος περιέχει ήδη μια αντιστοίχηση για το ίδιο URI, η υπάρχουσα αντιστοίχηση αντικαθίσταται. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) | Προσθέτει ένα Stream στο αποθηκευτικό χώρο του [XmlPreloadedResolver](./) και το αντιστοιχίζει σε ένα URI. Εάν ο αποθηκευτικός χώρος περιέχει ήδη μια αντιστοίχηση για το ίδιο URI, η υπάρχουσα αντιστοίχηση αντικαθίσταται. |
| [Add](./add/)(const SharedPtr\<Uri\>\&, const String\&) | Προσθέτει μια συμβολοσειρά με προφορτωμένα δεδομένα στο αποθηκευτικό χώρο του [XmlPreloadedResolver](./) και την αντιστοιχίζει σε ένα URI. Εάν ο αποθηκευτικός χώρος περιέχει ήδη μια αντιστοίχηση για το ίδιο URI, η υπάρχουσα αντιστοίχηση αντικαθίσταται. |
| [get_PreloadedUris](./get_preloadeduris/)() | Επιστρέφει μια συλλογή προφορτωμένων URIs. |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο. |
| [Remove](./remove/)(const SharedPtr\<Uri\>\&) | Αφαιρεί τα δεδομένα που αντιστοιχούν στο URI από το [XmlPreloadedResolver](./). |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Επιλύει το απόλυτο URI από το βασικό και τα σχετικά URIs. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Ορίζει τα διαπιστευτήρια που χρησιμοποιούνται για την ταυτοποίηση του υποκείμενου [Net::WebRequest](../../system.net/webrequest/). |
| [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) override | Καθορίζει εάν ο resolver υποστηρίζει άλλους τύπους εκτός από το Stream. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)() | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlPreloadedResolver](./). |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(XmlKnownDtds) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlPreloadedResolver](./) με τα καθορισμένα προφορτωμένα γνωστά DTD. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlPreloadedResolver](./) με τον καθορισμένο εναλλακτικό resolver. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlPreloadedResolver](./) με τον καθορισμένο εναλλακτικό resolver και τα προφορτωμένα γνωστά DTD. |
| [XmlPreloadedResolver](./xmlpreloadedresolver/)(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) | Αρχικοποιεί ένα νέο στιγμιότυπο της κλάσης [XmlPreloadedResolver](./) με τον καθορισμένο εναλλακτικό resolver, τα προφορτωμένα γνωστά DTD και το συγκριτή ισότητας URI. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlResolver](../../system.xml/xmlresolver/)
* Namespace [System::Xml::Resolvers](../)
* Library [Aspose.Page for C++](../../)
