---
title: "Aspose::Font::Cff::CffEncoding::UnicodeToGid Methode"
linktitle: "UnicodeToGid"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Cff::CffEncoding::UnicodeToGid Methode. Dekodiert ein Unicode und gibt die Glyph‑ID zurück. Die Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängt. Die CFF Font‑Glyph‑ID kann eine Instanz der Klasse (GlyphStringId) oder der Klasse (GlyphUInt32Id) in C++ sein."
type: docs
weight: 900
url: /de/cpp/aspose.font.cff/cffencoding/unicodetogid/
---
## CffEncoding::UnicodeToGid method


Dekodiert ein Unicode und gibt die Glyph‑ID zurück. Die Glyph‑ID ist eine eindeutige Nummer für ein Glyph, die vom Font‑Typ abhängt. Die CFF [Font](../../../aspose.font/font/) Glyph‑ID kann eine Instanz der ([GlyphStringId](../)) Klasse oder der ([GlyphUInt32Id](../)) Klasse sein.

```cpp
System::SharedPtr<Glyphs::GlyphId> Aspose::Font::Cff::CffEncoding::UnicodeToGid(uint32_t unicode) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| unicode | uint32_t | Unicode, um den Glyph-Bezeichner zu erhalten. |

### ReturnValue

Glyph-Bezeichner, der zum übergebenen Unicode gehört.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* Class [CffEncoding](../)
* Namespace [Aspose::Font::Cff](../../)
* Library [Aspose.Font for C++](../../../)
