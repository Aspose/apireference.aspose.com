---
title: "Aspose::Page::Metered::SetMeteredKey metodo"
linktitle: "SetMeteredKey"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::Metered::SetMeteredKey metodo. Imposta la chiave pubblica e privata a consumo. Se acquisti una licenza a consumo, all'avvio dell'applicazione questa API dovrebbe essere chiamata; normalmente è sufficiente. Tuttavia, se il caricamento dei dati di consumo fallisce continuamente e supera le 24 ore, la licenza verrà impostata in stato di valutazione; per evitare questo caso, dovresti controllare regolarmente lo stato della licenza e, se è in stato di valutazione, chiamare nuovamente questa API in C++."
type: docs
weight: 200
url: /it/cpp/aspose.page/metered/setmeteredkey/
---
## Metered::SetMeteredKey method


Imposta la chiave pubblica e privata tariffata. Se acquisti una licenza tariffata, all'avvio dell'applicazione questa API dovrebbe essere chiamata; normalmente è sufficiente. Tuttavia, se il caricamento dei dati di consumo fallisce continuamente e supera le 24 ore, la licenza verrà impostata in stato di valutazione; per evitare questo caso, dovresti controllare regolarmente lo stato della licenza e, se è in stato di valutazione, chiamare nuovamente questa API.

```cpp
void Aspose::Page::Metered::SetMeteredKey(System::String publicKey, System::String privateKey)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| publicKey | System::String | chiave pubblica |
| privateKey | System::String | chiave privata |

## Vedi anche

* Class [String](../../../system/string/)
* Class [Metered](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
