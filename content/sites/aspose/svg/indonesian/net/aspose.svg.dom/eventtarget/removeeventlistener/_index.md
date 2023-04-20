---
title: EventTarget.RemoveEventListener
second_title: Aspose.SVG untuk Referensi .NET API
description: EventTarget metode. Metode ini memungkinkan penghapusan pendengar acara dari target acara. JikaIEventListener dihapus dari sebuahEventTarget saat sedang memproses suatu peristiwa peristiwa itu tidak akan dipicu oleh tindakan saat ini. Pemroses Peristiwa tidak akan pernah bisa dipanggil setelah dihapus.
type: docs
weight: 40
url: /id/net/aspose.svg.dom/eventtarget/removeeventlistener/
---
## RemoveEventListener(string, DOMEventHandler, bool) {#removeeventlistener}

Metode ini memungkinkan penghapusan pendengar acara dari target acara. Jika[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) dihapus dari sebuah[`EventTarget`](../) saat sedang memproses suatu peristiwa, peristiwa itu tidak akan dipicu oleh tindakan saat ini. Pemroses Peristiwa tidak akan pernah bisa dipanggil setelah dihapus.

```csharp
public void RemoveEventListener(string type, DOMEventHandler handler, bool useCapture)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| type | String | Menentukan jenis acara dari[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) sedang dihapus. |
| handler | DOMEventHandler | Itu[`DOMEventHandler`](../../../aspose.svg.dom.events/domeventhandler/) parameter menunjukkan[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) untuk dihapus. |
| useCapture | Boolean | Menentukan apakah EventListener yang dihapus terdaftar sebagai pendengar penangkap atau tidak. Jika pendengar terdaftar dua kali, satu dengan penangkap dan satu tanpa, masing-masing harus dihapus secara terpisah. Penghapusan pendengar penangkap tidak memengaruhi versi yang tidak menangkap pendengar yang sama, dan sebaliknya. |

### Lihat juga

* delegate [DOMEventHandler](../../../aspose.svg.dom.events/domeventhandler/)
* class [EventTarget](../)
* ruang nama [Aspose.Svg.Dom](../../eventtarget/)
* perakitan [Aspose.SVG](../../../)

---

## RemoveEventListener(string, IEventListener) {#removeeventlistener_1}

Metode ini memungkinkan penghapusan pendengar acara dari target acara. Jika[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) dihapus dari sebuah[`EventTarget`](../) saat sedang memproses suatu peristiwa, peristiwa itu tidak akan dipicu oleh tindakan saat ini. Pemroses Peristiwa tidak akan pernah bisa dipanggil setelah dihapus.

```csharp
public void RemoveEventListener(string type, IEventListener listener)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| type | String | Menentukan jenis acara dari[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) sedang dihapus. |
| listener | IEventListener | Itu[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) parameter menunjukkan[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) untuk dihapus. |

### Lihat juga

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)
* class [EventTarget](../)
* ruang nama [Aspose.Svg.Dom](../../eventtarget/)
* perakitan [Aspose.SVG](../../../)

---

## RemoveEventListener(string, IEventListener, bool) {#removeeventlistener_2}

Metode ini memungkinkan penghapusan pendengar acara dari target acara. Jika[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) dihapus dari sebuah[`EventTarget`](../) saat sedang memproses suatu peristiwa, peristiwa itu tidak akan dipicu oleh tindakan saat ini. Pemroses Peristiwa tidak akan pernah bisa dipanggil setelah dihapus.

```csharp
public void RemoveEventListener(string type, IEventListener listener, bool useCapture)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| type | String | Menentukan jenis acara dari[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) sedang dihapus. |
| listener | IEventListener | Itu[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) parameter menunjukkan[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) untuk dihapus. |
| useCapture | Boolean | Menentukan apakah EventListener yang dihapus terdaftar sebagai pendengar penangkap atau tidak. Jika pendengar terdaftar dua kali, satu dengan penangkap dan satu tanpa, masing-masing harus dihapus secara terpisah. Penghapusan pendengar penangkap tidak memengaruhi versi yang tidak menangkap pendengar yang sama, dan sebaliknya. |

### Lihat juga

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)
* class [EventTarget](../)
* ruang nama [Aspose.Svg.Dom](../../eventtarget/)
* perakitan [Aspose.SVG](../../../)


