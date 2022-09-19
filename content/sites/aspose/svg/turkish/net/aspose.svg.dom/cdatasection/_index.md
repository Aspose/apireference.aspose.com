---
title: CDATASection
second_title: Aspose.SVG for .NET API Referansı
description: CDATA bölümleri aksi takdirde işaretleme olarak kabul edilecek karakterleri içeren metin bloklarından kaçmak için kullanılır.
type: docs
weight: 440
url: /tr/net/aspose.svg.dom/cdatasection/
---
## CDATASection class

CDATA bölümleri, aksi takdirde işaretleme olarak kabul edilecek karakterleri içeren metin bloklarından kaçmak için kullanılır.

```csharp
public class CDATASection : Text
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | Bu düğümün (bir Öğe ise) özniteliklerini içeren bir NamedNodeMap, aksi takdirde null. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri) { get; } | Bu düğümün mutlak temel URI'si veya uygulama mutlak bir URI alamadıysa null. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | Bu düğümün tüm alt öğelerini içeren bir Düğüm Listesi. Alt öğe yoksa, bu düğüm içermeyen bir NodeList'tir.. |
| virtual [Data](../../aspose.svg.dom/characterdata/data) { get; set; } | Bu arabirimi uygulayan düğümün karakter verileri. |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | Bu düğümün ilk çocuğu. Böyle bir düğüm yoksa, bu null. değerini döndürür. |
| [IsElementContentWhitespace](../../aspose.svg.dom/text/iselementcontentwhitespace) { get; } | Bu metin düğümünün, genellikle kötüye kullanımla "yoksayılabilir boşluk" olarak adlandırılan öğe içeriği boşlukları içerip içermediğini döndürür. |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | Bu düğümün son çocuğu. Böyle bir düğüm yoksa, bu null. değerini döndürür. |
| [Length](../../aspose.svg.dom/characterdata/length) { get; } | Veriler ve aşağıdaki substringData yöntemi aracılığıyla kullanılabilen 16 bitlik birimlerin sayısı. Bu, sıfır değerine sahip olabilir, yani, CharacterData düğümleri boş olabilir. |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | Bu düğümün nitelikli adının yerel bölümünü döndürür. ELEMENT_NODE ve ATTRIBUTE_NODE dışındaki herhangi bir türdeki düğümler ve Document.createElement() gibi bir DOM Düzey 1 yöntemiyle oluşturulan düğümler için bu her zaman null. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | Bu düğümün ad alanı URI'si veya belirtilmemişse null. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | Bu düğümden hemen sonraki düğüm. Böyle bir düğüm yoksa, bu null. değerini döndürür. |
| override [NodeName](../../aspose.svg.dom/cdatasection/nodename) { get; } | Türüne bağlı olarak bu düğümün adı. |
| override [NodeType](../../aspose.svg.dom/cdatasection/nodetype) { get; } | Temel alınan nesnenin türünü temsil eden bir kod. |
| override [NodeValue](../../aspose.svg.dom/text/nodevalue) { get; set; } | Türüne bağlı olarak bu düğümün değeri. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument) { get; } | Bu düğümle ilişkili Document nesnesi. Bu aynı zamanda yeni düğümler oluşturmak için kullanılan Document nesnesidir. Bu düğüm bir Document veya henüz herhangi bir Document ile kullanılmayan bir DocumentType olduğunda, bu null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | Üst öğeyi alır[`Element`](../element) bu düğümün. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | Bu düğümün ebeveyni. Attr, Document, DocumentFragment, Entity ve Notation dışındaki tüm düğümlerin bir üst öğesi olabilir. Ancak, bir düğüm yeni oluşturulmuşsa ve henüz ağaca eklenmemişse veya ağaçtan kaldırılmışsa, bu null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | Bu düğümün ad alanı öneki veya belirtilmemişse null. Null olarak tanımlandığında, ayarın hiçbir etkisi yoktur |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | Bu düğümden hemen önceki düğüm. Böyle bir düğüm yoksa, bu null. değerini döndürür. |
| override [TextContent](../../aspose.svg.dom/text/textcontent) { get; set; } | Bu öznitelik, bu düğümün ve onun soyundan gelenlerin metin içeriğini döndürür. Null olarak tanımlandığında, ayarlamanın bir etkisi olmaz. Ayar sırasında, bu düğümün sahip olabileceği olası tüm alt öğeler kaldırılır ve yeni dize boş veya boş değilse, bu özniteliğin ayarlandığı dizeyi içeren tek bir Metin düğümü ile değiştirilir. |
| [WholeText](../../aspose.svg.dom/text/wholetext) { get; } | Bu düğüme mantıksal olarak bitişik metin düğümlerinin tüm metinlerini, belge sırasına göre birleştirilmiş olarak döndürür. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine olanak tanır. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine olanak tanır. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine olanak tanır. |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | newChild düğümünü bu düğümün alt öğeleri listesinin sonuna ekler. newChild zaten ağaçtaysa, önce kaldırılır. |
| virtual [AppendData](../../aspose.svg.dom/characterdata/appenddata)(string) | Dizeyi düğümün karakter verilerinin sonuna ekleyin. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | Bu düğümün bir kopyasını döndürür, yani düğümler için genel bir kopya oluşturucu görevi görür. Yinelenen düğümün üst öğesi yok (parentNode null) ve kullanıcı verisi yok. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | Bu düğümün bir kopyasını döndürür, yani düğümler için genel bir kopya oluşturucu görevi görür. Yinelenen düğümün üst öğesi yok (parentNode null) ve kullanıcı verisi yok. |
| virtual [DeleteData](../../aspose.svg.dom/characterdata/deletedata)(int, int) | Düğümden bir dizi 16 bitlik birimi kaldırın. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | Bu yöntem, olayların uygulama olay modeline gönderilmesine olanak tanır. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | Yönetilmeyen kaynakları serbest bırakma, serbest bırakma veya sıfırlama ile ilişkili uygulama tanımlı görevleri gerçekleştirir. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Bu yöntem, ECMAScript nesnesini almak için kullanılırType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | Bu düğümün (bir öğeyse) herhangi bir niteliği olup olmadığını döndürür |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | Bu düğümün alt öğesi olup olmadığını döndürür. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | Düğümü, mevcut alt düğüm alt öğesinden önce ekler. Alt öğe null ise, alt öğe listesinin sonuna düğüm ekleyin. Alt öğe bir DocumentFragment nesnesiyse, alt öğelerin tümü alt öğeden önce aynı sırayla eklenir. Alt öğe zaten ağaçtaysa, önce kaldırılır. |
| virtual [InsertData](../../aspose.svg.dom/characterdata/insertdata)(int, string) | Belirtilen 16 bit birim uzaklığına bir dize ekleyin. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | Bu yöntem, belirtilen ad alanıURI'sinin varsayılan ad alanı olup olmadığını kontrol eder. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | İki düğümün eşit olup olmadığını test eder. Bu yöntem, Node.isSameNode() ile test edilebilen aynılığı değil (yani, iki düğümün aynı nesneye referans olup olmadığını) değil düğümlerin eşitliğini test eder. Aynı olan tüm düğümler de eşit olacaktır, ancak bunun tersi doğru olmayabilir. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | Bu düğümün verilen düğümle aynı düğüm olup olmadığını döndürür. Bu yöntem, uygulama tarafından döndürülen iki Düğüm başvurusunun aynı nesneye başvurup göndermediğini belirlemenin bir yolunu sağlar. İki Node referansı aynı nesneye referans olduğunda, bir proxy aracılığıyla bile olsa referanslar tamamen birbirinin yerine kullanılabilir, öyle ki tüm nitelikler aynı değerlere sahiptir ve her iki referansta da aynı DOM yöntemini çağırmak her zaman tam olarak aynı etkiye sahiptir. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | Bu düğümden başlayarak, verilen önekle ilişkili ad alanı URI'sini arayın. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | Bu düğümden başlayarak, verilen ad alanı URI'si ile ilişkili öneki arayın. Varsayılan ad alanı bildirimleri bu yöntem tarafından yok sayılır. Bu yöntem tarafından kullanılan algoritmayla ilgili ayrıntılar için bkz. Ad Alanı Önek Araması. |
| [Normalize](../../aspose.svg.dom/node/normalize)() | Öznitelik düğümleri de dahil olmak üzere, bu Düğümün altındaki alt ağacın tam derinliğindeki tüm Metin düğümlerini, yalnızca yapının (örneğin, öğeler, yorumlar, işleme talimatları, CDATA bölümleri ve varlık referansları) Metin'i ayırdığı "normal" bir forma koyar düğümler, yani ne bitişik Metin düğümleri ne de boş Metin düğümleri vardır. Bu, bir belgenin DOM görünümünün, sanki kaydedilmiş ve yeniden yüklenmiş gibi aynı olmasını sağlamak için kullanılabilir ve belirli bir belge ağacı yapısına bağlı işlemler (XPointer [XPointer] aramaları gibi) gerektiğinde yararlıdır. kullanılabilir. Node.ownerDocument öğesine eklenen DOMConfiguration nesnesinin "normalize-characters" parametresi doğruysa, bu yöntem Metin düğümlerinin karakterlerini de tamamen normalleştirir. |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | oldChild tarafından belirtilen alt düğümü alt öğeler listesinden kaldırır ve döndürür. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. [`IEventListener`](../../aspose.svg.dom.events/ieventlistener) birinden kaldırılır[`EventTarget`](../eventtarget) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyicileri, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. [`IEventListener`](../../aspose.svg.dom.events/ieventlistener) birinden kaldırılır[`EventTarget`](../eventtarget) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyicileri, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. [`IEventListener`](../../aspose.svg.dom.events/ieventlistener) birinden kaldırılır[`EventTarget`](../eventtarget) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyicileri, kaldırıldıktan sonra asla çağrılamaz. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | Çocuklar listesinde oldChild alt düğümünü newChild ile değiştirir ve oldChild düğümünü döndürür. newChild bir DocumentFragment nesnesiyse, oldChild, aynı sırayla eklenen tüm DocumentFragment alt öğeleriyle değiştirilir. newChild zaten ağaçtaysa, önce kaldırılır. |
| virtual [ReplaceData](../../aspose.svg.dom/characterdata/replacedata)(int, int, string) | Belirtilen 16 bit birim ofsetinden başlayan karakterleri belirtilen dizeyle değiştirin. |
| [ReplaceWholeText](../../aspose.svg.dom/text/replacewholetext)(string) | Geçerli düğümün metnini ve mantıksal olarak bitişik tüm metin düğümlerini belirtilen metinle değiştirir. Değiştirilen metnin alıcısı olmadığı sürece, geçerli düğüm de dahil olmak üzere mantıksal olarak bitişik tüm metin düğümleri kaldırılır. |
| [SplitText](../../aspose.svg.dom/text/splittext)(int) | Bu düğümü, belirtilen uzaklıkta iki düğüme böler ve her ikisini de kardeş olarak ağaçta tutar. |
| virtual [SubstringData](../../aspose.svg.dom/characterdata/substringdata)(int, int) | Düğümden bir dizi veriyi çıkarır. |
| override [ToString](../../aspose.svg.dom/characterdata/tostring)() | Bir döndürürString bu, bu örneği temsil eder. |

### Ayrıca bakınız

* class [Text](../text)
* ad alanı [Aspose.Svg.Dom](../../aspose.svg.dom)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
