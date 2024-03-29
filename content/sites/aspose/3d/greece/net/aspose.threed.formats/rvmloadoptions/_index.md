---
title: RvmLoadOptions
second_title: Aspose.3D για Αναφορά API .NET
description: Φόρτωση επιλογών για το αρχείο RVM του AVEVA Plant Design Management System.
type: docs
weight: 1320
url: /el/net/aspose.threed.formats/rvmloadoptions/
---
## RvmLoadOptions class

Φόρτωση επιλογών για το αρχείο RVM του AVEVA Plant Design Management System.

```csharp
public class RvmLoadOptions : LoadOptions
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [RvmLoadOptions](rvmloadoptions/#constructor)() | Κατασκευάστε α`RvmLoadOptions` instance |
| [RvmLoadOptions](rvmloadoptions/#constructor_1)(FileContentType) | Κατασκευάστε α`RvmLoadOptions` instance |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AttributePrefix](../../aspose.threed.formats/rvmloadoptions/attributeprefix/) { get; set; } | Λαμβάνει ή ορίζει το πρόθεμα των χαρακτηριστικών που ορίστηκαν σε εξωτερικά αρχεία χαρακτηριστικών, Το πρόθεμα χρησιμοποιείται για την αποφυγή διενέξεων ονομάτων, η προεπιλεγμένη τιμή είναι "rvm:" |
| [CenterScene](../../aspose.threed.formats/rvmloadoptions/centerscene/) { get; set; } | Κεντράρετε τη σκηνή μετά τη φόρτωσή της. |
| [CylinderRadialSegments](../../aspose.threed.formats/rvmloadoptions/cylinderradialsegments/) { get; set; } | Λαμβάνει ή ορίζει τον αριθμό των ακτινικών τμημάτων του κυλίνδρου, η προεπιλεγμένη τιμή είναι 16 |
| [DishLatitudeSegments](../../aspose.threed.formats/rvmloadoptions/dishlatitudesegments/) { get; set; } | Λαμβάνει ή ορίζει τον αριθμό των τμημάτων γεωγραφικού πλάτους του πιάτου, η προεπιλεγμένη τιμή είναι 8 |
| [DishLongitudeSegments](../../aspose.threed.formats/rvmloadoptions/dishlongitudesegments/) { get; set; } | Λαμβάνει ή ορίζει τον αριθμό των τμημάτων γεωγραφικού μήκους του πιάτου, η προεπιλεγμένη τιμή είναι 12 |
| [Encoding](../../aspose.threed.formats/ioconfig/encoding/) { get; set; } | Λαμβάνει ή ορίζει την προεπιλεγμένη κωδικοποίηση για αρχεία που βασίζονται σε κείμενο. Η προεπιλεγμένη τιμή είναι null, πράγμα που σημαίνει ότι ο εισαγωγέας/εξαγωγέας θα αποφασίσει ποια κωδικοποίηση θα χρησιμοποιήσει. |
| [FileFormat](../../aspose.threed.formats/ioconfig/fileformat/) { get; } | Λαμβάνει τη μορφή αρχείου που καθορίζεται στην τρέχουσα επιλογή Αποθήκευση/Φόρτωση. |
| [FileName](../../aspose.threed.formats/ioconfig/filename/) { get; set; } | Το όνομα αρχείου της σκηνής εξαγωγής/εισαγωγής. Αυτό είναι προαιρετικό, αλλά χρήσιμο κατά τη σειριοποίηση εξωτερικών στοιχείων όπως το υλικό του OBJ. |
| [FileSystem](../../aspose.threed.formats/ioconfig/filesystem/) { get; set; } | Να επιτρέπεται στον χρήστη να χειρίζεται τον τρόπο διαχείρισης των εξωτερικών εξαρτήσεων κατά τη φόρτωση/αποθήκευση. |
| [GenerateMaterials](../../aspose.threed.formats/rvmloadoptions/generatematerials/) { get; set; } | Δημιουργήστε υλικά με τυχαία χρώματα για κάθε αντικείμενο στη σκηνή, εάν ο πίνακας χρωμάτων δεν εξάγεται στο αρχείο RVM. Η προεπιλεγμένη τιμή είναι true |
| [LookupAttributes](../../aspose.threed.formats/rvmloadoptions/lookupattributes/) { get; set; } | Λαμβάνει ή ορίζει εάν θα φορτωθούν χαρακτηριστικά από το εξωτερικό αρχείο λίστας χαρακτηριστικών (.att/.attrib/.txt), η προεπιλεγμένη τιμή είναι true. |
| [LookupPaths](../../aspose.threed.formats/ioconfig/lookuppaths/) { get; set; } | Ορισμένα αρχεία όπως το OBJ εξαρτώνται από εξωτερικό αρχείο, οι διαδρομές αναζήτησης θα επιτρέψουν στο Aspose.3D να αναζητήσει εξωτερικό αρχείο για φόρτωση. |
| [RectangularTorusSegments](../../aspose.threed.formats/rvmloadoptions/rectangulartorussegments/) { get; set; } | Λαμβάνει ή ορίζει τον αριθμό των ακτινικών τμημάτων του ορθογώνιου torus, η προεπιλεγμένη τιμή είναι 20 |
| [TorusTubularSegments](../../aspose.threed.formats/rvmloadoptions/torustubularsegments/) { get; set; } | Λαμβάνει ή ορίζει τον αριθμό των σωληνωτών τμημάτων του torus, η προεπιλεγμένη τιμή είναι 20 |

### Δείτε επίσης

* class [LoadOptions](../loadoptions/)
* χώρος ονομάτων [Aspose.ThreeD.Formats](../../aspose.threed.formats/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
