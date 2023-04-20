---
title: Class MouseEvent
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Dom.Events.MouseEvent kelas. Antarmuka MouseEvent menyediakan informasi kontekstual khusus yang terkait dengan peristiwa Mouse.
type: docs
weight: 990
url: /id/net/aspose.svg.dom.events/mouseevent/
---
## MouseEvent class

Antarmuka MouseEvent menyediakan informasi kontekstual khusus yang terkait dengan peristiwa Mouse.

```csharp
public class MouseEvent : UIEvent
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [MouseEvent](mouseevent/#constructor)(string) | Menginisialisasi instance baru dari`MouseEvent` kelas. |
| [MouseEvent](mouseevent/#constructor_1)(string, IDictionary&lt;string, object&gt;) | Menginisialisasi instance baru dari`MouseEvent` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AltKey](../../aspose.svg.dom.events/mouseevent/altkey/) { get; } | Lihat atribut altKey. |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles/) { get; } | Digunakan untuk menunjukkan apakah suatu peristiwa merupakan peristiwa menggelegak atau tidak. Jika peristiwa dapat menggembungkan nilainya benar, jika tidak, nilainya salah. |
| [Button](../../aspose.svg.dom.events/mouseevent/button/) { get; } | Selama peristiwa mouse yang disebabkan oleh penekanan atau pelepasan tombol mouse, tombol HARUS digunakan untuk menunjukkan tombol perangkat penunjuk mana yang berubah status. |
| [Buttons](../../aspose.svg.dom.events/mouseevent/buttons/) { get; } | Selama aktivitas mouse apa pun, tombol HARUS digunakan untuk menunjukkan kombinasi tombol mouse mana yang sedang ditekan, dinyatakan sebagai bitmask. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable/) { get; } | Digunakan untuk menunjukkan apakah suatu peristiwa dapat dicegah tindakan defaultnya atau tidak. Jika tindakan default dapat dicegah, nilainya benar, jika tidak, nilainya salah. |
| [ClientX](../../aspose.svg.dom.events/mouseevent/clientx/) { get; } | Koordinat horizontal tempat terjadinya peristiwa relatif terhadap area pandang yang terkait dengan peristiwa. |
| [ClientY](../../aspose.svg.dom.events/mouseevent/clienty/) { get; } | Koordinat vertikal tempat terjadinya peristiwa relatif terhadap area pandang yang terkait dengan peristiwa. |
| [CtrlKey](../../aspose.svg.dom.events/mouseevent/ctrlkey/) { get; } | Lihat atribut ctrlKey. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget/) { get; } | Digunakan untuk menunjukkan[`IEventTarget`](../ieventtarget/) yang[`IEventListener`](../ieventlistener/) s sedang diproses. Ini sangat berguna selama menangkap dan menggelegak. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented/) { get; } | Mengembalikan true jika preventDefault() dipanggil sementara nilai atribut yang dapat dibatalkan adalah true, dan false jika sebaliknya. |
| [Detail](../../aspose.svg.dom.events/uievent/detail/) { get; } | Menentukan beberapa informasi detail tentang Acara, bergantung pada jenis acara. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase/) { get; } | Digunakan untuk menunjukkan fase aliran peristiwa mana yang sedang dievaluasi. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted/) { get; } | Atribut isTrusted harus mengembalikan nilai yang diinisialisasi. Ketika suatu peristiwa dibuat, atribut harus diinisialisasi ke false. |
| [MetaKey](../../aspose.svg.dom.events/mouseevent/metakey/) { get; } | Lihat atribut metaKey. |
| [RelatedTarget](../../aspose.svg.dom.events/mouseevent/relatedtarget/) { get; } | Digunakan untuk mengidentifikasi EventTarget sekunder yang terkait dengan peristiwa UI, bergantung pada jenis peristiwa. |
| [ScreenX](../../aspose.svg.dom.events/mouseevent/screenx/) { get; } | Koordinat horizontal tempat terjadinya peristiwa relatif terhadap asal sistem koordinat layar. |
| [ScreenY](../../aspose.svg.dom.events/mouseevent/screeny/) { get; } | Koordinat vertikal tempat terjadinya peristiwa relatif terhadap asal sistem koordinat layar. |
| [ShiftKey](../../aspose.svg.dom.events/mouseevent/shiftkey/) { get; } | Lihat atribut shiftKey. |
| [Target](../../aspose.svg.dom.events/event/target/) { get; } | Digunakan untuk menunjukkan[`IEventTarget`](../ieventtarget/) ke mana acara tersebut awalnya dikirim. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp/) { get; } | Digunakan untuk menentukan waktu (dalam milidetik relatif terhadap zaman) saat peristiwa dibuat. Karena beberapa sistem mungkin tidak memberikan informasi ini, nilai timeStamp mungkin tidak tersedia untuk semua peristiwa. Jika tidak tersedia , nilai 0 akan dikembalikan. Contoh waktu zaman adalah waktu sistem mulai atau 0:0:0 UTC 1 Januari 1970. |
| [Type](../../aspose.svg.dom.events/event/type/) { get; } | Nama acara (peka huruf besar-kecil). Nama harus berupa nama XML. |
| [View](../../aspose.svg.dom.events/uievent/view/) { get; } | Atribut view mengidentifikasi Window dari mana event dihasilkan. Nilai yang tidak diinisialisasi dari atribut ini HARUS null. |

## Metode

| Nama | Keterangan |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Metode ini digunakan untuk mengambil objek ECMAScriptType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent/)(string, bool, bool) | Itu[`InitEvent`](../event/initevent/) Metode ini digunakan untuk menginisialisasi nilai an[`Event`](../event/) dibuat melalui the [`IDocumentEvent`](../idocumentevent/) antarmuka. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault/)() | Jika suatu acara dapat dibatalkan, maka[`PreventDefault`](../event/preventdefault/) metode digunakan untuk menandakan bahwa acara tersebut akan dibatalkan, artinya tindakan default apa pun yang biasanya diambil oleh implementasi sebagai akibat dari acara tersebut tidak akan terjadi. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation/)() | Memanggil metode ini mencegah acara menjangkau pendengar acara apa pun yang terdaftar setelah yang sekarang dan saat dikirim dalam pohon juga mencegah acara menjangkau objek lain. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation/)() | Itu[`StopPropagation`](../event/stoppropagation/) metode digunakan untuk mencegah penyebaran lebih lanjut dari suatu peristiwa selama aliran peristiwa. |

### Lihat juga

* class [UIEvent](../uievent/)
* ruang nama [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* perakitan [Aspose.SVG](../../)


