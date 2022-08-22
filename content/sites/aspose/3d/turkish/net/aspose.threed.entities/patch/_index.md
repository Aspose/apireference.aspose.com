---
title: Patch
second_title: Aspose.3D for .NET API Referansı
description: APatch./patch benzer bir parametrik modelleme yüzeyidir.NurbsSurface./nurbssurface  ayrıca iki ile tanımlanırPatchDirection./patchdirection U./patch/u veV./patch/v . Ama aradaki farkPatch./patch veNurbsSurface./nurbssurface bu muPatchDirection./patchdirection eğrisi şunlardan biri olabilirBezier QuadraticBezier BasisSpline CardinalSpline veLinear
type: docs
weight: 500
url: /tr/net/aspose.threed.entities/patch/
---
## Patch class

A[`Patch`](../patch) benzer bir parametrik modelleme yüzeyidir.[`NurbsSurface`](../nurbssurface) , ayrıca iki ile tanımlanır[`PatchDirection`](../patchdirection) ,[`U`](./u) ve[`V`](./v) . Ama aradaki fark[`Patch`](../patch) ve[`NurbsSurface`](../nurbssurface) bu mu[`PatchDirection`](../patchdirection) eğrisi şunlardan biri olabilirBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline veLinear

```csharp
public class Patch : Geometry
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Patch](patch#constructor)() | Yeni bir örneğini başlatır[`Patch`](../patch) sınıf. |
| [Patch](patch#constructor_1)(string) | Yeni bir örneğini başlatır[`Patch`](../patch) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Bu geometrinin shadow oluşturup oluşturamayacağını alır veya ayarlar |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Tüm kontrol noktalarını alır |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Bu geometriyle ilişkili tüm deforme edicileri alır. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Dışa aktarma sırasında bu varlığın hariç tutulup tutulmayacağını alır veya ayarlar. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Adı alır veya ayarlar. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | İlk üst düğümü alır veya ayarlar, eğer ilk üst düğüm ayarlanırsa bu varlık diğer üst düğümlerden ayrılır. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Tüm üst düğümleri alır, bir varlık geometri örneği için birden çok üst düğüme eklenebilir |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Tüm özelliklerin koleksiyonunu alır. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Bu geometrinin gölge alıp alamayacağını alır veya ayarlar. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Bu nesnenin ait olduğu sahneyi alır |
| [U](../../aspose.threed.entities/patch/u) { get; } | u yönünü alır. |
| [V](../../aspose.threed.entities/patch/v) { get; } | v yönünü alır. |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Tüm köşe öğelerini alır |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Geometrinin görünür olup olmadığını alır veya ayarlar |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Mevcut geometriye mevcut bir tepe elemanı ekler |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Belirtilen türde bir köşe öğesi oluşturur ve onu geometriye ekler. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Belirtilen türde bir köşe öğesi oluşturur ve onu geometriye ekler. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Bir[`VertexElementUV`](../vertexelementuv) verilen doku eşleme türüyle. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Bir[`VertexElementUV`](../vertexelementuv) verilen doku eşleme türüyle. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Özelliği bulur. Dinamik bir özellik olabilir (CreateDynamicProperty/SetProperty tarafından oluşturulmuştur) veya yerel özellik (adıyla tanımlanır) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Nesne uzayı koordinat sisteminde geçerli varlığın sınırlayıcı kutusunu alır. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Belirtilen type ile bir köşe öğesi alır |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Oluşturucuda kayıtlı varlık oluşturucunun anahtarını alır |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Belirtilen özelliğin değerini alın |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | [`VertexElementUV`](../vertexelementuv) verilen doku eşleme type ile örnek |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Dinamik bir özelliği kaldırır. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | name ile tanımlanan belirtilen özelliği kaldırın |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Belirtilen özelliğin değerini ayarlar |

### Ayrıca bakınız

* class [Geometry](../geometry)
* ad alanı [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
