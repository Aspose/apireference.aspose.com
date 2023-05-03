---
title: Delegate Graphics.DrawImageAbort
second_title: Aspose.Drawing untuk Referensi .NET API
description: Menyediakan metode panggilan balik untuk memutuskan kapanDrawImage metode harus membatalkan eksekusi sebelum waktunya dan berhenti menggambar gambar.
type: docs
weight: 540
url: /id/net/system.drawing/graphics.drawimageabort/
---
## Graphics.DrawImageAbort delegate

Menyediakan metode panggilan balik untuk memutuskan kapan[`DrawImage`](../graphics/drawimage/) metode harus membatalkan eksekusi sebelum waktunya dan berhenti menggambar gambar.

```csharp
public delegate bool DrawImageAbort(IntPtr callbackdata);
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| callbackdata | IntPtr | Penunjuk internal yang menentukan data untuk metode panggilan balik. Parameter ini tidak dilewatkan oleh semua[`DrawImage`](../graphics/drawimage/) kelebihan beban. Anda dapat menguji ketidakhadirannya dengan memeriksa nilainyaZero . |

### Nilai Pengembalian

Metode ini mengembalikan true jika memutuskan bahwa[`DrawImage`](../graphics/drawimage/) metode harus sebelum waktunya menghentikan eksekusi. Kalau tidak, ia mengembalikan false untuk menunjukkan bahwa[`DrawImage`](../graphics/drawimage/) metode harus melanjutkan eksekusi.

### Lihat juga

* class [Graphics](../graphics/)
* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


