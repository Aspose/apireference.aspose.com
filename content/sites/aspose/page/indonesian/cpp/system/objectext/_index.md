---
title: "Kelas System::ObjectExt"
linktitle: "ObjectExt"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::ObjectExt. Menyediakan metode statis yang meniru metode Object C# yang dipanggil untuk tipe C++ non-Object (string, angka, dll.). Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun dalam C++."
type: docs
weight: 4900
url: /id/cpp/system/objectext/
---
## ObjectExt class


Menyediakan metode statis yang meniru metode [Object](../object/) C# yang dipanggil untuk tipe C++ non-Object (string, angka, dll.). Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun.

```cpp
class ObjectExt : public System::ObjectType
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | Mengonversi nilai fundamental array (yang dilakukan secara implisit oleh C# tetapi tampaknya tidak oleh C++). |
| static [Box](./box/)(const T\&) | Membungkus tipe nilai untuk konversi ke [Object](../object/). Implementasi untuk tipe enum. |
| static [Box](./box/)(const T\&) | Membungkus tipe nilai untuk konversi ke [Object](../object/). Implementasi untuk tipe non-enum. |
| static [Box](./box/)(const T\&) | Membungkus tipe [Nullable](../nullable/) untuk konversi ke [Object](../object/). |
| static [Box](./box/)(const String\&) | Membungkus nilai string. |
| static [BoxEnum](./boxenum/)(T) | Membungkus tipe enum untuk dipropagasikan sebagai [Object](../object/). |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | Implementasi terjemahan operator '??' untuk tipe non-nullable. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | Implementasi terjemahan operator '??' untuk tipe nullable. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | Implementasi terjemahan operator '??' untuk tipe non-nullable. Overload untuk kasus jika RT2 dapat dikonversi ke RT1. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | Pengganti panggilan C# [Object.Equals](../object/equals/) yang bekerja untuk tipe apa pun di C++. Overload untuk tipe smart pointer. |
| static [Equals](./equals/)(T, const T2\&) | Pengganti panggilan C# [Object.Equals](../object/equals/) yang bekerja untuk tipe apa pun di C++. Overload untuk tipe struktur. |
| static [Equals](./equals/)(const T\&, const T2\&) | Pengganti panggilan C# [Object.Equals](../object/equals/) yang bekerja untuk tipe apa pun di C++. Overload untuk tipe skalar. |
| static [Equals](./equals/)(const char_t(&), String) | Pengganti panggilan C# [Object.Equals](../object/equals/) yang bekerja untuk tipe apa pun di C++. Overload untuk literal string dengan perbandingan string. |
| static [Equals](./equals/)(const float\&, const float\&) | Meniru perbandingan titik mengambang gaya C# dimana dua NaN dianggap sama meskipun menurut IEC 60559:1989 NaN tidak sama dengan nilai apa pun, termasuk NaN. |
| static [Equals](./equals/)(const double\&, const double\&) | Meniru perbandingan titik mengambang gaya C# dimana dua NaN dianggap sama meskipun menurut IEC 60559:1989 NaN tidak sama dengan nilai apa pun, termasuk NaN. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | Mengimplementasikan panggilan [GetHashCode()](./gethashcode/); berfungsi pada subclass [Object](../object/) maupun tipe yang tidak terkait. |
| static [Is](./is/)(const T\&) | Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe yang dapat dibungkus (nilai) yang memang demikian. |
| static [Is](./is/)(const U\&) | Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe pointer yang dioptimalkan untuk kelas 'final'. |
| static [Is](./is/)(const U\&) | Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe pointer. |
| static [Is](./is/)(const Object\&) | Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe nilai. |
| static [Is](./is/)(const Object\&) | Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe yang tidak dapat dikonversi. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Mengimplementasikan terjemahan operator 'is'. Spesialisasi untuk tipe pointer. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe pembungkus pengecualian. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe nullable. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe yang dapat dibungkus dengan operator == yang didefinisikan. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe yang dapat dibungkus tanpa operator == yang didefinisikan. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | Menerapkan terjemahan operator 'is'. Spesialisasi tipe nilai yang dibungkus ke antarmuka. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe enum. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe enum vs pointer lemah. |
| static [Is](./is/)(const Nullable\<U\>\&) | Menerapkan terjemahan operator 'is'. Spesialisasi untuk tipe [Nullable](../nullable/). |
| static [Is](./is/)(const char16_t *) | Menerapkan terjemahan operator 'is'. Spesialisasi untuk literal string. |
| static [Is](./is/)(int32_t) | Menerapkan terjemahan operator 'is'. Spesialisasi untuk literal integer. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | Memeriksa apakah objek adalah nilai yang dibungkus. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Mengonversi [Object](../object/) ke tipe tidak diketahui, menangani baik tipe smart pointer maupun situasi nilai yang dibungkus. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Mengonversi [Object](../object/) ke tipe tidak diketahui, menangani baik tipe smart pointer maupun situasi nilai yang dibungkus. |
| static [ToString](./tostring/)(const char_t *) | Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun. |
| static [ToString](./tostring/)(const T\&) | Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun. |
| static [ToString](./tostring/)(const T\&) | Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun. |
| static [ToString](./tostring/)(T\&) | Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun. |
| static [ToString](./tostring/)(T\&) | Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun. |
| static [ToString](./tostring/)(T\&&) | Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun. |
| static [ToString](./tostring/)(T\&) | Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun. |
| static [ToString](./tostring/)(const T\&) | Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun. |
| static [ToString](./tostring/)(T\&&) | Pengganti untuk metode C# ToString agar bekerja pada tipe C++ apa pun. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Membuka bungkus tipe nilai setelah mengonversi ke [Object](../object/). Implementasi untuk tipe enum. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Membuka bungkus tipe nilai setelah mengonversi ke [Object](../object/). Implementasi untuk tipe non-enum & non-nullable. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Membuka bungkus tipe nilai setelah mengonversi ke [Object](../object/). Implementasi untuk tipe non-enum & non-nullable. |
| static [Unbox](./unbox/)(E) | Membuka bungkus tipe enum menjadi integer. |
| static [Unbox](./unbox/)(E) | Mengonversi tipe enum. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Membuka bungkus nilai string. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | Membuka bungkus string dari nilai yang dibungkus. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | Membuka bungkus objek ke tipe nullable. |
| static [UnknownIsNull](./unknownisnull/)(T) | Memeriksa apakah objek tipe tidak diketahui adalah nullptr. Overload untuk tipe non-skalar. |
| static [UnknownIsNull](./unknownisnull/)(T) | Memeriksa apakah objek tipe tidak diketahui adalah nullptr. Overload untuk tipe skalar. |
| static [UnknownToObject](./unknowntoobject/)(T) | Mengonversi tipe tidak diketahui ke [Object](../object/), menangani baik tipe smart pointer maupun situasi tipe nilai. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | Mengonversi tipe tidak diketahui ke [Object](../object/), menangani baik tipe smart pointer maupun situasi tipe nilai. |
## Lihat Juga

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
