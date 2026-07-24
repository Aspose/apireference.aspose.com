---
title: "Aspose::Page::EPS::GradientBrush kelas"
linktitle: "GradientBrush"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::EPS::GradientBrush kelas. Kelas ini digunakan untuk mengenkapsulasi LinearGradientBrush dan PathGradientBrush dengan kemungkinan mengatur wrap mode menjadi clamp. Kuas gradien native selalu melempar pengecualian ketika seseorang mencoba mengatur properti WrapMode ke WrapMode.Clamp dalam C++."
type: docs
weight: 300
url: /id/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


Kelas ini digunakan untuk mengenkapsulasi LinearGradientBrush dan PathGradientBrush dengan kemungkinan mengatur mode pembungkus menjadi clamp. Kuas gradien asli selalu melempar pengecualian ketika seseorang mencoba mengatur properti WrapMode ke WrapMode.Clamp.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Menggandakan kuas ini. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh objek [T:Aspose::Page::EPS::GradientBrush](../) ini. |
| [get_Bounds](./get_bounds/)() const | Mengembalikan atau menentukan batas untuk kuas gradien ini. |
| [get_NativeBrush](./get_nativebrush/)() const | Mengembalikan kuas gradien native. |
| [get_WrapMode](./get_wrapmode/)() const | Mengembalikan atau menentukan wrap mode untuk kuas gradien ini. Bisa berupa WrapMode.Clamp, yang menyebabkan pengecualian dilemparkan pada kuas gradien native. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | Membuat instance baru dari [GradientBrush](./). |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | Mengembalikan atau menentukan batas untuk kuas gradien ini. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | Mengembalikan atau menentukan wrap mode untuk kuas gradien ini. Bisa berupa WrapMode.Clamp, yang menyebabkan pengecualian dilemparkan pada kuas gradien native. |
## Lihat Juga

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
