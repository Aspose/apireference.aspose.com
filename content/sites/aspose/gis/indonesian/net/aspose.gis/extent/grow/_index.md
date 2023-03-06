---
title: Extent.Grow
second_title: Aspose.GIS untuk Referensi .NET API
description: Extent metode. Memperbesar sejauh ini sehingga menyertakan argumen.
type: docs
weight: 160
url: /id/net/aspose.gis/extent/grow/
---
## Grow(Extent) {#grow}

Memperbesar sejauh ini sehingga menyertakan argumen.

```csharp
public void Grow(Extent extent)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| extent | Extent | Tingkat lain. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) sejauh ini dan argumen keduanya tidak`null` dan tidak sama satu sama lain. |

### Perkataan

Jika[`SpatialReferenceSystem`](../spatialreferencesystem/) dari SRS ini adalah`null` kemudian diperbarui dengan SRS dari argumen.

### Lihat juga

* class [Extent](../)
* ruang nama [Aspose.Gis](../../extent/)
* perakitan [Aspose.GIS](../../../)

---

## Grow(double, double) {#grow_1}

Tumbuh sejauh ini sehingga termasuk titik yang ditentukan.

```csharp
public void Grow(double x, double y)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| x | Double | X koordinat untuk disertakan. |
| y | Double | Koordinat Y untuk disertakan. |

### Lihat juga

* class [Extent](../)
* ruang nama [Aspose.Gis](../../extent/)
* perakitan [Aspose.GIS](../../../)


