---
title: Class UserProperties
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.UserProperties kelas. Kelas properti khusus yang memungkinkan properti yang diketik disetel dan dikembalikan. Ini juga memungkinkan pemasangan dua objek properti default untuk dicari jika objek properti ini tidak berisi properti.
type: docs
weight: 320
url: /id/net/aspose.page/userproperties/
---
## UserProperties class

Kelas properti khusus yang memungkinkan properti yang diketik disetel dan dikembalikan. Ini juga memungkinkan pemasangan dua objek properti default untuk dicari jika objek properti ini tidak berisi properti.

```csharp
public class UserProperties : Dictionary<string, object>
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [UserProperties](userproperties/#constructor)() | Menginisialisasi instance kosong dari kelas UserProperties. |
| [UserProperties](userproperties/#constructor_1)(Dictionary&lt;string, object&gt;) | Menginisialisasi kelas UserProperties dengan nilai default. |
| [UserProperties](userproperties/#constructor_2)(Dictionary&lt;string, object&gt;, Dictionary&lt;string, object&gt;) | Membuat UserProperties dengan tabel default dan altDefaults, yang dicari dalam urutan tersebut. |

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [Properties](../../aspose.page/userproperties/properties/) { set; } | Menyalin properti, termasuk defaultnya ke UserProperties ini |

## Metode

| Nama | Keterangan |
| --- | --- |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty/#getproperty)(string) | Mendapat nilai properti string. |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty/#getproperty_1)(string, string) | Mendapat nilai properti string. Jika properti yang diminta tidak ada, kembalikan nilai default yang diberikan. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor/#getpropertycolor)(string) | Mendapat nilai properti warna. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor/#getpropertycolor_1)(string, Color) | Mendapat nilai properti warna. Jika properti yang diminta tidak ada, kembalikan nilai default yang diberikan. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble/#getpropertydouble)(string) | Mendapat nilai properti ganda. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble/#getpropertydouble_1)(string, double) | Mendapat nilai properti ganda. Jika properti yang diminta tidak ada, kembalikan nilai default yang diberikan. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat/#getpropertyfloat)(string) | Mendapat nilai properti float. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat/#getpropertyfloat_1)(string, float) | Mendapat nilai properti float. Jika properti yang diminta tidak ada, kembalikan nilai default yang diberikan. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint/#getpropertyint)(string) | Mendapat nilai properti integer. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint/#getpropertyint_1)(string, int) | Mendapat nilai properti integer. Jika properti yang diminta tidak ada, kembalikan nilai default yang diberikan. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins/#getpropertymargins)(string) | Mendapat nilai properti margin. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins/#getpropertymargins_1)(string, Margins) | Mendapat nilai properti margin. Jika properti yang diminta tidak ada, kembalikan nilai default yang diberikan. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle/#getpropertyrectangle)(string) | Mendapat nilai properti persegi panjang. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle/#getpropertyrectangle_1)(string, RectangleF) | Mendapat nilai properti persegi panjang. Jika properti yang diminta tidak ada, kembalikan nilai default yang diberikan. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize/#getpropertysize)(string) | Mendapat nilai properti ukuran. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize/#getpropertysize_1)(string, Size) | Mendapat nilai properti ukuran. Jika properti yang diminta tidak ada, kembalikan nilai default yang diberikan. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray/#getpropertystringarray)(string) | Mendapat nilai properti array string. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray/#getpropertystringarray_1)(string, string[]) | Mendapat nilai properti array string. Jika properti yang diminta tidak ada, kembalikan nilai default yang diberikan. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty/#isproperty)(string) | Mendapat nilai properti boolean. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty/#isproperty_1)(string, bool) | Mendapat nilai properti boolean. Jika properti yang diminta tidak ada, kembalikan nilai default yang diberikan. |
| virtual [PrintProperties](../../aspose.page/userproperties/printproperties/)() |  |
| virtual [PropertyNames](../../aspose.page/userproperties/propertynames/)() | Mengembalikan nama properti. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_1)(string, bool) | Menetapkan nilai properti boolean. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_5)(string, Color) | Menetapkan nilai properti warna. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_2)(string, double) | Menetapkan nilai properti ganda. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_4)(string, float) | Menetapkan nilai properti float. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_3)(string, int) | Menetapkan nilai properti bilangan bulat. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty)(string, Margins) | Menetapkan nilai properti margin. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_6)(string, Rectangle) | Menetapkan nilai properti persegi panjang. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_7)(string, Size) | Menetapkan nilai properti ukuran. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_8)(string, string) | Menetapkan nilai properti string. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_9)(string, string[]) | Menetapkan nilai properti larik string. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_1)(Dictionary&lt;string, object&gt;, string, bool) | Menetapkan nilai properti boolean di tabel properti yang ditentukan. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_5)(Dictionary&lt;string, object&gt;, string, Color) | Menetapkan nilai properti warna pada tabel properti yang ditentukan. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_2)(Dictionary&lt;string, object&gt;, string, double) | Menetapkan nilai properti ganda di tabel properti yang ditentukan. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_4)(Dictionary&lt;string, object&gt;, string, float) | Menetapkan nilai properti float di tabel properti yang ditentukan. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_3)(Dictionary&lt;string, object&gt;, string, int) | Menetapkan nilai properti integer di tabel properti yang ditentukan. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty)(Dictionary&lt;string, object&gt;, string, Margins) | Menetapkan nilai properti margin di tabel properti yang ditentukan. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_6)(Dictionary&lt;string, object&gt;, string, Rectangle) | Menetapkan nilai properti persegi panjang di tabel properti yang ditentukan. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_7)(Dictionary&lt;string, object&gt;, string, Size) | Menetapkan nilai properti ukuran di tabel properti yang ditentukan. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_8)(Dictionary&lt;string, object&gt;, string, string[]) | Menetapkan nilai properti larik string di tabel properti yang ditentukan. |

### Lihat juga

* ruang nama [Aspose.Page](../../aspose.page/)
* perakitan [Aspose.Page](../../)


