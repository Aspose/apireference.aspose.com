---
title: Class SimpleLabeling
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling τάξη. Μια απλή επισήμανση τοποθετεί ετικέτα σε κάθε χαρακτηριστικό.
type: docs
weight: 1700
url: /el/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

Μια απλή επισήμανση τοποθετεί ετικέτα σε κάθε χαρακτηριστικό.

```csharp
public class SimpleLabeling : Labeling
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | Αρχικοποιεί μια νέα παρουσία του`SimpleLabeling` τάξη. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | Αρχικοποιεί μια νέα παρουσία του`SimpleLabeling` τάξη. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | Αρχικοποιεί μια νέα παρουσία του`SimpleLabeling` τάξη. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | Μια επιστροφή κλήσης που χρησιμοποιείται για τη διαμόρφωση αυτής της ετικέτας πριν από το χειρισμό μιας δυνατότητας. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | Καθορίζει το χρώμα του κειμένου. |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | Οικογένεια γραμματοσειρών για χρήση για απόδοση κειμένου. Η προεπιλογή είναι η τιμή που εξαρτάται από το σύστημα. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | Μέγεθος κειμένου. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | Στυλ για εφαρμογή στο κείμενο. |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | Παρέχει έναν τρόπο αντικατάστασης της γεωμετρίας χαρακτηριστικών με μια τροποποιημένη για επισήμανση. Αυτή η επανάκληση καλείται την πρώτη μετά[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . Η προεπιλογή είναι`null` (χρησιμοποιήστε τη γεωμετρία χαρακτηριστικών ως έχει). |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | Χρώμα του φωτοστέφανου (εγκεφαλικό επεισόδιο) γύρω από το κείμενο. |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | Μέγεθος του φωτοστέφανου (εγκεφαλικό επεισόδιο) γύρω από το κείμενο. |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | Όνομα χαρακτηριστικού για χρήση ως πηγή ετικετών. Αγνοήθηκε αν[`LabelExpression`](./labelexpression/) έχει οριστεί. Είτε[`LabelAttribute`](./labelattribute/) ή[`LabelExpression`](./labelexpression/) πρέπει να ρυθμιστεί πριν από την απόδοση; InvalidOperationException πετιέται αλλιώς. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | Παρέχει έναν τρόπο προσαρμογής και μορφοποίησης κειμένου ετικέτας. Εάν έχει οριστεί, παρακάμπτεται[`LabelAttribute`](./labelattribute/) . Είτε[`LabelAttribute`](./labelattribute/) ή[`LabelExpression`](./labelexpression/) πρέπει να ρυθμιστεί πριν από την απόδοση; InvalidOperationException πετιέται αλλιώς. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | Καθορίζει τη συμπεριφορά απόδοσης για γεωμετρίες πολλαπλών τμημάτων. Η προεπιλογή είναιAll . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | Η τοποθέτηση ετικετών καθορίζει τον τρόπο με τον οποίο τοποθετούνται οι ετικέτες σε σχέση με τις γεωμετρίες των χαρακτηριστικών. |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | Υποδεικνύει την προτεραιότητα αυτής της ετικέτας σε περίπτωση που επικαλύπτεται με άλλη ετικέτα. Η ετικέτα με χαμηλότερη προτεραιότητα δεν αποδίδεται. Η προεπιλογή είναι 1000. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | Κλωνοποιεί αυτήν την παρουσία. |

### Δείτε επίσης

* class [Labeling](../labeling/)
* χώρος ονομάτων [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* συνέλευση [Aspose.GIS](../../)


