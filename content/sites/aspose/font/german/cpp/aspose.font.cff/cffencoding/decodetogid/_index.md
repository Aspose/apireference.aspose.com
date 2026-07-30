---
title: "Aspose::Font::Cff::CffEncoding::DecodeToGid Methode"
linktitle: "DecodeToGid"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Cff::CffEncoding::DecodeToGid Methode. Gibt die Gid für den übergebenen charCode zurück. Diese Methode ist für CFF CIDFonts konzipiert, bei denen charCode ein gültiger CID‑Wert sein muss. Die Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängt. Die CFF Font‑Glyph‑ID kann eine Instanz der Klasse (GlyphStringId) oder der Klasse (GlyphUInt32Id) in C++ sein."
type: docs
weight: 100
url: /de/cpp/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding::DecodeToGid method


Gibt die Gid für den übergebenen charCode zurück. Diese Methode ist für CFF CIDFonts konzipiert, bei denen charCode ein gültiger CID‑Wert sein muss. Die Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängt. Die CFF [Font](../../../aspose.font/font/) Glyph‑ID kann eine Instanz der ([GlyphStringId](../)) Klasse oder der ([GlyphUInt32Id](../)) Klasse sein.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::DecodeToGid(uint32_t charCode) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charCode | uint32_t | Zeichencode (CID), für den ein Glyph‑Bezeichner ermittelt werden soll. |

### ReturnValue

Glyph‑Bezeichner, der dem übergebenen CID zugeordnet ist.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
