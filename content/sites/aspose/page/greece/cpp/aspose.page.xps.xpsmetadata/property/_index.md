---
title: "Aspose::Page::XPS::XpsMetadata::Property class"
linktitle: "Ιδιότητα"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::Property class. Η κλάση που υλοποιεί μια κοινή PrintTicketProperty. Η βασική κλάση για όλες τις ιδιότητες που ορίζονται από το σχήμα. Ένα στοιχείο Property δηλώνει μια συσκευή, μορφοποίηση εργασίας ή άλλη σχετική ιδιότητα της οποίας το όνομα δίνεται από το χαρακτηριστικό name. Ένα στοιχείο Value χρησιμοποιείται για την ανάθεση τιμής στο Property. Ένα Property μπορεί να είναι σύνθετο, ενδεχομένως να περιέχει πολλαπλές υποιδιότητες. Οι υποιδιότητες επίσης αναπαρίστανται από στοιχεία Property.  σε C++."
type: docs
weight: 14300
url: /el/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


Η κλάση που υλοποιεί μια κοινή [PrintTicket](../printticket/)**[Property](./)**. Η βασική κλάση για όλες τις ιδιότητες που ορίζονται από το σχήμα. Ένα **[Property](./)** στοιχείο δηλώνει μια συσκευή, μορφοποίηση εργασίας ή άλλη σχετική ιδιότητα της οποίας το όνομα δίνεται από το χαρακτηριστικό name. Ένα [Value](../value/) στοιχείο χρησιμοποιείται για την ανάθεση τιμής στο **[Property](./)**. Ένα **[Property](./)** μπορεί να είναι σύνθετο, ενδεχομένως να περιέχει πολλαπλές υποιδιότητες. Οι υποιδιότητες επίσης αναπαρίστανται από στοιχεία **[Property](./)**. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Δημιουργεί μια νέα παρουσία. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Δημιουργεί μια νέα παρουσία. |
## Δείτε επίσης

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
