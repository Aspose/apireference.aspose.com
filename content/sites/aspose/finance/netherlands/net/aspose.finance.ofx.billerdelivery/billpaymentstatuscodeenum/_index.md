---
title: Enum BillPaymentStatusCodeEnum
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Ofx.BillerDelivery.BillPaymentStatusCodeEnum opsomming. Factuurstatuscode enum.
type: docs
weight: 1440
url: /nl/net/aspose.finance.ofx.billerdelivery/billpaymentstatuscodeenum/
---
## BillPaymentStatusCodeEnum enumeration

Factuurstatuscode enum.

```csharp
public enum BillPaymentStatusCodeEnum
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| PAIDOUTOFBAND | `0` | Er is een betaling gestart voor deze factuur via een mechanisme dat de status niet via OFX rapporteert. Deze status is bedoeld om aan te geven dat de klant de factuurafzender rechtstreeks met contant geld of een cheque heeft betaald of een elektronische betaling heeft geïnitieerd via een mechanisme dat de betalingsstatus niet rapporteert via OFX. |
| AUTOPAY | `1` | De Biller of Service Provider start de betaling op basis van een pre-autorisatie door de klant, meestal een "goed tot geannuleerd" instructie zonder gedefinieerde einddatum. In de VS wordt dit vaak geïmplementeerd met behulp van een terugkerende vooraf geautoriseerde ACH-afschrijving, hoewel sommige Billers een vooraf geautoriseerde automatische betaling via creditcard aanbieden. Voorbeelden zijn onder meer maandelijkse inhoudingen om een hypotheek te dekken, regelmatige betalingen van een betaalrekening naar een creditcard en de automatische incasso. Payment Service (APS) aangeboden door veel hulpprogramma's. Zoals NONE, kan dit de eerste betalingsstatus van de factuur zijn. |
| CANCELLED | `2` | De klant heeft de eerder geplande betaling geannuleerd. |
| UNPAYABLE | `3` | Geen van de Betaalinstrumenten die voor deze factuur zijn toegestaan, worden ondersteund door de Payment Provider. Dit is bedoeld om te worden gebruikt wanneer de rekening de betaling beperkt tot een subset van de Betaalinstrumenten die zijn toegestaan in het Biller Directory-item. Dit kan gebeuren als de betalingsprovider of de Biller hun ondersteunde betalingsinstrumenttypes wijzigt na inschrijving en accountactivering. |
| NONE | `4` | Er is geen betaling gepland en er is ook geen betaling gedaan voor deze rekening. Dit kan de initiële betalingsstatus van een rekening zijn. |
| SCHEDULED | `5` | Er is een betaling gepland, maar deze factuur is nog niet verwerkt. |
| PROCESSED | `6` | De betaling is verwerkt voor deze factuur en kan niet meer worden geannuleerd. |
| POSTED | `7` | De factuurafzender heeft de betaling voor deze factuur geboekt. |

### Zie ook

* naamruimte [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery/)
* montage [Aspose.Finance](../../)


