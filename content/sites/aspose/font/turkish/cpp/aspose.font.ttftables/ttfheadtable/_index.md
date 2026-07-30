---
title: "Aspose::Font::TtfTables::TtfHeadTable sınıfı"
linktitle: "TtfHeadTable"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfHeadTable sınıfı. C++'ta TTF Font dosyasının \"head\" tablosunu temsil eder."
type: docs
weight: 700
url: /tr/cpp/aspose.font.ttftables/ttfheadtable/
---
## TtfHeadTable class


"head" tablosunu TTF [Font](../../aspose.font/font/) dosyası için temsil eder.

```cpp
class TtfHeadTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_CheckSumAdjustment](./get_checksumadjustment/)() const | uint32 checkSumAdjustment değerini alır. Hesaplamak için: 0 olarak ayarlayın, 'head' tablosunun sağlama toplamını hesaplayıp tablo dizinine yerleştirin, tüm fontu uint32 olarak toplayın ve ardından B1B0AFBA - toplamı saklayın. 'head' tablosunun sağlama toplamı yanlış olmayacaktır. Bu kabul edilebilir. |
| [get_Created](./get_created/)() const | longDateTime created uluslararası tarihini alır. |
| [get_Flags](./get_flags/)() const | uint16 bayrakları alır. |
| [get_FontDirectionHint](./get_fontdirectionhint/)() const | int16 fontDirectionHint değerini alır. 0 Karışık yönlü glifler; 1 Yalnızca güçlü şekilde soldan sağa glifler; 2 1 gibi ancak nötrler de içerir; -1 Yalnızca güçlü şekilde sağdan sola glifler; -2 -1 gibi ancak nötrler de içerir. |
| [get_FontRevision](./get_fontrevision/)() const | font üreticisi tarafından ayarlanan sabit fontRevision değerini alır. |
| [get_GlyphDataFormat](./get_glyphdataformat/)() const | int16 glyphDataFormat değerini alır; geçerli format için 0. |
| [get_IndexToLocFormat](./get_indextolocformat/)() const | int16 indexToLocFormat değerini alır; kısa ofsetler için 0, uzun ofsetler için 1. |
| [get_LowestRecPPEM](./get_lowestrecppem/)() const | uint16 lowestRecPPEM değerini alır; piksel cinsinden en küçük okunabilir boyut. |
| [get_MacStyle](./get_macstyle/)() const | uint16 macStyle değerini alır. |
| [get_MagicNumber](./get_magicnumber/)() const | 0x5F0F3CF5 olarak ayarlanan uint32 magicNumber değerini alır. |
| [get_Modified](./get_modified/)() const | longDateTime modified uluslararası tarihini alır. |
| static [get_Tag](./get_tag/)() | Tablo etiketini alır. |
| [get_UnitsPerEM](./get_unitsperem/)() const | uint16 unitsPerEm değerini alır; aralık 64 ile 16384 arasında. |
| [get_Version](./get_version/)() const | Sabit sürüm 0x00010000 (versiyon 1.0 ise). |
| [get_XMax](./get_xmax/)() const | Tüm glif sınırlama kutuları için FWord xMax değerini alır. |
| [get_XMin](./get_xmin/)() const | Tüm glif sınırlama kutuları için FWord xMin değerini alır. |
| [get_YMax](./get_ymax/)() const | Tüm glif sınırlama kutuları için FWord yMax değerini alır. |
| [get_YMin](./get_ymin/)() const | Tüm glif sınırlama kutuları için FWord yMin değerini alır. |
## Ayrıca Bakınız

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
