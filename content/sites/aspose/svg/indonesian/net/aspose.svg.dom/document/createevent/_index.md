---
title: Document.CreateEvent
second_title: Aspose.SVG untuk Referensi .NET API
description: Document metode. Membuat sebuahEvent dari jenis yang didukung oleh implementasi.
type: docs
weight: 880
url: /id/net/aspose.svg.dom/document/createevent/
---
## Document.CreateEvent method

Membuat sebuah[`Event`](../../../aspose.svg.dom.events/event/) dari jenis yang didukung oleh implementasi.

```csharp
public Event CreateEvent(string eventType)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| eventType | String | Parameter eventType menentukan tipe dari[`Event`](../../../aspose.svg.dom.events/event/) antarmuka yang akan dibuat.  Jika[`Event`](../../../aspose.svg.dom.events/event/) antarmuka yang ditentukan didukung oleh implementasi metode ini will mengembalikan yang baru[`Event`](../../../aspose.svg.dom.events/event/) dari jenis antarmuka yang diminta. Jika[`Event`](../../../aspose.svg.dom.events/event/)akan dikirim melalui[`DispatchEvent`](../../../aspose.svg.dom.events/ieventtarget/dispatchevent/) metode yang sesuai[`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) Metode harus dipanggil setelah pembuatan untuk menginisialisasi[`Event`](../../../aspose.svg.dom.events/event/) nilai s. |

### Nilai Pengembalian

Yang baru dibuat[`Event`](../../../aspose.svg.dom.events/event/)

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [DOMException](../../domexception/) | NOT_SUPPORTED_ERR: Dimunculkan jika implementasinya tidak mendukung jenis[`Event`](../../../aspose.svg.dom.events/event/) antarmuka yang diminta |

### Lihat juga

* class [Event](../../../aspose.svg.dom.events/event/)
* class [Document](../)
* ruang nama [Aspose.Svg.Dom](../../document/)
* perakitan [Aspose.SVG](../../../)


