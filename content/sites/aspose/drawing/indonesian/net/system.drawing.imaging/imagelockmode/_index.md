---
title: Enum ImageLockMode
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Imaging.ImageLockMode enum. Menentukan flag yang diteruskan ke parameter flags dariLockBits metode. ItuLockBits metode mengunci sebagian image sehingga Anda dapat membaca atau menulis data piksel.
type: docs
weight: 780
url: /id/net/system.drawing.imaging/imagelockmode/
---
## ImageLockMode enumeration

Menentukan flag yang diteruskan ke parameter flags dari[`LockBits`](../../system.drawing/bitmap/lockbits/) metode. Itu[`LockBits`](../../system.drawing/bitmap/lockbits/) metode mengunci sebagian image sehingga Anda dapat membaca atau menulis data piksel.

```csharp
public enum ImageLockMode
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| ReadOnly | `1` | Menentukan bahwa sebagian gambar dikunci untuk dibaca. |
| WriteOnly | `2` | Menentukan bahwa sebagian gambar dikunci untuk ditulis. |
| ReadWrite | `3` | Menentukan bahwa sebagian gambar dikunci untuk dibaca atau ditulis. |
| UserInputBuffer | `4` | Menentukan bahwa buffer yang digunakan untuk membaca atau menulis data piksel dialokasikan oleh pengguna. Jika flag ini disetel,*flags* parameter dari[`LockBits`](../../system.drawing/bitmap/lockbits/) Metode berfungsi sebagai parameter input (dan mungkin sebagai parameter output). Jika flag ini dihapus, maka*flags* parameter hanya berfungsi sebagai parameter output. |

### Lihat juga

* ruang nama [System.Drawing.Imaging](../../system.drawing.imaging/)
* perakitan [Aspose.Drawing](../../)


