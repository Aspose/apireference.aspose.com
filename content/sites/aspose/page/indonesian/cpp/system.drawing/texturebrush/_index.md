---
title: "kelas System::Drawing::TextureBrush"
linktitle: "TextureBrush"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Drawing::TextureBrush. Mewakili kuas yang menggunakan gambar untuk mengisi interior sebuah bentuk. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2800
url: /id/cpp/system.drawing/texturebrush/
---
## TextureBrush class


Mewakili kuas yang menggunakan gambar untuk mengisi interior sebuah bentuk. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class TextureBrush : public System::Drawing::Brush
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Membuat salinan dari objek saat ini. |
| [get_Image](./get_image/)() | Mengembalikan gambar yang digunakan oleh objek [TextureBrush](./) saat ini. |
| [get_Transform](./get_transform/)() | Mengembalikan salinan objek Matrix yang menentukan transformasi geometris untuk kuas yang direpresentasikan oleh objek saat ini. |
| [get_WrapMode](./get_wrapmode/)() | Mengembalikan nilai yang menentukan bagaimana kuas yang direpresentasikan oleh objek saat ini ditata ubin. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Mengalikan matriks transformasi objek saat ini dengan matriks yang ditentukan. |
| [ResetTransform](./resettransform/)() | Mengatur ulang matriks transformasi objek saat ini sehingga menjadi matriks identitas. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Memutar transformasi geometris lokal sebesar sudut yang ditentukan dalam urutan yang ditentukan. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Menskalakan transformasi geometris lokal dengan faktor-faktor yang ditentukan dalam urutan yang ditentukan. |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | Menetapkan objek Matrix yang menentukan transformasi geometris untuk kuas yang direpresentasikan oleh objek saat ini. |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | Menetapkan nilai yang menentukan bagaimana kuas yang direpresentasikan oleh objek saat ini ditata ubin. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | Membuat instance baru dari kelas [TextureBrush](./) yang menggunakan gambar yang ditentukan. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | Membuat instance baru dari kelas [TextureBrush](./) yang menggunakan gambar yang ditentukan. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | Membuat instance baru dari kelas [TextureBrush](./) yang menggunakan gambar yang ditentukan. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | Membuat instance baru dari kelas [TextureBrush](./) yang menggunakan gambar yang ditentukan. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | Membuat instance baru dari kelas [TextureBrush](./) yang menggunakan gambar yang ditentukan. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Menerjemahkan transformasi geometris lokal dengan dimensi yang ditentukan dalam urutan yang ditentukan. |
| virtual [~TextureBrush](./~texturebrush/)() | Destruktor. |
## Lihat Juga

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
