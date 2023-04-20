---
title: Class Document
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom.Document sınıf. Belge tüm HTML XML veya SVG belgesini temsil eder. Kavramsal olarak belge ağacının köküdür ve belgenin verilerine birincil erişimi sağlar.
type: docs
weight: 810
url: /tr/net/aspose.svg.dom/document/
---
## Document class

Belge, tüm HTML, XML veya SVG belgesini temsil eder. Kavramsal olarak, belge ağacının köküdür ve belgenin verilerine birincil erişimi sağlar.

```csharp
public class Document : Node, IDocumentEvent, IDocumentStyle, IDocumentTraversal, 
    IGlobalEventHandlers, INonElementParentNode, IParentNode, IXPathEvaluator
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | Bu düğümün özniteliklerini (bir Öğe ise) içeren bir NamedNodeMap veya aksi halde null. |
| override [BaseURI](../../aspose.svg.dom/document/baseuri/) { get; } | Bu düğümün mutlak temel URI'si veya uygulama mutlak bir URI elde edemediyse null. |
| [CharacterSet](../../aspose.svg.dom/document/characterset/) { get; } | Belgenin kodlamasını alır. |
| [Charset](../../aspose.svg.dom/document/charset/) { get; } | Belgenin kodlamasını alır. |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount/) { get; } | Bu öğenin çocukları olan öğe düğümlerinin geçerli sayısını döndürür. 0, eğer bu elemanın nodeType 1. olan alt düğümleri yoksa |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Bu düğümün tüm alt öğelerini içeren bir NodeList. Alt öğe yoksa bu, düğüm içermeyen bir NodeList'tir.. |
| [Children](../../aspose.svg.dom/document/children/) { get; } | Alt öğeleri döndürür. |
| [ContentType](../../aspose.svg.dom/document/contenttype/) { get; } | Belge içerik türünü alır. |
| [Context](../../aspose.svg.dom/document/context/) { get; } | Geçerli tarama bağlamını alır. |
| [DefaultView](../../aspose.svg.dom/document/defaultview/) { get; } | Belge arayüzünün defaultView IDL özniteliği, alınırken, bu Belgenin tarama içeriğinin WindowProxy nesnesini, , eğer bu Belgenin ilişkili bir göz atma bağlamı varsa, yoksa null değerini döndürmelidir. |
| [Doctype](../../aspose.svg.dom/document/doctype/) { get; } | Bu belgeyle ilişkili Belge Türü Bildirimi. |
| [DocumentElement](../../aspose.svg.dom/document/documentelement/) { get; } | Bu, belgenin belge öğesi olan alt düğüme doğrudan erişim sağlayan bir uygunluk niteliğidir. |
| [DocumentURI](../../aspose.svg.dom/document/documenturi/) { get; } | Belgenin konumu veya tanımsızsa boş veya Belge DOMImplementation.createDocument. kullanılarak oluşturulmuşsa |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Bu düğümün ilk çocuğu. Böyle bir düğüm yoksa bu, null. değerini döndürür. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild/) { get; } | Bu öğenin ilk alt öğe düğümünü döndürür. bu öğenin alt öğesi yoksa null. |
| [Implementation](../../aspose.svg.dom/document/implementation/) { get; } | Bu belgeyi işleyen DOMImplementation nesnesi. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding/) { get; } | Belgenin kodlamasını alır. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | Bu düğümün son çocuğu. Böyle bir düğüm yoksa bu, null. değerini döndürür. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild/) { get; } | Bu öğenin son alt öğe düğümünü döndürür. bu öğenin alt öğesi yoksa null. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Bu düğümün nitelikli adının yerel kısmını döndürür. ELEMENT_NODE ve ATTRIBUTE_NODE dışındaki herhangi bir türdeki düğümler ve Document.createElement() gibi DOM Düzey 1 yöntemiyle oluşturulan düğümler için bu her zaman boştur. |
| [Location](../../aspose.svg.dom/document/location/) { get; } | Belgenin konumu. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | Bu düğümün ad alanı URI'si veya belirtilmemişse boş. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling/) { get; } | Bu öğenin bir sonraki kardeş öğe düğümünü döndürür. Bu öğenin, belge ağacında bundan sonra gelen hiçbir öğe kardeş düğümü yoksa boş değer. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Bu düğümü hemen takip eden düğüm. Böyle bir düğüm yoksa bu, null. değerini döndürür. |
| override [NodeName](../../aspose.svg.dom/document/nodename/) { get; } | Türüne bağlı olarak bu düğümün adı. |
| override [NodeType](../../aspose.svg.dom/document/nodetype/) { get; } | Altta yatan nesnenin türünü temsil eden bir kod. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Türüne bağlı olarak bu düğümün değeri. |
| [Origin](../../aspose.svg.dom/document/origin/) { get; } | Belge kaynağını alır. |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument/) { get; } | Sahip belgesini alır. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Ebeveyni alır[`Element`](../element/) bu düğümün. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Bu düğümün ebeveyni. Attr, Document, DocumentFragment, Entity ve Notation dışındaki tüm düğümlerin bir üst öğesi olabilir. Ancak, bir düğüm yeni oluşturulmuşsa ve henüz ağaca eklenmemişse veya ağaçtan kaldırılmışsa, bu null. olur. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | Bu düğümün ad alanı öneki veya belirtilmemişse boş. Boş olarak tanımlandığında, ayarının etkisi yoktur |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling/) { get; } | Bu öğenin önceki kardeş öğe düğümünü döndürür. Bu öğenin, belge ağacında bundan önce gelen hiçbir öğe kardeş düğümü yoksa boş değer. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Bu düğümden hemen önceki düğüm. Böyle bir düğüm yoksa bu, null. değerini döndürür. |
| [ReadyState](../../aspose.svg.dom/document/readystate/) { get; } | Belgenin hazır olma durumunu döndürür. Belge yüklenirken "yükleme", ayrıştırmayı bitirdiğinde ancak alt kaynakları yüklemeye devam ettiğinde "etkileşimli" ve yüklendiğinde "tamamlandı". |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking/) { get; set; } | Hata denetiminin zorunlu olup olmadığını belirten bir öznitelik. false değerine ayarlandığında uygulama, normalde DOM işlemlerinde tanımlanan her olası hata durumunu test etmemek ve Document.normalizeDocument() kullanırken DOM işlemlerinde herhangi bir DOMException oluşturmamak veya hataları raporlamamak için serbesttir. Hata durumunda, davranış tanımsızdır. Bu öznitelik varsayılan olarak doğrudur. |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets/) { get; } | Bir belgeye açıkça bağlantılı veya belgeye katıştırılmış tüm stil sayfalarını içeren bir liste. HTML belgeleri için bu, HTML LINK öğesi aracılığıyla eklenen harici stil sayfalarını ve satır içi STYLE öğelerini içerir. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent/) { get; set; } | Bu öznitelik, bu düğümün ve onun soyundan gelenlerin metin içeriğini döndürür. Null olarak tanımlandığında, ayarının hiçbir etkisi yoktur. Ayarlama sırasında, bu düğümün sahip olabileceği tüm olası alt öğeler kaldırılır ve yeni dize boş veya boş değilse, bu özniteliğin ayarlandığı dizeyi içeren tek bir Metin düğümü ile değiştirilir. |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone/) { get; set; } | XML bildiriminin bir parçası olarak bu belgenin bağımsız olup olmadığını belirten bir öznitelik. Bu, belirtilmediğinde yanlıştır. |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion/) { get; set; } | XML bildiriminin bir parçası olarak bu belgenin sürüm numarasını belirten bir öznitelik. Beyanname yoksa ve bu belge "XML" özelliğini destekliyorsa değer "1.0" olur. Bu belge "XML" özelliğini desteklemiyorsa, değer her zaman boştur. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | newChild düğümünü bu düğümün çocukları listesinin sonuna ekler. newChild zaten ağaçtaysa, önce kaldırılır. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Bu düğümün bir kopyasını döndürür, yani düğümler için genel bir kopya oluşturucu görevi görür. Yinelenen düğümün üst öğesi (parentNode boştur) ve kullanıcı verisi yoktur. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Bu düğümün bir kopyasını döndürür, yani düğümler için genel bir kopya oluşturucu görevi görür. Yinelenen düğümün üst öğesi (parentNode boştur) ve kullanıcı verisi yoktur. |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute/)(string) | Belirtilen isimde bir Öznitelik oluşturur. |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens/)(string, string) | Verilen nitelikli ad ve ad alanı URI'sinin bir özniteliğini oluşturur. |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection/)(string) | Değeri belirtilen dize olan bir CDATASection düğümü oluşturur. |
| [CreateComment](../../aspose.svg.dom/document/createcomment/)(string) | Belirtilen dize verilen bir Yorum düğümü oluşturur. |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment/)() | Boş bir DocumentFragment nesnesi oluşturur. |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype/)(string, string, string, string) | Bir DocumentType düğümü oluşturur. |
| [CreateElement](../../aspose.svg.dom/document/createelement/)(string) | Belirtilen türde bir öğe oluşturur. Döndürülen örneğin Element arabirimini uyguladığını unutmayın, böylece öznitelikler doğrudan döndürülen nesne üzerinde belirtilebilir. |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns/)(string, string) | Verilen nitelikli ad ve ad alanı URI'sinin bir öğesini oluşturur. |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference/)(string) | Bir EntityReference nesnesi oluşturur. Ek olarak, başvurulan varlık biliniyorsa, EntityReference düğümünün alt listesi, karşılık gelen Varlık düğümününkiyle aynı yapılır. |
| [CreateEvent](../../aspose.svg.dom/document/createevent/)(string) | oluşturur[`Event`](../../aspose.svg.dom.events/event/) uygulama tarafından desteklenen bir tür. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression/)(string, IXPathNSResolver) | Çözülmüş ad alanlarıyla ayrıştırılmış bir XPath ifadesi oluşturur. Bu, ifade dizesini daha verimli bir dahili biçimde derlemeyi ve ifade içinde oluşan tüm ad alanı öneklerini önceden çözmeyi mümkün kıldığından, bir ifade bir uygulamada yeniden kullanılacağında yararlıdır. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator)(Node) | Belirtilen node. 'de köklenen alt ağaç üzerinde yeni bir NodeIterator oluşturun. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_1)(Node, long) | Belirtilen node. 'de köklenen alt ağaç üzerinde yeni bir NodeIterator oluşturun. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_2)(Node, long, INodeFilter) | Belirtilen node. 'de köklenen alt ağaç üzerinde yeni bir NodeIterator oluşturun. |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver/)(Node) | Herhangi bir DOM düğümünü ad alanlarını çözecek şekilde uyarlar, böylece bir XPath ifadesi belgede göründüğü düğümün bağlamına göre kolayca değerlendirilebilir. Bu bağdaştırıcı, DOM Düzey 3 yöntemi gibi çalışır `aramaNamespaceURI` namespaceURI öğesini belirli bir önekten çözümlemede düğümlerde, düğümün hiyerarşisinde lookupNamespaceURI çağrıldığında mevcut olan geçerli bilgileri kullanarak, aynı zamanda örtük xml önekini doğru bir şekilde çözerek. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction/)(string, string) | Belirtilen ad ve veri dizileri verilen bir ProcessingInstruction düğümü oluşturur. |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode/)(string) | Belirtilen dize verilen bir Metin düğümü oluşturur. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker)(Node) | Belirtilen düğümde köklenen alt ağaç üzerinde yeni bir TreeWalker oluşturun. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_1)(Node, long) | Belirtilen düğümde köklenen alt ağaç üzerinde yeni bir TreeWalker oluşturun. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_2)(Node, long, INodeFilter) | Belirtilen düğümde köklenen alt ağaç üzerinde yeni bir TreeWalker oluşturun. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Bu yöntem, olayların uygulama olay modeline gönderilmesine izin verir. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Yönetilmeyen kaynakları serbest bırakma, serbest bırakma veya sıfırlama ile ilişkili uygulama tanımlı görevleri gerçekleştirir. |
| [Evaluate](../../aspose.svg.dom/document/evaluate/)(string, Node, IXPathNSResolver, XPathResultType, object) | Bir XPath ifade dizesini değerlendirir ve mümkünse belirtilen türden bir sonuç döndürür. |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid/)(string) | Verilen değere sahip bir ID özniteliğine sahip Öğeyi döndürür. Böyle bir öğe yoksa, bu null değerini döndürür. Birden fazla öğenin bu değere sahip bir kimlik özelliği varsa, döndürülen şey undefined. 'dir. |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname/)(string) | Argümanda belirtilen tüm sınıflara sahip belgedeki tüm öğeleri içeren canlı bir NodeList nesnesi döndürür. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname/)(string) | Belirli bir etiket adı ile belge sırasındaki ve belgede bulunan tüm Öğelerin Düğüm Listesini döndürür. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens/)(string, string) | Belirli bir yerel ada ve ad alanı URI'sine sahip tüm Öğelerin bir Düğüm Listesini belge sırasına göre döndürür. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Bu yöntem ECMAScript nesnesini almak için kullanılır.Type . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | Bu düğümün (eğer bir öğe ise) herhangi bir özniteliği olup olmadığını döndürür |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Bu düğümün herhangi bir alt öğesi olup olmadığını döndürür. |
| [ImportNode](../../aspose.svg.dom/document/importnode/)(Node, bool) | Orijinal belgedeki kaynak düğümü değiştirmeden veya çıkarmadan başka bir belgeden bu belgeye bir düğüm aktarır; bu yöntem, kaynak düğümün yeni bir kopyasını oluşturur. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Düğümü varolan alt düğüm alt öğesinden önce ekler. Child null ise, çocuklar listesinin sonuna düğüm ekleyin. Child bir DocumentFragment nesnesiyse, tüm alt öğeleri aynı sırayla alt öğeden önce eklenir. Çocuk zaten ağaçtaysa, önce kaldırılır. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Bu yöntem, belirtilen namespaceURI'nin varsayılan ad alanı olup olmadığını kontrol eder. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | İki düğümün eşit olup olmadığını test eder. Bu yöntem, Node.isSameNode() ile test edilebilen aynılığı (yani iki düğümün aynı nesneye referans olup olmadığını) değil, düğümlerin eşitliğini test eder. Aynı olan tüm düğümler de eşit olacaktır, ancak tersi doğru olmayabilir. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Bu düğümün verilenle aynı düğüm olup olmadığını döndürür. Bu yöntem, uygulama tarafından döndürülen iki Düğüm başvurusunun aynı nesneye başvuruda bulunup bulunmadığını belirlemenin bir yolunu sağlar. İki Düğüm referansı aynı nesneye referans olduğunda, bir proxy üzerinden olsa bile, referanslar tamamen birbirinin yerine kullanılabilir, böylece tüm öznitelikler aynı değerlere sahip olur ve her iki referansta da aynı DOM yöntemini çağırmak her zaman tam olarak aynı etkiye sahip olur. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Bu düğümden başlayarak verilen önekle ilişkili ad alanı URI'sine bakın. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Bu düğümden başlayarak verilen ad alanı URI'si ile ilişkili öneki arayın. Varsayılan ad alanı bildirimleri bu yöntem tarafından dikkate alınmaz. Bu yöntem tarafından kullanılan algoritma hakkında ayrıntılar için Ad Alanı Öneki Arama'ya bakın. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate)(RequestMessage) | Önceki içeriği değiştirerek belirtilen istek nesnesine göre belgeyi yükler. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_4)(string) | Belirtilen Tekdüzen Kaynak Bulucudaki (URL) belgeyi, önceki içeriği değiştirerek mevcut örneğe yükler. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_1)(Url) | Belirtilen Tekdüzen Kaynak Bulucudaki (URL) belgeyi, önceki içeriği değiştirerek mevcut örneğe yükler. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_3)(Stream, string) | Belgeyi belirtilen içerikten yükler ve göreli kaynakları çözmek için baseUri kullanarak önceki içeriği değiştirir. Belge yükleme, akıştaki geçerli konumdan başlar. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_2)(Stream, Url) | Belgeyi belirtilen içerikten yükler ve göreli kaynakları çözmek için baseUri kullanarak önceki içeriği değiştirir. Belge yükleme, akıştaki geçerli konumdan başlar. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_6)(string, string) | Belgeyi belirtilen içerikten yükler ve baseUri kullanarak göreli kaynakları çözerek önceki içeriği değiştirir. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_5)(string, Url) | Belgeyi belirtilen içerikten yükler ve baseUri kullanarak göreli kaynakları çözerek önceki içeriği değiştirir. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Öznitelik düğümleri de dahil olmak üzere, bu Düğümün altındaki alt ağacın tüm derinliğindeki tüm Metin düğümlerini, Metni yalnızca yapının (örneğin, öğeler, yorumlar, işleme yönergeleri, CDATA bölümleri ve varlık referansları) ayırdığı "normal" bir forma sokar. düğümler, yani bitişik Metin düğümleri veya boş Metin düğümleri yoktur. Bu, bir belgenin DOM görünümünün, kaydedilmiş ve yeniden yüklenmiş haliyle aynı olmasını sağlamak için kullanılabilir ve belirli bir belge ağacı yapısına bağlı olan işlemler (XPointer [XPointer] aramaları gibi) kullanılmalı Node.ownerDocument'e eklenen DOMConfiguration nesnesinin "normalize-characters" parametresi doğruysa, bu yöntem Metin düğümlerinin karakterlerini de tam olarak normalleştirir. |
| [QuerySelector](../../aspose.svg.dom/document/queryselector/)(string) | Belgedeki seçici ile eşleşen ilk Elemanı döndürür |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall/)(string) | Belgedeki tüm Öğelerin seçici ile eşleşen bir Düğüm Listesini döndürür |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | oldChild tarafından belirtilen alt düğümü alt öğe listesinden kaldırır ve onu döndürür. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır[`EventTarget`](../eventtarget/) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır[`EventTarget`](../eventtarget/) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır[`EventTarget`](../eventtarget/) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto/)(IDevice) | Bu yöntem, geçerli belgenin içeriğini belirli bir grafik aygıtına dönüştürmek için kullanılır. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Alt düğüm listesindeki oldChild alt düğümünü newChild ile değiştirir ve oldChild düğümünü döndürür. newChild bir DocumentFragment nesnesiyse, eskiChild aynı sırayla eklenen tüm DocumentFragment alt öğeleriyle değiştirilir. newChild zaten ağaçtaysa, önce kaldırılır. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | a döndürürString bu örneği temsil eder. |
| [Write](../../aspose.svg.dom/document/write/)(params string[]) | open() tarafından açılan bir belge akışına bir metin dizisi yazın. İşlevin, mutlaka bir DTD tarafından yönlendirilmesi gerekmeyen bir document üreteceğini ve bu nedenle, belge bağlamında geçersiz bir sonuç be üretebileceğini unutmayın. |
| [WriteLn](../../aspose.svg.dom/document/writeln/)(params string[]) | open() tarafından açılan bir document akışına bir metin dizesi ve ardından yeni satır karakteri yazın. işlevinin bir DTD tarafından yönlendirilmesi gerekmeyen bir belge üreteceğini ve bu nedenle belgesinin the document bağlamında geçersiz bir sonuç üretebileceğini unutmayın. |

## Olaylar

| İsim | Tanım |
| --- | --- |
| event [OnAbort](../../aspose.svg.dom/document/onabort/) | OnAbort olayı için olay işleyicisini alır veya ayarlar. |
| event [OnBlur](../../aspose.svg.dom/document/onblur/) | OnBlur olayı için olay işleyicisini alır veya ayarlar. |
| event [OnCancel](../../aspose.svg.dom/document/oncancel/) | OnCancel olayı için olay işleyicisini alır veya ayarlar. |
| event [OnCanplay](../../aspose.svg.dom/document/oncanplay/) | OnCanplay olayı için olay işleyicisini alır veya ayarlar. |
| event [OnCanPlayThrough](../../aspose.svg.dom/document/oncanplaythrough/) | OnCanPlayThrough olayı için olay işleyicisini alır veya ayarlar. |
| event [OnChange](../../aspose.svg.dom/document/onchange/) | OnChange olayı için olay işleyicisini alır veya ayarlar. |
| event [OnClick](../../aspose.svg.dom/document/onclick/) | OnClick olayı için olay işleyicisini alır veya ayarlar. |
| event [OnCueChange](../../aspose.svg.dom/document/oncuechange/) | OnCueChange olayı için olay işleyicisini alır veya ayarlar. |
| event [OnDblClick](../../aspose.svg.dom/document/ondblclick/) | OnDblClick olayı için olay işleyicisini alır veya ayarlar. |
| event [OnDurationChange](../../aspose.svg.dom/document/ondurationchange/) | OnDurationChange olayı için olay işleyicisini alır veya ayarlar. |
| event [OnEmptied](../../aspose.svg.dom/document/onemptied/) | OnEmptied olayı için olay işleyicisini alır veya ayarlar. |
| event [OnEnded](../../aspose.svg.dom/document/onended/) | OnEnded olayı için olay işleyicisini alır veya ayarlar. |
| event [OnError](../../aspose.svg.dom/document/onerror/) | OnError olayı için olay işleyicisini alır veya ayarlar. |
| event [OnFocus](../../aspose.svg.dom/document/onfocus/) | OnFocus olayı için olay işleyicisini alır veya ayarlar. |
| event [OnInput](../../aspose.svg.dom/document/oninput/) | OnInput olayı için olay işleyicisini alır veya ayarlar. |
| event [OnInvalid](../../aspose.svg.dom/document/oninvalid/) | OnInvalid olayı için olay işleyicisini alır veya ayarlar. |
| event [OnKeyDown](../../aspose.svg.dom/document/onkeydown/) | OnKeyDown olayı için olay işleyicisini alır veya ayarlar. |
| event [OnKeyPress](../../aspose.svg.dom/document/onkeypress/) | OnKeyPress olayı için olay işleyicisini alır veya ayarlar. |
| event [OnKeyUp](../../aspose.svg.dom/document/onkeyup/) | OnKeyUp olayı için olay işleyicisini alır veya ayarlar. |
| event [OnLoad](../../aspose.svg.dom/document/onload/) | OnLoad olayı için olay işleyicisini alır veya ayarlar. |
| event [OnLoadedData](../../aspose.svg.dom/document/onloadeddata/) | OnLoadedData olayı için olay işleyicisini alır veya ayarlar. |
| event [OnLoadedMetadata](../../aspose.svg.dom/document/onloadedmetadata/) | OnLoadedMetadata olayı için olay işleyicisini alır veya ayarlar. |
| event [OnLoadStart](../../aspose.svg.dom/document/onloadstart/) | OnLoadStart olayı için olay işleyicisini alır veya ayarlar. |
| event [OnMouseDown](../../aspose.svg.dom/document/onmousedown/) | OnMouseDown olayı için olay işleyicisini alır veya ayarlar. |
| event [OnMouseEnter](../../aspose.svg.dom/document/onmouseenter/) | OnMouseEnter olayı için olay işleyicisini alır veya ayarlar. |
| event [OnMouseLeave](../../aspose.svg.dom/document/onmouseleave/) | OnMouseLeave olayı için olay işleyicisini alır veya ayarlar. |
| event [OnMouseMove](../../aspose.svg.dom/document/onmousemove/) | OnMouseMove olayı için olay işleyicisini alır veya ayarlar. |
| event [OnMouseOut](../../aspose.svg.dom/document/onmouseout/) | OnMouseOut olayı için olay işleyicisini alır veya ayarlar. |
| event [OnMouseOver](../../aspose.svg.dom/document/onmouseover/) | OnMouseOver olayı için olay işleyicisini alır veya ayarlar. |
| event [OnMouseUp](../../aspose.svg.dom/document/onmouseup/) | OnMouseUp olayı için olay işleyicisini alır veya ayarlar. |
| event [OnMouseWheel](../../aspose.svg.dom/document/onmousewheel/) | OnMouseWheel olayı için olay işleyicisini alır veya ayarlar. |
| event [OnPause](../../aspose.svg.dom/document/onpause/) | OnPause olayı için olay işleyicisini alır veya ayarlar. |
| event [OnPlay](../../aspose.svg.dom/document/onplay/) | OnPlay olayı için olay işleyicisini alır veya ayarlar. |
| event [OnPlaying](../../aspose.svg.dom/document/onplaying/) | OnPlaying olayı için olay işleyicisini alır veya ayarlar. |
| event [OnProgress](../../aspose.svg.dom/document/onprogress/) | OnProgress olayı için olay işleyicisini alır veya ayarlar. |
| event [OnRateChange](../../aspose.svg.dom/document/onratechange/) | OnRateChange olayı için olay işleyicisini alır veya ayarlar. |
| event [OnReadyStateChange](../../aspose.svg.dom/document/onreadystatechange/) | OnReadyStateChange olayı için olay işleyicisini alır veya ayarlar. |
| event [OnReset](../../aspose.svg.dom/document/onreset/) | OnReset olayı için olay işleyicisini alır veya ayarlar. |
| event [OnResize](../../aspose.svg.dom/document/onresize/) | OnResize olayı için olay işleyicisini alır veya ayarlar. |
| event [OnScroll](../../aspose.svg.dom/document/onscroll/) | OnScroll olayı için olay işleyicisini alır veya ayarlar. |
| event [OnSeeked](../../aspose.svg.dom/document/onseeked/) | OnSeeked olayı için olay işleyicisini alır veya ayarlar. |
| event [OnSeeking](../../aspose.svg.dom/document/onseeking/) | OnSeeking olayı için olay işleyicisini alır veya ayarlar. |
| event [OnSelect](../../aspose.svg.dom/document/onselect/) | OnSelect olayı için olay işleyicisini alır veya ayarlar. |
| event [OnShow](../../aspose.svg.dom/document/onshow/) | OnShow olayı için olay işleyicisini alır veya ayarlar. |
| event [OnStalled](../../aspose.svg.dom/document/onstalled/) | OnStalled olayı için olay işleyicisini alır veya ayarlar. |
| event [OnSubmit](../../aspose.svg.dom/document/onsubmit/) | OnSubmit olayı için olay işleyicisini alır veya ayarlar. |
| event [OnSuspend](../../aspose.svg.dom/document/onsuspend/) | OnSuspend olayı için olay işleyicisini alır veya ayarlar. |
| event [OnTimeUpdate](../../aspose.svg.dom/document/ontimeupdate/) | OnTimeUpdate olayı için olay işleyicisini alır veya ayarlar. |
| event [OnToggle](../../aspose.svg.dom/document/ontoggle/) | OnToggle olayı için olay işleyicisini alır veya ayarlar. |
| event [OnVolumeChange](../../aspose.svg.dom/document/onvolumechange/) | OnVolumeChange olayı için olay işleyicisini alır veya ayarlar. |
| event [OnWaiting](../../aspose.svg.dom/document/onwaiting/) | OnWaiting olayı için olay işleyicisini alır veya ayarlar. |

### Ayrıca bakınız

* class [Node](../node/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle/)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal/)
* interface [IGlobalEventHandlers](../iglobaleventhandlers/)
* interface [INonElementParentNode](../inonelementparentnode/)
* interface [IParentNode](../iparentnode/)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator/)
* ad alanı [Aspose.Svg.Dom](../../aspose.svg.dom/)
* toplantı [Aspose.SVG](../../)


