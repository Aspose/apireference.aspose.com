---
title: NurbsCurve
second_title: Aspose.3D untuk .NET API Referensi
description: kurva NURBShttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline adalah kurva yang diwakili oleh NURBS Spline dasar rasional tidak seragam Kurva NURBS ditentukan olehOrder./nurbscurve/order/  satu set tertimbangControlPoints./geometry/controlpoints/ dan aKnotVectors./nurbscurve/knotvectors/ Komponen w pada control point digunakan sebagai bobot control point apapun itu aTwoDimensional atauThreeDimensional
type: docs
weight: 460
url: /id/net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[kurva NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) adalah kurva yang diwakili oleh NURBS (Spline dasar rasional tidak seragam), Kurva NURBS ditentukan oleh[`Order`](./order/) , satu set tertimbang[`ControlPoints`](../geometry/controlpoints/) dan a[`KnotVectors`](./knotvectors/) Komponen w pada control point digunakan sebagai bobot control point, apapun itu aTwoDimensional atauThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [NurbsCurve](nurbscurve/#constructor)() | Menginisialisasi instance baru dari`NurbsCurve` kelas. |
| [NurbsCurve](nurbscurve/#constructor_1)(string) | Menginisialisasi instance baru dari`NurbsCurve` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color/) { get; set; } | Mendapat atau mengatur warna garis, nilai default adalah putih(1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints/) { get; } | Mendapat semua poin kontrol |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype/) { get; set; } | Mendapat atau menyetel jenis kurva. |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension/) { get; set; } | Mendapat atau mengatur dimensi kurva. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Mendapat atau menyetel apakah akan mengecualikan entitas ini selama mengekspor. |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors/) { get; } | Mendapat simpul vektor, itu adalah urutan nilai parameter yang menentukan di mana dan bagaimana titik kontrol mempengaruhi kurva NURBS. |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity/) { get; } | Mendapat multiplisitas. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [Order](../../aspose.threed.entities/nurbscurve/order/) { get; set; } | Mendapat atau menetapkan urutan kurva NURBS, ini menentukan jumlah titik kontrol terdekat yang memengaruhi titik mana pun pada kurva. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Mendapat atau menyetel simpul induk pertama, jika menyetel simpul induk pertama, entitas ini akan terlepas dari simpul induk lainnya. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Mendapat semua simpul induk, entitas dapat dilampirkan ke beberapa simpul induk untuk pembuatan geometri |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [Rational](../../aspose.threed.entities/nurbscurve/rational/) { get; set; } | Mendapat atau menetapkan apakah itu rasional, nilai ini menunjukkan apakah ini`NurbsCurve` apakah spline rasional atau spline non-rasional. B-spline non-rasional adalah kasus khusus dari spline-B rasional. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate/)(int) | Evaluasi kurva NURBS |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat/)(double) | Mengevaluasi titik kurva pada posisi tertentu |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Menemukan properti. Ini bisa berupa properti dinamis (Dibuat oleh CreateDynamicProperty/SetProperty) atau properti asli (Diidentifikasi dengan namanya) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Mendapat kotak pembatas entitas saat ini dalam sistem koordinat ruang objeknya. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey/)() | Mendapat kunci dari perender entitas yang terdaftar di perender |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Dapatkan nilai properti yang ditentukan |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Menghapus properti dinamis. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Hapus properti yang ditentukan yang diidentifikasi dengan name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Menetapkan nilai properti yang ditentukan |

### Lihat juga

* class [Curve](../curve/)
* ruang nama [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
