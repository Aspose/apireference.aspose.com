---
title: DrawingSettings.StrictMode
second_title: Aspose.Drawing for .NET API Reference
description: DrawingSettings ιδιοκτησία. Λαμβάνει ή ορίζει μια τιμή που υποδεικνύει εάν είναι ενεργοποιημένη η πιο αυστηρή σύλληψη μη υλοποιημένων λειτουργιών.
type: docs
weight: 10
url: /el/net/system.drawing/drawingsettings/strictmode/
---
## DrawingSettings.StrictMode property

Λαμβάνει ή ορίζει μια τιμή που υποδεικνύει εάν είναι ενεργοποιημένη η πιο αυστηρή σύλληψη μη υλοποιημένων λειτουργιών.

```csharp
public static bool StrictMode { get; set; }
```

### Παρατηρήσεις

Εάν οριστεί σε true, σε περίπτωση χρήσης χαρακτηριστικών/παραμέτρων που δεν λειτουργούν σωστά στην τρέχουσα υλοποίηση , η βιβλιοθήκη θα εμφανίσει το NotImplementedException. Εάν οριστεί σε false, ορισμένες παράμετροι ενδέχεται να αγνοηθούν για να δώσουν την ευκαιρία στο πρόγραμμα χρήστη να λειτουργήσει. Σε αυτήν την περίπτωση το τα αποτελέσματα σχεδίασης μπορεί να φαίνονται διαφορετικά σε σύγκριση με το GDI+.

### Δείτε επίσης

* class [DrawingSettings](../)
* χώρος ονομάτων [System.Drawing](../../drawingsettings/)
* συνέλευση [Aspose.Drawing](../../../)


