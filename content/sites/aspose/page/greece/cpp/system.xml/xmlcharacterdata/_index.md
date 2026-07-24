---
title: "System::Xml::XmlCharacterData κλάση"
linktitle: "XmlCharacterData"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlCharacterData κλάση. Παρέχει μεθόδους χειρισμού κειμένου που χρησιμοποιούνται από πολλές κλάσεις στη C++."
type: docs
weight: 900
url: /el/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


Παρέχει μεθόδους χειρισμού κειμένου που χρησιμοποιούνται από πολλές κλάσεις.

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | Προσθέτει τη καθορισμένη συμβολοσειρά στο τέλος των δεδομένων χαρακτήρων του κόμβου. |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | Αφαιρεί μια σειρά χαρακτήρων από τον κόμβο. |
| virtual [get_Data](./get_data/)() | Επιστρέφει τα δεδομένα του κόμβου. |
| [get_InnerText](./get_innertext/)() override | Επιστρέφει τις συνενωμένες τιμές του κόμβου και όλων των παιδιών του κόμβου. |
| virtual [get_Length](./get_length/)() | Επιστρέφει το μήκος των δεδομένων, σε χαρακτήρες. |
| [get_Value](./get_value/)() override | Επιστρέφει την τιμή του κόμβου. |
| virtual [InsertData](./insertdata/)(int32_t, String) | Εισάγει τη συγκεκριμένη συμβολοσειρά στην καθορισμένη θέση χαρακτήρα. |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | Αντικαθιστά τον καθορισμένο αριθμό χαρακτήρων που ξεκινούν από τη συγκεκριμένη θέση με τη συγκεκριμένη συμβολοσειρά. |
| virtual [set_Data](./set_data/)(String) | Ορίζει τα δεδομένα του κόμβου. |
| [set_InnerText](./set_innertext/)(String) override | Ορίζει τις συνενωμένες τιμές του κόμβου και όλων των παιδιών του κόμβου. |
| [set_Value](./set_value/)(String) override | Ορίζει την τιμή του κόμβου. |
| virtual [Substring](./substring/)(int32_t, int32_t) | Ανακτά ένα υποσύνολο της πλήρους συμβολοσειράς από το καθορισμένο εύρος. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
