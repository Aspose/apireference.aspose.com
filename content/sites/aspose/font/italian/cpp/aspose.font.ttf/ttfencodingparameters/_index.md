---
title: "Aspose::Font::Ttf::TtfEncodingParameters classe"
linktitle: "TtfEncodingParameters"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Ttf::TtfEncodingParameters classe. Rappresenta i parametri di codifica TTF in C++."
type: docs
weight: 500
url: /it/cpp/aspose.font.ttf/ttfencodingparameters/
---
## TtfEncodingParameters class


Rappresenta i parametri di codifica TTF.

```cpp
class TtfEncodingParameters : public Aspose::Font::IEncodingParameters
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_PlatformId](./get_platformid/)() const | Ottiene il valore PlatformId. |
| [get_PlatformSpecificId](./get_platformspecificid/)() const | Ottiene il valore PlatformSpecificId. |
| [set_PlatformId](./set_platformid/)(uint16_t) | Imposta il valore PlatformId. |
| [set_PlatformSpecificId](./set_platformspecificid/)(uint16_t) | Imposta il valore PlatformSpecificId. |
| [TtfEncodingParameters](./ttfencodingparameters/)(uint16_t, uint16_t) | Inizializza una nuova istanza della classe [TtfEncodingParameters](./). Accetta Platform Id e Platform-specific encoding id come parametri. Questi parametri vengono utilizzati per richiedere una sottotabella CMap speciale dalla tabella CMap principale del font, vedere la tabella 'CMap', 'name' nella specifica del file OpenType [Font](../../aspose.font/font/). |
## Osservazioni


Dovrebbe essere usato per richiedere una codifica specifica dal TTF [Font](../../aspose.font/font/).
## Vedi anche

* Class [IEncodingParameters](../../aspose.font/iencodingparameters/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
