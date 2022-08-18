---
title: PointCloud
second_title: Aspose.3D for .NET API Referansı
description: Nokta bulutu topoloji bilgisi içermez sadece kontrol noktaları ve tepe elemanları içerir.
type: docs
weight: 540
url: /tr/net/aspose.threed.entities/pointcloud/
---
## PointCloud class

Nokta bulutu topoloji bilgisi içermez, sadece kontrol noktaları ve tepe elemanları içerir.

```csharp
public class PointCloud : Geometry
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [PointCloud](pointcloud#constructor)() | Oluşturucusu[`PointCloud`](../pointcloud) |
| [PointCloud](pointcloud#constructor_1)(string) | Oluşturucusu[`PointCloud`](../pointcloud) |

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
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Tüm köşe öğelerini alır |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Geometrinin görünür olup olmadığını alır veya ayarlar |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [FromGeometry](../../aspose.threed.entities/pointcloud/fromgeometry#fromgeometry)(Geometry) | Bir geometri nesnesinden yeni bir PointCloud örneği oluşturun |
| static [FromGeometry](../../aspose.threed.entities/pointcloud/fromgeometry#fromgeometry_1)(Geometry, int) | Bir geometri nesnesinden yeni bir nokta bulutu örneği oluşturun. Yoğunluk, birim üçgen başına nokta sayısıdır(Birim üçgen, ağdan maksimum yüzey alanına sahip üçgendir) |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Mevcut geometriye mevcut bir tepe elemanı ekler |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Belirtilen türde bir köşe öğesi oluşturur ve onu geometriye ekler. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Belirtilen türde bir köşe öğesi oluşturur ve onu geometriye ekler. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Bir[`VertexElementUV`](../vertexelementuv) verilen doku eşleme türüyle. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Bir[`VertexElementUV`](../vertexelementuv) verilen doku eşleme türüyle. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Özelliği bulur. Dinamik bir özellik olabilir (CreateDynamicProperty/SetProperty tarafından oluşturulmuştur) veya yerel özellik (adıyla tanımlanır) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Nesne uzayı koordinat sisteminde geçerli varlığın sınırlayıcı kutusunu alır. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Belirtilen type ile bir köşe öğesi alır |
| override [GetEntityRendererKey](../../aspose.threed.entities/pointcloud/getentityrendererkey)() | Oluşturucuda kayıtlı varlık oluşturucunun anahtarını alır |
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
