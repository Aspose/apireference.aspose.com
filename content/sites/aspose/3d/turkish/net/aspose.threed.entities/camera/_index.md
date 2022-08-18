---
title: Camera
second_title: Aspose.3D for .NET API Referansı
description: Kamera sahneye bakan izleyicinin bakış açısını tanımlar.
type: docs
weight: 250
url: /tr/net/aspose.threed.entities/camera/
---
## Camera class

Kamera, sahneye bakan izleyicinin bakış açısını tanımlar.

```csharp
public class Camera : Frustum
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Camera](camera#constructor)() | Yeni bir örneğini başlatır[`Camera`](../camera) sınıf. |
| [Camera](camera#constructor_1)(ProjectionType) | Yeni bir örneğini başlatır[`Camera`](../camera) sınıf. |
| [Camera](camera#constructor_2)(string) | Yeni bir örneğini başlatır[`Camera`](../camera) sınıf. |
| [Camera](camera#constructor_3)(string, ProjectionType) | Yeni bir örneğini başlatır[`Camera`](../camera) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode) { get; set; } | Kameranın diyafram modunu alır veya ayarlar |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | frustum öğesinin en boy oranını alır veya ayarlar |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio) { get; set; } | Görünüm düzlemi en boy oranını alır veya ayarlar. |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Kameranın baktığı yönü alır veya ayarlar. Bu özellikteki değişiklikler aynı zamanda[`LookAt`](../frustum/lookat) ve[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Dışa aktarma sırasında bu varlığın hariç tutulup tutulmayacağını alır veya ayarlar. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Frustumun uzak düzlem mesafesini alır veya ayarlar. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview) { get; set; } | Kameranın görüş alanını derece olarak alır veya ayarlar, bu özellik yalnızca ApertureModeHorizontal veyaVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx) { get; set; } | Kameranın yatay görüş alanını derece cinsinden alır veya ayarlar, bu özellik yalnızca ApertureModeHorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy) { get; set; } | Kameranın dikey görüş alanını derece cinsinden alır veya ayarlar, bu özellik yalnızca ApertureModeHorizAndVert |
| [Height](../../aspose.threed.entities/camera/height) { get; set; } | İnç cinsinden ölçülen görünüm düzleminin yüksekliğini alır veya ayarlar |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Kameranın baktığı ilgili konumu alır veya ayarlar. |
| [Magnification](../../aspose.threed.entities/camera/magnification) { get; set; } | Ortografik kamerada kullanılan büyütmeyi alır veya ayarlar |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Adı alır veya ayarlar. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Frustumun yakın düzlem mesafesini alır veya ayarlar. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Ortografik projeksiyonda kesildiğinde yüksekliği alır veya ayarlar. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | İlk üst düğümü alır veya ayarlar, eğer ilk üst düğüm ayarlanırsa bu varlık diğer üst düğümlerden ayrılır. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Tüm üst düğümleri alır, bir varlık geometri örneği için birden çok üst düğüme eklenebilir |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype) { get; set; } | Kameranın projeksiyon türünü alır veya ayarlar. Varsayılan olarak perspektif projeksiyon kullanılır. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Tüm özelliklerin koleksiyonunu alır. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Frustum'un oryantasyonunu alır veya ayarlar mode Bu özellik yalnızca,[`Target`](../frustum/target) null. Değer iseFixedTarget , yön her zaman özellik tarafından hesaplanır[`LookAt`](../frustum/lookat) Aksi takdirde[`LookAt`](../frustum/lookat)her zaman tarafından hesaplanır[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Bu nesnenin ait olduğu sahneyi alır |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Kameranın baktığı hedefi alır veya ayarlar. Kullanıcı bu özelliği destekliyorsa, önce olmalıdır.[`LookAt`](../frustum/lookat) özellik. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | camera yukarı yönünü alır veya ayarlar |
| [Width](../../aspose.threed.entities/camera/width) { get; set; } | İnç cinsinden ölçülen görünüm düzleminin genişliğini alır veya ayarlar |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Özelliği bulur. Dinamik bir özellik olabilir (CreateDynamicProperty/SetProperty tarafından oluşturulmuştur) veya yerel özellik (adıyla tanımlanır) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Nesne uzayı koordinat sisteminde geçerli varlığın sınırlayıcı kutusunu alır. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Oluşturucuda kayıtlı varlık oluşturucunun anahtarını alır |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Belirtilen özelliğin değerini alın |
| [MoveForward](../../aspose.threed.entities/camera/moveforward)(double) | Kamerayı yönüne veya hedefine doğru ilerletin. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Dinamik bir özelliği kaldırır. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | name ile tanımlanan belirtilen özelliği kaldırın |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Belirtilen özelliğin değerini ayarlar |

### Ayrıca bakınız

* class [Frustum](../frustum)
* ad alanı [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
