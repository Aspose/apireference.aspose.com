---
title: IMultiPageDevice.OpenPage
second_title: Aspose.Page untuk Referensi .NET API
description: IMultiPageDevice metode. Melakukan persiapan perangkat yang diperlukan sebelum perenderan halaman.
type: docs
weight: 40
url: /id/net/aspose.page/imultipagedevice/openpage/
---
## OpenPage(string) {#openpage_1}

Melakukan persiapan perangkat yang diperlukan sebelum perenderan halaman.

```csharp
public bool OpenPage(string title)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| title | String | Judul halaman. |

### Nilai Pengembalian

Benar jika halaman berasal dari rentang yang diminta, jika tidak salah. Digunakan pada perangkat yang dapat merender larik nomor halaman tertentu.

### Lihat juga

* interface [IMultiPageDevice](../)
* ruang nama [Aspose.Page](../../imultipagedevice/)
* perakitan [Aspose.Page](../../../)

---

## OpenPage(float, float) {#openpage}

Membuat persiapan perangkat yang diperlukan sebelum setiap halaman dirender.

```csharp
public bool OpenPage(float width, float height)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| width | Single | Lebar halaman. |
| height | Single | Tinggi halaman. |

### Nilai Pengembalian

Mengembalikan nilai benar jika halaman yang dibuka memiliki nomor yang termasuk dalam rentang nomor halaman yang dipilih dan salah jika sebaliknya.

### Lihat juga

* interface [IMultiPageDevice](../)
* ruang nama [Aspose.Page](../../imultipagedevice/)
* perakitan [Aspose.Page](../../../)


