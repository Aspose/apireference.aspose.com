---
title: Scene
second_title: Aspose.3D for .NET API Referansı
description: Sahne düğümleri geometrileri malzemeleri dokuları animasyonu pozları alt sahneleri vb. içeren üst düzey bir nesnedir. Sahnenin alt sahneleri olabilir collada/blender gibi dosyalarda çoklu belge desteği görevi görür /fbx Düğüm hiyerarşisine şuradan erişilebilirRootNode./scene/rootnodeLibrary./scene/library serileştirme sırasında meta veriler veya özel nesneler gibi eklenmemiş nesnelerin referansını tutmak için kullanılır böylece bir kitaplık olarak kullanılabilir.
type: docs
weight: 2250
url: /tr/net/aspose.threed/scene/
---
## Scene class

Sahne, düğümleri, geometrileri, malzemeleri, dokuları, animasyonu, pozları, alt sahneleri vb. içeren üst düzey bir nesnedir. Sahnenin alt sahneleri olabilir, collada/blender gibi dosyalarda çoklu belge desteği görevi görür /fbx Düğüm hiyerarşisine şuradan erişilebilir:[`RootNode`](./rootnode)[`Library`](./library) serileştirme sırasında (meta veriler veya özel nesneler gibi) eklenmemiş nesnelerin referansını tutmak için kullanılır, böylece bir kitaplık olarak kullanılabilir.

