---
title: Image.GetThumbnailImage
second_title: Aspose.Drawing untuk Referensi .NET API
description: Image metode. Mengembalikan thumbnail untuk iniImage .
type: docs
weight: 230
url: /id/net/system.drawing/image/getthumbnailimage/
---
## Image.GetThumbnailImage method

Mengembalikan thumbnail untuk iniImage .

```csharp
public Image GetThumbnailImage(int thumbWidth, int thumbHeight, GetThumbnailImageAbort callback, 
    IntPtr callbackData)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| thumbWidth | Int32 | Lebar, dalam piksel, gambar thumbnail yang diminta. |
| thumbHeight | Int32 | Tinggi, dalam piksel, gambar mini yang diminta. |
| callback | GetThumbnailImageAbort | A[`GetThumbnailImageAbort`](../../image.getthumbnailimageabort/) melimpahkan. Catatan Anda harus membuat delegasi dan meneruskan referensi ke delegasi sebagai*callback* parameter, tetapi delegasi tidak digunakan. |
| callbackData | IntPtr | HarusZero . |

### Nilai Pengembalian

AnImage yang mewakili thumbnail.

### Lihat juga

* delegate [GetThumbnailImageAbort](../../image.getthumbnailimageabort/)
* class [Image](../)
* ruang nama [System.Drawing](../../image/)
* perakitan [Aspose.Drawing](../../../)


