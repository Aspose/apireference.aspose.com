---
title: Interface IWindow
second_title: Aspose.SVG untuk Referensi .NET API
description: Aspose.Svg.Window.IWindow antarmuka. Objek jendela mewakili jendela yang berisi dokumen DOM.
type: docs
weight: 3820
url: /id/net/aspose.svg.window/iwindow/
---
## IWindow interface

Objek jendela mewakili jendela yang berisi dokumen DOM.

```csharp
public interface IWindow : IDisposable, IDocumentView, IEventTarget, IGlobalEventHandlers, 
    IWindowEventHandlers, IWindowTimers
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Document](../../aspose.svg.window/iwindow/document/) { get; } | Atribut dokumen harus mengembalikan objek Dokumen terbaru dari objek Window. |
| [FrameElement](../../aspose.svg.window/iwindow/frameelement/) { get; } | Objek frameElement dari sebuah Dokumen. |
| [Location](../../aspose.svg.window/iwindow/location/) { get; } | Atribut lokasi antarmuka Window harus mengembalikan objek Lokasi untuk Dokumen objek Jendela itu. |
| [Name](../../aspose.svg.window/iwindow/name/) { get; set; } | Atribut name dari objek Window harus, saat mendapatkan, mengembalikan nama saat ini dari konteks penelusuran, dan, saat menyetel, menyetel nama konteks penelusuran ke nilai baru. |
| [Opener](../../aspose.svg.window/iwindow/opener/) { get; } | Atribut IDL pembuka pada objek Window, saat mendapatkan, harus mengembalikan objek WindowProxy dari konteks penelusuran dari mana konteks penelusuran saat ini dibuat (konteks penelusuran pembukanya), jika ada, jika masih tersedia, dan jika konteks penjelajahan saat ini tidak menolak pembukanya; jika tidak, itu harus mengembalikan nol. Pada pengaturan, jika nilai baru adalah null maka konteks penjelajahan saat ini harus menolak pembukanya; jika nilai baru adalah hal lain maka agen pengguna harus memanggil metode internal [[DefineOwnProperty]] dari objek Window, meneruskan nama properti "pembuka" sebagai kunci properti, dan Property Descriptor { [[Value]]: nilai , [[Writable]]: true, [[Enumerable]]: true, [[Configurable]]: true } sebagai deskriptor properti, di mana value adalah nilai baru. |
| [Parent](../../aspose.svg.window/iwindow/parent/) { get; } | Atribut IDL induk pada objek Window dari Dokumen dalam konteks penelusuran b harus mengembalikan objek WindowProxy dari konteks penelusuran induk, jika ada (yaitu jika b adalah konteks penelusuran anak), atau objek WindowProxy dari penelusuran konteks b itu sendiri, jika tidak (yaitu jika itu adalah konteks penelusuran tingkat atas atau konteks penelusuran bersarang terpisah). |
| [Self](../../aspose.svg.window/iwindow/self/) { get; } | Mengembalikan objek WindowProxy dari konteks penjelajahan objek Window. |
| [Top](../../aspose.svg.window/iwindow/top/) { get; } | Atribut IDL teratas pada objek Window dari Dokumen dalam konteks penelusuran b harus mengembalikan objek WindowProxy dari konteks penelusuran tingkat atas (yang akan menjadi objek WindowProxy sendiri jika itu adalah konteks penelusuran tingkat atas itu sendiri), jika ia memiliki satu, atau objek WindowProxy miliknya sendiri (misalnya jika itu adalah konteks penjelajahan bersarang yang terpisah). |
| [Window](../../aspose.svg.window/iwindow/window/) { get; } | Mengembalikan objek WindowProxy dari konteks penjelajahan objek Window. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Alert](../../aspose.svg.window/iwindow/alert/)(string) | Menampilkan peringatan modal dengan pesan yang diberikan, dan menunggu pengguna menutupnya |
| [Confirm](../../aspose.svg.window/iwindow/confirm/)(string) | Menampilkan prompt modal OK/Batal dengan pesan yang diberikan, menunggu pengguna menutupnya, dan mengembalikan true jika pengguna mengklik OK dan salah jika pengguna mengklik Batal. |
| [Prompt](../../aspose.svg.window/iwindow/prompt/)(string, string) | Menampilkan prompt bidang teks modal dengan pesan yang diberikan, menunggu pengguna menutupnya, dan mengembalikan nilai yang dimasukkan pengguna. Jika pengguna membatalkan prompt, maka kembalikan null sebagai gantinya. Jika argumen kedua ada, maka nilai yang diberikan digunakan sebagai default. |

### Lihat juga

* interface [IDocumentView](../../aspose.svg.dom.views/idocumentview/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* interface [IGlobalEventHandlers](../../aspose.svg.dom/iglobaleventhandlers/)
* interface [IWindowEventHandlers](../iwindoweventhandlers/)
* interface [IWindowTimers](../iwindowtimers/)
* ruang nama [Aspose.Svg.Window](../../aspose.svg.window/)
* perakitan [Aspose.SVG](../../)


