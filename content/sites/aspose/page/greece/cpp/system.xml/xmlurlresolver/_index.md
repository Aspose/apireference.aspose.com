---
title: "System::Xml::XmlUrlResolver κλάση"
linktitle: "XmlUrlResolver"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlUrlResolver κλάση. Επίλυση εξωτερικών πόρων XML που ονομάζονται με Uniform Resource Identifier (URI) σε C++."
type: docs
weight: 4100
url: /el/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


Επιλύει εξωτερικούς πόρους XML που ορίζονται από ένα Καθολικό Αναγνωριστικό Πόρων (URI).

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Επιλύει το απόλυτο URI από το βασικό και τα σχετικά URIs. |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | Ορίζει την πολιτική cache για το υποκείμενο αντικείμενο WebRequest. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Ορίζει τα διαπιστευτήρια που χρησιμοποιούνται για την πιστοποίηση των web αιτήσεων. |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | Ορίζει τον διακομιστή μεσολάβησης δικτύου για το υποκείμενο αντικείμενο WebRequest. |
| [XmlUrlResolver](./xmlurlresolver/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlUrlResolver](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
