---
title: GraphicsPathIterator.NextMarker
second_title: Aspose.Drawing untuk Referensi .NET API
description: GraphicsPathIterator metode. MenaikkanGraphicsPathIteratorke penanda berikutnya di path dan mengembalikan indeks mulai dan berhenti melalui parameter keluar.
type: docs
weight: 80
url: /id/net/system.drawing.drawing2d/graphicspathiterator/nextmarker/
---
## NextMarker(out int, out int) {#nextmarker}

Menaikkan[`GraphicsPathIterator`](../)ke penanda berikutnya di path dan mengembalikan indeks mulai dan berhenti melalui parameter [keluar].

```csharp
public int NextMarker(out int startIndex, out int endIndex)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| startIndex | Int32& | [keluar] Referensi bilangan bulat yang diberikan ke parameter ini menerima indeks titik yang memulai subjalur. |
| endIndex | Int32& | [keluar] Referensi bilangan bulat yang diberikan ke parameter ini menerima indeks titik yang mengakhiri subjalur ke mana titik startIndex. |

### Nilai Pengembalian

Jumlah titik antara penanda ini dan berikutnya.

### Lihat juga

* class [GraphicsPathIterator](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspathiterator/)
* perakitan [Aspose.Drawing](../../../)

---

## NextMarker(GraphicsPath) {#nextmarker_1}

Ini[`GraphicsPathIterator`](../) objek memiliki a[`GraphicsPath`](../../graphicspath/) objek yang terkait dengannya. Metode ini menambah yang terkait[`GraphicsPath`](../../graphicspath/) ke penanda berikutnya di path dan menyalin semua titik yang terdapat antara penanda saat ini dan penanda berikutnya (atau ujung jalur) ke detik[`GraphicsPath`](../../graphicspath/) objek diteruskan ke parameter.

```csharp
public int NextMarker(GraphicsPath path)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| path | GraphicsPath | Itu[`GraphicsPath`](../../graphicspath/) objek yang poinnya akan disalin. |

### Nilai Pengembalian

Jumlah titik antara penanda ini dan berikutnya.

### Lihat juga

* class [GraphicsPath](../../graphicspath/)
* class [GraphicsPathIterator](../)
* ruang nama [System.Drawing.Drawing2D](../../graphicspathiterator/)
* perakitan [Aspose.Drawing](../../../)


