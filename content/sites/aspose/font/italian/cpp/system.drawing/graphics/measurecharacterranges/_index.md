---
title: "Metodo System::Drawing::Graphics::MeasureCharacterRanges"
linktitle: "MeasureCharacterRanges"
second_title: "Aspose.Font per C++"
description: "Metodo System::Drawing::Graphics::MeasureCharacterRanges. Restituisce un array di regioni, ognuna delle quali delimita le posizioni dei caratteri nella stringa specificata in C++."
type: docs
weight: 6400
url: /it/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


Restituisce un array di regioni, ognuna delle quali delimita le posizioni dei caratteri nella stringa specificata.

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| testo | const System::String\& | La stringa da misurare |
| font | const SharedPtr\<Font\>\& | Il font utilizzato durante la misurazione della stringa |
| layoutRect | RectangleF | Il rettangolo di layout utilizzato durante la misurazione della stringa |
| stringFormat | const SharedPtr\<StringFormat\>\& | Il formato della stringa, contiene gli intervalli di caratteri da misurare |

## Vedi anche

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
