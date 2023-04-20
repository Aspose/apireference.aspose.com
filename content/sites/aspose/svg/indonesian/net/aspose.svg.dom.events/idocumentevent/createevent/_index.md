---
title: IDocumentEvent.CreateEvent
second_title: Aspose.SVG untuk Referensi .NET API
description: IDocumentEvent metode. Membuat sebuahEvent dari jenis yang didukung oleh implementasi.
type: docs
weight: 10
url: /id/net/aspose.svg.dom.events/idocumentevent/createevent/
---
## IDocumentEvent.CreateEvent method

Membuat sebuah[`Event`](../../event/) dari jenis yang didukung oleh implementasi.

```csharp
public Event CreateEvent(string eventType)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| eventType | String | Parameter eventType menentukan tipe dari[`Event`](../../event/) antarmuka yang akan dibuat.  Jika[`Event`](../../event/)antarmuka yang ditentukan didukung oleh implementasi metode ini akan mengembalikan new [`Event`](../../event/) dari jenis antarmuka yang diminta. Jika[`Event`](../../event/)akan dikirim melalui[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) metode yang sesuai [`InitEvent`](../../event/initevent/) metode harus dipanggil setelah pembuatan untuk menginisialisasi[`Event`](../../event/) nilai s. |

### Nilai Pengembalian

Yang baru dibuat[`Event`](../../event/)

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR : Dimunculkan jika implementasi tidak mendukung jenis[`Event`](../../event/) antarmuka diminta |

### Lihat juga

* class [Event](../../event/)
* interface [IDocumentEvent](../)
* ruang nama [Aspose.Svg.Dom.Events](../../idocumentevent/)
* perakitan [Aspose.SVG](../../../)


