---
title: "Kelas System::Drawing::Region"
linktitle: "Region"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Drawing::Region. Mewakili interior (bagian dalam) dari bentuk grafis. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2100
url: /id/cpp/system.drawing/region/
---
## Region class


Mewakili interior dari bentuk grafis. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Region : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() const | Mengembalikan salinan objek saat ini. |
| [Complement](./complement/)(const RectangleF\&) | Mengganti region yang diwakili oleh objek saat ini dengan bagian region yang didefinisikan oleh persegi panjang yang ditentukan yang tidak berpotongan dengan region ini. |
| [Complement](./complement/)(const Rectangle\&) | Mengganti region yang diwakili oleh objek saat ini dengan bagian region yang didefinisikan oleh persegi panjang yang ditentukan yang tidak berpotongan dengan region ini. |
| [Complement](./complement/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Mengganti region yang diwakili oleh objek saat ini dengan bagian region yang didefinisikan oleh jalur yang ditentukan yang tidak berpotongan dengan region ini. |
| [Complement](./complement/)(const SharedPtr\<Region\>\&) | Mengganti region yang diwakili oleh objek saat ini dengan bagian dari region yang ditentukan yang tidak berpotongan dengan region ini. |
| [Dispose](./dispose/)() | Melepaskan semua sumber daya sistem operasi yang diperoleh oleh objek saat ini. |
| [Equals](./equals/)(const SharedPtr\<Region\>\&, const SharedPtr\<Graphics\>\&) | Menentukan apakah region yang ditentukan identik dengan region yang diwakili oleh objek saat ini pada permukaan gambar yang ditentukan. |
| [Exclude](./exclude/)(const RectangleF\&) | Mengganti region yang diwakili oleh objek saat ini dengan hasil pengecualian region yang didefinisikan oleh persegi panjang yang ditentukan darinya. |
| [Exclude](./exclude/)(const Rectangle\&) | Mengganti region yang diwakili oleh objek saat ini dengan hasil pengecualian region yang didefinisikan oleh persegi panjang yang ditentukan darinya. |
| [Exclude](./exclude/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Mengganti region yang diwakili oleh objek saat ini dengan hasil pengecualian region yang didefinisikan oleh jalur yang ditentukan darinya. |
| [Exclude](./exclude/)(const SharedPtr\<Region\>\&) | Mengganti region yang diwakili oleh objek saat ini dengan hasil pengecualian region yang ditentukan darinya. |
| [GetBounds](./getbounds/)(const SharedPtr\<Graphics\>\&) const | Mendapatkan struktur [RectangleF](../rectanglef/) yang mewakili persegi panjang yang membatasi [Region](./) ini pada permukaan gambar dari objek [Graphics](../graphics/). |
| [GetRegionData](./getregiondata/)() const | Mengembalikan objek RegionData yang berisi data yang mendefinisikan region yang diwakili oleh objek saat ini. |
| [GetRegionScans](./getregionscans/)(const SharedPtr\<Drawing2D::Matrix\>\&) const | Mengembalikan array dari struktur [RectangleF](../rectanglef/) yang mendekati [Region](./) ini setelah transformasi matriks yang ditentukan diterapkan. |
| [Intersect](./intersect/)(const RectangleF\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan hasil irisan antara wilayah ini dan wilayah yang didefinisikan oleh persegi panjang yang ditentukan. |
| [Intersect](./intersect/)(const Rectangle\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan hasil irisan antara wilayah ini dan wilayah yang didefinisikan oleh persegi panjang yang ditentukan. |
| [Intersect](./intersect/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan hasil irisan antara wilayah ini dan wilayah yang didefinisikan oleh jalur yang ditentukan. |
| [Intersect](./intersect/)(const SharedPtr\<Region\>\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan hasil irisan antara wilayah ini dan wilayah yang ditentukan. |
| [IsEmpty](./isempty/)(const SharedPtr\<Graphics\>\&) const | Menentukan apakah wilayah yang diwakili oleh objek saat ini memiliki interior kosong pada permukaan gambar yang ditentukan. |
| [IsInfinite](./isinfinite/)(const SharedPtr\<Graphics\>\&) const | Menentukan apakah wilayah yang diwakili oleh objek saat ini memiliki interior tak terbatas pada permukaan gambar yang ditentukan. |
| [IsVisible](./isvisible/)(const Point\&) const | Menentukan apakah titik yang ditentukan berada di dalam wilayah yang diwakili oleh objek saat ini. |
| [IsVisible](./isvisible/)(const PointF\&) const | Menentukan apakah titik yang ditentukan berada di dalam wilayah yang diwakili oleh objek saat ini. |
| [IsVisible](./isvisible/)(const Rectangle\&) | Menentukan apakah sebagian dari persegi panjang yang ditentukan berada di dalam wilayah yang diwakili oleh objek saat ini. |
| [IsVisible](./isvisible/)(const RectangleF\&) | Menentukan apakah sebagian dari persegi panjang yang ditentukan berada di dalam wilayah yang diwakili oleh objek saat ini. |
| [IsVisible](./isvisible/)(const Point\&, const SharedPtr\<Graphics\>\&) const | Menentukan apakah titik yang ditentukan berada di dalam wilayah yang diwakili oleh objek saat ini menggunakan grafik yang ditentukan. |
| [IsVisible](./isvisible/)(const PointF\&, const SharedPtr\<Graphics\>\&) const | Menentukan apakah titik yang ditentukan berada di dalam wilayah yang diwakili oleh objek saat ini menggunakan grafik yang ditentukan. |
| [IsVisible](./isvisible/)(const Rectangle\&, const SharedPtr\<Graphics\>\&) | Menentukan apakah sebagian dari persegi panjang yang ditentukan berada di dalam wilayah yang diwakili oleh objek saat ini menggunakan grafik yang ditentukan. |
| [IsVisible](./isvisible/)(const RectangleF\&, const SharedPtr\<Graphics\>\&) | Menentukan apakah sebagian dari persegi panjang yang ditentukan berada di dalam wilayah yang diwakili oleh objek saat ini menggunakan grafik yang ditentukan. |
| [IsVisible](./isvisible/)(float, float) const | Menentukan apakah titik yang ditentukan berada di dalam wilayah yang diwakili oleh objek saat ini. |
| [IsVisible](./isvisible/)(float, float, const SharedPtr\<Graphics\>\&) const | Menentukan apakah titik yang ditentukan berada di dalam wilayah yang diwakili oleh objek saat ini menggunakan grafik yang ditentukan. |
| [MakeEmpty](./makeempty/)() | Menginisialisasi objek saat ini dengan interior kosong. |
| [MakeInfinite](./makeinfinite/)() | Menginisialisasi objek wilayah ini dengan interior tak terbatas. |
| [Region](./region/)() | Membuat instance baru dari kelas [Region](./). |
| [Region](./region/)(const RectangleF\&) | Membuat instance baru dari kelas [Region](./) yang mewakili wilayah yang didefinisikan oleh persegi panjang yang ditentukan. |
| [Region](./region/)(const Rectangle\&) | Membuat instance baru dari kelas [Region](./) yang mewakili wilayah yang didefinisikan oleh persegi panjang yang ditentukan. |
| [Region](./region/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Membuat instance baru dari kelas [Region](./) yang mewakili wilayah yang didefinisikan oleh jalur yang ditentukan. |
| [Region](./region/)(const SkPath\&) |  |
| [Region](./region/)(const SharedPtr\<Drawing2D::RegionData\>\&) | Membuat instance baru dari kelas [Region](./) yang mewakili wilayah yang didefinisikan oleh objek RegionData yang ditentukan. |
| [Transform](./transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Mengubah wilayah ini dengan matriks yang ditentukan. |
| [Transform](./transform/)(const SkMatrix\&) | Mengubah wilayah ini dengan matriks yang ditentukan. |
| [Translate](./translate/)(int, int) | Memindahkan koordinat wilayah sebesar jumlah yang ditentukan. |
| [Translate](./translate/)(float, float) | Memindahkan koordinat wilayah sebesar jumlah yang ditentukan. |
| [Union](./union/)(const RectangleF\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan hasil operasi union antara wilayah ini dan wilayah yang didefinisikan oleh persegi panjang yang ditentukan. |
| [Union](./union/)(const Rectangle\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan hasil union antara wilayah ini dan wilayah yang didefinisikan oleh persegi panjang yang ditentukan. |
| [Union](./union/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan hasil union antara wilayah ini dan wilayah yang didefinisikan oleh jalur yang ditentukan. |
| [Union](./union/)(const SharedPtr\<Region\>\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan hasil union antara wilayah ini dan wilayah yang ditentukan. |
| [Xor](./xor/)(const RectangleF\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan bagian-bagian dari wilayah ini dan wilayah yang didefinisikan oleh persegi panjang yang ditentukan yang tidak beririsan. |
| [Xor](./xor/)(const Rectangle\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan bagian-bagian dari wilayah ini dan wilayah yang didefinisikan oleh persegi panjang yang ditentukan yang tidak beririsan. |
| [Xor](./xor/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan bagian-bagian dari wilayah ini dan wilayah yang didefinisikan oleh jalur yang ditentukan yang tidak beririsan. |
| [Xor](./xor/)(const SharedPtr\<Region\>\&) | Mengganti wilayah yang diwakili oleh objek saat ini dengan bagian-bagian dari wilayah ini dan wilayah yang ditentukan yang tidak beririsan. |
| virtual [~Region](./~region/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
