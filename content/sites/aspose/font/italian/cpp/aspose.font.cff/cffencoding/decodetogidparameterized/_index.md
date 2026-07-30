---
title: "Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized method"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized method. Metodo di decodifica parametrizzata. Non supportato per il tipo di Font CFF in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.cff/cffencoding/decodetogidparameterized/
---
## CffEncoding::DecodeToGidParameterized method


Metodo di decodifica parametrizzata. Non supportato per il tipo di [Font](../../../aspose.font/font/) CFF.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implementazione dell'interfaccia [IEncodingParameters](../../../aspose.font/iencodingparameters/). |
| charCode | uint32_t | Codice carattere per cui ottenere l'identificatore del glifo. |

### ReturnValue

Identificatore del glifo relativo al charCode fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
