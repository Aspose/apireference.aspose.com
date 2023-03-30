---
title: Class AnswerSheetConfig
second_title: Aspose.OMR for .NET API Referansı
description: Aspose.OMR.Generation.Config.Elements.AnswerSheetConfig sınıf. AnswerSheet öğesini temsil eder. Sütunlar ve satırlar halinde gruplanmış seçim kutularının eklenmesini sağlar. Birbirine yakın oldukları için çok sayıda soruyu bir sayfaya sığdırmak istiyorsanız cevap kağıdını kullanın.
type: docs
weight: 90
url: /tr/net/aspose.omr.generation.config.elements/answersheetconfig/
---
## AnswerSheetConfig class

AnswerSheet öğesini temsil eder. Sütunlar ve satırlar halinde gruplanmış seçim kutularının eklenmesini sağlar. Birbirine yakın oldukları için çok sayıda soruyu bir sayfaya sığdırmak istiyorsanız cevap kağıdını kullanın.

```csharp
public class AnswerSheetConfig : BaseConfig
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [AnswerSheetConfig](answersheetconfig/)() | Default_Constructor |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AnswersCount](../../aspose.omr.generation.config.elements/answersheetconfig/answerscount/) { get; set; } | Cevap kağıdındaki her soru için cevap seçeneklerinin sayısı. |
| [AnswersValues](../../aspose.omr.generation.config.elements/answersheetconfig/answersvalues/) { get; set; } | Her değer, balonun içindeki sembolü temsil eder. ile aynı sayıya sahip olmalıdır[`AnswersCount`](./answerscount/) Örnek: yeni dize[] {"A", "B", "C", "D"} Örnek: yeni dize[] {"1", "2", "3", "4"} |
| [BubbleType](../../aspose.omr.generation.config.elements/answersheetconfig/bubbletype/) { get; set; } | Balonun türü |
| [Column](../../aspose.omr.generation.config.elements/answersheetconfig/column/) { get; set; } | Sheet 'nin hangi sütunda çizileceğini gösterir |
| [ColumnsCount](../../aspose.omr.generation.config.elements/answersheetconfig/columnscount/) { get; set; } | Çizilecek sütun sayısını ayarlar. |
| [ElementsCount](../../aspose.omr.generation.config.elements/answersheetconfig/elementscount/) { get; set; } | Cevap kağıdındaki toplam soru sayısını belirler. |
| override [Name](../../aspose.omr.generation.config.elements/answersheetconfig/name/) { get; set; } | Cevap kağıdının adı |
| [StartId](../../aspose.omr.generation.config.elements/answersheetconfig/startid/) { get; set; } | Soruların başlangıç indeksi |
| override [Type](../../aspose.omr.generation.config.elements/answersheetconfig/type/) { get; set; } | omr öğesinin türü. JSON serileştirme için gerekli alan. |
| [VerticalMargin](../../aspose.omr.generation.config.elements/answersheetconfig/verticalmargin/) { get; set; } | Cevap kağıdının dikey kenar boşluğu. Piksel olarak ayarlayın. |

## Alanlar

| İsim | Tanım |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/answersheetconfig/bubblesize/) | Bir balonun boyutu |

### Ayrıca bakınız

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* ad alanı [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* toplantı [Aspose.OMR](../../)


