---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs sınıfı"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs sınıfı. Glyphs öğesi özelliklerini kapsayan sınıf. Bu öğe, tek bir yazı tipinden oluşan tekdüze biçimlendirilmiş bir metin akışını temsil eder. Doğru renderleme için gerekli bilgileri sağlar ve C++'daki görüntüleme tüketicilerinde arama ve seçim özelliklerini destekler."
type: docs
weight: 1500
url: /tr/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Glyphs öğesi özelliklerini kapsayan sınıf. Bu öğe tek bir yazı tipinden tekdüze biçimlendirilmiş bir metin akışını temsil eder. Doğru renderleme için gerekli bilgileri sağlar ve görüntüleme tüketicilerinde arama ve seçim özelliklerini destekler.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Bu glifleri klonla. |
| [get_BidiLevel](./get_bidilevel/)() const | Unicode algoritması çift yönlü iç içeleme seviyesini belirten değeri alır/ayarlar. Çift değerler soldan sağa düzeni, tek değerler sağdan sola düzeni gösterir. Sağdan sola düzen, çalıştırma başlangıcını ilk glifin sağ tarafına koyar; pozitif ilerleme genişlikleri (sola doğru ilerlemeyi temsil eder) sonraki glifleri önceki glifin soluna yerleştirir. |
| [get_Fill](./get_fill/)() | Render edilen gliflerin şeklini doldurmak için kullanılan fırçayı alır/ayarlar. |
| [get_Font](./get_font/)() | Elemanların metnini tipografik olarak ayarlamak için kullanılan **TrueType** yazı tipi kaynağını alır. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | Çizim yüzeyi birimlerinde, etkili koordinat uzayının birimlerinde kayan nokta olarak ifade edilen yazı tipi boyutunu alır/ayarlar. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | Bir glifin yanına döndürüldüğünü gösteren değeri döndürür/ayarlar; köken, döndürülmemiş glifin üst orta kısmı olarak tanımlanır. |
| [get_OriginX](./get_originx/)() const | Koşudaki ilk glifin x koordinatını döndürür/ayarlar; etkili koordinat uzayının birimlerinde. |
| [get_OriginY](./get_originy/)() const | Koşudaki ilk glifin y koordinatını döndürür/ayarlar; etkili koordinat uzayının birimlerinde. |
| [get_StyleSimulations](./get_stylesimulations/)() const | Bir stil benzetimini belirten değeri döndürür/ayarlar. |
| [get_UnicodeString](./get_unicodestring/)() const | Glyphs öğesi tarafından işlenen metin dizesini döndürür/ayarlar. Metin Unicode kod noktaları olarak belirtilir. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Unicode algoritması çift yönlü iç içeleme seviyesini belirten değeri alır/ayarlar. Çift değerler soldan sağa düzeni, tek değerler sağdan sola düzeni gösterir. Sağdan sola düzen, çalıştırma başlangıcını ilk glifin sağ tarafına koyar; pozitif ilerleme genişlikleri (sola doğru ilerlemeyi temsil eder) sonraki glifleri önceki glifin soluna yerleştirir. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Render edilen gliflerin şeklini doldurmak için kullanılan fırçayı alır/ayarlar. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | Çizim yüzeyi birimlerinde, etkili koordinat uzayının birimlerinde kayan nokta olarak ifade edilen yazı tipi boyutunu alır/ayarlar. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | Bir glifin yanına döndürüldüğünü gösteren değeri döndürür/ayarlar; köken, döndürülmemiş glifin üst orta kısmı olarak tanımlanır. |
| [set_OriginX](./set_originx/)(float) | Koşudaki ilk glifin x koordinatını döndürür/ayarlar; etkili koordinat uzayının birimlerinde. |
| [set_OriginY](./set_originy/)(float) | Koşudaki ilk glifin y koordinatını döndürür/ayarlar; etkili koordinat uzayının birimlerinde. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | Bir stil benzetimini belirten değeri döndürür/ayarlar. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | Glyphs öğesi tarafından işlenen metin dizesini döndürür/ayarlar. Metin Unicode kod noktaları olarak belirtilir. |
## Ayrıca Bakınız

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
