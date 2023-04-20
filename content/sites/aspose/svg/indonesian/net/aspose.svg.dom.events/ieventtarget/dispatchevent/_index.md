---
title: IEventTarget.DispatchEvent
second_title: Aspose.SVG untuk Referensi .NET API
description: IEventTarget metode. Metode ini memungkinkan pengiriman event ke dalam model event implementasi.
type: docs
weight: 20
url: /id/net/aspose.svg.dom.events/ieventtarget/dispatchevent/
---
## IEventTarget.DispatchEvent method

Metode ini memungkinkan pengiriman event ke dalam model event implementasi.

```csharp
public bool DispatchEvent(Event @event)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| event | Event | Menentukan jenis kejadian, perilaku, dan informasi kontekstual yang akan digunakan dalam memproses kejadian. |

### Nilai Pengembalian

Nilai pengembalian dari[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) menunjukkan apakah ada pendengar yang menangani acara yang dipanggil[`PreventDefault`](../../event/preventdefault/) . Jika[`PreventDefault`](../../event/preventdefault/) disebut nilainya salah, jika tidak nilainya benar.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) |  |

### Perkataan

Peristiwa yang dikirim dengan cara ini akan memiliki perilaku penangkapan dan gelembung yang sama dengan peristiwa yang dikirim langsung oleh implementasi. Target peristiwa adalah[`EventTarget`](../../../aspose.svg.dom/eventtarget/) di mana[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) disebut.

### Lihat juga

* class [Event](../../event/)
* interface [IEventTarget](../)
* ruang nama [Aspose.Svg.Dom.Events](../../ieventtarget/)
* perakitan [Aspose.SVG](../../../)


