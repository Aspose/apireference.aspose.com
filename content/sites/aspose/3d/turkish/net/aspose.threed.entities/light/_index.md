---
title: Light
second_title: Aspose.3D for .NET API Referansı
description: Işık sahneyi aydınlatıyor.
type: docs
weight: 400
url: /tr/net/aspose.threed.entities/light/
---
## Light class

Işık sahneyi aydınlatıyor.

Işığın toplam zayıflamasını hesaplama formülü: `A = SabitAtenüasyon + (Dist * LinearAtenuation) + ((Dist^2) * QuadraticAtenuation)`

```csharp
public class Light : Frustum
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Light](light#constructor)() | Yeni bir örneğini başlatır[`Light`](../light) sınıf. |
| [Light](light#constructor_1)(string) | Yeni bir örneğini başlatır[`Light`](../light) sınıf. |
| [Light](light#constructor_2)(string, LightType) | Yeni bir örneğini başlatır[`Light`](../light) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | frustum öğesinin en boy oranını alır veya ayarlar |
| [CastLight](../../aspose.threed.entities/light/castlight) { get; set; } | Geçerli ışık örneğinin diğer nesneleri aydınlatıp aydınlatamayacağını alır veya ayarlar. |
| [CastShadows](../../aspose.threed.entities/light/castshadows) { get; set; } | Işığın diğer nesneler üzerinde gölge oluşturup oluşturmayacağını alır veya ayarlar. |
| [Color](../../aspose.threed.entities/light/color) { get; set; } | Işığın rengini alır veya ayarlar |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation) { get; set; } | light toplam zayıflamasını hesaplamak için sabit zayıflamayı alır veya ayarlar |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Kameranın baktığı yönü alır veya ayarlar. Bu özellikteki değişiklikler aynı zamanda[`LookAt`](../frustum/lookat) ve[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Dışa aktarma sırasında bu varlığın hariç tutulup tutulmayacağını alır veya ayarlar. |
| [Falloff](../../aspose.threed.entities/light/falloff) { get; set; } | Düşme konisi açısını (derece olarak) alır veya ayarlar. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Frustumun uzak düzlem mesafesini alır veya ayarlar. |
| [HotSpot](../../aspose.threed.entities/light/hotspot) { get; set; } | Sıcak nokta koni açısını (derece olarak) alır veya ayarlar. |
| [Intensity](../../aspose.threed.entities/light/intensity) { get; set; } | Işığın yoğunluğunu alır veya ayarlar, varsayılan değer 100 |
| [LightType](../../aspose.threed.entities/light/lighttype) { get; set; } | Işığın türünü alır veya ayarlar |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation) { get; set; } | Light 'nin toplam zayıflamasını hesaplamak için doğrusal zayıflamayı alır veya ayarlar |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Kameranın baktığı ilgili konumu alır veya ayarlar. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Adı alır veya ayarlar. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Frustumun yakın düzlem mesafesini alır veya ayarlar. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Ortografik projeksiyonda kesildiğinde yüksekliği alır veya ayarlar. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | İlk üst düğümü alır veya ayarlar, eğer ilk üst düğüm ayarlanırsa bu varlık diğer üst düğümlerden ayrılır. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Tüm üst düğümleri alır, bir varlık geometri örneği için birden çok üst düğüme eklenebilir |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Tüm özelliklerin koleksiyonunu alır. |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation) { get; set; } | Light 'nin toplam zayıflamasını hesaplamak için ikinci dereceden zayıflamayı alır veya ayarlar |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Frustum'un oryantasyonunu alır veya ayarlar mode Bu özellik yalnızca,[`Target`](../frustum/target) null. Değer iseFixedTarget , yön her zaman özellik tarafından hesaplanır[`LookAt`](../frustum/lookat) Aksi takdirde[`LookAt`](../frustum/lookat)her zaman tarafından hesaplanır[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Bu nesnenin ait olduğu sahneyi alır |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor) { get; set; } | Gölgenin rengini alır veya ayarlar. |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Kameranın baktığı hedefi alır veya ayarlar. Kullanıcı bu özelliği destekliyorsa, önce olmalıdır.[`LookAt`](../frustum/lookat) özellik. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | camera yukarı yönünü alır veya ayarlar |

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

### Ayrıca bakınız

* class [Frustum](../frustum)
* ad alanı [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
