---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class"
linktitle: "IXpsTextConversionOptions"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class. Mendefinisikan opsi untuk konversi XPS ke format lain dalam C++."
type: docs
weight: 300
url: /id/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


Mendefinisikan opsi untuk konversi [XPS](../../aspose.page.xps/) ke format lain.

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | Pada [XPS](../../aspose.page.xps/), beberapa elemen teks dapat berisi referensi ke bentuk glif alternatif yang tidak sesuai dengan kode karakter apa pun dalam font. Jika flag ini diatur ke true, teks dari elemen [XPS](../../aspose.page.xps/) tersebut diubah menjadi bentuk grafis. Kemudian teks itu sendiri muncul transparan di atasnya. Ini membuat teks elemen tersebut dapat dipilih. Namun efek sampingnya adalah file output mungkin jauh lebih besar daripada aslinya. Jika flag ini diatur ke false, karakter yang seharusnya ditampilkan sebagai bentuk alternatif diganti dengan karakter lain yang dipetakan ke bentuk glif alternatif. Oleh karena itu teks, meskipun masih dapat dipilih, akan dimodifikasi dan kemungkinan menjadi tidak dapat dibaca. |
| virtual [set_PreserveText](./set_preservetext/)(bool) | Pada [XPS](../../aspose.page.xps/), beberapa elemen teks dapat berisi referensi ke bentuk glif alternatif yang tidak sesuai dengan kode karakter apa pun dalam font. Jika flag ini diatur ke true, teks dari elemen [XPS](../../aspose.page.xps/) tersebut diubah menjadi bentuk grafis. Kemudian teks itu sendiri muncul transparan di atasnya. Ini membuat teks elemen tersebut dapat dipilih. Namun efek sampingnya adalah file output mungkin jauh lebih besar daripada aslinya. Jika flag ini diatur ke false, karakter yang seharusnya ditampilkan sebagai bentuk alternatif diganti dengan karakter lain yang dipetakan ke bentuk glif alternatif. Oleh karena itu teks, meskipun masih dapat dipilih, akan dimodifikasi dan kemungkinan menjadi tidak dapat dibaca. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
