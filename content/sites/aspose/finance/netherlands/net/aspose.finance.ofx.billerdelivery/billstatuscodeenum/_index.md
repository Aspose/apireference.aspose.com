---
title: Enum BillStatusCodeEnum
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.BillerDelivery.BillStatusCodeEnum opsomming. Factuurstatuscode opsomming.
type: docs
weight: 1470
url: /nl/net/aspose.finance.ofx.billerdelivery/billstatuscodeenum/
---
## BillStatusCodeEnum enumeration

Factuurstatuscode opsomming.

```csharp
public enum BillStatusCodeEnum
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| WITHDRAWN | `0` | De afzender of uitgever wil niet langer dat deze rekening wordt weergegeven. |
| UNDELIVERABLE | `1` | Pogingen om deze rekening tijdig bij de consument te bezorgen, zijn mislukt. Deze status wordt over het algemeen niet gebruikt bij het presenteren van een rekening aan een consument. Meldingen die deze status gebruiken, dekken echter veel nuttige gevallen. |
| NEW | `2` | De server heeft de rekening niet naar de client of client-proxy gestuurd. Dit is de initiële statuscode van een factuur. |
| DELIVERED | `3` | De server heeft de rekening naar een client of client-proxy gestuurd. |
| VIEWED | `4` | De klant heeft de rekening gezien. Impliceert vorige status van DELIVERED. |
| RETIRED | `5` | De klant wenst deze rekening niet meer te zien. Impliceert vorige status van DELIVERED. |

### Zie ook

* naamruimte [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery/)
* montage [Aspose.Finance](../../)


