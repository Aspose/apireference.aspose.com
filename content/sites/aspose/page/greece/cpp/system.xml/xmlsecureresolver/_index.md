---
title: "System::Xml::XmlSecureResolver κλάση"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlSecureResolver κλάση. Βοηθά στην ασφάλεια μιας άλλης υλοποίησης του XmlResolver τυλίγοντας το αντικείμενο XmlResolver και περιορίζοντας τους πόρους που έχει πρόσβαση το υποκείμενο XmlResolver σε C++."
type: docs
weight: 3600
url: /el/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


Βοηθά στην ασφάλεια μιας άλλης υλοποίησης του [XmlResolver](../xmlresolver/) τυλίγοντας το αντικείμενο [XmlResolver](../xmlresolver/) και περιορίζοντας τους πόρους που έχει πρόσβαση το υποκείμενο [XmlResolver](../xmlresolver/).

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Επιλύει το απόλυτο URI από τη βάση και τα σχετικά URIs καλώντας το **ResolveUri** στο υποκείμενο [XmlResolver](../xmlresolver/). |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Ορίζει τα διαπιστευτήρια που χρησιμοποιούνται για την πιστοποίηση των web αιτήσεων. |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | Αρχικοποιεί μια νέα παρουσία της κλάσης [XmlSecureResolver](./) με το [XmlResolver](../xmlresolver/) και το URL που παρέχεται. |
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
