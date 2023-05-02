---
title: Delegate Graphics.DrawImageAbort
second_title: Aspose.Drawing for .NET API Reference
description: Παρέχει μια μέθοδο επανάκλησης για να αποφασίσετε πότε τοDrawImage μέθοδος θα πρέπει να ακυρώσει πρόωρα την εκτέλεση και να σταματήσει να σχεδιάζει μια εικόνα.
type: docs
weight: 540
url: /el/net/system.drawing/graphics.drawimageabort/
---
## Graphics.DrawImageAbort delegate

Παρέχει μια μέθοδο επανάκλησης για να αποφασίσετε πότε το[`DrawImage`](../graphics/drawimage/) μέθοδος θα πρέπει να ακυρώσει πρόωρα την εκτέλεση και να σταματήσει να σχεδιάζει μια εικόνα.

```csharp
public delegate bool DrawImageAbort(IntPtr callbackdata);
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| callbackdata | IntPtr | Εσωτερικός δείκτης που καθορίζει δεδομένα για τη μέθοδο επανάκλησης. Αυτή η παράμετρος δεν περνά από όλους[`DrawImage`](../graphics/drawimage/) υπερφορτώσεις. Μπορείτε να ελέγξετε την απουσία του ελέγχοντας την τιμήZero . |

### Επιστρεφόμενη Αξία

Αυτή η μέθοδος επιστρέφει true εάν αποφασίσει ότι η[`DrawImage`](../graphics/drawimage/) μέθοδος θα πρέπει να σταματήσει πρόωρα την εκτέλεση. Διαφορετικά, επιστρέφει false για να υποδείξει ότι το[`DrawImage`](../graphics/drawimage/) μέθοδος θα πρέπει να συνεχίσει να εκτελείται.

### Δείτε επίσης

* class [Graphics](../graphics/)
* χώρος ονομάτων [System.Drawing](../../system.drawing/)
* συνέλευση [Aspose.Drawing](../../)


