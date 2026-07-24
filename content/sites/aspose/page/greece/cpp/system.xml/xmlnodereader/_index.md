---
title: "System::Xml::XmlNodeReader class"
linktitle: "XmlNodeReader"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeReader class. Αντιπροσωπεύει έναν αναγνώστη που παρέχει γρήγορη, μη προσωρινή πρόσβαση μόνο προς τα εμπρός στα δεδομένα XML σε έναν XmlNode σε C++."
type: docs
weight: 2800
url: /el/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


Αντιπροσωπεύει έναν αναγνώστη που παρέχει γρήγορη, μη προσωρινή πρόσβαση μόνο προς τα εμπρός στα δεδομένα XML σε έναν [XmlNode](../xmlnode/).

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Close](./close/)() override | Αλλάζει το [XmlNodeReader::get_ReadState](./get_readstate/) σε [ReadState::Closed](../readstate/). |
| [get_AttributeCount](./get_attributecount/)() override | Επιστρέφει τον αριθμό των χαρακτηριστικών στον τρέχοντα κόμβο. |
| [get_BaseURI](./get_baseuri/)() override | Επιστρέφει το βασικό URI του τρέχοντος κόμβου. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν το [XmlNodeReader](./) υλοποιεί τις μεθόδους ανάγνωσης δυαδικού περιεχομένου. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν αυτός ο αναγνώστης μπορεί να αναλύσει και να επιλύσει οντότητες. |
| [get_Depth](./get_depth/)() override | Επιστρέφει το βάθος του τρέχοντος κόμβου στο έγγραφο XML. |
| [get_EOF](./get_eof/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο αναγνώστης βρίσκεται στο τέλος της ροής. |
| [get_HasAttributes](./get_hasattributes/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος έχει οποιαδήποτε χαρακτηριστικά. |
| [get_HasValue](./get_hasvalue/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος μπορεί να έχει μια τιμή [XmlNodeReader::get_Value](./get_value/). |
| [get_IsDefault](./get_isdefault/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος είναι ένα χαρακτηριστικό που δημιουργήθηκε από την προεπιλεγμένη τιμή που ορίζεται στον ορισμό τύπου εγγράφου (DTD) ή στο σχήμα. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Επιστρέφει μια τιμή που υποδεικνύει εάν ο τρέχων κόμβος είναι ένα κενό στοιχείο (για παράδειγμα, **<MyElement/>**). |
| [get_LocalName](./get_localname/)() override | Επιστρέφει το τοπικό όνομα του τρέχοντος κόμβου. |
| [get_Name](./get_name/)() override | Επιστρέφει το πλήρες όνομα του τρέχοντος κόμβου. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Επιστρέφει το URI του ονοματοχώρου (όπως ορίζεται στην προδιαγραφή ονοματοχώρου του W3C) του κόμβου στον οποίο βρίσκεται ο αναγνώστης. |
| [get_NameTable](./get_nametable/)() override | Επιστρέφει το [XmlNameTable](../xmlnametable/) που σχετίζεται με αυτήν την υλοποίηση. |
| [get_NodeType](./get_nodetype/)() override | Επιστρέφει τον τύπο του τρέχοντος κόμβου. |
| [get_Prefix](./get_prefix/)() override | Επιστρέφει το πρόθεμα ονοματοχώρου που σχετίζεται με τον τρέχοντα κόμβο. |
| [get_ReadState](./get_readstate/)() override | Επιστρέφει την κατάσταση του αναγνώστη. |
| [get_SchemaInfo](./get_schemainfo/)() override | Επιστρέφει τις πληροφορίες σχήματος που έχουν εκχωρηθεί στον τρέχοντα κόμβο. |
| [get_Value](./get_value/)() override | Επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου. |
| [get_XmlLang](./get_xmllang/)() override | Επιστρέφει το τρέχον πεδίο **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() override | Επιστρέφει το τρέχον πεδίο **xml:space**. |
| [GetAttribute](./getattribute/)(String) override | Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο όνομα. |
| [GetAttribute](./getattribute/)(String, String) override | Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου. |
| [GetAttribute](./getattribute/)(int32_t) override | Επιστρέφει την τιμή του χαρακτηριστικού με το καθορισμένο δείκτη. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Επιλύει ένα πρόθεμα ονοματοχώρου στο πεδίο του τρέχοντος στοιχείου. |
| [MoveToAttribute](./movetoattribute/)(String) override | Μετακινείται στο χαρακτηριστικό με το καθορισμένο όνομα. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Μετακινείται στο χαρακτηριστικό με το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Μετακινείται στο χαρακτηριστικό με το καθορισμένο δείκτη. |
| [MoveToElement](./movetoelement/)() override | Μετακινείται στο στοιχείο που περιέχει τον τρέχοντα κόμβο χαρακτηριστικού. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Μετακινείται στο πρώτο χαρακτηριστικό. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Μετακινείται στο επόμενο χαρακτηριστικό. |
| [Read](./read/)() override | Διαβάζει τον επόμενο κόμβο από τη ροή. |
| [ReadAttributeValue](./readattributevalue/)() override | Αναλύει την τιμή του χαρακτηριστικού σε ένα ή περισσότερα **[Text](../../system.text/)**, **EntityReference**, ή **EndEntity** κόμβους. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το περιεχόμενο και επιστρέφει τα δυαδικά bytes που αποκωδικοποιήθηκαν σε Base64. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το περιεχόμενο και επιστρέφει τα δυαδικά bytes που αποκωδικοποιήθηκαν σε BinHex. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το στοιχείο και αποκωδικοποιεί το περιεχόμενο σε Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Διαβάζει το στοιχείο και αποκωδικοποιεί το περιεχόμενο σε BinHex. |
| [ReadString](./readstring/)() override | Διαβάζει τα περιεχόμενα ενός στοιχείου ή κόμβου κειμένου ως συμβολοσειρά. |
| [ResolveEntity](./resolveentity/)() override | Επιλύει την αναφορά οντότητας για κόμβους **EntityReference**. |
| [Skip](./skip/)() override | Παραλείπει τα παιδιά του τρέχοντος κόμβου. |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | Δημιουργεί μια παρουσία της κλάσης [XmlNodeReader](./) χρησιμοποιώντας το καθορισμένο [XmlNode](../xmlnode/). |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Ένα ψευδώνυμο για κοινό δείκτη σε μια παρουσία αυτής της κλάσης. |
## Παρατηρήσεις



Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε παρουσίες αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τον περάσετε στις συναρτήσεις ως όρισμα.

## Δείτε επίσης

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
