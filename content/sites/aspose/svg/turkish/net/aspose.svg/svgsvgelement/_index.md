---
title: Class SVGSVGElement
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.SVGSVGElement sınıf. Anahtar arabirim tanımı svg öğesine karşılık gelen arabirim olan SVGSVGElement arabirimidir. Bu arabirim matris işlemleri ve görsel işleme aygıtlarında yeniden çizim zamanını kontrol etme yeteneği gibi yaygın olarak kullanılan çeşitli yardımcı program yöntemlerini içerir.
type: docs
weight: 3440
url: /tr/net/aspose.svg/svgsvgelement/
---
## SVGSVGElement class

Anahtar arabirim tanımı, 'svg' öğesine karşılık gelen arabirim olan SVGSVGElement arabirimidir. Bu arabirim, matris işlemleri ve görsel işleme aygıtlarında yeniden çizim zamanını kontrol etme yeteneği gibi yaygın olarak kullanılan çeşitli yardımcı program yöntemlerini içerir.

```csharp
public class SVGSVGElement : SVGGraphicsElement, IDocumentEvent, ISVGFitToViewBox, ISVGZoomAndPan
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [Attributes](../../aspose.svg.dom/element/attributes/) { get; } | Bu düğümün özniteliklerini (bir Öğe ise) içeren bir NamedNodeMap veya aksi halde null. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | Bu düğümün mutlak temel URI'si veya uygulama mutlak bir URI elde edemediyse null. |
| [ChildElementCount](../../aspose.svg.dom/element/childelementcount/) { get; } | Bu öğenin çocukları olan öğe düğümlerinin geçerli sayısını döndürür. 0, eğer bu elemanın nodeType 1. olan alt düğümleri yoksa |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Bu düğümün tüm alt öğelerini içeren bir NodeList. Alt öğe yoksa bu, düğüm içermeyen bir NodeList'tir.. |
| [Children](../../aspose.svg.dom/element/children/) { get; } | Geçerli öğenin alt öğelerini döndürür. |
| [ClassList](../../aspose.svg.dom/element/classlist/) { get; } | "class" niteliğinin ayrıştırılmasından alınan belirteçleri içeren canlı bir DOMTokenList döndürür. |
| [ClassName](../../aspose.svg/svgelement/classname/) { get; } | Belirtilen öğede 'sınıf' özniteliğine karşılık gelir. |
| [ClassName](../../aspose.svg.dom/element/classname/) { get; set; } | Öğenin sınıf özniteliği. Bu öznitelik, birçok dilde kullanılan "class" anahtar sözcüğüyle çakışması için due olarak yeniden adlandırıldı. See HTML 4.01. 'deki sınıf özelliği tanımı |
| [CurrentScale](../../aspose.svg/svgsvgelement/currentscale/) { get; set; } | En dıştaki svg öğesinde, bu öznitelik, Büyütme ve kaydırma altında açıklandığı gibi kullanıcı büyütme ve kaydırma işlemlerini hesaba katmak için ilk görünüme göre mevcut ölçek faktörünü gösterir. DOM öznitelikleri currentScale ve currentTranslate, 2x3 matris [abcdef] = [currentScale 0 0 currentScale currentTranslate.x currentTranslate.y] ile eşdeğerdir. "Büyütme" etkinleştirilirse (yani, zoomAndPan="magnify"), bu durumda etki, SVG belge parçasının en dış seviyesine (yani, en dıştaki svg öğesinin dışına) yerleştirilmiş gibi bir ekstra dönüşüm olur. Erişildiğinde en dıştaki svg öğesi olmayan bir 'svg' öğesi, bu özniteliğin hangi davranışa sahip olduğu tanımlanmamıştır. |
| [CurrentTranslate](../../aspose.svg/svgsvgelement/currenttranslate/) { get; } | En dıştaki svg öğesinde, kullanıcının "büyütmesini" hesaba katan karşılık gelen çeviri faktörü. En dıştaki svg öğesi olmayan bir 'svg' öğesinde erişildiğinde, bu özniteliğin hangi davranışa sahip olduğu tanımlanmamıştır. |
| [FarthestViewportElement](../../aspose.svg/svggraphicselement/farthestviewportelement/) { get; } | En uzak ata 'svg' öğesi. Geçerli öğe en dıştaki svg öğesiyse boş. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Bu düğümün ilk çocuğu. Böyle bir düğüm yoksa bu, null. değerini döndürür. |
| [FirstElementChild](../../aspose.svg.dom/element/firstelementchild/) { get; } | Bu öğenin ilk alt öğe düğümünü döndürür. bu öğenin alt öğesi yoksa null. |
| [Height](../../aspose.svg/svgsvgelement/height/) { get; } | Verilen 'svg' öğesindeki 'yükseklik' özelliğine karşılık gelir. |
| [Id](../../aspose.svg/svgelement/id/) { get; set; } | Belirtilen öğedeki 'id' özniteliğinin değeri veya 'id' yoksa boş dize. |
| [InnerHTML](../../aspose.svg.dom/element/innerhtml/) { get; set; } | Öğenin içeriğini temsil eden bir HTML veya XML parçası döndürür. Öğenin içeriğini verilen dizgiden ayrıştırılan düğümlerle değiştirmek için ayarlanabilir. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Bu düğümün son çocuğu. Böyle bir düğüm yoksa bu, null. değerini döndürür. |
| [LastElementChild](../../aspose.svg.dom/element/lastelementchild/) { get; } | Bu öğenin son alt öğe düğümünü döndürür. bu öğenin alt öğesi yoksa null. |
| override [LocalName](../../aspose.svg.dom/element/localname/) { get; } | Bu düğümün nitelikli adının yerel kısmını döndürür. ELEMENT_NODE ve ATTRIBUTE_NODE dışındaki herhangi bir türdeki düğümler ve Document.createElement() gibi DOM Düzey 1 yöntemiyle oluşturulan düğümler için bu her zaman boştur. |
| override [NamespaceURI](../../aspose.svg.dom/element/namespaceuri/) { get; } | Bu düğümün ad alanı URI'si veya belirtilmemişse boş. |
| [NearestViewportElement](../../aspose.svg/svggraphicselement/nearestviewportelement/) { get; } | Geçerli görünümü oluşturan öğe. Genellikle en yakın ata olan 'svg' öğesi. Geçerli öğe en dıştaki svg öğesiyse boş. |
| [NextElementSibling](../../aspose.svg.dom/element/nextelementsibling/) { get; } | Bu öğenin bir sonraki kardeş öğe düğümünü döndürür. Bu öğenin, belge ağacında bundan sonra gelen hiçbir öğe kardeş düğümü yoksa boş değer. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Bu düğümü hemen takip eden düğüm. Böyle bir düğüm yoksa bu, null. değerini döndürür. |
| override [NodeName](../../aspose.svg.dom/element/nodename/) { get; } | Türüne bağlı olarak bu düğümün adı. |
| override [NodeType](../../aspose.svg.dom/element/nodetype/) { get; } | Altta yatan nesnenin türünü temsil eden bir kod. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Türüne bağlı olarak bu düğümün değeri. |
| [OuterHTML](../../aspose.svg.dom/element/outerhtml/) { get; set; } | Öğeyi ve içeriğini temsil eden bir HTML veya XML parçasını döndürür. Öğeyi verilen dizgiden ayrıştırılan düğümlerle değiştirmek için ayarlanabilir. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | Bu düğümle ilişkili Belge nesnesi. Bu aynı zamanda yeni düğümler oluşturmak için kullanılan Belge nesnesidir. Bu düğüm, henüz herhangi bir Belge ile kullanılmayan bir Belge veya Belge Türü olduğunda, bu null. |
| [OwnerSVGElement](../../aspose.svg/svgelement/ownersvgelement/) { get; } | En yakın ata 'svg' öğesi. Belirtilen öğe en dıştaki svg öğesiyse boş. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Ebeveyni alır[`Element`](../../aspose.svg.dom/element/) bu düğümün. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Bu düğümün ebeveyni. Attr, Document, DocumentFragment, Entity ve Notation dışındaki tüm düğümlerin bir üst öğesi olabilir. Ancak, bir düğüm yeni oluşturulmuşsa ve henüz ağaca eklenmemişse veya ağaçtan kaldırılmışsa, bu null. olur. |
| override [Prefix](../../aspose.svg.dom/element/prefix/) { get; } | Bu düğümün ad alanı öneki veya belirtilmemişse boş. Boş olarak tanımlandığında, ayarının etkisi yoktur |
| [PreserveAspectRatio](../../aspose.svg/svgsvgelement/preserveaspectratio/) { get; } | Belirtilen öğede 'preserveAspectRatio' özniteliğine karşılık gelir. |
| [PreviousElementSibling](../../aspose.svg.dom/element/previouselementsibling/) { get; } | Bu öğenin önceki kardeş öğe düğümünü döndürür. Bu öğenin, belge ağacında bundan önce gelen hiçbir öğe kardeş düğümü yoksa boş değer. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Bu düğümden hemen önceki düğüm. Böyle bir düğüm yoksa bu, null. değerini döndürür. |
| [RequiredExtensions](../../aspose.svg/svggraphicselement/requiredextensions/) { get; } | Belirtilen öğede 'requiredExtensions' özniteliğine karşılık gelir. |
| [RequiredFeatures](../../aspose.svg/svggraphicselement/requiredfeatures/) { get; } | Belirtilen öğede 'requiredFeatures' özniteliğine karşılık gelir. |
| [SchemaTypeInfo](../../aspose.svg.dom/element/schematypeinfo/) { get; } | Bu öğeyle ilişkili tür bilgisi. |
| [ShadowRoot](../../aspose.svg.dom/element/shadowroot/) { get; } | Bu öğede depolanan shadowRoot'u veya kapalıysa boş değeri döndürür. |
| [Style](../../aspose.svg/svgelement/style/) { get; } | Verilen öğedeki 'stil' özniteliğine karşılık gelir. Kullanıcı aracısı CSS ile stil vermeyi desteklemiyorsa, bu öznitelik her zaman null. değerine sahip olmalıdır. |
| [SystemLanguage](../../aspose.svg/svggraphicselement/systemlanguage/) { get; } | Verilen öğedeki 'systemLanguage' özniteliğine karşılık gelir. |
| [TagName](../../aspose.svg.dom/element/tagname/) { get; } | Öğenin adı. |
| override [TextContent](../../aspose.svg.dom/element/textcontent/) { get; set; } | Bu öznitelik, bu düğümün ve onun soyundan gelenlerin metin içeriğini döndürür. Null olarak tanımlandığında, ayarının hiçbir etkisi yoktur. Ayarlama sırasında, bu düğümün sahip olabileceği tüm olası alt öğeler kaldırılır ve yeni dize boş veya boş değilse, bu özniteliğin ayarlandığı dizeyi içeren tek bir Metin düğümü ile değiştirilir. |
| [Transform](../../aspose.svg/svggraphicselement/transform/) { get; } | Belirtilen öğede 'dönüştürme' özelliğine karşılık gelir. |
| [ViewBox](../../aspose.svg/svgsvgelement/viewbox/) { get; } | Belirtilen öğede 'viewBox' özelliğine karşılık gelir. |
| [ViewportElement](../../aspose.svg/svgelement/viewportelement/) { get; } | Geçerli görünümü oluşturan öğe. Genellikle en yakın ata olan 'svg' öğesi. Belirtilen öğe en dıştaki svg öğesiyse boş. |
| [Width](../../aspose.svg/svgsvgelement/width/) { get; } | Verilen 'svg' öğesindeki 'genişlik' özelliğine karşılık gelir. |
| [X](../../aspose.svg/svgsvgelement/x/) { get; } | Verilen 'svg' öğesindeki 'x' özniteliğine karşılık gelir. |
| [Y](../../aspose.svg/svgsvgelement/y/) { get; } | Verilen 'svg' öğesindeki 'y' özniteliğine karşılık gelir. |
| [ZoomAndPan](../../aspose.svg/svgsvgelement/zoomandpan/) { get; set; } | Belirtilen öğede 'zoomAndPan' özniteliğine karşılık gelir. Değer, bu arabirimde tanımlanan SVG_ZOOMANDPAN_* sabitlerinden biri olmalıdır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [AnimationsPaused](../../aspose.svg/svgsvgelement/animationspaused/)() | Bu SVG belge parçası duraklatılmış durumdaysa true değerini döndürür. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | newChild düğümünü bu düğümün çocukları listesinin sonuna ekler. newChild zaten ağaçtaysa, önce kaldırılır. |
| [AttachShadow](../../aspose.svg.dom/element/attachshadow/)(ShadowRootMode) | Gölge kökü oluşturur ve onu geçerli öğeye ekler. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Bu düğümün bir kopyasını döndürür, yani düğümler için genel bir kopya oluşturucu görevi görür. Yinelenen düğümün üst öğesi (parentNode boştur) ve kullanıcı verisi yoktur. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Bu düğümün bir kopyasını döndürür, yani düğümler için genel bir kopya oluşturucu görevi görür. Yinelenen düğümün üst öğesi (parentNode boştur) ve kullanıcı verisi yoktur. |
| [CreateEvent](../../aspose.svg/svgsvgelement/createevent/)(string) | oluşturur[`Event`](../../aspose.svg.dom.events/event/) uygulama tarafından desteklenen bir tür. |
| [CreateSVGAngle](../../aspose.svg/svgsvgelement/createsvgangle/)() | Herhangi bir belge ağacının dışında bir SVGAngle nesnesi oluşturur. Nesne, 0 derece (birimsiz) değerine sıfırlanır. |
| [CreateSVGLength](../../aspose.svg/svgsvgelement/createsvglength/)() | Herhangi bir belge ağacının dışında bir SVGLength nesnesi oluşturur. Nesne, 0 kullanıcı birimi değerine sıfırlanır. |
| [CreateSVGMatrix](../../aspose.svg/svgsvgelement/createsvgmatrix/)() | Herhangi bir belge ağacının dışında bir SVGMatrix nesnesi oluşturur. Nesne, kimlik matrisine göre başlatıldı. |
| [CreateSVGNumber](../../aspose.svg/svgsvgelement/createsvgnumber/)() | Herhangi bir belge ağacının dışında bir SVGNumber nesnesi oluşturur. Nesne, sıfır değerine sıfırlanır. |
| [CreateSVGPoint](../../aspose.svg/svgsvgelement/createsvgpoint/)() | Herhangi bir belge ağacının dışında bir SVGPoint nesnesi oluşturur. Nesne, kullanıcı koordinat sisteminde (0,0) noktasına sıfırlanır. |
| [CreateSVGRect](../../aspose.svg/svgsvgelement/createsvgrect/)() | Herhangi bir belge ağacının dışında bir SVGRect nesnesi oluşturur. Nesne, tüm değerler 0 kullanıcı birimine ayarlanacak şekilde başlatılır. |
| [CreateSVGTransform](../../aspose.svg/svgsvgelement/createsvgtransform/)() | Herhangi bir belge ağacının dışında bir SVGTransform nesnesi oluşturur. Nesne, bir kimlik matrisi dönüşümüne (SVG_TRANSFORM_MATRIX). başlatıldı. |
| [CreateSVGTransformFromMatrix](../../aspose.svg/svgsvgelement/createsvgtransformfrommatrix/)(SVGMatrix) | Herhangi bir belge ağacının dışında bir SVGTransform nesnesi oluşturur. Nesne, verilen matris dönüşümüne göre başlatılır (yani, SVG_TRANSFORM_MATRIX). Parametre matrisindeki değerler kopyalanır, matrix parametresi SVGTransform::matrix. olarak kabul edilmez |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Bu yöntem, olayların uygulama olay modeline gönderilmesine izin verir. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Yönetilmeyen kaynakları serbest bırakma, serbest bırakma veya sıfırlama ile ilişkili uygulama tanımlı görevleri gerçekleştirir. |
| [GetAttribute](../../aspose.svg.dom/element/getattribute/)(string) | Ada göre bir öznitelik değeri alır. |
| [GetAttributeNode](../../aspose.svg.dom/element/getattributenode/)(string) | Ada göre bir öznitelik düğümü alır. |
| [GetAttributeNodeNS](../../aspose.svg.dom/element/getattributenodens/)(string, string) | Yerel ada ve ad alanı URI'sine göre bir Öznitelik düğümü alır. |
| [GetAttributeNS](../../aspose.svg.dom/element/getattributens/)(string, string) | Yerel ada ve ad alanı URI'sine göre bir öznitelik değeri alır. |
| [GetBBox](../../aspose.svg/svggraphicselement/getbbox/)() | Vuruş, kırpma, maskeleme ve filtre efektleri hariç, içerilen tüm grafik öğelerinin geometrisinde geçerli kullanıcı alanındaki (yani, varsa 'dönüştürme' özniteliğinin uygulanmasından sonra) sıkı sınırlayıcı kutuyu döndürür. Öğe henüz oluşturulmamış olsa bile getBBox'ın yöntemin çağrıldığı sırada asıl sınırlayıcı kutuyu döndürmesi gerektiğini unutmayın. |
| [GetCTM](../../aspose.svg/svggraphicselement/getctm/)() | Geçerli kullanıcı birimlerinden (yani, varsa 'transform' özniteliğinin uygulanmasından sonra) en yakın ViewportElement. için görünüm alanı koordinat sistemine dönüşüm matrisini döndürür |
| [GetCurrentTime](../../aspose.svg/svgsvgelement/getcurrenttime/)() | Geçerli SVG belge parçasının başlangıç saatine göre geçerli saati saniye cinsinden döndürür. Belge zaman çizelgesi başlamadan önce getCurrentTime çağrılırsa (örneğin, belgenin SVGLoad olayı gönderilmeden önce bir 'komut dosyası' öğesinde komut dosyası çalıştırılarak), o zaman 0 döndürülür. |
| [GetElementById](../../aspose.svg/svgsvgelement/getelementbyid/)(string) | Kimliği elementId tarafından verilen bir Öğe için bu SVG belge parçasını arar (yani, arama belge ağacının bir alt kümesiyle sınırlıdır). Bir Eleman bulunursa, o Eleman iade edilir. Böyle bir öğe yoksa, null değerini döndürür. Birden fazla öğe bu kimliğe sahipse davranış tanımlanmaz. |
| [GetElementsByClassName](../../aspose.svg.dom/element/getelementsbyclassname/)(string) | Argümanda belirtilen tüm sınıflara sahip belgedeki tüm öğeleri içeren canlı bir NodeList nesnesi döndürür. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/element/getelementsbytagname/)(string) | Belirli bir etiket adına sahip tüm alt Elemanların belge sırasına göre bir Düğüm Listesini döndürür. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/element/getelementsbytagnamens/)(string, string) | Belirli bir yerel ada ve ad alanı URI'sine sahip tüm alt Elemanların bir Düğüm Listesini belge sırasına göre döndürür. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Bu yöntem ECMAScript nesnesini almak için kullanılır.Type . |
| [GetScreenCTM](../../aspose.svg/svggraphicselement/getscreenctm/)() | Geçerli kullanıcı birimlerinden (yani, varsa 'dönüştürme' özniteliğinin uygulanmasından sonra) ana kullanıcı aracısının bir "piksel" bildirimine dönüşüm matrisini döndürür. Görüntüleme cihazları için ideal olarak bu, fiziksel bir ekran pikselini temsil eder. Fiziksel piksel boyutlarının bilinmediği diğer cihazlar veya ortamlar için bunun yerine CSS2'nin "piksel" tanımına benzer bir algoritma kullanılabilir. Bu öğe belge ağacına bağlı değilse null döndürüldüğünü unutmayın. Bu yöntem daha uygun bir şekilde getClientCTM olarak adlandırılabilirdi, ancak getScreenCTM adı tarihsel nedenlerle korunuyor. |
| [HasAttribute](../../aspose.svg.dom/element/hasattribute/)(string) | Bu öğede belirli bir ada sahip bir öznitelik belirtildiğinde veya varsayılan bir değere sahip olduğunda true, aksi takdirde false döndürür. |
| [HasAttributeNS](../../aspose.svg.dom/element/hasattributens/)(string, string) | Bu öğede belirli bir yerel ada ve ad alanı URI'sine sahip bir öznitelik belirtildiğinde veya varsayılan bir değere sahip olduğunda doğru, aksi takdirde yanlış olur. |
| override [HasAttributes](../../aspose.svg.dom/element/hasattributes/)() | Bu düğümün (eğer bir öğe ise) herhangi bir özniteliği olup olmadığını döndürür |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Bu düğümün herhangi bir alt öğesi olup olmadığını döndürür. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Düğümü varolan alt düğüm alt öğesinden önce ekler. Child null ise, çocuklar listesinin sonuna düğüm ekleyin. Child bir DocumentFragment nesnesiyse, tüm alt öğeleri aynı sırayla alt öğeden önce eklenir. Çocuk zaten ağaçtaysa, önce kaldırılır. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Bu yöntem, belirtilen namespaceURI'nin varsayılan ad alanı olup olmadığını kontrol eder. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | İki düğümün eşit olup olmadığını test eder. Bu yöntem, Node.isSameNode() ile test edilebilen aynılığı (yani iki düğümün aynı nesneye referans olup olmadığını) değil, düğümlerin eşitliğini test eder. Aynı olan tüm düğümler de eşit olacaktır, ancak tersi doğru olmayabilir. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Bu düğümün verilenle aynı düğüm olup olmadığını döndürür. Bu yöntem, uygulama tarafından döndürülen iki Düğüm başvurusunun aynı nesneye başvuruda bulunup bulunmadığını belirlemenin bir yolunu sağlar. İki Düğüm referansı aynı nesneye referans olduğunda, bir proxy üzerinden olsa bile, referanslar tamamen birbirinin yerine kullanılabilir, böylece tüm öznitelikler aynı değerlere sahip olur ve her iki referansta da aynı DOM yöntemini çağırmak her zaman tam olarak aynı etkiye sahip olur. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Bu düğümden başlayarak verilen önekle ilişkili ad alanı URI'sine bakın. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Bu düğümden başlayarak verilen ad alanı URI'si ile ilişkili öneki arayın. Varsayılan ad alanı bildirimleri bu yöntem tarafından dikkate alınmaz. Bu yöntem tarafından kullanılan algoritma hakkında ayrıntılar için Ad Alanı Öneki Arama'ya bakın. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Öznitelik düğümleri de dahil olmak üzere, bu Düğümün altındaki alt ağacın tüm derinliğindeki tüm Metin düğümlerini, Metni yalnızca yapının (örneğin, öğeler, yorumlar, işleme yönergeleri, CDATA bölümleri ve varlık referansları) ayırdığı "normal" bir forma sokar. düğümler, yani bitişik Metin düğümleri veya boş Metin düğümleri yoktur. Bu, bir belgenin DOM görünümünün, kaydedilmiş ve yeniden yüklenmiş haliyle aynı olmasını sağlamak için kullanılabilir ve belirli bir belge ağacı yapısına bağlı olan işlemler (XPointer [XPointer] aramaları gibi) kullanılmalı Node.ownerDocument'e eklenen DOMConfiguration nesnesinin "normalize-characters" parametresi doğruysa, bu yöntem Metin düğümlerinin karakterlerini de tam olarak normalleştirir. |
| [PauseAnimations](../../aspose.svg/svgsvgelement/pauseanimations/)() | Bu 'svg' öğesine karşılık gelen SVG belge parçasında tanımlanan, o anda çalışan tüm animasyonları askıya alır (yani duraklatır), bu belge parçasına karşılık gelen animasyon saatinin duraklatılana kadar sabit kalmasına neden olur. |
| [QuerySelector](../../aspose.svg.dom/element/queryselector/)(string) | Belgedeki seçici ile eşleşen ilk Elemanı döndürür |
| [QuerySelectorAll](../../aspose.svg.dom/element/queryselectorall/)(string) | Belgedeki tüm Öğelerin seçici ile eşleşen bir Düğüm Listesini döndürür |
| [Remove](../../aspose.svg.dom/element/remove/)() | Bu örneği kaldırır. |
| [RemoveAttribute](../../aspose.svg.dom/element/removeattribute/)(string) | Ada göre bir özniteliği kaldırır. |
| [RemoveAttributeNode](../../aspose.svg.dom/element/removeattributenode/)(Attr) | Belirtilen özniteliği kaldırır node. |
| [RemoveAttributeNS](../../aspose.svg.dom/element/removeattributens/)(string, string) | Yerel ada ve ad alanı URI'sine göre bir özniteliği kaldırır. |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | oldChild tarafından belirtilen alt düğümü alt öğe listesinden kaldırır ve onu döndürür. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır[`EventTarget`](../../aspose.svg.dom/eventtarget/) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır[`EventTarget`](../../aspose.svg.dom/eventtarget/) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır[`EventTarget`](../../aspose.svg.dom/eventtarget/) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Alt düğüm listesindeki oldChild alt düğümünü newChild ile değiştirir ve oldChild düğümünü döndürür. newChild bir DocumentFragment nesnesiyse, eskiChild aynı sırayla eklenen tüm DocumentFragment alt öğeleriyle değiştirilir. newChild zaten ağaçtaysa, önce kaldırılır. |
| [SetAttribute](../../aspose.svg.dom/element/setattribute/)(string, string) | Yeni bir özellik ekler. Öğede bu ada sahip bir öznitelik zaten mevcutsa, değeri parametre değerine dönüştürülür. |
| [SetAttributeNode](../../aspose.svg.dom/element/setattributenode/)(Attr) | Yeni bir öznitelik düğümü ekler. Öğede bu ada (nodeName) sahip bir öznitelik zaten varsa, yenisi ile değiştirilir. |
| [SetAttributeNodeNS](../../aspose.svg.dom/element/setattributenodens/)(Attr) | Yeni bir özellik ekler. Öğede bu yerel ada ve ad alanı URI'sine sahip bir öznitelik zaten mevcutsa, yenisi ile değiştirilir. |
| [SetAttributeNS](../../aspose.svg.dom/element/setattributens/)(string, string, string) | Yeni bir özellik ekler. Öğede aynı yerel ada ve ad alanı URI'sine sahip bir öznitelik zaten mevcutsa, öneki, nitelikliAdı'nın önek kısmı olarak değiştirilir ve değeri, value parametresi olarak değiştirilir. |
| [SetCurrentTime](../../aspose.svg/svgsvgelement/setcurrenttime/)(float) | Yeni bir geçerli zaman belirleyerek bu SVG belge parçası için saati ayarlar. SetCurrentTime, belge zaman çizelgesi başlamadan önce çağrılırsa (örneğin, belgenin SVGLoad olayı gönderilmeden önce bir 'komut dosyası' öğesinde çalışan komut dosyası tarafından), bu durumda yöntemin son çalıştırılmasındaki saniyelerin değeri belgenin başladığı zamanı verir. belge zaman çizelgesi başladıktan sonra arayacaktır. |
| [SetIdAttribute](../../aspose.svg.dom/element/setidattribute/)(string, bool) | isId parametresi true ise, bu yöntem belirtilen özniteliği kullanıcı tarafından belirlenen bir kimlik özniteliği olarak bildirir. |
| [SetIdAttributeNode](../../aspose.svg.dom/element/setidattributenode/)(Attr, bool) | isId parametresi true ise, bu yöntem belirtilen özniteliği kullanıcı tarafından belirlenen bir kimlik özniteliği olarak bildirir. |
| [SetIdAttributeNS](../../aspose.svg.dom/element/setidattributens/)(string, string, bool) | isId parametresi true ise, bu yöntem belirtilen özniteliği kullanıcı tarafından belirlenen bir kimlik özniteliği olarak bildirir. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | a döndürürString bu örneği temsil eder. |
| [UnpauseAnimations](../../aspose.svg/svgsvgelement/unpauseanimations/)() | SVG belge parçasında tanımlanmış olan ve şu anda çalışan animasyonları askıya almayı kaldırır (yani duraklatmayı kaldırır), animasyon saatinin askıya alındığı andan itibaren devam etmesine neden olur. |

### Ayrıca bakınız

* class [SVGGraphicsElement](../svggraphicselement/)
* interface [ISVGFitToViewBox](../isvgfittoviewbox/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IViewCSS](../../aspose.svg.dom.css/iviewcss/)
* interface [IDocumentCSS](../../aspose.svg.dom.css/idocumentcss/)
* interface [ISVGZoomAndPan](../isvgzoomandpan/)
* ad alanı [Aspose.Svg](../../aspose.svg/)
* toplantı [Aspose.SVG](../../)


