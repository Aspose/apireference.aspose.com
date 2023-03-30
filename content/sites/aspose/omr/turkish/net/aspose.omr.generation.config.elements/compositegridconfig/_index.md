---
title: Class CompositeGridConfig
second_title: Aspose.OMR for .NET API Referansı
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig sınıf. Grid element. Bir dizi baloncuk üretin. Doldurulan her kabarcık bileşik value içindeki bir sembolü temsil eder. Tüm işaretli semboller tek bir value içinde birleştirilir.
type: docs
weight: 120
url: /tr/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

Grid element. Bir dizi baloncuk üretin. Doldurulan her kabarcık, bileşik value içindeki bir sembolü temsil eder. Tüm işaretli semboller tek bir value içinde birleştirilir.

```csharp
public class CompositeGridConfig : BaseConfig
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | Default_Constructor |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | Balonun türü |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | Öğe çok sütunlu üst öğede çizildiğinde - konumu temsil eder. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | Izgara içindeki sütun miktarı. Sonuçta her sütun tek sembolü temsil eder value Tutar şuna eşit olmalıdır[`ExtraRow`](./extrarow/) sütun miktarı |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | Bu Izgaranın adı görüntülenmeli mi |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | Varsayılan değerlerin üstüne yerleştirilecek sütuna özgü değerler -[`Values`](./values/) . İki boyutlu dizi olarak sunulur. Birinci - sıra. İkinci - sütun. Her dize balonun içindeki metni temsil eder. dize boşsa balon yerleştirilmez. Sütun miktarı şuna eşit olmalıdır:[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | Izgara hizalaması, page üzerinde ızgaranın nereye çizilmesi gerektiğini gösterir |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | Izgara yönü: yatay veya dikey. Alt öğelerin nasıl konumlandırılması gerektiğini gösterir |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | Kare kenarlık color |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | Kare kenarlık size |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | Grid başlangıcında ne tür bir öğenin çizileceğini belirtir. |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | Kılavuzun adı. Recognition içinde tanımlayıcı olarak kullanılır |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | Izgara öğesinin kendi ekseni etrafında dönüşünü tanımlayın. "90" - CompositeGrid'i 90 derece döndürün "-90" - ComopositeGrid'i -90 dereceye döndürün |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | omr öğesinin türü. JSON serileştirme için gerekli alan. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | Her sütundaki olası sembolleri tanımlayacak dizelerin toplanması. Sütuna özgü değerler,[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | Sayfadaki Kılavuz X konumu, hizalamayı geçersiz kılar |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | Sayfadaki Kılavuz Y konumu, hizalamayı geçersiz kılar |

## Alanlar

| İsim | Tanım |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | Bir balonun boyutu |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | Satırlar arasındaki kenar boşluğu |

### Ayrıca bakınız

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* ad alanı [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* toplantı [Aspose.OMR](../../)


