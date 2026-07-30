---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized method"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized. Параметризованная версия позволяет использовать конкретную таблицу CMap (не Unicode) в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.ttf/ttfencoding/decodetogidparameterized/
---
## TtfEncoding::DecodeToGidParameterized method


Параметризованная версия позволяет использовать конкретную таблицу CMap (не Unicode).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Реализация интерфейса [IEncodingParameters](../../../aspose.font/iencodingparameters/). |
| charCode | uint32_t | Код символа, для которого требуется получить идентификатор глифа. |

### ReturnValue

Идентификатор глифа, связанный с переданным кодом символа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
