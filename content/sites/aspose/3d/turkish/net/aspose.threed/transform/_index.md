---
title: Transform
second_title: Aspose.3D for .NET API Referansı
description: Bir dönüşüm nesnenin çevirme/ölçekleme/dönüşüme veya dönüşüm matrisine minimum maliyetle erişime izin veren bilgileri içerir Bu yerel dönüşüm tarafından kullanılır.
type: docs
weight: 2400
url: /tr/net/aspose.threed/transform/
---
## Transform class

Bir dönüşüm, nesnenin çevirme/ölçekleme/dönüşüme veya dönüşüm matrisine minimum maliyetle erişime izin veren bilgileri içerir Bu, yerel dönüşüm tarafından kullanılır.

```csharp
public class Transform : A3DObject
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [EulerAngles](../../aspose.threed/transform/eulerangles) { get; set; } | Derece cinsinden ölçülen, Euler açılarında temsil edilen dönüşü alır veya ayarlar |
| [GeometricRotation](../../aspose.threed/transform/geometricrotation) { get; set; } | Geometrik Euler dönüşünü alır veya ayarlar (derece olarak ölçülür). Geometrik dönüşüm yalnızca eklenen varlıkları etkiler ve alt düğümleri etkilenmeden bırakır. Geometrik dönüşümü desteklemeyen dosya türlerine aktardığınızda yerel dönüşüm olarak birleştirilir. |
| [GeometricScaling](../../aspose.threed/transform/geometricscaling) { get; set; } | Geometrik ölçeklendirmeyi alır veya ayarlar. Geometrik dönüşüm yalnızca eklenen varlıkları etkiler ve alt düğümleri etkilenmeden bırakır. Geometrik dönüşümü desteklemeyen dosya türlerine aktardığınızda yerel dönüşüm olarak birleştirilir. |
| [GeometricTranslation](../../aspose.threed/transform/geometrictranslation) { get; set; } | Geometrik çeviriyi alır veya ayarlar. Geometrik dönüşüm yalnızca eklenen varlıkları etkiler ve alt düğümleri etkilenmeden bırakır. Geometrik dönüşümü desteklemeyen dosya türlerine aktardığınızda yerel dönüşüm olarak birleştirilir. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Adı alır veya ayarlar. |
| [PostRotation](../../aspose.threed/transform/postrotation) { get; set; } | Derece ile temsil edilen döndürme sonrası değerini alır veya ayarlar |
| [PreRotation](../../aspose.threed/transform/prerotation) { get; set; } | Derece cinsinden temsil edilen ön dönüşü alır veya ayarlar |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Tüm özelliklerin koleksiyonunu alır. |
| [Rotation](../../aspose.threed/transform/rotation) { get; set; } | Dörtlüde temsil edilen dönüşü alır veya ayarlar. |
| [Scale](../../aspose.threed/transform/scale) { get; set; } | Ölçeği alır veya ayarlar |
| [TransformMatrix](../../aspose.threed/transform/transformmatrix) { get; set; } | Dönüştürme matrisini alır veya ayarlar. |
| [Translation](../../aspose.threed/transform/translation) { get; set; } | Çeviriyi alır veya ayarlar |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Özelliği bulur. Dinamik bir özellik olabilir (CreateDynamicProperty/SetProperty tarafından oluşturulmuştur) veya yerel özellik (adıyla tanımlanır) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Belirtilen özelliğin değerini alın |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Dinamik bir özelliği kaldırır. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | name ile tanımlanan belirtilen özelliği kaldırın |
| [SetEulerAngles](../../aspose.threed/transform/seteulerangles)(double, double, double) | Euler açılarını akım dönüşümünün derecesi olarak ayarlar. |
| [SetGeometricRotation](../../aspose.threed/transform/setgeometricrotation)(double, double, double) | Geometrik Euler dönüşünü ayarlar (derece olarak ölçülür). Geometrik dönüşüm yalnızca eklenen varlıkları etkiler ve alt düğümleri etkilenmeden bırakır. Geometrik dönüşümü desteklemeyen dosya türlerine aktardığınızda yerel dönüşüm olarak birleştirilir. |
| [SetGeometricScaling](../../aspose.threed/transform/setgeometricscaling)(double, double, double) | Geometrik ölçeklendirmeyi ayarlar. Geometrik dönüşüm yalnızca eklenen varlıkları etkiler ve alt düğümleri etkilenmeden bırakır. Geometrik dönüşümü desteklemeyen dosya türlerine aktardığınızda yerel dönüşüm olarak birleştirilir. |
| [SetGeometricTranslation](../../aspose.threed/transform/setgeometrictranslation)(double, double, double) | Geometrik ötelemeyi ayarlar. Geometrik dönüşüm yalnızca eklenen varlıkları etkiler ve alt düğümleri etkilenmeden bırakır. Geometrik dönüşümü desteklemeyen dosya türlerine aktardığınızda yerel dönüşüm olarak birleştirilir. |
| [SetPostRotation](../../aspose.threed/transform/setpostrotation)(double, double, double) | Derece cinsinden temsil edilen dönüş sonrası değeri ayarlar |
| [SetPreRotation](../../aspose.threed/transform/setprerotation)(double, double, double) | Derece cinsinden temsil edilen ön dönüşü ayarlar |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Belirtilen özelliğin değerini ayarlar |
| [SetRotation](../../aspose.threed/transform/setrotation)(double, double, double, double) | Akım dönüşümünün dönüşünü (dörtlü bileşenler olarak) ayarlar. |
| [SetScale](../../aspose.threed/transform/setscale)(double, double, double) | Akım dönüşümünün ölçeğini ayarlar. |
| [SetTranslation](../../aspose.threed/transform/settranslation)(double, double, double) | Geçerli dönüşümün çevirisini ayarlar. |

### Ayrıca bakınız

* class [A3DObject](../a3dobject)
* ad alanı [Aspose.ThreeD](../../aspose.threed)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
