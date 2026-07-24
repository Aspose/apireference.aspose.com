---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class. Menetapkan kelas dasar untuk argumen berbagai peristiwa sebelum menyimpan dalam C++."
type: docs
weight: 200
url: /id/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Mendefinisikan kelas dasar untuk argumen berbagai peristiwa sebelum menyimpan.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe API modifikasi. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | Nomor halaman absolut saat ini di seluruh dokumen dalam paket [XPS](../../aspose.page.xps/). |
| [get_DocumentNumber](./get_documentnumber/)() const | Nomor dokumen saat ini dalam paket [XPS](../../aspose.page.xps/). |
| [get_ElementAPI](./get_elementapi/)() const | Mendapatkan API modifikasi dari elemen yang akan disimpan. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | Nomor output saat ini. Nilai ini berbeda dari **AbsolutePageNumber** jika opsi simpan **PageNumbers** ditentukan. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | Nomor halaman saat ini relatif terhadap dokumen saat ini dalam paket [XPS](../../aspose.page.xps/). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Atur argumen templat ke‑n menjadi pointer lemah (bukan berbagi). Memungkinkan penggantian pointer dalam kontainer ke mode lemah. |

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
