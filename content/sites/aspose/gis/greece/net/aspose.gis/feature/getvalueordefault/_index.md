---
title: Feature.GetValueOrDefault
second_title: Αναφορά Aspose.GIS για .NET API
description: Feature μέθοδος. Παίρνει την τιμή ενός χαρακτηριστικού ήDefaultValue εάν η τιμή δεν έχει οριστεί ήμηδενικό .
type: docs
weight: 40
url: /el/net/aspose.gis/feature/getvalueordefault/
---
## GetValueOrDefault&lt;T&gt;(string) {#getvalueordefault_1}

Παίρνει την τιμή ενός χαρακτηριστικού ή[`DefaultValue`](../../featureattribute/defaultvalue/) εάν η τιμή δεν έχει οριστεί ή`μηδενικό` .

```csharp
public T GetValueOrDefault<T>(string attributeName)
```

| Παράμετρος | Περιγραφή |
| --- | --- |
| T | Επιθυμητός τύπος για την τιμή. |
| attributeName | Όνομα του χαρακτηριστικού. |

### Επιστρεφόμενη Αξία

Τιμή της ιδιότητας.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το όνομα του χαρακτηριστικού είναι`null`. |
| ArgumentException | Το χαρακτηριστικό με αυτό το όνομα δεν υπάρχει σε αυτό το επίπεδο. |
| InvalidOperationException | Το χαρακτηριστικό δεν είναι κλειδωμένο. |
| InvalidOperationException | Η τιμή αυτού του χαρακτηριστικού δεν έχει οριστεί για αυτό το χαρακτηριστικό. |
| InvalidCastException | Ο ζητούμενος τύπος δεν εφαρμόζεταιIConvertible. |
| InvalidCastException | Η τιμή του χαρακτηριστικού είναι`null`, αλλά ο ζητούμενος τύπος είναι τύπος τιμής. |
| FormatException | Η μετατροπή απέτυχε επειδή η τιμή είναι σε εσφαλμένη μορφή. |
| OverflowException | Η μετατροπή απέτυχε λόγω υπερχείλισης. |

### Παρατηρήσεις

Αυτή η μέθοδος μετατρέπει αυτόματα την τιμή στον τύπο που ζητήθηκε στην παράμετρο γενικού τύπου.

### Δείτε επίσης

* class [Feature](../)
* χώρος ονομάτων [Aspose.Gis](../../feature/)
* συνέλευση [Aspose.GIS](../../../)

---

## GetValueOrDefault(string, object) {#getvalueordefault}

Παίρνει την τιμή ενός χαρακτηριστικού ή[`DefaultValue`](../../featureattribute/defaultvalue/) εάν η τιμή δεν έχει οριστεί ή`μηδενικό` .

```csharp
public object GetValueOrDefault(string attributeName, object defaultValue = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| attributeName | String | Όνομα του χαρακτηριστικού. |
| defaultValue | Object | Η τιμή που πρέπει να επιστραφεί εάν λείπει η τιμή του χαρακτηριστικού. Η προεπιλεγμένη τιμή είναι`null` . |

### Επιστρεφόμενη Αξία

Τιμή της ιδιότητας.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το όνομα του χαρακτηριστικού είναι`null`. |
| ArgumentException | Το χαρακτηριστικό με αυτό το όνομα δεν υπάρχει σε αυτό το επίπεδο. |
| InvalidOperationException | Το χαρακτηριστικό δεν είναι κλειδωμένο. |
| InvalidOperationException | Η τιμή αυτού του χαρακτηριστικού δεν έχει οριστεί για αυτό το χαρακτηριστικό. |

### Δείτε επίσης

* class [Feature](../)
* χώρος ονομάτων [Aspose.Gis](../../feature/)
* συνέλευση [Aspose.GIS](../../../)

---

## GetValueOrDefault&lt;T&gt;(string, object) {#getvalueordefault_2}

Παίρνει την τιμή ενός χαρακτηριστικού ή[`DefaultValue`](../../featureattribute/defaultvalue/) εάν η τιμή δεν έχει οριστεί ή`μηδενικό` .

```csharp
public T GetValueOrDefault<T>(string attributeName, object defaultValue)
```

| Παράμετρος | Περιγραφή |
| --- | --- |
| T | Επιθυμητός τύπος για την τιμή. |
| attributeName | Όνομα του χαρακτηριστικού. |
| defaultValue | Η τιμή που πρέπει να επιστραφεί εάν λείπει η τιμή του χαρακτηριστικού. |

### Επιστρεφόμενη Αξία

Τιμή της ιδιότητας.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το όνομα του χαρακτηριστικού είναι`null`. |
| ArgumentException | Το χαρακτηριστικό με αυτό το όνομα δεν υπάρχει σε αυτό το επίπεδο. |
| InvalidOperationException | Το χαρακτηριστικό δεν είναι κλειδωμένο. |
| InvalidOperationException | Η τιμή αυτού του χαρακτηριστικού δεν έχει οριστεί για αυτό το χαρακτηριστικό. |
| InvalidCastException | Ο ζητούμενος τύπος δεν εφαρμόζεταιIConvertible. |
| InvalidCastException | Η τιμή του χαρακτηριστικού είναι`null`, αλλά ο ζητούμενος τύπος είναι τύπος τιμής. |
| FormatException | Η μετατροπή απέτυχε επειδή η τιμή είναι σε εσφαλμένη μορφή. |
| OverflowException | Η μετατροπή απέτυχε λόγω υπερχείλισης. |

### Παρατηρήσεις

Αυτή η μέθοδος μετατρέπει αυτόματα την τιμή στον τύπο που ζητήθηκε στην παράμετρο γενικού τύπου.

### Δείτε επίσης

* class [Feature](../)
* χώρος ονομάτων [Aspose.Gis](../../feature/)
* συνέλευση [Aspose.GIS](../../../)


