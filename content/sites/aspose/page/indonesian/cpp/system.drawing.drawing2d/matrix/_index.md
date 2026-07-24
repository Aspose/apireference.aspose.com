---
title: "System::Drawing::Drawing2D::Matrix kelas"
linktitle: "Matrix"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Drawing2D::Matrix kelas. Mewakili matriks 3x3 yang mendefinisikan operasi transformasi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


Mewakili matriks 3x3 yang mendefinisikan operasi transformasi. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Matrix : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() const | Membuat salinan dari objek saat ini. |
| [Dispose](./dispose/)() | Melepaskan semua sumber daya sistem operasi yang diperoleh oleh objek saat ini. |
| [Equals](./equals/)(ptr) override | Menguji apakah objek yang ditentukan adalah [Matrix](./) dan identik dengan objek ini. |
| [get_Elements](./get_elements/)() const | Mengembalikan sebuah array yang berisi elemen-elemen matriks dalam urutan berikut: m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | Menentukan apakah matriks yang direpresentasikan oleh objek saat ini adalah matriks identitas. |
| [get_IsInvertible](./get_isinvertible/)() const | Menentukan apakah matriks yang direpresentasikan oleh objek saat ini dapat diinverskan. |
| [get_OffsetX](./get_offsetx/)() const | Mengembalikan nilai translasi X dari matriks yang direpresentasikan oleh objek saat ini. |
| [get_OffsetY](./get_offsety/)() const | Mengembalikan nilai translasi Y dari matriks yang direpresentasikan oleh objek saat ini. |
| [Invert](./invert/)() | Menginvers matriks yang direpresentasikan oleh objek saat ini. |
| [Matrix](./matrix/)() | Membuat instance baru dari kelas [Matrix](./) yang merepresentasikan matriks identitas. |
| [Matrix](./matrix/)(float, float, float, float, float, float) | Membuat instance baru dari kelas [Matrix](./) dan menginisialisasinya dengan nilai-nilai yang ditentukan. |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | Membuat instance baru dari kelas [Matrix](./) untuk transformasi geometrik yang didefinisikan oleh persegi panjang dan array titik yang ditentukan. |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | Membuat instance baru dari kelas [Matrix](./) untuk transformasi geometrik yang didefinisikan oleh persegi panjang dan array titik yang ditentukan. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | Mengalikan matriks yang direpresentasikan oleh objek saat ini dengan matriks yang ditentukan. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Mengalikan matriks yang direpresentasikan oleh objek saat ini dengan matriks yang ditentukan. |
| [Reset](./reset/)() | Mengatur ulang matriks yang direpresentasikan oleh objek saat ini sehingga menjadi matriks identitas. |
| [Rotate](./rotate/)(float) | Memutar matriks yang direpresentasikan oleh objek saat ini searah jarum jam sebesar sudut yang ditentukan. |
| [Rotate](./rotate/)(float, MatrixOrder) | Memutar matriks yang direpresentasikan oleh objek saat ini searah jarum jam mengelilingi asal koordinat sebesar sudut yang ditentukan. |
| [RotateAt](./rotateat/)(float, const PointF\&) | Memutar matriks yang direpresentasikan oleh objek saat ini searah jarum jam mengelilingi titik yang ditentukan sebesar sudut yang ditentukan. |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | Memutar matriks yang direpresentasikan oleh objek saat ini searah jarum jam mengelilingi titik yang ditentukan sebesar sudut yang ditentukan. |
| [Scale](./scale/)(float, float) | Menerapkan vektor skala yang ditentukan ke matriks yang direpresentasikan oleh objek saat ini. |
| [Scale](./scale/)(float, float, MatrixOrder) | Menerapkan vektor skala yang ditentukan ke matriks yang direpresentasikan oleh objek saat ini. |
| [Shear](./shear/)(float, float) | Menerapkan vektor shear yang ditentukan ke matriks yang direpresentasikan oleh objek saat ini. |
| [Shear](./shear/)(float, float, MatrixOrder) | Menerapkan vektor shear yang ditentukan ke matriks yang direpresentasikan oleh objek saat ini. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | Menerapkan transformasi geometrik yang didefinisikan oleh matriks yang direpresentasikan oleh objek saat ini ke titik-titik yang ditentukan. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | Menerapkan transformasi geometrik yang didefinisikan oleh matriks yang direpresentasikan oleh objek saat ini ke titik-titik yang ditentukan. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | Menerapkan transformasi geometrik yang didefinisikan oleh matriks yang direpresentasikan oleh objek saat ini ke titik-titik yang ditentukan. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | Menerapkan transformasi geometrik yang didefinisikan oleh matriks yang direpresentasikan oleh objek saat ini ke titik-titik yang ditentukan. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | Menerapkan hanya komponen skala dan rotasi dari matriks yang direpresentasikan oleh objek saat ini ke titik-titik yang ditentukan. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | Menerapkan hanya komponen skala dan rotasi dari matriks yang direpresentasikan oleh objek saat ini ke titik-titik yang ditentukan. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | Menerapkan hanya komponen skala dan rotasi dari matriks yang direpresentasikan oleh objek saat ini ke titik-titik yang ditentukan. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | Menerapkan hanya komponen skala dan rotasi dari matriks yang direpresentasikan oleh objek saat ini ke titik-titik yang ditentukan. |
| [Translate](./translate/)(float, float) | Menerapkan vektor translasi yang ditentukan ke matriks yang direpresentasikan oleh objek saat ini. |
| [Translate](./translate/)(float, float, MatrixOrder) | Menerapkan vektor translasi yang ditentukan ke matriks yang direpresentasikan oleh objek saat ini. |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | Mengalikan setiap vektor dalam array dengan matriks yang direpresentasikan oleh objek saat ini. |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | Mengalikan setiap vektor dalam array dengan matriks yang direpresentasikan oleh objek saat ini. |
| virtual [~Matrix](./~matrix/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
