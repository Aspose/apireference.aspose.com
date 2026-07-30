---
title: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized metodo"
linktitle: "DecodeToGidParameterized"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized metodo. La versione parametrizzata consente di utilizzare una tabella CMap specifica (non Unicode) in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.ttf/ttfencoding/decodetogidparameterized/
---
## TtfEncoding::DecodeToGidParameterized method


La versione parametrizzata consente di utilizzare una tabella CMap specifica (non Unicode).

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Ttf::TtfEncoding::DecodeToGidParameterized(System::SharedPtr<IEncodingParameters> parameters, uint32_t charCode) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| parameters | System::SharedPtr\<IEncodingParameters\> | Implementazione dell'interfaccia [IEncodingParameters](../../../aspose.font/iencodingparameters/). |
| charCode | uint32_t | Codice carattere per cui ottenere l'identificatore del glifo. |

### ReturnValue

Identificatore del glifo relativo al codice carattere fornito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [IEncodingParameters](../../../aspose.font/iencodingparameters/)
* Class [TtfEncoding](../)
* Namespace [Aspose::Font::Ttf](../../)
* Library [Aspose.Font for C++](../../../)
