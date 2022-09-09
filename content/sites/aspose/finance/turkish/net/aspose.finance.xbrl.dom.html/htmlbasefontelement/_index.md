---
title: HTMLBaseFontElement
second_title: Aspose.Finance for .NET API Referansı
description: Sınıf temel yazı tipini temsil eder. HTML 4.01deki BASEFONT öğe tanımına bakın. Bu öğe HTML 4.01de kullanımdan kaldırılmıştır.
type: docs
weight: 6750
url: /tr/net/aspose.finance.xbrl.dom.html/htmlbasefontelement/
---
## HTMLBaseFontElement class

Sınıf, temel yazı tipini temsil eder. HTML 4.01'deki BASEFONT öğe tanımına bakın. Bu öğe HTML 4.01'de kullanımdan kaldırılmıştır.

```csharp
public class HTMLBaseFontElement : HTMLElement
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Attributes](../../aspose.finance.xbrl.dom/element/attributes) { get; } | Öğenin özniteliklerini alır. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | Bu düğümün mutlak temel URI'sini alır veya uygulama mutlak bir URI alamazsa null değerini alır. |
| [ChildElements](../../aspose.finance.xbrl.dom/element/childelements) { get; } | Öğenin alt öğelerini alır. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | Alt düğümleri alır. |
| [ClassName](../../aspose.finance.xbrl.dom.html/htmlelement/classname) { get; set; } | Öğenin sınıf özniteliğini alır veya ayarlar. Bu öznitelik, birçok dilde açığa çıkan "sınıf" anahtar sözcüğüyle çakışma nedeniyle yeniden adlandırıldı. HTML 4.01'deki sınıf özniteliği tanımına bakın. |
| [Dir](../../aspose.finance.xbrl.dom.html/htmlelement/dir) { get; set; } | Yönlü olarak nötr metnin temel yönünü ve tabloların yönlülüğünü alır veya ayarlar. HTML 4.01. içindeki dir özniteliği tanımına bakın |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | Bu düğümün ilk çocuğunu alır. Böyle bir düğüm yoksa, bu null değerini döndürür. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | Bu düğümün alt öğesi olup olmadığını alır. |
| [Id](../../aspose.finance.xbrl.dom.html/htmlelement/id) { get; set; } | Öğenin tanımlayıcısını alır veya ayarlar. HTML 4.01'deki id niteliği tanımına bakın. |
| [Lang](../../aspose.finance.xbrl.dom.html/htmlelement/lang) { get; set; } | RFC 1766'da tanımlanan dil kodunu alır veya ayarlar. HTML 4.01'deki lang özniteliği tanımına bakın. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | Bu düğümün son çocuğunu alır. Böyle bir düğüm yoksa, bu null değerini döndürür. |
| override [LocalName](../../aspose.finance.xbrl.dom/element/localname) { get; } | Öğenin yerel adını alır. |
| override [NamespaceURI](../../aspose.finance.xbrl.dom/element/namespaceuri) { get; } | Öğenin ad alanı URI'sini alır. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | Bu düğümden hemen sonraki düğümü alır. Böyle bir düğüm yoksa, bu null değerini döndürür. |
| override [NodeName](../../aspose.finance.xbrl.dom/element/nodename) { get; } | Öğenin düğüm adını alır. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | Düğüm türünü alır. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | Türüne bağlı olarak bu düğümün değerini alır veya ayarlar. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | Bu düğümle ilişkili belge nesnesini alır. |
| [ParentElement](../../aspose.finance.xbrl.dom/element/parentelement) { get; } | Öğenin üst öğesini alır. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | Üst düğümü alır. |
| override [Prefix](../../aspose.finance.xbrl.dom/element/prefix) { get; } | Öğenin önekini alır. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | Bu düğümden hemen önceki düğümü alır. Böyle bir düğüm yoksa, bu null değerini döndürür. |
| override [TextContent](../../aspose.finance.xbrl.dom/element/textcontent) { get; set; } | Öğenin metin içeriğini alır. |
| [Title](../../aspose.finance.xbrl.dom.html/htmlelement/title) { get; set; } | Öğenin danışma başlığını alır veya ayarlar. HTML 4.01'deki başlık özelliği tanımına bakın. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | newChild düğümünü bu düğümün alt öğeleri listesinin sonuna ekler. |
| [GetAttribute](../../aspose.finance.xbrl.dom/element/getattribute)(string) | Ada göre bir öznitelik değeri alır. |
| [GetAttributeNS](../../aspose.finance.xbrl.dom/element/getattributens)(string, string) | Yerel ad ve ad alanı URI'sine göre bir öznitelik değeri alır. |
| [HasAttribute](../../aspose.finance.xbrl.dom/element/hasattribute)(string) | Bu öğede belirli bir ada sahip bir öznitelik belirtildiğinde veya varsayılan bir değere sahip olduğunda true, aksi takdirde false döndürür. |
| [HasAttributeNS](../../aspose.finance.xbrl.dom/element/hasattributens)(string, string) | Bu öğede belirli bir yerel ad ve ad alanı URI'sine sahip bir öznitelik belirtildiğinde veya varsayılan bir değere sahip olduğunda true, aksi takdirde false döndürür. |
| [RemoveAttribute](../../aspose.finance.xbrl.dom/element/removeattribute)(string) | Bir özniteliği ada göre kaldırır. |
| [RemoveAttributeNS](../../aspose.finance.xbrl.dom/element/removeattributens)(string, string) | Yerel ada ve ad alanı URI'sine göre bir özniteliği kaldırır. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | Eski alt öğe tarafından belirtilen alt düğümü alt öğe listesinden kaldırır. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | Alt düğüm eski alt öğesini, alt öğe listesinde yeni alt öğeyle değiştirir ve eski alt düğümü döndürür. |
| [SetAttribute](../../aspose.finance.xbrl.dom/element/setattribute)(string, string) | Yeni bir nitelik ekler. Öğede bu ada sahip bir öznitelik zaten varsa, değeri parametre parametresininkiyle değiştirilir. |
| [SetAttributeNS](../../aspose.finance.xbrl.dom/element/setattributens)(string, string, string) | Yeni bir nitelik ekler. Öğede aynı yerel ad ve ad alanı URI'sine sahip bir öznitelik zaten varsa, öneki nitelikliAdı'nın önek kısmı olacak şekilde değiştirilir ve değeri, değer parametresi olarak değiştirilir. |

### Ayrıca bakınız

* class [HTMLElement](../htmlelement)
* ad alanı [Aspose.Finance.Xbrl.Dom.Html](../../aspose.finance.xbrl.dom.html)
* toplantı [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
