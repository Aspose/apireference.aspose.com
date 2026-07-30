---
title: "Aspose::Font::IFontEncoding::DecodeToGidParameterized method"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font для C++"
description: "Метод Aspose::Font::IFontEncoding::DecodeToGidParameterized. Параметризованный метод декодирования в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding::DecodeToGidParameterized method


Параметризованный метод декодирования.

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Реализация интерфейса [IEncodingParameters](../../iencodingparameters/). |
| charCode | uint32_t | Код символа, для которого требуется получить идентификатор глифа. |

### ReturnValue

Идентификатор глифа, связанный с переданным кодом символа.
## Примечания


Некоторые типы шрифтов могут иметь несколько алгоритмов/карт кодировок. Поэтому интерфейс [IEncodingParameters](../../iencodingparameters/) используется для создания конкретных параметров кодировки шрифта.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../iencodingparameters/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
