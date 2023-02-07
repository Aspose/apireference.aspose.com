---
title: Transform
second_title: Aspose.3D untuk .NET API Referensi
description: Transform berisi informasi yang memungkinkan akses ke translasi/skala/rotasi objek atau matriks transformasi dengan biaya minimum Ini digunakan oleh transformasi lokal.
type: docs
weight: 2400
url: /id/net/aspose.threed/transform/
---
## Transform class

Transform berisi informasi yang memungkinkan akses ke translasi/skala/rotasi objek atau matriks transformasi dengan biaya minimum Ini digunakan oleh transformasi lokal.

```csharp
public class Transform : A3DObject
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles/) { get; set; } | Mendapatkan atau menyetel rotasi yang direpresentasikan dalam sudut Euler, diukur dalam derajat |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation/) { get; set; } | Mendapat atau mengatur rotasi Euler geometris (diukur dalam derajat). Transformasi geometris hanya memengaruhi entitas yang dilampirkan dan membiarkan node turunan tidak terpengaruh. Ini akan digabungkan sebagai transformasi lokal saat Anda mengekspor transformasi geometris ke jenis file yang tidak mendukungnya. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling/) { get; set; } | Mendapat atau mengatur skala geometris. Transformasi geometris hanya memengaruhi entitas yang dilampirkan dan membiarkan node turunan tidak terpengaruh. Ini akan digabungkan sebagai transformasi lokal saat Anda mengekspor transformasi geometris ke jenis file yang tidak mendukungnya. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation/) { get; set; } | Mendapat atau mengatur terjemahan geometris. Transformasi geometris hanya memengaruhi entitas yang dilampirkan dan membiarkan node turunan tidak terpengaruh. Ini akan digabungkan sebagai transformasi lokal saat Anda mengekspor transformasi geometris ke jenis file yang tidak mendukungnya. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [PostRotation](../../aspose.threed/transform/postrotation/) { get; set; } | Mendapat atau menyetel pasca-rotasi yang direpresentasikan dalam degree |
| [PreRotation](../../aspose.threed/transform/prerotation/) { get; set; } | Mendapat atau menyetel pra-rotasi yang direpresentasikan dalam degree |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [Rotation](../../aspose.threed/transform/rotation/) { get; set; } | Mendapat atau menyetel rotasi yang direpresentasikan dalam angka empat. |
| [Scale](../../aspose.threed/transform/scale/) { get; set; } | Mendapat atau menyetel skala |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix/) { get; set; } | Mendapat atau mengatur matriks transformasi. |
| [Translation](../../aspose.threed/transform/translation/) { get; set; } | Mendapat atau menyetel terjemahan |

## Metode

| Nama | Keterangan |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Menemukan properti. Ini bisa berupa properti dinamis (Dibuat oleh CreateDynamicProperty/SetProperty) atau properti asli (Diidentifikasi dengan namanya) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Dapatkan nilai properti yang ditentukan |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Menghapus properti dinamis. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Hapus properti yang ditentukan yang diidentifikasi dengan name |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles/)(double, double, double) | Mengatur sudut Euler dalam derajat transformasi saat ini. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation/)(double, double, double) | Mengatur rotasi Euler geometris (diukur dalam derajat). Transformasi geometris hanya memengaruhi entitas yang dilampirkan dan membiarkan node turunan tidak terpengaruh. Ini akan digabungkan sebagai transformasi lokal saat Anda mengekspor transformasi geometris ke jenis file yang tidak mendukungnya. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling/)(double, double, double) | Mengatur skala geometris. Transformasi geometris hanya memengaruhi entitas yang dilampirkan dan membiarkan node turunan tidak terpengaruh. Ini akan digabungkan sebagai transformasi lokal saat Anda mengekspor transformasi geometris ke jenis file yang tidak mendukungnya. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation/)(double, double, double) | Mengatur terjemahan geometris. Transformasi geometris hanya memengaruhi entitas yang dilampirkan dan membiarkan node turunan tidak terpengaruh. Ini akan digabungkan sebagai transformasi lokal saat Anda mengekspor transformasi geometris ke jenis file yang tidak mendukungnya. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation/)(double, double, double) | Mengatur post-rotation yang direpresentasikan dalam degree |
| [SetPreRotation](../../aspose.threed/transform/setprerotation/)(double, double, double) | Mengatur pra-rotasi yang direpresentasikan dalam degree |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Menetapkan nilai properti yang ditentukan |
| [SetRotation](../../aspose.threed/transform/setrotation/)(double, double, double, double) | Mengatur rotasi (sebagai komponen angka empat) dari transformasi saat ini. |
| [SetScale](../../aspose.threed/transform/setscale/)(double, double, double) | Mengatur skala transformasi saat ini. |
| [SetTranslation](../../aspose.threed/transform/settranslation/)(double, double, double) | Mengatur terjemahan dari transformasi saat ini. |

### Lihat juga

* class [A3DObject](../a3dobject/)
* ruang nama [Aspose.ThreeD](../../aspose.threed/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
