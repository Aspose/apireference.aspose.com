---
title: "Κλάση System::Xml::XmlResolver"
linktitle: "XmlResolver"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlResolver κλάση. Επιλύει εξωτερικούς πόρους XML που ονομάζονται με Uniform Resource Identifier (URI) σε C++."
type: docs
weight: 3500
url: /el/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Επιλύει εξωτερικούς πόρους XML που ορίζονται από ένα Καθολικό Αναγνωριστικό Πόρων (URI).

```cpp
class XmlResolver : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | Όταν παρακάμπτεται σε μια παράγωγη κλάση, αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιλύει το απόλυτο URI από τη βάση και τα σχετικά URIs. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | Όταν παρακάμπτεται σε μια παράγωγη κλάση, ορίζει τα διαπιστευτήρια που χρησιμοποιούνται για την πιστοποίηση των αιτημάτων web. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | Επιτρέπει στον επιλυτή να επιστρέφει τύπους διαφορετικούς από το Stream. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
