---
title: Feature.SetValue
second_title: Αναφορά Aspose.GIS για .NET API
description: Feature μέθοδος. Ορίζει μια νέα τιμή ενός χαρακτηριστικού.
type: docs
weight: 100
url: /el/net/aspose.gis/feature/setvalue/
---
## Feature.SetValue&lt;T&gt; method

Ορίζει μια νέα τιμή ενός χαρακτηριστικού.

```csharp
public void SetValue<T>(string attributeName, T value)
```

| Παράμετρος | Περιγραφή |
| --- | --- |
| T | Το είδος της τιμής. |
| attributeName | Το όνομα του χαρακτηριστικού. |
| value | Η τιμή του χαρακτηριστικού. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το όνομα του χαρακτηριστικού είναι`null`. |
| ArgumentException | Το χαρακτηριστικό με αυτό το όνομα δεν υπάρχει σε αυτό το επίπεδο. |
| InvalidOperationException | Το χαρακτηριστικό δεν είναι κλειδωμένο. |
| InvalidCastException | Ο τύπος της τιμής δεν εφαρμόζεταιIConvertible. |
| FormatException | Η μετατροπή απέτυχε επειδή η τιμή είναι σε εσφαλμένη μορφή. |
| OverflowException | Η μετατροπή απέτυχε λόγω υπερχείλισης. |

### Παρατηρήσεις

Αυτή η μέθοδος μετατρέπει την τιμή αυτόματα στον τύπο του χαρακτηριστικού.

### Δείτε επίσης

* class [Feature](../)
* χώρος ονομάτων [Aspose.Gis](../../feature/)
* συνέλευση [Aspose.GIS](../../../)


