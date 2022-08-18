---
title: Node
second_title: Aspose.3D for .NET API Referansı
description: Sahne grafiğindeki bir öğeyi temsil eder. Sahne grafiği Düğüm nesnelerinin bir ağacıdır. Ağaç yönetim hizmetleri bu sınıfa dahildir. Aspose.3D SDKnın oluşturulmuş sahne grafiğinin geçerliliğini test etmediğini unutmayın. Bir düğüm hiyerarşisinde döngüsel grafikler oluşturmadığından emin olmak arayanın sorumluluğundadır. Ağaç yönetiminin yanı sıra bu sınıf nesnenin sahnedeki konumunu tanımlamak için gereken tüm özellikleri tanımlar. Bu bilgiler temel Çevirme Döndürme ve Ölçekleme özelliklerini ve pivotlar sınırlar ve rijitlik ve sönümleme gibi IK eklemleri için daha gelişmiş seçenekleri içerir. İlk oluşturulduğunda Düğüm nesnesi boştur yani yalnızca konum bilgisini içeren herhangi bir grafik temsili olmayan bir nesne. Bu durumda düğüm ağacı yapısındaki ebeveynleri temsil etmek için kullanılabilir ancak daha fazlası değil. Bu tür nesnelerin normal kullanımı onlara düğümü özelleştirecek bir varlık eklemektir Varlık konusuna bakın. Varlık kendi içinde bir nesnedir ve Düğüme bağlıdır. Bu aynı zamanda aynı varlığın birden çok düğüm arasında paylaşılabileceği anlamına gelir. Camera Light Mesh vb... tümü varlıklardır ve tümü Entity. temel sınıfından türetilmiştir.
type: docs
weight: 1470
url: /tr/net/aspose.threed/node/
---
## Node class

Sahne grafiğindeki bir öğeyi temsil eder. Sahne grafiği, Düğüm nesnelerinin bir ağacıdır. Ağaç yönetim hizmetleri bu sınıfa dahildir. Aspose.3D SDK'nın oluşturulmuş sahne grafiğinin geçerliliğini test etmediğini unutmayın. Bir düğüm hiyerarşisinde döngüsel grafikler oluşturmadığından emin olmak, arayanın sorumluluğundadır. Ağaç yönetiminin yanı sıra, bu sınıf, nesnenin sahnedeki konumunu tanımlamak için gereken tüm özellikleri tanımlar. Bu bilgiler, temel Çevirme, Döndürme ve Ölçekleme özelliklerini ve pivotlar, sınırlar ve rijitlik ve sönümleme gibi IK eklemleri için daha gelişmiş seçenekleri içerir. İlk oluşturulduğunda, Düğüm nesnesi "boş"tur (yani: yalnızca konum bilgisini içeren herhangi bir grafik temsili olmayan bir nesne). Bu durumda, düğüm ağacı yapısındaki ebeveynleri temsil etmek için kullanılabilir, ancak daha fazlası değil. Bu tür nesnelerin normal kullanımı, onlara düğümü özelleştirecek bir varlık eklemektir ("Varlık" konusuna bakın). Varlık kendi içinde bir nesnedir ve Düğüme bağlıdır. Bu aynı zamanda aynı varlığın birden çok düğüm arasında paylaşılabileceği anlamına gelir. Camera, Light, Mesh, vb... tümü varlıklardır ve tümü Entity. temel sınıfından türetilmiştir.

