---
title: SVGSVGElement.CreateEvent
second_title: Aspose.SVG untuk Referensi .NET API
description: SVGSVGElement metode. Membuat sebuahEvent dari jenis yang didukung oleh implementasi.
type: docs
weight: 110
url: /id/net/aspose.svg/svgsvgelement/createevent/
---
## SVGSVGElement.CreateEvent method

Membuat sebuah[`Event`](../../../aspose.svg.dom.events/event/) dari jenis yang didukung oleh implementasi.

```csharp
public Event CreateEvent(string eventType)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| eventType | String | Parameter eventType menentukan tipe dari[`Event`](../../../aspose.svg.dom.events/event/) antarmuka yang akan dibuat.  Jika[`Event`](../../../aspose.svg.dom.events/event/)antarmuka yang ditentukan didukung oleh implementasi metode ini akan mengembalikan new [`Event`](../../../aspose.svg.dom.events/event/) dari jenis antarmuka yang diminta. Jika[`Event`](../../../aspose.svg.dom.events/event/)akan dikirim melalui[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) metode yang sesuai [`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) metode harus dipanggil setelah pembuatan untuk menginisialisasi[`Event`](../../../aspose.svg.dom.events/event/) nilai s. |

### Nilai Pengembalian

Yang baru dibuat[`Event`](../../../aspose.svg.dom.events/event/)

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR : Dimunculkan jika implementasi tidak mendukung jenis[`Event`](../../../aspose.svg.dom.events/event/) antarmuka diminta |

### Lihat juga

* class [Event](../../../aspose.svg.dom.events/event/)
* class [SVGSVGElement](../)
* ruang nama [Aspose.Svg](../../svgsvgelement/)
* perakitan [Aspose.SVG](../../../)


