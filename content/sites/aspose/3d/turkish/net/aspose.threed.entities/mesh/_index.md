---
title: Mesh
second_title: Aspose.3D for .NET API Referansı
description: Bir ağ birçok n kenarlı çokgenden oluşur.
type: docs
weight: 450
url: /tr/net/aspose.threed.entities/mesh/
---
## Mesh class

Bir ağ, birçok n kenarlı çokgenden oluşur.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Mesh](mesh#constructor)() | Yeni bir örneğini başlatır[`Mesh`](../mesh) sınıf. |
| [Mesh](mesh#constructor_1)(Bitmap) | Belirtilen yükseklik haritasını kullanarak bir ağ oluşturun, yükseklik haritasının piksel formatı birden fazla bileşen içeriyorsa, ilk (genellikle kırmızı) bileşen yükseklik değeri(z) olarak kullanılacaktır Kontrol noktasının x ve y bileşenleri normalleştirilmiş piksel koordinatlarıdır . |
| [Mesh](mesh#constructor_4)(string) | Yeni bir örneğini başlatır[`Mesh`](../mesh) sınıf. |
| [Mesh](mesh#constructor_2)(Bitmap, Matrix4) | Belirtilen yükseklik haritasını kullanarak bir ağ oluşturun, yükseklik haritasının piksel formatı birden fazla bileşen içeriyorsa, ilk (genellikle kırmızı) bileşen yükseklik değeri(z) olarak kullanılacaktır Kontrol noktasının x ve y bileşenleri normalleştirilmiş piksel koordinatlarıdır . |
| [Mesh](mesh#constructor_3)(Bitmap, bool, Matrix4) | Belirtilen yükseklik haritasını kullanarak bir ağ oluşturun, yükseklik haritasının piksel formatı birden fazla bileşen içeriyorsa, ilk (genellikle kırmızı) bileşen yükseklik değeri(z) olarak kullanılacaktır Kontrol noktasının x ve y bileşenleri normalleştirilmiş piksel koordinatlarıdır . |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Bu geometrinin shadow oluşturup oluşturamayacağını alır veya ayarlar |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Tüm kontrol noktalarını alır |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Bu geometriyle ilişkili tüm deforme edicileri alır. |
| [Edges](../../aspose.threed.entities/mesh/edges) { get; } | Mesh'in kenarlarını alır. Kenar ağda isteğe bağlıdır, bu nedenle boş olabilir. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Dışa aktarma sırasında bu varlığın hariç tutulup tutulmayacağını alır veya ayarlar. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Adı alır veya ayarlar. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | İlk üst düğümü alır veya ayarlar, eğer ilk üst düğüm ayarlanırsa bu varlık diğer üst düğümlerden ayrılır. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Tüm üst düğümleri alır, bir varlık geometri örneği için birden çok üst düğüme eklenebilir |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount) { get; } | Çokgenlerin sayısını alır |
| [Polygons](../../aspose.threed.entities/mesh/polygons) { get; } | ağının çokgen tanımını alır |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Tüm özelliklerin koleksiyonunu alır. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Bu geometrinin gölge alıp alamayacağını alır veya ayarlar. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Bu nesnenin ait olduğu sahneyi alır |
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
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_2)(int[]) | içinde tanımlanan tüm köşeleri olan yeni bir çokgen oluşturur.*indices* . Tepe noktasına göre çokgen tepe noktası oluşturmak için lütfen şunu kullanın:[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon)(int, int, int) | 3 köşeli bir çokgen oluşturun(üçgen) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_3)(int[], int, int) | içinde tanımlanan tüm köşeleri olan yeni bir çokgen oluşturur.*indices* . Tepe noktasına göre çokgen tepe noktası oluşturmak için lütfen şunu kullanın:[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_1)(int, int, int, int) | 4 köşeli (dörtlü) bir çokgen oluşturun |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Özelliği bulur. Dinamik bir özellik olabilir (CreateDynamicProperty/SetProperty tarafından oluşturulmuştur) veya yerel özellik (adıyla tanımlanır) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Nesne uzayı koordinat sisteminde geçerli varlığın sınırlayıcı kutusunu alır. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Belirtilen type ile bir köşe öğesi alır |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Oluşturucuda kayıtlı varlık oluşturucunun anahtarını alır |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator)() | Her iç çokgen için numaralandırıcıyı alır. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize)(int) | Belirtilen poligonun tepe noktası sayısını alır. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Belirtilen özelliğin değerini alın |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | [`VertexElementUV`](../vertexelementuv) verilen doku eşleme type ile örnek |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Dinamik bir özelliği kaldırır. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | name ile tanımlanan belirtilen özelliği kaldırın |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Belirtilen özelliğin değerini ayarlar |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh)() | Geçerli varlıktan Mesh örneğini alır. |

### Örnekler

Ağa çokgen eklemek için: Kafesteki tüm çokgenler arasında gezin:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    // çokgenle ilgilen
}
```

### Ayrıca bakınız

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* ad alanı [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
