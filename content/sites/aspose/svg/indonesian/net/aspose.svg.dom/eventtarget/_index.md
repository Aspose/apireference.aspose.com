---
title: Class EventTarget
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Dom.EventTarget kelas. ItuEventTarget antarmuka diimplementasikan oleh semua Node dalam implementasi yang mendukung DOM Event Model. Oleh karena itu antarmuka ini dapat diperoleh dengan menggunakan metode pengecoran khusus pengikatan pada instance antarmuka Node. Antarmuka memungkinkan pendaftaran dan penghapusan Pendengar Acara di sebuahEventTarget dan pengiriman acara untuk ituIEventTarget .
type: docs
weight: 870
url: /id/net/aspose.svg.dom/eventtarget/
---
## EventTarget class

Itu`EventTarget` antarmuka diimplementasikan oleh semua Node dalam implementasi yang mendukung DOM Event Model. Oleh karena itu, antarmuka ini dapat diperoleh dengan menggunakan metode pengecoran khusus pengikatan pada instance antarmuka Node. Antarmuka memungkinkan pendaftaran dan penghapusan Pendengar Acara di sebuah`EventTarget` dan pengiriman acara untuk itu[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/) .

```csharp
public class EventTarget : DOMObject, IDisposable, IEventTarget
```

## Metode

| Nama | Keterangan |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener) | Metode ini memungkinkan pendaftaran event listener pada target event. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener)(string, DOMEventHandler, bool) | Metode ini memungkinkan pendaftaran event listener pada target event. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_2)(string, IEventListener, bool) | Metode ini memungkinkan pendaftaran event listener pada target event. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Metode ini memungkinkan pengiriman event ke dalam model event implementasi. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Melakukan tugas yang ditentukan aplikasi terkait dengan membebaskan, melepaskan, atau menyetel ulang sumber daya yang tidak dikelola. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Metode ini digunakan untuk mengambil objek ECMAScriptType . |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener) | Metode ini memungkinkan penghapusan pendengar acara dari target acara. Jika[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) dihapus dari sebuah`EventTarget` saat sedang memproses suatu peristiwa, peristiwa itu tidak akan dipicu oleh tindakan saat ini. Pemroses Peristiwa tidak akan pernah bisa dipanggil setelah dihapus. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener)(string, DOMEventHandler, bool) | Metode ini memungkinkan penghapusan pendengar acara dari target acara. Jika[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) dihapus dari sebuah`EventTarget` saat sedang memproses suatu peristiwa, peristiwa itu tidak akan dipicu oleh tindakan saat ini. Pemroses Peristiwa tidak akan pernah bisa dipanggil setelah dihapus. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_2)(string, IEventListener, bool) | Metode ini memungkinkan penghapusan pendengar acara dari target acara. Jika[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) dihapus dari sebuah`EventTarget` saat sedang memproses suatu peristiwa, peristiwa itu tidak akan dipicu oleh tindakan saat ini. Pemroses Peristiwa tidak akan pernah bisa dipanggil setelah dihapus. |

### Lihat juga

* class [DOMObject](../domobject/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* ruang nama [Aspose.Svg.Dom](../../aspose.svg.dom/)
* perakitan [Aspose.SVG](../../)