```csharp
public class Scene : SceneObject
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Scene](scene#constructor)() | Yeni bir örneğini başlatır[`Scene`](../scene) sınıf. |
| [Scene](scene#constructor_1)(Entity) | Yeni bir örneğini başlatır[`Scene`](../scene) yeni bir düğüme bağlı bir varlık bulunan sınıf. |
| [Scene](scene#constructor_2)(Scene, string) | Yeni bir örneğini başlatır[`Scene`](../scene)alt sahne olarak sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips) { get; } | Hepsini alır[`AnimationClip`](../../aspose.threed.animation/animationclip) sahnede tanımlanmış. |
| [AssetInfo](../../aspose.threed/scene/assetinfo) { get; set; } | En üst düzey varlık bilgilerini alır veya ayarlar |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip) { get; set; } | Etkin olanı alır veya ayarlar[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](../../aspose.threed/scene/library) { get; } | Sahne hiyerarşisinde doğrudan kullanılmayan nesneler Kitaplık'ta tanımlanabilir. Bu, alt sahneler kullandığınızda ve yeniden kullanılabilir bileşenleri alt sahnelerin altına koyduğunuzda kullanışlıdır. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Adı alır veya ayarlar. |
| [Poses](../../aspose.threed/scene/poses) { get; } | Hepsini alır[`Pose`](../pose) bu sahnede kullanıldı. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Tüm özelliklerin koleksiyonunu alır. |
| [RootNode](../../aspose.threed/scene/rootnode) { get; } | Sahnenin kök düğümünü alır. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Bu nesnenin ait olduğu sahneyi alır |
| [SubScenes](../../aspose.threed/scene/subscenes) { get; } | Tüm alt sahneleri alır |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile)(string) | Verilen yoldan sahneyi açar |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_3)(string, CancellationToken) | Verilen yoldan sahneyi açar |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_1)(string, FileFormat, CancellationToken) | Belirtilen dosya biçimini kullanarak sahneyi verilen yoldan açar. |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_2)(string, LoadOptions, CancellationToken) | Belirtilen dosya biçimini kullanarak sahneyi verilen yoldan açar. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_2)(Stream, CancellationToken) | Verilen akıştan sahneyi açar |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream)(Stream, FileFormat, CancellationToken) | Belirtilen dosya biçimini kullanarak verilen akıştan sahneyi açar. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_1)(Stream, LoadOptions, CancellationToken) | Belirtilen IO yapılandırmasını kullanarak sahneyi verilen akıştan açar. |
| [Clear](../../aspose.threed/scene/clear)() | Sahne içeriğini temizler ve varsayılan ayarları geri yükler. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip)(string) | Oluşturmak ve kaydetmek için bir steno işlevi[`AnimationClip`](../../aspose.threed.animation/animationclip) İlk[`AnimationClip`](../../aspose.threed.animation/animationclip) atanacak[`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Özelliği bulur. Dinamik bir özellik olabilir (CreateDynamicProperty/SetProperty tarafından oluşturulmuştur) veya yerel özellik (adıyla tanımlanır) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip)(string) | Bir adlandırılmış alır[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Belirtilen özelliğin değerini alın |
| [Open](../../aspose.threed/scene/open#open)(Stream) | Verilen akıştan sahneyi açar |
| [Open](../../aspose.threed/scene/open#open_4)(string) | Verilen yoldan sahneyi açar |
| [Open](../../aspose.threed/scene/open#open_3)(Stream, CancellationToken) | Verilen akıştan sahneyi açar |
| [Open](../../aspose.threed/scene/open#open_8)(string, CancellationToken) | Verilen yoldan sahneyi açar |
| [Open](../../aspose.threed/scene/open#open_6)(string, LoadOptions) | Belirtilen dosya biçimini kullanarak sahneyi verilen yoldan açar. |
| [Open](../../aspose.threed/scene/open#open_1)(Stream, FileFormat, CancellationToken) | Belirtilen dosya biçimini kullanarak verilen akıştan sahneyi açar. |
| [Open](../../aspose.threed/scene/open#open_2)(Stream, LoadOptions, CancellationToken) | Belirtilen IO yapılandırmasını kullanarak sahneyi verilen akıştan açar. |
| [Open](../../aspose.threed/scene/open#open_5)(string, FileFormat, CancellationToken) | Belirtilen dosya biçimini kullanarak sahneyi verilen yoldan açar. |
| [Open](../../aspose.threed/scene/open#open_7)(string, LoadOptions, CancellationToken) | Belirtilen dosya biçimini kullanarak sahneyi verilen yoldan açar. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Dinamik bir özelliği kaldırır. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | name ile tanımlanan belirtilen özelliği kaldırın |
| [Render](../../aspose.threed/scene/render#render)(Camera, Bitmap) | Sahneyi verilen kameranın perspektifinden bitmap haline getirin. |
| [Render](../../aspose.threed/scene/render#render_2)(Camera, string) | Sahneyi verilen kamera perspektifinden harici dosyaya dönüştürün. Varsayılan çıktı boyutu 1024x768 ve çıktı formatı png |
| [Render](../../aspose.threed/scene/render#render_1)(Camera, Bitmap, ImageRenderOptions) | Sahneyi verilen kameranın perspektifinden bitmap haline getirin. |
| [Render](../../aspose.threed/scene/render#render_3)(Camera, string, Size, ImageFormat) | Sahneyi verilen kameranın perspektifinden harici dosyaya dönüştürün. |
| [Render](../../aspose.threed/scene/render#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Sahneyi verilen kameranın perspektifinden harici dosyaya dönüştürün. |
| [Save](../../aspose.threed/scene/save#save_4)(string) | Belirtilen dosya biçimini kullanarak sahneyi belirtilen yola kaydeder. |
| [Save](../../aspose.threed/scene/save#save)(Stream, FileFormat) | Belirtilen dosya biçimini kullanarak sahneyi akışa kaydeder. |
| [Save](../../aspose.threed/scene/save#save_2)(Stream, SaveOptions) | Belirtilen dosya biçimini kullanarak sahneyi akışa kaydeder. |
| [Save](../../aspose.threed/scene/save#save_5)(string, FileFormat) | Belirtilen dosya biçimini kullanarak sahneyi belirtilen yola kaydeder. |
| [Save](../../aspose.threed/scene/save#save_7)(string, SaveOptions) | Belirtilen dosya biçimini kullanarak sahneyi belirtilen yola kaydeder. |
| [Save](../../aspose.threed/scene/save#save_1)(Stream, FileFormat, CancellationToken) | Belirtilen dosya biçimini kullanarak sahneyi akışa kaydeder. |
| [Save](../../aspose.threed/scene/save#save_3)(Stream, SaveOptions, CancellationToken) | Belirtilen dosya biçimini kullanarak sahneyi akışa kaydeder. |
| [Save](../../aspose.threed/scene/save#save_6)(string, FileFormat, CancellationToken) | Belirtilen dosya biçimini kullanarak sahneyi belirtilen yola kaydeder. |
| [Save](../../aspose.threed/scene/save#save_8)(string, SaveOptions, CancellationToken) | Belirtilen dosya biçimini kullanarak sahneyi belirtilen yola kaydeder. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Belirtilen özelliğin değerini ayarlar |

### Ayrıca bakınız

* class [SceneObject](../sceneobject)
* ad alanı [Aspose.ThreeD](../../aspose.threed)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
