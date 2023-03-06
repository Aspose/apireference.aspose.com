---
title: VectorLayer.Add
second_title: Aspose.GIS untuk Referensi .NET API
description: VectorLayer metode. Menambahkan fitur baru ke layer jika didukung olehVectorLayer SDriver .
type: docs
weight: 80
url: /id/net/aspose.gis/vectorlayer/add/
---
## Add(Feature) {#add}

Menambahkan fitur baru ke layer, jika didukung oleh[`VectorLayer`](../) S[`Driver`](../driver/) .

```csharp
public void Add(Feature feature)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| feature | Feature | Fitur untuk ditambahkan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | dilemparkan jika lapisan hanya-baca. |

### Lihat juga

* class [Feature](../../feature/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)

---

## Add(Feature, IFeatureStyle) {#add_1}

Menambahkan fitur baru dengan gaya tertentu ke lapisan, jika didukung oleh[`VectorLayer`](../) S[`Driver`](../driver/) .

```csharp
public virtual void Add(Feature feature, IFeatureStyle style)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| feature | Feature | Fitur untuk ditambahkan. |
| style | IFeatureStyle | Gaya fitur. Menggunakan`null` untuk menunjukkan gaya yang hilang. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| InvalidOperationException | dilempar jika layer tidak mendukung gaya atau layer hanya bisa dibaca. |
| InvalidOperationException | dilemparkan jika lapisan yang dapat diedit tidak mendukung gaya. |
| ArgumentException | dilempar jika gaya tidak cocok dengan tipe driver. |

### Lihat juga

* class [Feature](../../feature/)
* interface [IFeatureStyle](../../ifeaturestyle/)
* class [VectorLayer](../)
* ruang nama [Aspose.Gis](../../vectorlayer/)
* perakitan [Aspose.GIS](../../../)


