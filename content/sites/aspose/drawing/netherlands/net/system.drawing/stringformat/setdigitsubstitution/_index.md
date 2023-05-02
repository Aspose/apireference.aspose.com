---
title: StringFormat.SetDigitSubstitution
second_title: Aspose.Drawing voor .NET API-referentie
description: StringFormat methode. Specificeert de taal en methode die moeten worden gebruikt wanneer lokale cijfers worden vervangen door westerse cijfers.
type: docs
weight: 140
url: /nl/net/system.drawing/stringformat/setdigitsubstitution/
---
## StringFormat.SetDigitSubstitution method

Specificeert de taal en methode die moeten worden gebruikt wanneer lokale cijfers worden vervangen door westerse cijfers.

```csharp
public void SetDigitSubstitution(int language, StringDigitSubstitute substitute)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| language | Int32 | Een National Language Support (NLS) taal-ID die de taal identificeert die zal worden gebruikt wanneer lokale cijfers worden vervangen door westerse cijfers. U kunt deLCID eigendom van a CultureInfo object als de NLS-taal-ID. Stel dat u bijvoorbeeld eenCultureInfo object door de string door te geven`"ar-EG"` naar eenCultureInfo constructor. Als u deLCID eigendom van that CultureInfo object samen met Traditional naar de Int32,StringDigitSubstitute) methode, dan zullen Arabisch-Indische cijfers worden vervangen door westerse cijfers tijdens weergave. |
| substitute | StringDigitSubstitute | Een onderdeel van deStringDigitSubstitute opsomming die specificeert hoe cijfers worden weergegeven. |

### Zie ook

* enum [StringDigitSubstitute](../../stringdigitsubstitute/)
* class [StringFormat](../)
* naamruimte [System.Drawing](../../stringformat/)
* montage [Aspose.Drawing](../../../)


