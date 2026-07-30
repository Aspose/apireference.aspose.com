---
title: "Aspose::Font::IFontEncoding::DecodeToGidParameterized metodo"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::IFontEncoding::DecodeToGidParameterized metodo. Metodo di decodifica parametrizzata in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font/ifontencoding/decodetogidparameterized/
---
## IFontEncoding::DecodeToGidParameterized method


Metodo di decodifica parametrizzato.

```cpp
virtual System::SharedPtr<Glyphs::GlyphId> Aspose::Font::IFontEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implementazione dell'interfaccia [IEncodingParameters](../../iencodingparameters/). |
| charCode | uint32_t | Codice carattere per cui ottenere l'identificatore del glifo. |

### ReturnValue

Identificatore del glifo relativo al codice carattere fornito.
## Osservazioni


Alcuni tipi di font possono avere più algoritmi/mappature di codifica. Pertanto, l'interfaccia [IEncodingParameters](../../iencodingparameters/) viene utilizzata per creare parametri concreti di codifica del font.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../iencodingparameters/)
* Class [IFontEncoding](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
