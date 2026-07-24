---
title: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush kelas"
linktitle: "XpsTransformableBrush"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush kelas. Kelas yang mengenkapsulasi fitur umum elemen kuas yang dapat ditransformasi (semua kecuali SolidColorBrush) dalam C++."
type: docs
weight: 4300
url: /id/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


Kelas yang mengenkapsulasi fitur umum elemen kuas yang dapat ditransformasi (semua kecuali SolidColorBrush).

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Transform](./get_transform/)() override | Mengembalikan/mengatur transformasi matriks yang diterapkan pada ruang koordinat kuas. Properti Transform digabungkan dengan transformasi render efektif saat ini untuk menghasilkan transformasi render efektif yang lokal pada kuas. Viewport untuk kuas ditransformasikan menggunakan transformasi render efektif lokal. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Mengembalikan/mengatur transformasi matriks yang diterapkan pada ruang koordinat kuas. Properti Transform digabungkan dengan transformasi render efektif saat ini untuk menghasilkan transformasi render efektif yang lokal pada kuas. Viewport untuk kuas ditransformasikan menggunakan transformasi render efektif lokal. |
## Lihat Juga

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
