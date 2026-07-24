---
title: "System::Xml::XPath::XPathNodeIterator κλάση"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNodeIterator κλάση. Παρέχει έναν επαναλήπτη πάνω σε ένα επιλεγμένο σύνολο κόμβων σε C++."
type: docs
weight: 600
url: /el/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


Παρέχει έναν επαναλήπτη πάνω από ένα επιλεγμένο σύνολο κόμβων.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Clone](./clone/)() | Όταν υπερκαλύπτεται σε μια παράγωγη κλάση, επιστρέφει ένα κλώνο αυτού του αντικειμένου [XPathNodeIterator](./). |
| virtual [get_Count](./get_count/)() | Επιστρέφει το ευρετήριο του τελευταίου κόμβου στο επιλεγμένο σύνολο κόμβων. |
| virtual [get_Current](./get_current/)() | Όταν υπερκαλύπτεται σε μια παράγωγη κλάση, λαμβάνει το αντικείμενο [XPathNavigator](../xpathnavigator/) για αυτό το [XPathNodeIterator](./), τοποθετημένο στον τρέχοντα κόμβο περιβάλλοντος. |
| virtual [get_CurrentPosition](./get_currentposition/)() | Όταν υπερκαλύπτεται σε μια παράγωγη κλάση, λαμβάνει το ευρετήριο της τρέχουσας θέσης στο επιλεγμένο σύνολο κόμβων. |
| [GetEnumerator](./getenumerator/)() override | Επιστρέφει ένα αντικείμενο IEnumerator για επανάληψη μέσω του επιλεγμένου συνόλου κόμβων. |
| virtual [MoveNext](./movenext/)() | Όταν υπερκαλύπτεται σε μια παράγωγη κλάση, μετακινεί το αντικείμενο [XPathNavigator](../xpathnavigator/) που επιστρέφεται από τη μέθοδο [XPathNodeIterator::get_Current](./get_current/) στο επόμενο κόμβο του επιλεγμένου συνόλου κόμβων. |
| [XPathNodeIterator](./xpathnodeiterator/)() | Αρχικοποιεί μια νέα παρουσία της κλάσης [XPathNodeIterator](./). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Δείτε επίσης

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
