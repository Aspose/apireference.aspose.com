---
title: Aspose.Svg.Dom
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom Belge Nesne Modeli ad alanı herhangi bir HTML XML veya SVG belgesini temsil eden ve bunlarla etkileşime giren API sağlar. dize veya yorum.
type: docs
weight: 50
url: /tr/net/aspose.svg.dom/
---
**Aspose.Svg.Dom (Belge Nesne Modeli)** ad alanı, herhangi bir HTML, XML veya SVG belgesini temsil eden ve bunlarla etkileşime giren API sağlar. dize veya yorum).

## sınıflar

| Sınıf | Tanım |
| --- | --- |
| [Attr](./attr) | Attr arabirimi, bir Element nesnesindeki bir özniteliği temsil eder. Tipik olarak, öznitelik için izin verilen değerler, belgeyle ilişkili bir şemada tanımlanır. |
| [CDATASection](./cdatasection) | CDATA bölümleri, aksi takdirde işaretleme olarak kabul edilecek karakterleri içeren metin bloklarından kaçmak için kullanılır. |
| [CharacterData](./characterdata) | CharacterData, DOM'daki karakter verilerine erişmek için bir dizi nitelik ve yöntemle Düğüm'ü genişletir. |
| [Comment](./comment) | CharacterData öğesinden devralır ve bir yorumun içeriğini, yani başlangıç ' ile arasındaki tüm karakterleri temsil eder. . |
| [Document](./document) | Belge, HTML, XML veya SVG belgesinin tamamını temsil eder. Kavramsal olarak, belge ağacının köküdür ve belgenin verilerine birincil erişimi sağlar. |
| [DocumentFragment](./documentfragment) | DocumentFragment, "hafif" veya "minimal" bir Document nesnesidir. Bir belgenin ağacının bir kısmını çıkarabilmeyi veya belgenin yeni bir parçasını oluşturabilmeyi istemek çok yaygındır. |
| [DocumentType](./documenttype) | DocumentType, document için tanımlanan varlıkların listesine bir arabirim sağlar. |
| [DOMException](./domexception) | DOMException arabirimi, bir yöntemi çağırmanın veya bir web API'sinin bir özelliğine erişmenin bir sonucu olarak ortaya çıkan anormal bir olayı (istisna olarak adlandırılır) temsil eder. Bu, temel olarak web API'lerinde hata koşullarının nasıl açıklandığıdır. |
| [DOMObject](./domobject) | DOMObject türü, tüm Belge Nesne Modeli için bir temel nesneyi temsil etmek üzere kullanılır. Java ve ECMAScript için DOMObject, Nesne türüne bağlıdır. |
| [Element](./element) | Öğe arayüzü, bir HTML veya XML belgesindeki bir öğeyi temsil eder. |
| [Entity](./entity) | Bir XML belgesinde ayrıştırılmış veya ayrıştırılmamış bilinen bir varlığı temsil eder. |
| [EntityReference](./entityreference) | EntityReference düğümleri, ağaçta bir varlık referansını temsil etmek için kullanılabilir. |
| [EventTarget](./eventtarget) | [`EventTarget`](../aspose.svg.dom/eventtarget) arabirim, DOM Olay Modelini destekleyen bir uygulamada tüm Düğümler tarafından uygulanır. Bu nedenle, bu arabirim, Düğüm arabiriminin bir örneğinde bağlamaya özgü döküm yöntemleri kullanılarak elde edilebilir. Arabirim, Olay Dinleyicilerinin kaydedilmesine ve kaldırılmasına izin verir. bir[`EventTarget`](../aspose.svg.dom/eventtarget) ve buna olayların gönderilmesi[`IEventTarget`](../aspose.svg.dom.events/ieventtarget) . |
| [Node](./node) | Düğüm arabirimi, tüm Document nesne Modeli için birincil veri türüdür. Belge ağacındaki tek bir düğümü temsil eder. |
| [Notation](./notation) | DTD'de bildirilen bir gösterimi temsil eder. |
| [ProcessingInstruction](./processinginstruction) | ProcessingInstruction, XML'de işlemciye özgü bilgileri belge metninde tutmanın bir yolu olarak kullanılan bir "işleme talimatını" temsil eder. |
| [ShadowRoot](./shadowroot) | ShadowRoot, gölge ağacının bir kök düğümüdür. |
| [Text](./text) | Metin arabirimi, CharacterData öğesinden miras alır ve bir Öğenin veya Attr'nin metin içeriğini (XML'de karakter verileri olarak adlandırılır) temsil eder. |
| [TypeInfo](./typeinfo) | TypeInfo, belgeyle ilişkili şemalarda belirtilen Öğe veya Attr düğümlerinden başvurulan bir türü temsil eder. |
## Arayüzler

| Arayüz | Tanım |
| --- | --- |
| [IBrowsingContext](./ibrowsingcontext) | Bir göz atma bağlamı, içinde[`Document`](../aspose.svg.dom/document) nesneler kullanıcıya sunulur. |
| [IChildNode](./ichildnode) | Tanımlar[`IChildNode`](../aspose.svg.dom/ichildnode) tarafından uygulanması gereken arayüz[`Node`](../aspose.svg.dom/node) ebeveyni olabilir. |
| [IDocumentInit](./idocumentinit) | Bu arayüz şunları sağlar:[`Document`](../aspose.svg.dom/document) başlatma bilgisi. |
| [IDOMImplementation](./idomimplementation) | DOMImplementation arabirimi, belge nesne modelinin herhangi bir özel örneğinden bağımsız olan işlemleri gerçekleştirmek için bir dizi yöntem sağlar. |
| [IElementInit](./ielementinit) | Bu arayüz şunları sağlar:[`Element`](../aspose.svg.dom/element) başlatma bilgisi. |
| [IGlobalEventHandlers](./iglobaleventhandlers) | Sistem olayı işlemeyi destekleyen tüm öğeler tarafından devralınması gereken arabirimi temsil eder |
| [INonDocumentTypeChildNode](./inondocumenttypechildnode) | Tanımlar[`IChildNode`](../aspose.svg.dom/ichildnode) bunlar değil[`DOCUMENT_TYPE_NODE`](../aspose.svg.dom/node/document_type_node) . |
| [INonElementParentNode](./inonelementparentnode) | Tanımlar[`IParentNode`](../aspose.svg.dom/iparentnode) Öğe türü olmayanlar. |
| [IParentNode](./iparentnode) | [`IParentNode`](../aspose.svg.dom/iparentnode) olası ebeveynler tarafından uygulanan arayüz. |
## numaralandırma

| numaralandırma | Tanım |
| --- | --- |
| [ShadowRootMode](./shadowrootmode) | ShadowRoot'un çalışabileceği modlar. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
