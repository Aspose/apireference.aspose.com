---
title: "System::Text::EncodingInfo klasse"
linktitle: "EncodingInfo"
second_title: "Aspose.Page voor C++"
description: "System::Text::EncodingInfo klasse. Korte informatie over codering. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1900
url: /nl/cpp/system.text/encodinginfo/
---
## EncodingInfo class


Korte informatie over codering. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class EncodingInfo : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [EncodingInfo](./encodinginfo/)(int, const String\&, const String\&) | Constructor. |
| [get_CodePage](./get_codepage/)() const | Haalt codepagina‑ID op. |
| [get_DisplayName](./get_displayname/)() const | Haalt volledige gelokaliseerde coderingsnaam op. |
| [get_Name](./get_name/)() const | Haalt korte coderingsnaam op. |
| [GetEncoding](./getencoding/)() | Haalt codering op die door info wordt beschreven. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
