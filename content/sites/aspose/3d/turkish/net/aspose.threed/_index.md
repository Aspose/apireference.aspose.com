---
title: Aspose.ThreeD
second_title: Aspose.3D for .NET API Referansı
description: Aspose.3D nin temel ad alanı
type: docs
weight: 10
url: /tr/net/aspose.threed/
---
Aspose.3D 'nin temel ad alanı

## sınıflar

| Sınıf | Tanım |
| --- | --- |
| [A3DObject](./a3dobject) | Tüm Aspose.ThreeD nesnelerinin temel sınıfı, tüm alt sınıflar dinamik özellikleri destekleyecektir. |
| [AssetInfo](./assetinfo) | Varlık bilgisi. Varlık bilgisi bir[`Scene`](../aspose.threed/scene) . Alt[`Scene`](../aspose.threed/scene) kendine ait olabilir[`AssetInfo`](../aspose.threed/assetinfo) ebeveynin tanımını geçersiz kılmak için. |
| [BonePose](./bonepose) | [`BonePose`](../aspose.threed/bonepose) bir kemik düğümü için dönüşüm matrisini içerir |
| [CustomObject](./customobject) | 3B dosyalarda kullanılan meta veriler veya özel nesneler bu sınıf tarafından yönetilir. Tüm özel özellikler dinamik özellikler olarak kaydedilir. |
| [Entity](./entity) | Tüm varlıkların temel sınıfı. Varlık, aşağıdaki gibi bir düğüm altına eklenen somut bir nesneyi temsil eder.[`Light`](../aspose.threed.entities/light)/[`Geometry`](../aspose.threed.entities/geometry) . |
| [ExportException](./exportexception) | Aspose.3D'nin sahneyi file dosyasına aktaramadığı istisnalar |
| [FileFormat](./fileformat) | Dosya biçimi tanımı |
| [FileFormatType](./fileformattype) | Dosya biçimi türü |
| [GlobalTransform](./globaltransform) | Küresel dönüşüm şuna benzer:[`Transform`](../aspose.threed/transform) ancak nihai değerlendirilen dönüşümü temsil ederken değişmezdir. Global transform değerlendirilirken sağ koordinat sistemi kullanılır |
| [ImageRenderOptions](./imagerenderoptions) | için seçenekler[`Render`](../aspose.threed/scene/render) ve[`Render`](../aspose.threed/scene/render) |
| [ImportException](./importexception) | Aspose.3D belirtilen source'yi açamadığında istisna |
| [License](./license) | Bileşeni lisanslamak için yöntemler sağlar. |
| [Metered](./metered) | Ölçülen anahtarı ayarlamak için yöntemler sağlar. |
| [Node](./node) | Sahne grafiğindeki bir öğeyi temsil eder. Sahne grafiği, Düğüm nesnelerinin bir ağacıdır. Ağaç yönetim hizmetleri bu sınıfa dahildir. Aspose.3D SDK'nın oluşturulmuş sahne grafiğinin geçerliliğini test etmediğini unutmayın. Bir düğüm hiyerarşisinde döngüsel grafikler oluşturmadığından emin olmak, arayanın sorumluluğundadır. Ağaç yönetiminin yanı sıra, bu sınıf, nesnenin sahnedeki konumunu tanımlamak için gereken tüm özellikleri tanımlar. Bu bilgiler, temel Çevirme, Döndürme ve Ölçekleme özelliklerini ve pivotlar, sınırlar ve rijitlik ve sönümleme gibi IK eklemleri için daha gelişmiş seçenekleri içerir. İlk oluşturulduğunda, Düğüm nesnesi "boş"tur (yani: yalnızca konum bilgisini içeren herhangi bir grafik temsili olmayan bir nesne). Bu durumda, düğüm ağacı yapısındaki ebeveynleri temsil etmek için kullanılabilir, ancak daha fazlası değil. Bu tür nesnelerin normal kullanımı, onlara düğümü özelleştirecek bir varlık eklemektir ("Varlık" konusuna bakın). Varlık kendi içinde bir nesnedir ve Düğüme bağlıdır. Bu aynı zamanda aynı varlığın birden çok düğüm arasında paylaşılabileceği anlamına gelir. Camera, Light, Mesh, vb... tümü varlıklardır ve tümü Entity. temel sınıfından türetilmiştir. |
| [NodeVisitor](./nodevisitor) | Tüm düğüm hiyerarşisinde gezinmek için bir geri arama. |
| [Pose](./pose) | Poz, geometri tenli olduğunda dönüşüm matrisini depolamak için kullanılır. Poz, bir dizi[`BonePose`](../aspose.threed/bonepose) , her biri[`BonePose`](../aspose.threed/bonepose) kemik düğümünün somut dönüşüm bilgilerini kaydeder. |
| [Property](./property) | Kullanıcı tanımlı özellikleri tutacak sınıf. |
| [PropertyCollection](./propertycollection) | özellikler koleksiyonu |
| [Scene](./scene) | Sahne, düğümleri, geometrileri, malzemeleri, dokuları, animasyonu, pozları, alt sahneleri vb. içeren üst düzey bir nesnedir. Sahnenin alt sahneleri olabilir, collada/blender gibi dosyalarda çoklu belge desteği görevi görür /fbx Düğüm hiyerarşisine şuradan erişilebilir:[`RootNode`](../aspose.threed/scene/rootnode)[`Library`](../aspose.threed/scene/library) serileştirme sırasında (meta veriler veya özel nesneler gibi) eklenmemiş nesnelerin referansını tutmak için kullanılır, böylece bir kitaplık olarak kullanılabilir. |
| [SceneObject](./sceneobject) | Bir sahne içinde depolanacak nesnelerin kök sınıfı. |
| [Transform](./transform) | Bir dönüşüm, nesnenin çevirme/ölçekleme/dönüşüme veya dönüşüm matrisine minimum maliyetle erişime izin veren bilgileri içerir Bu, yerel dönüşüm tarafından kullanılır. |
| [TrialException](./trialexception) | Bu, Scene.Open/Scene.Save'de oluşturulur. Hiçbir lisans uygulanmadığında kaydedin. SuppressTrialException'ı true olarak ayarlayarak bu istisnayı kapatabilirsiniz. |
## Arayüzler

| Arayüz | Tanım |
| --- | --- |
| [INamedObject](./inamedobject) | Adı olan nesne |
## numaralandırma

| numaralandırma | Tanım |
| --- | --- |
| [Axis](./axis) | Koordinat ekseni. |
| [CoordinatedSystem](./coordinatedsystem) | Solak veya sağlak koordinat sistemi. |
| [FileContentType](./filecontenttype) | Dosya içeriği türü |
| [PoseType](./posetype) | Poz tipi. |
| [PropertyFlags](./propertyflags) | Mülkün bayrakları |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
