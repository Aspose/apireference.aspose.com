---
title: Delegate Graphics.EnumerateMetafileProc
second_title: Aspose.Drawing untuk Referensi .NET API
description: Menyediakan metode callback untukEnumerateMetafile metode.
type: docs
weight: 550
url: /id/net/system.drawing/graphics.enumeratemetafileproc/
---
## Graphics.EnumerateMetafileProc delegate

Menyediakan metode callback untuk[`EnumerateMetafile`](../graphics/enumeratemetafile/) metode.

```csharp
public delegate bool EnumerateMetafileProc(EmfPlusRecordType recordType, int flags, int dataSize, 
    IntPtr data, PlayRecordCallback callbackData);
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| recordType | EmfPlusRecordType | Anggota dari[`EmfPlusRecordType`](../../system.drawing.imaging/emfplusrecordtype/) pencacahan yang menentukan jenis catatan metafile. |
| flags | Int32 | Kumpulan flag yang menentukan atribut record. |
| dataSize | Int32 | Jumlah byte dalam data rekaman. |
| data | IntPtr | Pointer ke buffer yang berisi data rekaman. |
| callbackData | PlayRecordCallback | Argumen tidak digunakan. |

### Nilai Pengembalian

Kembalikan nilai true jika Anda ingin melanjutkan pencacahan record; jika tidak, salah.

### Lihat juga

* enum [EmfPlusRecordType](../../system.drawing.imaging/emfplusrecordtype/)
* delegate [PlayRecordCallback](../../system.drawing.imaging/playrecordcallback/)
* class [Graphics](../graphics/)
* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


