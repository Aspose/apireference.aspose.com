---
title: "System::Web::Services::Protocols::SoapMessage κλάση"
linktitle: "SoapMessage"
second_title: "Aspose.Page για C++"
description: "System::Web::Services::Protocols::SoapMessage κλάση. Αντιπροσωπεύει το μήνυμα SOAP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


Αντιπροσωπεύει το μήνυμα SOAP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη λειτουργία [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class SoapMessage : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | Ορίζει τη εσωτερική συλλογή των κεφαλίδων SOAP. |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | Βρείτε την αντιστοίχιση κεφαλίδας με βάση τον καθορισμένο τύπο κεφαλίδας. |
| virtual [get_Action](./get_action/)() | Επιστρέφει μια τιμή του χαρακτηριστικού 'SOAPAction'. |
| [get_ContentEncoding](./get_contentencoding/)() | Αποκτά μια τιμή της κεφαλίδας 'Content-Encoding'. |
| [get_ContentType](./get_contenttype/)() | Λαμβάνει μια τιμή της κεφαλίδας 'Content-Type'. |
| [get_Exception](./get_exception/)() | Λαμβάνει την εξαίρεση που ρίχνεται από τη μέθοδο υπηρεσίας XML [Web](../../system.web/). |
| [get_Headers](./get_headers/)() | Επιστρέφει τη συλλογή των κεφαλίδων SOAP. |
| [get_InParameters](./get_inparameters/)() | Λαμβάνει τις παραμέτρους που περνούν στη μέθοδο υπηρεσίας XML [Web](../../system.web/). |
| [get_IsSoap12](./get_issoap12/)() | Επιστρέφει μια τιμή που υποδεικνύει αν χρησιμοποιείται η έκδοση 1.2 του SOAP. |
| [get_OutParameters](./get_outparameters/)() | Λαμβάνει τις παραμέτρους εξόδου που περνούν στη μέθοδο υπηρεσίας XML [Web](../../system.web/). |
| virtual [get_SoapVersion](./get_soapversion/)() | Επιστρέφει την έκδοση του SOAP που χρησιμοποιείται. |
| [get_Stage](./get_stage/)() | Λαμβάνει το στάδιο επεξεργασίας ενός μηνύματος SOAP. |
| [get_Stream](./get_stream/)() | Λαμβάνει τη ροή που περιέχει τα δεδομένα του μηνύματος SOAP. |
| virtual [get_Url](./get_url/)() | Επιστρέφει το URL της υπηρεσίας XML [Web](../../system.web/). |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | Λαμβάνει την τιμή της παραμέτρου εισόδου στο καθορισμένο δείκτη. |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | Λαμβάνει την τιμή της παραμέτρου εξόδου στο καθορισμένο δείκτη. |
| [GetReturnValue](./getreturnvalue/)() | Λαμβάνει την τιμή επιστροφής της μεθόδου υπηρεσίας XML [Web](../../system.web/). |
| [set_ContentEncoding](./set_contentencoding/)(String) | Ορίζει μια τιμή της κεφαλίδας 'Content-Encoding'. |
| [set_ContentType](./set_contenttype/)(String) | Ορίζει μια τιμή της κεφαλίδας 'Content-Type'. |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Ορίζει τις παραμέτρους που περνούν στη μέθοδο υπηρεσίας XML [Web](../../system.web/). |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | Ορίζει τη ροή που περιέχει τα δεδομένα του μηνύματος SOAP. |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Ορίζει τις παραμέτρους εξόδου που περνούν στη μέθοδο υπηρεσίας XML [Web](../../system.web/). |
| [SetException](./setexception/)(SoapException) | Ορίζει την εξαίρεση που ρίχνεται από τη μέθοδο υπηρεσίας XML [Web](../../system.web/). |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | Ορίζει τη συλλογή των κεφαλίδων SOAP. |
| [SetStage](./setstage/)(SoapMessageStage) | Ορίζει το στάδιο επεξεργασίας του μηνύματος SOAP. |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | Ορίζει τη ροή που περιέχει τα δεδομένα του μηνύματος SOAP. |
| [SoapMessage](./soapmessage/)() | Δημιουργεί μια νέα παρουσία. |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | Ενημερώνει τη εσωτερική συλλογή των κεφαλίδων SOAP. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
