---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: Αναφορά Aspose.GIS για .NET API
description: FileGdbCoordinatePrecisionGrid μέθοδος. Δημιουργεί νέοFileGdbCoordinatePrecisionGrid έτσι ώστε όλες οι τιμές μέσα σε ένα ορθογώνιο μπορούν να αναπαρασταθούν.
type: docs
weight: 20
url: /el/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

Δημιουργεί νέο`FileGdbCoordinatePrecisionGrid` έτσι ώστε όλες οι τιμές μέσα σε ένα ορθογώνιο μπορούν να αναπαρασταθούν.

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| p1 | IPoint | Μια γωνία του ορθογωνίου. |
| p2 | IPoint | Απέναντι γωνία του ορθογωνίου. Πρέπει να έχει τις ίδιες διαστάσεις με*p1*. |

### Επιστρεφόμενη Αξία

Το`FileGdbCoordinatePrecisionGrid`έτσι ώστε όλες οι τιμές μέσα σε ένα ορθογώνιο να είναι αναπαραστάσιμες. Οι τιμές έξω από το ορθογώνιο δεν είναι αναπαραστάσιμες, επομένως όλες οι συντεταγμένες που θα γραφούν στο FileGDB layer πρέπει να βρίσκονται μέσα στο ορθογώνιο.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null` . |
| ArgumentException | *p1* και*p2* μην σχηματίσετε ένα έγκυρο μη κενό ορθογώνιο: *p1* ή*p2* είναι άδειο. HasZ' σημαίες του*p1* δεν ισούται με τη σημαία «HasZ».*p2* HasM' σημαίες του*p1* δεν ισούται με τη σημαία «HasM».*p2* Χ' συντεταγμένη του*p1* ισούται με τη συντεταγμένη «Χ» του*p2* Συντονίζεις του*p1* ισούται με τη συντεταγμένη «Y» του*p2* Ζ' συντεταγμένη του*p1* ισούται με τη συντεταγμένη «Z» του*p2* Μ' συντεταγμένη του*p1* ισούται με τη συντεταγμένη «M» του*p2* Οποιαδήποτε συντεταγμένη είναιNaN ή το άπειρο. |

### Δείτε επίσης

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* χώρος ονομάτων [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* συνέλευση [Aspose.GIS](../../../)


