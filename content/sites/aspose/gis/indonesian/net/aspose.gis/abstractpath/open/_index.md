---
title: AbstractPath.Open
second_title: Aspose.GIS untuk Referensi .NET API
description: AbstractPath metode. Membuka iniJalur Abstraksebagai file.
type: docs
weight: 120
url: /id/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

Membuka ini`Jalur Abstrak`sebagai file.

```csharp
public abstract Stream Open(FileAccess access)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| access | FileAccess | Menentukan subset operasi yang dapat dilakukan pada aStream. |

### Nilai Pengembalian

AStream dibuka dengan yang ditentukanFileAccess .

### Perkataan

Jika*access* memiliki benderaWrite set, dan file tidak ada, pewaris harus membuatnya. An`Jalur Abstrak` dapat dibuka berkali-kali oleh`Aspose.GIS` . Ini diperlukan untuk membaca file secara mandiri dengan banyak aliran. Anda seharusnya tidak menyimpan hasilnya melainkan mengembalikan yang baruStream setiap kali metode ini dipanggil.

### Lihat juga

* class [AbstractPath](../)
* ruang nama [Aspose.Gis](../../abstractpath/)
* perakitan [Aspose.GIS](../../../)


