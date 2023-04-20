---
title: Class TypeInfo
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Dom.TypeInfo τάξη. Το TypeInfo αντιπροσωπεύει έναν τύπο που αναφέρεται από κόμβους Element ή Attr που καθορίζεται στα σχήματα που σχετίζονται με το έγγραφο.
type: docs
weight: 1280
url: /el/net/aspose.svg.dom/typeinfo/
---
## TypeInfo class

Το TypeInfo αντιπροσωπεύει έναν τύπο που αναφέρεται από κόμβους Element ή Attr, που καθορίζεται στα σχήματα που σχετίζονται με το έγγραφο.

```csharp
public class TypeInfo : DOMObject
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [TypeName](../../aspose.svg.dom/typeinfo/typename/) { get; } | Το όνομα ενός τύπου που δηλώνεται για το συσχετισμένο στοιχείο ή χαρακτηριστικό ή μηδενικό εάν είναι άγνωστο. |
| [TypeNamespace](../../aspose.svg.dom/typeinfo/typenamespace/) { get; } | Λαμβάνει τον χώρο ονομάτων τύπου. Ο χώρος ονομάτων του τύπου που δηλώνεται για το συσχετισμένο στοιχείο ή χαρακτηριστικό ή null, εάν το στοιχείο δεν έχει δήλωση ή εάν δεν υπάρχουν διαθέσιμες πληροφορίες χώρου ονομάτων. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Αυτή η μέθοδος χρησιμοποιείται για την ανάκτηση αντικειμένου ECMAScriptType . |
| [IsDerivedFrom](../../aspose.svg.dom/typeinfo/isderivedfrom/)(string, string, ulong) | Αυτή η μέθοδος επιστρέφει εάν υπάρχει μια παράγωγη μεταξύ του ορισμού του τύπου αναφοράς, δηλαδή του TypeInfo στον οποίο καλείται η μέθοδος, και του ορισμού άλλου τύπου, δηλαδή αυτού που έχει περάσει ως παράμετροι. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| const [DERIVATION_EXTENSION](../../aspose.svg.dom/typeinfo/derivation_extension/) | Εάν το σχήμα του εγγράφου είναι ένα σχήμα XML [Σχήμα XML Μέρος 1], αυτή η σταθερά αντιπροσωπεύει την παραγωγή κατ' επέκταση. |
| const [DERIVATION_LIST](../../aspose.svg.dom/typeinfo/derivation_list/) | Εάν το σχήμα του εγγράφου είναι ένα σχήμα XML [Σχήμα XML Μέρος 1], αυτή η σταθερά αντιπροσωπεύει τη λίστα. |
| const [DERIVATION_RESTRICTION](../../aspose.svg.dom/typeinfo/derivation_restriction/) | Εάν το σχήμα του εγγράφου είναι ένα σχήμα XML [Σχήμα XML Μέρος 1], αυτή η σταθερά αντιπροσωπεύει την παραγωγή μέσω περιορισμού εάν εμπλέκονται σύνθετοι τύποι ή έναν περιορισμό εάν εμπλέκονται απλοί τύποι. |
| const [DERIVATION_UNION](../../aspose.svg.dom/typeinfo/derivation_union/) | Εάν το σχήμα του εγγράφου είναι ένα σχήμα XML [Σχήμα XML Μέρος 1], αυτή η σταθερά αντιπροσωπεύει την ένωση εάν εμπλέκονται απλοί τύποι. |

### Δείτε επίσης

* class [DOMObject](../domobject/)
* χώρος ονομάτων [Aspose.Svg.Dom](../../aspose.svg.dom/)
* συνέλευση [Aspose.SVG](../../)


