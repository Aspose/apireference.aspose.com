---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule enum"
linktitle: "XpsFillRule"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule enum. C++'da PathGeometry öğesinin FillRule özelliğinin geçerli değerleri."
type: docs
weight: 4900
url: /tr/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


PathGeometry öğesinin FillRule özelliğinin geçerli değerleri.

```cpp
enum class XpsFillRule
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| EvenOdd | 0 | Bu kural, kanvasta bir noktanın “içte olup olmadığını” belirlemek için noktadan sonsuza doğru herhangi bir yönde bir ışın çizerek ve ışının kesiştiği şekilden gelen segment sayısını sayarak belirler. Bu sayı tek ise nokta içtedir; çift ise dıştedir. |
| NonZero | 1 | Bu kural, bir noktadan herhangi bir yönde sonsuza bir ışın çizerek ve şeklin bir segmentinin ışını kestiği yerleri inceleyerek, tuval üzerindeki bir noktanın “insideness”ini belirler. Sıfırdan başlayan bir sayımla, bir segment ışını soldan sağa kesince bir ekleyin ve bir yol segmenti ışını sağdan sola kesince bir çıkarın. Kesişimler sayıldıktan sonra, sonuç sıfır ise nokta yolun dışındadır; aksi takdirde içindedir. |

## Ayrıca Bakınız

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
