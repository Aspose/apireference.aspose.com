---
title: FeatureAttributeCollection.Item
second_title: Aspose.GIS untuk Referensi .NET API
description: FeatureAttributeCollection Properti. Mendapat atau menyetelFeatureAttribute pada indeks yang ditentukan.
type: docs
weight: 30
url: /id/net/aspose.gis/featureattributecollection/item/
---
## FeatureAttributeCollection indexer (1 of 2)

Mendapat atau menyetel[`FeatureAttribute`](../../featureattribute/) pada indeks yang ditentukan.

```csharp
public FeatureAttribute this[int index] { get; set; }
```

| Parameter | Keterangan |
| --- | --- |
| index | Indeks berbasis nol dari atribut yang akan diambil atau disetel. |

### Nilai Pengembalian

Atribut pada indeks yang ditentukan.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentOutOfRangeException | Indeks berada di luar jangkauan. |
| InvalidOperationException | Mencoba mengubah koleksi yang terkunci. |

### Lihat juga

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* ruang nama [Aspose.Gis](../../featureattributecollection/)
* perakitan [Aspose.GIS](../../../)

---

## FeatureAttributeCollection indexer (2 of 2)

Mendapat atau menyetel[`FeatureAttribute`](../../featureattribute/) dengan nama tertentu.

```csharp
public FeatureAttribute this[string name] { get; }
```

| Parameter | Keterangan |
| --- | --- |
| name | Nama atribut. |

### Nilai Pengembalian

Atribut dengan nama tertentu, atau`null` jika tidak ditemukan.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Nama atributnya adalah`null`. |

### Lihat juga

* class [FeatureAttribute](../../featureattribute/)
* class [FeatureAttributeCollection](../)
* ruang nama [Aspose.Gis](../../featureattributecollection/)
* perakitan [Aspose.GIS](../../../)


