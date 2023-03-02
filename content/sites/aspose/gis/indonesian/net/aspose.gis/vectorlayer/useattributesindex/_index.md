---
title: VectorLayer.UseAttributesIndex
second_title: Aspose.GIS untuk Referensi .NET API
description: VectorLayer metode. Memuat indeks atribut untuk mempercepat pemfilteran berdasarkan nilai atribut dalam metode filter sepertiWhereGreater. Jika indeks tidak ada buat dulu. MenggunakanforceRebuild untuk memaksa rekreasi indeks.
type: docs
weight: 180
url: /id/net/aspose.gis/vectorlayer/useattributesindex/
---
## UseAttributesIndex(string, string, bool) {#useattributesindex_1}

Memuat indeks atribut untuk mempercepat pemfilteran berdasarkan nilai atribut dalam metode filter seperti[`WhereGreater`](../../featuressequence/wheregreater/). Jika indeks tidak ada, buat dulu. Menggunakan*forceRebuild* untuk memaksa rekreasi indeks.

```csharp
public void UseAttributesIndex(string indexPath, string attributeName, bool forceRebuild = false)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| indexPath | String | Jalur ke file indeks. |
| attributeName | String | Nama atribut untuk membuat indeks. |
| forceRebuild | Boolean | Apakah akan membuat ulang indeks meskipun sudah ada. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Atribut dengan nama tersebut tidak ada di layer. |
| IOException | Terjadi kesalahan I/O. |
| InvalidOperationException | Indeks untuk atribut yang ditentukan sudah dimuat untuk lapisan ini. |
| [GisException](../../gisexception/) | File ada dan itu bukan file indeks atribut yang dibuat oleh Aspose.GIS. |

### Lihat juga

* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## UseAttributesIndex(AbstractPath, string, bool) {#useattributesindex}

Memuat indeks atribut untuk mempercepat pemfilteran berdasarkan nilai atribut dalam metode filter seperti[`WhereGreater`](../../featuressequence/wheregreater/). Jika indeks tidak ada, buat dulu. Menggunakan*forceRebuild* untuk memaksa rekreasi indeks.

```csharp
public virtual void UseAttributesIndex(AbstractPath indexPath, string attributeName, 
    bool forceRebuild = false)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| indexPath | AbstractPath | Jalur ke file indeks. |
| attributeName | String | Nama atribut untuk membuat indeks. |
| forceRebuild | Boolean | Apakah akan membuat ulang indeks meskipun sudah ada. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Atribut dengan nama tersebut tidak ada di layer. |
| IOException | Terjadi kesalahan I/O. |
| InvalidOperationException | Indeks untuk atribut yang ditentukan sudah dimuat untuk lapisan ini. |
| [GisException](../../gisexception/) | File ada dan itu bukan file indeks atribut yang dibuat oleh Aspose.GIS. |

### Lihat juga

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)