```csharp
public class Node : SceneObject
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Node](node#constructor)() | Yeni bir örneğini başlatır[`Node`](../node) sınıf. |
| [Node](node#constructor_1)(string) | Yeni bir örneğini başlatır[`Node`](../node) sınıf. |
| [Node](node#constructor_2)(string, Entity) | Yeni bir örneğini başlatır[`Node`](../node) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo) { get; set; } | Düğüm başına öğe bilgisi |
| [ChildNodes](../../aspose.threed/node/childnodes) { get; } | Alt düğümleri alır. |
| [Entities](../../aspose.threed/node/entities) { get; } | Tüm düğüm varlıklarını alır. |
| [Entity](../../aspose.threed/node/entity) { get; set; } | Bu düğüme eklenen ilk varlığı alır veya ayarlar, eğer ayarlanırsa diğer varlıkları temizler. |
| [Excluded](../../aspose.threed/node/excluded) { get; set; } | Dışa aktarma sırasında bu düğümün ve tüm alt düğümlerin/varlıkların hariç tutulup tutulmayacağını alır veya ayarlar. |
| [GlobalTransform](../../aspose.threed/node/globaltransform) { get; } | Küresel dönüşümü alır. |
| [Material](../../aspose.threed/node/material) { get; set; } | Bu düğümle ilişkili ilk malzemeyi alır veya ayarlar, kümelerse diğer malzemeleri temizler |
| [Materials](../../aspose.threed/node/materials) { get; } | Bu düğümle ilişkili malzemeleri alır. |
| [MetaDatas](../../aspose.threed/node/metadatas) { get; } | Bu düğümde tanımlanan meta verileri alır. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Adı alır veya ayarlar. |
| [ParentNode](../../aspose.threed/node/parentnode) { get; set; } | Üst düğümü alır veya ayarlar. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Tüm özelliklerin koleksiyonunu alır. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Bu nesnenin ait olduğu sahneyi alır |
| [Transform](../../aspose.threed/node/transform) { get; } | Yerel dönüşümü alır. |
| [Visible](../../aspose.threed/node/visible) { get; set; } | düğümünü göstermek için alır veya ayarlar |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Accept](../../aspose.threed/node/accept)(NodeVisitor) | Tüm alt düğümler arasında gezinir (geçerli düğüm dahil) ve düğümü olan ziyaretçiyi çağırır. Ziyaretçi, false döndürerek gözden geçirmeyi kırabilir |
| [AddChildNode](../../aspose.threed/node/addchildnode)(Node) | Bu düğüme bir alt düğüm ekleyin |
| [AddEntity](../../aspose.threed/node/addentity)(Entity) | Düğüme bir varlık ekleyin. |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode)() | Bir alt düğüm oluşturur |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_1)(Entity) | Verilen varlık ekli ile yeni bir alt düğüm oluşturun |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_2)(string) | Verilen düğüm adıyla yeni bir alt düğüm oluşturun |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_3)(string, Entity) | Verilen düğüm adıyla yeni bir alt düğüm oluşturun |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_4)(string, Entity, Material) | Verilen düğüm adıyla yeni bir alt düğüm oluşturun ve belirtilen varlığı ve bir malzemeyi ekleyin |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform)(bool) | Global dönüşümü değerlendirin, geometrik dönüşümü dahil edin veya etmeyin. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Özelliği bulur. Dinamik bir özellik olabilir (CreateDynamicProperty/SetProperty tarafından oluşturulmuştur) veya yerel özellik (adıyla tanımlanır) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox)() | Düğümün sınırlayıcı kutusunu hesaplayın |
| [GetChild](../../aspose.threed/node/getchild#getchild)(int) | Belirtilen dizindeki alt düğümü alır. |
| [GetChild](../../aspose.threed/node/getchild#getchild_1)(string) | Belirtilen ada sahip alt düğümü alır |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Belirtilen özelliğin değerini alın |
| [Merge](../../aspose.threed/node/merge)(Node) | Düğümün altındaki her şeyi ayırın ve mevcut düğüme ekleyin. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Dinamik bir özelliği kaldırır. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | name ile tanımlanan belirtilen özelliği kaldırın |
| [SelectObjects](../../aspose.threed/node/selectobjects)(string) | XPath benzeri sorgu sözdizimini kullanarak geçerli düğüm altında birden çok nesne seçin. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject)(string) | XPath benzeri sorgu sözdizimini kullanarak geçerli düğüm altında tek bir nesne seçin. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Belirtilen özelliğin değerini ayarlar |
| override [ToString](../../aspose.threed/node/tostring)() | Bu düğümün dize temsilini alır. |

### Ayrıca bakınız

* class [SceneObject](../sceneobject)
* ad alanı [Aspose.ThreeD](../../aspose.threed)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
