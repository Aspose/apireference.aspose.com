---
title: Interface ICircularString
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Geometries.ICircularString διεπαφή. Μια καμπύλη πολλαπλών κορυφών με κυκλική παρεμβολή μεταξύ σημείων.
type: docs
weight: 960
url: /el/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

Μια καμπύλη πολλαπλών κορυφών με κυκλική παρεμβολή μεταξύ σημείων.

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | Λαμβάνει ένα επεξεργάσιμο αντίγραφο αυτής της γεωμετρίας. |

### Παρατηρήσεις

Το`CircularString` αποτελείται από ένα ή περισσότερα τμήματα κυκλικού τόξου συνδεδεμένα από άκρη σε άκρη. Τα πρώτα τρία σημεία ορίζουν το πρώτο τμήμα. Το πρώτο σημείο είναι το σημείο έναρξης του τόξου. Το δεύτερο σημείο είναι οποιοδήποτε ενδιάμεσο σημείο του τόξου εκτός από το σημείο έναρξης ή τέλους. Το τρίτο σημείο είναι το τέλος του τόξου. Τα επόμενα τόξα ορίζονται μόνο από τα ενδιάμεσα και τελικά σημεία τους, καθώς το σημείο έναρξης ορίζεται σιωπηρά ως το τελικό σημείο του προηγούμενου τμήματος.

### Δείτε επίσης

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* συνέλευση [Aspose.GIS](../../)


