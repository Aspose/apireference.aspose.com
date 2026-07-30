---
title: "System::Drawing::Graphics::MeasureCharacterRanges metodu"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Graphics::MeasureCharacterRanges metodu. Belirtilen dizedeki karakter konumlarını sınırlayan bölgelerden oluşan bir dizi döndürür C++'de."
type: docs
weight: 6400
url: /tr/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


Belirtilen dizedeki karakter konumlarını sınırlayan her bir bölgeyi içeren bir dizi döndürür.

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| metin | const System::String\& | Ölçülecek dize |
| font | const SharedPtr\<Font\>\& | Dize ölçümü sırasında kullanılan font |
| layoutRect | RectangleF | Dize ölçümü sırasında kullanılan yerleşim dikdörtgeni |
| stringFormat | const SharedPtr\<StringFormat\>\& | Dize biçimi, ölçmek için karakter aralıklarını içerir |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Class [String](../../../system/string/)
* Class [Font](../../font/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
