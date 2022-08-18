---
title: Cylinder
second_title: Aspose.3D for .NET API Referansı
description: Parametreli Silindir. Ayrıca radiusTop/radiusBottomdan biri sıfır olduğunda koniyi temsil etmek için kullanılabilir.
type: docs
weight: 310
url: /tr/net/aspose.threed.entities/cylinder/
---
## Cylinder class

Parametreli Silindir. Ayrıca radiusTop/radiusBottom'dan biri sıfır olduğunda koniyi temsil etmek için kullanılabilir.

```csharp
public class Cylinder : Primitive
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Cylinder](cylinder#constructor)() | Yeni bir örneğini başlatır[`Cylinder`](../cylinder) sınıf. |
| [Cylinder](cylinder#constructor_1)(double, double) | Yeni bir örneğini başlatır[`Cylinder`](../cylinder) sınıf. |
| [Cylinder](cylinder#constructor_2)(double, double, double) | Yeni bir örneğini başlatır[`Cylinder`](../cylinder) sınıf. |
| [Cylinder](cylinder#constructor_3)(double, double, double, int, int, bool) | Yeni bir örneğini başlatır[`Cylinder`](../cylinder) sınıf. |
| [Cylinder](cylinder#constructor_4)(string, double, double, double, int, int, bool, double, double) | Yeni bir örneğini başlatır[`Cylinder`](../cylinder) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows) { get; set; } | Bu geometrinin shadow oluşturup oluşturamayacağını alır veya ayarlar |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Dışa aktarma sırasında bu varlığın hariç tutulup tutulmayacağını alır veya ayarlar. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder) { get; set; } | ThetaLength 2*PI'den az olduğunda fan tarzı silindirin oluşturulup oluşturulmayacağını alır veya ayarlar, aksi takdirde model kesilmeyecektir. |
| [Height](../../aspose.threed.entities/cylinder/height) { get; set; } | Silindirin yüksekliğini alır veya ayarlar. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments) { get; set; } | Yükseklik segmentlerini alır veya ayarlar. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Adı alır veya ayarlar. |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom) { get; set; } | Alt tarafın tepe noktası dönüştürme ofsetini alır veya ayarlar. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop) { get; set; } | Üst tarafın tepe noktası dönüştürme ofsetini alır veya ayarlar. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended) { get; set; } | Bunun olup olmadığını gösteren bir değer alır veya ayarlar.[`Cylinder`](../cylinder) açık uçlu. Varsayılan değer false'tur. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | İlk üst düğümü alır veya ayarlar, eğer ilk üst düğüm ayarlanırsa bu varlık diğer üst düğümlerden ayrılır. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Tüm üst düğümleri alır, bir varlık geometri örneği için birden çok üst düğüme eklenebilir |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Tüm özelliklerin koleksiyonunu alır. |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments) { get; set; } | Radyal segmentleri alır veya ayarlar. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom) { get; set; } | Silindirin alt kapağının yarıçapını alır veya ayarlar. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop) { get; set; } | Silindirin üst kapağının yarıçapını alır veya ayarlar. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows) { get; set; } | Bu geometrinin gölge alıp alamayacağını alır veya ayarlar. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Bu nesnenin ait olduğu sahneyi alır |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom) { get; set; } | Alt tarafın kesme dönüşümünü alır veya ayarlar, vektör radyan cinsinden ölçülen (x ekseni, z ekseni) kesme değerini saklar, varsayılan değer (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop) { get; set; } | Üst tarafın kesme dönüşümünü alır veya ayarlar, vektör radyan cinsinden ölçülen (x ekseni, z ekseni) kesme değerini saklar, varsayılan değer (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength) { get; set; } | Teta'nın uzunluğunu alır veya ayarlar. Varsayılan değer 2π'dir. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart) { get; set; } | Teta başlangıcını alır veya ayarlar. Varsayılan değer 0. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Özelliği bulur. Dinamik bir özellik olabilir (CreateDynamicProperty/SetProperty tarafından oluşturulmuştur) veya yerel özellik (adıyla tanımlanır) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Nesne uzayı koordinat sisteminde geçerli varlığın sınırlayıcı kutusunu alır. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Oluşturucuda kayıtlı varlık oluşturucunun anahtarını alır |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Belirtilen özelliğin değerini alın |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Dinamik bir özelliği kaldırır. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | name ile tanımlanan belirtilen özelliği kaldırın |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Belirtilen özelliğin değerini ayarlar |
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh)() | Geçerli nesneyi mesh biçimine dönüştürün |

### Ayrıca bakınız

* class [Primitive](../primitive)
* ad alanı [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
