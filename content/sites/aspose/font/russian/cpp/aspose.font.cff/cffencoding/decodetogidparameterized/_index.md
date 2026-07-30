---
title: "Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized метод"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized метод. Параметризованный метод декодирования. Не поддерживается для типа шрифта CFF в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font.cff/cffencoding/decodetogidparameterized/
---
## CffEncoding::DecodeToGidParameterized method


Параметризованный метод декодирования. Не поддерживается для типа CFF [Font](../../../aspose.font/font/) шрифта.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Реализация интерфейса [IEncodingParameters](../../../aspose.font/iencodingparameters/). |
| charCode | uint32_t | Код символа, для которого требуется получить идентификатор глифа. |

### ReturnValue

Идентификатор глифа, связанный с переданным charCode.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
