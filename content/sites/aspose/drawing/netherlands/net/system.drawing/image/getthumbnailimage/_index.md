---
title: Image.GetThumbnailImage
second_title: Aspose.Drawing voor .NET API-referentie
description: Image methode. Retourneert hiervoor een miniatuurImage .
type: docs
weight: 230
url: /nl/net/system.drawing/image/getthumbnailimage/
---
## Image.GetThumbnailImage method

Retourneert hiervoor een miniatuurImage .

```csharp
public Image GetThumbnailImage(int thumbWidth, int thumbHeight, GetThumbnailImageAbort callback, 
    IntPtr callbackData)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| thumbWidth | Int32 | De breedte, in pixels, van de gevraagde miniatuurafbeelding. |
| thumbHeight | Int32 | De hoogte, in pixels, van de gevraagde miniatuurafbeelding. |
| callback | GetThumbnailImageAbort | A[`GetThumbnailImageAbort`](../../image.getthumbnailimageabort/) delegeren. Opmerking U moet een gemachtigde maken en een verwijzing naar de gemachtigde doorgeven als de*callback* parameter, maar de gedelegeerde wordt niet gebruikt. |
| callbackData | IntPtr | Moet zijnZero . |

### Winstwaarde

EenImage dat vertegenwoordigt de miniatuur.

### Zie ook

* delegate [GetThumbnailImageAbort](../../image.getthumbnailimageabort/)
* class [Image](../)
* naamruimte [System.Drawing](../../image/)
* montage [Aspose.Drawing](../../../)


