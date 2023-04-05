---
title: PsDocument.Save
second_title: Aspose.Page untuk Referensi .NET API
description: PsDocument metode. Menyimpan file PS/EPS ke perangkat.
type: docs
weight: 200
url: /id/net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

Menyimpan file PS/EPS ke perangkat.

```csharp
public override void Save(Device device, SaveOptions options)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| device | Device | Perangkat keluaran. |
| options | SaveOptions | Berisi flag yang menentukan keluaran kesalahan yang dilemparkan selama konversi. |

### Lihat juga

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* ruang nama [Aspose.Page.EPS](../../psdocument/)
* perakitan [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

Penghematan diberikan[`PsDocument`](../) sebagai file EPS. Metode ini hanya digunakan setelah memperbarui metadata XMP. Metode ini menyimpan file EPS awal dengan metadata yang sudah diperbarui atau yang baru dibuat saat memanggil metode GetMetadata. Dalam kasus terakhir, semua kode PostScript yang diperlukan dan komentar EPS ditambahkan.

```csharp
public void Save(Stream epsStream)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| epsStream | Stream | Aliran file EPS keluaran. |

### Lihat juga

* class [PsDocument](../)
* ruang nama [Aspose.Page.EPS](../../psdocument/)
* perakitan [Aspose.Page](../../../)

---

## Save() {#save}

Penghematan diberikan[`PsDocument`](../) sebagai file EPS. Metode ini hanya digunakan saat PsDocument dibuat dari awal.

```csharp
public void Save()
```

### Lihat juga

* class [PsDocument](../)
* ruang nama [Aspose.Page.EPS](../../psdocument/)
* perakitan [Aspose.Page](../../../)


