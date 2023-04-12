---
title: Class XbrlInstance
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.XbrlInstance τάξη. Η παρουσία XBRL είναι θραύσμα XML με ριζικό στοιχείο που έχει ετικέτα xbrl. Η παρουσία XBRL περιέχει γεγονότα επιχειρηματικής αναφοράς με κάθε γεγονός να αντιστοιχεί σε αConcept ορίζονται στο υποστηρικτικό DTS τους. Η παρουσία XBRL περιέχει επίσης περιβάλλοντα και μονάδες που παρέχουν πρόσθετες πληροφορίες που απαιτούνται για την ερμηνεία των γεγονότων στην παρουσίαση.
type: docs
weight: 8250
url: /el/net/aspose.finance.xbrl/xbrlinstance/
---
## XbrlInstance class

Η παρουσία XBRL είναι θραύσμα XML με ριζικό στοιχείο που έχει ετικέτα xbrl. Η παρουσία XBRL περιέχει γεγονότα επιχειρηματικής αναφοράς, με κάθε γεγονός να αντιστοιχεί σε α[`Concept`](../concept/) ορίζονται στο υποστηρικτικό DTS τους. Η παρουσία XBRL περιέχει επίσης περιβάλλοντα και μονάδες που παρέχουν πρόσθετες πληροφορίες που απαιτούνται για την ερμηνεία των γεγονότων στην παρουσίαση.

```csharp
public class XbrlInstance
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl/xbrlinstance/arcrolereferences/) { get; set; } | Λαμβάνει ή ορίζει τη συλλογή του[`ArcroleReference`](../arcrolereference/) αντικείμενα στην παρουσία XBRL. |
| [Contexts](../../aspose.finance.xbrl/xbrlinstance/contexts/) { get; set; } | Λαμβάνει ή ορίζει τη συλλογή του[`Context`](../context/) αντικείμενα στην παρουσία XBRL. |
| [Facts](../../aspose.finance.xbrl/xbrlinstance/facts/) { get; } | Λαμβάνει τη συλλογή του[`Fact`](../fact/) αντικείμενα στην παρουσία XBRL. |
| [FootnoteLinks](../../aspose.finance.xbrl/xbrlinstance/footnotelinks/) { get; set; } | Λαμβάνει ή ορίζει τη συλλογή του[`FootnoteLink`](../footnotelink/) αντικείμενα στην παρουσία XBRL. |
| [Items](../../aspose.finance.xbrl/xbrlinstance/items/) { get; } | Λαμβάνει τη συλλογή του[`Item`](../item/) αντικείμενα στην παρουσία XBRL. |
| [LinkbaseRefCollection](../../aspose.finance.xbrl/xbrlinstance/linkbaserefcollection/) { get; } | Λαμβάνει το[`LinkbaseRefCollection`](./linkbaserefcollection/) στο`XbrlInstance` . |
| [RoleReferences](../../aspose.finance.xbrl/xbrlinstance/rolereferences/) { get; set; } | Λαμβάνει ή ορίζει τη συλλογή του[`RoleReference`](../rolereference/) αντικείμενα στην παρουσία XBRL. |
| [SchemaLocation](../../aspose.finance.xbrl/xbrlinstance/schemalocation/) { get; set; } | Λαμβάνει ή ορίζει τη θέση σχήματος |
| [SchemaRefs](../../aspose.finance.xbrl/xbrlinstance/schemarefs/) { get; } | Αποκτά τη συλλογή SchemaRef. |
| [Units](../../aspose.finance.xbrl/xbrlinstance/units/) { get; set; } | Λαμβάνει ή ορίζει τη συλλογή του[`Unit`](../unit/) αντικείμενα στην παρουσία XBRL. |
| [ValidationErrors](../../aspose.finance.xbrl/xbrlinstance/validationerrors/) { get; } | Λαμβάνει τη συλλογή του σφάλματος επικύρωσης. |
| [XbrlDocument](../../aspose.finance.xbrl/xbrlinstance/xbrldocument/) { get; } | Αποκτήστε το[`XbrlDocument`](./xbrldocument/) που περιέχει αυτό το στιγμιότυπο. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [CreateElement](../../aspose.finance.xbrl/xbrlinstance/createelement/)(string, string, string) | Δημιουργήστε ένα νέο στοιχείο. |
| [GetAllLinkbaseRefCollections](../../aspose.finance.xbrl/xbrlinstance/getalllinkbaserefcollections/)() | Λάβετε όλες τις συλλογές αναφοράς της βάσης σύνδεσης σε αναφορές παρουσίας xbrl και σχήματος. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getarcroletypebyuri/)(string) | Λαμβάνει το ArcroleType που έχει το καθορισμένο uri. |
| [GetConceptById](../../aspose.finance.xbrl/xbrlinstance/getconceptbyid/)(string) | Λαμβάνει την έννοια που έχει το καθορισμένο αναγνωριστικό. |
| [GetConceptByLoc](../../aspose.finance.xbrl/xbrlinstance/getconceptbyloc/)(Loc) | Λαμβάνει την ιδέα από τον εντοπιστή. |
| [GetConceptByName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyname/)(string) | Παίρνει την έννοια που έχει το καθορισμένο όνομα. |
| [GetConceptByUriAndName](../../aspose.finance.xbrl/xbrlinstance/getconceptbyuriandname/)(string, string) | Λαμβάνει την έννοια που έχει το καθορισμένο uri και το όνομα. |
| [GetContextById](../../aspose.finance.xbrl/xbrlinstance/getcontextbyid/)(string) | Λαμβάνει το περιβάλλον που έχει το καθορισμένο αναγνωριστικό. |
| [GetPresentationLinks](../../aspose.finance.xbrl/xbrlinstance/getpresentationlinks/)(string, string) | Λαμβάνει τους συνδέσμους της παρουσίασης στην παρουσία xbrl. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl/xbrlinstance/getroletypebyuri/)(string) | Λαμβάνει το RoleType που έχει το καθορισμένο uri. |
| [GetUnitById](../../aspose.finance.xbrl/xbrlinstance/getunitbyid/)(string) | Λαμβάνει τη μονάδα που έχει το καθορισμένο αναγνωριστικό. |
| [IsValid](../../aspose.finance.xbrl/xbrlinstance/isvalid/)() | Ελέγχει εάν αυτή η παρουσία XBRL είναι έγκυρη. |
| [Validate](../../aspose.finance.xbrl/xbrlinstance/validate/)() | Επικυρώνει αυτήν την παρουσία XBRL. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Finance.Xbrl](../../aspose.finance.xbrl/)
* συνέλευση [Aspose.Finance](../../)


