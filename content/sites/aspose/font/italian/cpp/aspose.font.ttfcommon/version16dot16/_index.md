---
title: "Aspose::Font::TtfCommon::Version16Dot16 classe"
linktitle: "Version16Dot16"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TtfCommon::Version16Dot16 classe. Rappresenta il tipo di dato Version16Dot16 in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.ttfcommon/version16dot16/
---
## Version16Dot16 class


Rappresenta il tipo di dato [Version16Dot16](./).

```cpp
class Version16Dot16 : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Crea una copia dell'oggetto [Version16Dot16](./). |
| [get_MajorNumber](./get_majornumber/)() const | Restituisce il numero di versione maggiore. Il valore ha senso solo in notazione esadecimale, per esempio la versione 0.5 per 'maxp' nei file di font reali è di 4 byte: {0, 0, 80, 0}, che ha la rappresentazione esadecimale 0x00005000. Dopo aver letto questa versione dal file di font, i numeri maggiore e minore per l'oggetto [Version16Dot16](./) saranno rispettivamente 0 e 20480. E questi valori in forma esadecimale sono 0x0000 e 0x5000. |
| [get_MinorNumber](./get_minornumber/)() const | Restituisce il numero di versione minore. Il valore ha senso solo in notazione esadecimale, per esempio la versione 0.5 per 'maxp' nei file di font reali è di 4 byte: {0, 0, 80, 0}, che ha la rappresentazione esadecimale 0x00005000. Dopo aver letto questa versione dal file di font, i numeri maggiore e minore per l'oggetto [Version16Dot16](./) saranno rispettivamente 0 e 20480. E questi valori in forma esadecimale sono 0x0000 e 0x5000. |
| [get_RawBytes](./get_rawbytes/)() | Restituisce tutti i bit grezzi per il numero di versione [Version16Dot16](./) come array di byte di dimensione 4 byte. |
| [set_MajorNumber](./set_majornumber/)(uint16_t) | Imposta il numero di versione maggiore. Il valore ha senso solo in notazione esadecimale, per esempio la versione 0.5 per 'maxp' nei file di font reali è di 4 byte: {0, 0, 80, 0}, che ha la rappresentazione esadecimale 0x00005000. Dopo aver letto questa versione dal file di font, i numeri maggiore e minore per l'oggetto [Version16Dot16](./) saranno rispettivamente 0 e 20480. E questi valori in forma esadecimale sono 0x0000 e 0x5000. |
| [set_MinorNumber](./set_minornumber/)(uint16_t) | Imposta il numero di versione minore. Il valore ha senso solo in notazione esadecimale, per esempio la versione 0.5 per 'maxp' nei file di font reali è di 4 byte: {0, 0, 80, 0}, che ha la rappresentazione esadecimale 0x00005000. Dopo aver letto questa versione dal file di font, i numeri maggiore e minore per l'oggetto [Version16Dot16](./) saranno rispettivamente 0 e 20480. E questi valori in forma esadecimale sono 0x0000 e 0x5000. |
| [ToString](./tostring/)() const override | Restituisce il valore della versione come stringa formattata. Per esempio "0.5", "1.1", "3.0" ecc. |
| [Version16Dot16](./version16dot16/)() | Costruttore. |
| [Version16Dot16](./version16dot16/)(uint16_t, uint16_t) | Costruttore. |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font::TtfCommon](../)
* Library [Aspose.Font for C++](../../)
