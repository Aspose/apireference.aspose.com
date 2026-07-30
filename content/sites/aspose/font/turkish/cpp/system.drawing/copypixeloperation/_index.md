---
title: "System::Drawing::CopyPixelOperation enum"
linktitle: "CopyPixelOperation"
second_title: "Aspose.Font için C++"
description: "System::Drawing::CopyPixelOperation enum. Bir piksel kopyalama işleminde kaynak rengin, hedef renk ile nasıl birleştirildiğini ve C++'da sonuçta oluşan nihai rengi belirtir."
type: docs
weight: 3000
url: /tr/cpp/system.drawing/copypixeloperation/
---
## CopyPixelOperation enum


Piksel kopyalama işleminde kaynak rengin hedef renk ile nasıl birleştirileceğini ve nihai rengi oluşturacağını belirtir.

```cpp
enum class CopyPixelOperation
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| NoMirrorBitmap | n/a | Bitmap yansıtılmamıştır. |
| Siyahlık | 66 | Hedef bölge, fiziksel palet içinde indeks 0 olan renk kullanılarak doldurulur. |
| NotSourceErase | 1114278 | Kaynak ve hedef renkler OR işlemine tabi tutulur ve ortaya çıkan renk daha sonra ters çevrilir. |
| NotSourceCopy | 3342344 | Kaynak bölge ters çevrilir ve ardından hedefe kopyalanır. |
| SourceErase | 4457256 | Hedef bölgenin ters çevrilmiş renkleri, kaynak bölgenin renkleriyle AND işlemine tabi tutulur. |
| DestinationInvert | 5570569 | Hedef bölge ters çevrilir. |
| PatInvert | 5898313 | Hedef cihaz bağlamında şu anda seçili fırçanın renkleri, hedefin renkleriyle XOR işlemine tabi tutulur. |
| SourceInvert | 6684742 | Kaynak ve hedef bölgelerin renkleri XOR işlemine tabi tutulur. |
| SourceAnd | 8913094 | Kaynak ve hedef bölgelerin renkleri AND işlemine tabi tutulur. |
| MergePaint | 12255782 | Ters çevrilmiş kaynak bölgenin renkleri, hedef bölgenin renkleriyle OR işlemine tabi tutulur. |
| MergeCopy | 12583114 | Kaynak bölgenin renkleri, hedef cihaz bağlamında seçili fırçanın renkleriyle AND işlemine tabi tutulur. |
| SourceCopy | 13369376 | Kaynak bölge doğrudan hedef bölgeye kopyalanır. |
| SourcePaint | 15597702 | Kaynak ve hedef bölgelerin renkleri OR işlemine tabi tutulur. |
| PatCopy | 15728673 | Hedef aygıt bağlamında şu anda seçili fırça, hedef bitmap'e kopyalanır. |
| PatPaint | 16452105 | Hedef aygıt bağlamında şu anda seçili fırçanın renkleri, ters çevrilmiş kaynak bölgenin renkleriyle OR işlemine tabi tutulur. Bu işlemin sonucu, hedef bölgenin renkleriyle OR işlemine tabi tutulur. |
| Whiteness | 16711778 | Hedef bölge, fiziksel palet içinde indeks 1'deki renk kullanılarak doldurulur. |
| CaptureBlt | 1073741824 | Uygulamanın penceresinin üzerine katmanlanan [Windows](../../system.windows/) sonuç görüntüsüne dahil edilir. |

## Ayrıca Bakınız

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
