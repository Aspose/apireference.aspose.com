---
title: "Kelas Aspose::Page::XPS::XpsModel::XpsPathGeometry"
linktitle: "XpsPathGeometry"
second_title: "Aspose.Page untuk C++"
description: "Kelas Aspose::Page::XPS::XpsModel::XpsPathGeometry. Kelas yang menginkapsulasi fitur elemen properti PathGeometry. Elemen ini berisi sekumpulan gambar jalur yang ditentukan baik dengan atribut Figures atau dengan elemen PathFigure anak dalam C++."
type: docs
weight: 3200
url: /id/cpp/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class


Kelas yang mengenkapsulasi fitur elemen properti PathGeometry. Elemen ini berisi sekumpulan path figure yang ditentukan baik dengan atribut Figures atau dengan elemen PathFigure anak.

```cpp
class XpsPathGeometry : public Aspose::Page::XPS::XpsModel::XpsArray<System::SharedPtr<XpsPathFigure>>,
                        public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddSegment](./addsegment/)(System::SharedPtr\<XpsPathSegment\>) | Menambahkan segmen jalur ke daftar segmen anak dari gambar jalur terakhir. |
| [Clone](./clone/)() | Mengkloning geometri jalur ini. |
| [get_FillRule](./get_fillrule/)() const | Mengembalikan/mengatur nilai yang menentukan bagaimana area yang berpotongan dari bentuk geometris digabungkan menjadi sebuah wilayah. |
| [get_PathFigures](./get_pathfigures/)() | Mengembalikan daftar gambar jalur anak. |
| [get_Transform](./get_transform/)() override | Mengembalikan/mengatur matriks transformasi afinnya yang menetapkan transformasi matriks lokal yang diterapkan pada semua elemen anak dan keturunan dari geometri jalur sebelum digunakan untuk mengisi, memotong, atau memberi garis. |
| [InsertSegment](./insertsegment/)(int32_t, System::SharedPtr\<XpsPathSegment\>) | Menyisipkan segmen jalur ke dalam daftar segmen anak dari gambar jalur terakhir pada posisi *index*. |
| [RemoveSegment](./removesegment/)(System::SharedPtr\<XpsPathSegment\>) | Menghapus segmen jalur dari daftar segmen anak gambar jalur terakhir. |
| [RemoveSegmentAt](./removesegmentat/)(int32_t) | Menghapus segmen jalur dari daftar segmen anak gambar jalur terakhir pada posisi *index*. |
| [set_FillRule](./set_fillrule/)(XpsFillRule) | Mengembalikan/mengatur nilai yang menentukan bagaimana area yang berpotongan dari bentuk geometris digabungkan menjadi sebuah wilayah. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Mengembalikan/mengatur matriks transformasi afinnya yang menetapkan transformasi matriks lokal yang diterapkan pada semua elemen anak dan keturunan dari geometri jalur sebelum digunakan untuk mengisi, memotong, atau memberi garis. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Atur argumen templat ke‑n menjadi pointer lemah (bukan berbagi). Memungkinkan penggantian pointer dalam kontainer ke mode lemah. |
## Lihat Juga

* Class [XpsArray](../xpsarray/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
