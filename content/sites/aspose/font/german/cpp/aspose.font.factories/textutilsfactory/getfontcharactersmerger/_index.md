---
title: "Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger Methode"
linktitle: "GetFontCharactersMerger"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger Methode. Ruft Instanz der FontCharactersMerger-Klasse in C++ ab."
type: docs
weight: 200
url: /de/cpp/aspose.font.factories/textutilsfactory/getfontcharactersmerger/
---
## TextUtilsFactory::GetFontCharactersMerger method


Ruft Instanz der [FontCharactersMerger](../) Klasse ab.

```cpp
System::SharedPtr<Common_FontMerger::FontCharactersMerger> Aspose::Font::Factories::TextUtilsFactory::GetFontCharactersMerger(System::SharedPtr<Font> primaryFont, System::SharedPtr<Font> secondaryFont, FontType outType)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| primaryFont | System::SharedPtr\<Font\> | Primäre Schriftart, aus der Glyphen entnommen werden |
| secondaryFont | System::SharedPtr\<Font\> | Sekundäre Schriftart, aus der Glyphen entnommen werden |
| outType | FontType | Das Format der zusammengeführten Ausgabeschriftart. |

### ReturnValue

Schriftarten-Merger-Schnittstelle oder null, wenn kein geeigneter Merger für das Eingabe-Schriftartformat gefunden wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontCharactersMerger](../../../aspose.font.common_fontmerger/fontcharactersmerger/)
* Class [Font](../../../aspose.font/font/)
* Enum [FontType](../../../aspose.font/fonttype/)
* Class [TextUtilsFactory](../)
* Namespace [Aspose::Font::Factories](../../)
* Library [Aspose.Font for C++](../../../)
