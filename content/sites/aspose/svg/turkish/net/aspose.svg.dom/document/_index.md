---
title: Document
second_title: Aspose.SVG for .NET API Referansı
description: Belge HTML XML veya SVG belgesinin tamamını temsil eder. Kavramsal olarak belge ağacının köküdür ve belgenin verilerine birincil erişimi sağlar.
type: docs
weight: 810
url: /tr/net/aspose.svg.dom/document/
---
## Document class

Belge, HTML, XML veya SVG belgesinin tamamını temsil eder. Kavramsal olarak, belge ağacının köküdür ve belgenin verilerine birincil erişimi sağlar.

```csharp
public class Document : Node, IDocumentEvent, IDocumentStyle, IDocumentTraversal, 
    IGlobalEventHandlers, INonElementParentNode, IParentNode, IXPathEvaluator
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | Bu düğümün (bir Öğe ise) özniteliklerini içeren bir NamedNodeMap, aksi takdirde null. |
| override [BaseURI](../../aspose.svg.dom/document/baseuri) { get; } | Bu düğümün mutlak temel URI'si veya uygulama mutlak bir URI elde edemediyse null. |
| [CharacterSet](../../aspose.svg.dom/document/characterset) { get; } | Belgenin kodlamasını alır. |
| [Charset](../../aspose.svg.dom/document/charset) { get; } | Belgenin kodlamasını alır. |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount) { get; } | Bu öğenin alt öğeleri olan geçerli öğe düğümlerinin sayısını döndürür. 0, bu öğenin nodeType 1. olan alt düğümleri yoksa |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | Bu düğümün tüm alt öğelerini içeren bir Düğüm Listesi. Alt öğe yoksa, bu düğüm içermeyen bir NodeList'tir.. |
| [Children](../../aspose.svg.dom/document/children) { get; } | Alt öğeleri döndürür. |
| [ContentType](../../aspose.svg.dom/document/contenttype) { get; } | Belge içerik türünü alır. |
| [Context](../../aspose.svg.dom/document/context) { get; } | Geçerli tarama bağlamını alır. |
| [DefaultView](../../aspose.svg.dom/document/defaultview) { get; } | Belge arabiriminin defaultView IDL özniteliği, alınırken, bu Belgenin tarama bağlamının WindowProxy nesnesini, bu Belgenin ilişkili bir tarama bağlamı varsa veya aksi takdirde null değerini döndürmelidir. |
| [Doctype](../../aspose.svg.dom/document/doctype) { get; } | Bu belgeyle ilişkili Belge Türü Bildirimi. |
| [DocumentElement](../../aspose.svg.dom/document/documentelement) { get; } | Bu, belgenin belge öğesi olan alt düğüme doğrudan erişime izin veren bir kolaylık niteliğidir. |
| [DocumentURI](../../aspose.svg.dom/document/documenturi) { get; } | Belgenin konumu veya tanımlanmamışsa boş veya Belge DOMImplementation.createDocument. kullanılarak oluşturulmuşsa |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | Bu düğümün ilk çocuğu. Böyle bir düğüm yoksa, bu null. değerini döndürür. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild) { get; } | Bu öğenin ilk alt öğe düğümünü döndürür. bu öğenin alt öğesi yoksa null. |
| [Implementation](../../aspose.svg.dom/document/implementation) { get; } | Bu belgeyi işleyen DOMImplementation nesnesi. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding) { get; } | Belgenin kodlamasını alır. |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | Bu düğümün son çocuğu. Böyle bir düğüm yoksa, bu null. değerini döndürür. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild) { get; } | Bu öğenin son alt öğe düğümünü döndürür. bu öğenin alt öğesi yoksa null. |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | Bu düğümün nitelikli adının yerel bölümünü döndürür. ELEMENT_NODE ve ATTRIBUTE_NODE dışındaki herhangi bir türdeki düğümler ve Document.createElement() gibi bir DOM Düzey 1 yöntemiyle oluşturulan düğümler için bu her zaman null. |
| [Location](../../aspose.svg.dom/document/location) { get; } | Belgenin konumu. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | Bu düğümün ad alanı URI'si veya belirtilmemişse null. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling) { get; } | Bu öğenin sonraki kardeş öğe düğümünü döndürür. bu öğenin belge ağacında bundan sonra gelen öğe kardeş düğümleri yoksa null. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | Bu düğümden hemen sonraki düğüm. Böyle bir düğüm yoksa, bu null. değerini döndürür. |
| override [NodeName](../../aspose.svg.dom/document/nodename) { get; } | Türüne bağlı olarak bu düğümün adı. |
| override [NodeType](../../aspose.svg.dom/document/nodetype) { get; } | Temel alınan nesnenin türünü temsil eden bir kod. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue) { get; set; } | Türüne bağlı olarak bu düğümün değeri. |
| [Origin](../../aspose.svg.dom/document/origin) { get; } | Belgenin kaynağını alır. |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument) { get; } | Sahip belgesini alır. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | Üst öğeyi alır[`Element`](../element) bu düğümün. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | Bu düğümün ebeveyni. Attr, Document, DocumentFragment, Entity ve Notation dışındaki tüm düğümlerin bir üst öğesi olabilir. Ancak, bir düğüm yeni oluşturulmuşsa ve henüz ağaca eklenmemişse veya ağaçtan kaldırılmışsa, bu null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | Bu düğümün ad alanı öneki veya belirtilmemişse null. Null olarak tanımlandığında, ayarın hiçbir etkisi yoktur |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling) { get; } | Bu öğenin önceki kardeş öğe düğümünü döndürür. bu öğenin belge ağacında bundan önce gelen öğe kardeş düğümleri yoksa null. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | Bu düğümden hemen önceki düğüm. Böyle bir düğüm yoksa, bu null. değerini döndürür. |
| [ReadyState](../../aspose.svg.dom/document/readystate) { get; } | Belgenin hazır olup olmadığını döndürür. Belge yüklenirken "yükleniyor", ayrıştırmayı bitirdiğinde "etkileşimli" ancak alt kaynakları yüklemeye devam ediyor ve yüklendikten sonra "tamamlanıyor". |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking) { get; set; } | Hata denetiminin uygulanıp uygulanmayacağını belirten bir öznitelik. Yanlış olarak ayarlandığında, uygulama, DOM işlemlerinde normal olarak tanımlanan her olası hata durumunu test etmemekte ve DOM işlemlerinde herhangi bir DOMException oluşturmamakta veya Document.normalizeDocument() kullanırken hataları bildirmemekte serbesttir. Hata durumunda, davranış tanımsızdır. Bu öznitelik varsayılan olarak doğrudur. |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets) { get; } | Bir belgeye açıkça bağlı veya gömülü tüm stil sayfalarını içeren bir liste. HTML belgeleri için bu, HTML LINK öğesi aracılığıyla dahil edilen harici stil sayfalarını ve satır içi STYLE öğelerini içerir. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent) { get; set; } | Bu öznitelik, bu düğümün ve onun soyundan gelenlerin metin içeriğini döndürür. Null olarak tanımlandığında, ayarlamanın bir etkisi olmaz. Ayar sırasında, bu düğümün sahip olabileceği olası tüm alt öğeler kaldırılır ve yeni dize boş veya boş değilse, bu özniteliğin ayarlandığı dizeyi içeren tek bir Metin düğümü ile değiştirilir. |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone) { get; set; } | Bu belgenin bağımsız olup olmadığını XML bildiriminin bir parçası olarak belirten bir öznitelik. Belirtilmemiş olduğunda bu yanlıştır. |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion) { get; set; } | XML bildiriminin bir parçası olarak bu belgenin sürüm numarasını belirten bir nitelik. Herhangi bir beyan yoksa ve bu belge "XML" özelliğini destekliyorsa değer "1.0"dır. Bu belge "XML" özelliğini desteklemiyorsa değer her zaman null olur. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine olanak tanır. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine olanak tanır. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine olanak tanır. |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | newChild düğümünü bu düğümün alt öğeleri listesinin sonuna ekler. newChild zaten ağaçtaysa, önce kaldırılır. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | Bu düğümün bir kopyasını döndürür, yani düğümler için genel bir kopya oluşturucu görevi görür. Yinelenen düğümün üst öğesi yok (parentNode null) ve kullanıcı verisi yok. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | Bu düğümün bir kopyasını döndürür, yani düğümler için genel bir kopya oluşturucu görevi görür. Yinelenen düğümün üst öğesi yok (parentNode null) ve kullanıcı verisi yok. |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute)(string) | Verilen ada sahip bir Attr oluşturur. |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens)(string, string) | Verilen nitelikli ad ve ad alanı URI'sinin bir özniteliğini oluşturur. |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection)(string) | Değeri belirtilen dize olan bir CDATASection düğümü oluşturur. |
| [CreateComment](../../aspose.svg.dom/document/createcomment)(string) | Belirtilen dizeye göre bir Yorum düğümü oluşturur. |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment)() | Boş bir DocumentFragment nesnesi oluşturur. |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype)(string, string, string, string) | Bir DocumentType düğümü oluşturur. |
| [CreateElement](../../aspose.svg.dom/document/createelement)(string) | Belirtilen türde bir öğe oluşturur. Döndürülen örneğin Element arabirimini uyguladığını unutmayın, böylece nitelikler doğrudan döndürülen nesnede belirtilebilir. |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns)(string, string) | Verilen nitelikli ad ve ad alanı URI'sinin bir öğesini oluşturur. |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference)(string) | Bir EntityReference nesnesi oluşturur. Ek olarak, başvurulan varlık biliniyorsa, EntityReference düğümünün alt listesi, karşılık gelen Entity düğümününkiyle aynı yapılır. |
| [CreateEvent](../../aspose.svg.dom/document/createevent)(string) | Bir[`Event`](../../aspose.svg.dom.events/event) uygulama tarafından desteklenen türden. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression)(string, IXPathNSResolver) | Çözümlenmiş ad alanlarıyla ayrıştırılmış bir XPath ifadesi oluşturur. Bu, bir ifade bir uygulamada yeniden kullanılacağı zaman yararlıdır, çünkü ifade dizesini daha verimli bir dahili formda derlemeyi ve ifade içinde oluşan tüm ad alanı öneklerini önceden çözmeyi mümkün kılar. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator)(Node) | Belirtilen düğümde köklenen alt ağaç üzerinde yeni bir NodeIterator oluşturun. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator_1)(Node, long) | Belirtilen düğümde köklenen alt ağaç üzerinde yeni bir NodeIterator oluşturun. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator_2)(Node, long, INodeFilter) | Belirtilen düğümde köklenen alt ağaç üzerinde yeni bir NodeIterator oluşturun. |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver)(Node) | Bir XPath ifadesinin belgede göründüğü düğümün bağlamına göre kolayca değerlendirilebilmesi için herhangi bir DOM düğümünü ad alanlarını çözümlemek üzere uyarlar. Bu bağdaştırıcı, DOM Düzey 3 yöntemi gibi çalışır `aramaAd alanıURI` düğüm hiyerarşisinde time lookupNamespaceURI çağrıldığında mevcut bilgileri kullanarak belirli bir önekten namespaceURI çözümlemesinde düğümlerde, ayrıca örtük xml önekini doğru bir şekilde çözümlemede. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction)(string, string) | Belirtilen ad ve veri dizeleri ile bir ProcessingInstruction düğümü oluşturur. |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode)(string) | Belirtilen dizeye göre bir Metin düğümü oluşturur. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker)(Node) | Belirtilen düğümde köklenen alt ağaç üzerinde yeni bir TreeWalker oluşturun. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker_1)(Node, long) | Belirtilen düğümde köklenen alt ağaç üzerinde yeni bir TreeWalker oluşturun. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker_2)(Node, long, INodeFilter) | Belirtilen düğümde köklenen alt ağaç üzerinde yeni bir TreeWalker oluşturun. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | Bu yöntem, olayların uygulama olay modeline gönderilmesine olanak tanır. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | Yönetilmeyen kaynakları serbest bırakma, serbest bırakma veya sıfırlama ile ilişkili uygulama tanımlı görevleri gerçekleştirir. |
| [Evaluate](../../aspose.svg.dom/document/evaluate)(string, Node, IXPathNSResolver, XPathResultType, object) | Bir XPath ifade dizesini değerlendirir ve mümkünse belirtilen türden bir sonuç döndürür. |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid)(string) | Verilen değere sahip bir kimlik özniteliğine sahip Öğeyi döndürür. Böyle bir öğe yoksa, bu null değerini döndürür. Birden fazla öğenin bu değere sahip bir ID özelliği varsa, döndürülen şey undefined olur. |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname)(string) | Belgedeki bağımsız değişkende belirtilen tüm sınıflara sahip tüm öğeleri içeren canlı bir NodeList nesnesi döndürür. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname)(string) | Belirli bir etiket adıyla belge sırasındaki tüm Öğelerin Düğüm Listesini döndürür ve belgede bulunur. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens)(string, string) | Belge sırasına göre belirli bir yerel ad ve ad alanı URI'sine sahip tüm Öğelerin Düğüm Listesini döndürür. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Bu yöntem, ECMAScript nesnesini almak için kullanılırType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | Bu düğümün (bir öğeyse) herhangi bir niteliği olup olmadığını döndürür |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | Bu düğümün alt öğesi olup olmadığını döndürür. |
| [ImportNode](../../aspose.svg.dom/document/importnode)(Node, bool) | Orijinal belgedeki kaynak düğümü değiştirmeden veya çıkarmadan başka bir belgeden bir düğümü bu belgeye aktarır; bu yöntem, kaynak düğümün yeni bir kopyasını oluşturur. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | Düğümü, mevcut alt düğüm alt öğesinden önce ekler. Alt öğe null ise, alt öğe listesinin sonuna düğüm ekleyin. Alt öğe bir DocumentFragment nesnesiyse, alt öğelerin tümü alt öğeden önce aynı sırayla eklenir. Alt öğe zaten ağaçtaysa, önce kaldırılır. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | Bu yöntem, belirtilen ad alanıURI'sinin varsayılan ad alanı olup olmadığını kontrol eder. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | İki düğümün eşit olup olmadığını test eder. Bu yöntem, Node.isSameNode() ile test edilebilen aynılığı değil (yani, iki düğümün aynı nesneye referans olup olmadığını) değil düğümlerin eşitliğini test eder. Aynı olan tüm düğümler de eşit olacaktır, ancak bunun tersi doğru olmayabilir. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | Bu düğümün verilen düğümle aynı düğüm olup olmadığını döndürür. Bu yöntem, uygulama tarafından döndürülen iki Düğüm başvurusunun aynı nesneye başvurup göndermediğini belirlemenin bir yolunu sağlar. İki Node referansı aynı nesneye referans olduğunda, bir proxy aracılığıyla bile olsa referanslar tamamen birbirinin yerine kullanılabilir, öyle ki tüm nitelikler aynı değerlere sahiptir ve her iki referansta da aynı DOM yöntemini çağırmak her zaman tam olarak aynı etkiye sahiptir. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | Bu düğümden başlayarak, verilen önekle ilişkili ad alanı URI'sini arayın. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | Bu düğümden başlayarak, verilen ad alanı URI'si ile ilişkili öneki arayın. Varsayılan ad alanı bildirimleri bu yöntem tarafından yok sayılır. Bu yöntem tarafından kullanılan algoritmayla ilgili ayrıntılar için bkz. Ad Alanı Önek Araması. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate)(RequestMessage) | Belgeyi, önceki içeriği değiştirerek belirtilen istek nesnesine göre yükler. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_4)(string) | Belgeyi belirtilen Tekdüzen Kaynak Bulucu'da (URL) geçerli örneğe yükler, önceki içeriği değiştirir. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_1)(Url) | Belgeyi belirtilen Tekdüzen Kaynak Bulucu'da (URL) geçerli örneğe yükler, önceki içeriği değiştirir. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_3)(Stream, string) | Belgeyi belirtilen içerikten yükler ve göreli kaynakları çözümlemek için baseUri'yi kullanarak önceki içeriği değiştirir. Belge yükleme, akıştaki geçerli konumdan başlar. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_2)(Stream, Url) | Belgeyi belirtilen içerikten yükler ve göreli kaynakları çözümlemek için baseUri'yi kullanarak önceki içeriği değiştirir. Belge yükleme, akıştaki geçerli konumdan başlar. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_6)(string, string) | Belgeyi belirtilen içerikten yükler ve göreli kaynakları çözümlemek için baseUri'yi kullanarak önceki içeriği değiştirir. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_5)(string, Url) | Belgeyi belirtilen içerikten yükler ve göreli kaynakları çözümlemek için baseUri'yi kullanarak önceki içeriği değiştirir. |
| [Normalize](../../aspose.svg.dom/node/normalize)() | Öznitelik düğümleri de dahil olmak üzere, bu Düğümün altındaki alt ağacın tam derinliğindeki tüm Metin düğümlerini, yalnızca yapının (örneğin, öğeler, yorumlar, işleme talimatları, CDATA bölümleri ve varlık referansları) Metin'i ayırdığı "normal" bir forma koyar düğümler, yani ne bitişik Metin düğümleri ne de boş Metin düğümleri vardır. Bu, bir belgenin DOM görünümünün, sanki kaydedilmiş ve yeniden yüklenmiş gibi aynı olmasını sağlamak için kullanılabilir ve belirli bir belge ağacı yapısına bağlı işlemler (XPointer [XPointer] aramaları gibi) gerektiğinde yararlıdır. kullanılabilir. Node.ownerDocument öğesine eklenen DOMConfiguration nesnesinin "normalize-characters" parametresi doğruysa, bu yöntem Metin düğümlerinin karakterlerini de tamamen normalleştirir. |
| [QuerySelector](../../aspose.svg.dom/document/queryselector)(string) | Belgedeki seçici ile eşleşen ilk Öğeyi döndürür |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall)(string) | Selector ile eşleşen, belgedeki tüm Öğelerin Düğüm Listesini döndürür |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | oldChild tarafından belirtilen alt düğümü alt öğeler listesinden kaldırır ve döndürür. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. [`IEventListener`](../../aspose.svg.dom.events/ieventlistener) birinden kaldırılır[`EventTarget`](../eventtarget) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyicileri, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. [`IEventListener`](../../aspose.svg.dom.events/ieventlistener) birinden kaldırılır[`EventTarget`](../eventtarget) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyicileri, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. [`IEventListener`](../../aspose.svg.dom.events/ieventlistener) birinden kaldırılır[`EventTarget`](../eventtarget) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyicileri, kaldırıldıktan sonra asla çağrılamaz. |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto)(IDevice) | Bu yöntem, geçerli belgenin içeriğini belirli bir grafik aygıtta işlemek için kullanılır. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | Çocuklar listesinde oldChild alt düğümünü newChild ile değiştirir ve oldChild düğümünü döndürür. newChild bir DocumentFragment nesnesiyse, oldChild, aynı sırayla eklenen tüm DocumentFragment alt öğeleriyle değiştirilir. newChild zaten ağaçtaysa, önce kaldırılır. |
| override [ToString](../../aspose.svg.dom/node/tostring)() | Bir döndürürString bu, bu örneği temsil eder. |
| [Write](../../aspose.svg.dom/document/write)(params string[]) | open() tarafından açılan bir belge akışına bir metin dizesi yazın. İşlevin, mutlaka bir DTD tarafından çalıştırılmayan ve bu nedenle belge bağlamında geçersiz bir sonuç üretebilecek olan bir document üreteceğini unutmayın. |
| [WriteLn](../../aspose.svg.dom/document/writeln)(params string[]) | open() tarafından açılan bir document akışına bir satırsonu karakterinin ardından bir metin dizesi yazın. Will işlevinin mutlaka bir DTD tarafından çalıştırılmayan bir belge üreteceğini ve bu nedenle the document bağlamında geçersiz bir sonuç üretebileceğini unutmayın. |

### Ayrıca bakınız

* class [Node](../node)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal)
* interface [IGlobalEventHandlers](../iglobaleventhandlers)
* interface [INonElementParentNode](../inonelementparentnode)
* interface [IParentNode](../iparentnode)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator)
* ad alanı [Aspose.Svg.Dom](../../aspose.svg.dom)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
