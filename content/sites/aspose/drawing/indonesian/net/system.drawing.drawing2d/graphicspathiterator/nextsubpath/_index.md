---
title: GraphicsPathIterator.NextSubpath
second_title: Aspose.Drawing untuk Referensi .NET API
description: GraphicsPathIterator metode. MemindahkanGraphicsPathIterator ke subpath berikutnya di path. Indeks awal dan indeks akhir dari subjalur berikutnya dimuat dalam parameter keluar.
type: docs
weight: 100
url: /id/net/system.drawing.drawing2d/graphicspathiterator/nextsubpath/
---
## NextSubpath(out int, out int, out bool) {#nextsubpath}

Memindahkan[`GraphicsPathIterator`](../) ke subpath berikutnya di path. Indeks awal dan indeks akhir dari subjalur berikutnya dimuat dalam parameter [keluar].

```csharp
public int NextSubpath(out int startIndex, out int endIndex, out bool isClosed)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| startIndex | Int32& | [keluar] Menerima indeks awal dari subjalur berikutnya. |
| endIndex | Int32& | [keluar] Menerima indeks akhir dari subjalur berikutnya. |
| isClosed | Boolean& | [keluar] Menunjukkan apakah subjalur ditutup. |

### Nilai Pengembalian

Jumlah titik data dalam gambar yang diambil (subjalur). Jika tidak ada lagi angka untuk diambil, nol dikembalikan.

### Lihat juga

* class [GraphicsPathIterator](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspathiterator/)
* perakitan [Aspose.Drawing](../../../)

---

## NextSubpath(GraphicsPath, out bool) {#nextsubpath_1}

Mendapat angka berikutnya (subjalur) dari jalur terkait ini[`GraphicsPathIterator`](../) .

```csharp
public int NextSubpath(GraphicsPath path, out bool isClosed)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | GraphicsPath | A[`GraphicsPath`](../../graphicspath/) yaitu mengatur titik datanya agar cocok dengan titik data dari gambar yang diambil (subjalur) untuk iterator ini. |
| isClosed | Boolean& | [keluar] Menunjukkan apakah subjalur saat ini ditutup. Benar jika angka tertutup, selain itu salah. |

### Nilai Pengembalian

Jumlah titik data dalam gambar yang diambil (subjalur). Jika tidak ada lagi angka untuk diambil, nol dikembalikan.

### Lihat juga

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspathiterator/)
* perakitan [Aspose.Drawing](../../../)


