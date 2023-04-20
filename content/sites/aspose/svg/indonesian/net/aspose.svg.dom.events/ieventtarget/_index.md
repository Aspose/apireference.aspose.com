---
title: Interface IEventTarget
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Dom.Events.IEventTarget antarmuka. ItuEventTarget antarmuka diimplementasikan oleh semua Node dalam implementasi yang mendukung DOM Event Model. Oleh karena itu antarmuka ini dapat diperoleh dengan menggunakan metode pengecoran khusus pengikatan pada instance antarmuka Node. Antarmuka memungkinkan pendaftaran dan penghapusan Pendengar Acara di sebuahEventTarget dan pengiriman acara untuk ituIEventTarget .
type: docs
weight: 960
url: /id/net/aspose.svg.dom.events/ieventtarget/
---
## IEventTarget interface

Itu[`EventTarget`](../../aspose.svg.dom/eventtarget/) antarmuka diimplementasikan oleh semua Node dalam implementasi yang mendukung DOM Event Model. Oleh karena itu, antarmuka ini dapat diperoleh dengan menggunakan metode pengecoran khusus pengikatan pada instance antarmuka Node. Antarmuka memungkinkan pendaftaran dan penghapusan Pendengar Acara di sebuah[`EventTarget`](../../aspose.svg.dom/eventtarget/) dan pengiriman acara untuk itu`IEventTarget` .

```csharp
public interface IEventTarget
```

## Metode

| Nama | Keterangan |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener)(string, IEventListener) | Metode ini memungkinkan pendaftaran event listener pada target event. |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener, bool) | Metode ini memungkinkan pendaftaran event listener pada target event. |
| [DispatchEvent](../../aspose.svg.dom.events/ieventtarget/dispatchevent/)(Event) | Metode ini memungkinkan pengiriman event ke dalam model event implementasi. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener)(string, IEventListener) | Metode ini memungkinkan penghapusan pendengar acara dari target acara. Jika[`IEventListener`](../ieventlistener/) dihapus dari sebuah[`EventTarget`](../../aspose.svg.dom/eventtarget/) saat sedang memproses suatu peristiwa, peristiwa itu tidak akan dipicu oleh tindakan saat ini. Pemroses Peristiwa tidak akan pernah bisa dipanggil setelah dihapus. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener, bool) | Metode ini memungkinkan penghapusan pendengar acara dari target acara. Jika[`IEventListener`](../ieventlistener/) dihapus dari sebuah[`EventTarget`](../../aspose.svg.dom/eventtarget/) saat sedang memproses suatu peristiwa, peristiwa itu tidak akan dipicu oleh tindakan saat ini. Pemroses Peristiwa tidak akan pernah bisa dipanggil setelah dihapus. |

### Lihat juga

* ruang nama [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* perakitan [Aspose.SVG](../../)


