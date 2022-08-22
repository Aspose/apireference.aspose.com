---
title: TriMesh
second_title: Aspose.3D for .NET API Referansı
description: TriMesh GPU tarafından doğrudan kullanılabilecek ham verileri içerir. Bu sınıf yalnızca köşe başına verileri içeren bir ağ oluşturmaya yardımcı olan bir yardımcı programdır.
type: docs
weight: 730
url: /tr/net/aspose.threed.entities/trimesh/
---
## TriMesh class

TriMesh, GPU tarafından doğrudan kullanılabilecek ham verileri içerir. Bu sınıf, yalnızca köşe başına verileri içeren bir ağ oluşturmaya yardımcı olan bir yardımcı programdır.

```csharp
public class TriMesh : Entity, IEnumerable<Vertex>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [TriMesh](trimesh)(string, VertexDeclaration) | Bir örneğini başlat[`TriMesh`](../trimesh) |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity) { get; } | Önceden tahsis edilmiş tepe noktalarının kapasitesi. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Dışa aktarma sırasında bu varlığın hariç tutulup tutulmayacağını alır veya ayarlar. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount) { get; } | Buradaki indeks sayısı[`TriMesh`](../trimesh) |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Adı alır veya ayarlar. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | İlk üst düğümü alır veya ayarlar, eğer ilk üst düğüm ayarlanırsa bu varlık diğer üst düğümlerden ayrılır. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Tüm üst düğümleri alır, bir varlık geometri örneği için birden çok üst düğüme eklenebilir |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Tüm özelliklerin koleksiyonunu alır. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Bu nesnenin ait olduğu sahneyi alır |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount) { get; } | Tarafından geçen birleştirilmemiş köşelerin sayısı[`BeginVertex`](./beginvertex) ve[`EndVertex`](./endvertex) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration) { get; } | [`TriMesh`](../trimesh) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount) { get; } | Buradaki köşe sayısı[`TriMesh`](../trimesh) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes) { get; } | bytes cinsinden tüm tepe noktalarının toplam boyutu |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [CopyFrom](../../aspose.threed.entities/trimesh/copyfrom)(TriMesh, VertexDeclaration) | [`TriMesh`](../trimesh)yeni köşe düzeni ile girişten |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh#frommesh)(Mesh, bool) | Verilen ağ nesnesinden bir TriMesh oluşturun, köşe bildirimi giriş ağının yapısını temel alır. |
| static [FromMesh](../../aspose.threed.entities/trimesh/frommesh#frommesh_1)(VertexDeclaration, Mesh) | Verilen köşe düzeniyle verilen mesh nesnesinden bir TriMesh oluşturun. |
| static [FromRawData](../../aspose.threed.entities/trimesh/fromrawdata)(VertexDeclaration, byte[], int[], bool) | Ham verilerden TriMesh oluşturun |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex)() | vertex eklemeye başlayın |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex)() | vertex eklemeyi sonlandır |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Özelliği bulur. Dinamik bir özellik olabilir (CreateDynamicProperty/SetProperty tarafından oluşturulmuştur) veya yerel özellik (adıyla tanımlanır) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Nesne uzayı koordinat sisteminde geçerli varlığın sınırlayıcı kutusunu alır. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Oluşturucuda kayıtlı varlık oluşturucunun anahtarını alır |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator)() | Numaralandırılacak numaralandırıcıyı alın[`Vertex`](../../aspose.threed.utilities/vertex) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Belirtilen özelliğin değerini alın |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray#indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray#indicestoarray_1)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes)(byte[]) | Köşeleri baytlardan yükleyin, baytların uzunluğu köşe boyutunun tam sayı katı olmalıdır. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble)(int, VertexField) | Çift alanı okuyun |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat)(int, VertexField) | Kayan nokta alanını okuyun |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2)(int, VertexField) | vector2 alanını okuyun |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3)(int, VertexField) | vector3 alanını okuyun |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4)(int, VertexField) | vector4 alanını okuyun |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2)(int, VertexField) | vector2 alanını okuyun |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3)(int, VertexField) | vector3 alanını okuyun |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4)(int, VertexField) | vector4 alanını okuyun |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Dinamik bir özelliği kaldırır. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | name ile tanımlanan belirtilen özelliği kaldırın |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Belirtilen özelliğin değerini ayarlar |
| override [ToString](../../aspose.threed.entities/trimesh/tostring)() | Şunun dize temsilini alır[`TriMesh`](../trimesh) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray)() | Köşe verilerini bayt dizisine dönüştürün |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto)(Stream) | Dizin verilerini akış 'ye 16 bit tam sayı olarak yazın |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto)(Stream) | Dizin verilerini 32 bit tam sayı olarak stream öğesine yazın |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto)(Stream) | Belirtilen akışa tepe noktası verilerini yaz |

### Ayrıca bakınız

* class [Entity](../../aspose.threed/entity)
* class [Vertex](../../aspose.threed.utilities/vertex)
* ad alanı [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
