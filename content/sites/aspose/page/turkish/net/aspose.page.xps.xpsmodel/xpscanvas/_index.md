---
title: Class XpsCanvas
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsModel.XpsCanvas sınıf. Canvas öğesi özelliklerini içeren sınıf. Bu öğe öğeleri bir arada gruplar. Örneğin Glifler ve Yol öğeleri  bir birim köprü hedefi olarak olarak tanımlanmak üzere bir tuvalde gruplandırılabilir veya her bir alt ve üst öğeye birleştirilmiş bir özellik değeri uygulamak için olarak gruplandırılabilir.
type: docs
weight: 2970
url: /tr/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

Canvas öğesi özelliklerini içeren sınıf. Bu öğe, öğeleri bir arada gruplar. Örneğin, Glifler ve Yol öğeleri , bir birim (köprü hedefi olarak) olarak tanımlanmak üzere bir tuvalde gruplandırılabilir veya her bir alt ve üst öğeye birleştirilmiş bir özellik değeri uygulamak için olarak gruplandırılabilir.

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Öğenin işlenmiş bölgesini sınırlayan yol geometri örneğini döndürür/ayarlar. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Alt öğelerin sayısını döndürür. |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | Tuval içindeki yolların kenarlarının nasıl oluşturulduğunu kontrol eden değeri döndürür/ayarlar. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Köprü hedef nesnesini döndürür/ayarlar. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Dizine göre öğenin çocuklarına erişim sağlar*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Öğenin tek tip şeffaflığını tanımlayan değeri döndürür/ayarlar. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Öğeye Opaklık özniteliğiyle aynı şekilde uygulanan, ancak öğenin farklı alanları için farklı alfa değerlerine izin veren alfa değerleri maskesini belirten fırçayı döndürür/ayarlar. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Elemanın tüm öznitelikleri ve (varsa) tüm alt öğeler için yeni bir koordinat çerçevesi oluşturan afin dönüşüm matrisini döndürür/ayarlar. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | Bu tuvalin alt listesine bir öğe ekler. |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | Bu tuvalin alt listesine yeni bir tuval ekler. |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | Bu tuvalin alt listesine yeni glifler ekler. |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | Bu tuvalin alt listesine yeni bir yol ekler. |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | Bu tuvali klonlar. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | uygulamasıIEnumerable arayüz. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | adresindeki bu tuvalin alt listesine bir öğe ekler.*index* pozisyon. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | adresindeki bu tuvalin alt listesine yeni bir tuval ekler.*index* pozisyon. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | adresindeki bu tuvalin alt listesine yeni glifler ekler.*index* pozisyon. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | adresindeki bu tuvalin alt listesine yeni bir yol ekler.*index* pozisyon. |

### Ayrıca bakınız

* class [XpsContentElement](../xpscontentelement/)
* ad alanı [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* toplantı [Aspose.Page](../../)


