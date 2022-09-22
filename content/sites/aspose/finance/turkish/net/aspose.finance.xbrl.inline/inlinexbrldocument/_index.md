---
title: InlineXbrlDocument
second_title: Aspose.Finance for .NET API Referansı
description: Bir satır içi XBRL belgesi.
type: docs
weight: 7750
url: /tr/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

Bir satır içi XBRL belgesi.

```csharp
public class InlineXbrlDocument : Document
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument)(string) | Yeni bir örneğini başlatır[`InlineXbrlDocument`](../inlinexbrldocument) sınıf ve bir dosya açın. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences) { get; } | Şunların koleksiyonunu alır:[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference) satır içi XBRL belgesinde. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | Bu düğümün mutlak temel URI'sini alır veya uygulama mutlak bir URI alamazsa null değerini alır. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset) { get; } | Belgenin kodlamasını alır. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements) { get; } | Alt öğeleri alır. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | Alt düğümleri alır. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype) { get; } | Belge içerik türünü alır. |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts) { get; } | Şunların koleksiyonunu alır:[`Context`](../../aspose.finance.xbrl/context) satır içi XBRL belgesinde. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations) { get; } | Şunların koleksiyonunu alır:[`InlineContinuation`](../inlinecontinuation) satır içi XBRL belgesinde. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement) { get; } | Bu, belgenin belge öğesi olan alt düğüme doğrudan erişime izin veren bir kolaylık niteliğidir. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi) { get; } | Belge URI'sini alır. |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts) { get; } | Şunların koleksiyonunu alır:[`InlineFact`](../inlinefact) satır içi XBRL belgesinde. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | Bu düğümün ilk çocuğunu alır. Böyle bir düğüm yoksa, bu null değerini döndürür. |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes) { get; } | Şunların koleksiyonunu alır:[`InlineFootnote`](../inlinefootnote) satır içi XBRL belgesinde. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | Bu düğümün alt öğesi olup olmadığını alır. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | Bu düğümün son çocuğunu alır. Böyle bir düğüm yoksa, bu null değerini döndürür. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | Bu düğümün nitelikli adının yerel bölümünü alır. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | Bu düğümün ad alanı URI'sini alır. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | Bu düğümden hemen sonraki düğümü alır. Böyle bir düğüm yoksa, bu null değerini döndürür. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename) { get; } | Belgenin düğüm adını alır. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | Düğüm türünü alır. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | Türüne bağlı olarak bu düğümün değerini alır veya ayarlar. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | Bu düğümle ilişkili belge nesnesini alır. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | Üst düğümü alır. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix) { get; set; } | Bu düğümün ad alanı önekini alır veya ayarlar. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | Bu düğümden hemen önceki düğümü alır. Böyle bir düğüm yoksa, bu null değerini döndürür. |
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references) { get; } | [`InlineReferences`](../inlinereferences) satır içi XBRL belgesinde. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships) { get; } | Şunların koleksiyonunu alır:[`InlineRelationship`](../inlinerelationship) satır içi XBRL belgesinde. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences) { get; } | Şunların koleksiyonunu alır:[`RoleReference`](../../aspose.finance.xbrl/rolereference) satır içi XBRL belgesinde. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent) { get; set; } | Bu düğümün ve onun soyundan gelenlerin metin içeriğini alır veya ayarlar. |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units) { get; } | Şunların koleksiyonunu alır:[`Unit`](../../aspose.finance.xbrl/unit) satır içi XBRL belgesinde. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors) { get; set; } | Şunların koleksiyonunu alır:[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror) satır içi XBRL belgesinde. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | newChild düğümünü bu düğümün alt öğeleri listesinin sonuna ekler. |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement)(string, string) | Bir Html öğesi oluşturur. |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement)(string, string) | Bir satır içi xbrl öğesi oluşturur. |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement)(string, string) | Bir xbrl örneği öğesi oluşturur. |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement)(string, string) | Bir xbrl linkbase öğesi oluşturur. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl)() | XbrlDocument nesnesine aktarın. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_1)(Stream) | xbrl akışına aktar. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_2)(string) | xbrl dosyasına aktarın. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri)(string) | Belirtilen uri'ye sahip ArcroleType'ı alır. |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid)(string) | Belirtilen kimliğe sahip bağlamı alır. |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc)(Loc) | Konsepti konumlandırıcıya göre alır. |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname)(string) | Belirtilen ada sahip konsepti alır. |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid)(string) | Belirtilen kimliğe sahip bağlamı alır. |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference)(string) | Devam referansına göre devam zincirini alır. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri)(string) | Belirtilen uri. 'ye sahip RoleType'ı alır |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid)(string) | Belirtilen kimliğe sahip birimi alır. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid)() | Bu inlince XBRL belgesinin geçerli olup olmadığını kontrol eder. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects)() | DOM ağacındaki Satır İçi Xbrl öğelerini ekler, günceller veya kaldırırsa, satır içi xbrl nesnelerini yenilemek için bu yöntem çağrılmalıdır. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | Eski alt öğe tarafından belirtilen alt düğümü alt öğe listesinden kaldırır. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | Alt düğüm eski alt öğesini, alt öğe listesinde yeni alt öğeyle değiştirir ve eski alt düğümü döndürür. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save)(Stream) | Satır içi xbrl dosyasını oluşturur ve akışa kaydeder. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save_1)(string) | Satır içi xbrl dosyasını oluşturur ve diske kaydeder. |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate)() | Bu satır içi XBRL belgesini doğrular. |

### Ayrıca bakınız

* class [Document](../../aspose.finance.xbrl.dom/document)
* ad alanı [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline)
* toplantı [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
