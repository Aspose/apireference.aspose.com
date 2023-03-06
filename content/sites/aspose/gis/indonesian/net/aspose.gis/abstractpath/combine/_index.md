---
title: AbstractPath.Combine
second_title: Aspose.GIS untuk Referensi .NET API
description: AbstractPath metode. Gabungkan iniAbstractPath dengan komponen jalur yang ditentukan.
type: docs
weight: 50
url: /id/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

Gabungkan ini[`AbstractPath`](../) dengan komponen jalur yang ditentukan.

```csharp
public virtual AbstractPath Combine(string location)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| location | String | Komponen jalur untuk ditambahkan ke ini[`AbstractPath`](../). |

### Nilai Pengembalian

Baru[`AbstractPath`](../) menunjuk ke a[`Location`](../location/) yang merupakan kombinasi dari lokasi ini[`AbstractPath`](../)and argumennya.

### Perkataan

Biasanya metode ini tidak boleh diganti oleh pewaris. Implementasi default menggabungkan ini[`Location`](../location/) dengan argumen dan memanggil[`WithLocation`](../withlocation/) Metode dengan string gabungan sebagai argumen. Hasil kombinasi ditentukan dengan cara berikut:  Jika argumen dimulai dengan[`Separator`](../separator/), hasil kombinasi sama dengan argumen; Jika tidak, jika[`Location`](../location/) berakhir dengan[`Separator`](../separator/) , hasil kombinasinya sama dengan` +`; Jika tidak, hasilnya sama dengan` + +`

### Lihat juga

* class [AbstractPath](../)
* ruang nama [Aspose.Gis](../../abstractpath/)
* perakitan [Aspose.GIS](../../../)


