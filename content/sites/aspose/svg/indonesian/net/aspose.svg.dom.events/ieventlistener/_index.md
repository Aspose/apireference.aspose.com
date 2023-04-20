---
title: Interface IEventListener
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Dom.Events.IEventListener antarmuka. ItuIEventListenerantarmuka adalah metode utama untuk menangani peristiwa. Pengguna mengimplementasikanIEventListener antarmuka dan mendaftarkan pendengar mereka pada sebuahEventTarget menggunakanAddEventListener method. Pengguna juga harus menghapusnyaIEventListener dari ituEventTarget setelah selesai menggunakan listener.
type: docs
weight: 950
url: /id/net/aspose.svg.dom.events/ieventlistener/
---
## IEventListener interface

Itu`IEventListener`antarmuka adalah metode utama untuk menangani peristiwa. Pengguna mengimplementasikan`IEventListener` antarmuka dan mendaftarkan pendengar mereka pada sebuah[`EventTarget`](../../aspose.svg.dom/eventtarget/) menggunakan[`AddEventListener`](../../aspose.svg.dom/eventtarget/addeventlistener/) method. Pengguna juga harus menghapusnya`IEventListener` dari itu[`EventTarget`](../../aspose.svg.dom/eventtarget/) setelah selesai menggunakan listener.

```csharp
public interface IEventListener
```

## Metode

| Nama | Keterangan |
| --- | --- |
| [HandleEvent](../../aspose.svg.dom.events/ieventlistener/handleevent/)(Event) | Metode ini dipanggil setiap kali terjadi peristiwa dari jenis yang`IEventListener` antarmuka telah terdaftar. |

### Perkataan

Ketika Node disalin menggunakan metode cloneNode, Pendengar Acara yang dilampirkan ke Node sumber tidak dilampirkan ke Node yang disalin. Jika pengguna menginginkan Pendengar Acara yang sama ditambahkan ke salinan yang baru dibuat, pengguna harus menambahkannya secara manual.

### Lihat juga

* ruang nama [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* perakitan [Aspose.SVG](../../)


