---
title: "Aspose::Font::Cff::CffEncoding::GidToUnicode-Methode"
linktitle: "GidToUnicode"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Cff::CffEncoding::GidToUnicode-Methode. Dekodiert Gid zu Unicode. Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängt. CFF‑Font‑Glyph‑ID kann eine Instanz der Klasse (GlyphStringId) oder der Klasse (GlyphUInt32Id) in C++ sein."
type: docs
weight: 800
url: /de/cpp/aspose.font.cff/cffencoding/gidtounicode/
---
## CffEncoding::GidToUnicode method


Dekodiert Gid zu Unicode. Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängt. CFF [Font](../../../aspose.font/font/) Glyph‑ID kann eine Instanz der ([GlyphStringId](../))-Klasse oder der ([GlyphUInt32Id](../))-Klasse sein.

```cpp
uint32_t Aspose::Font::Cff::CffEncoding::GidToUnicode(System::SharedPtr<Glyphs::GlyphId> gid) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| gid | System::SharedPtr\<Glyphs::GlyphId\> | Glyph-Bezeichner des zu dekodierenden Symbols. |

### ReturnValue

Unicode-Wert, der zur übergebenen Glyph-ID gehört.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
