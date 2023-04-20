---
title: Class SVGZoomEvent
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Events.SVGZoomEvent kelas. Acara zoom terjadi saat pengguna memulai tindakan yang menyebabkan tampilan fragmen dokumen SVG saat ini diubah skalanya. Penangan acara hanya dikenali pada elemen svg.
type: docs
weight: 1620
url: /id/net/aspose.svg.events/svgzoomevent/
---
## SVGZoomEvent class

Acara zoom terjadi saat pengguna memulai tindakan yang menyebabkan tampilan fragmen dokumen SVG saat ini diubah skalanya. Penangan acara hanya dikenali pada elemen 'svg'.

```csharp
public class SVGZoomEvent : Event
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles/) { get; } | Digunakan untuk menunjukkan apakah suatu peristiwa merupakan peristiwa menggelegak atau tidak. Jika peristiwa dapat menggembungkan nilainya benar, jika tidak, nilainya salah. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable/) { get; } | Digunakan untuk menunjukkan apakah suatu peristiwa dapat dicegah tindakan defaultnya atau tidak. Jika tindakan default dapat dicegah, nilainya benar, jika tidak, nilainya salah. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget/) { get; } | Digunakan untuk menunjukkan[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/) yang[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) s sedang diproses. Ini sangat berguna selama menangkap dan menggelegak. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented/) { get; } | Mengembalikan true jika preventDefault() dipanggil sementara nilai atribut yang dapat dibatalkan adalah true, dan false jika sebaliknya. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase/) { get; } | Digunakan untuk menunjukkan fase aliran peristiwa mana yang sedang dievaluasi. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted/) { get; } | Atribut isTrusted harus mengembalikan nilai yang diinisialisasi. Ketika suatu peristiwa dibuat, atribut harus diinisialisasi ke false. |
| [NewScale](../../aspose.svg.events/svgzoomevent/newscale/) { get; } | Faktor skala yang akan diterapkan setelah operasi zoom diproses. |
| [NewTranslate](../../aspose.svg.events/svgzoomevent/newtranslate/) { get; } | Nilai terjemahan yang akan ditempatkan setelah operasi zoom diproses. Objek SVGPoint bersifat hanya baca. |
| [PreviousScale](../../aspose.svg.events/svgzoomevent/previousscale/) { get; } | Faktor skala dari operasi zoom sebelumnya yang ada sebelum operasi zoom terjadi. |
| [PreviousTranslate](../../aspose.svg.events/svgzoomevent/previoustranslate/) { get; } | Nilai terjemahan dari operasi zoom sebelumnya yang ada sebelum operasi zoom terjadi. Objek SVGPoint bersifat hanya baca. |
| [Target](../../aspose.svg.dom.events/event/target/) { get; } | Digunakan untuk menunjukkan[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/) ke mana acara tersebut awalnya dikirim. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp/) { get; } | Digunakan untuk menentukan waktu (dalam milidetik relatif terhadap zaman) saat peristiwa dibuat. Karena beberapa sistem mungkin tidak memberikan informasi ini, nilai timeStamp mungkin tidak tersedia untuk semua peristiwa. Jika tidak tersedia , nilai 0 akan dikembalikan. Contoh waktu zaman adalah waktu sistem mulai atau 0:0:0 UTC 1 Januari 1970. |
| [Type](../../aspose.svg.dom.events/event/type/) { get; } | Nama acara (peka huruf besar-kecil). Nama harus berupa nama XML. |
| [ZoomRectScreen](../../aspose.svg.events/svgzoomevent/zoomrectscreen/) { get; } | Persegi panjang zoom yang ditentukan dalam unit layar. Objek SVGRect hanya dapat dibaca. |

## Metode

| Nama | Keterangan |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Metode ini digunakan untuk mengambil objek ECMAScriptType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent/)(string, bool, bool) | Itu[`InitEvent`](../../aspose.svg.dom.events/event/initevent/) Metode ini digunakan untuk menginisialisasi nilai an[`Event`](../../aspose.svg.dom.events/event/) dibuat melalui the [`IDocumentEvent`](../../aspose.svg.dom.events/idocumentevent/) antarmuka. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault/)() | Jika suatu acara dapat dibatalkan, maka[`PreventDefault`](../../aspose.svg.dom.events/event/preventdefault/) metode digunakan untuk menandakan bahwa acara tersebut akan dibatalkan, artinya tindakan default apa pun yang biasanya diambil oleh implementasi sebagai akibat dari acara tersebut tidak akan terjadi. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation/)() | Memanggil metode ini mencegah acara menjangkau pendengar acara apa pun yang terdaftar setelah yang sekarang dan saat dikirim dalam pohon juga mencegah acara menjangkau objek lain. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation/)() | Itu[`StopPropagation`](../../aspose.svg.dom.events/event/stoppropagation/) metode digunakan untuk mencegah penyebaran lebih lanjut dari suatu peristiwa selama aliran peristiwa. |

### Lihat juga

* class [Event](../../aspose.svg.dom.events/event/)
* ruang nama [Aspose.Svg.Events](../../aspose.svg.events/)
* perakitan [Aspose.SVG](../../)


