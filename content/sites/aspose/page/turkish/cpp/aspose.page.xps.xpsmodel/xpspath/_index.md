---
title: "Aspose::Page::XPS::XpsModel::XpsPath sınıfı"
linktitle: "XpsPath"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsPath sınıfı. Yol öğesi özelliklerini kapsayan sınıf. Bu öğe, sabit bir sayfaya vektör grafikler ve görüntüler eklemenin tek yoludur. C++'da bir sayfada işlenecek tek bir vektör grafiği tanımlar."
type: docs
weight: 3000
url: /tr/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Path öğesi özelliklerini kapsayan sınıf. Bu öğe, sabit bir sayfaya vektör grafikleri ve görseller eklemenin tek yoludur. Sayfada render edilecek tek bir vektör grafiği tanımlar.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Bu yolu kopyalar. |
| [get_Data](./get_data/)() | Returns/sets yolun geometrisini. |
| [get_Fill](./get_fill/)() | Returns/sets yolun Data özelliğiyle belirtilen geometrinin boyanmasında kullanılan fırçayı. |
| [get_Stroke](./get_stroke/)() | Returns/sets çerçeveyi (stroke) çizmeye kullanılan fırçayı. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | Returns/sets ana hat çerçevesinin tire ve boşluk uzunluklarını belirten diziyi. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | Returns/sets her bir tire ucunun nasıl çizileceğini belirten değeri. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | Returns/sets tire dizisi deseninin tekrarlanması için başlangıç noktasını. Bu değer atlanırsa, tire dizisi çerçevenin başlangıcıyla hizalanır. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | Returns/sets çerçevedeki son tire ucunun şeklini tanımlayan değeri. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | Returns/sets çerçevedeki ilk tire başlangıcının şeklini tanımlayan değeri. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | Returns/sets maksimum mitre uzunluğu ile çerçeve kalınlığının yarısı arasındaki oranı. Bu değer yalnızca **StrokeLineJoin** özniteliği **Miter** olarak belirtildiğinde anlamlıdır. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | Returns/sets çerçevedeki ilk tire başlangıcının şeklini tanımlayan değeri. |
| [get_StrokeThickness](./get_strokethickness/)() const | Returns/sets bir çerçevenin kalınlığını, etkili koordinat uzayının birimleriyle (yolun render dönüşümünü içerir). Çerçeve, Yol öğesinin Data özelliğiyle belirtilen geometrinin sınırının üzerine çizilir. StrokeThickness'in yarısı Data özelliğiyle belirtilen geometrinin dışına, diğer yarısı ise geometrinin içine uzanır. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | Returns/sets yolun geometrisini. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Returns/sets yolun Data özelliğiyle belirtilen geometrinin boyanmasında kullanılan fırçayı. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | Returns/sets çerçeveyi (stroke) çizmeye kullanılan fırçayı. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | Returns/sets ana hat çerçevesinin tire ve boşluk uzunluklarını belirten diziyi. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | Returns/sets her bir tire ucunun nasıl çizileceğini belirten değeri. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | Returns/sets tire dizisi deseninin tekrarlanması için başlangıç noktasını. Bu değer atlanırsa, tire dizisi çerçevenin başlangıcıyla hizalanır. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | Returns/sets çerçevedeki son tire ucunun şeklini tanımlayan değeri. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | Returns/sets çerçevedeki ilk tire başlangıcının şeklini tanımlayan değeri. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | Returns/sets maksimum mitre uzunluğu ile çerçeve kalınlığının yarısı arasındaki oranı. Bu değer yalnızca **StrokeLineJoin** özniteliği **Miter** olarak belirtildiğinde anlamlıdır. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | Returns/sets çerçevedeki ilk tire başlangıcının şeklini tanımlayan değeri. |
| [set_StrokeThickness](./set_strokethickness/)(float) | Returns/sets bir çerçevenin kalınlığını, etkili koordinat uzayının birimleriyle (yolun render dönüşümünü içerir). Çerçeve, Yol öğesinin Data özelliğiyle belirtilen geometrinin sınırının üzerine çizilir. StrokeThickness'in yarısı Data özelliğiyle belirtilen geometrinin dışına, diğer yarısı ise geometrinin içine uzanır. |
## Ayrıca Bakınız

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
