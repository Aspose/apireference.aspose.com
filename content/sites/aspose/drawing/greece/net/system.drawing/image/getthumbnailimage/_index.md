---
title: Image.GetThumbnailImage
second_title: Aspose.Drawing for .NET API Reference
description: Image μέθοδος. Επιστρέφει μια μικρογραφία για αυτόImage .
type: docs
weight: 230
url: /el/net/system.drawing/image/getthumbnailimage/
---
## Image.GetThumbnailImage method

Επιστρέφει μια μικρογραφία για αυτόImage .

```csharp
public Image GetThumbnailImage(int thumbWidth, int thumbHeight, GetThumbnailImageAbort callback, 
    IntPtr callbackData)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| thumbWidth | Int32 | Το πλάτος, σε pixel, της ζητούμενης μικρογραφίας εικόνας. |
| thumbHeight | Int32 | Το ύψος, σε pixel, της ζητούμενης μικρογραφίας εικόνας. |
| callback | GetThumbnailImageAbort | ΕΝΑ[`GetThumbnailImageAbort`](../../image.getthumbnailimageabort/) αντιπρόσωπος. Σημείωση Πρέπει να δημιουργήσετε έναν πληρεξούσιο και να μεταβιβάσετε μια αναφορά στον πληρεξούσιο ως το*callback* παράμετρος, αλλά ο πληρεξούσιος δεν χρησιμοποιείται. |
| callbackData | IntPtr | Πρέπει να είναιZero . |

### Επιστρεφόμενη Αξία

ΑνImage που αντιπροσωπεύει τη μικρογραφία.

### Δείτε επίσης

* delegate [GetThumbnailImageAbort](../../image.getthumbnailimageabort/)
* class [Image](../)
* χώρος ονομάτων [System.Drawing](../../image/)
* συνέλευση [Aspose.Drawing](../../../)


